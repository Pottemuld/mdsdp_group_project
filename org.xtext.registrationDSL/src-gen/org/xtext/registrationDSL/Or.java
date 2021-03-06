/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.registrationDSL.Or#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.registrationDSL.RegistrationDSLPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends LogicExp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicExp)
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getOr_Left()
   * @model containment="true"
   * @generated
   */
  LogicExp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.registrationDSL.Or#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicExp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LogicExp)
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getOr_Right()
   * @model containment="true"
   * @generated
   */
  LogicExp getRight();

  /**
   * Sets the value of the '{@link org.xtext.registrationDSL.Or#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LogicExp value);

} // Or
