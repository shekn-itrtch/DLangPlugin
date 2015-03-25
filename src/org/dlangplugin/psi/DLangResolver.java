package org.dlangplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/* Very, Very, Very important class. It's responsible for class lookup. When you put cursor on some class name
 * and press Ctrl+B (Go to declaration) this methods provides search for declaration.
 */
public class DLangResolver implements ResolveCache.AbstractResolver<DLangReference, List<? extends PsiElement>> {
    public static final DLangResolver INSTANCE = new DLangResolver();

    @Override
    public List<? extends PsiElement> resolve(@NotNull DLangReference dLangReference, boolean incompleteCode) {
        List<PsiElement> results = new LinkedList<PsiElement>();
        final DLangClass resultClass = DLangResolveUtil.tryResolveClassByName(dLangReference);
        if (resultClass != null) {
            results.add(resultClass.getComponentName());
        }

        //Look inside imported modules
        PsiFile rootFile = dLangReference.getContainingFile();
        Collection<DLangImportDeclaration> imports = PsiTreeUtil.findChildrenOfType(rootFile, DLangImportDeclaration.class);
        for(DLangImportDeclaration importStmnt : imports) {
            for(DLangModuleFullyQualifiedName moduleNameElm : PsiTreeUtil.findChildrenOfType(importStmnt, DLangModuleFullyQualifiedName.class)) {
                String moduleName = moduleNameElm.getText();
                DLangClass foundClass = DLangResolveUtil.findClassByNameModule(dLangReference, moduleName);
                if(foundClass!=null) {
                    results.add(foundClass.getComponentName());
                }
            }
        }

        return results;
    }

    private static List<? extends PsiElement> toCandidateInfoArray(@Nullable PsiElement element) {
        return element == null ? Collections.<PsiElement>emptyList() : Arrays.asList(element);
    }
}
