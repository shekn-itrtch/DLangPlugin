package org.dlangplugin.library;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.libraries.*;
import com.intellij.openapi.roots.libraries.ui.LibraryEditorComponent;
import com.intellij.openapi.roots.libraries.ui.LibraryPropertiesEditor;
import com.intellij.openapi.roots.libraries.ui.LibraryRootsComponentDescriptor;
import com.intellij.openapi.roots.ui.configuration.FacetsProvider;
import com.intellij.openapi.vfs.VirtualFile;
import org.dlangplugin.DLangIcons;
import org.dlangplugin.module.DLangModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DLangLibraryType extends LibraryType<DummyLibraryProperties> {
    public static final PersistentLibraryKind<DummyLibraryProperties> DLANG_LIBRARY =
            new PersistentLibraryKind<DummyLibraryProperties>("DLangLib") {
                @NotNull
                @Override
                public DummyLibraryProperties createDefaultProperties() {
                    return new DummyLibraryProperties();
                }
            };

    public DLangLibraryType() {
        super(DLANG_LIBRARY);
    }

    @NotNull
    @Override
    public String getCreateActionName() {
        return "D Library";
    }

    @Override
    public boolean isSuitableModule(@NotNull Module module, @NotNull FacetsProvider facetsProvider) {
        return ModuleType.get(module).equals(DLangModuleType.getInstance());
    }

    @Override
    public NewLibraryConfiguration createNewLibrary(@NotNull JComponent parentComponent,
                                                    @Nullable VirtualFile contextDirectory,
                                                    @NotNull Project project) {

        return LibraryTypeService.getInstance()
                .createLibraryFromFiles(createLibraryRootsComponentDescriptor(), parentComponent, contextDirectory, this, project);
    }

    @NotNull
    @Override
    public LibraryRootsComponentDescriptor createLibraryRootsComponentDescriptor() {
        return new DLangLibraryRootsComponentDescriptor();
    }

    @Override
    public LibraryPropertiesEditor createPropertiesEditor(@NotNull LibraryEditorComponent<DummyLibraryProperties> component) {
        return null;
    }

    @Override
    public Icon getIcon(@Nullable DummyLibraryProperties properties) {
        return DLangIcons.LIBRARY;
    }

    public static DLangLibraryType getInstance() {
        return LibraryType.EP_NAME.findExtension(DLangLibraryType.class);
    }
}
