package org.dlangplugin.config;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextComponentAccessor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.dlangplugin.DLangBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/* UI Panel with DLang plugin settings.
 * See "DLangSettingsPanel.form" for details.
 * It has a single edit field for DLangGeneralSettings.state.dubExecutablePath
 */
public class DLangSettingsPanel implements SearchableConfigurable {
    private final DLangGeneralSettings settings;
    private final Project project;
    private JPanel panel;
    private TextFieldWithBrowseButton pathDubExecutable;

    public DLangSettingsPanel(@NotNull Project project, @NotNull DLangGeneralSettings settings) {
        this.settings = settings;
        this.project = project;
    }

    @NotNull
    @Override
    public String getId() {
        return DLangSettingsPanel.class.getCanonicalName();
    }

    @Nullable
    @Override
    public Runnable enableSearch(String s) {
        return null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return DLangBundle.message("settings.label");
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        FileChooserDescriptor fcd = FileChooserDescriptorFactory.createSingleFileOrExecutableAppDescriptor();
        fcd.setShowFileSystemRoots(true);
        fcd.setTitle(DLangBundle.message("dub.config.selectexecutable.title"));
        fcd.setDescription(DLangBundle.message("dub.config.selectexecutable.description"));
        fcd.setHideIgnored(false);

        pathDubExecutable.addActionListener(new TextFieldWithBrowseButton.BrowseFolderActionListener<JTextField>(fcd.getTitle(), fcd.getDescription(),
                        pathDubExecutable, null, fcd, TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT) );

        return panel;
    }

    @Override
    public boolean isModified() {
        DLangGeneralSettings formData = new DLangGeneralSettings();
        readForm(formData);
        return !formData.equals(settings);
    }

    @Override
    public void apply() throws ConfigurationException {
        readForm(settings);
    }

    @Override
    public void reset() {
        updateForm(settings);
    }

    @Override
    public void disposeUIResources() {
    }

    private void readForm(DLangGeneralSettings settings) {
        settings.setDubExecutablePath(pathDubExecutable.getText());
    }

    private void updateForm(DLangGeneralSettings settings) {
        pathDubExecutable.setText(settings.getDubExecutablePath());
    }
}
