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

public class DLangDeclaratorSuffixImpl extends DLangCompositeElementImpl implements DLangDeclaratorSuffix {

  public DLangDeclaratorSuffixImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclaratorSuffix(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangConstraint getConstraint() {
    return findChildByClass(DLangConstraint.class);
  }

  @Override
  @Nullable
  public DLangExpression getExpression() {
    return findChildByClass(DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangMemberFunctionAttributes getMemberFunctionAttributes() {
    return findChildByClass(DLangMemberFunctionAttributes.class);
  }

  @Override
  @Nullable
  public DLangParameters getParameters() {
    return findChildByClass(DLangParameters.class);
  }

  @Override
  @Nullable
  public DLangTemplateParameterList getTemplateParameterList() {
    return findChildByClass(DLangTemplateParameterList.class);
  }

  @Override
  @Nullable
  public DLangType getType() {
    return findChildByClass(DLangType.class);
  }

}
