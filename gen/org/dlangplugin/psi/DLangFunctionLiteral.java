// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangFunctionLiteral extends DLangCompositeElement {

  @Nullable
  DLangFunctionAttributes getFunctionAttributes();

  @NotNull
  DLangFunctionBody getFunctionBody();

  @Nullable
  DLangParameters getParameters();

  @Nullable
  DLangType getType();

}
