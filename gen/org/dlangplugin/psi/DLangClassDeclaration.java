// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangClassDeclaration extends DLangClass {

  @Nullable
  DLangAggregateBody getAggregateBody();

  @Nullable
  DLangBaseClassList getBaseClassList();

  @Nullable
  DLangClassTemplateDeclaration getClassTemplateDeclaration();

  @Nullable
  DLangComponentName getComponentName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  DLangClassPresentation getPresentation();

}
