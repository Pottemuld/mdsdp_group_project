/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.Require#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @see org.xtext.registrationDSL.RegistrationDSLPackage#getRequire()
 * @model
 * @generated
 */
public interface Require extends Field
{
  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference.
   * @see #setLogic(LogicExp)
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getRequire_Logic()
   * @model containment="true"
   * @generated
   */
  LogicExp getLogic();

  /**
   * Sets the value of the '{@link org.xtext.registrationDSL.Require#getLogic <em>Logic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' containment reference.
   * @see #getLogic()
   * @generated
   */
  void setLogic(LogicExp value);

} // Require
