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

public class DLangTemplateParameterImpl extends DLangCompositeElementImpl implements DLangTemplateParameter {

  public DLangTemplateParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitTemplateParameter(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangTemplateAliasParameter getTemplateAliasParameter() {
    return findChildByClass(DLangTemplateAliasParameter.class);
  }

  @Override
  @Nullable
  public DLangTemplateThisParameter getTemplateThisParameter() {
    return findChildByClass(DLangTemplateThisParameter.class);
  }

  @Override
  @Nullable
  public DLangTemplateTupleParameter getTemplateTupleParameter() {
    return findChildByClass(DLangTemplateTupleParameter.class);
  }

  @Override
  @Nullable
  public DLangTemplateTypeParameter getTemplateTypeParameter() {
    return findChildByClass(DLangTemplateTypeParameter.class);
  }

  @Override
  @Nullable
  public DLangTemplateValueParameter getTemplateValueParameter() {
    return findChildByClass(DLangTemplateValueParameter.class);
  }

}
