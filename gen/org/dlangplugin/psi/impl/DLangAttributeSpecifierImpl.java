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

public class DLangAttributeSpecifierImpl extends DLangCompositeElementImpl implements DLangAttributeSpecifier {

  public DLangAttributeSpecifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitAttributeSpecifier(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAlignAttribute getAlignAttribute() {
    return findChildByClass(DLangAlignAttribute.class);
  }

  @Override
  @Nullable
  public DLangDeclarationBlock getDeclarationBlock() {
    return findChildByClass(DLangDeclarationBlock.class);
  }

  @Override
  @Nullable
  public DLangDeprecatedAttribute getDeprecatedAttribute() {
    return findChildByClass(DLangDeprecatedAttribute.class);
  }

  @Override
  @Nullable
  public DLangLinkageAttribute getLinkageAttribute() {
    return findChildByClass(DLangLinkageAttribute.class);
  }

  @Override
  @Nullable
  public DLangPragma getPragma() {
    return findChildByClass(DLangPragma.class);
  }

  @Override
  @Nullable
  public DLangProperty getProperty() {
    return findChildByClass(DLangProperty.class);
  }

  @Override
  @Nullable
  public DLangProtectionAttribute getProtectionAttribute() {
    return findChildByClass(DLangProtectionAttribute.class);
  }

}
