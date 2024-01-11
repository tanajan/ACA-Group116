/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DataValue;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataValueImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataValueImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataValueImpl#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataValueImpl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataValueImpl extends MinimalEObjectImpl.Container implements DataValue
{
  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected static final String DOUBLE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected String doubleValue = DOUBLE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected String booleanValue = BOOLEAN_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataValueImpl()
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
    return MyDslPackage.Literals.DATA_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_VALUE__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_VALUE__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDoubleValue()
  {
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDoubleValue(String newDoubleValue)
  {
    String oldDoubleValue = doubleValue;
    doubleValue = newDoubleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_VALUE__DOUBLE_VALUE, oldDoubleValue, doubleValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBooleanValue(String newBooleanValue)
  {
    String oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_VALUE__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
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
      case MyDslPackage.DATA_VALUE__STRING_VALUE:
        return getStringValue();
      case MyDslPackage.DATA_VALUE__INT_VALUE:
        return getIntValue();
      case MyDslPackage.DATA_VALUE__DOUBLE_VALUE:
        return getDoubleValue();
      case MyDslPackage.DATA_VALUE__BOOLEAN_VALUE:
        return getBooleanValue();
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
      case MyDslPackage.DATA_VALUE__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case MyDslPackage.DATA_VALUE__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case MyDslPackage.DATA_VALUE__DOUBLE_VALUE:
        setDoubleValue((String)newValue);
        return;
      case MyDslPackage.DATA_VALUE__BOOLEAN_VALUE:
        setBooleanValue((String)newValue);
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
      case MyDslPackage.DATA_VALUE__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case MyDslPackage.DATA_VALUE__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case MyDslPackage.DATA_VALUE__DOUBLE_VALUE:
        setDoubleValue(DOUBLE_VALUE_EDEFAULT);
        return;
      case MyDslPackage.DATA_VALUE__BOOLEAN_VALUE:
        setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
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
      case MyDslPackage.DATA_VALUE__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case MyDslPackage.DATA_VALUE__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case MyDslPackage.DATA_VALUE__DOUBLE_VALUE:
        return DOUBLE_VALUE_EDEFAULT == null ? doubleValue != null : !DOUBLE_VALUE_EDEFAULT.equals(doubleValue);
      case MyDslPackage.DATA_VALUE__BOOLEAN_VALUE:
        return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
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
    result.append(" (stringValue: ");
    result.append(stringValue);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", doubleValue: ");
    result.append(doubleValue);
    result.append(", booleanValue: ");
    result.append(booleanValue);
    result.append(')');
    return result.toString();
  }

} //DataValueImpl
