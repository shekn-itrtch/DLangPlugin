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

public class DLangDeclaratorImpl extends DLangCompositeElementImpl implements DLangDeclarator {

  public DLangDeclaratorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclarator(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangBasicType2> getBasicType2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangBasicType2.class);
  }

  @Override
  @Nullable
  public DLangDeclarator getDeclarator() {
    return findChildByClass(DLangDeclarator.class);
  }

  @Override
  @NotNull
  public List<DLangDeclaratorSuffix> getDeclaratorSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangDeclaratorSuffix.class);
  }

}
