// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dlangplugin.psi.DTokenTypes.*;
import org.dlangplugin.psi.*;

public class DLangImportBindingsImpl extends DLangCompositeElementImpl implements DLangImportBindings {

  public DLangImportBindingsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitImportBindings(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangImport getImport() {
    return findNotNullChildByClass(DLangImport.class);
  }

  @Override
  @NotNull
  public List<DLangImportBind> getImportBindList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangImportBind.class);
  }

}
