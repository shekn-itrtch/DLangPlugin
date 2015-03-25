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

public class DLangDeclarator2Impl extends DLangCompositeElementImpl implements DLangDeclarator2 {

  public DLangDeclarator2Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclarator2(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangBasicType2> getBasicType2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangBasicType2.class);
  }

  @Override
  @Nullable
  public DLangDeclarator2 getDeclarator2() {
    return findChildByClass(DLangDeclarator2.class);
  }

  @Override
  @NotNull
  public List<DLangDeclaratorSuffix> getDeclaratorSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangDeclaratorSuffix.class);
  }

}
