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

public class DLangLambdaImpl extends DLangCompositeElementImpl implements DLangLambda {

  public DLangLambdaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitLambda(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangExpression getExpression() {
    return findNotNullChildByClass(DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangFunctionAttributes getFunctionAttributes() {
    return findChildByClass(DLangFunctionAttributes.class);
  }

  @Override
  @Nullable
  public DLangParameters getParameters() {
    return findChildByClass(DLangParameters.class);
  }

}
