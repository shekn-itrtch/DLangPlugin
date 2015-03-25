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

public class DLangUnaryExpressionImpl extends DLangCompositeElementImpl implements DLangUnaryExpression {

  public DLangUnaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitUnaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangArgumentList> getArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangArgumentList.class);
  }

  @Override
  @Nullable
  public DLangArrayLiteral getArrayLiteral() {
    return findChildByClass(DLangArrayLiteral.class);
  }

  @Override
  @Nullable
  public DLangAssertExpression getAssertExpression() {
    return findChildByClass(DLangAssertExpression.class);
  }

  @Override
  @Nullable
  public DLangAssocArrayLiteral getAssocArrayLiteral() {
    return findChildByClass(DLangAssocArrayLiteral.class);
  }

  @Override
  @Nullable
  public DLangBasicType getBasicType() {
    return findChildByClass(DLangBasicType.class);
  }

  @Override
  @NotNull
  public List<DLangCastPrefix> getCastPrefixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangCastPrefix.class);
  }

  @Override
  @NotNull
  public List<DLangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangFunctionLiteral getFunctionLiteral() {
    return findChildByClass(DLangFunctionLiteral.class);
  }

  @Override
  @Nullable
  public DLangImportExpression getImportExpression() {
    return findChildByClass(DLangImportExpression.class);
  }

  @Override
  @Nullable
  public DLangIsExpression getIsExpression() {
    return findChildByClass(DLangIsExpression.class);
  }

  @Override
  @Nullable
  public DLangLambda getLambda() {
    return findChildByClass(DLangLambda.class);
  }

  @Override
  @Nullable
  public DLangMixinStatement getMixinStatement() {
    return findChildByClass(DLangMixinStatement.class);
  }

  @Override
  @NotNull
  public List<DLangNewExpression> getNewExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangNewExpression.class);
  }

  @Override
  @Nullable
  public DLangNewExpressionWithArgs getNewExpressionWithArgs() {
    return findChildByClass(DLangNewExpressionWithArgs.class);
  }

  @Override
  @Nullable
  public DLangString getString() {
    return findChildByClass(DLangString.class);
  }

  @Override
  @NotNull
  public List<DLangTemplateInstance> getTemplateInstanceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangTemplateInstance.class);
  }

  @Override
  @Nullable
  public DLangTraitsExpression getTraitsExpression() {
    return findChildByClass(DLangTraitsExpression.class);
  }

  @Override
  @Nullable
  public DLangType getType() {
    return findChildByClass(DLangType.class);
  }

  @Override
  @Nullable
  public DLangTypeCtors getTypeCtors() {
    return findChildByClass(DLangTypeCtors.class);
  }

  @Override
  @Nullable
  public DLangTypeidExpression getTypeidExpression() {
    return findChildByClass(DLangTypeidExpression.class);
  }

  @Override
  @Nullable
  public DLangTypeof getTypeof() {
    return findChildByClass(DLangTypeof.class);
  }

  @Override
  @Nullable
  public DLangUnaryExpression getUnaryExpression() {
    return findChildByClass(DLangUnaryExpression.class);
  }

}
