/*
 * generated by Xtext 2.25.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RegistrationDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RegistationsystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Registationsystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDeclarationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_3_0 = (RuleCall)cDeclarationsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Registationsystem: //car rental version
		//    'system' name =ID '{' declarations += Declaration* '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////car rental version
		//   'system' name =ID '{' declarations += Declaration* '}'
		public Group getGroup() { return cGroup; }
		
		////car rental version
		//   'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name =ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//declarations += Declaration*
		public Assignment getDeclarationsAssignment_3() { return cDeclarationsAssignment_3; }
		
		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_3_0() { return cDeclarationsDeclarationParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Declaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWorkflowParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Declaration:
		//    Entity | Workflow
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity | Workflow
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }
		
		//Workflow
		public RuleCall getWorkflowParserRuleCall_1() { return cWorkflowParserRuleCall_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cBaseAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cBaseEntityCrossReference_2_1_0 = (CrossReference)cBaseAssignment_2_1.eContents().get(0);
		private final RuleCall cBaseEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cBaseEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldsFieldParserRuleCall_4_0 = (RuleCall)cFieldsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//    'entity' name=ID (':' base=[Entity])? '{' fields += Field* '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID (':' base=[Entity])? '{' fields += Field* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(':' base=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//base=[Entity]
		public Assignment getBaseAssignment_2_1() { return cBaseAssignment_2_1; }
		
		//[Entity]
		public CrossReference getBaseEntityCrossReference_2_1_0() { return cBaseEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getBaseEntityIDTerminalRuleCall_2_1_0_1() { return cBaseEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//fields += Field*
		public Assignment getFieldsAssignment_4() { return cFieldsAssignment_4; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_0() { return cFieldsFieldParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Field");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRelationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Field:
		//    Attribute | Relation
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Attribute | Relation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Attribute
		public RuleCall getAttributeParserRuleCall_0() { return cAttributeParserRuleCall_0; }
		
		//Relation
		public RuleCall getRelationParserRuleCall_1() { return cRelationParserRuleCall_1; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeIDTerminalRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Attribute:
		//    'attribute' name=ID ':' type=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'attribute' name=ID ':' type=ID
		public Group getGroup() { return cGroup; }
		
		//'attribute'
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=ID
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_3_0() { return cTypeIDTerminalRuleCall_3_0; }
	}
	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Relation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTargetEntityCrossReference_3_0 = (CrossReference)cTargetAssignment_3.eContents().get(0);
		private final RuleCall cTargetEntityIDTerminalRuleCall_3_0_1 = (RuleCall)cTargetEntityCrossReference_3_0.eContents().get(1);
		
		//Relation:
		//    'relation' name=ID ':' target=[Entity]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'relation' name=ID ':' target=[Entity]
		public Group getGroup() { return cGroup; }
		
		//'relation'
		public Keyword getRelationKeyword_0() { return cRelationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//target=[Entity]
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }
		
		//[Entity]
		public CrossReference getTargetEntityCrossReference_3_0() { return cTargetEntityCrossReference_3_0; }
		
		//ID
		public RuleCall getTargetEntityIDTerminalRuleCall_3_0_1() { return cTargetEntityIDTerminalRuleCall_3_0_1; }
	}
	public class WorkflowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Workflow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWorkflowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsStatementParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Workflow:
		//    'workflow' name=ID '{' statements += Statement* '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'workflow' name=ID '{' statements += Statement* '}'
		public Group getGroup() { return cGroup; }
		
		//'workflow'
		public Keyword getWorkflowKeyword_0() { return cWorkflowKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//statements += Statement*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_3_0() { return cStatementsStatementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSelectParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAddParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//    Select | Add //| Set
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Select | Add
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Select
		public RuleCall getSelectParserRuleCall_0() { return cSelectParserRuleCall_0; }
		
		//Add
		public RuleCall getAddParserRuleCall_1() { return cAddParserRuleCall_1; }
	}
	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelecttypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSelecttypeEntityCrossReference_1_0 = (CrossReference)cSelecttypeAssignment_1.eContents().get(0);
		private final RuleCall cSelecttypeEntityIDTerminalRuleCall_1_0_1 = (RuleCall)cSelecttypeEntityCrossReference_1_0.eContents().get(1);
		private final Assignment cEntityNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntityNameIDTerminalRuleCall_2_0 = (RuleCall)cEntityNameAssignment_2.eContents().get(0);
		
		//Select:// this is wrong
		//    'select' selecttype=[Entity] entityName=ID //('where' '{'  '}' )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// this is wrong
		//    'select' selecttype=[Entity] entityName=ID
		public Group getGroup() { return cGroup; }
		
		//// this is wrong
		//    'select'
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//selecttype=[Entity]
		public Assignment getSelecttypeAssignment_1() { return cSelecttypeAssignment_1; }
		
		//[Entity]
		public CrossReference getSelecttypeEntityCrossReference_1_0() { return cSelecttypeEntityCrossReference_1_0; }
		
		//ID
		public RuleCall getSelecttypeEntityIDTerminalRuleCall_1_0_1() { return cSelecttypeEntityIDTerminalRuleCall_1_0_1; }
		
		//entityName=ID
		public Assignment getEntityNameAssignment_2() { return cEntityNameAssignment_2; }
		
		//ID
		public RuleCall getEntityNameIDTerminalRuleCall_2_0() { return cEntityNameIDTerminalRuleCall_2_0; }
	}
	public class AddElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.RegistrationDSL.Add");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelectedEntityNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectedEntityNameIDTerminalRuleCall_1_0 = (RuleCall)cSelectedEntityNameAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cToEntityIDTerminalRuleCall_3_0 = (RuleCall)cToEntityAssignment_3.eContents().get(0);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToEntityRelationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cToEntityRelationIDTerminalRuleCall_5_0 = (RuleCall)cToEntityRelationAssignment_5.eContents().get(0);
		
		//Add: //this is wrong
		//    'add' selectedEntityName=ID 'to' toEntity=ID '.' toEntityRelation=ID // check if it's right later
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////this is wrong
		//   'add' selectedEntityName=ID 'to' toEntity=ID '.' toEntityRelation=ID
		public Group getGroup() { return cGroup; }
		
		////this is wrong
		//   'add'
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//selectedEntityName=ID
		public Assignment getSelectedEntityNameAssignment_1() { return cSelectedEntityNameAssignment_1; }
		
		//ID
		public RuleCall getSelectedEntityNameIDTerminalRuleCall_1_0() { return cSelectedEntityNameIDTerminalRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//toEntity=ID
		public Assignment getToEntityAssignment_3() { return cToEntityAssignment_3; }
		
		//ID
		public RuleCall getToEntityIDTerminalRuleCall_3_0() { return cToEntityIDTerminalRuleCall_3_0; }
		
		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//toEntityRelation=ID
		public Assignment getToEntityRelationAssignment_5() { return cToEntityRelationAssignment_5; }
		
		//ID
		public RuleCall getToEntityRelationIDTerminalRuleCall_5_0() { return cToEntityRelationIDTerminalRuleCall_5_0; }
	}
	
	
	private final RegistationsystemElements pRegistationsystem;
	private final DeclarationElements pDeclaration;
	private final EntityElements pEntity;
	private final FieldElements pField;
	private final AttributeElements pAttribute;
	private final RelationElements pRelation;
	private final WorkflowElements pWorkflow;
	private final StatementElements pStatement;
	private final SelectElements pSelect;
	private final AddElements pAdd;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RegistrationDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRegistationsystem = new RegistationsystemElements();
		this.pDeclaration = new DeclarationElements();
		this.pEntity = new EntityElements();
		this.pField = new FieldElements();
		this.pAttribute = new AttributeElements();
		this.pRelation = new RelationElements();
		this.pWorkflow = new WorkflowElements();
		this.pStatement = new StatementElements();
		this.pSelect = new SelectElements();
		this.pAdd = new AddElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.RegistrationDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Registationsystem: //car rental version
	//    'system' name =ID '{' declarations += Declaration* '}'
	//;
	public RegistationsystemElements getRegistationsystemAccess() {
		return pRegistationsystem;
	}
	
	public ParserRule getRegistationsystemRule() {
		return getRegistationsystemAccess().getRule();
	}
	
	//Declaration:
	//    Entity | Workflow
	//;
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//Entity:
	//    'entity' name=ID (':' base=[Entity])? '{' fields += Field* '}'
	//;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Field:
	//    Attribute | Relation
	//;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//Attribute:
	//    'attribute' name=ID ':' type=ID
	//;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Relation:
	//    'relation' name=ID ':' target=[Entity]
	//;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//Workflow:
	//    'workflow' name=ID '{' statements += Statement* '}'
	//;
	public WorkflowElements getWorkflowAccess() {
		return pWorkflow;
	}
	
	public ParserRule getWorkflowRule() {
		return getWorkflowAccess().getRule();
	}
	
	//Statement:
	//    Select | Add //| Set
	//;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Select:// this is wrong
	//    'select' selecttype=[Entity] entityName=ID //('where' '{'  '}' )?
	//;
	public SelectElements getSelectAccess() {
		return pSelect;
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}
	
	//Add: //this is wrong
	//    'add' selectedEntityName=ID 'to' toEntity=ID '.' toEntityRelation=ID // check if it's right later
	//;
	public AddElements getAddAccess() {
		return pAdd;
	}
	
	public ParserRule getAddRule() {
		return getAddAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}