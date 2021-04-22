/*
 * generated by Xtext 2.25.0
 */
grammar InternalRegistrationDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.RegistrationDSLGrammarAccess;

}
@parser::members {
	private RegistrationDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(RegistrationDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRegistationsystem
entryRuleRegistationsystem
:
{ before(grammarAccess.getRegistationsystemRule()); }
	 ruleRegistationsystem
{ after(grammarAccess.getRegistationsystemRule()); } 
	 EOF 
;

// Rule Registationsystem
ruleRegistationsystem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegistationsystemAccess().getGroup()); }
		(rule__Registationsystem__Group__0)
		{ after(grammarAccess.getRegistationsystemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getAlternatives()); }
		(rule__Declaration__Alternatives)
		{ after(grammarAccess.getDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField
entryRuleField
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldAccess().getAlternatives()); }
		(rule__Field__Alternatives)
		{ after(grammarAccess.getFieldAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelation
entryRuleRelation
:
{ before(grammarAccess.getRelationRule()); }
	 ruleRelation
{ after(grammarAccess.getRelationRule()); } 
	 EOF 
;

// Rule Relation
ruleRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationAccess().getGroup()); }
		(rule__Relation__Group__0)
		{ after(grammarAccess.getRelationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkflow
entryRuleWorkflow
:
{ before(grammarAccess.getWorkflowRule()); }
	 ruleWorkflow
{ after(grammarAccess.getWorkflowRule()); } 
	 EOF 
;

// Rule Workflow
ruleWorkflow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkflowAccess().getGroup()); }
		(rule__Workflow__Group__0)
		{ after(grammarAccess.getWorkflowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelect
entryRuleSelect
:
{ before(grammarAccess.getSelectRule()); }
	 ruleSelect
{ after(grammarAccess.getSelectRule()); } 
	 EOF 
;

// Rule Select
ruleSelect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelectAccess().getGroup()); }
		(rule__Select__Group__0)
		{ after(grammarAccess.getSelectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdd
entryRuleAdd
:
{ before(grammarAccess.getAddRule()); }
	 ruleAdd
{ after(grammarAccess.getAddRule()); } 
	 EOF 
;

// Rule Add
ruleAdd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddAccess().getGroup()); }
		(rule__Add__Group__0)
		{ after(grammarAccess.getAddAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); }
		ruleEntity
		{ after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1()); }
		ruleWorkflow
		{ after(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0()); }
		ruleAttribute
		{ after(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFieldAccess().getRelationParserRuleCall_1()); }
		ruleRelation
		{ after(grammarAccess.getFieldAccess().getRelationParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getSelectParserRuleCall_0()); }
		ruleSelect
		{ after(grammarAccess.getStatementAccess().getSelectParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); }
		ruleAdd
		{ after(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Registationsystem__Group__0__Impl
	rule__Registationsystem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegistationsystemAccess().getSystemKeyword_0()); }
	'system'
	{ after(grammarAccess.getRegistationsystemAccess().getSystemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Registationsystem__Group__1__Impl
	rule__Registationsystem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); }
	(rule__Registationsystem__NameAssignment_1)
	{ after(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Registationsystem__Group__2__Impl
	rule__Registationsystem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Registationsystem__Group__3__Impl
	rule__Registationsystem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); }
	(rule__Registationsystem__DeclarationsAssignment_3)*
	{ after(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Registationsystem__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); }
	(rule__Entity__FieldsAssignment_4)*
	{ after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getEntityAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); }
	(rule__Entity__BaseAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
	'attribute'
	{ after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
	(rule__Attribute__TypeAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__0__Impl
	rule__Relation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRelationKeyword_0()); }
	'relation'
	{ after(grammarAccess.getRelationAccess().getRelationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__1__Impl
	rule__Relation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getNameAssignment_1()); }
	(rule__Relation__NameAssignment_1)
	{ after(grammarAccess.getRelationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__2__Impl
	rule__Relation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getRelationAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getTargetAssignment_3()); }
	(rule__Relation__TargetAssignment_3)
	{ after(grammarAccess.getRelationAccess().getTargetAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Workflow__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workflow__Group__0__Impl
	rule__Workflow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); }
	'workflow'
	{ after(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workflow__Group__1__Impl
	rule__Workflow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkflowAccess().getNameAssignment_1()); }
	(rule__Workflow__NameAssignment_1)
	{ after(grammarAccess.getWorkflowAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workflow__Group__2__Impl
	rule__Workflow__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workflow__Group__3__Impl
	rule__Workflow__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkflowAccess().getStatementsAssignment_3()); }
	(rule__Workflow__StatementsAssignment_3)*
	{ after(grammarAccess.getWorkflowAccess().getStatementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workflow__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Select__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Select__Group__0__Impl
	rule__Select__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectAccess().getSelectKeyword_0()); }
	'select'
	{ after(grammarAccess.getSelectAccess().getSelectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Select__Group__1__Impl
	rule__Select__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectAccess().getSelecttypeAssignment_1()); }
	(rule__Select__SelecttypeAssignment_1)
	{ after(grammarAccess.getSelectAccess().getSelecttypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Select__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectAccess().getEntityNameAssignment_2()); }
	(rule__Select__EntityNameAssignment_2)
	{ after(grammarAccess.getSelectAccess().getEntityNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Add__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__0__Impl
	rule__Add__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getAddKeyword_0()); }
	'add'
	{ after(grammarAccess.getAddAccess().getAddKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__1__Impl
	rule__Add__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1()); }
	(rule__Add__SelectedEntityNameAssignment_1)
	{ after(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__2__Impl
	rule__Add__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getAddAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__3__Impl
	rule__Add__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getToEntityAssignment_3()); }
	(rule__Add__ToEntityAssignment_3)
	{ after(grammarAccess.getAddAccess().getToEntityAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__4__Impl
	rule__Add__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getFullStopKeyword_4()); }
	'.'
	{ after(grammarAccess.getAddAccess().getFullStopKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getToEntityRelationAssignment_5()); }
	(rule__Add__ToEntityRelationAssignment_5)
	{ after(grammarAccess.getAddAccess().getToEntityRelationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Registationsystem__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Registationsystem__DeclarationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0()); }
		ruleDeclaration
		{ after(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__BaseAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FieldsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); }
		ruleField
		{ after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__TargetAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workflow__StatementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0()); }
		ruleStatement
		{ after(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__SelecttypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectAccess().getSelecttypeEntityCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSelectAccess().getSelecttypeEntityIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSelectAccess().getSelecttypeEntityIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSelectAccess().getSelecttypeEntityCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Select__EntityNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__SelectedEntityNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__ToEntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__ToEntityRelationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;