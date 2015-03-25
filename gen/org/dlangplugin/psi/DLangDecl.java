// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangDecl extends DLangCompositeElement {

  @Nullable
  DLangAutoDeclaration getAutoDeclaration();

  @Nullable
  DLangBasicType getBasicType();

  @Nullable
  DLangDeclarators getDeclarators();

  @Nullable
  DLangFunctionBody getFunctionBody();

  @NotNull
  List<DLangStorageClass> getStorageClassList();

  @Nullable
  DLangTypeCISI getTypeCISI();

}
