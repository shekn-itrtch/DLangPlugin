package org.dlangplugin.run;

import com.intellij.application.options.ModulesComboBox;
import com.intellij.execution.configuration.EnvironmentVariablesComponent;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.TextComponentAccessor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.RawCommandLineEditor;
import org.dlangplugin.DLangBundle;
import org.dlangplugin.module.DLangModuleType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Map;

/** DUB build system configuration UI.
 * @see https://github.com/D-Programming-Language/dub
 */
public class DLangRunDubConfigurationEditor extends SettingsEditor<DLangRunDubConfiguration>{
    private JPanel myMainPanel;
    private ModulesComboBox comboModule;
    private JCheckBox cbRunAfterBuild;
    private JCheckBox cbVerbose;
    private JCheckBox cbQuiet;
    private TextFieldWithBrowseButton pathWorkingDir;
    private RawCommandLineEditor textParameters;
    private EnvironmentVariablesComponent envVariables;

    /** Update editor UI with data of DLangRunDubConfiguration.
     * All components must be changed according to "config" data. */
    @Override
    protected void resetEditorFrom(DLangRunDubConfiguration config) {
        comboModule.fillModules(config.getProject(), DLangModuleType.getInstance());
        comboModule.setSelectedModule(config.getConfigurationModule().getModule());
        cbRunAfterBuild.setSelected(config.isRunAfterBuild());
        cbVerbose.setSelected(config.isVerbose());
        cbQuiet.setSelected(config.isQuiet());

        pathWorkingDir.setText(config.getWorkingDir());
        textParameters.setText(config.getAdditionalParams());
        Map<String,String> envVars = config.getEnvVars();
        if(envVars != null) {
            envVariables.setEnvs(config.getEnvVars());
        }
    }

    /** Save state of editor UI to DLangRunDubConfiguration instance. */
    @Override
    protected void applyEditorTo(DLangRunDubConfiguration config) throws ConfigurationException {
        config.setModule(comboModule.getSelectedModule());
        config.setRunAfterBuild(cbRunAfterBuild.isSelected());
        config.setVerbose(cbVerbose.isSelected());
        config.setQuiet(cbQuiet.isSelected());
        config.setWorkingDir(pathWorkingDir.getText());
        config.setAdditionalParams(textParameters.getText());
        config.setEnvVars(envVariables.getEnvs());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        FileChooserDescriptor fcd = FileChooserDescriptorFactory.createSingleFolderDescriptor();
        fcd.setShowFileSystemRoots(true);
        fcd.setTitle(DLangBundle.message("dmd.run.config.selectworkingdir.title"));
        fcd.setDescription(DLangBundle.message("dmd.run.config.selectworkingdir.description"));
        fcd.setHideIgnored(false);

        pathWorkingDir.addBrowseFolderListener(null,
                new TextFieldWithBrowseButton.BrowseFolderActionListener<JTextField>(fcd.getTitle(), fcd.getDescription(),
                        pathWorkingDir, null, fcd, TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT) );

        return myMainPanel;
    }

    @Override
    protected void disposeEditor() {
    }
}
