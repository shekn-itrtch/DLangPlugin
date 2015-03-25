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

public class DLangTypeImpl extends DLangCompositeElementImpl implements DLangType {

  public DLangTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangBasicType getBasicType() {
    return findNotNullChildByClass(DLangBasicType.class);
  }

  @Override
  @Nullable
  public DLangDeclarator2 getDeclarator2() {
    return findChildByClass(DLangDeclarator2.class);
  }

  @Override
  @Nullable
  public DLangTypeCtors getTypeCtors() {
    return findChildByClass(DLangTypeCtors.class);
  }

}
