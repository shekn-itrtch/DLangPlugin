package org.dlangplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/* Each file in IDEA has type. This is type for D Language sources. */
public class DFileType extends LanguageFileType {
    public static final DFileType INSTANCE = new DFileType();
    public static final String DEFAULT_EXTENSION = "d";

    private DFileType() {
        super(DLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "D file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "D language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return DLangIcons.FILE;
    }
}
