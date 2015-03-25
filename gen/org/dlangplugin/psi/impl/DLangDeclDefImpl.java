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

public class DLangDeclDefImpl extends DLangCompositeElementImpl implements DLangDeclDef {

  public DLangDeclDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitDeclDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAliasThis getAliasThis() {
    return findChildByClass(DLangAliasThis.class);
  }

  @Override
  @Nullable
  public DLangAllocator getAllocator() {
    return findChildByClass(DLangAllocator.class);
  }

  @Override
  @Nullable
  public DLangAttributeSpecifier getAttributeSpecifier() {
    return findChildByClass(DLangAttributeSpecifier.class);
  }

  @Override
  @Nullable
  public DLangConditionalDeclaration getConditionalDeclaration() {
    return findChildByClass(DLangConditionalDeclaration.class);
  }

  @Override
  @Nullable
  public DLangConstructor getConstructor() {
    return findChildByClass(DLangConstructor.class);
  }

  @Override
  @Nullable
  public DLangDeallocator getDeallocator() {
    return findChildByClass(DLangDeallocator.class);
  }

  @Override
  @Nullable
  public DLangDebugSpecification getDebugSpecification() {
    return findChildByClass(DLangDebugSpecification.class);
  }

  @Override
  @Nullable
  public DLangDeclaration getDeclaration() {
    return findChildByClass(DLangDeclaration.class);
  }

  @Override
  @Nullable
  public DLangDestructor getDestructor() {
    return findChildByClass(DLangDestructor.class);
  }

  @Override
  @Nullable
  public DLangInvariant getInvariant() {
    return findChildByClass(DLangInvariant.class);
  }

  @Override
  @Nullable
  public DLangMixinDeclaration getMixinDeclaration() {
    return findChildByClass(DLangMixinDeclaration.class);
  }

  @Override
  @Nullable
  public DLangPostblit getPostblit() {
    return findChildByClass(DLangPostblit.class);
  }

  @Override
  @Nullable
  public DLangSharedStaticConstructor getSharedStaticConstructor() {
    return findChildByClass(DLangSharedStaticConstructor.class);
  }

  @Override
  @Nullable
  public DLangSharedStaticDestructor getSharedStaticDestructor() {
    return findChildByClass(DLangSharedStaticDestructor.class);
  }

  @Override
  @Nullable
  public DLangStaticAssert getStaticAssert() {
    return findChildByClass(DLangStaticAssert.class);
  }

  @Override
  @Nullable
  public DLangStaticConstructor getStaticConstructor() {
    return findChildByClass(DLangStaticConstructor.class);
  }

  @Override
  @Nullable
  public DLangStaticDestructor getStaticDestructor() {
    return findChildByClass(DLangStaticDestructor.class);
  }

  @Override
  @Nullable
  public DLangTemplateDeclaration getTemplateDeclaration() {
    return findChildByClass(DLangTemplateDeclaration.class);
  }

  @Override
  @Nullable
  public DLangTemplateMixin getTemplateMixin() {
    return findChildByClass(DLangTemplateMixin.class);
  }

  @Override
  @Nullable
  public DLangTemplateMixinDeclaration getTemplateMixinDeclaration() {
    return findChildByClass(DLangTemplateMixinDeclaration.class);
  }

  @Override
  @Nullable
  public DLangUnitTest getUnitTest() {
    return findChildByClass(DLangUnitTest.class);
  }

  @Override
  @Nullable
  public DLangVersionSpecification getVersionSpecification() {
    return findChildByClass(DLangVersionSpecification.class);
  }

}
