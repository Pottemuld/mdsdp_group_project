/*
 * generated by Xtext 2.25.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.registrationDSL.Add;
import org.xtext.registrationDSL.Attribute;
import org.xtext.registrationDSL.Entity;
import org.xtext.registrationDSL.Registationsystem;
import org.xtext.registrationDSL.RegistrationDSLPackage;
import org.xtext.registrationDSL.Relation;
import org.xtext.registrationDSL.Select;
import org.xtext.registrationDSL.Workflow;
import org.xtext.services.RegistrationDSLGrammarAccess;

@SuppressWarnings("all")
public class RegistrationDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RegistrationDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RegistrationDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RegistrationDSLPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case RegistrationDSLPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RegistrationDSLPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RegistrationDSLPackage.REGISTATIONSYSTEM:
				sequence_Registationsystem(context, (Registationsystem) semanticObject); 
				return; 
			case RegistrationDSLPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case RegistrationDSLPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case RegistrationDSLPackage.SET:
				sequence_Set(context, (org.xtext.registrationDSL.Set) semanticObject); 
				return; 
			case RegistrationDSLPackage.WORKFLOW:
				sequence_Workflow(context, (Workflow) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     (selectedEntityName=ID toEntityRelation=[Relation|ID])
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.ADD__SELECTED_ENTITY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.ADD__SELECTED_ENTITY_NAME));
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.ADD__TO_ENTITY_RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.ADD__TO_ENTITY_RELATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0(), semanticObject.getSelectedEntityName());
		feeder.accept(grammarAccess.getAddAccess().getToEntityRelationRelationIDTerminalRuleCall_3_0_1(), semanticObject.eGet(RegistrationDSLPackage.Literals.ADD__TO_ENTITY_RELATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID base=[Entity|ID]? fields+=Field*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Registationsystem returns Registationsystem
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_Registationsystem(ISerializationContext context, Registationsystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Relation
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (name=ID target=[Entity|ID])
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.RELATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.RELATION__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_3_0_1(), semanticObject.eGet(RegistrationDSLPackage.Literals.RELATION__TARGET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (selecttype=[Entity|ID] entityName=ID)
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.SELECT__SELECTTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.SELECT__SELECTTYPE));
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.SELECT__ENTITY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.SELECT__ENTITY_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectAccess().getSelecttypeEntityIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RegistrationDSLPackage.Literals.SELECT__SELECTTYPE, false));
		feeder.accept(grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0(), semanticObject.getEntityName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Set
	 *     Set returns Set
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Set(ISerializationContext context, org.xtext.registrationDSL.Set semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RegistrationDSLPackage.Literals.SET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegistrationDSLPackage.Literals.SET__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Workflow
	 *     Workflow returns Workflow
	 *
	 * Constraint:
	 *     (name=ID statements+=Statement*)
	 */
	protected void sequence_Workflow(ISerializationContext context, Workflow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
