package org.dlangplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.dlangplugin.psi.DLangClassPresentation;
import org.dlangplugin.psi.DLangComponentName;
import org.dlangplugin.psi.DLangElementGenerator;
import org.dlangplugin.psi.DLangIdentifier;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public abstract class DLangNamedElementImpl extends ASTWrapperPsiElement implements DLangComponentName
{
    public DLangNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public ItemPresentation getPresentation() {
        return new DLangClassPresentation(this);
    }

    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String newElementName) throws IncorrectOperationException {
        final DLangIdentifier identifier = getIdentifier();
        final DLangIdentifier identifierNew = DLangElementGenerator.createIdentifierFromText(getProject(), newElementName);
        //final String oldName = getName();

        if (identifierNew != null) {
            getNode().replaceChild(identifier.getNode(), identifierNew.getNode());
        }

        return this;
    }
}
