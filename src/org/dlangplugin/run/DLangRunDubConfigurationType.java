package org.dlangplugin.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.dlangplugin.DLangIcons;
import org.dlangplugin.DLangBundle;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DLangRunDubConfigurationType implements ConfigurationType {
    private final DLangFactory myConfigurationFactory;

    public DLangRunDubConfigurationType() {
        myConfigurationFactory = new DLangFactory(this);
    }

    @Override
    public String getDisplayName() {
        return DLangBundle.message("run.dub.text");
    }

    @Override
    public String getConfigurationTypeDescription() {
        return DLangBundle.message("run.dub.descr");
    }

    @Override
    public Icon getIcon() {
        return DLangIcons.RUN;
    }

    @NotNull
    @Override
    public String getId() {
        return "DLangRunDubConfiguration";
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
            return new DLangRunDubConfiguration("Build with DUB", project, this);
        }
    }
}
