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
		modelInstance.declarations.filter(Workflow).generateWorkflowFile(modelInstance.name,fsa)
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
		private ArrayList<�r.target.name�> r.name = new ArrayList<>();
		
		public get�r.name.toFirstUpper�(){
			return �r.name�;
		}
			
		public add�r.name.toFirstUpper�(�r.target.name.toFirstUpper� target){
			this.�r.name�.add(target);
		}
			
		�ENDFOR�
		
	}
	'''
	def generateConstructor(Entity entity) '''
	public �entity.name�(�FOR a:entity.allAtributeFields SEPARATOR ", "��a.type� �a.name��ENDFOR�) {
		�IF entity.base!==null�
		super(�FOR a:entity.base.allAtributeFields SEPARATOR ", "��a.name��ENDFOR�);
		�ENDIF�
		�FOR a:entity.fields�
		this.�a.name� = �a.name�;
		�ENDFOR�
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
	
	def generateWorkflowFile(Iterable<Workflow> workflows, String systemName, IFileSystemAccess2 fsa) { '''
		package �systemName.toLowerCase�
		import java.util.*;
		public class WorkflowManager {
			ArrayList<? extends Object> entityList = new Arraylist<>();
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
		
	'''
	}	
	
	def dispatch handleStatement(Add statement) {'''
			
	'''
	}	
	
	def display(EObject model) {
  		val res = new XMLResourceImpl
  		res.contents.add(EcoreUtil::copy(model))
  		System::out.println("Dump of model:")
  		res.save(System.out, null);
	}
}
