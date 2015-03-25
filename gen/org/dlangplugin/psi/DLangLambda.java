// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangLambda extends DLangCompositeElement {

  @NotNull
  DLangExpression getExpression();

  @Nullable
  DLangFunctionAttributes getFunctionAttributes();

  @Nullable
  DLangParameters getParameters();

}
