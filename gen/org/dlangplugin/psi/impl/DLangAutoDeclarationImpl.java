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

public class DLangAutoDeclarationImpl extends DLangCompositeElementImpl implements DLangAutoDeclaration {

  public DLangAutoDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitAutoDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangInitializer> getInitializerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangInitializer.class);
  }

  @Override
  @NotNull
  public List<DLangStorageClass> getStorageClassList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangStorageClass.class);
  }

  @Override
  @NotNull
  public List<DLangTemplateParameterList> getTemplateParameterListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangTemplateParameterList.class);
  }

}
