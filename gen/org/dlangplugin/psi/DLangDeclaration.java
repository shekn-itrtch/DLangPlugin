// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangDeclaration extends DLangCompositeElement {

  @Nullable
  DLangAliasDeclaration getAliasDeclaration();

  @Nullable
  DLangAliasThisDeclaration getAliasThisDeclaration();

  @Nullable
  DLangClassDeclaration getClassDeclaration();

  @Nullable
  DLangDecl getDecl();

  @Nullable
  DLangEnumDeclaration getEnumDeclaration();

  @Nullable
  DLangImportDeclaration getImportDeclaration();

  @Nullable
  DLangInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  DLangStructDeclaration getStructDeclaration();

  @Nullable
  DLangUnionDeclaration getUnionDeclaration();

}
