// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangFunctionBody extends DLangCompositeElement {

  @Nullable
  DLangBlockStatement getBlockStatement();

  @Nullable
  DLangBodyStatement getBodyStatement();

  @Nullable
  DLangInStatement getInStatement();

  @Nullable
  DLangOutStatement getOutStatement();

}
