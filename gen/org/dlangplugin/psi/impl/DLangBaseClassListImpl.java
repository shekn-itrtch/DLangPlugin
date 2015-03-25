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

public class DLangBaseClassListImpl extends DLangCompositeElementImpl implements DLangBaseClassList {

  public DLangBaseClassListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitBaseClassList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangReferenceExpression> getReferenceExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangReferenceExpression.class);
  }

  @Override
  @NotNull
  public List<DLangTemplateInstance> getTemplateInstanceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangTemplateInstance.class);
  }

}
