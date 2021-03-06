/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.Workflow#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.registrationDSL.RegistrationDSLPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends Declaration
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.registrationDSL.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getWorkflow_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Workflow
