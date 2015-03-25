// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangParameter extends DLangCompositeElement {

  @Nullable
  DLangBasicType getBasicType();

  @Nullable
  DLangDeclarator getDeclarator();

  @Nullable
  DLangDefaultInitializerExpression getDefaultInitializerExpression();

  @NotNull
  List<DLangInOutX> getInOutXList();

  @Nullable
  DLangType getType();

}
