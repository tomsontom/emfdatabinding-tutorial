/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Style Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl#getV <em>V</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatStyleValueImpl extends MinimalEObjectImpl.Container implements RepeatStyleValue
{
  /**
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected static final String V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected String v = V_EDEFAULT;

  /**
   * The default value of the '{@link #getV2() <em>V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected static final String V2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected String v2 = V2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatStyleValueImpl()
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
    return JFXCssPackage.Literals.REPEAT_STYLE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(String newV)
  {
    String oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.REPEAT_STYLE_VALUE__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(String newV2)
  {
    String oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.REPEAT_STYLE_VALUE__V2, oldV2, v2));
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
      case JFXCssPackage.REPEAT_STYLE_VALUE__V:
        return getV();
      case JFXCssPackage.REPEAT_STYLE_VALUE__V2:
        return getV2();
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
      case JFXCssPackage.REPEAT_STYLE_VALUE__V:
        setV((String)newValue);
        return;
      case JFXCssPackage.REPEAT_STYLE_VALUE__V2:
        setV2((String)newValue);
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
      case JFXCssPackage.REPEAT_STYLE_VALUE__V:
        setV(V_EDEFAULT);
        return;
      case JFXCssPackage.REPEAT_STYLE_VALUE__V2:
        setV2(V2_EDEFAULT);
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
      case JFXCssPackage.REPEAT_STYLE_VALUE__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
      case JFXCssPackage.REPEAT_STYLE_VALUE__V2:
        return V2_EDEFAULT == null ? v2 != null : !V2_EDEFAULT.equals(v2);
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
    result.append(" (v: ");
    result.append(v);
    result.append(", v2: ");
    result.append(v2);
    result.append(')');
    return result.toString();
  }

} //RepeatStyleValueImpl
