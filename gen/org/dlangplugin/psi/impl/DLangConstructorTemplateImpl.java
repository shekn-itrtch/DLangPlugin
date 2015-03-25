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

public class DLangConstructorTemplateImpl extends DLangCompositeElementImpl implements DLangConstructorTemplate {

  public DLangConstructorTemplateImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitConstructorTemplate(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangConstraint getConstraint() {
    return findChildByClass(DLangConstraint.class);
  }

  @Override
  @Nullable
  public DLangFunctionBody getFunctionBody() {
    return findChildByClass(DLangFunctionBody.class);
  }

  @Override
  @Nullable
  public DLangMemberFunctionAttributes getMemberFunctionAttributes() {
    return findChildByClass(DLangMemberFunctionAttributes.class);
  }

  @Override
  @NotNull
  public DLangParameters getParameters() {
    return findNotNullChildByClass(DLangParameters.class);
  }

  @Override
  @Nullable
  public DLangTemplateParameterList getTemplateParameterList() {
    return findChildByClass(DLangTemplateParameterList.class);
  }

}
