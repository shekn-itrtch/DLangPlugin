// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dlangplugin.psi.DTokenTypes.*;
import org.dlangplugin.psi.*;

public class DLangClassDeclarationImpl extends DLangCompositeElementImpl implements DLangClassDeclaration {

  public DLangClassDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitClassDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAggregateBody getAggregateBody() {
    return findChildByClass(DLangAggregateBody.class);
  }

  @Override
  @Nullable
  public DLangBaseClassList getBaseClassList() {
    return findChildByClass(DLangBaseClassList.class);
  }

  @Override
  @Nullable
  public DLangClassTemplateDeclaration getClassTemplateDeclaration() {
    return findChildByClass(DLangClassTemplateDeclaration.class);
  }

  @Override
  @Nullable
  public DLangComponentName getComponentName() {
    return findChildByClass(DLangComponentName.class);
  }

  public String getName() {
    return DLangPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return DLangPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return DLangPsiImplUtil.getNameIdentifier(this);
  }

  public DLangClassPresentation getPresentation() {
    return DLangPsiImplUtil.getPresentation(this);
  }

}
