package org.dlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.dlangplugin.DLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DElementType extends IElementType {
    public DElementType(@NotNull @NonNls String debugName) {
        super(debugName, DLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DElementType." + super.toString();
    }
}
