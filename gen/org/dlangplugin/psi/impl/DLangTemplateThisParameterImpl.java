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

public class DLangTemplateThisParameterImpl extends DLangCompositeElementImpl implements DLangTemplateThisParameter {

  public DLangTemplateThisParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitTemplateThisParameter(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangTemplateTypeParameter getTemplateTypeParameter() {
    return findNotNullChildByClass(DLangTemplateTypeParameter.class);
  }

}
