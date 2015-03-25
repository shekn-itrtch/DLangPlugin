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

public class DLangFunctionLiteralImpl extends DLangCompositeElementImpl implements DLangFunctionLiteral {

  public DLangFunctionLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitFunctionLiteral(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangFunctionAttributes getFunctionAttributes() {
    return findChildByClass(DLangFunctionAttributes.class);
  }

  @Override
  @NotNull
  public DLangFunctionBody getFunctionBody() {
    return findNotNullChildByClass(DLangFunctionBody.class);
  }

  @Override
  @Nullable
  public DLangParameters getParameters() {
    return findChildByClass(DLangParameters.class);
  }

  @Override
  @Nullable
  public DLangType getType() {
    return findChildByClass(DLangType.class);
  }

}
