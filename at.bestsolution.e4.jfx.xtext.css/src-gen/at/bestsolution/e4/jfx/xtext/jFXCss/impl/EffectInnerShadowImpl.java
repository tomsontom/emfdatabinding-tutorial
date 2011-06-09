/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Inner Shadow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectInnerShadowImpl#getChoke <em>Choke</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectInnerShadowImpl extends EffectImpl implements EffectInnerShadow
{
  /**
   * The cached value of the '{@link #getChoke() <em>Choke</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoke()
   * @generated
   * @ordered
   */
  protected NumberValue choke;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectInnerShadowImpl()
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
    return JFXCssPackage.Literals.EFFECT_INNER_SHADOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getChoke()
  {
    return choke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoke(NumberValue newChoke, NotificationChain msgs)
  {
    NumberValue oldChoke = choke;
    choke = newChoke;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE, oldChoke, newChoke);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoke(NumberValue newChoke)
  {
    if (newChoke != choke)
    {
      NotificationChain msgs = null;
      if (choke != null)
        msgs = ((InternalEObject)choke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE, null, msgs);
      if (newChoke != null)
        msgs = ((InternalEObject)newChoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE, null, msgs);
      msgs = basicSetChoke(newChoke, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE, newChoke, newChoke));
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
      case JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE:
        return basicSetChoke(null, msgs);
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
      case JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE:
        return getChoke();
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
      case JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE:
        setChoke((NumberValue)newValue);
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
      case JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE:
        setChoke((NumberValue)null);
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
      case JFXCssPackage.EFFECT_INNER_SHADOW__CHOKE:
        return choke != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectInnerShadowImpl
