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

public class DLangForStatementImpl extends DLangCompositeElementImpl implements DLangForStatement {

  public DLangForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitForStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangAsmStatement getAsmStatement() {
    return findChildByClass(DLangAsmStatement.class);
  }

  @Override
  @Nullable
  public DLangBlockStatement getBlockStatement() {
    return findChildByClass(DLangBlockStatement.class);
  }

  @Override
  @Nullable
  public DLangBreakStatement getBreakStatement() {
    return findChildByClass(DLangBreakStatement.class);
  }

  @Override
  @Nullable
  public DLangCaseRangeStatement getCaseRangeStatement() {
    return findChildByClass(DLangCaseRangeStatement.class);
  }

  @Override
  @Nullable
  public DLangCaseStatement getCaseStatement() {
    return findChildByClass(DLangCaseStatement.class);
  }

  @Override
  @Nullable
  public DLangConditionalStatement getConditionalStatement() {
    return findChildByClass(DLangConditionalStatement.class);
  }

  @Override
  @Nullable
  public DLangContinueStatement getContinueStatement() {
    return findChildByClass(DLangContinueStatement.class);
  }

  @Override
  @Nullable
  public DLangDeclaration getDeclaration() {
    return findChildByClass(DLangDeclaration.class);
  }

  @Override
  @Nullable
  public DLangDefaultStatement getDefaultStatement() {
    return findChildByClass(DLangDefaultStatement.class);
  }

  @Override
  @Nullable
  public DLangDoStatement getDoStatement() {
    return findChildByClass(DLangDoStatement.class);
  }

  @Override
  @NotNull
  public List<DLangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangExpression.class);
  }

  @Override
  @Nullable
  public DLangForStatement getForStatement() {
    return findChildByClass(DLangForStatement.class);
  }

  @Override
  @Nullable
  public DLangForeachRangeStatement getForeachRangeStatement() {
    return findChildByClass(DLangForeachRangeStatement.class);
  }

  @Override
  @Nullable
  public DLangForeachStatement getForeachStatement() {
    return findChildByClass(DLangForeachStatement.class);
  }

  @Override
  @Nullable
  public DLangGotoStatement getGotoStatement() {
    return findChildByClass(DLangGotoStatement.class);
  }

  @Override
  @Nullable
  public DLangIfStatement getIfStatement() {
    return findChildByClass(DLangIfStatement.class);
  }

  @Override
  @Nullable
  public DLangImportDeclaration getImportDeclaration() {
    return findChildByClass(DLangImportDeclaration.class);
  }

  @Override
  @Nullable
  public DLangMixinStatement getMixinStatement() {
    return findChildByClass(DLangMixinStatement.class);
  }

  @Override
  @Nullable
  public DLangPragmaStatement getPragmaStatement() {
    return findChildByClass(DLangPragmaStatement.class);
  }

  @Override
  @Nullable
  public DLangReturnStatement getReturnStatement() {
    return findChildByClass(DLangReturnStatement.class);
  }

  @Override
  @Nullable
  public DLangScopeGuardStatement getScopeGuardStatement() {
    return findChildByClass(DLangScopeGuardStatement.class);
  }

  @Override
  @NotNull
  public DLangScopeStatement getScopeStatement() {
    return findNotNullChildByClass(DLangScopeStatement.class);
  }

  @Override
  @Nullable
  public DLangStaticAssert getStaticAssert() {
    return findChildByClass(DLangStaticAssert.class);
  }

  @Override
  @Nullable
  public DLangSwitchStatement getSwitchStatement() {
    return findChildByClass(DLangSwitchStatement.class);
  }

  @Override
  @Nullable
  public DLangSynchronizedStatement getSynchronizedStatement() {
    return findChildByClass(DLangSynchronizedStatement.class);
  }

  @Override
  @Nullable
  public DLangTemplateMixin getTemplateMixin() {
    return findChildByClass(DLangTemplateMixin.class);
  }

  @Override
  @Nullable
  public DLangThrowStatement getThrowStatement() {
    return findChildByClass(DLangThrowStatement.class);
  }

  @Override
  @Nullable
  public DLangTryStatement getTryStatement() {
    return findChildByClass(DLangTryStatement.class);
  }

  @Override
  @Nullable
  public DLangWhileStatement getWhileStatement() {
    return findChildByClass(DLangWhileStatement.class);
  }

  @Override
  @Nullable
  public DLangWithStatement getWithStatement() {
    return findChildByClass(DLangWithStatement.class);
  }

}
