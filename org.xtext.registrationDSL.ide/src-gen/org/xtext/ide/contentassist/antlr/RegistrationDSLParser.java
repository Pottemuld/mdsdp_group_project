/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalRegistrationDSLParser;
import org.xtext.services.RegistrationDSLGrammarAccess;

public class RegistrationDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RegistrationDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RegistrationDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getPrimLogicAccess().getAlternatives(), "rule__PrimLogic__Alternatives");
			builder.put(grammarAccess.getCompareOpAccess().getAlternatives(), "rule__CompareOp__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimExpAccess().getAlternatives(), "rule__PrimExp__Alternatives");
			builder.put(grammarAccess.getRegistationsystemAccess().getGroup(), "rule__Registationsystem__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getRequireAccess().getGroup(), "rule__Require__Group__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup(), "rule__Workflow__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getRegisterAccess().getGroup(), "rule__Register__Group__0");
			builder.put(grammarAccess.getLogicAccess().getGroup(), "rule__Logic__Group__0");
			builder.put(grammarAccess.getLogicAccess().getGroup_1(), "rule__Logic__Group_1__0");
			builder.put(grammarAccess.getConjunctionAccess().getGroup(), "rule__Conjunction__Group__0");
			builder.put(grammarAccess.getConjunctionAccess().getGroup_1(), "rule__Conjunction__Group_1__0");
			builder.put(grammarAccess.getPrimLogicAccess().getGroup_1(), "rule__PrimLogic__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimExpAccess().getGroup_2(), "rule__PrimExp__Group_2__0");
			builder.put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
			builder.put(grammarAccess.getRegistationsystemAccess().getNameAssignment_1(), "rule__Registationsystem__NameAssignment_1");
			builder.put(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3(), "rule__Registationsystem__DeclarationsAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getBaseAssignment_2_1(), "rule__Entity__BaseAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getFieldsAssignment_4(), "rule__Entity__FieldsAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getNameAssignment_1(), "rule__Relation__NameAssignment_1");
			builder.put(grammarAccess.getRelationAccess().getTargetAssignment_3(), "rule__Relation__TargetAssignment_3");
			builder.put(grammarAccess.getRequireAccess().getLogicAssignment_1(), "rule__Require__LogicAssignment_1");
			builder.put(grammarAccess.getWorkflowAccess().getNameAssignment_1(), "rule__Workflow__NameAssignment_1");
			builder.put(grammarAccess.getWorkflowAccess().getStatementsAssignment_3(), "rule__Workflow__StatementsAssignment_3");
			builder.put(grammarAccess.getSelectAccess().getSelectTypeAssignment_1(), "rule__Select__SelectTypeAssignment_1");
			builder.put(grammarAccess.getSelectAccess().getEntityNameAssignment_2(), "rule__Select__EntityNameAssignment_2");
			builder.put(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1(), "rule__Add__SelectedEntityNameAssignment_1");
			builder.put(grammarAccess.getAddAccess().getToEntityAssignment_3(), "rule__Add__ToEntityAssignment_3");
			builder.put(grammarAccess.getAddAccess().getToEntityRelationAssignment_5(), "rule__Add__ToEntityRelationAssignment_5");
			builder.put(grammarAccess.getRegisterAccess().getTypeAssignment_1(), "rule__Register__TypeAssignment_1");
			builder.put(grammarAccess.getRegisterAccess().getNameAssignment_2(), "rule__Register__NameAssignment_2");
			builder.put(grammarAccess.getLogicAccess().getRightAssignment_1_2(), "rule__Logic__RightAssignment_1_2");
			builder.put(grammarAccess.getConjunctionAccess().getRightAssignment_1_2(), "rule__Conjunction__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimLogicAccess().getLogicAssignment_1_1(), "rule__PrimLogic__LogicAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getLeftAssignment_0(), "rule__Comparison__LeftAssignment_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1(), "rule__Comparison__OpAssignment_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_2(), "rule__Comparison__RightAssignment_2");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimExpAccess().getExpAssignment_2_1(), "rule__PrimExp__ExpAssignment_2_1");
			builder.put(grammarAccess.getVarAccess().getNameAssignment_1(), "rule__Var__NameAssignment_1");
			builder.put(grammarAccess.getConstantAccess().getValueAssignment(), "rule__Constant__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RegistrationDSLGrammarAccess grammarAccess;

	@Override
	protected InternalRegistrationDSLParser createParser() {
		InternalRegistrationDSLParser result = new InternalRegistrationDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RegistrationDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RegistrationDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
