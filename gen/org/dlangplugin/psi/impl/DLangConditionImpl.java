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

public class DLangConditionImpl extends DLangCompositeElementImpl implements DLangCondition {

  public DLangConditionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitCondition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangDebugCondition getDebugCondition() {
    return findChildByClass(DLangDebugCondition.class);
  }

  @Override
  @Nullable
  public DLangStaticIfCondition getStaticIfCondition() {
    return findChildByClass(DLangStaticIfCondition.class);
  }

  @Override
  @Nullable
  public DLangVersionCondition getVersionCondition() {
    return findChildByClass(DLangVersionCondition.class);
  }

}
