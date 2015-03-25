// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangDeclaratorSuffix extends DLangCompositeElement {

  @Nullable
  DLangConstraint getConstraint();

  @Nullable
  DLangExpression getExpression();

  @Nullable
  DLangMemberFunctionAttributes getMemberFunctionAttributes();

  @Nullable
  DLangParameters getParameters();

  @Nullable
  DLangTemplateParameterList getTemplateParameterList();

  @Nullable
  DLangType getType();

}
