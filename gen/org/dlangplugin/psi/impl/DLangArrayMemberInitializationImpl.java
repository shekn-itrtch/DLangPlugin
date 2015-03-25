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

public class DLangArrayMemberInitializationImpl extends DLangCompositeElementImpl implements DLangArrayMemberInitialization {

  public DLangArrayMemberInitializationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitArrayMemberInitialization(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangArrayInitializer getArrayInitializer() {
    return findChildByClass(DLangArrayInitializer.class);
  }

  @Override
  @Nullable
  public DLangExpInitializer getExpInitializer() {
    return findChildByClass(DLangExpInitializer.class);
  }

  @Override
  @Nullable
  public DLangExpression getExpression() {
    return findChildByClass(DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangStructInitializer getStructInitializer() {
    return findChildByClass(DLangStructInitializer.class);
  }

}
