package org.dlangplugin.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.filters.TextConsoleBuilder;
import com.intellij.execution.filters.TextConsoleBuilderImpl;
import com.intellij.execution.process.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.CompilerModuleExtension;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;
import org.dlangplugin.run.exception.ModuleNotFoundException;
import org.dlangplugin.run.exception.NoSourcesException;
import org.dlangplugin.run.exception.NoValidDLangSdkFound;
import org.dlangplugin.sdk.DLangSdkType;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class DLangRunDmdState extends CommandLineState implements ProcessListener {
    private DLangRunDmdConfiguration config;
    private Executor executor;

    protected DLangRunDmdState(@NotNull ExecutionEnvironment environment, @NotNull DLangRunDmdConfiguration config) {
        super(environment);
        this.config = config;
    }

    @NotNull
    @Override
    public ExecutionResult execute(@NotNull Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        TextConsoleBuilder consoleBuilder = new TextConsoleBuilderImpl(config.getProject());
        setConsoleBuilder(consoleBuilder);
        this.executor = executor;
        return super.execute(executor, runner);
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        try {
            GeneralCommandLine dmdCommandLine = getDmdCommandLine(config);
            OSProcessHandler handler = new OSProcessHandler(dmdCommandLine.createProcess(), dmdCommandLine.getCommandLineString());
            handler.addProcessListener(this);
            return handler;
        }
        catch (NoValidDLangSdkFound e) {
            throw new ExecutionException("No valid DMD SDK found!");
        }
        catch(NoSourcesException e) {
            throw new ExecutionException("No D Language source files found in directory: "+e.getSourcesRoot());
        }
        catch(ModuleNotFoundException e) {
                throw new ExecutionException("Run configuration has no module selected.");
        } catch (ExecutionException e) {
            String message = e.getMessage();
            boolean isEmpty = message.equals("Executable is not specified");
            boolean notCorrect = message.startsWith("Cannot run program");
            if (isEmpty || notCorrect) {
                Notifications.Bus.notify(
                        new Notification("DMD run configuration", "DMD settings",
                                "DMD executable path is " + (isEmpty ? "empty" : "not specified correctly") +
                                        "<br/><a href='configure'>Configure</a>",
                                NotificationType.ERROR), config.getProject());
            }
            throw e;
        }
    }

    /** Build command line:
    <code>
    dmd @compilerArguments.txt
    </code>
     * "compilerArguments.txt" is temporary file with DMD compiler arguments separated with '\n'. E.g.
    <code>
    -release
    -unittest
    -od{objFilesDir}
    -of{outputFilePath}
    sourceFile1.d
    sourceFile2.d
    </code>
     */
    private GeneralCommandLine getDmdCommandLine(DLangRunDmdConfiguration config)
            throws ModuleNotFoundException, NoValidDLangSdkFound, NoSourcesException, ExecutionException
    {
        Module module = config.getConfigurationModule().getModule();
        if(module == null) {
            throw new ModuleNotFoundException();
        }
        ModuleRootManager moduleRootManager = ModuleRootManager.getInstance(module);
        Sdk sdk = moduleRootManager.getSdk();

        if(sdk==null || !(sdk.getSdkType() instanceof DLangSdkType)) {
            throw new NoValidDLangSdkFound();
        }


        List<String> dmdParameters = DLangDmdConfigToArgsConverter.getDmdParameters(config, module);

        GeneralCommandLine commandLine = new GeneralCommandLine();
        commandLine.withWorkDirectory(config.getProject().getBasePath());
        commandLine.setExePath(DLangSdkType.getDmdPath(sdk));
        commandLine.addParameter(tempFileWithParameters(dmdParameters));


        return commandLine;
    }

    //Create file with the list of all dmdParameters
    private String tempFileWithParameters(List<String> dmdParameters) throws ExecutionException {
        String sep = System.lineSeparator();
        File tmpFile;
        try {
            tmpFile =  FileUtil.createTempFile("dmd", "src");
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(tmpFile), "UTF-8");
            for(String srcFilePath : dmdParameters) {
                output.write(srcFilePath);
                output.write(sep);
            }
            output.close();
        }
        catch(IOException exc) {
            throw new ExecutionException("Can't create temporary file with arguments", exc);
        }

        return "@"+tmpFile.getAbsolutePath();

    }

    /* Implementations of ProcessListener interface methods */
    @Override
    public void startNotified(ProcessEvent event) {
        //skip
    }

    @Override
    public void processTerminated(ProcessEvent event) {
        if(event.getExitCode() == 0) {
            event.getProcessHandler().notifyTextAvailable("* Compilation successful", ProcessOutputTypes.SYSTEM);
        }
        else {
            event.getProcessHandler().notifyTextAvailable("* Compilation finished with errors", ProcessOutputTypes.SYSTEM);
        }
    }

    @Override
    public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {
        //skip
    }

    @Override
    public void onTextAvailable(ProcessEvent event, Key outputType) {
        //skip
    }

}
