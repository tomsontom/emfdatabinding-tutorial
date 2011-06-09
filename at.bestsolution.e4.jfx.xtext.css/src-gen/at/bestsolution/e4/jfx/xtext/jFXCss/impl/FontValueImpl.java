/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl#getStyleOrWeight <em>Style Or Weight</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl#getSize <em>Size</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontValueImpl extends MinimalEObjectImpl.Container implements FontValue
{
  /**
   * The default value of the '{@link #getStyleOrWeight() <em>Style Or Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeight()
   * @generated
   * @ordered
   */
  protected static final String STYLE_OR_WEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyleOrWeight() <em>Style Or Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeight()
   * @generated
   * @ordered
   */
  protected String styleOrWeight = STYLE_OR_WEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected SizeValue size;

  /**
   * The cached value of the '{@link #getFamily() <em>Family</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected FontFamily family;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontValueImpl()
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
    return JFXCssPackage.Literals.FONT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyleOrWeight()
  {
    return styleOrWeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleOrWeight(String newStyleOrWeight)
  {
    String oldStyleOrWeight = styleOrWeight;
    styleOrWeight = newStyleOrWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT, oldStyleOrWeight, styleOrWeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(SizeValue newSize, NotificationChain msgs)
  {
    SizeValue oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(SizeValue newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamily getFamily()
  {
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFamily(FontFamily newFamily, NotificationChain msgs)
  {
    FontFamily oldFamily = family;
    family = newFamily;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__FAMILY, oldFamily, newFamily);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFamily(FontFamily newFamily)
  {
    if (newFamily != family)
    {
      NotificationChain msgs = null;
      if (family != null)
        msgs = ((InternalEObject)family).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__FAMILY, null, msgs);
      if (newFamily != null)
        msgs = ((InternalEObject)newFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__FAMILY, null, msgs);
      msgs = basicSetFamily(newFamily, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__FAMILY, newFamily, newFamily));
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
      case JFXCssPackage.FONT_VALUE__SIZE:
        return basicSetSize(null, msgs);
      case JFXCssPackage.FONT_VALUE__FAMILY:
        return basicSetFamily(null, msgs);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT:
        return getStyleOrWeight();
      case JFXCssPackage.FONT_VALUE__SIZE:
        return getSize();
      case JFXCssPackage.FONT_VALUE__FAMILY:
        return getFamily();
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT:
        setStyleOrWeight((String)newValue);
        return;
      case JFXCssPackage.FONT_VALUE__SIZE:
        setSize((SizeValue)newValue);
        return;
      case JFXCssPackage.FONT_VALUE__FAMILY:
        setFamily((FontFamily)newValue);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT:
        setStyleOrWeight(STYLE_OR_WEIGHT_EDEFAULT);
        return;
      case JFXCssPackage.FONT_VALUE__SIZE:
        setSize((SizeValue)null);
        return;
      case JFXCssPackage.FONT_VALUE__FAMILY:
        setFamily((FontFamily)null);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT:
        return STYLE_OR_WEIGHT_EDEFAULT == null ? styleOrWeight != null : !STYLE_OR_WEIGHT_EDEFAULT.equals(styleOrWeight);
      case JFXCssPackage.FONT_VALUE__SIZE:
        return size != null;
      case JFXCssPackage.FONT_VALUE__FAMILY:
        return family != null;
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
    result.append(" (styleOrWeight: ");
    result.append(styleOrWeight);
    result.append(')');
    return result.toString();
  }

} //FontValueImpl
