/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl#getOrig <em>Orig</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl#getStopNumbers <em>Stop Numbers</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl#getStopColors <em>Stop Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorFunctionImpl extends ColorValueImpl implements ColorFunction
{
  /**
   * The cached value of the '{@link #getOrig() <em>Orig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrig()
   * @generated
   * @ordered
   */
  protected ColorValue orig;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected NumberValue mod;

  /**
   * The cached value of the '{@link #getStopNumbers() <em>Stop Numbers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopNumbers()
   * @generated
   * @ordered
   */
  protected EList<NumberValue> stopNumbers;

  /**
   * The cached value of the '{@link #getStopColors() <em>Stop Colors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopColors()
   * @generated
   * @ordered
   */
  protected EList<ColorValue> stopColors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorFunctionImpl()
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
    return JFXCssPackage.Literals.COLOR_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValue getOrig()
  {
    return orig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrig(ColorValue newOrig, NotificationChain msgs)
  {
    ColorValue oldOrig = orig;
    orig = newOrig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.COLOR_FUNCTION__ORIG, oldOrig, newOrig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrig(ColorValue newOrig)
  {
    if (newOrig != orig)
    {
      NotificationChain msgs = null;
      if (orig != null)
        msgs = ((InternalEObject)orig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.COLOR_FUNCTION__ORIG, null, msgs);
      if (newOrig != null)
        msgs = ((InternalEObject)newOrig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.COLOR_FUNCTION__ORIG, null, msgs);
      msgs = basicSetOrig(newOrig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.COLOR_FUNCTION__ORIG, newOrig, newOrig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMod(NumberValue newMod, NotificationChain msgs)
  {
    NumberValue oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.COLOR_FUNCTION__MOD, oldMod, newMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(NumberValue newMod)
  {
    if (newMod != mod)
    {
      NotificationChain msgs = null;
      if (mod != null)
        msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.COLOR_FUNCTION__MOD, null, msgs);
      if (newMod != null)
        msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.COLOR_FUNCTION__MOD, null, msgs);
      msgs = basicSetMod(newMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.COLOR_FUNCTION__MOD, newMod, newMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NumberValue> getStopNumbers()
  {
    if (stopNumbers == null)
    {
      stopNumbers = new EObjectContainmentEList<NumberValue>(NumberValue.class, this, JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS);
    }
    return stopNumbers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColorValue> getStopColors()
  {
    if (stopColors == null)
    {
      stopColors = new EObjectContainmentEList<ColorValue>(ColorValue.class, this, JFXCssPackage.COLOR_FUNCTION__STOP_COLORS);
    }
    return stopColors;
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
      case JFXCssPackage.COLOR_FUNCTION__ORIG:
        return basicSetOrig(null, msgs);
      case JFXCssPackage.COLOR_FUNCTION__MOD:
        return basicSetMod(null, msgs);
      case JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS:
        return ((InternalEList<?>)getStopNumbers()).basicRemove(otherEnd, msgs);
      case JFXCssPackage.COLOR_FUNCTION__STOP_COLORS:
        return ((InternalEList<?>)getStopColors()).basicRemove(otherEnd, msgs);
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
      case JFXCssPackage.COLOR_FUNCTION__ORIG:
        return getOrig();
      case JFXCssPackage.COLOR_FUNCTION__MOD:
        return getMod();
      case JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS:
        return getStopNumbers();
      case JFXCssPackage.COLOR_FUNCTION__STOP_COLORS:
        return getStopColors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JFXCssPackage.COLOR_FUNCTION__ORIG:
        setOrig((ColorValue)newValue);
        return;
      case JFXCssPackage.COLOR_FUNCTION__MOD:
        setMod((NumberValue)newValue);
        return;
      case JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS:
        getStopNumbers().clear();
        getStopNumbers().addAll((Collection<? extends NumberValue>)newValue);
        return;
      case JFXCssPackage.COLOR_FUNCTION__STOP_COLORS:
        getStopColors().clear();
        getStopColors().addAll((Collection<? extends ColorValue>)newValue);
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
      case JFXCssPackage.COLOR_FUNCTION__ORIG:
        setOrig((ColorValue)null);
        return;
      case JFXCssPackage.COLOR_FUNCTION__MOD:
        setMod((NumberValue)null);
        return;
      case JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS:
        getStopNumbers().clear();
        return;
      case JFXCssPackage.COLOR_FUNCTION__STOP_COLORS:
        getStopColors().clear();
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
      case JFXCssPackage.COLOR_FUNCTION__ORIG:
        return orig != null;
      case JFXCssPackage.COLOR_FUNCTION__MOD:
        return mod != null;
      case JFXCssPackage.COLOR_FUNCTION__STOP_NUMBERS:
        return stopNumbers != null && !stopNumbers.isEmpty();
      case JFXCssPackage.COLOR_FUNCTION__STOP_COLORS:
        return stopColors != null && !stopColors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ColorFunctionImpl
