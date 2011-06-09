/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.Effect;
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
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl#getBlur <em>Blur</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl#getBlurRadius <em>Blur Radius</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl#getOffsetY <em>Offset Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect
{
  /**
   * The cached value of the '{@link #getBlur() <em>Blur</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlur()
   * @generated
   * @ordered
   */
  protected BlurValue blur;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected ColorValue color;

  /**
   * The cached value of the '{@link #getBlurRadius() <em>Blur Radius</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlurRadius()
   * @generated
   * @ordered
   */
  protected NumberValue blurRadius;

  /**
   * The cached value of the '{@link #getOffsetX() <em>Offset X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetX()
   * @generated
   * @ordered
   */
  protected NumberValue offsetX;

  /**
   * The cached value of the '{@link #getOffsetY() <em>Offset Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetY()
   * @generated
   * @ordered
   */
  protected NumberValue offsetY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectImpl()
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
    return JFXCssPackage.Literals.EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlurValue getBlur()
  {
    return blur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlur(BlurValue newBlur, NotificationChain msgs)
  {
    BlurValue oldBlur = blur;
    blur = newBlur;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__BLUR, oldBlur, newBlur);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlur(BlurValue newBlur)
  {
    if (newBlur != blur)
    {
      NotificationChain msgs = null;
      if (blur != null)
        msgs = ((InternalEObject)blur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__BLUR, null, msgs);
      if (newBlur != null)
        msgs = ((InternalEObject)newBlur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__BLUR, null, msgs);
      msgs = basicSetBlur(newBlur, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__BLUR, newBlur, newBlur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValue getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(ColorValue newColor, NotificationChain msgs)
  {
    ColorValue oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(ColorValue newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getBlurRadius()
  {
    return blurRadius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlurRadius(NumberValue newBlurRadius, NotificationChain msgs)
  {
    NumberValue oldBlurRadius = blurRadius;
    blurRadius = newBlurRadius;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__BLUR_RADIUS, oldBlurRadius, newBlurRadius);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlurRadius(NumberValue newBlurRadius)
  {
    if (newBlurRadius != blurRadius)
    {
      NotificationChain msgs = null;
      if (blurRadius != null)
        msgs = ((InternalEObject)blurRadius).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__BLUR_RADIUS, null, msgs);
      if (newBlurRadius != null)
        msgs = ((InternalEObject)newBlurRadius).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__BLUR_RADIUS, null, msgs);
      msgs = basicSetBlurRadius(newBlurRadius, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__BLUR_RADIUS, newBlurRadius, newBlurRadius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getOffsetX()
  {
    return offsetX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOffsetX(NumberValue newOffsetX, NotificationChain msgs)
  {
    NumberValue oldOffsetX = offsetX;
    offsetX = newOffsetX;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__OFFSET_X, oldOffsetX, newOffsetX);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffsetX(NumberValue newOffsetX)
  {
    if (newOffsetX != offsetX)
    {
      NotificationChain msgs = null;
      if (offsetX != null)
        msgs = ((InternalEObject)offsetX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__OFFSET_X, null, msgs);
      if (newOffsetX != null)
        msgs = ((InternalEObject)newOffsetX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__OFFSET_X, null, msgs);
      msgs = basicSetOffsetX(newOffsetX, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__OFFSET_X, newOffsetX, newOffsetX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getOffsetY()
  {
    return offsetY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOffsetY(NumberValue newOffsetY, NotificationChain msgs)
  {
    NumberValue oldOffsetY = offsetY;
    offsetY = newOffsetY;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__OFFSET_Y, oldOffsetY, newOffsetY);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffsetY(NumberValue newOffsetY)
  {
    if (newOffsetY != offsetY)
    {
      NotificationChain msgs = null;
      if (offsetY != null)
        msgs = ((InternalEObject)offsetY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__OFFSET_Y, null, msgs);
      if (newOffsetY != null)
        msgs = ((InternalEObject)newOffsetY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT__OFFSET_Y, null, msgs);
      msgs = basicSetOffsetY(newOffsetY, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT__OFFSET_Y, newOffsetY, newOffsetY));
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
      case JFXCssPackage.EFFECT__BLUR:
        return basicSetBlur(null, msgs);
      case JFXCssPackage.EFFECT__COLOR:
        return basicSetColor(null, msgs);
      case JFXCssPackage.EFFECT__BLUR_RADIUS:
        return basicSetBlurRadius(null, msgs);
      case JFXCssPackage.EFFECT__OFFSET_X:
        return basicSetOffsetX(null, msgs);
      case JFXCssPackage.EFFECT__OFFSET_Y:
        return basicSetOffsetY(null, msgs);
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
      case JFXCssPackage.EFFECT__BLUR:
        return getBlur();
      case JFXCssPackage.EFFECT__COLOR:
        return getColor();
      case JFXCssPackage.EFFECT__BLUR_RADIUS:
        return getBlurRadius();
      case JFXCssPackage.EFFECT__OFFSET_X:
        return getOffsetX();
      case JFXCssPackage.EFFECT__OFFSET_Y:
        return getOffsetY();
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
      case JFXCssPackage.EFFECT__BLUR:
        setBlur((BlurValue)newValue);
        return;
      case JFXCssPackage.EFFECT__COLOR:
        setColor((ColorValue)newValue);
        return;
      case JFXCssPackage.EFFECT__BLUR_RADIUS:
        setBlurRadius((NumberValue)newValue);
        return;
      case JFXCssPackage.EFFECT__OFFSET_X:
        setOffsetX((NumberValue)newValue);
        return;
      case JFXCssPackage.EFFECT__OFFSET_Y:
        setOffsetY((NumberValue)newValue);
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
      case JFXCssPackage.EFFECT__BLUR:
        setBlur((BlurValue)null);
        return;
      case JFXCssPackage.EFFECT__COLOR:
        setColor((ColorValue)null);
        return;
      case JFXCssPackage.EFFECT__BLUR_RADIUS:
        setBlurRadius((NumberValue)null);
        return;
      case JFXCssPackage.EFFECT__OFFSET_X:
        setOffsetX((NumberValue)null);
        return;
      case JFXCssPackage.EFFECT__OFFSET_Y:
        setOffsetY((NumberValue)null);
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
      case JFXCssPackage.EFFECT__BLUR:
        return blur != null;
      case JFXCssPackage.EFFECT__COLOR:
        return color != null;
      case JFXCssPackage.EFFECT__BLUR_RADIUS:
        return blurRadius != null;
      case JFXCssPackage.EFFECT__OFFSET_X:
        return offsetX != null;
      case JFXCssPackage.EFFECT__OFFSET_Y:
        return offsetY != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectImpl
