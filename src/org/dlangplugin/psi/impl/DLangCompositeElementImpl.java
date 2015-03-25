package org.dlangplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.dlangplugin.psi.DLangCompositeElement;
import org.jetbrains.annotations.NotNull;

public class DLangCompositeElementImpl extends ASTWrapperPsiElement implements DLangCompositeElement {
    public DLangCompositeElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
        return processDeclarations(this, processor, state, lastParent, place);
    }

    static boolean processDeclarations(@NotNull PsiElement element, @NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
        return processor.execute(element, state) && ResolveUtil.processChildren(element, processor, state, lastParent, place);
    }
}
