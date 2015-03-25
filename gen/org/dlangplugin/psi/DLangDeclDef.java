// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangDeclDef extends DLangCompositeElement {

  @Nullable
  DLangAliasThis getAliasThis();

  @Nullable
  DLangAllocator getAllocator();

  @Nullable
  DLangAttributeSpecifier getAttributeSpecifier();

  @Nullable
  DLangConditionalDeclaration getConditionalDeclaration();

  @Nullable
  DLangConstructor getConstructor();

  @Nullable
  DLangDeallocator getDeallocator();

  @Nullable
  DLangDebugSpecification getDebugSpecification();

  @Nullable
  DLangDeclaration getDeclaration();

  @Nullable
  DLangDestructor getDestructor();

  @Nullable
  DLangInvariant getInvariant();

  @Nullable
  DLangMixinDeclaration getMixinDeclaration();

  @Nullable
  DLangPostblit getPostblit();

  @Nullable
  DLangSharedStaticConstructor getSharedStaticConstructor();

  @Nullable
  DLangSharedStaticDestructor getSharedStaticDestructor();

  @Nullable
  DLangStaticAssert getStaticAssert();

  @Nullable
  DLangStaticConstructor getStaticConstructor();

  @Nullable
  DLangStaticDestructor getStaticDestructor();

  @Nullable
  DLangTemplateDeclaration getTemplateDeclaration();

  @Nullable
  DLangTemplateMixin getTemplateMixin();

  @Nullable
  DLangTemplateMixinDeclaration getTemplateMixinDeclaration();

  @Nullable
  DLangUnitTest getUnitTest();

  @Nullable
  DLangVersionSpecification getVersionSpecification();

}
