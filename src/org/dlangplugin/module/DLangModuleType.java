package org.dlangplugin.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.ProjectJdkForModuleStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.dlangplugin.DLangIcons;
import org.dlangplugin.DLangBundle;
import org.dlangplugin.sdk.DLangSdkType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/* DLang module must be present in project to make it support DLang sources and build system.
 * (See https://confluence.jetbrains.com/display/IDEADEV/Structure+of+IntelliJ+IDEA+Project)
 */
public class DLangModuleType extends ModuleType<DLangModuleBuilder> {
    @NonNls private static final String ID = "DLANG_MODULE";

    public DLangModuleType() {
        super(ID);
    }

    @NotNull
    @Override
    public DLangModuleBuilder createModuleBuilder() {
        return new DLangModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return DLangBundle.message("module.title");
    }

    @NotNull
    @Override
    public String getDescription() {
        return DLangBundle.message("module.description");
    }

    @Override
    public Icon getBigIcon() {
        return DLangIcons.MODULE;
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return DLangIcons.MODULE;
    }

    public static DLangModuleType getInstance() {
        return (DLangModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext,
                                                @NotNull final DLangModuleBuilder moduleBuilder,
                                                @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{new ProjectJdkForModuleStep(wizardContext, DLangSdkType.getInstance()) {
            public void updateDataModel() {
                super.updateDataModel();
                moduleBuilder.setModuleJdk(getJdk());
            }
        }};
    }
}
