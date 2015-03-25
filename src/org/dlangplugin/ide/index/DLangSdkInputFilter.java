package org.dlangplugin.ide.index;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.indexing.FileBasedIndex;
import org.dlangplugin.DFileType;
import org.jetbrains.annotations.NotNull;

/** This class filters files before indexer processes them.
 * @see DLangComponentIndexer.DLangClassIndexer */
public class DLangSdkInputFilter implements FileBasedIndex.InputFilter {
    public static DLangSdkInputFilter INSTANCE = new DLangSdkInputFilter();

    private DLangSdkInputFilter() {
    }

    @Override
    public boolean acceptInput(@NotNull VirtualFile file) {
        return file.getFileType() == DFileType.INSTANCE;
    }
}
