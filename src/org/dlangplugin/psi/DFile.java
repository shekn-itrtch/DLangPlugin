package org.dlangplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.dlangplugin.DFileType;
import org.dlangplugin.DLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DFile extends PsiFileBase {
    public DFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "D File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}