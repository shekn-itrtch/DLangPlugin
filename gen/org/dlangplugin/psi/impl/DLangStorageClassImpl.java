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

public class DLangStorageClassImpl extends DLangCompositeElementImpl implements DLangStorageClass {

  public DLangStorageClassImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitStorageClass(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangLinkageAttribute getLinkageAttribute() {
    return findChildByClass(DLangLinkageAttribute.class);
  }

  @Override
  @Nullable
  public DLangProperty getProperty() {
    return findChildByClass(DLangProperty.class);
  }

}
