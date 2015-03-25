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

public class DLangTemplateValueParameterImpl extends DLangCompositeElementImpl implements DLangTemplateValueParameter {

  public DLangTemplateValueParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitTemplateValueParameter(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangBasicType getBasicType() {
    return findNotNullChildByClass(DLangBasicType.class);
  }

  @Override
  @NotNull
  public DLangDeclarator getDeclarator() {
    return findNotNullChildByClass(DLangDeclarator.class);
  }

  @Override
  @NotNull
  public List<DLangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangSpecialKeyword getSpecialKeyword() {
    return findChildByClass(DLangSpecialKeyword.class);
  }

}
