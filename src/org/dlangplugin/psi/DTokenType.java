package org.dlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.dlangplugin.DLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DTokenType extends IElementType {
    private final String debugName;

    public DTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DLanguage.INSTANCE);
        this.debugName = debugName;
    }

    @Override
    public String toString() {
        return "DTokenType." + super.toString();
    }
}
