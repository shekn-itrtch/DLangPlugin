package org.dlangplugin.psi;

import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiNamedElement;

public interface DLangNamedElement extends PsiNameIdentifierOwner, DLangCompositeElement, PsiNamedElement, NavigationItem {
}
