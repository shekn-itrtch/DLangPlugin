// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangConstructorTemplate extends DLangCompositeElement {

  @Nullable
  DLangConstraint getConstraint();

  @Nullable
  DLangFunctionBody getFunctionBody();

  @Nullable
  DLangMemberFunctionAttributes getMemberFunctionAttributes();

  @NotNull
  DLangParameters getParameters();

  @Nullable
  DLangTemplateParameterList getTemplateParameterList();

}
