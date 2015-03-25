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

public class DLangDeclImpl extends DLangCompositeElementImpl implements DLangDecl {

  public DLangDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAutoDeclaration getAutoDeclaration() {
    return findChildByClass(DLangAutoDeclaration.class);
  }

  @Override
  @Nullable
  public DLangBasicType getBasicType() {
    return findChildByClass(DLangBasicType.class);
  }

  @Override
  @Nullable
  public DLangDeclarators getDeclarators() {
    return findChildByClass(DLangDeclarators.class);
  }

  @Override
  @Nullable
  public DLangFunctionBody getFunctionBody() {
    return findChildByClass(DLangFunctionBody.class);
  }

  @Override
  @NotNull
  public List<DLangStorageClass> getStorageClassList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangStorageClass.class);
  }

  @Override
  @Nullable
  public DLangTypeCISI getTypeCISI() {
    return findChildByClass(DLangTypeCISI.class);
  }

}
