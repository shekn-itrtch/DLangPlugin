package org.dlangplugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.dlangplugin.psi.DLangClassDeclaration;
import org.dlangplugin.psi.DLangClassPresentation;
import org.dlangplugin.psi.DLangComponentName;
import org.dlangplugin.psi.DTokenTypes;

public class DLangPsiImplUtil {

    public static String getName(DLangClassDeclaration element) {
        ASTNode classNameNode = element.getNode().findChildByType(DTokenTypes.COMPONENT_NAME);
        if (classNameNode != null) {
            return classNameNode.getPsi().getText();
        } else {
            return null;
        }
    }

    public static PsiElement setName(DLangClassDeclaration element, String newName) {
        PsiElement classNameElement = getNameIdentifier(element);
        if (classNameElement != null) {
            //TODO: Test this code. I have doubts.
            PsiElement newKeyNode = new LeafPsiElement(DTokenTypes.COMPONENT_NAME, newName);
            element.getNode().replaceChild(classNameElement.getNode(), newKeyNode.getNode());
        }
        return element;
    }

    public static PsiElement getNameIdentifier(DLangClassDeclaration element) {
        ASTNode classNameNode = element.getNode().findChildByType(DTokenTypes.COMPONENT_NAME);
        if (classNameNode != null) {
            return classNameNode.getPsi();
        } else {
            return null;
        }
    }

    public static DLangClassPresentation getPresentation(DLangClassDeclaration element) {
        DLangComponentName componentName = element.getComponentName();
        if (componentName!=null) {
            return new DLangClassPresentation(componentName);
        }
        else {
            return null;
        }
    }
}
