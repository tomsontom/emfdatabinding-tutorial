/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue;
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
 * An implementation of the model object '<em><b>Bg Position Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl#getAbsx <em>Absx</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl#getRelx <em>Relx</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl#getAbsy <em>Absy</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl#getRely <em>Rely</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BgPositionValueImpl extends MinimalEObjectImpl.Container implements BgPositionValue
{
  /**
   * The cached value of the '{@link #getAbsx() <em>Absx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsx()
   * @generated
   * @ordered
   */
  protected SizeValue absx;

  /**
   * The default value of the '{@link #getRelx() <em>Relx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelx()
   * @generated
   * @ordered
   */
  protected static final String RELX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelx() <em>Relx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelx()
   * @generated
   * @ordered
   */
  protected String relx = RELX_EDEFAULT;

  /**
   * The cached value of the '{@link #getAbsy() <em>Absy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsy()
   * @generated
   * @ordered
   */
  protected SizeValue absy;

  /**
   * The default value of the '{@link #getRely() <em>Rely</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRely()
   * @generated
   * @ordered
   */
  protected static final String RELY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRely() <em>Rely</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRely()
   * @generated
   * @ordered
   */
  protected String rely = RELY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BgPositionValueImpl()
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
    return JFXCssPackage.Literals.BG_POSITION_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue getAbsx()
  {
    return absx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsx(SizeValue newAbsx, NotificationChain msgs)
  {
    SizeValue oldAbsx = absx;
    absx = newAbsx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__ABSX, oldAbsx, newAbsx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsx(SizeValue newAbsx)
  {
    if (newAbsx != absx)
    {
      NotificationChain msgs = null;
      if (absx != null)
        msgs = ((InternalEObject)absx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_POSITION_VALUE__ABSX, null, msgs);
      if (newAbsx != null)
        msgs = ((InternalEObject)newAbsx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_POSITION_VALUE__ABSX, null, msgs);
      msgs = basicSetAbsx(newAbsx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__ABSX, newAbsx, newAbsx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelx()
  {
    return relx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelx(String newRelx)
  {
    String oldRelx = relx;
    relx = newRelx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__RELX, oldRelx, relx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue getAbsy()
  {
    return absy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsy(SizeValue newAbsy, NotificationChain msgs)
  {
    SizeValue oldAbsy = absy;
    absy = newAbsy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__ABSY, oldAbsy, newAbsy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsy(SizeValue newAbsy)
  {
    if (newAbsy != absy)
    {
      NotificationChain msgs = null;
      if (absy != null)
        msgs = ((InternalEObject)absy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_POSITION_VALUE__ABSY, null, msgs);
      if (newAbsy != null)
        msgs = ((InternalEObject)newAbsy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_POSITION_VALUE__ABSY, null, msgs);
      msgs = basicSetAbsy(newAbsy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__ABSY, newAbsy, newAbsy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRely()
  {
    return rely;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRely(String newRely)
  {
    String oldRely = rely;
    rely = newRely;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_POSITION_VALUE__RELY, oldRely, rely));
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
      case JFXCssPackage.BG_POSITION_VALUE__ABSX:
        return basicSetAbsx(null, msgs);
      case JFXCssPackage.BG_POSITION_VALUE__ABSY:
        return basicSetAbsy(null, msgs);
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
      case JFXCssPackage.BG_POSITION_VALUE__ABSX:
        return getAbsx();
      case JFXCssPackage.BG_POSITION_VALUE__RELX:
        return getRelx();
      case JFXCssPackage.BG_POSITION_VALUE__ABSY:
        return getAbsy();
      case JFXCssPackage.BG_POSITION_VALUE__RELY:
        return getRely();
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
      case JFXCssPackage.BG_POSITION_VALUE__ABSX:
        setAbsx((SizeValue)newValue);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__RELX:
        setRelx((String)newValue);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__ABSY:
        setAbsy((SizeValue)newValue);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__RELY:
        setRely((String)newValue);
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
      case JFXCssPackage.BG_POSITION_VALUE__ABSX:
        setAbsx((SizeValue)null);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__RELX:
        setRelx(RELX_EDEFAULT);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__ABSY:
        setAbsy((SizeValue)null);
        return;
      case JFXCssPackage.BG_POSITION_VALUE__RELY:
        setRely(RELY_EDEFAULT);
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
      case JFXCssPackage.BG_POSITION_VALUE__ABSX:
        return absx != null;
      case JFXCssPackage.BG_POSITION_VALUE__RELX:
        return RELX_EDEFAULT == null ? relx != null : !RELX_EDEFAULT.equals(relx);
      case JFXCssPackage.BG_POSITION_VALUE__ABSY:
        return absy != null;
      case JFXCssPackage.BG_POSITION_VALUE__RELY:
        return RELY_EDEFAULT == null ? rely != null : !RELY_EDEFAULT.equals(rely);
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
    result.append(" (relx: ");
    result.append(relx);
    result.append(", rely: ");
    result.append(rely);
    result.append(')');
    return result.toString();
  }

} //BgPositionValueImpl
