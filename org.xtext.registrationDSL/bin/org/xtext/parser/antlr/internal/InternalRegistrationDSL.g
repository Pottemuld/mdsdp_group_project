/*
 * generated by Xtext 2.25.0
 */
grammar InternalRegistrationDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.RegistrationDSLGrammarAccess;

}

@parser::members {

 	private RegistrationDSLGrammarAccess grammarAccess;

    public InternalRegistrationDSLParser(TokenStream input, RegistrationDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Registationsystem";
   	}

   	@Override
   	protected RegistrationDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRegistationsystem
entryRuleRegistationsystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegistationsystemRule()); }
	iv_ruleRegistationsystem=ruleRegistationsystem
	{ $current=$iv_ruleRegistationsystem.current; }
	EOF;

// Rule Registationsystem
ruleRegistationsystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegistationsystemAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegistationsystemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0());
				}
				lv_declarations_3_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegistationsystemRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_3_0,
						"org.xtext.RegistrationDSL.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1());
		}
		this_Workflow_1=ruleWorkflow
		{
			$current = $this_Workflow_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0());
				}
				lv_fields_5_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"fields",
						lv_fields_5_0,
						"org.xtext.RegistrationDSL.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0());
		}
		this_Attribute_0=ruleAttribute
		{
			$current = $this_Attribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldAccess().getRelationParserRuleCall_1());
		}
		this_Relation_1=ruleRelation
		{
			$current = $this_Relation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldAccess().getRequireParserRuleCall_2());
		}
		this_Require_2=ruleRequire
		{
			$current = $this_Require_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
		}
		(
			(
				lv_type_3_0=RULE_ID
				{
					newLeafNode(lv_type_3_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='relation'
		{
			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleRequire
entryRuleRequire returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequireRule()); }
	iv_ruleRequire=ruleRequire
	{ $current=$iv_ruleRequire.current; }
	EOF;

// Rule Require
ruleRequire returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='require'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequireAccess().getLogicLogicParserRuleCall_1_0());
				}
				lv_logic_1_0=ruleLogic
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequireRule());
					}
					set(
						$current,
						"logic",
						lv_logic_1_0,
						"org.xtext.RegistrationDSL.Logic");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWorkflow
entryRuleWorkflow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkflowRule()); }
	iv_ruleWorkflow=ruleWorkflow
	{ $current=$iv_ruleWorkflow.current; }
	EOF;

// Rule Workflow
ruleWorkflow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='workflow'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkflowRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkflowRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"org.xtext.RegistrationDSL.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getSelectParserRuleCall_0());
		}
		this_Select_0=ruleSelect
		{
			$current = $this_Select_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAddParserRuleCall_1());
		}
		this_Add_1=ruleAdd
		{
			$current = $this_Add_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getRegisterParserRuleCall_2());
		}
		this_Register_2=ruleRegister
		{
			$current = $this_Register_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSelect
entryRuleSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleSelect=ruleSelect
	{ $current=$iv_ruleSelect.current; }
	EOF;

// Rule Select
ruleSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='select'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getSelectTypeEntityCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_entityName_2_0=RULE_ID
				{
					newLeafNode(lv_entityName_2_0, grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectRule());
					}
					setWithLastConsumed(
						$current,
						"entityName",
						lv_entityName_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
		}
		(
			(
				lv_selectedEntityName_1_0=RULE_ID
				{
					newLeafNode(lv_selectedEntityName_1_0, grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"selectedEntityName",
						lv_selectedEntityName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getToKeyword_2());
		}
		(
			(
				lv_toEntity_3_0=RULE_ID
				{
					newLeafNode(lv_toEntity_3_0, grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"toEntity",
						lv_toEntity_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='.'
		{
			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getFullStopKeyword_4());
		}
		(
			(
				lv_toEntityRelation_5_0=RULE_ID
				{
					newLeafNode(lv_toEntityRelation_5_0, grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"toEntityRelation",
						lv_toEntityRelation_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleRegister
entryRuleRegister returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegisterRule()); }
	iv_ruleRegister=ruleRegister
	{ $current=$iv_ruleRegister.current; }
	EOF;

// Rule Register
ruleRegister returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='register'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegisterAccess().getRegisterKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegisterRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRegisterAccess().getTypeEntityCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegisterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleLogic
entryRuleLogic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLogicRule()); }
	iv_ruleLogic=ruleLogic
	{ $current=$iv_ruleLogic.current; }
	EOF;

// Rule Logic
ruleLogic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLogicAccess().getConjunctionParserRuleCall_0());
		}
		this_Conjunction_0=ruleConjunction
		{
			$current = $this_Conjunction_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1='||'
			{
				newLeafNode(otherlv_1, grammarAccess.getLogicAccess().getVerticalLineVerticalLineKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getLogicAccess().getOrLeftAction_1_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getLogicAccess().getRightConjunctionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleConjunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLogicRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.RegistrationDSL.Conjunction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleConjunction
entryRuleConjunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConjunctionRule()); }
	iv_ruleConjunction=ruleConjunction
	{ $current=$iv_ruleConjunction.current; }
	EOF;

// Rule Conjunction
ruleConjunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConjunctionAccess().getPrimLogicParserRuleCall_0());
		}
		this_PrimLogic_0=rulePrimLogic
		{
			$current = $this_PrimLogic_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1='&&'
			{
				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getConjunctionAccess().getAndLeftAction_1_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConjunctionAccess().getRightPrimLogicParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimLogic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConjunctionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.RegistrationDSL.PrimLogic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimLogic
entryRulePrimLogic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimLogicRule()); }
	iv_rulePrimLogic=rulePrimLogic
	{ $current=$iv_rulePrimLogic.current; }
	EOF;

// Rule PrimLogic
rulePrimLogic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimLogicAccess().getComparisonParserRuleCall_0());
		}
		this_Comparison_0=ruleComparison
		{
			$current = $this_Comparison_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getPrimLogicAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimLogicAccess().getLogicLogicParserRuleCall_1_1_0());
					}
					lv_logic_2_0=ruleLogic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimLogicRule());
						}
						set(
							$current,
							"logic",
							lv_logic_2_0,
							"org.xtext.RegistrationDSL.Logic");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimLogicAccess().getRightSquareBracketKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
				}
				lv_left_0_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.RegistrationDSL.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getOpCompareOpParserRuleCall_1_0());
				}
				lv_op_1_0=ruleCompareOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"org.xtext.RegistrationDSL.CompareOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getRightExpParserRuleCall_2_0());
				}
				lv_right_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.xtext.RegistrationDSL.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompareOp
entryRuleCompareOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCompareOpRule()); }
	iv_ruleCompareOp=ruleCompareOp
	{ $current=$iv_ruleCompareOp.current.getText(); }
	EOF;

// Rule CompareOp
ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignKeyword_0());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_1());
		}
		    |
		kw='=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompareOpAccess().getEqualsSignEqualsSignKeyword_2());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_3());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignEqualsSignKeyword_4());
		}
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
		}
		this_Factor_0=ruleFactor
		{
			$current = $this_Factor_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='+'
					{
						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='-'
					{
						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"org.xtext.RegistrationDSL.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	iv_ruleFactor=ruleFactor
	{ $current=$iv_ruleFactor.current; }
	EOF;

// Rule Factor
ruleFactor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFactorAccess().getPrimExpParserRuleCall_0());
		}
		this_PrimExp_0=rulePrimExp
		{
			$current = $this_PrimExp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='*'
					{
						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='/'
					{
						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimExpParserRuleCall_1_1_0());
					}
					lv_right_5_0=rulePrimExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"org.xtext.RegistrationDSL.PrimExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimExp
entryRulePrimExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimExpRule()); }
	iv_rulePrimExp=rulePrimExp
	{ $current=$iv_rulePrimExp.current; }
	EOF;

// Rule PrimExp
rulePrimExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimExpAccess().getVarParserRuleCall_0());
		}
		this_Var_0=ruleVar
		{
			$current = $this_Var_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimExpAccess().getConstantParserRuleCall_1());
		}
		this_Constant_1=ruleConstant
		{
			$current = $this_Constant_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimExpAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimExpAccess().getExpExpParserRuleCall_2_1_0());
					}
					lv_exp_3_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimExpRule());
						}
						set(
							$current,
							"exp",
							lv_exp_3_0,
							"org.xtext.RegistrationDSL.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimExpAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleVar
entryRuleVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarRule()); }
	iv_ruleVar=ruleVar
	{ $current=$iv_ruleVar.current; }
	EOF;

// Rule Var
ruleVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVarAccess().getVariableAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getVarAccess().getNameAttributeCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConstantRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
