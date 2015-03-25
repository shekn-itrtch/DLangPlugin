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

public class DLangNewExpressionWithArgsImpl extends DLangCompositeElementImpl implements DLangNewExpressionWithArgs {

  public DLangNewExpressionWithArgsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitNewExpressionWithArgs(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangArgumentList> getArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangArgumentList.class);
  }

  @Override
  @Nullable
  public DLangExpression getExpression() {
    return findChildByClass(DLangExpression.class);
  }

  @Override
  @NotNull
  public DLangType getType() {
    return findNotNullChildByClass(DLangType.class);
  }

}
