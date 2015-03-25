package org.dlangplugin.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.dlangplugin.DLangIcons;
import org.dlangplugin.DLangBundle;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DLangRunDmdConfigurationType implements ConfigurationType {
    private final DLangFactory myConfigurationFactory;

    public DLangRunDmdConfigurationType() {
        myConfigurationFactory = new DLangFactory(this);
    }

    @Override
    public String getDisplayName() {
        return DLangBundle.message("run.dmd.text");
    }

    @Override
    public String getConfigurationTypeDescription() {
        return DLangBundle.message("run.dmd.descr");
    }

    @Override
    public Icon getIcon() {
        return DLangIcons.RUN;
    }

    @NotNull
    @Override
    public String getId() {
        return "DLangRunDmdConfiguration";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{myConfigurationFactory};
    }

    private static class DLangFactory extends ConfigurationFactory {
        public DLangFactory(ConfigurationType type) {
            super(type);
        }

        public RunConfiguration createTemplateConfiguration(Project project) {
            return new DLangRunDmdConfiguration("Compile with DMD", project, this);
        }
    }
}
