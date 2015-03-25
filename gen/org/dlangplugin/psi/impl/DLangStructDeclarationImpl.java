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

public class DLangStructDeclarationImpl extends DLangCompositeElementImpl implements DLangStructDeclaration {

  public DLangStructDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitStructDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAggregateBody getAggregateBody() {
    return findChildByClass(DLangAggregateBody.class);
  }

  @Override
  @Nullable
  public DLangStructTemplateDeclaration getStructTemplateDeclaration() {
    return findChildByClass(DLangStructTemplateDeclaration.class);
  }

}
