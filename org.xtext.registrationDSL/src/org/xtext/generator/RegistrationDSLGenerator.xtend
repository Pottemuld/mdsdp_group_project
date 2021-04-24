/*
 * generated by Xtext 2.25.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.registrationDSL.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.ArrayList
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RegistrationDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Registationsystem modelInstance = resource.allContents.filter(Registationsystem).next
		modelInstance.display
		modelInstance.declarations.filter(Entity).forEach[generateEntityFile(modelInstance.name,fsa)]
		modelInstance.declarations.filter(Workflow).generateWorkflowFile(modelInstance.name, modelInstance.declarations.filter(Entity),fsa)
	}
	
	def generateEntityFile(Entity entity, String systemName, IFileSystemAccess2 fsa) {
		fsa.generateFile(systemName.toLowerCase+"/"+entity.name+".java", entity.generateEntity(systemName))
	}
	
	def CharSequence generateEntity(Entity entity, String systemName) '''
	package �systemName.toLowerCase�;
	import java.util.*;
	
	public class �entity.name��IF entity.base !==null� extends �entity.base.name��ENDIF� {
		�entity.generateConstructor�
		
		//ad relations and atributes
		�FOR a:entity.fields.filter(Attribute)�
		private �a.type� �a.name�;
		
		public �a.type� get�a.name.toFirstUpper�(){
			return �a.name�;
		}
			
		public void set�a.name.toFirstUpper�(�a.type� value){
			this.�a.name� = value;
		}
			
		�ENDFOR�
		�FOR r:entity.fields.filter(Relation)�
		private ArrayList<�r.target.name�> �r.name� = new ArrayList<>();
		
		public ArrayList<�r.target.name.toFirstUpper�> get�r.name.toFirstUpper�(){
			return �r.name�;
		}
			
		public void add�r.name.toFirstUpper�(�r.target.name.toFirstUpper� target){
			this.�r.name�.add(target);
		}
			
		�ENDFOR�
		private void checkRequirements() {
				�FOR r:entity.fields.filter(Require)�
					if(!(�r.generateRequire�)) throw new Error("Requirement not satisfied");
				�ENDFOR�
				}
	}
	'''
	def generateConstructor(Entity entity) '''
	public �entity.name�(�FOR a:entity.allAtributeFields SEPARATOR ", "��a.type� �a.name��ENDFOR�) {
		�IF entity.base!==null�
		super(�FOR a:entity.base.allAtributeFields SEPARATOR ", "��a.name��ENDFOR�);
		�ENDIF�
		�FOR a:entity.fields.filter(Attribute)�
		this.�a.name� = �a.name�;
		�ENDFOR�
		checkRequirements();
	}
	'''
	
	def allAtributeFields(Entity entity) {//
		val result = new ArrayList<Attribute>
		var currentEntity = entity
		while(currentEntity!==null) {
			result.addAll(currentEntity.fields.filter(Attribute))
			currentEntity = currentEntity.base
		}
		result
	}
	
		def generateRequire(Require require) { require.logic.generateLogicExp }
		
	def dispatch CharSequence generateLogicExp(And exp) { exp.left.generateLogicExp+"&&"+exp.right.generateLogicExp }
	def dispatch CharSequence generateLogicExp(Or exp) { exp.left.generateLogicExp+"||"+exp.right.generateLogicExp }
	def dispatch CharSequence generateLogicExp(Comparison exp) { exp.left.generateMExp+exp.op+exp.right.generateMExp }
		
	def dispatch CharSequence generateMExp(Plus exp) { exp.left.generateMExp+"+"+exp.right.generateMExp }
	def dispatch CharSequence generateMExp(Minus exp) { exp.left.generateMExp+"-"+exp.right.generateMExp }
	def dispatch CharSequence generateMExp(Mult exp) { exp.left.generateMExp+"*"+exp.right.generateMExp }
	def dispatch CharSequence generateMExp(Div exp) { exp.left.generateMExp+"/"+exp.right.generateMExp }
	def dispatch CharSequence generateMExp(Variable exp) '''this.�exp.name.name�'''
	def dispatch CharSequence generateMExp(Constant exp) '''�exp.value�'''
	
	def generateWorkflowFile(Iterable<Workflow> workflows, String systemName, Iterable<Entity> entities, IFileSystemAccess2 fsa) {
		fsa.generateFile(systemName.toLowerCase+"/"+ "WorkflowManager"+".java", generateWorkflowManager(workflows, systemName, entities, fsa))
	}
	
	def CharSequence generateWorkflowManager(Iterable<Workflow> workflows, String systemName, Iterable<Entity> entities, IFileSystemAccess2 fsa) { '''
		package �systemName.toLowerCase�;
		import java.util.*;
		public class WorkflowManager {
		
		Scanner scan = new Scanner(System.in);
		String input; 
		
			�FOR e: entities�
				ArrayList<�e.name�> �e.name.toFirstLower�List = new ArrayList<>();
				
				private �e.name� choose�e.name.toFirstUpper� () {
					int i = 0;
					for (�e.name� x : �e.name.toFirstLower�List) {
						System.out.println((i) + ": " + x.toString());	
						i++;
					}
						System.out.println("Please choose from list above, by index: ");
						input = scan.nextLine();
						return �e.name.toFirstLower�List.get(Integer.parseInt(input));
				} 
			�ENDFOR�
			�FOR w : workflows� 
				public void �w.name.toFirstLower� () {
					�FOR s : w.statements�
						�handleStatement(s)�	
					�ENDFOR�
				}
			�ENDFOR�
		}
	'''
		
	}
	
	def dispatch handleStatement(Select statement) {'''
		�statement.selectType.name� �statement.entityName� = choose�statement.selectType.name�();
	'''
	}	
	
	def dispatch handleStatement(Add statement) {'''
		�statement.toEntity�.add�statement.toEntityRelation.toFirstUpper�(�statement.selectedEntityName�);
		System.out.println("Added �statement.selectedEntityName� to �statement.toEntity�");
	'''
	}	
	
	def dispatch handleStatement(Register s){'''
		String regex = "\\d+";
		�s.type.name.toFirstUpper� �s.name�;
		�FOR a:s.type.allAtributeFields.filter(Attribute)�
			System.out.println("Please enter value for �s.type.name� �a.name�: ");
			input = scan.nextLine();
			�IF a.type=="int"�
				while(!input.matches(regex)){
					System.out.println("Entered value was not of type �a.type�, please try again: ");
					input = scan.nextLine();
				}
				�a.type� �a.name� = Integer.parseInt(input);	
			�ELSE�
			�a.type� �a.name� = input;	
			�ENDIF�
		�ENDFOR�
		�s.name� = new �s.type.name�(�FOR a:s.type.allAtributeFields SEPARATOR ", "��a.name��ENDFOR�);
		�s.type.name.toFirstLower�List.add(�s.name�);
	'''
	}
	
	def display(EObject model) {
  		val res = new XMLResourceImpl
  		res.contents.add(EcoreUtil::copy(model))
  		System::out.println("Dump of model:")
  		res.save(System.out, null);
	}
}
