/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSB Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HSBColorImpl extends ColorValueImpl implements HSBColor
{
  /**
   * The cached value of the '{@link #getHue() <em>Hue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHue()
   * @generated
   * @ordered
   */
  protected NumberValue hue;

  /**
   * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturation()
   * @generated
   * @ordered
   */
  protected NumberValue saturation;

  /**
   * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrightness()
   * @generated
   * @ordered
   */
  protected NumberValue brightness;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected NumberValue alpha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HSBColorImpl()
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
    return JFXCssPackage.Literals.HSB_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getHue()
  {
    return hue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHue(NumberValue newHue, NotificationChain msgs)
  {
    NumberValue oldHue = hue;
    hue = newHue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__HUE, oldHue, newHue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHue(NumberValue newHue)
  {
    if (newHue != hue)
    {
      NotificationChain msgs = null;
      if (hue != null)
        msgs = ((InternalEObject)hue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__HUE, null, msgs);
      if (newHue != null)
        msgs = ((InternalEObject)newHue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__HUE, null, msgs);
      msgs = basicSetHue(newHue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__HUE, newHue, newHue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getSaturation()
  {
    return saturation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSaturation(NumberValue newSaturation, NotificationChain msgs)
  {
    NumberValue oldSaturation = saturation;
    saturation = newSaturation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__SATURATION, oldSaturation, newSaturation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSaturation(NumberValue newSaturation)
  {
    if (newSaturation != saturation)
    {
      NotificationChain msgs = null;
      if (saturation != null)
        msgs = ((InternalEObject)saturation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__SATURATION, null, msgs);
      if (newSaturation != null)
        msgs = ((InternalEObject)newSaturation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__SATURATION, null, msgs);
      msgs = basicSetSaturation(newSaturation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__SATURATION, newSaturation, newSaturation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getBrightness()
  {
    return brightness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBrightness(NumberValue newBrightness, NotificationChain msgs)
  {
    NumberValue oldBrightness = brightness;
    brightness = newBrightness;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__BRIGHTNESS, oldBrightness, newBrightness);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrightness(NumberValue newBrightness)
  {
    if (newBrightness != brightness)
    {
      NotificationChain msgs = null;
      if (brightness != null)
        msgs = ((InternalEObject)brightness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__BRIGHTNESS, null, msgs);
      if (newBrightness != null)
        msgs = ((InternalEObject)newBrightness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__BRIGHTNESS, null, msgs);
      msgs = basicSetBrightness(newBrightness, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__BRIGHTNESS, newBrightness, newBrightness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlpha(NumberValue newAlpha, NotificationChain msgs)
  {
    NumberValue oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__ALPHA, oldAlpha, newAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(NumberValue newAlpha)
  {
    if (newAlpha != alpha)
    {
      NotificationChain msgs = null;
      if (alpha != null)
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.HSB_COLOR__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.HSB_COLOR__ALPHA, newAlpha, newAlpha));
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
      case JFXCssPackage.HSB_COLOR__HUE:
        return basicSetHue(null, msgs);
      case JFXCssPackage.HSB_COLOR__SATURATION:
        return basicSetSaturation(null, msgs);
      case JFXCssPackage.HSB_COLOR__BRIGHTNESS:
        return basicSetBrightness(null, msgs);
      case JFXCssPackage.HSB_COLOR__ALPHA:
        return basicSetAlpha(null, msgs);
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
      case JFXCssPackage.HSB_COLOR__HUE:
        return getHue();
      case JFXCssPackage.HSB_COLOR__SATURATION:
        return getSaturation();
      case JFXCssPackage.HSB_COLOR__BRIGHTNESS:
        return getBrightness();
      case JFXCssPackage.HSB_COLOR__ALPHA:
        return getAlpha();
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
      case JFXCssPackage.HSB_COLOR__HUE:
        setHue((NumberValue)newValue);
        return;
      case JFXCssPackage.HSB_COLOR__SATURATION:
        setSaturation((NumberValue)newValue);
        return;
      case JFXCssPackage.HSB_COLOR__BRIGHTNESS:
        setBrightness((NumberValue)newValue);
        return;
      case JFXCssPackage.HSB_COLOR__ALPHA:
        setAlpha((NumberValue)newValue);
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
      case JFXCssPackage.HSB_COLOR__HUE:
        setHue((NumberValue)null);
        return;
      case JFXCssPackage.HSB_COLOR__SATURATION:
        setSaturation((NumberValue)null);
        return;
      case JFXCssPackage.HSB_COLOR__BRIGHTNESS:
        setBrightness((NumberValue)null);
        return;
      case JFXCssPackage.HSB_COLOR__ALPHA:
        setAlpha((NumberValue)null);
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
      case JFXCssPackage.HSB_COLOR__HUE:
        return hue != null;
      case JFXCssPackage.HSB_COLOR__SATURATION:
        return saturation != null;
      case JFXCssPackage.HSB_COLOR__BRIGHTNESS:
        return brightness != null;
      case JFXCssPackage.HSB_COLOR__ALPHA:
        return alpha != null;
    }
    return super.eIsSet(featureID);
  }

} //HSBColorImpl
