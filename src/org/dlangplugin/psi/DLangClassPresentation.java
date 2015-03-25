package org.dlangplugin.psi;

import com.intellij.navigation.ItemPresentation;
import org.dlangplugin.DLangIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/* This class is responsible for DLang class presentation in "Go to by name..." action (Ctrl + N)
 * It returns class name, module and icon for class navigation dialog. */
public class DLangClassPresentation implements ItemPresentation {
    @NotNull private DLangNamedElement namedElement;

    public DLangClassPresentation(@NotNull DLangNamedElement namedElement) {
        this.namedElement = namedElement;
    }

    @Override
    public String getPresentableText() {
        return namedElement.getText();
    }

    @Override
    public String getLocationString() {
        String moduleName = DLangResolveUtil.findModuleName(namedElement.getContainingFile());
        if(moduleName.length()>0) {
            return "("+moduleName+")";
        }
        return "";
    }

    @Override
    public Icon getIcon(boolean open) {
        return DLangIcons.CLASS;
    }
}
