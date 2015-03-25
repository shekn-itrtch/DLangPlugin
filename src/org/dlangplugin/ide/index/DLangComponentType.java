package org.dlangplugin.ide.index;

import org.jetbrains.annotations.Nullable;

/** Enumeration of all components which could be extracted from source code and stored into index.
 */
public enum DLangComponentType {
    CLASS(0),
    FUNCTION(1);

    private final int key;

    DLangComponentType(int key) {
        this.key = key;
    }

    @Nullable
    public static DLangComponentType valueOf(int key) {
        switch (key) {
            case 0:
                return CLASS;
            case 1:
                return FUNCTION;
            default:
                return null;
        }
    }
};
