/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.Select#getSelectType <em>Select Type</em>}</li>
 *   <li>{@link org.xtext.registrationDSL.Select#getEntityName <em>Entity Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.registrationDSL.RegistrationDSLPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Statement
{
  /**
   * Returns the value of the '<em><b>Select Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Type</em>' reference.
   * @see #setSelectType(Entity)
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getSelect_SelectType()
   * @model
   * @generated
   */
  Entity getSelectType();

  /**
   * Sets the value of the '{@link org.xtext.registrationDSL.Select#getSelectType <em>Select Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Type</em>' reference.
   * @see #getSelectType()
   * @generated
   */
  void setSelectType(Entity value);

  /**
   * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Name</em>' attribute.
   * @see #setEntityName(String)
   * @see org.xtext.registrationDSL.RegistrationDSLPackage#getSelect_EntityName()
   * @model
   * @generated
   */
  String getEntityName();

  /**
   * Sets the value of the '{@link org.xtext.registrationDSL.Select#getEntityName <em>Entity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Name</em>' attribute.
   * @see #getEntityName()
   * @generated
   */
  void setEntityName(String value);

} // Select
