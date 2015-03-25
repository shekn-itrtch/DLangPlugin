package org.dlangplugin.ide.index;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.Processor;
import com.intellij.util.indexing.*;
import com.intellij.util.io.DataExternalizer;
import com.intellij.util.io.EnumeratorStringDescriptor;
import com.intellij.util.io.KeyDescriptor;
import gnu.trove.THashMap;
import org.dlangplugin.DFileType;
import org.dlangplugin.psi.DLangClassDeclaration;
import org.dlangplugin.psi.DLangResolveUtil;
import org.dlangplugin.psi.impl.DLangClassDeclarationImpl;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/* Index stores all DLang components (classes, templates, functions, etc) found in project and libraries.
 * Index actually store instances of DLangComponentInfo class.
 * Lookup is implemented by IDEA Platform using Map-Reduce system.
 * TODO: Supports only classes for now. Add other components indexing. */
public class DLangComponentIndex extends FileBasedIndexExtension<String, DLangComponentInfo> {
    public static final ID<String, DLangComponentInfo> DLANG_COMPONENT_INDEX = ID.create("DLangComponentInfo");
    private static final int INDEX_VERSION = 1;
    //TODO: Do indexing of other DLang components (methods, functions, templates, etc.)
    private final DataIndexer<String, DLangComponentInfo, FileContent> myIndexer = new DLangClassIndexer();
    private final DataExternalizer<DLangComponentInfo> myExternalizer = new DLangComponentInfoExternalizer();

    @NotNull
    @Override
    public ID<String, DLangComponentInfo> getName() {
        return DLANG_COMPONENT_INDEX;
    }

    @Override
    public int getVersion() {
        return INDEX_VERSION;
    }

    @Override
    public boolean dependsOnFileContent() {
        return true;
    }

    @NotNull
    @Override
    public DataIndexer<String, DLangComponentInfo, FileContent> getIndexer() {
        return myIndexer;
    }

    @NotNull
    @Override
    public KeyDescriptor<String> getKeyDescriptor() {
        return new EnumeratorStringDescriptor();
    }

    @NotNull
    @Override
    public DataExternalizer<DLangComponentInfo> getValueExternalizer() {
        return myExternalizer;
    }

    @NotNull
    @Override
    public FileBasedIndex.InputFilter getInputFilter() {
        return DLangSdkInputFilter.INSTANCE;
    }

    @NotNull
    public static List<DLangClassDeclaration> getItemsByName(String name, Project project, GlobalSearchScope searchScope) {
        Collection<VirtualFile> files =
                FileBasedIndex.getInstance().getContainingFiles(DLANG_COMPONENT_INDEX, name, searchScope);
        final List<DLangClassDeclaration> result = new ArrayList<DLangClassDeclaration>();

        for (VirtualFile vFile : files) {
            PsiFile file = PsiManager.getInstance(project).findFile(vFile);
            if (file == null || file.getFileType() != DFileType.INSTANCE) {
                continue;
            }
            final DLangClassDeclarationImpl component = DLangResolveUtil.findClassDeclaration(file, name);
            if (component != null) {
                result.add(component);
            }
        }
        return result;
    }

    @NotNull
    public static List<DLangClassDeclaration> getItemsByNameModule(@NotNull String name, @NotNull String moduleName,
                                                                   Project project, GlobalSearchScope searchScope)
    {
        final String filterModuleName = moduleName;
        final String filterClassName = name;
        final Project filterProject = project;
        final List<DLangClassDeclaration> result = new ArrayList<DLangClassDeclaration>();

        //Collect all "DLangClassDeclaration" in result collection;
        Processor<VirtualFile> processor = new Processor<VirtualFile>() {
            @Override
            public boolean process(VirtualFile virtualFile) {
                PsiFile file = PsiManager.getInstance(filterProject).findFile(virtualFile);
                final DLangClassDeclarationImpl component = DLangResolveUtil.findClassDeclaration(file, filterClassName);
                if (component != null) {
                    result.add(component);
                }

                return true; //Continue processing
            }
        };

        //Filter classes by moduleName and component type;
        Condition<DLangComponentInfo> valueChecker = new Condition<DLangComponentInfo>() {
            @Override
            public boolean value(DLangComponentInfo componentInfoInfo) {
                return componentInfoInfo.getType()==DLangComponentType.CLASS
                        && filterModuleName.equals(componentInfoInfo.getModuleName());
            }
        };

        //Do actual search;
        FileBasedIndex.getInstance().processFilesContainingAllKeys(DLANG_COMPONENT_INDEX, Arrays.asList(name),
                searchScope, valueChecker, processor);

        return result;
    }

    @NotNull
    public static Collection<String> getNames(Project project) {
        return FileBasedIndex.getInstance().getAllKeys(DLANG_COMPONENT_INDEX, project);
    }

    /* Indexer responsible for extracting DLangComponentInfo from DLang source code.
     * TODO: Supports only classes for now. Add other components indexing.
     */
    class DLangClassIndexer implements DataIndexer<String, DLangComponentInfo, FileContent> {
        @Override
        @NotNull
        public Map<String, DLangComponentInfo> map(@NotNull final FileContent inputData) {
            final PsiFile psiFile = inputData.getPsiFile();
            if (psiFile.getFileType() != DFileType.INSTANCE) {
                return Collections.emptyMap();
            }
            
            final String moduleName = DLangResolveUtil.findModuleName(psiFile);
            final Collection<DLangClassDeclarationImpl> classes = PsiTreeUtil.findChildrenOfType(psiFile, DLangClassDeclarationImpl.class);

            if (classes.isEmpty()) {
                return Collections.emptyMap();
            }
            final Map<String, DLangComponentInfo> result = new THashMap<String, DLangComponentInfo>(classes.size());
            for (DLangClassDeclaration classDecl : classes) {
                if (classDecl.getName() == null) {
                    continue;
                }

                final DLangComponentInfo info = new DLangComponentInfo(DLangComponentType.CLASS, classDecl.getName(), moduleName);
                result.put(classDecl.getName(), info);
            }
            return result;
        }
    }
}
