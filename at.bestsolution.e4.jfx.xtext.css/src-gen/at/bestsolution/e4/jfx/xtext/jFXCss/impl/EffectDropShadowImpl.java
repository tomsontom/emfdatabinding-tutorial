/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Drop Shadow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectDropShadowImpl#getSpread <em>Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectDropShadowImpl extends EffectImpl implements EffectDropShadow
{
  /**
   * The cached value of the '{@link #getSpread() <em>Spread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpread()
   * @generated
   * @ordered
   */
  protected NumberValue spread;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectDropShadowImpl()
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
    return JFXCssPackage.Literals.EFFECT_DROP_SHADOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getSpread()
  {
    return spread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpread(NumberValue newSpread, NotificationChain msgs)
  {
    NumberValue oldSpread = spread;
    spread = newSpread;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD, oldSpread, newSpread);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpread(NumberValue newSpread)
  {
    if (newSpread != spread)
    {
      NotificationChain msgs = null;
      if (spread != null)
        msgs = ((InternalEObject)spread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD, null, msgs);
      if (newSpread != null)
        msgs = ((InternalEObject)newSpread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD, null, msgs);
      msgs = basicSetSpread(newSpread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD, newSpread, newSpread));
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
      case JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD:
        return basicSetSpread(null, msgs);
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
      case JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD:
        return getSpread();
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
      case JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD:
        setSpread((NumberValue)newValue);
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
      case JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD:
        setSpread((NumberValue)null);
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
      case JFXCssPackage.EFFECT_DROP_SHADOW__SPREAD:
        return spread != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectDropShadowImpl
