// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangNewExpressionWithArgs extends DLangCompositeElement {

  @NotNull
  List<DLangArgumentList> getArgumentListList();

  @Nullable
  DLangExpression getExpression();

  @NotNull
  DLangType getType();

}
