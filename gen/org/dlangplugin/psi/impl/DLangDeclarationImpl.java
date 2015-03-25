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

public class DLangDeclarationImpl extends DLangCompositeElementImpl implements DLangDeclaration {

  public DLangDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAliasDeclaration getAliasDeclaration() {
    return findChildByClass(DLangAliasDeclaration.class);
  }

  @Override
  @Nullable
  public DLangAliasThisDeclaration getAliasThisDeclaration() {
    return findChildByClass(DLangAliasThisDeclaration.class);
  }

  @Override
  @Nullable
  public DLangClassDeclaration getClassDeclaration() {
    return findChildByClass(DLangClassDeclaration.class);
  }

  @Override
  @Nullable
  public DLangDecl getDecl() {
    return findChildByClass(DLangDecl.class);
  }

  @Override
  @Nullable
  public DLangEnumDeclaration getEnumDeclaration() {
    return findChildByClass(DLangEnumDeclaration.class);
  }

  @Override
  @Nullable
  public DLangImportDeclaration getImportDeclaration() {
    return findChildByClass(DLangImportDeclaration.class);
  }

  @Override
  @Nullable
  public DLangInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(DLangInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public DLangStructDeclaration getStructDeclaration() {
    return findChildByClass(DLangStructDeclaration.class);
  }

  @Override
  @Nullable
  public DLangUnionDeclaration getUnionDeclaration() {
    return findChildByClass(DLangUnionDeclaration.class);
  }

}
