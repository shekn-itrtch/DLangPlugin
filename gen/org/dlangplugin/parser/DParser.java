// This is a generated file. Not intended for manual editing.
package org.dlangplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.dlangplugin.psi.DTokenTypes.*;
import static org.dlangplugin.parser.DLangParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AGGREGATE_BODY) {
      r = AggregateBody(b, 0);
    }
    else if (t == ALIAS_DECLARATION) {
      r = AliasDeclaration(b, 0);
    }
    else if (t == ALIAS_INITIALIZER) {
      r = AliasInitializer(b, 0);
    }
    else if (t == ALIAS_INITIALIZER_LIST) {
      r = AliasInitializerList(b, 0);
    }
    else if (t == ALIAS_THIS) {
      r = AliasThis(b, 0);
    }
    else if (t == ALIAS_THIS_DECLARATION) {
      r = AliasThisDeclaration(b, 0);
    }
    else if (t == ALIGN_ATTRIBUTE) {
      r = AlignAttribute(b, 0);
    }
    else if (t == ALLOCATOR) {
      r = Allocator(b, 0);
    }
    else if (t == ARGUMENT_LIST) {
      r = ArgumentList(b, 0);
    }
    else if (t == ARRAY_INITIALIZER) {
      r = ArrayInitializer(b, 0);
    }
    else if (t == ARRAY_LITERAL) {
      r = ArrayLiteral(b, 0);
    }
    else if (t == ARRAY_MEMBER_INITIALIZATION) {
      r = ArrayMemberInitialization(b, 0);
    }
    else if (t == ASM_INSTRUCTION) {
      r = AsmInstruction(b, 0);
    }
    else if (t == ASM_STATEMENT) {
      r = AsmStatement(b, 0);
    }
    else if (t == ASSERT_EXPRESSION) {
      r = AssertExpression(b, 0);
    }
    else if (t == ASSOC_ARRAY_LITERAL) {
      r = AssocArrayLiteral(b, 0);
    }
    else if (t == ATTRIBUTE_SPECIFIER) {
      r = AttributeSpecifier(b, 0);
    }
    else if (t == AUTO_DECLARATION) {
      r = AutoDeclaration(b, 0);
    }
    else if (t == BASE_CLASS_LIST) {
      r = BaseClassList(b, 0);
    }
    else if (t == BASE_INTERFACE_LIST) {
      r = BaseInterfaceList(b, 0);
    }
    else if (t == BASIC_TYPE) {
      r = BasicType(b, 0);
    }
    else if (t == BASIC_TYPE_2) {
      r = BasicType2(b, 0);
    }
    else if (t == BASIC_TYPE_X) {
      r = BasicTypeX(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = BlockStatement(b, 0);
    }
    else if (t == BODY_STATEMENT) {
      r = BodyStatement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = BreakStatement(b, 0);
    }
    else if (t == COMMENT) {
      r = COMMENT(b, 0);
    }
    else if (t == CASE_RANGE_STATEMENT) {
      r = CaseRangeStatement(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = CaseStatement(b, 0);
    }
    else if (t == CAST_PREFIX) {
      r = CastPrefix(b, 0);
    }
    else if (t == CATCH) {
      r = Catch(b, 0);
    }
    else if (t == CATCHES) {
      r = Catches(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = ClassDeclaration(b, 0);
    }
    else if (t == CLASS_TEMPLATE_DECLARATION) {
      r = ClassTemplateDeclaration(b, 0);
    }
    else if (t == COMMA_EXPRESSION) {
      r = CommaExpression(b, 0);
    }
    else if (t == COMPONENT_NAME) {
      r = ComponentName(b, 0);
    }
    else if (t == CONDITION) {
      r = Condition(b, 0);
    }
    else if (t == CONDITIONAL_DECLARATION) {
      r = ConditionalDeclaration(b, 0);
    }
    else if (t == CONDITIONAL_STATEMENT) {
      r = ConditionalStatement(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = Constraint(b, 0);
    }
    else if (t == CONSTRUCTOR) {
      r = Constructor(b, 0);
    }
    else if (t == CONSTRUCTOR_TEMPLATE) {
      r = ConstructorTemplate(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = ContinueStatement(b, 0);
    }
    else if (t == DEALLOCATOR) {
      r = Deallocator(b, 0);
    }
    else if (t == DEBUG_CONDITION) {
      r = DebugCondition(b, 0);
    }
    else if (t == DEBUG_SPECIFICATION) {
      r = DebugSpecification(b, 0);
    }
    else if (t == DECL) {
      r = Decl(b, 0);
    }
    else if (t == DECL_DEF) {
      r = DeclDef(b, 0);
    }
    else if (t == DECLARATION) {
      r = Declaration(b, 0);
    }
    else if (t == DECLARATION_BLOCK) {
      r = DeclarationBlock(b, 0);
    }
    else if (t == DECLARATOR) {
      r = Declarator(b, 0);
    }
    else if (t == DECLARATOR_2) {
      r = Declarator2(b, 0);
    }
    else if (t == DECLARATOR_IDENTIFIER) {
      r = DeclaratorIdentifier(b, 0);
    }
    else if (t == DECLARATOR_IDENTIFIER_LIST) {
      r = DeclaratorIdentifierList(b, 0);
    }
    else if (t == DECLARATOR_INITIALIZER) {
      r = DeclaratorInitializer(b, 0);
    }
    else if (t == DECLARATOR_SUFFIX) {
      r = DeclaratorSuffix(b, 0);
    }
    else if (t == DECLARATORS) {
      r = Declarators(b, 0);
    }
    else if (t == DEFAULT_INITIALIZER_EXPRESSION) {
      r = DefaultInitializerExpression(b, 0);
    }
    else if (t == DEFAULT_STATEMENT) {
      r = DefaultStatement(b, 0);
    }
    else if (t == DEPRECATED_ATTRIBUTE) {
      r = DeprecatedAttribute(b, 0);
    }
    else if (t == DESTRUCTOR) {
      r = Destructor(b, 0);
    }
    else if (t == DO_STATEMENT) {
      r = DoStatement(b, 0);
    }
    else if (t == ENUM_BODY) {
      r = EnumBody(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = EnumDeclaration(b, 0);
    }
    else if (t == ENUM_MEMBER) {
      r = EnumMember(b, 0);
    }
    else if (t == EXP_INITIALIZER) {
      r = ExpInitializer(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == FINALLY_STATEMENT) {
      r = FinallyStatement(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FOREACH_RANGE_STATEMENT) {
      r = ForeachRangeStatement(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = ForeachStatement(b, 0);
    }
    else if (t == FOREACH_TYPE) {
      r = ForeachType(b, 0);
    }
    else if (t == FOREACH_TYPES) {
      r = ForeachTypes(b, 0);
    }
    else if (t == FUNCTION_ATTRIBUTE) {
      r = FunctionAttribute(b, 0);
    }
    else if (t == FUNCTION_ATTRIBUTES) {
      r = FunctionAttributes(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = FunctionBody(b, 0);
    }
    else if (t == FUNCTION_LITERAL) {
      r = FunctionLiteral(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = GotoStatement(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = IdentifierList(b, 0);
    }
    else if (t == IF_CONDITION) {
      r = IfCondition(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT) {
      r = Import(b, 0);
    }
    else if (t == IMPORT_BIND) {
      r = ImportBind(b, 0);
    }
    else if (t == IMPORT_BINDINGS) {
      r = ImportBindings(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = ImportDeclaration(b, 0);
    }
    else if (t == IMPORT_EXPRESSION) {
      r = ImportExpression(b, 0);
    }
    else if (t == IMPORT_LIST) {
      r = ImportList(b, 0);
    }
    else if (t == IN_OUT_X) {
      r = InOutX(b, 0);
    }
    else if (t == IN_STATEMENT) {
      r = InStatement(b, 0);
    }
    else if (t == INITIALIZER) {
      r = Initializer(b, 0);
    }
    else if (t == INTERFACE_DECLARATION) {
      r = InterfaceDeclaration(b, 0);
    }
    else if (t == INTERFACE_TEMPLATE_DECLARATION) {
      r = InterfaceTemplateDeclaration(b, 0);
    }
    else if (t == INVARIANT) {
      r = Invariant(b, 0);
    }
    else if (t == IS_EXPRESSION) {
      r = IsExpression(b, 0);
    }
    else if (t == KEY_VALUE_PAIR) {
      r = KeyValuePair(b, 0);
    }
    else if (t == LAMBDA) {
      r = Lambda(b, 0);
    }
    else if (t == LAST_CATCH) {
      r = LastCatch(b, 0);
    }
    else if (t == LINKAGE_ATTRIBUTE) {
      r = LinkageAttribute(b, 0);
    }
    else if (t == MEMBER_FUNCTION_ATTRIBUTES) {
      r = MemberFunctionAttributes(b, 0);
    }
    else if (t == MIXIN_DECLARATION) {
      r = MixinDeclaration(b, 0);
    }
    else if (t == MIXIN_STATEMENT) {
      r = MixinStatement(b, 0);
    }
    else if (t == MIXIN_TEMPLATE_NAME) {
      r = MixinTemplateName(b, 0);
    }
    else if (t == MODULE_DECLARATION) {
      r = ModuleDeclaration(b, 0);
    }
    else if (t == MODULE_FULLY_QUALIFIED_NAME) {
      r = ModuleFullyQualifiedName(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = NewExpression(b, 0);
    }
    else if (t == NEW_EXPRESSION_WITH_ARGS) {
      r = NewExpressionWithArgs(b, 0);
    }
    else if (t == OUT_STATEMENT) {
      r = OutStatement(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PARAMETERS) {
      r = Parameters(b, 0);
    }
    else if (t == POSTBLIT) {
      r = Postblit(b, 0);
    }
    else if (t == PRAGMA) {
      r = Pragma(b, 0);
    }
    else if (t == PRAGMA_STATEMENT) {
      r = PragmaStatement(b, 0);
    }
    else if (t == PROPERTY) {
      r = Property(b, 0);
    }
    else if (t == PROTECTION_ATTRIBUTE) {
      r = ProtectionAttribute(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER_LIST) {
      r = QualifiedIdentifierList(b, 0);
    }
    else if (t == REFERENCE_EXPRESSION) {
      r = ReferenceExpression(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == STRING) {
      r = STRING(b, 0);
    }
    else if (t == SCOPE_GUARD_STATEMENT) {
      r = ScopeGuardStatement(b, 0);
    }
    else if (t == SCOPE_STATEMENT) {
      r = ScopeStatement(b, 0);
    }
    else if (t == SHARED_STATIC_CONSTRUCTOR) {
      r = SharedStaticConstructor(b, 0);
    }
    else if (t == SHARED_STATIC_DESTRUCTOR) {
      r = SharedStaticDestructor(b, 0);
    }
    else if (t == SPECIAL_KEYWORD) {
      r = SpecialKeyword(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STATIC_ASSERT) {
      r = StaticAssert(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR) {
      r = StaticConstructor(b, 0);
    }
    else if (t == STATIC_DESTRUCTOR) {
      r = StaticDestructor(b, 0);
    }
    else if (t == STATIC_IF_CONDITION) {
      r = StaticIfCondition(b, 0);
    }
    else if (t == STORAGE_CLASS) {
      r = StorageClass(b, 0);
    }
    else if (t == STRUCT_DECLARATION) {
      r = StructDeclaration(b, 0);
    }
    else if (t == STRUCT_INITIALIZER) {
      r = StructInitializer(b, 0);
    }
    else if (t == STRUCT_MEMBER_INITIALIZER) {
      r = StructMemberInitializer(b, 0);
    }
    else if (t == STRUCT_TEMPLATE_DECLARATION) {
      r = StructTemplateDeclaration(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = SwitchStatement(b, 0);
    }
    else if (t == SYMBOL) {
      r = Symbol(b, 0);
    }
    else if (t == SYNCHRONIZED_STATEMENT) {
      r = SynchronizedStatement(b, 0);
    }
    else if (t == TEMPLATE_ALIAS_PARAMETER) {
      r = TemplateAliasParameter(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENT) {
      r = TemplateArgument(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENTS) {
      r = TemplateArguments(b, 0);
    }
    else if (t == TEMPLATE_DECLARATION) {
      r = TemplateDeclaration(b, 0);
    }
    else if (t == TEMPLATE_INSTANCE) {
      r = TemplateInstance(b, 0);
    }
    else if (t == TEMPLATE_MIXIN) {
      r = TemplateMixin(b, 0);
    }
    else if (t == TEMPLATE_MIXIN_DECLARATION) {
      r = TemplateMixinDeclaration(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER) {
      r = TemplateParameter(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER_LIST) {
      r = TemplateParameterList(b, 0);
    }
    else if (t == TEMPLATE_SINGLE_ARGUMENT) {
      r = TemplateSingleArgument(b, 0);
    }
    else if (t == TEMPLATE_THIS_PARAMETER) {
      r = TemplateThisParameter(b, 0);
    }
    else if (t == TEMPLATE_TUPLE_PARAMETER) {
      r = TemplateTupleParameter(b, 0);
    }
    else if (t == TEMPLATE_TYPE_PARAMETER) {
      r = TemplateTypeParameter(b, 0);
    }
    else if (t == TEMPLATE_VALUE_PARAMETER) {
      r = TemplateValueParameter(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = ThrowStatement(b, 0);
    }
    else if (t == TRAITS_ARGUMENTS) {
      r = TraitsArguments(b, 0);
    }
    else if (t == TRAITS_EXPRESSION) {
      r = TraitsExpression(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = TryStatement(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == TYPE_CISI) {
      r = TypeCISI(b, 0);
    }
    else if (t == TYPE_CTOR) {
      r = TypeCtor(b, 0);
    }
    else if (t == TYPE_CTORS) {
      r = TypeCtors(b, 0);
    }
    else if (t == TYPE_SPECIALIZATION) {
      r = TypeSpecialization(b, 0);
    }
    else if (t == TYPEID_EXPRESSION) {
      r = TypeidExpression(b, 0);
    }
    else if (t == TYPEOF) {
      r = Typeof(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = UnaryExpression(b, 0);
    }
    else if (t == UNION_DECLARATION) {
      r = UnionDeclaration(b, 0);
    }
    else if (t == UNION_TEMPLATE_DECLARATION) {
      r = UnionTemplateDeclaration(b, 0);
    }
    else if (t == UNIT_TEST) {
      r = UnitTest(b, 0);
    }
    else if (t == USER_DEFINED_ATTRIBUTE) {
      r = UserDefinedAttribute(b, 0);
    }
    else if (t == VERSION_CONDITION) {
      r = VersionCondition(b, 0);
    }
    else if (t == VERSION_SPECIFICATION) {
      r = VersionSpecification(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else if (t == WITH_STATEMENT) {
      r = WithStatement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return dLangFile(b, l + 1);
  }

  /* ********************************************************** */
  // OP_BRACES_LEFT DeclDef* OP_BRACES_RIGHT
  public static boolean AggregateBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateBody")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && AggregateBody_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, AGGREGATE_BODY, r);
    return r;
  }

  // DeclDef*
  private static boolean AggregateBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AggregateBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ALIAS (StorageClass* BasicType Declarators | AliasInitializerList) OP_SCOLON
  public static boolean AliasDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && AliasDeclaration_1(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // StorageClass* BasicType Declarators | AliasInitializerList
  private static boolean AliasDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclaration_1_0(b, l + 1);
    if (!r) r = AliasInitializerList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClass* BasicType Declarators
  private static boolean AliasDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclaration_1_0_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Declarators(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClass*
  private static boolean AliasDeclaration_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_1_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StorageClass(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AliasDeclaration_1_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ID TemplateParameters? OP_EQ Type
  public static boolean AliasInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasInitializer")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && AliasInitializer_1(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Type(b, l + 1);
    exit_section_(b, m, ALIAS_INITIALIZER, r);
    return r;
  }

  // TemplateParameters?
  private static boolean AliasInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasInitializer_1")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AliasInitializer (OP_COMMA AliasInitializer)*
  public static boolean AliasInitializerList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasInitializerList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasInitializer(b, l + 1);
    r = r && AliasInitializerList_1(b, l + 1);
    exit_section_(b, m, ALIAS_INITIALIZER_LIST, r);
    return r;
  }

  // (OP_COMMA AliasInitializer)*
  private static boolean AliasInitializerList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasInitializerList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AliasInitializerList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AliasInitializerList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA AliasInitializer
  private static boolean AliasInitializerList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasInitializerList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AliasInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AliasThisDeclaration OP_SCOLON
  public static boolean AliasThis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasThis")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasThisDeclaration(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, ALIAS_THIS, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIAS ID KW_THIS
  public static boolean AliasThisDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasThisDeclaration")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ALIAS, ID, KW_THIS);
    exit_section_(b, m, ALIAS_THIS_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIGN (OP_PAR_LEFT INTEGER_LITERAL OP_PAR_RIGHT)?
  public static boolean AlignAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute")) return false;
    if (!nextTokenIs(b, KW_ALIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIGN);
    r = r && AlignAttribute_1(b, l + 1);
    exit_section_(b, m, ALIGN_ATTRIBUTE, r);
    return r;
  }

  // (OP_PAR_LEFT INTEGER_LITERAL OP_PAR_RIGHT)?
  private static boolean AlignAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute_1")) return false;
    AlignAttribute_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT INTEGER_LITERAL OP_PAR_RIGHT
  private static boolean AlignAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_PAR_LEFT, INTEGER_LITERAL, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NEW Parameters (OP_SCOLON | FunctionBody)
  public static boolean Allocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Allocator")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && Parameters(b, l + 1);
    r = r && Allocator_2(b, l + 1);
    exit_section_(b, m, ALLOCATOR, r);
    return r;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Allocator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Allocator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (OP_COMMA Expression)*
  public static boolean ArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argument list>");
    r = Expression(b, l + 1);
    r = r && ArgumentList_1(b, l + 1);
    exit_section_(b, l, m, ARGUMENT_LIST, r, false, null);
    return r;
  }

  // (OP_COMMA Expression)*
  private static boolean ArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArgumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgumentList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA Expression
  private static boolean ArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_BRACKET_LEFT (ArrayMemberInitialization (OP_COMMA ArrayMemberInitialization)* )? OP_BRACKET_RIGHT
  public static boolean ArrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArrayInitializer_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ARRAY_INITIALIZER, r);
    return r;
  }

  // (ArrayMemberInitialization (OP_COMMA ArrayMemberInitialization)* )?
  private static boolean ArrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_1")) return false;
    ArrayInitializer_1_0(b, l + 1);
    return true;
  }

  // ArrayMemberInitialization (OP_COMMA ArrayMemberInitialization)*
  private static boolean ArrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayMemberInitialization(b, l + 1);
    r = r && ArrayInitializer_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA ArrayMemberInitialization)*
  private static boolean ArrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayInitializer_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA ArrayMemberInitialization
  private static boolean ArrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ArrayMemberInitialization(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_BRACKET_LEFT ArgumentList? OP_BRACKET_RIGHT
  public static boolean ArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArrayLiteral_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  // ArgumentList?
  private static boolean ArrayLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NonVoidInitializer | Expression OP_COLON NonVoidInitializer
  public static boolean ArrayMemberInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array member initialization>");
    r = NonVoidInitializer(b, l + 1);
    if (!r) r = ArrayMemberInitialization_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_MEMBER_INITIALIZATION, r, false, null);
    return r;
  }

  // Expression OP_COLON NonVoidInitializer
  private static boolean ArrayMemberInitialization_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitialization_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && NonVoidInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ID OP_COLON)? "aaa"
  public static boolean AsmInstruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm instruction>");
    r = AsmInstruction_0(b, l + 1);
    r = r && consumeToken(b, "aaa");
    exit_section_(b, l, m, ASM_INSTRUCTION, r, false, null);
    return r;
  }

  // (ID OP_COLON)?
  private static boolean AsmInstruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_0")) return false;
    AsmInstruction_0_0(b, l + 1);
    return true;
  }

  // ID OP_COLON
  private static boolean AsmInstruction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASM OP_BRACES_LEFT (AsmInstruction (OP_SCOLON AsmInstruction)* )? OP_BRACES_RIGHT
  public static boolean AsmStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement")) return false;
    if (!nextTokenIs(b, KW_ASM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASM, OP_BRACES_LEFT);
    r = r && AsmStatement_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, ASM_STATEMENT, r);
    return r;
  }

  // (AsmInstruction (OP_SCOLON AsmInstruction)* )?
  private static boolean AsmStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_2")) return false;
    AsmStatement_2_0(b, l + 1);
    return true;
  }

  // AsmInstruction (OP_SCOLON AsmInstruction)*
  private static boolean AsmStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmInstruction(b, l + 1);
    r = r && AsmStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_SCOLON AsmInstruction)*
  private static boolean AsmStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AsmStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AsmStatement_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_SCOLON AsmInstruction
  private static boolean AsmStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    r = r && AsmInstruction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASSERT OP_PAR_LEFT Expression (OP_COMMA Expression)* OP_PAR_RIGHT
  public static boolean AssertExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression")) return false;
    if (!nextTokenIs(b, KW_ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASSERT, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && AssertExpression_3(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, ASSERT_EXPRESSION, r);
    return r;
  }

  // (OP_COMMA Expression)*
  private static boolean AssertExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssertExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssertExpression_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA Expression
  private static boolean AssertExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_BRACKET_LEFT KeyValuePair (OP_COMMA KeyValuePair)* OP_BRACKET_RIGHT
  public static boolean AssocArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssocArrayLiteral")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && KeyValuePair(b, l + 1);
    r = r && AssocArrayLiteral_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ASSOC_ARRAY_LITERAL, r);
    return r;
  }

  // (OP_COMMA KeyValuePair)*
  private static boolean AssocArrayLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssocArrayLiteral_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssocArrayLiteral_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssocArrayLiteral_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA KeyValuePair
  private static boolean AssocArrayLiteral_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssocArrayLiteral_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && KeyValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LinkageAttribute | AlignAttribute | Pragma | DeprecatedAttribute | ProtectionAttribute | Property
  //             | KW_STATIC | KW_EXTERN | KW_FINAL | KW_SYNCHRONIZED | KW_OVERRIDE
  //             | KW_ABSTRACT | KW_AUTO | KW_SCOPE | KW_CONST | KW_IMMUTABLE | KW_INOUT
  //             | KW_SHARED | KW___GSHARED
  static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinkageAttribute(b, l + 1);
    if (!r) r = AlignAttribute(b, l + 1);
    if (!r) r = Pragma(b, l + 1);
    if (!r) r = DeprecatedAttribute(b, l + 1);
    if (!r) r = ProtectionAttribute(b, l + 1);
    if (!r) r = Property(b, l + 1);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_SYNCHRONIZED);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_ABSTRACT);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW___GSHARED);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Attribute (OP_COLON | DeclarationBlock)
  public static boolean AttributeSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute specifier>");
    r = Attribute(b, l + 1);
    r = r && AttributeSpecifier_1(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTE_SPECIFIER, r, false, null);
    return r;
  }

  // OP_COLON | DeclarationBlock
  private static boolean AttributeSpecifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeSpecifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    if (!r) r = DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StorageClass+ ID TemplateParameters? OP_EQ Initializer (OP_COMMA ID TemplateParameters? OP_EQ Initializer)* OP_SCOLON
  public static boolean AutoDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<auto declaration>");
    r = AutoDeclaration_0(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && AutoDeclaration_2(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    r = r && AutoDeclaration_5(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, AUTO_DECLARATION, r, false, null);
    return r;
  }

  // StorageClass+
  private static boolean AutoDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StorageClass(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!StorageClass(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AutoDeclaration_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean AutoDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_2")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  // (OP_COMMA ID TemplateParameters? OP_EQ Initializer)*
  private static boolean AutoDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AutoDeclaration_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AutoDeclaration_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA ID TemplateParameters? OP_EQ Initializer
  private static boolean AutoDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_COMMA, ID);
    r = r && AutoDeclaration_5_0_2(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean AutoDeclaration_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_5_0_2")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_COLON (TemplateInstance|ReferenceExpression) (OP_COMMA (TemplateInstance|ReferenceExpression))*
  public static boolean BaseClassList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList")) return false;
    if (!nextTokenIs(b, OP_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && BaseClassList_1(b, l + 1);
    r = r && BaseClassList_2(b, l + 1);
    exit_section_(b, m, BASE_CLASS_LIST, r);
    return r;
  }

  // TemplateInstance|ReferenceExpression
  private static boolean BaseClassList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = ReferenceExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA (TemplateInstance|ReferenceExpression))*
  private static boolean BaseClassList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BaseClassList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BaseClassList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA (TemplateInstance|ReferenceExpression)
  private static boolean BaseClassList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && BaseClassList_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance|ReferenceExpression
  private static boolean BaseClassList_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = ReferenceExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_COLON ID (OP_COMMA ID)*
  public static boolean BaseInterfaceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseInterfaceList")) return false;
    if (!nextTokenIs(b, OP_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_COLON, ID);
    r = r && BaseInterfaceList_2(b, l + 1);
    exit_section_(b, m, BASE_INTERFACE_LIST, r);
    return r;
  }

  // (OP_COMMA ID)*
  private static boolean BaseInterfaceList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseInterfaceList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BaseInterfaceList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BaseInterfaceList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA ID
  private static boolean BaseInterfaceList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseInterfaceList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_COMMA, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BasicTypeX | OP_DOT? IdentifierList | Typeof OP_DOT IdentifierList | Typeof
  public static boolean BasicType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<basic type>");
    r = BasicTypeX(b, l + 1);
    if (!r) r = BasicType_1(b, l + 1);
    if (!r) r = BasicType_2(b, l + 1);
    if (!r) r = Typeof(b, l + 1);
    exit_section_(b, l, m, BASIC_TYPE, r, false, null);
    return r;
  }

  // OP_DOT? IdentifierList
  private static boolean BasicType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType_1_0(b, l + 1);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT?
  private static boolean BasicType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_1_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  // Typeof OP_DOT IdentifierList
  private static boolean BasicType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Typeof(b, l + 1);
    r = r && consumeToken(b, OP_DOT);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_ASTERISK | OP_BRACKET_LEFT OP_BRACKET_RIGHT | OP_BRACKET_LEFT Expression OP_BRACKET_RIGHT
  //               | OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT
  //               | OP_BRACKET_LEFT Type OP_BRACKET_RIGHT
  //               | KW_DELEGATE Parameters MemberFunctionAttributes? | KW_FUNCTION Parameters FunctionAttributes?
  public static boolean BasicType2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<basic type 2>");
    r = consumeToken(b, OP_ASTERISK);
    if (!r) r = parseTokens(b, 0, OP_BRACKET_LEFT, OP_BRACKET_RIGHT);
    if (!r) r = BasicType2_2(b, l + 1);
    if (!r) r = BasicType2_3(b, l + 1);
    if (!r) r = BasicType2_4(b, l + 1);
    if (!r) r = BasicType2_5(b, l + 1);
    if (!r) r = BasicType2_6(b, l + 1);
    exit_section_(b, l, m, BASIC_TYPE_2, r, false, null);
    return r;
  }

  // OP_BRACKET_LEFT Expression OP_BRACKET_RIGHT
  private static boolean BasicType2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT
  private static boolean BasicType2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BRACKET_LEFT Type OP_BRACKET_RIGHT
  private static boolean BasicType2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_DELEGATE Parameters MemberFunctionAttributes?
  private static boolean BasicType2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && Parameters(b, l + 1);
    r = r && BasicType2_5_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean BasicType2_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_5_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // KW_FUNCTION Parameters FunctionAttributes?
  private static boolean BasicType2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && Parameters(b, l + 1);
    r = r && BasicType2_6_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionAttributes?
  private static boolean BasicType2_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_6_2")) return false;
    FunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_BOOL | KW_BYTE | KW_UBYTE | KW_SHORT | KW_USHORT
  //               | KW_INT | KW_UINT | KW_LONG | KW_ULONG | KW_CHAR | KW_WCHAR
  //               | KW_DCHAR | KW_FLOAT | KW_DOUBLE | KW_REAL | KW_IFLOAT | KW_IDOUBLE
  //               | KW_IREAL | KW_CFLOAT | KW_CDOUBLE | KW_CREAL | KW_VOID
  public static boolean BasicTypeX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicTypeX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<basic type x>");
    r = consumeToken(b, KW_BOOL);
    if (!r) r = consumeToken(b, KW_BYTE);
    if (!r) r = consumeToken(b, KW_UBYTE);
    if (!r) r = consumeToken(b, KW_SHORT);
    if (!r) r = consumeToken(b, KW_USHORT);
    if (!r) r = consumeToken(b, KW_INT);
    if (!r) r = consumeToken(b, KW_UINT);
    if (!r) r = consumeToken(b, KW_LONG);
    if (!r) r = consumeToken(b, KW_ULONG);
    if (!r) r = consumeToken(b, KW_CHAR);
    if (!r) r = consumeToken(b, KW_WCHAR);
    if (!r) r = consumeToken(b, KW_DCHAR);
    if (!r) r = consumeToken(b, KW_FLOAT);
    if (!r) r = consumeToken(b, KW_DOUBLE);
    if (!r) r = consumeToken(b, KW_REAL);
    if (!r) r = consumeToken(b, KW_IFLOAT);
    if (!r) r = consumeToken(b, KW_IDOUBLE);
    if (!r) r = consumeToken(b, KW_IREAL);
    if (!r) r = consumeToken(b, KW_CFLOAT);
    if (!r) r = consumeToken(b, KW_CDOUBLE);
    if (!r) r = consumeToken(b, KW_CREAL);
    if (!r) r = consumeToken(b, KW_VOID);
    exit_section_(b, l, m, BASIC_TYPE_X, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_BRACES_LEFT Statement* OP_BRACES_RIGHT
  public static boolean BlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && BlockStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // Statement*
  private static boolean BlockStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockStatement_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_BODY BlockStatement
  public static boolean BodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStatement")) return false;
    if (!nextTokenIs(b, KW_BODY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BODY);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, BODY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_BREAK ID? OP_SCOLON
  public static boolean BreakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement")) return false;
    if (!nextTokenIs(b, KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BREAK);
    r = r && BreakStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  // ID?
  private static boolean BreakStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement_1")) return false;
    consumeToken(b, ID);
    return true;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT|LINE_COMMENT|NESTING_BLOCK_COMMENT
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<comment>");
    r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, NESTING_BLOCK_COMMENT);
    exit_section_(b, l, m, COMMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE Expression OP_COLON OP_DDOT KW_CASE Expression OP_COLON (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)+
  public static boolean CaseRangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseRangeStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, OP_COLON, OP_DDOT, KW_CASE);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && CaseRangeStatement_7(b, l + 1);
    exit_section_(b, m, CASE_RANGE_STATEMENT, r);
    return r;
  }

  // (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)+
  private static boolean CaseRangeStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseRangeStatement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseRangeStatement_7_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CaseRangeStatement_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseRangeStatement_7", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement
  private static boolean CaseRangeStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseRangeStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE ArgumentList OP_COLON (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)*
  public static boolean CaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && CaseStatement_3(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)*
  private static boolean CaseStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CaseStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement
  private static boolean CaseStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CAST OP_PAR_LEFT (Type | (KW_CONST | KW_CONST KW_SHARED
  //              | KW_SHARED KW_CONST | KW_INOUT | KW_INOUT KW_SHARED
  //              | KW_SHARED KW_INOUT | KW_IMMUTABLE | KW_SHARED)? ) OP_PAR_RIGHT
  public static boolean CastPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastPrefix")) return false;
    if (!nextTokenIs(b, KW_CAST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CAST, OP_PAR_LEFT);
    r = r && CastPrefix_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, CAST_PREFIX, r);
    return r;
  }

  // Type | (KW_CONST | KW_CONST KW_SHARED
  //              | KW_SHARED KW_CONST | KW_INOUT | KW_INOUT KW_SHARED
  //              | KW_SHARED KW_INOUT | KW_IMMUTABLE | KW_SHARED)?
  private static boolean CastPrefix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastPrefix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = CastPrefix_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_CONST | KW_CONST KW_SHARED
  //              | KW_SHARED KW_CONST | KW_INOUT | KW_INOUT KW_SHARED
  //              | KW_SHARED KW_INOUT | KW_IMMUTABLE | KW_SHARED)?
  private static boolean CastPrefix_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastPrefix_2_1")) return false;
    CastPrefix_2_1_0(b, l + 1);
    return true;
  }

  // KW_CONST | KW_CONST KW_SHARED
  //              | KW_SHARED KW_CONST | KW_INOUT | KW_INOUT KW_SHARED
  //              | KW_SHARED KW_INOUT | KW_IMMUTABLE | KW_SHARED
  private static boolean CastPrefix_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastPrefix_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    if (!r) r = parseTokens(b, 0, KW_CONST, KW_SHARED);
    if (!r) r = parseTokens(b, 0, KW_SHARED, KW_CONST);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = parseTokens(b, 0, KW_INOUT, KW_SHARED);
    if (!r) r = parseTokens(b, 0, KW_SHARED, KW_INOUT);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CATCH OP_PAR_LEFT BasicType ID OP_PAR_RIGHT (NonEmptyStatement | BlockStatement)
  public static boolean Catch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catch")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CATCH, OP_PAR_LEFT);
    r = r && BasicType(b, l + 1);
    r = r && consumeTokens(b, 0, ID, OP_PAR_RIGHT);
    r = r && Catch_5(b, l + 1);
    exit_section_(b, m, CATCH, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean Catch_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catch_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LastCatch | (Catch+ LastCatch?)
  public static boolean Catches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LastCatch(b, l + 1);
    if (!r) r = Catches_1(b, l + 1);
    exit_section_(b, m, CATCHES, r);
    return r;
  }

  // Catch+ LastCatch?
  private static boolean Catches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Catches_1_0(b, l + 1);
    r = r && Catches_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Catch+
  private static boolean Catches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Catch(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Catch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Catches_1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LastCatch?
  private static boolean Catches_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches_1_1")) return false;
    LastCatch(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_CLASS ComponentName (OP_SCOLON | BaseClassList? AggregateBody)
  //                      | ClassTemplateDeclaration
  public static boolean ClassDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDeclaration_0(b, l + 1);
    if (!r) r = ClassTemplateDeclaration(b, l + 1);
    exit_section_(b, m, CLASS_DECLARATION, r);
    return r;
  }

  // KW_CLASS ComponentName (OP_SCOLON | BaseClassList? AggregateBody)
  private static boolean ClassDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    r = r && ComponentName(b, l + 1);
    r = r && ClassDeclaration_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SCOLON | BaseClassList? AggregateBody
  private static boolean ClassDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = ClassDeclaration_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseClassList? AggregateBody
  private static boolean ClassDeclaration_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDeclaration_0_2_1_0(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseClassList?
  private static boolean ClassDeclaration_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0_2_1_0")) return false;
    BaseClassList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_CLASS ClassName TemplateParameters
  //     (BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList)? AggregateBody
  public static boolean ClassTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CLASS, CLASSNAME);
    r = r && TemplateParameters(b, l + 1);
    r = r && ClassTemplateDeclaration_3(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, CLASS_TEMPLATE_DECLARATION, r);
    return r;
  }

  // (BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList)?
  private static boolean ClassTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_3")) return false;
    ClassTemplateDeclaration_3_0(b, l + 1);
    return true;
  }

  // BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList
  private static boolean ClassTemplateDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassTemplateDeclaration_3_0_0(b, l + 1);
    if (!r) r = ClassTemplateDeclaration_3_0_1(b, l + 1);
    if (!r) r = Constraint(b, l + 1);
    if (!r) r = BaseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseClassList Constraint
  private static boolean ClassTemplateDeclaration_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BaseClassList(b, l + 1);
    r = r && Constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Constraint BaseClassList
  private static boolean ClassTemplateDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constraint(b, l + 1);
    r = r && BaseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (OP_COMMA Expression)*
  public static boolean CommaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<comma expression>");
    r = Expression(b, l + 1);
    r = r && CommaExpression_1(b, l + 1);
    exit_section_(b, l, m, COMMA_EXPRESSION, r, false, null);
    return r;
  }

  // (OP_COMMA Expression)*
  private static boolean CommaExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CommaExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommaExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA Expression
  private static boolean CommaExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean ComponentName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, COMPONENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // VersionCondition | DebugCondition | StaticIfCondition
  public static boolean Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<condition>");
    r = VersionCondition(b, l + 1);
    if (!r) r = DebugCondition(b, l + 1);
    if (!r) r = StaticIfCondition(b, l + 1);
    exit_section_(b, l, m, CONDITION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Condition ( DeclarationBlock KW_ELSE OP_COLON DeclDef* | DeclarationBlock KW_ELSE DeclarationBlock | DeclarationBlock | OP_COLON DeclDef*)
  public static boolean ConditionalDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conditional declaration>");
    r = Condition(b, l + 1);
    r = r && ConditionalDeclaration_1(b, l + 1);
    exit_section_(b, l, m, CONDITIONAL_DECLARATION, r, false, null);
    return r;
  }

  // DeclarationBlock KW_ELSE OP_COLON DeclDef* | DeclarationBlock KW_ELSE DeclarationBlock | DeclarationBlock | OP_COLON DeclDef*
  private static boolean ConditionalDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalDeclaration_1_0(b, l + 1);
    if (!r) r = ConditionalDeclaration_1_1(b, l + 1);
    if (!r) r = DeclarationBlock(b, l + 1);
    if (!r) r = ConditionalDeclaration_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclarationBlock KW_ELSE OP_COLON DeclDef*
  private static boolean ConditionalDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclarationBlock(b, l + 1);
    r = r && consumeTokens(b, 0, KW_ELSE, OP_COLON);
    r = r && ConditionalDeclaration_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDef*
  private static boolean ConditionalDeclaration_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionalDeclaration_1_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DeclarationBlock KW_ELSE DeclarationBlock
  private static boolean ConditionalDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclarationBlock(b, l + 1);
    r = r && consumeToken(b, KW_ELSE);
    r = r && DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_COLON DeclDef*
  private static boolean ConditionalDeclaration_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && ConditionalDeclaration_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDef*
  private static boolean ConditionalDeclaration_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionalDeclaration_1_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Condition (NonEmptyStatement | BlockStatement) (KW_ELSE (NonEmptyStatement | BlockStatement))?
  public static boolean ConditionalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conditional statement>");
    r = Condition(b, l + 1);
    r = r && ConditionalStatement_1(b, l + 1);
    r = r && ConditionalStatement_2(b, l + 1);
    exit_section_(b, l, m, CONDITIONAL_STATEMENT, r, false, null);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean ConditionalStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_ELSE (NonEmptyStatement | BlockStatement))?
  private static boolean ConditionalStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2")) return false;
    ConditionalStatement_2_0(b, l + 1);
    return true;
  }

  // KW_ELSE (NonEmptyStatement | BlockStatement)
  private static boolean ConditionalStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && ConditionalStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean ConditionalStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IF OP_PAR_LEFT Expression OP_PAR_RIGHT
  public static boolean Constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constraint")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IF, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS Parameters MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  //                 | ConstructorTemplate
  public static boolean Constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constructor_0(b, l + 1);
    if (!r) r = ConstructorTemplate(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR, r);
    return r;
  }

  // KW_THIS Parameters MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  private static boolean Constructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && Parameters(b, l + 1);
    r = r && Constructor_0_2(b, l + 1);
    r = r && Constructor_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Constructor_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_0_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Constructor_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS TemplateParameters Parameters MemberFunctionAttributes? Constraint? (OP_COLON | FunctionBody)
  public static boolean ConstructorTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && TemplateParameters(b, l + 1);
    r = r && Parameters(b, l + 1);
    r = r && ConstructorTemplate_3(b, l + 1);
    r = r && ConstructorTemplate_4(b, l + 1);
    r = r && ConstructorTemplate_5(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR_TEMPLATE, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean ConstructorTemplate_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_3")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean ConstructorTemplate_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_4")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // OP_COLON | FunctionBody
  private static boolean ConstructorTemplate_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONTINUE ID? OP_SCOLON
  public static boolean ContinueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement")) return false;
    if (!nextTokenIs(b, KW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONTINUE);
    r = r && ContinueStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  // ID?
  private static boolean ContinueStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement_1")) return false;
    consumeToken(b, ID);
    return true;
  }

  /* ********************************************************** */
  // KW_DELETE Parameters (OP_SCOLON | FunctionBody)
  public static boolean Deallocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deallocator")) return false;
    if (!nextTokenIs(b, KW_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELETE);
    r = r && Parameters(b, l + 1);
    r = r && Deallocator_2(b, l + 1);
    exit_section_(b, m, DEALLOCATOR, r);
    return r;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Deallocator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deallocator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEBUG (OP_PAR_LEFT (INTEGER_LITERAL | ID) OP_PAR_RIGHT)?
  public static boolean DebugCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEBUG);
    r = r && DebugCondition_1(b, l + 1);
    exit_section_(b, m, DEBUG_CONDITION, r);
    return r;
  }

  // (OP_PAR_LEFT (INTEGER_LITERAL | ID) OP_PAR_RIGHT)?
  private static boolean DebugCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1")) return false;
    DebugCondition_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT (INTEGER_LITERAL | ID) OP_PAR_RIGHT
  private static boolean DebugCondition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && DebugCondition_1_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // INTEGER_LITERAL | ID
  private static boolean DebugCondition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEBUG OP_EQ (ID | INTEGER_LITERAL) OP_SCOLON
  public static boolean DebugSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugSpecification")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEBUG, OP_EQ);
    r = r && DebugSpecification_2(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, DEBUG_SPECIFICATION, r);
    return r;
  }

  // ID | INTEGER_LITERAL
  private static boolean DebugSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (TypeCISI | StorageClass* BasicType) Declarators (OP_SCOLON | FunctionBody) | AutoDeclaration
  public static boolean Decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decl>");
    r = Decl_0(b, l + 1);
    if (!r) r = AutoDeclaration(b, l + 1);
    exit_section_(b, l, m, DECL, r, false, null);
    return r;
  }

  // (TypeCISI | StorageClass* BasicType) Declarators (OP_SCOLON | FunctionBody)
  private static boolean Decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Decl_0_0(b, l + 1);
    r = r && Declarators(b, l + 1);
    r = r && Decl_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCISI | StorageClass* BasicType
  private static boolean Decl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeCISI(b, l + 1);
    if (!r) r = Decl_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClass* BasicType
  private static boolean Decl_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Decl_0_0_1_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClass*
  private static boolean Decl_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_0_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StorageClass(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Decl_0_0_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Decl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decl_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttributeSpecifier | Declaration | Constructor | Destructor | Postblit | Allocator | Deallocator
  // | Invariant | AliasThis | StaticConstructor | StaticDestructor | SharedStaticConstructor | SharedStaticDestructor
  // | ConditionalDeclaration | DebugSpecification | VersionSpecification | StaticAssert | MixinDeclaration
  // | TemplateDeclaration | TemplateMixinDeclaration | TemplateMixin | UnitTest | OP_SCOLON
  public static boolean DeclDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decl def>");
    r = AttributeSpecifier(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = Constructor(b, l + 1);
    if (!r) r = Destructor(b, l + 1);
    if (!r) r = Postblit(b, l + 1);
    if (!r) r = Allocator(b, l + 1);
    if (!r) r = Deallocator(b, l + 1);
    if (!r) r = Invariant(b, l + 1);
    if (!r) r = AliasThis(b, l + 1);
    if (!r) r = StaticConstructor(b, l + 1);
    if (!r) r = StaticDestructor(b, l + 1);
    if (!r) r = SharedStaticConstructor(b, l + 1);
    if (!r) r = SharedStaticDestructor(b, l + 1);
    if (!r) r = ConditionalDeclaration(b, l + 1);
    if (!r) r = DebugSpecification(b, l + 1);
    if (!r) r = VersionSpecification(b, l + 1);
    if (!r) r = StaticAssert(b, l + 1);
    if (!r) r = MixinDeclaration(b, l + 1);
    if (!r) r = TemplateDeclaration(b, l + 1);
    if (!r) r = TemplateMixinDeclaration(b, l + 1);
    if (!r) r = TemplateMixin(b, l + 1);
    if (!r) r = UnitTest(b, l + 1);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, DECL_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AliasDeclaration | AliasThisDeclaration | ImportDeclaration | StructDeclaration
  //                | ClassDeclaration | InterfaceDeclaration | EnumDeclaration | UnionDeclaration | Decl
  public static boolean Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = AliasDeclaration(b, l + 1);
    if (!r) r = AliasThisDeclaration(b, l + 1);
    if (!r) r = ImportDeclaration(b, l + 1);
    if (!r) r = StructDeclaration(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = UnionDeclaration(b, l + 1);
    if (!r) r = Decl(b, l + 1);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DeclDef | OP_BRACES_LEFT DeclDef* OP_BRACES_RIGHT
  public static boolean DeclarationBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration block>");
    r = DeclDef(b, l + 1);
    if (!r) r = DeclarationBlock_1(b, l + 1);
    exit_section_(b, l, m, DECLARATION_BLOCK, r, false, null);
    return r;
  }

  // OP_BRACES_LEFT DeclDef* OP_BRACES_RIGHT
  private static boolean DeclarationBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && DeclarationBlock_1_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDef*
  private static boolean DeclarationBlock_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclarationBlock_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BasicType2* ( OP_PAR_LEFT Declarator OP_PAR_RIGHT | ID) DeclaratorSuffixes?
  public static boolean Declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<declarator>");
    r = Declarator_0(b, l + 1);
    r = r && Declarator_1(b, l + 1);
    r = r && Declarator_2(b, l + 1);
    exit_section_(b, l, m, DECLARATOR, r, false, null);
    return r;
  }

  // BasicType2*
  private static boolean Declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BasicType2(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Declarator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_PAR_LEFT Declarator OP_PAR_RIGHT | ID
  private static boolean Declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Declarator_1_0(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT Declarator OP_PAR_RIGHT
  private static boolean Declarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Declarator(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclaratorSuffixes?
  private static boolean Declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator_2")) return false;
    DeclaratorSuffixes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BasicType2* (OP_PAR_LEFT Declarator2 OP_PAR_RIGHT)? DeclaratorSuffixes?
  public static boolean Declarator2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<declarator 2>");
    r = Declarator2_0(b, l + 1);
    r = r && Declarator2_1(b, l + 1);
    r = r && Declarator2_2(b, l + 1);
    exit_section_(b, l, m, DECLARATOR_2, r, false, null);
    return r;
  }

  // BasicType2*
  private static boolean Declarator2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator2_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BasicType2(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Declarator2_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (OP_PAR_LEFT Declarator2 OP_PAR_RIGHT)?
  private static boolean Declarator2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator2_1")) return false;
    Declarator2_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT Declarator2 OP_PAR_RIGHT
  private static boolean Declarator2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Declarator2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclaratorSuffixes?
  private static boolean Declarator2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator2_2")) return false;
    DeclaratorSuffixes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID (TemplateParameters? OP_EQ Initializer)?
  public static boolean DeclaratorIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && DeclaratorIdentifier_1(b, l + 1);
    exit_section_(b, m, DECLARATOR_IDENTIFIER, r);
    return r;
  }

  // (TemplateParameters? OP_EQ Initializer)?
  private static boolean DeclaratorIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifier_1")) return false;
    DeclaratorIdentifier_1_0(b, l + 1);
    return true;
  }

  // TemplateParameters? OP_EQ Initializer
  private static boolean DeclaratorIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclaratorIdentifier_1_0_0(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean DeclaratorIdentifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifier_1_0_0")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DeclaratorIdentifier (OP_COMMA DeclaratorIdentifier)*
  public static boolean DeclaratorIdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclaratorIdentifier(b, l + 1);
    r = r && DeclaratorIdentifierList_1(b, l + 1);
    exit_section_(b, m, DECLARATOR_IDENTIFIER_LIST, r);
    return r;
  }

  // (OP_COMMA DeclaratorIdentifier)*
  private static boolean DeclaratorIdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclaratorIdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclaratorIdentifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA DeclaratorIdentifier
  private static boolean DeclaratorIdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && DeclaratorIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Declarator (TemplateParameters? OP_EQ Initializer)?
  public static boolean DeclaratorInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declarator initializer>");
    r = Declarator(b, l + 1);
    r = r && DeclaratorInitializer_1(b, l + 1);
    exit_section_(b, l, m, DECLARATOR_INITIALIZER, r, false, null);
    return r;
  }

  // (TemplateParameters? OP_EQ Initializer)?
  private static boolean DeclaratorInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1")) return false;
    DeclaratorInitializer_1_0(b, l + 1);
    return true;
  }

  // TemplateParameters? OP_EQ Initializer
  private static boolean DeclaratorInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclaratorInitializer_1_0_0(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean DeclaratorInitializer_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1_0_0")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_BRACKET_LEFT OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT (Expression | Type) OP_BRACKET_RIGHT //TODO: Use AssignExpression here
  //                     | TemplateParameters Parameters MemberFunctionAttributes? Constraint?
  //                     | Parameters MemberFunctionAttributes?
  public static boolean DeclaratorSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix")) return false;
    if (!nextTokenIs(b, "<declarator suffix>", OP_BRACKET_LEFT, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declarator suffix>");
    r = parseTokens(b, 0, OP_BRACKET_LEFT, OP_BRACKET_RIGHT);
    if (!r) r = DeclaratorSuffix_1(b, l + 1);
    if (!r) r = DeclaratorSuffix_2(b, l + 1);
    if (!r) r = DeclaratorSuffix_3(b, l + 1);
    exit_section_(b, l, m, DECLARATOR_SUFFIX, r, false, null);
    return r;
  }

  // OP_BRACKET_LEFT (Expression | Type) OP_BRACKET_RIGHT
  private static boolean DeclaratorSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && DeclaratorSuffix_1_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | Type
  private static boolean DeclaratorSuffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters Parameters MemberFunctionAttributes? Constraint?
  private static boolean DeclaratorSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateParameters(b, l + 1);
    r = r && Parameters(b, l + 1);
    r = r && DeclaratorSuffix_2_2(b, l + 1);
    r = r && DeclaratorSuffix_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean DeclaratorSuffix_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_2_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean DeclaratorSuffix_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_2_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // Parameters MemberFunctionAttributes?
  private static boolean DeclaratorSuffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && DeclaratorSuffix_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean DeclaratorSuffix_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffix_3_1")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DeclaratorSuffix+
  static boolean DeclaratorSuffixes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorSuffixes")) return false;
    if (!nextTokenIs(b, "", OP_BRACKET_LEFT, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclaratorSuffix(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!DeclaratorSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclaratorSuffixes", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DeclaratorInitializer (OP_COMMA DeclaratorIdentifierList)?
  public static boolean Declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declarators>");
    r = DeclaratorInitializer(b, l + 1);
    r = r && Declarators_1(b, l + 1);
    exit_section_(b, l, m, DECLARATORS, r, false, Declarators_recover_parser_);
    return r;
  }

  // (OP_COMMA DeclaratorIdentifierList)?
  private static boolean Declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_1")) return false;
    Declarators_1_0(b, l + 1);
    return true;
  }

  // OP_COMMA DeclaratorIdentifierList
  private static boolean Declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && DeclaratorIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(OP_SCOLON | OP_BRACES_LEFT)
  static boolean Declarators_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !Declarators_recover_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // OP_SCOLON | OP_BRACES_LEFT
  private static boolean Declarators_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = consumeToken(b, OP_BRACES_LEFT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression | KW___FILE__ | KW___MODULE__ | KW___LINE__| KW___FUNCTION__
  //                                 | KW___PRETTY_FUNCTION__
  public static boolean DefaultInitializerExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultInitializerExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<default initializer expression>");
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    exit_section_(b, l, m, DEFAULT_INITIALIZER_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_DEFAULT OP_COLON (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)+
  public static boolean DefaultStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultStatement")) return false;
    if (!nextTokenIs(b, KW_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEFAULT, OP_COLON);
    r = r && DefaultStatement_2(b, l + 1);
    exit_section_(b, m, DEFAULT_STATEMENT, r);
    return r;
  }

  // (OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement)+
  private static boolean DefaultStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DefaultStatement_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!DefaultStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DefaultStatement_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SCOLON | NonEmptyStatementNoCaseNoDefault | BlockStatement
  private static boolean DefaultStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEPRECATED (OP_PAR_LEFT STRING OP_PAR_RIGHT) ?
  public static boolean DeprecatedAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute")) return false;
    if (!nextTokenIs(b, KW_DEPRECATED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEPRECATED);
    r = r && DeprecatedAttribute_1(b, l + 1);
    exit_section_(b, m, DEPRECATED_ATTRIBUTE, r);
    return r;
  }

  // (OP_PAR_LEFT STRING OP_PAR_RIGHT) ?
  private static boolean DeprecatedAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute_1")) return false;
    DeprecatedAttribute_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT STRING OP_PAR_RIGHT
  private static boolean DeprecatedAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && STRING(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_TILDA KW_THIS OP_PAR_LEFT OP_PAR_RIGHT MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  public static boolean Destructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor")) return false;
    if (!nextTokenIs(b, OP_TILDA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && Destructor_4(b, l + 1);
    r = r && Destructor_5(b, l + 1);
    exit_section_(b, m, DESTRUCTOR, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Destructor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Destructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DO ScopeStatement KW_WHILE OP_PAR_LEFT Expression OP_PAR_RIGHT OP_SCOLON
  public static boolean DoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoStatement")) return false;
    if (!nextTokenIs(b, KW_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DO);
    r = r && ScopeStatement(b, l + 1);
    r = r && consumeTokens(b, 0, KW_WHILE, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_SCOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // OP_SCOLON | OP_BRACES_LEFT EnumMember (OP_COMMA EnumMember)* OP_COMMA? OP_BRACES_RIGHT
  public static boolean EnumBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody")) return false;
    if (!nextTokenIs(b, "<enum body>", OP_BRACES_LEFT, OP_SCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum body>");
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = EnumBody_1(b, l + 1);
    exit_section_(b, l, m, ENUM_BODY, r, false, null);
    return r;
  }

  // OP_BRACES_LEFT EnumMember (OP_COMMA EnumMember)* OP_COMMA? OP_BRACES_RIGHT
  private static boolean EnumBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && EnumMember(b, l + 1);
    r = r && EnumBody_1_2(b, l + 1);
    r = r && EnumBody_1_3(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA EnumMember)*
  private static boolean EnumBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumBody_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumBody_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA EnumMember
  private static boolean EnumBody_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && EnumMember(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_COMMA?
  private static boolean EnumBody_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_1_3")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_ENUM ID? (OP_COLON Type)? EnumBody
  public static boolean EnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && EnumDeclaration_1(b, l + 1);
    r = r && EnumDeclaration_2(b, l + 1);
    r = r && EnumBody(b, l + 1);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // ID?
  private static boolean EnumDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_1")) return false;
    consumeToken(b, ID);
    return true;
  }

  // (OP_COLON Type)?
  private static boolean EnumDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_2")) return false;
    EnumDeclaration_2_0(b, l + 1);
    return true;
  }

  // OP_COLON Type
  private static boolean EnumDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type ID OP_EQ Expression | ID OP_EQ Expression | ID
  public static boolean EnumMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum member>");
    r = EnumMember_0(b, l + 1);
    if (!r) r = EnumMember_1(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, l, m, ENUM_MEMBER, r, false, null);
    return r;
  }

  // Type ID OP_EQ Expression
  private static boolean EnumMember_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && consumeTokens(b, 0, ID, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OP_EQ Expression
  private static boolean EnumMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean ExpInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<exp initializer>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, EXP_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression1 ( (OP_EQ | OP_PLUS_EQ | OP_MINUS_EQ | OP_MUL_EQ | OP_DIV_EQ | OP_MOD_EQ
  //                             | OP_AND_EQ | OP_OR_EQ | OP_XOR_EQ | OP_TILDA_EQ | OP_SH_LEFT_EQ | OP_SH_RIGHT_EQ
  //                             | OP_USH_RIGHT_EQ | OP_POW_EQ) Expression )?
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = Expression1(b, l + 1);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  // ( (OP_EQ | OP_PLUS_EQ | OP_MINUS_EQ | OP_MUL_EQ | OP_DIV_EQ | OP_MOD_EQ
  //                             | OP_AND_EQ | OP_OR_EQ | OP_XOR_EQ | OP_TILDA_EQ | OP_SH_LEFT_EQ | OP_SH_RIGHT_EQ
  //                             | OP_USH_RIGHT_EQ | OP_POW_EQ) Expression )?
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    Expression_1_0(b, l + 1);
    return true;
  }

  // (OP_EQ | OP_PLUS_EQ | OP_MINUS_EQ | OP_MUL_EQ | OP_DIV_EQ | OP_MOD_EQ
  //                             | OP_AND_EQ | OP_OR_EQ | OP_XOR_EQ | OP_TILDA_EQ | OP_SH_LEFT_EQ | OP_SH_RIGHT_EQ
  //                             | OP_USH_RIGHT_EQ | OP_POW_EQ) Expression
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_1_0_0(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ | OP_PLUS_EQ | OP_MINUS_EQ | OP_MUL_EQ | OP_DIV_EQ | OP_MOD_EQ
  //                             | OP_AND_EQ | OP_OR_EQ | OP_XOR_EQ | OP_TILDA_EQ | OP_SH_LEFT_EQ | OP_SH_RIGHT_EQ
  //                             | OP_USH_RIGHT_EQ | OP_POW_EQ
  private static boolean Expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_PLUS_EQ);
    if (!r) r = consumeToken(b, OP_MINUS_EQ);
    if (!r) r = consumeToken(b, OP_MUL_EQ);
    if (!r) r = consumeToken(b, OP_DIV_EQ);
    if (!r) r = consumeToken(b, OP_MOD_EQ);
    if (!r) r = consumeToken(b, OP_AND_EQ);
    if (!r) r = consumeToken(b, OP_OR_EQ);
    if (!r) r = consumeToken(b, OP_XOR_EQ);
    if (!r) r = consumeToken(b, OP_TILDA_EQ);
    if (!r) r = consumeToken(b, OP_SH_LEFT_EQ);
    if (!r) r = consumeToken(b, OP_SH_RIGHT_EQ);
    if (!r) r = consumeToken(b, OP_USH_RIGHT_EQ);
    if (!r) r = consumeToken(b, OP_POW_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression2 Expression1Rest?
  static boolean Expression1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression2(b, l + 1);
    r = r && Expression1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression1Rest?
  private static boolean Expression1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_1")) return false;
    Expression1Rest(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_QUEST Expression OP_COLON Expression1
  static boolean Expression1Rest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1Rest")) return false;
    if (!nextTokenIs(b, OP_QUEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUEST);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && Expression1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression Expression2Rest?
  static boolean Expression2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression(b, l + 1);
    r = r && Expression2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression2Rest?
  private static boolean Expression2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2_1")) return false;
    Expression2Rest(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( (OP_BOOL_OR | OP_BOOL_AND | OP_OR | OP_AND | OP_XOR | OP_EQ_EQ
  //                      | OP_NOT_EQ | OP_SH_RIGHT | OP_SH_LEFT | OP_USH_RIGHT | OP_LESS_EQ | OP_GT_EQ | OP_LESS | OP_GT
  //                      | OP_UNORD | OP_UNORD_EQ | OP_LESS_GR | OP_LESS_GR_EQ | OP_NOT_GR | OP_NOT_GR_EQ | OP_NOT_LESS
  //                      | OP_NOT_LESS_EQ | OP_PLUS | OP_MINUS | OP_ASTERISK | OP_DIV | OP_MOD | KW_IN
  //                      | OP_NOT KW_IN | OP_TILDA) Expression2 ) *
  static boolean Expression2Rest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2Rest")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression2Rest_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression2Rest", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (OP_BOOL_OR | OP_BOOL_AND | OP_OR | OP_AND | OP_XOR | OP_EQ_EQ
  //                      | OP_NOT_EQ | OP_SH_RIGHT | OP_SH_LEFT | OP_USH_RIGHT | OP_LESS_EQ | OP_GT_EQ | OP_LESS | OP_GT
  //                      | OP_UNORD | OP_UNORD_EQ | OP_LESS_GR | OP_LESS_GR_EQ | OP_NOT_GR | OP_NOT_GR_EQ | OP_NOT_LESS
  //                      | OP_NOT_LESS_EQ | OP_PLUS | OP_MINUS | OP_ASTERISK | OP_DIV | OP_MOD | KW_IN
  //                      | OP_NOT KW_IN | OP_TILDA) Expression2
  private static boolean Expression2Rest_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2Rest_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression2Rest_0_0(b, l + 1);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BOOL_OR | OP_BOOL_AND | OP_OR | OP_AND | OP_XOR | OP_EQ_EQ
  //                      | OP_NOT_EQ | OP_SH_RIGHT | OP_SH_LEFT | OP_USH_RIGHT | OP_LESS_EQ | OP_GT_EQ | OP_LESS | OP_GT
  //                      | OP_UNORD | OP_UNORD_EQ | OP_LESS_GR | OP_LESS_GR_EQ | OP_NOT_GR | OP_NOT_GR_EQ | OP_NOT_LESS
  //                      | OP_NOT_LESS_EQ | OP_PLUS | OP_MINUS | OP_ASTERISK | OP_DIV | OP_MOD | KW_IN
  //                      | OP_NOT KW_IN | OP_TILDA
  private static boolean Expression2Rest_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2Rest_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BOOL_OR);
    if (!r) r = consumeToken(b, OP_BOOL_AND);
    if (!r) r = consumeToken(b, OP_OR);
    if (!r) r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, OP_XOR);
    if (!r) r = consumeToken(b, OP_EQ_EQ);
    if (!r) r = consumeToken(b, OP_NOT_EQ);
    if (!r) r = consumeToken(b, OP_SH_RIGHT);
    if (!r) r = consumeToken(b, OP_SH_LEFT);
    if (!r) r = consumeToken(b, OP_USH_RIGHT);
    if (!r) r = consumeToken(b, OP_LESS_EQ);
    if (!r) r = consumeToken(b, OP_GT_EQ);
    if (!r) r = consumeToken(b, OP_LESS);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_UNORD);
    if (!r) r = consumeToken(b, OP_UNORD_EQ);
    if (!r) r = consumeToken(b, OP_LESS_GR);
    if (!r) r = consumeToken(b, OP_LESS_GR_EQ);
    if (!r) r = consumeToken(b, OP_NOT_GR);
    if (!r) r = consumeToken(b, OP_NOT_GR_EQ);
    if (!r) r = consumeToken(b, OP_NOT_LESS);
    if (!r) r = consumeToken(b, OP_NOT_LESS_EQ);
    if (!r) r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_ASTERISK);
    if (!r) r = consumeToken(b, OP_DIV);
    if (!r) r = consumeToken(b, OP_MOD);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = parseTokens(b, 0, OP_NOT, KW_IN);
    if (!r) r = consumeToken(b, OP_TILDA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FINALLY (NonEmptyStatement | BlockStatement)
  public static boolean FinallyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement")) return false;
    if (!nextTokenIs(b, KW_FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FINALLY);
    r = r && FinallyStatement_1(b, l + 1);
    exit_section_(b, m, FINALLY_STATEMENT, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean FinallyStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FOR OP_PAR_LEFT (OP_SCOLON | NonEmptyStatement | BlockStatement) Expression OP_SCOLON Expression OP_PAR_RIGHT ScopeStatement
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_FOR, OP_PAR_LEFT);
    r = r && ForStatement_2(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // OP_SCOLON | NonEmptyStatement | BlockStatement
  private static boolean ForStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_FOREACH | KW_FOREACH_REVERSE) OP_PAR_LEFT ForeachTypes OP_SCOLON Expression OP_DDOT Expression OP_PAR_RIGHT ScopeStatement
  public static boolean ForeachRangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachRangeStatement")) return false;
    if (!nextTokenIs(b, "<foreach range statement>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach range statement>");
    r = ForeachRangeStatement_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && ForeachTypes(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, l, m, FOREACH_RANGE_STATEMENT, r, false, null);
    return r;
  }

  // KW_FOREACH | KW_FOREACH_REVERSE
  private static boolean ForeachRangeStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachRangeStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, KW_FOREACH_REVERSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_FOREACH | KW_FOREACH_REVERSE) OP_PAR_LEFT ForeachTypes OP_SCOLON Expression OP_PAR_RIGHT (NonEmptyStatement | BlockStatement)
  public static boolean ForeachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement")) return false;
    if (!nextTokenIs(b, "<foreach statement>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach statement>");
    r = ForeachStatement_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && ForeachTypes(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ForeachStatement_6(b, l + 1);
    exit_section_(b, l, m, FOREACH_STATEMENT, r, false, null);
    return r;
  }

  // KW_FOREACH | KW_FOREACH_REVERSE
  private static boolean ForeachStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, KW_FOREACH_REVERSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean ForeachStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_REF? TypeCtors? (BasicType Declarator | ID)
  public static boolean ForeachType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach type>");
    r = ForeachType_0(b, l + 1);
    r = r && ForeachType_1(b, l + 1);
    r = r && ForeachType_2(b, l + 1);
    exit_section_(b, l, m, FOREACH_TYPE, r, false, null);
    return r;
  }

  // KW_REF?
  private static boolean ForeachType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_0")) return false;
    consumeToken(b, KW_REF);
    return true;
  }

  // TypeCtors?
  private static boolean ForeachType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_1")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // BasicType Declarator | ID
  private static boolean ForeachType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachType_2_0(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType Declarator
  private static boolean ForeachType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ForeachType (OP_COMMA ForeachType)*
  public static boolean ForeachTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach types>");
    r = ForeachType(b, l + 1);
    r = r && ForeachTypes_1(b, l + 1);
    exit_section_(b, l, m, FOREACH_TYPES, r, false, null);
    return r;
  }

  // (OP_COMMA ForeachType)*
  private static boolean ForeachTypes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ForeachTypes_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeachTypes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA ForeachType
  private static boolean ForeachTypes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ForeachType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NOTHROW | KW_PURE | Property
  public static boolean FunctionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function attribute>");
    r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = Property(b, l + 1);
    exit_section_(b, l, m, FUNCTION_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionAttribute+
  public static boolean FunctionAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function attributes>");
    r = FunctionAttribute(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!FunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionAttributes", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, FUNCTION_ATTRIBUTES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BlockStatement | (InStatement OutStatement | OutStatement InStatement | InStatement | OutStatement)? BodyStatement
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function body>");
    r = BlockStatement(b, l + 1);
    if (!r) r = FunctionBody_1(b, l + 1);
    exit_section_(b, l, m, FUNCTION_BODY, r, false, null);
    return r;
  }

  // (InStatement OutStatement | OutStatement InStatement | InStatement | OutStatement)? BodyStatement
  private static boolean FunctionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody_1_0(b, l + 1);
    r = r && BodyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (InStatement OutStatement | OutStatement InStatement | InStatement | OutStatement)?
  private static boolean FunctionBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1_0")) return false;
    FunctionBody_1_0_0(b, l + 1);
    return true;
  }

  // InStatement OutStatement | OutStatement InStatement | InStatement | OutStatement
  private static boolean FunctionBody_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody_1_0_0_0(b, l + 1);
    if (!r) r = FunctionBody_1_0_0_1(b, l + 1);
    if (!r) r = InStatement(b, l + 1);
    if (!r) r = OutStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InStatement OutStatement
  private static boolean FunctionBody_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InStatement(b, l + 1);
    r = r && OutStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OutStatement InStatement
  private static boolean FunctionBody_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OutStatement(b, l + 1);
    r = r && InStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FUNCTION Type? ParameterAttributes? FunctionBody
  //                     | KW_DELEGATE Type? ParameterAttributes? FunctionBody
  //                     | ParameterAttributes FunctionBody
  //                     | FunctionBody
  public static boolean FunctionLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function literal>");
    r = FunctionLiteral_0(b, l + 1);
    if (!r) r = FunctionLiteral_1(b, l + 1);
    if (!r) r = FunctionLiteral_2(b, l + 1);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, l, m, FUNCTION_LITERAL, r, false, null);
    return r;
  }

  // KW_FUNCTION Type? ParameterAttributes? FunctionBody
  private static boolean FunctionLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && FunctionLiteral_0_1(b, l + 1);
    r = r && FunctionLiteral_0_2(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean FunctionLiteral_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ParameterAttributes?
  private static boolean FunctionLiteral_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0_2")) return false;
    ParameterAttributes(b, l + 1);
    return true;
  }

  // KW_DELEGATE Type? ParameterAttributes? FunctionBody
  private static boolean FunctionLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && FunctionLiteral_1_1(b, l + 1);
    r = r && FunctionLiteral_1_2(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean FunctionLiteral_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ParameterAttributes?
  private static boolean FunctionLiteral_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1_2")) return false;
    ParameterAttributes(b, l + 1);
    return true;
  }

  // ParameterAttributes FunctionBody
  private static boolean FunctionLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterAttributes(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_GOTO (ID | KW_DEFAULT | KW_CASE Expression?) OP_SCOLON
  public static boolean GotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement")) return false;
    if (!nextTokenIs(b, KW_GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GOTO);
    r = r && GotoStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  // ID | KW_DEFAULT | KW_CASE Expression?
  private static boolean GotoStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, KW_DEFAULT);
    if (!r) r = GotoStatement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CASE Expression?
  private static boolean GotoStatement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && GotoStatement_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean GotoStatement_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_1_2_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (TemplateInstance | ID) (OP_DOT (TemplateInstance | ID))*
  public static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierList_0(b, l + 1);
    r = r && IdentifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // TemplateInstance | ID
  private static boolean IdentifierList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_DOT (TemplateInstance | ID))*
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!IdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IdentifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_DOT (TemplateInstance | ID)
  private static boolean IdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && IdentifierList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance | ID
  private static boolean IdentifierList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression | KW_AUTO ID OP_EQ Expression
  //               | TypeCtors ID OP_EQ Expression
  //               | TypeCtors? BasicType ID OP_EQ Expression
  public static boolean IfCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<if condition>");
    r = Expression(b, l + 1);
    if (!r) r = IfCondition_1(b, l + 1);
    if (!r) r = IfCondition_2(b, l + 1);
    if (!r) r = IfCondition_3(b, l + 1);
    exit_section_(b, l, m, IF_CONDITION, r, false, null);
    return r;
  }

  // KW_AUTO ID OP_EQ Expression
  private static boolean IfCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AUTO, ID, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors ID OP_EQ Expression
  private static boolean IfCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeCtors(b, l + 1);
    r = r && consumeTokens(b, 0, ID, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors? BasicType ID OP_EQ Expression
  private static boolean IfCondition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfCondition_3_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && consumeTokens(b, 0, ID, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean IfCondition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_3_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_IF OP_PAR_LEFT IfCondition OP_PAR_RIGHT ScopeStatement (KW_ELSE ScopeStatement)?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IF, OP_PAR_LEFT);
    r = r && IfCondition(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    r = r && IfStatement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // (KW_ELSE ScopeStatement)?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    IfStatement_5_0(b, l + 1);
    return true;
  }

  // KW_ELSE ScopeStatement
  private static boolean IfStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ID OP_EQ)? ModuleFullyQualifiedName
  public static boolean Import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Import_0(b, l + 1);
    r = r && ModuleFullyQualifiedName(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  // (ID OP_EQ)?
  private static boolean Import_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import_0")) return false;
    Import_0_0(b, l + 1);
    return true;
  }

  // ID OP_EQ
  private static boolean Import_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ID OP_EQ)? ID
  public static boolean ImportBind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportBind_0(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, IMPORT_BIND, r);
    return r;
  }

  // (ID OP_EQ)?
  private static boolean ImportBind_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind_0")) return false;
    ImportBind_0_0(b, l + 1);
    return true;
  }

  // ID OP_EQ
  private static boolean ImportBind_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Import OP_COLON ImportBind (OP_COMMA ImportBind)*
  public static boolean ImportBindings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindings")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Import(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && ImportBind(b, l + 1);
    r = r && ImportBindings_3(b, l + 1);
    exit_section_(b, m, IMPORT_BINDINGS, r);
    return r;
  }

  // (OP_COMMA ImportBind)*
  private static boolean ImportBindings_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindings_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportBindings_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportBindings_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA ImportBind
  private static boolean ImportBindings_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindings_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ImportBind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC? KW_IMPORT ImportList OP_SCOLON
  public static boolean ImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration")) return false;
    if (!nextTokenIs(b, "<import declaration>", KW_IMPORT, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import declaration>");
    r = ImportDeclaration_0(b, l + 1);
    r = r && consumeToken(b, KW_IMPORT);
    r = r && ImportList(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, IMPORT_DECLARATION, r, false, null);
    return r;
  }

  // KW_STATIC?
  private static boolean ImportDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_0")) return false;
    consumeToken(b, KW_STATIC);
    return true;
  }

  /* ********************************************************** */
  // KW_IMPORT OP_PAR_LEFT Expression OP_PAR_RIGHT
  public static boolean ImportExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportExpression")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IMPORT, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, IMPORT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // (ImportBindings | Import) (OP_COMMA (ImportBindings | Import))*
  public static boolean ImportList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportList_0(b, l + 1);
    r = r && ImportList_1(b, l + 1);
    exit_section_(b, m, IMPORT_LIST, r);
    return r;
  }

  // ImportBindings | Import
  private static boolean ImportList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportBindings(b, l + 1);
    if (!r) r = Import(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA (ImportBindings | Import))*
  private static boolean ImportList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA (ImportBindings | Import)
  private static boolean ImportList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ImportList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ImportBindings | Import
  private static boolean ImportList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportBindings(b, l + 1);
    if (!r) r = Import(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_AUTO | TypeCtor | KW_FINAL | KW_IN | KW_LAZY | KW_OUT | KW_REF | KW_SCOPE
  public static boolean InOutX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InOutX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<in out x>");
    r = consumeToken(b, KW_AUTO);
    if (!r) r = TypeCtor(b, l + 1);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_LAZY);
    if (!r) r = consumeToken(b, KW_OUT);
    if (!r) r = consumeToken(b, KW_REF);
    if (!r) r = consumeToken(b, KW_SCOPE);
    exit_section_(b, l, m, IN_OUT_X, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_IN BlockStatement
  public static boolean InStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InStatement")) return false;
    if (!nextTokenIs(b, KW_IN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IN);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, IN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VOID | NonVoidInitializer
  public static boolean Initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initializer>");
    r = consumeToken(b, KW_VOID);
    if (!r) r = NonVoidInitializer(b, l + 1);
    exit_section_(b, l, m, INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_INTERFACE ID (OP_SCOLON | BaseInterfaceList? AggregateBody)
  //                          | InterfaceTemplateDeclaration
  public static boolean InterfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceDeclaration_0(b, l + 1);
    if (!r) r = InterfaceTemplateDeclaration(b, l + 1);
    exit_section_(b, m, INTERFACE_DECLARATION, r);
    return r;
  }

  // KW_INTERFACE ID (OP_SCOLON | BaseInterfaceList? AggregateBody)
  private static boolean InterfaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INTERFACE, ID);
    r = r && InterfaceDeclaration_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SCOLON | BaseInterfaceList? AggregateBody
  private static boolean InterfaceDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = InterfaceDeclaration_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseInterfaceList? AggregateBody
  private static boolean InterfaceDeclaration_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceDeclaration_0_2_1_0(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseInterfaceList?
  private static boolean InterfaceDeclaration_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0_2_1_0")) return false;
    BaseInterfaceList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_INTERFACE ID TemplateParameters
  //     (BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList)? AggregateBody
  public static boolean InterfaceTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INTERFACE, ID);
    r = r && TemplateParameters(b, l + 1);
    r = r && InterfaceTemplateDeclaration_3(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, INTERFACE_TEMPLATE_DECLARATION, r);
    return r;
  }

  // (BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList)?
  private static boolean InterfaceTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_3")) return false;
    InterfaceTemplateDeclaration_3_0(b, l + 1);
    return true;
  }

  // BaseClassList Constraint | Constraint BaseClassList | Constraint | BaseClassList
  private static boolean InterfaceTemplateDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceTemplateDeclaration_3_0_0(b, l + 1);
    if (!r) r = InterfaceTemplateDeclaration_3_0_1(b, l + 1);
    if (!r) r = Constraint(b, l + 1);
    if (!r) r = BaseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseClassList Constraint
  private static boolean InterfaceTemplateDeclaration_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BaseClassList(b, l + 1);
    r = r && Constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Constraint BaseClassList
  private static boolean InterfaceTemplateDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constraint(b, l + 1);
    r = r && BaseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_INVARIANT OP_PAR_LEFT OP_PAR_RIGHT BlockStatement
  public static boolean Invariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invariant")) return false;
    if (!nextTokenIs(b, KW_INVARIANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INVARIANT, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, INVARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IS OP_PAR_LEFT Type (
  //                  OP_COLON TypeSpecialization
  //                | OP_EQ_EQ TypeSpecialization
  //                | ID
  //                | ID OP_COLON TypeSpecialization (OP_COMMA TemplateParameterList)?
  //                | ID OP_EQ_EQ TypeSpecialization (OP_COMMA TemplateParameterList)? ) OP_PAR_RIGHT
  public static boolean IsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression")) return false;
    if (!nextTokenIs(b, KW_IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IS, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && IsExpression_3(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, IS_EXPRESSION, r);
    return r;
  }

  // OP_COLON TypeSpecialization
  //                | OP_EQ_EQ TypeSpecialization
  //                | ID
  //                | ID OP_COLON TypeSpecialization (OP_COMMA TemplateParameterList)?
  //                | ID OP_EQ_EQ TypeSpecialization (OP_COMMA TemplateParameterList)?
  private static boolean IsExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IsExpression_3_0(b, l + 1);
    if (!r) r = IsExpression_3_1(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    if (!r) r = IsExpression_3_3(b, l + 1);
    if (!r) r = IsExpression_3_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_COLON TypeSpecialization
  private static boolean IsExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ_EQ TypeSpecialization
  private static boolean IsExpression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OP_COLON TypeSpecialization (OP_COMMA TemplateParameterList)?
  private static boolean IsExpression_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    r = r && IsExpression_3_3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA TemplateParameterList)?
  private static boolean IsExpression_3_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_3_3")) return false;
    IsExpression_3_3_3_0(b, l + 1);
    return true;
  }

  // OP_COMMA TemplateParameterList
  private static boolean IsExpression_3_3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_3_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OP_EQ_EQ TypeSpecialization (OP_COMMA TemplateParameterList)?
  private static boolean IsExpression_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    r = r && IsExpression_3_4_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA TemplateParameterList)?
  private static boolean IsExpression_3_4_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_4_3")) return false;
    IsExpression_3_4_3_0(b, l + 1);
    return true;
  }

  // OP_COMMA TemplateParameterList
  private static boolean IsExpression_3_4_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_3_4_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression OP_COLON Expression
  public static boolean KeyValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValuePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<key value pair>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, KEY_VALUE_PAIR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID OP_LAMBDA_ARROW Expression
  //            | (KW_FUNCTION|KW_DELEGATE)? ParameterAttributes OP_LAMBDA_ARROW Expression
  public static boolean Lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda>");
    r = Lambda_0(b, l + 1);
    if (!r) r = Lambda_1(b, l + 1);
    exit_section_(b, l, m, LAMBDA, r, false, null);
    return r;
  }

  // ID OP_LAMBDA_ARROW Expression
  private static boolean Lambda_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_LAMBDA_ARROW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_FUNCTION|KW_DELEGATE)? ParameterAttributes OP_LAMBDA_ARROW Expression
  private static boolean Lambda_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Lambda_1_0(b, l + 1);
    r = r && ParameterAttributes(b, l + 1);
    r = r && consumeToken(b, OP_LAMBDA_ARROW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_FUNCTION|KW_DELEGATE)?
  private static boolean Lambda_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0")) return false;
    Lambda_1_0_0(b, l + 1);
    return true;
  }

  // KW_FUNCTION|KW_DELEGATE
  private static boolean Lambda_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    if (!r) r = consumeToken(b, KW_DELEGATE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CATCH (NonEmptyStatement | BlockStatement)
  public static boolean LastCatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastCatch")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CATCH);
    r = r && LastCatch_1(b, l + 1);
    exit_section_(b, m, LAST_CATCH, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean LastCatch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastCatch_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_EXTERN OP_PAR_LEFT
  //                      ("C" OP_PLUS_PLUS OP_COMMA IdentifierList | ("C" OP_PLUS_PLUS | "C" | "D" | "Windows" | "Pascal" | "System"))
  //                      OP_PAR_RIGHT
  public static boolean LinkageAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute")) return false;
    if (!nextTokenIs(b, KW_EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXTERN, OP_PAR_LEFT);
    r = r && LinkageAttribute_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, LINKAGE_ATTRIBUTE, r);
    return r;
  }

  // "C" OP_PLUS_PLUS OP_COMMA IdentifierList | ("C" OP_PLUS_PLUS | "C" | "D" | "Windows" | "Pascal" | "System")
  private static boolean LinkageAttribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinkageAttribute_2_0(b, l + 1);
    if (!r) r = LinkageAttribute_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "C" OP_PLUS_PLUS OP_COMMA IdentifierList
  private static boolean LinkageAttribute_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "C");
    r = r && consumeTokens(b, 0, OP_PLUS_PLUS, OP_COMMA);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "C" OP_PLUS_PLUS | "C" | "D" | "Windows" | "Pascal" | "System"
  private static boolean LinkageAttribute_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinkageAttribute_2_1_0(b, l + 1);
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "Windows");
    if (!r) r = consumeToken(b, "Pascal");
    if (!r) r = consumeToken(b, "System");
    exit_section_(b, m, null, r);
    return r;
  }

  // "C" OP_PLUS_PLUS
  private static boolean LinkageAttribute_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "C");
    r = r && consumeToken(b, OP_PLUS_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT | FunctionAttribute)+
  public static boolean MemberFunctionAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberFunctionAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member function attributes>");
    r = MemberFunctionAttributes_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MemberFunctionAttributes_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MemberFunctionAttributes", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, MEMBER_FUNCTION_ATTRIBUTES, r, false, null);
    return r;
  }

  // KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT | FunctionAttribute
  private static boolean MemberFunctionAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberFunctionAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = FunctionAttribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MixinStatement OP_SCOLON
  public static boolean MixinDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MixinStatement(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, MIXIN_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MIXIN OP_PAR_LEFT Expression OP_PAR_RIGHT
  public static boolean MixinStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinStatement")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, MIXIN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // OP_DOT QualifiedIdentifierList | Typeof OP_DOT QualifiedIdentifierList | QualifiedIdentifierList
  public static boolean MixinTemplateName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<mixin template name>");
    r = MixinTemplateName_0(b, l + 1);
    if (!r) r = MixinTemplateName_1(b, l + 1);
    if (!r) r = QualifiedIdentifierList(b, l + 1);
    exit_section_(b, l, m, MIXIN_TEMPLATE_NAME, r, false, null);
    return r;
  }

  // OP_DOT QualifiedIdentifierList
  private static boolean MixinTemplateName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && QualifiedIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Typeof OP_DOT QualifiedIdentifierList
  private static boolean MixinTemplateName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Typeof(b, l + 1);
    r = r && consumeToken(b, OP_DOT);
    r = r && QualifiedIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MODULE ModuleFullyQualifiedName OP_SCOLON
  public static boolean ModuleDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDeclaration")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODULE);
    r = r && ModuleFullyQualifiedName(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, MODULE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // (ID OP_DOT)* ID
  public static boolean ModuleFullyQualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleFullyQualifiedName_0(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, MODULE_FULLY_QUALIFIED_NAME, r);
    return r;
  }

  // (ID OP_DOT)*
  private static boolean ModuleFullyQualifiedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ModuleFullyQualifiedName_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleFullyQualifiedName_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ID OP_DOT
  private static boolean ModuleFullyQualifiedName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NEW (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)? Type
  public static boolean NewExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && NewExpression_1(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION, r);
    return r;
  }

  // (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)?
  private static boolean NewExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_1")) return false;
    NewExpression_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean NewExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NEW (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)? Type
  //                          (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT | OP_BRACKET_LEFT Expression OP_BRACKET_RIGHT)
  public static boolean NewExpressionWithArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && NewExpressionWithArgs_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && NewExpressionWithArgs_3(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION_WITH_ARGS, r);
    return r;
  }

  // (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)?
  private static boolean NewExpressionWithArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1")) return false;
    NewExpressionWithArgs_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean NewExpressionWithArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT | OP_BRACKET_LEFT Expression OP_BRACKET_RIGHT
  private static boolean NewExpressionWithArgs_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewExpressionWithArgs_3_0(b, l + 1);
    if (!r) r = NewExpressionWithArgs_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean NewExpressionWithArgs_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BRACKET_LEFT Expression OP_BRACKET_RIGHT
  private static boolean NewExpressionWithArgs_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NonEmptyStatementNoCaseNoDefault | CaseStatement | CaseRangeStatement | DefaultStatement
  static boolean NonEmptyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = CaseStatement(b, l + 1);
    if (!r) r = CaseRangeStatement(b, l + 1);
    if (!r) r = DefaultStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ID OP_COLON Expression) | Expression OP_SCOLON | Declaration
  //                                     | IfStatement | WhileStatement | DoStatement | ForStatement | ForeachStatement
  //                                     | SwitchStatement | ContinueStatement | BreakStatement | ReturnStatement
  //                                     | GotoStatement | WithStatement | SynchronizedStatement | TryStatement
  //                                     | ScopeGuardStatement | ThrowStatement | AsmStatement | PragmaStatement
  //                                     | MixinStatement | ForeachRangeStatement | ConditionalStatement | StaticAssert
  //                                     | TemplateMixin | ImportDeclaration
  static boolean NonEmptyStatementNoCaseNoDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatementNoCaseNoDefault")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatementNoCaseNoDefault_0(b, l + 1);
    if (!r) r = NonEmptyStatementNoCaseNoDefault_1(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = SwitchStatement(b, l + 1);
    if (!r) r = ContinueStatement(b, l + 1);
    if (!r) r = BreakStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = GotoStatement(b, l + 1);
    if (!r) r = WithStatement(b, l + 1);
    if (!r) r = SynchronizedStatement(b, l + 1);
    if (!r) r = TryStatement(b, l + 1);
    if (!r) r = ScopeGuardStatement(b, l + 1);
    if (!r) r = ThrowStatement(b, l + 1);
    if (!r) r = AsmStatement(b, l + 1);
    if (!r) r = PragmaStatement(b, l + 1);
    if (!r) r = MixinStatement(b, l + 1);
    if (!r) r = ForeachRangeStatement(b, l + 1);
    if (!r) r = ConditionalStatement(b, l + 1);
    if (!r) r = StaticAssert(b, l + 1);
    if (!r) r = TemplateMixin(b, l + 1);
    if (!r) r = ImportDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OP_COLON Expression
  private static boolean NonEmptyStatementNoCaseNoDefault_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatementNoCaseNoDefault_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression OP_SCOLON
  private static boolean NonEmptyStatementNoCaseNoDefault_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatementNoCaseNoDefault_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ExpInitializer | ArrayInitializer | StructInitializer
  static boolean NonVoidInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonVoidInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpInitializer(b, l + 1);
    if (!r) r = ArrayInitializer(b, l + 1);
    if (!r) r = StructInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_OUT (OP_PAR_LEFT ID OP_PAR_RIGHT)? BlockStatement
  public static boolean OutStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement")) return false;
    if (!nextTokenIs(b, KW_OUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_OUT);
    r = r && OutStatement_1(b, l + 1);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, OUT_STATEMENT, r);
    return r;
  }

  // (OP_PAR_LEFT ID OP_PAR_RIGHT)?
  private static boolean OutStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement_1")) return false;
    OutStatement_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT ID OP_PAR_RIGHT
  private static boolean OutStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_PAR_LEFT, ID, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InOutX* (BasicType Declarator (OP_TRIPLEDOT | OP_EQ DefaultInitializerExpression)? | Type OP_TRIPLEDOT? )
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter>");
    r = Parameter_0(b, l + 1);
    r = r && Parameter_1(b, l + 1);
    exit_section_(b, l, m, PARAMETER, r, false, null);
    return r;
  }

  // InOutX*
  private static boolean Parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InOutX(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Parameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // BasicType Declarator (OP_TRIPLEDOT | OP_EQ DefaultInitializerExpression)? | Type OP_TRIPLEDOT?
  private static boolean Parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_1_0(b, l + 1);
    if (!r) r = Parameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType Declarator (OP_TRIPLEDOT | OP_EQ DefaultInitializerExpression)?
  private static boolean Parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && Parameter_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_TRIPLEDOT | OP_EQ DefaultInitializerExpression)?
  private static boolean Parameter_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_0_2")) return false;
    Parameter_1_0_2_0(b, l + 1);
    return true;
  }

  // OP_TRIPLEDOT | OP_EQ DefaultInitializerExpression
  private static boolean Parameter_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TRIPLEDOT);
    if (!r) r = Parameter_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ DefaultInitializerExpression
  private static boolean Parameter_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_0_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && DefaultInitializerExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type OP_TRIPLEDOT?
  private static boolean Parameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && Parameter_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_TRIPLEDOT?
  private static boolean Parameter_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_1_1")) return false;
    consumeToken(b, OP_TRIPLEDOT);
    return true;
  }

  /* ********************************************************** */
  // Parameters FunctionAttributes?
  static boolean ParameterAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterAttributes")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && ParameterAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionAttributes?
  private static boolean ParameterAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterAttributes_1")) return false;
    FunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_PAR_LEFT ( Parameter (OP_COMMA Parameter)* )? OP_PAR_RIGHT
  public static boolean Parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Parameters_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // ( Parameter (OP_COMMA Parameter)* )?
  private static boolean Parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1")) return false;
    Parameters_1_0(b, l + 1);
    return true;
  }

  // Parameter (OP_COMMA Parameter)*
  private static boolean Parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter(b, l + 1);
    r = r && Parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA Parameter)*
  private static boolean Parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Parameters_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA Parameter
  private static boolean Parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS OP_PAR_LEFT KW_THIS OP_PAR_RIGHT MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  public static boolean Postblit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_THIS, OP_PAR_LEFT, KW_THIS, OP_PAR_RIGHT);
    r = r && Postblit_4(b, l + 1);
    r = r && Postblit_5(b, l + 1);
    exit_section_(b, m, POSTBLIT, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Postblit_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean Postblit_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PrimaryExpression
  //                     | TypeCtors? BasicType OP_PAR_LEFT OP_PAR_RIGHT
  //                     | TypeCtors? BasicType OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)
  //                      (OP_DOT TemplateInstance
  //                     | OP_DOT ID
  //                     | OP_DOT NewExpression
  //                     | OP_PLUS_PLUS | OP_MINUS_MINUS
  //                     | OP_PAR_LEFT OP_PAR_RIGHT
  //                     | OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  //                     | OP_BRACKET_LEFT ArgumentList OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT)*
  static boolean PostfixExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression_0(b, l + 1);
    r = r && PostfixExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrimaryExpression
  //                     | TypeCtors? BasicType OP_PAR_LEFT OP_PAR_RIGHT
  //                     | TypeCtors? BasicType OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean PostfixExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpression(b, l + 1);
    if (!r) r = PostfixExpression_0_1(b, l + 1);
    if (!r) r = PostfixExpression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors? BasicType OP_PAR_LEFT OP_PAR_RIGHT
  private static boolean PostfixExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression_0_1_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_LEFT, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean PostfixExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_0_1_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // TypeCtors? BasicType OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean PostfixExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression_0_2_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean PostfixExpression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_0_2_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // (OP_DOT TemplateInstance
  //                     | OP_DOT ID
  //                     | OP_DOT NewExpression
  //                     | OP_PLUS_PLUS | OP_MINUS_MINUS
  //                     | OP_PAR_LEFT OP_PAR_RIGHT
  //                     | OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  //                     | OP_BRACKET_LEFT ArgumentList OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT)*
  private static boolean PostfixExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PostfixExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PostfixExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_DOT TemplateInstance
  //                     | OP_DOT ID
  //                     | OP_DOT NewExpression
  //                     | OP_PLUS_PLUS | OP_MINUS_MINUS
  //                     | OP_PAR_LEFT OP_PAR_RIGHT
  //                     | OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  //                     | OP_BRACKET_LEFT ArgumentList OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT OP_BRACKET_RIGHT
  //                     | OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT
  private static boolean PostfixExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression_1_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, OP_DOT, ID);
    if (!r) r = PostfixExpression_1_0_2(b, l + 1);
    if (!r) r = consumeToken(b, OP_PLUS_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS_MINUS);
    if (!r) r = parseTokens(b, 0, OP_PAR_LEFT, OP_PAR_RIGHT);
    if (!r) r = PostfixExpression_1_0_6(b, l + 1);
    if (!r) r = PostfixExpression_1_0_7(b, l + 1);
    if (!r) r = parseTokens(b, 0, OP_BRACKET_LEFT, OP_BRACKET_RIGHT);
    if (!r) r = PostfixExpression_1_0_9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT TemplateInstance
  private static boolean PostfixExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT NewExpression
  private static boolean PostfixExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && NewExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean PostfixExpression_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BRACKET_LEFT ArgumentList OP_BRACKET_RIGHT
  private static boolean PostfixExpression_1_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BRACKET_LEFT Expression OP_DDOT Expression OP_BRACKET_RIGHT
  private static boolean PostfixExpression_1_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_0_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PRAGMA OP_PAR_LEFT ID (OP_COMMA ArgumentList)? OP_PAR_RIGHT
  public static boolean Pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_PRAGMA, OP_PAR_LEFT, ID);
    r = r && Pragma_3(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, PRAGMA, r);
    return r;
  }

  // (OP_COMMA ArgumentList)?
  private static boolean Pragma_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma_3")) return false;
    Pragma_3_0(b, l + 1);
    return true;
  }

  // OP_COMMA ArgumentList
  private static boolean Pragma_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ArgumentList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Pragma (OP_SCOLON | NonEmptyStatement | BlockStatement)
  public static boolean PragmaStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaStatement")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pragma(b, l + 1);
    r = r && PragmaStatement_1(b, l + 1);
    exit_section_(b, m, PRAGMA_STATEMENT, r);
    return r;
  }

  // OP_SCOLON | NonEmptyStatement | BlockStatement
  private static boolean PragmaStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_DOT TemplateInstance | TemplateInstance | OP_DOT? ID  | KW_THIS | KW_SUPER
  //                      | KW_NULL | KW_TRUE | KW_FALSE | OP_DOLLAR | KW___FILE__ | KW___MODULE__ | KW___FUNCTION__
  //                      | KW___PRETTY_FUNCTION__ | INTEGER_LITERAL | FLOAT_LITERAL | CHARACTER_LITERAL
  //                      | STRING | ArrayLiteral | AssocArrayLiteral | FunctionLiteral | Lambda | AssertExpression
  //                      | MixinStatement | ImportExpression | NewExpression | NewExpressionWithArgs
  //                      | BasicType OP_DOT ID | Typeof | TypeidExpression | IsExpression | TraitsExpression
  //                      | OP_PAR_LEFT Expression OP_PAR_RIGHT
  static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpression_0(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    if (!r) r = PrimaryExpression_2(b, l + 1);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, OP_DOLLAR);
    if (!r) r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = STRING(b, l + 1);
    if (!r) r = ArrayLiteral(b, l + 1);
    if (!r) r = AssocArrayLiteral(b, l + 1);
    if (!r) r = FunctionLiteral(b, l + 1);
    if (!r) r = Lambda(b, l + 1);
    if (!r) r = AssertExpression(b, l + 1);
    if (!r) r = MixinStatement(b, l + 1);
    if (!r) r = ImportExpression(b, l + 1);
    if (!r) r = NewExpression(b, l + 1);
    if (!r) r = NewExpressionWithArgs(b, l + 1);
    if (!r) r = PrimaryExpression_26(b, l + 1);
    if (!r) r = Typeof(b, l + 1);
    if (!r) r = TypeidExpression(b, l + 1);
    if (!r) r = IsExpression(b, l + 1);
    if (!r) r = TraitsExpression(b, l + 1);
    if (!r) r = PrimaryExpression_31(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT TemplateInstance
  private static boolean PrimaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT? ID
  private static boolean PrimaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpression_2_0(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT?
  private static boolean PrimaryExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_2_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  // BasicType OP_DOT ID
  private static boolean PrimaryExpression_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_26")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && consumeTokens(b, 0, OP_DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT Expression OP_PAR_RIGHT
  private static boolean PrimaryExpression_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_31")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_AT (KW_PROPERTY | KW_SAFE | KW_TRUSTED | KW_SYSTEM | KW_DISABLE | KW_NOGC)
  //              | UserDefinedAttribute
  public static boolean Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Property_0(b, l + 1);
    if (!r) r = UserDefinedAttribute(b, l + 1);
    exit_section_(b, m, PROPERTY, r);
    return r;
  }

  // OP_AT (KW_PROPERTY | KW_SAFE | KW_TRUSTED | KW_SYSTEM | KW_DISABLE | KW_NOGC)
  private static boolean Property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && Property_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PROPERTY | KW_SAFE | KW_TRUSTED | KW_SYSTEM | KW_DISABLE | KW_NOGC
  private static boolean Property_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PROPERTY);
    if (!r) r = consumeToken(b, KW_SAFE);
    if (!r) r = consumeToken(b, KW_TRUSTED);
    if (!r) r = consumeToken(b, KW_SYSTEM);
    if (!r) r = consumeToken(b, KW_DISABLE);
    if (!r) r = consumeToken(b, KW_NOGC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PRIVATE | KW_PACKAGE | KW_PROTECTED | KW_PUBLIC | KW_EXPORT
  public static boolean ProtectionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtectionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<protection attribute>");
    r = consumeToken(b, KW_PRIVATE);
    if (!r) r = consumeToken(b, KW_PACKAGE);
    if (!r) r = consumeToken(b, KW_PROTECTED);
    if (!r) r = consumeToken(b, KW_PUBLIC);
    if (!r) r = consumeToken(b, KW_EXPORT);
    exit_section_(b, l, m, PROTECTION_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID | (ID | TemplateInstance) (OP_DOT (ID|TemplateInstance))+
  public static boolean QualifiedIdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = QualifiedIdentifierList_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_IDENTIFIER_LIST, r);
    return r;
  }

  // (ID | TemplateInstance) (OP_DOT (ID|TemplateInstance))+
  private static boolean QualifiedIdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifierList_1_0(b, l + 1);
    r = r && QualifiedIdentifierList_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID | TemplateInstance
  private static boolean QualifiedIdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_DOT (ID|TemplateInstance))+
  private static boolean QualifiedIdentifierList_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifierList_1_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!QualifiedIdentifierList_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedIdentifierList_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_DOT (ID|TemplateInstance)
  private static boolean QualifiedIdentifierList_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && QualifiedIdentifierList_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID|TemplateInstance
  private static boolean QualifiedIdentifierList_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean ReferenceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceExpression")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, REFERENCE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RETURN Expression? OP_SCOLON
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // Expression?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WYSIWYG_STRING|ALTERNATE_WYSIWYG_STRING|DOUBLE_QUOTED_STRING|HEX_STRING|DELIMITED_STRING
  public static boolean STRING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<string>");
    r = consumeToken(b, WYSIWYG_STRING);
    if (!r) r = consumeToken(b, ALTERNATE_WYSIWYG_STRING);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, HEX_STRING);
    if (!r) r = consumeToken(b, DELIMITED_STRING);
    exit_section_(b, l, m, STRING, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_SCOPE OP_PAR_LEFT ("exit" | "success" | "failure") OP_PAR_RIGHT (NonEmptyStatement | BlockStatement)
  public static boolean ScopeGuardStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeGuardStatement")) return false;
    if (!nextTokenIs(b, KW_SCOPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SCOPE, OP_PAR_LEFT);
    r = r && ScopeGuardStatement_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeGuardStatement_4(b, l + 1);
    exit_section_(b, m, SCOPE_GUARD_STATEMENT, r);
    return r;
  }

  // "exit" | "success" | "failure"
  private static boolean ScopeGuardStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeGuardStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "exit");
    if (!r) r = consumeToken(b, "success");
    if (!r) r = consumeToken(b, "failure");
    exit_section_(b, m, null, r);
    return r;
  }

  // NonEmptyStatement | BlockStatement
  private static boolean ScopeGuardStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeGuardStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NonEmptyStatement | BlockStatement
  public static boolean ScopeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<scope statement>");
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, l, m, SCOPE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_SHARED KW_STATIC KW_THIS OP_PAR_LEFT OP_PAR_RIGHT (OP_SCOLON | FunctionBody)
  public static boolean SharedStaticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticConstructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SHARED, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && SharedStaticConstructor_5(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_CONSTRUCTOR, r);
    return r;
  }

  // OP_SCOLON | FunctionBody
  private static boolean SharedStaticConstructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticConstructor_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SHARED KW_STATIC OP_TILDA KW_THIS OP_PAR_LEFT OP_PAR_RIGHT MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  public static boolean SharedStaticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SHARED, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && SharedStaticDestructor_6(b, l + 1);
    r = r && SharedStaticDestructor_7(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_DESTRUCTOR, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean SharedStaticDestructor_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_6")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean SharedStaticDestructor_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW___FILE__ | KW___MODULE__ | KW___LINE__| KW___FUNCTION__ | KW___PRETTY_FUNCTION__
  public static boolean SpecialKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<special keyword>");
    r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    exit_section_(b, l, m, SPECIAL_KEYWORD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_SCOLON | NonEmptyStatement | BlockStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement>");
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, l, m, STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC KW_ASSERT OP_PAR_LEFT Expression (OP_COMMA Expression)? OP_PAR_RIGHT OP_SCOLON
  public static boolean StaticAssert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, KW_ASSERT, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && StaticAssert_4(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_SCOLON);
    exit_section_(b, m, STATIC_ASSERT, r);
    return r;
  }

  // (OP_COMMA Expression)?
  private static boolean StaticAssert_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert_4")) return false;
    StaticAssert_4_0(b, l + 1);
    return true;
  }

  // OP_COMMA Expression
  private static boolean StaticAssert_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC KW_THIS OP_PAR_LEFT OP_PAR_RIGHT (OP_SCOLON | FunctionBody)
  public static boolean StaticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticConstructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && StaticConstructor_4(b, l + 1);
    exit_section_(b, m, STATIC_CONSTRUCTOR, r);
    return r;
  }

  // OP_SCOLON | FunctionBody
  private static boolean StaticConstructor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticConstructor_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC OP_TILDA KW_THIS OP_PAR_LEFT OP_PAR_RIGHT MemberFunctionAttributes? (OP_SCOLON | FunctionBody)
  public static boolean StaticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && StaticDestructor_5(b, l + 1);
    r = r && StaticDestructor_6(b, l + 1);
    exit_section_(b, m, STATIC_DESTRUCTOR, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean StaticDestructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_5")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // OP_SCOLON | FunctionBody
  private static boolean StaticDestructor_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC KW_IF OP_PAR_LEFT Expression OP_PAR_RIGHT
  public static boolean StaticIfCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticIfCondition")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, KW_IF, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, STATIC_IF_CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ABSTRACT | KW_AUTO | KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT | KW_DEPRECATED
  //                  | KW_ENUM | LinkageAttribute | Property | KW_EXTERN | KW_FINAL | KW_NOTHROW
  //                  | KW_OVERRIDE | KW_PURE | KW___GSHARED | KW_SCOPE | KW_STATIC | KW_SYNCHRONIZED | KW_REF
  public static boolean StorageClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StorageClass")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<storage class>");
    r = consumeToken(b, KW_ABSTRACT);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_DEPRECATED);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = LinkageAttribute(b, l + 1);
    if (!r) r = Property(b, l + 1);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = consumeToken(b, KW___GSHARED);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_SYNCHRONIZED);
    if (!r) r = consumeToken(b, KW_REF);
    exit_section_(b, l, m, STORAGE_CLASS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_STRUCT (ID AggregateBody | ID OP_SCOLON | AggregateBody)
  //                       | StructTemplateDeclaration
  public static boolean StructDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration")) return false;
    if (!nextTokenIs(b, KW_STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructDeclaration_0(b, l + 1);
    if (!r) r = StructTemplateDeclaration(b, l + 1);
    exit_section_(b, m, STRUCT_DECLARATION, r);
    return r;
  }

  // KW_STRUCT (ID AggregateBody | ID OP_SCOLON | AggregateBody)
  private static boolean StructDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_STRUCT);
    r = r && StructDeclaration_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID AggregateBody | ID OP_SCOLON | AggregateBody
  private static boolean StructDeclaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructDeclaration_0_1_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, ID, OP_SCOLON);
    if (!r) r = AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID AggregateBody
  private static boolean StructDeclaration_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_BRACES_LEFT (StructMemberInitializer (OP_COMMA StructMemberInitializer)* )? OP_BRACES_RIGHT
  public static boolean StructInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && StructInitializer_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, STRUCT_INITIALIZER, r);
    return r;
  }

  // (StructMemberInitializer (OP_COMMA StructMemberInitializer)* )?
  private static boolean StructInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_1")) return false;
    StructInitializer_1_0(b, l + 1);
    return true;
  }

  // StructMemberInitializer (OP_COMMA StructMemberInitializer)*
  private static boolean StructInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructMemberInitializer(b, l + 1);
    r = r && StructInitializer_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA StructMemberInitializer)*
  private static boolean StructInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StructInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructInitializer_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA StructMemberInitializer
  private static boolean StructInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && StructMemberInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NonVoidInitializer | ID OP_COLON NonVoidInitializer
  public static boolean StructMemberInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct member initializer>");
    r = NonVoidInitializer(b, l + 1);
    if (!r) r = StructMemberInitializer_1(b, l + 1);
    exit_section_(b, l, m, STRUCT_MEMBER_INITIALIZER, r, false, null);
    return r;
  }

  // ID OP_COLON NonVoidInitializer
  private static boolean StructMemberInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_COLON);
    r = r && NonVoidInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STRUCT ID TemplateParameters Constraint? AggregateBody
  public static boolean StructTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STRUCT, ID);
    r = r && TemplateParameters(b, l + 1);
    r = r && StructTemplateDeclaration_3(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, STRUCT_TEMPLATE_DECLARATION, r);
    return r;
  }

  // Constraint?
  private static boolean StructTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructTemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_FINAL? KW_SWITCH OP_PAR_LEFT Expression OP_PAR_RIGHT ScopeStatement
  public static boolean SwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement")) return false;
    if (!nextTokenIs(b, "<switch statement>", KW_FINAL, KW_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch statement>");
    r = SwitchStatement_0(b, l + 1);
    r = r && consumeTokens(b, 0, KW_SWITCH, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, l, m, SWITCH_STATEMENT, r, false, null);
    return r;
  }

  // KW_FINAL?
  private static boolean SwitchStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_0")) return false;
    consumeToken(b, KW_FINAL);
    return true;
  }

  /* ********************************************************** */
  // OP_DOT? (TemplateInstance|ID) (OP_DOT (TemplateInstance|ID))*
  public static boolean Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol")) return false;
    if (!nextTokenIs(b, "<symbol>", ID, OP_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<symbol>");
    r = Symbol_0(b, l + 1);
    r = r && Symbol_1(b, l + 1);
    r = r && Symbol_2(b, l + 1);
    exit_section_(b, l, m, SYMBOL, r, false, null);
    return r;
  }

  // OP_DOT?
  private static boolean Symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  // TemplateInstance|ID
  private static boolean Symbol_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_DOT (TemplateInstance|ID))*
  private static boolean Symbol_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Symbol_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Symbol_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_DOT (TemplateInstance|ID)
  private static boolean Symbol_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && Symbol_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance|ID
  private static boolean Symbol_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SYNCHRONIZED (OP_PAR_LEFT Expression OP_PAR_RIGHT)? ScopeStatement
  public static boolean SynchronizedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatement")) return false;
    if (!nextTokenIs(b, KW_SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SYNCHRONIZED);
    r = r && SynchronizedStatement_1(b, l + 1);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, SYNCHRONIZED_STATEMENT, r);
    return r;
  }

  // (OP_PAR_LEFT Expression OP_PAR_RIGHT)?
  private static boolean SynchronizedStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatement_1")) return false;
    SynchronizedStatement_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT Expression OP_PAR_RIGHT
  private static boolean SynchronizedStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIAS (ID | BasicType Declarator) (OP_COLON Type|Expression)? (OP_EQ Type|Expression)?
  public static boolean TemplateAliasParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && TemplateAliasParameter_1(b, l + 1);
    r = r && TemplateAliasParameter_2(b, l + 1);
    r = r && TemplateAliasParameter_3(b, l + 1);
    exit_section_(b, m, TEMPLATE_ALIAS_PARAMETER, r);
    return r;
  }

  // ID | BasicType Declarator
  private static boolean TemplateAliasParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = TemplateAliasParameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType Declarator
  private static boolean TemplateAliasParameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COLON Type|Expression)?
  private static boolean TemplateAliasParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_2")) return false;
    TemplateAliasParameter_2_0(b, l + 1);
    return true;
  }

  // OP_COLON Type|Expression
  private static boolean TemplateAliasParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateAliasParameter_2_0_0(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_COLON Type
  private static boolean TemplateAliasParameter_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_EQ Type|Expression)?
  private static boolean TemplateAliasParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3")) return false;
    TemplateAliasParameter_3_0(b, l + 1);
    return true;
  }

  // OP_EQ Type|Expression
  private static boolean TemplateAliasParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateAliasParameter_3_0_0(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ Type
  private static boolean TemplateAliasParameter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<parseTemplateArgument>>
  public static boolean TemplateArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template argument>");
    r = parseTemplateArgument(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_NOT ( OP_PAR_LEFT (TemplateArgument (OP_COMMA TemplateArgument)* )? OP_PAR_RIGHT| TemplateSingleArgument)
  public static boolean TemplateArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments")) return false;
    if (!nextTokenIs(b, OP_NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    r = r && TemplateArguments_1(b, l + 1);
    exit_section_(b, m, TEMPLATE_ARGUMENTS, r);
    return r;
  }

  // OP_PAR_LEFT (TemplateArgument (OP_COMMA TemplateArgument)* )? OP_PAR_RIGHT| TemplateSingleArgument
  private static boolean TemplateArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateArguments_1_0(b, l + 1);
    if (!r) r = TemplateSingleArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT (TemplateArgument (OP_COMMA TemplateArgument)* )? OP_PAR_RIGHT
  private static boolean TemplateArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && TemplateArguments_1_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TemplateArgument (OP_COMMA TemplateArgument)* )?
  private static boolean TemplateArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1_0_1")) return false;
    TemplateArguments_1_0_1_0(b, l + 1);
    return true;
  }

  // TemplateArgument (OP_COMMA TemplateArgument)*
  private static boolean TemplateArguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateArgument(b, l + 1);
    r = r && TemplateArguments_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA TemplateArgument)*
  private static boolean TemplateArguments_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateArguments_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateArguments_1_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA TemplateArgument
  private static boolean TemplateArguments_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TEMPLATE ID TemplateParameters Constraint? OP_BRACES_LEFT DeclDef* OP_BRACES_RIGHT
  public static boolean TemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TEMPLATE, ID);
    r = r && TemplateParameters(b, l + 1);
    r = r && TemplateDeclaration_3(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_LEFT);
    r = r && TemplateDeclaration_5(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, TEMPLATE_DECLARATION, r);
    return r;
  }

  // Constraint?
  private static boolean TemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // DeclDef*
  private static boolean TemplateDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateDeclaration_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ID TemplateArguments
  public static boolean TemplateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateInstance")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && TemplateArguments(b, l + 1);
    exit_section_(b, m, TEMPLATE_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MIXIN MixinTemplateName TemplateArguments? ID? OP_SCOLON
  public static boolean TemplateMixin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MIXIN);
    r = r && MixinTemplateName(b, l + 1);
    r = r && TemplateMixin_2(b, l + 1);
    r = r && TemplateMixin_3(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, TEMPLATE_MIXIN, r);
    return r;
  }

  // TemplateArguments?
  private static boolean TemplateMixin_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin_2")) return false;
    TemplateArguments(b, l + 1);
    return true;
  }

  // ID?
  private static boolean TemplateMixin_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin_3")) return false;
    consumeToken(b, ID);
    return true;
  }

  /* ********************************************************** */
  // KW_MIXIN KW_TEMPLATE ID TemplateParameters Constraint? OP_BRACES_LEFT DeclDef* OP_BRACES_RIGHT
  public static boolean TemplateMixinDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, KW_TEMPLATE, ID);
    r = r && TemplateParameters(b, l + 1);
    r = r && TemplateMixinDeclaration_4(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_LEFT);
    r = r && TemplateMixinDeclaration_6(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, TEMPLATE_MIXIN_DECLARATION, r);
    return r;
  }

  // Constraint?
  private static boolean TemplateMixinDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration_4")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // DeclDef*
  private static boolean TemplateMixinDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateMixinDeclaration_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TemplateValueParameter | TemplateTupleParameter | TemplateTypeParameter
  //                     | TemplateAliasParameter | TemplateThisParameter
  public static boolean TemplateParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template parameter>");
    r = TemplateValueParameter(b, l + 1);
    if (!r) r = TemplateTupleParameter(b, l + 1);
    if (!r) r = TemplateTypeParameter(b, l + 1);
    if (!r) r = TemplateAliasParameter(b, l + 1);
    if (!r) r = TemplateThisParameter(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_PARAMETER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TemplateParameter (OP_COMMA TemplateParameter)*
  public static boolean TemplateParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template parameter list>");
    r = TemplateParameter(b, l + 1);
    r = r && TemplateParameterList_1(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_PARAMETER_LIST, r, false, null);
    return r;
  }

  // (OP_COMMA TemplateParameter)*
  private static boolean TemplateParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA TemplateParameter
  private static boolean TemplateParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_PAR_LEFT TemplateParameterList? OP_PAR_RIGHT
  static boolean TemplateParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameters")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && TemplateParameters_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameterList?
  private static boolean TemplateParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameters_1")) return false;
    TemplateParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID | BasicTypeX | CHARACTER_LITERAL | STRING | INTEGER_LITERAL | FLOAT_LITERAL
  //                          | KW_TRUE | KW_FALSE | KW_NULL | KW_THIS | SpecialKeyword
  public static boolean TemplateSingleArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateSingleArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template single argument>");
    r = consumeToken(b, ID);
    if (!r) r = BasicTypeX(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = STRING(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = SpecialKeyword(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_SINGLE_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS TemplateTypeParameter
  public static boolean TemplateThisParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateThisParameter")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && TemplateTypeParameter(b, l + 1);
    exit_section_(b, m, TEMPLATE_THIS_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // ID OP_TRIPLEDOT
  public static boolean TemplateTupleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTupleParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OP_TRIPLEDOT);
    exit_section_(b, m, TEMPLATE_TUPLE_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // ID (OP_COLON Type)? (OP_EQ Type)?
  public static boolean TemplateTypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && TemplateTypeParameter_1(b, l + 1);
    r = r && TemplateTypeParameter_2(b, l + 1);
    exit_section_(b, m, TEMPLATE_TYPE_PARAMETER, r);
    return r;
  }

  // (OP_COLON Type)?
  private static boolean TemplateTypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_1")) return false;
    TemplateTypeParameter_1_0(b, l + 1);
    return true;
  }

  // OP_COLON Type
  private static boolean TemplateTypeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_EQ Type)?
  private static boolean TemplateTypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_2")) return false;
    TemplateTypeParameter_2_0(b, l + 1);
    return true;
  }

  // OP_EQ Type
  private static boolean TemplateTypeParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BasicType Declarator (OP_COLON Expression)? (OP_EQ Expression|SpecialKeyword)?
  public static boolean TemplateValueParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template value parameter>");
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && TemplateValueParameter_2(b, l + 1);
    r = r && TemplateValueParameter_3(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_VALUE_PARAMETER, r, false, null);
    return r;
  }

  // (OP_COLON Expression)?
  private static boolean TemplateValueParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_2")) return false;
    TemplateValueParameter_2_0(b, l + 1);
    return true;
  }

  // OP_COLON Expression
  private static boolean TemplateValueParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_EQ Expression|SpecialKeyword)?
  private static boolean TemplateValueParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_3")) return false;
    TemplateValueParameter_3_0(b, l + 1);
    return true;
  }

  // OP_EQ Expression|SpecialKeyword
  private static boolean TemplateValueParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateValueParameter_3_0_0(b, l + 1);
    if (!r) r = SpecialKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ Expression
  private static boolean TemplateValueParameter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THROW Expression OP_SCOLON
  public static boolean ThrowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStatement")) return false;
    if (!nextTokenIs(b, KW_THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THROW);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (Expression | Type) (OP_COMMA (Expression | Type))*
  public static boolean TraitsArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<traits arguments>");
    r = TraitsArguments_0(b, l + 1);
    r = r && TraitsArguments_1(b, l + 1);
    exit_section_(b, l, m, TRAITS_ARGUMENTS, r, false, null);
    return r;
  }

  // Expression | Type
  private static boolean TraitsArguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_COMMA (Expression | Type))*
  private static boolean TraitsArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TraitsArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitsArguments_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_COMMA (Expression | Type)
  private static boolean TraitsArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TraitsArguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | Type
  private static boolean TraitsArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW___TRAITS OP_PAR_LEFT TRAITS_KEYWORD (OP_COMMA TraitsArguments)? OP_PAR_RIGHT
  public static boolean TraitsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression")) return false;
    if (!nextTokenIs(b, KW___TRAITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW___TRAITS, OP_PAR_LEFT, TRAITS_KEYWORD);
    r = r && TraitsExpression_3(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, TRAITS_EXPRESSION, r);
    return r;
  }

  // (OP_COMMA TraitsArguments)?
  private static boolean TraitsExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression_3")) return false;
    TraitsExpression_3_0(b, l + 1);
    return true;
  }

  // OP_COMMA TraitsArguments
  private static boolean TraitsExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TraitsArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TRY ScopeStatement (Catches FinallyStatement | Catches | FinallyStatement)
  public static boolean TryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement")) return false;
    if (!nextTokenIs(b, KW_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && ScopeStatement(b, l + 1);
    r = r && TryStatement_2(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // Catches FinallyStatement | Catches | FinallyStatement
  private static boolean TryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TryStatement_2_0(b, l + 1);
    if (!r) r = Catches(b, l + 1);
    if (!r) r = FinallyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Catches FinallyStatement
  private static boolean TryStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Catches(b, l + 1);
    r = r && FinallyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeCtors? BasicType Declarator2?
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = Type_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Type_2(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
    return r;
  }

  // TypeCtors?
  private static boolean Type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // Declarator2?
  private static boolean Type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_2")) return false;
    Declarator2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT) OP_PAR_LEFT Type OP_PAR_RIGHT
  public static boolean TypeCISI(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCISI")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type cisi>");
    r = TypeCISI_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, l, m, TYPE_CISI, r, false, null);
    return r;
  }

  // KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT
  private static boolean TypeCISI_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCISI_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_INOUT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT
  public static boolean TypeCtor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type ctor>");
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_INOUT);
    exit_section_(b, l, m, TYPE_CTOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT)+
  public static boolean TypeCtors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtors")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type ctors>");
    r = TypeCtors_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!TypeCtors_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeCtors", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, TYPE_CTORS, r, false, null);
    return r;
  }

  // KW_CONST | KW_IMMUTABLE | KW_SHARED | KW_INOUT
  private static boolean TypeCtors_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtors_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_INOUT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type | KW_STRUCT | KW_UNION | KW_CLASS | KW_INTERFACE | KW_EXTERN
  //                      | KW_FUNCTION | KW_DELEGATE | KW_SUPER | KW_CONST | KW_IMMUTABLE
  //                      | KW_INOUT | KW_SHARED | KW_RETURN | KW___PARAMETERS
  public static boolean TypeSpecialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type specialization>");
    r = Type(b, l + 1);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_UNION);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_INTERFACE);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_FUNCTION);
    if (!r) r = consumeToken(b, KW_DELEGATE);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW___PARAMETERS);
    exit_section_(b, l, m, TYPE_SPECIALIZATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPEID OP_PAR_LEFT (Type | Expression) OP_PAR_RIGHT
  public static boolean TypeidExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeidExpression")) return false;
    if (!nextTokenIs(b, KW_TYPEID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TYPEID, OP_PAR_LEFT);
    r = r && TypeidExpression_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, TYPEID_EXPRESSION, r);
    return r;
  }

  // Type | Expression
  private static boolean TypeidExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeidExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPEOF OP_PAR_LEFT ( Expression | KW_RETURN | KW_SUPER | KW_THIS) OP_PAR_RIGHT
  public static boolean Typeof(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Typeof")) return false;
    if (!nextTokenIs(b, KW_TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TYPEOF, OP_PAR_LEFT);
    r = r && Typeof_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, TYPEOF, r);
    return r;
  }

  // Expression | KW_RETURN | KW_SUPER | KW_THIS
  private static boolean Typeof_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Typeof_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_THIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OP_AND | OP_PLUS_PLUS | OP_MINUS_MINUS | OP_ASTERISK | OP_MINUS | OP_PLUS | OP_NOT | OP_TILDA
  //                    | KW_DELETE | CastPrefix) *
  //                    (OP_PAR_LEFT Type OP_PAR_RIGHT OP_DOT (TemplateInstance|ID) | PostfixExpression)
  //                    (OP_POW UnaryExpression)?
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    r = r && UnaryExpression_1(b, l + 1);
    r = r && UnaryExpression_2(b, l + 1);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, false, null);
    return r;
  }

  // (OP_AND | OP_PLUS_PLUS | OP_MINUS_MINUS | OP_ASTERISK | OP_MINUS | OP_PLUS | OP_NOT | OP_TILDA
  //                    | KW_DELETE | CastPrefix) *
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UnaryExpression_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OP_AND | OP_PLUS_PLUS | OP_MINUS_MINUS | OP_ASTERISK | OP_MINUS | OP_PLUS | OP_NOT | OP_TILDA
  //                    | KW_DELETE | CastPrefix
  private static boolean UnaryExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, OP_PLUS_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS_MINUS);
    if (!r) r = consumeToken(b, OP_ASTERISK);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_TILDA);
    if (!r) r = consumeToken(b, KW_DELETE);
    if (!r) r = CastPrefix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT Type OP_PAR_RIGHT OP_DOT (TemplateInstance|ID) | PostfixExpression
  private static boolean UnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_1_0(b, l + 1);
    if (!r) r = PostfixExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PAR_LEFT Type OP_PAR_RIGHT OP_DOT (TemplateInstance|ID)
  private static boolean UnaryExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_DOT);
    r = r && UnaryExpression_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance|ID
  private static boolean UnaryExpression_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_POW UnaryExpression)?
  private static boolean UnaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2")) return false;
    UnaryExpression_2_0(b, l + 1);
    return true;
  }

  // OP_POW UnaryExpression
  private static boolean UnaryExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_POW);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_UNION (ID AggregateBody | ID OP_SCOLON | AggregateBody)
  //                      | UnionTemplateDeclaration
  public static boolean UnionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionDeclaration_0(b, l + 1);
    if (!r) r = UnionTemplateDeclaration(b, l + 1);
    exit_section_(b, m, UNION_DECLARATION, r);
    return r;
  }

  // KW_UNION (ID AggregateBody | ID OP_SCOLON | AggregateBody)
  private static boolean UnionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNION);
    r = r && UnionDeclaration_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID AggregateBody | ID OP_SCOLON | AggregateBody
  private static boolean UnionDeclaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionDeclaration_0_1_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, ID, OP_SCOLON);
    if (!r) r = AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID AggregateBody
  private static boolean UnionDeclaration_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_UNION ID TemplateParameters Constraint? AggregateBody
  public static boolean UnionTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_UNION, ID);
    r = r && TemplateParameters(b, l + 1);
    r = r && UnionTemplateDeclaration_3(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, UNION_TEMPLATE_DECLARATION, r);
    return r;
  }

  // Constraint?
  private static boolean UnionTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionTemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_UNITTEST FunctionBody
  public static boolean UnitTest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitTest")) return false;
    if (!nextTokenIs(b, KW_UNITTEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNITTEST);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, UNIT_TEST, r);
    return r;
  }

  /* ********************************************************** */
  // OP_AT (ID (OP_PAR_LEFT ArgumentList? OP_PAR_RIGHT)? | (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT) )
  public static boolean UserDefinedAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && UserDefinedAttribute_1(b, l + 1);
    exit_section_(b, m, USER_DEFINED_ATTRIBUTE, r);
    return r;
  }

  // ID (OP_PAR_LEFT ArgumentList? OP_PAR_RIGHT)? | (OP_PAR_LEFT ArgumentList OP_PAR_RIGHT)
  private static boolean UserDefinedAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UserDefinedAttribute_1_0(b, l + 1);
    if (!r) r = UserDefinedAttribute_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID (OP_PAR_LEFT ArgumentList? OP_PAR_RIGHT)?
  private static boolean UserDefinedAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && UserDefinedAttribute_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_PAR_LEFT ArgumentList? OP_PAR_RIGHT)?
  private static boolean UserDefinedAttribute_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1_0_1")) return false;
    UserDefinedAttribute_1_0_1_0(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT ArgumentList? OP_PAR_RIGHT
  private static boolean UserDefinedAttribute_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && UserDefinedAttribute_1_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArgumentList?
  private static boolean UserDefinedAttribute_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1_0_1_0_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  // OP_PAR_LEFT ArgumentList OP_PAR_RIGHT
  private static boolean UserDefinedAttribute_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VERSION OP_PAR_LEFT (INTEGER_LITERAL | ID | KW_UNITTEST | KW_ASSERT) OP_PAR_RIGHT
  public static boolean VersionCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionCondition")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VERSION, OP_PAR_LEFT);
    r = r && VersionCondition_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, VERSION_CONDITION, r);
    return r;
  }

  // INTEGER_LITERAL | ID | KW_UNITTEST | KW_ASSERT
  private static boolean VersionCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionCondition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, KW_UNITTEST);
    if (!r) r = consumeToken(b, KW_ASSERT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VERSION OP_EQ (ID | INTEGER_LITERAL) OP_SCOLON
  public static boolean VersionSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionSpecification")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VERSION, OP_EQ);
    r = r && VersionSpecification_2(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, VERSION_SPECIFICATION, r);
    return r;
  }

  // ID | INTEGER_LITERAL
  private static boolean VersionSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHILE OP_PAR_LEFT Expression OP_PAR_RIGHT ScopeStatement
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WHILE, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WITH OP_PAR_LEFT (Expression | Symbol | TemplateInstance) OP_PAR_RIGHT ScopeStatement
  public static boolean WithStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatement")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WITH, OP_PAR_LEFT);
    r = r && WithStatement_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, WITH_STATEMENT, r);
    return r;
  }

  // Expression | Symbol | TemplateInstance
  private static boolean WithStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = Symbol(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean dLangFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dLangFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dLangFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ID
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // ModuleDeclaration | ImportDeclaration | Declaration | AttributeSpecifier | Statement | DeclDef
  //                   |COMMENT|WHITE_SPACE|KEYWORD
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDeclaration(b, l + 1);
    if (!r) r = ImportDeclaration(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = AttributeSpecifier(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = DeclDef(b, l + 1);
    if (!r) r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    if (!r) r = consumeToken(b, KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser Declarators_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Declarators_recover(b, l + 1);
    }
  };
}
