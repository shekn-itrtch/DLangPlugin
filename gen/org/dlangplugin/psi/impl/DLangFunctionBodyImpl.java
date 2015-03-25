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

public class DLangFunctionBodyImpl extends DLangCompositeElementImpl implements DLangFunctionBody {

  public DLangFunctionBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitFunctionBody(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangBlockStatement getBlockStatement() {
    return findChildByClass(DLangBlockStatement.class);
  }

  @Override
  @Nullable
  public DLangBodyStatement getBodyStatement() {
    return findChildByClass(DLangBodyStatement.class);
  }

  @Override
  @Nullable
  public DLangInStatement getInStatement() {
    return findChildByClass(DLangInStatement.class);
  }

  @Override
  @Nullable
  public DLangOutStatement getOutStatement() {
    return findChildByClass(DLangOutStatement.class);
  }

}
