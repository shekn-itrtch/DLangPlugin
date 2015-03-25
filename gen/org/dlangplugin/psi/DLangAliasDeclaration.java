// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangAliasDeclaration extends DLangCompositeElement {

  @Nullable
  DLangAliasInitializerList getAliasInitializerList();

  @Nullable
  DLangBasicType getBasicType();

  @Nullable
  DLangDeclarators getDeclarators();

  @NotNull
  List<DLangStorageClass> getStorageClassList();

}
