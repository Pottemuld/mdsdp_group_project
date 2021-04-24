/**
 * generated by Xtext 2.25.0
 */
package org.xtext.registrationDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.registrationDSL.LogicExp;
import org.xtext.registrationDSL.RegistrationDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.registrationDSL.impl.LogicExpImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicExpImpl extends MinimalEObjectImpl.Container implements LogicExp
{
  /**
   * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogic()
   * @generated
   * @ordered
   */
  protected LogicExp logic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicExpImpl()
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
    return RegistrationDSLPackage.Literals.LOGIC_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExp getLogic()
  {
    return logic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogic(LogicExp newLogic, NotificationChain msgs)
  {
    LogicExp oldLogic = logic;
    logic = newLogic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistrationDSLPackage.LOGIC_EXP__LOGIC, oldLogic, newLogic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLogic(LogicExp newLogic)
  {
    if (newLogic != logic)
    {
      NotificationChain msgs = null;
      if (logic != null)
        msgs = ((InternalEObject)logic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistrationDSLPackage.LOGIC_EXP__LOGIC, null, msgs);
      if (newLogic != null)
        msgs = ((InternalEObject)newLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistrationDSLPackage.LOGIC_EXP__LOGIC, null, msgs);
      msgs = basicSetLogic(newLogic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RegistrationDSLPackage.LOGIC_EXP__LOGIC, newLogic, newLogic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RegistrationDSLPackage.LOGIC_EXP__LOGIC:
        return basicSetLogic(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RegistrationDSLPackage.LOGIC_EXP__LOGIC:
        return getLogic();
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
      case RegistrationDSLPackage.LOGIC_EXP__LOGIC:
        setLogic((LogicExp)newValue);
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
      case RegistrationDSLPackage.LOGIC_EXP__LOGIC:
        setLogic((LogicExp)null);
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
      case RegistrationDSLPackage.LOGIC_EXP__LOGIC:
        return logic != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicExpImpl
