/*
* generated by Xtext
*/

package org.eclipse.xtext.graphview.style.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class GraphViewStyleGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StyleSheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StyleSheet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Keyword cStylesheetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cStylesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStylesStyleParserRuleCall_3_0 = (RuleCall)cStylesAssignment_3.eContents().get(0);
		
		//StyleSheet:
		//	imports+=Import* "stylesheet" name=QualifiedName styles+=Style*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* "stylesheet" name=QualifiedName styles+=Style*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//"stylesheet"
		public Keyword getStylesheetKeyword_1() { return cStylesheetKeyword_1; }

		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }

		//styles+=Style*
		public Assignment getStylesAssignment_3() { return cStylesAssignment_3; }

		//Style
		public RuleCall getStylesStyleParserRuleCall_3_0() { return cStylesStyleParserRuleCall_3_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedNameWithWildcard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}

	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName ("." "*")?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ("." "*")?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//("." "*")?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//"*"
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
	}

	public class StyleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Style");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStyleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMappingsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cMappingsAbstractMappingCrossReference_1_0 = (CrossReference)cMappingsAssignment_1.eContents().get(0);
		private final RuleCall cMappingsAbstractMappingQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cMappingsAbstractMappingCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMappingsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cMappingsAbstractMappingCrossReference_2_1_0 = (CrossReference)cMappingsAssignment_2_1.eContents().get(0);
		private final RuleCall cMappingsAbstractMappingQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cMappingsAbstractMappingCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cJavaClassAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cJavaClassJvmTypeReferenceParserRuleCall_3_1_0 = (RuleCall)cJavaClassAssignment_3_1.eContents().get(0);
		private final Assignment cExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExpressionXBlockExpressionParserRuleCall_4_0 = (RuleCall)cExpressionAssignment_4.eContents().get(0);
		
		//Style:
		//	"style" mappings+=[gvmapping::AbstractMapping|QualifiedName] (","
		//	mappings+=[gvmapping::AbstractMapping|QualifiedName])* // should become a crossref to a Mapping ID
		//	("as" javaClass=JvmTypeReference)? expression=XBlockExpression?;
		public ParserRule getRule() { return rule; }

		//"style" mappings+=[gvmapping::AbstractMapping|QualifiedName] ("," mappings+=[gvmapping::AbstractMapping|QualifiedName])* // should become a crossref to a Mapping ID
		//("as" javaClass=JvmTypeReference)? expression=XBlockExpression?
		public Group getGroup() { return cGroup; }

		//"style"
		public Keyword getStyleKeyword_0() { return cStyleKeyword_0; }

		//mappings+=[gvmapping::AbstractMapping|QualifiedName]
		public Assignment getMappingsAssignment_1() { return cMappingsAssignment_1; }

		//[gvmapping::AbstractMapping|QualifiedName]
		public CrossReference getMappingsAbstractMappingCrossReference_1_0() { return cMappingsAbstractMappingCrossReference_1_0; }

		//QualifiedName
		public RuleCall getMappingsAbstractMappingQualifiedNameParserRuleCall_1_0_1() { return cMappingsAbstractMappingQualifiedNameParserRuleCall_1_0_1; }

		//("," mappings+=[gvmapping::AbstractMapping|QualifiedName])*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//mappings+=[gvmapping::AbstractMapping|QualifiedName]
		public Assignment getMappingsAssignment_2_1() { return cMappingsAssignment_2_1; }

		//[gvmapping::AbstractMapping|QualifiedName]
		public CrossReference getMappingsAbstractMappingCrossReference_2_1_0() { return cMappingsAbstractMappingCrossReference_2_1_0; }

		//QualifiedName
		public RuleCall getMappingsAbstractMappingQualifiedNameParserRuleCall_2_1_0_1() { return cMappingsAbstractMappingQualifiedNameParserRuleCall_2_1_0_1; }

		//("as" javaClass=JvmTypeReference)?
		public Group getGroup_3() { return cGroup_3; }

		//"as"
		public Keyword getAsKeyword_3_0() { return cAsKeyword_3_0; }

		//javaClass=JvmTypeReference
		public Assignment getJavaClassAssignment_3_1() { return cJavaClassAssignment_3_1; }

		//JvmTypeReference
		public RuleCall getJavaClassJvmTypeReferenceParserRuleCall_3_1_0() { return cJavaClassJvmTypeReferenceParserRuleCall_3_1_0; }

		//expression=XBlockExpression?
		public Assignment getExpressionAssignment_4() { return cExpressionAssignment_4; }

		//XBlockExpression
		public RuleCall getExpressionXBlockExpressionParserRuleCall_4_0() { return cExpressionXBlockExpressionParserRuleCall_4_0; }
	}

	public class XLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXClosureParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cXBooleanLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cXIntLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cXNullLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cXStringLiteralParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cXTypeLiteralParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cXColorLiteralParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//XLiteral returns xbase::XExpression:
		//	XClosure | XBooleanLiteral | XIntLiteral | XNullLiteral | XStringLiteral | XTypeLiteral | XColorLiteral;
		public ParserRule getRule() { return rule; }

		//XClosure | XBooleanLiteral | XIntLiteral | XNullLiteral | XStringLiteral | XTypeLiteral | XColorLiteral
		public Alternatives getAlternatives() { return cAlternatives; }

		//XClosure
		public RuleCall getXClosureParserRuleCall_0() { return cXClosureParserRuleCall_0; }

		//XBooleanLiteral
		public RuleCall getXBooleanLiteralParserRuleCall_1() { return cXBooleanLiteralParserRuleCall_1; }

		//XIntLiteral
		public RuleCall getXIntLiteralParserRuleCall_2() { return cXIntLiteralParserRuleCall_2; }

		//XNullLiteral
		public RuleCall getXNullLiteralParserRuleCall_3() { return cXNullLiteralParserRuleCall_3; }

		//XStringLiteral
		public RuleCall getXStringLiteralParserRuleCall_4() { return cXStringLiteralParserRuleCall_4; }

		//XTypeLiteral
		public RuleCall getXTypeLiteralParserRuleCall_5() { return cXTypeLiteralParserRuleCall_5; }

		//XColorLiteral
		public RuleCall getXColorLiteralParserRuleCall_6() { return cXColorLiteralParserRuleCall_6; }
	}

	public class XColorLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XColorLiteral");
		private final Assignment cColorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cColorColorTerminalRuleCall_0 = (RuleCall)cColorAssignment.eContents().get(0);
		
		//XColorLiteral:
		//	color=Color;
		public ParserRule getRule() { return rule; }

		//color=Color
		public Assignment getColorAssignment() { return cColorAssignment; }

		//Color
		public RuleCall getColorColorTerminalRuleCall_0() { return cColorColorTerminalRuleCall_0; }
	}
	
	
	private StyleSheetElements pStyleSheet;
	private ImportElements pImport;
	private QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private StyleElements pStyle;
	private XLiteralElements pXLiteral;
	private XColorLiteralElements pXColorLiteral;
	private TerminalRule tColor;
	
	private final GrammarProvider grammarProvider;

	private XbaseGrammarAccess gaXbase;

	@Inject
	public GraphViewStyleGrammarAccess(GrammarProvider grammarProvider,
		XbaseGrammarAccess gaXbase) {
		this.grammarProvider = grammarProvider;
		this.gaXbase = gaXbase;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public XbaseGrammarAccess getXbaseGrammarAccess() {
		return gaXbase;
	}

	
	//StyleSheet:
	//	imports+=Import* "stylesheet" name=QualifiedName styles+=Style*;
	public StyleSheetElements getStyleSheetAccess() {
		return (pStyleSheet != null) ? pStyleSheet : (pStyleSheet = new StyleSheetElements());
	}
	
	public ParserRule getStyleSheetRule() {
		return getStyleSheetAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName ("." "*")?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return (pQualifiedNameWithWildcard != null) ? pQualifiedNameWithWildcard : (pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements());
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//Style:
	//	"style" mappings+=[gvmapping::AbstractMapping|QualifiedName] (","
	//	mappings+=[gvmapping::AbstractMapping|QualifiedName])* // should become a crossref to a Mapping ID
	//	("as" javaClass=JvmTypeReference)? expression=XBlockExpression?;
	public StyleElements getStyleAccess() {
		return (pStyle != null) ? pStyle : (pStyle = new StyleElements());
	}
	
	public ParserRule getStyleRule() {
		return getStyleAccess().getRule();
	}

	//XLiteral returns xbase::XExpression:
	//	XClosure | XBooleanLiteral | XIntLiteral | XNullLiteral | XStringLiteral | XTypeLiteral | XColorLiteral;
	public XLiteralElements getXLiteralAccess() {
		return (pXLiteral != null) ? pXLiteral : (pXLiteral = new XLiteralElements());
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XColorLiteral:
	//	color=Color;
	public XColorLiteralElements getXColorLiteralAccess() {
		return (pXColorLiteral != null) ? pXColorLiteral : (pXColorLiteral = new XColorLiteralElements());
	}
	
	public ParserRule getXColorLiteralRule() {
		return getXColorLiteralAccess().getRule();
	}

	//terminal Color:
	//	"#" ("0".."9" | "a".."f" | "A".."F") ("0".."9" | "a".."f" | "A".."F") ("0".."9" | "a".."f" | "A".."F") ("0".."9" |
	//	"a".."f" | "A".."F") ("0".."9" | "a".."f" | "A".."F") ("0".."9" | "a".."f" | "A".."F");
	public TerminalRule getColorRule() {
		return (tColor != null) ? tColor : (tColor = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "Color"));
	} 

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} / * (declaringType=[types::JvmDeclaredType] '::')? * / feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign value=XAssignment | XOrExpression (=> ({XBinaryOperation.leftOperand=current}
	//	feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbase.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof")
	//	type=[types::JvmType|QualifiedName] | => ({XBinaryOperation.leftOperand=current}
	//	feature=[types::JvmIdentifiableElement|OpCompare]) rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | "..";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XCastedExpression | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XMemberFeatureCall (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} "." feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign) value=XAssignment | => ({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." |
	//	spreading?="*.")) ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|ValidID] (=> explicitOperationCall?="(" (memberCallArguments+=XShortClosure |
	//	memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XPrimaryExpression returns XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
	//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
	//	XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbase.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//XClosure returns XExpression:
	//	{XClosure} "[" (formalParameters+=JvmFormalParameter ("," formalParameters+=JvmFormalParameter)*)? "|"
	//	expression=XExpression "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (formalParameters+=JvmFormalParameter ("," formalParameters+=JvmFormalParameter)*)? "|")
	//	expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (localVarName=ValidID ":")? switch=XExpression "{" cases+=XCasePart+ ("default" ":"
	//	default=XExpression)? "}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	typeGuard=JvmTypeReference? ("case" case=XExpression)? ":" then=XExpression;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	{XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":" forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionInsideBlock ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionInsideBlock returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionInsideBlockElements getXExpressionInsideBlockAccess() {
		return gaXbase.getXExpressionInsideBlockAccess();
	}
	
	public ParserRule getXExpressionInsideBlockRule() {
		return getXExpressionInsideBlockAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} declaringType=[types::JvmDeclaredType|StaticQualifier]? ("<" typeArguments+=JvmArgumentTypeReference
	//	("," typeArguments+=JvmArgumentTypeReference)* ">")? feature=[types::JvmIdentifiableElement|IdOrSuper] (=>
	//	explicitOperationCall?="(" (featureCallArguments+=XShortClosure | featureCallArguments+=XExpression (","
	//	featureCallArguments+=XExpression)*)? ")")?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//IdOrSuper:
	//	ValidID | "super";
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbase.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}

	//// This is a workaround since ANTLR will not be able to resolve
	//// StaticQualifier: ValidID ('::' ValidID)*; and XFeatureCall: (StaticQualifier '::')? ValidID
	//// Make sure to change the value converter if you change the syntax of the StaticQualifier
	//StaticQualifier:
	//	(ValidID "::")+;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbase.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? "("
	//	(arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")";
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XIntLiteral returns XExpression:
	//	{XIntLiteral} value=INT;
	public XbaseGrammarAccess.XIntLiteralElements getXIntLiteralAccess() {
		return gaXbase.getXIntLiteralAccess();
	}
	
	public ParserRule getXIntLiteralRule() {
		return getXIntLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" => expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbase.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=JvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//JvmTypeReference returns JvmParameterizedTypeReference:
	//	JvmParameterizedTypeReference | XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbase.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)* ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbase.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)*
	//	">")?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbase.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbase.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbase.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbase.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbase.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbase.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbase.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXbase.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "$" | "_") ("a".."z" | "A".."Z" | "$" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbase.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaXbase.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaXbase.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbase.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbase.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbase.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbase.getANY_OTHERRule();
	} 
}
