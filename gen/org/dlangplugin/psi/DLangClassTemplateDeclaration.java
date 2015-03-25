// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangClassTemplateDeclaration extends DLangCompositeElement {

  @NotNull
  DLangAggregateBody getAggregateBody();

  @Nullable
  DLangBaseClassList getBaseClassList();

  @Nullable
  DLangConstraint getConstraint();

  @Nullable
  DLangTemplateParameterList getTemplateParameterList();

}
