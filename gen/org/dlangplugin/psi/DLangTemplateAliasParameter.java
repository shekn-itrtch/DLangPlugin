// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangTemplateAliasParameter extends DLangCompositeElement {

  @Nullable
  DLangBasicType getBasicType();

  @Nullable
  DLangDeclarator getDeclarator();

  @NotNull
  List<DLangExpression> getExpressionList();

  @NotNull
  List<DLangType> getTypeList();

}
