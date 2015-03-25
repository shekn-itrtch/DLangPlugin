package org.dlangplugin.psi;

import org.jetbrains.annotations.Nullable;

public interface DLangNamedComponent extends DLangCompositeElement {
    @Nullable
    DLangComponentName getComponentName();
}
