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

public class DLangDeclaratorsImpl extends DLangCompositeElementImpl implements DLangDeclarators {

  public DLangDeclaratorsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclarators(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangDeclaratorIdentifierList getDeclaratorIdentifierList() {
    return findChildByClass(DLangDeclaratorIdentifierList.class);
  }

  @Override
  @NotNull
  public DLangDeclaratorInitializer getDeclaratorInitializer() {
    return findNotNullChildByClass(DLangDeclaratorInitializer.class);
  }

}
