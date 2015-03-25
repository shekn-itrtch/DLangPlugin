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

public class DLangParameterImpl extends DLangCompositeElementImpl implements DLangParameter {

  public DLangParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitParameter(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangBasicType getBasicType() {
    return findChildByClass(DLangBasicType.class);
  }

  @Override
  @Nullable
  public DLangDeclarator getDeclarator() {
    return findChildByClass(DLangDeclarator.class);
  }

  @Override
  @Nullable
  public DLangDefaultInitializerExpression getDefaultInitializerExpression() {
    return findChildByClass(DLangDefaultInitializerExpression.class);
  }

  @Override
  @NotNull
  public List<DLangInOutX> getInOutXList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangInOutX.class);
  }

  @Override
  @Nullable
  public DLangType getType() {
    return findChildByClass(DLangType.class);
  }

}
