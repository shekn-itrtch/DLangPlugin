package org.dlangplugin.module;

import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ModuleBasedConfiguration;
import com.intellij.execution.impl.RunManagerImpl;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.dlangplugin.DLangBundle;
import org.dlangplugin.run.DLangRunDubConfigurationType;

/* Builder for new projects from template "D Application with DUB".
 * Creates configuration "Run DUB". */
public class DLangDubModuleBuilder extends DLangModuleBuilder {

    public static final String RUN_DUB_CONFIG_NAME = "Run DUB";

    public DLangDubModuleBuilder() {
        super("DLangDubApp", DLangBundle.message("module.dub.title"), DLangBundle.message("module.dub.description"), null);
    }

    @Override
    public void setupRootModel(ModifiableRootModel rootModel) throws ConfigurationException {
        setJavaRootModel(rootModel);

        Project project = rootModel.getProject();
        RunManagerImpl runManager = RunManagerImpl.getInstanceImpl(project);

        //Create "Run dub" configuration
        RunnerAndConfigurationSettings runDubSettings = runManager.findConfigurationByName(RUN_DUB_CONFIG_NAME);
        if(runDubSettings == null) {
            final DLangRunDubConfigurationType configurationType
                    = Extensions.findExtension(ConfigurationType.CONFIGURATION_TYPE_EP, DLangRunDubConfigurationType.class);
            final ConfigurationFactory factory = configurationType.getConfigurationFactories()[0];
            runDubSettings = runManager.createRunConfiguration(RUN_DUB_CONFIG_NAME, factory);
            ((ModuleBasedConfiguration) runDubSettings.getConfiguration()).setModule(rootModel.getModule());

            runManager.addConfiguration(runDubSettings, false);
        }
    }
}
