// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangExpression extends DLangCompositeElement {

  @NotNull
  List<DLangExpression> getExpressionList();

  @NotNull
  List<DLangUnaryExpression> getUnaryExpressionList();

}
