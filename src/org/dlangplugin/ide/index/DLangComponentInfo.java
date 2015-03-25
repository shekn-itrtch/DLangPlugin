package org.dlangplugin.ide.index;

import org.dlangplugin.DLangIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/* Instances of this class are actually stored in DLangComponentIndex storage. */
public class DLangComponentInfo {
    /* Is the name of a component. E.g. class name, function name, method name, etc. */
    @NotNull
    private final String name;

    /** Field "moduleName" is extracted from DLang source file. Module must be specified at the top of source file:
    <code>
     module net.ssh;</code>
    </code>
     Could be empty string. But not null.
     */
    @NotNull
    private final String moduleName;

    @NotNull
    private final DLangComponentType type;

    public DLangComponentInfo(@NotNull DLangComponentType type, @NotNull String name, @Nullable String moduleName) {
        if(moduleName == null) moduleName = "";

        this.type = type;
        this.name = name;
        this.moduleName = moduleName;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getModuleName() {
        return moduleName;
    }

    @NotNull
    public DLangComponentType getType() {
        return type;
    }

    @Nullable
    public Icon getIcon() {
        //TODO: return icon according to @field "type".
        return DLangIcons.CLASS;
    }
}
