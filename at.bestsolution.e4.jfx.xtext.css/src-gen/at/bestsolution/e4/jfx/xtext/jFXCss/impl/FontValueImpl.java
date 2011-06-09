/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty;
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
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl#getStyleOrWeightString <em>Style Or Weight String</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl#getWeight <em>Weight</em>}</li>
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
   * The default value of the '{@link #getStyleOrWeightString() <em>Style Or Weight String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeightString()
   * @generated
   * @ordered
   */
  protected static final String STYLE_OR_WEIGHT_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyleOrWeightString() <em>Style Or Weight String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeightString()
   * @generated
   * @ordered
   */
  protected String styleOrWeightString = STYLE_OR_WEIGHT_STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected IntegerProperty weight;

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
  public String getStyleOrWeightString()
  {
    return styleOrWeightString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleOrWeightString(String newStyleOrWeightString)
  {
    String oldStyleOrWeightString = styleOrWeightString;
    styleOrWeightString = newStyleOrWeightString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT_STRING, oldStyleOrWeightString, styleOrWeightString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerProperty getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeight(IntegerProperty newWeight, NotificationChain msgs)
  {
    IntegerProperty oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__WEIGHT, oldWeight, newWeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(IntegerProperty newWeight)
  {
    if (newWeight != weight)
    {
      NotificationChain msgs = null;
      if (weight != null)
        msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__WEIGHT, null, msgs);
      if (newWeight != null)
        msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.FONT_VALUE__WEIGHT, null, msgs);
      msgs = basicSetWeight(newWeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.FONT_VALUE__WEIGHT, newWeight, newWeight));
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
      case JFXCssPackage.FONT_VALUE__WEIGHT:
        return basicSetWeight(null, msgs);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT_STRING:
        return getStyleOrWeightString();
      case JFXCssPackage.FONT_VALUE__WEIGHT:
        return getWeight();
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT_STRING:
        setStyleOrWeightString((String)newValue);
        return;
      case JFXCssPackage.FONT_VALUE__WEIGHT:
        setWeight((IntegerProperty)newValue);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT_STRING:
        setStyleOrWeightString(STYLE_OR_WEIGHT_STRING_EDEFAULT);
        return;
      case JFXCssPackage.FONT_VALUE__WEIGHT:
        setWeight((IntegerProperty)null);
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
      case JFXCssPackage.FONT_VALUE__STYLE_OR_WEIGHT_STRING:
        return STYLE_OR_WEIGHT_STRING_EDEFAULT == null ? styleOrWeightString != null : !STYLE_OR_WEIGHT_STRING_EDEFAULT.equals(styleOrWeightString);
      case JFXCssPackage.FONT_VALUE__WEIGHT:
        return weight != null;
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
    result.append(" (styleOrWeightString: ");
    result.append(styleOrWeightString);
    result.append(')');
    return result.toString();
  }

} //FontValueImpl
