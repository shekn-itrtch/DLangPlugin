// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangTemplateValueParameter extends DLangCompositeElement {

  @NotNull
  DLangBasicType getBasicType();

  @NotNull
  DLangDeclarator getDeclarator();

  @NotNull
  List<DLangExpression> getExpressionList();

  @Nullable
  DLangSpecialKeyword getSpecialKeyword();

}
