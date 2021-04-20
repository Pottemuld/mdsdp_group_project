/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.registrationDSL.Entity;
import org.xtext.registrationDSL.RegistrationDSLPackage;
import org.xtext.registrationDSL.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.impl.SelectImpl#getSelecttype <em>Selecttype</em>}</li>
 *   <li>{@link org.xtext.registrationDSL.impl.SelectImpl#getEntityName <em>Entity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends StatementImpl implements Select
{
  /**
   * The cached value of the '{@link #getSelecttype() <em>Selecttype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelecttype()
   * @generated
   * @ordered
   */
  protected Entity selecttype;

  /**
   * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityName()
   * @generated
   * @ordered
   */
  protected static final String ENTITY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityName()
   * @generated
   * @ordered
   */
  protected String entityName = ENTITY_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RegistrationDSLPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getSelecttype()
  {
    if (selecttype != null && selecttype.eIsProxy())
    {
      InternalEObject oldSelecttype = (InternalEObject)selecttype;
      selecttype = (Entity)eResolveProxy(oldSelecttype);
      if (selecttype != oldSelecttype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistrationDSLPackage.SELECT__SELECTTYPE, oldSelecttype, selecttype));
      }
    }
    return selecttype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSelecttype()
  {
    return selecttype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelecttype(Entity newSelecttype)
  {
    Entity oldSelecttype = selecttype;
    selecttype = newSelecttype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegistrationDSLPackage.SELECT__SELECTTYPE, oldSelecttype, selecttype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntityName()
  {
    return entityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntityName(String newEntityName)
  {
    String oldEntityName = entityName;
    entityName = newEntityName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegistrationDSLPackage.SELECT__ENTITY_NAME, oldEntityName, entityName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RegistrationDSLPackage.SELECT__SELECTTYPE:
        if (resolve) return getSelecttype();
        return basicGetSelecttype();
      case RegistrationDSLPackage.SELECT__ENTITY_NAME:
        return getEntityName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RegistrationDSLPackage.SELECT__SELECTTYPE:
        setSelecttype((Entity)newValue);
        return;
      case RegistrationDSLPackage.SELECT__ENTITY_NAME:
        setEntityName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RegistrationDSLPackage.SELECT__SELECTTYPE:
        setSelecttype((Entity)null);
        return;
      case RegistrationDSLPackage.SELECT__ENTITY_NAME:
        setEntityName(ENTITY_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RegistrationDSLPackage.SELECT__SELECTTYPE:
        return selecttype != null;
      case RegistrationDSLPackage.SELECT__ENTITY_NAME:
        return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (entityName: ");
    result.append(entityName);
    result.append(')');
    return result.toString();
  }

} //SelectImpl
