/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Weight Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl#getValueInt <em>Value Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontWeightValueImpl extends MinimalEObjectImpl.Container implements FontWeightValue
{
  /**
   * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected String valueString = VALUE_STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueInt() <em>Value Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueInt()
   * @generated
   * @ordered
   */
  protected NumberValue valueInt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontWeightValueImpl()
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
    return JFXCssPackage.Literals.FONT_WEIGHT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueString()
  {
    return valueString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueString(String newValueString)
  {
    String oldValueString = valueString;
    valueString = newValueString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_STRING, oldValueString, valueString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getValueInt()
  {
    return valueInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueInt(NumberValue newValueInt, NotificationChain msgs)
  {
    NumberValue oldValueInt = valueInt;
    valueInt = newValueInt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT, oldValueInt, newValueInt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueInt(NumberValue newValueInt)
  {
    if (newValueInt != valueInt)
    {
      NotificationChain msgs = null;
      if (valueInt != null)
        msgs = ((InternalEObject)valueInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT, null, msgs);
      if (newValueInt != null)
        msgs = ((InternalEObject)newValueInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT, null, msgs);
      msgs = basicSetValueInt(newValueInt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT, newValueInt, newValueInt));
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
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT:
        return basicSetValueInt(null, msgs);
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
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_STRING:
        return getValueString();
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT:
        return getValueInt();
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
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_STRING:
        setValueString((String)newValue);
        return;
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT:
        setValueInt((NumberValue)newValue);
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
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_STRING:
        setValueString(VALUE_STRING_EDEFAULT);
        return;
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT:
        setValueInt((NumberValue)null);
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
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
      case JFXCssPackage.FONT_WEIGHT_VALUE__VALUE_INT:
        return valueInt != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (valueString: ");
    result.append(valueString);
    result.append(')');
    return result.toString();
  }

} //FontWeightValueImpl
