/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getHex <em>Hex</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getR <em>R</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getG <em>G</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getB <em>B</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getGp <em>Gp</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getBp <em>Bp</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RGBColorImpl extends ColorValueImpl implements RGBColor
{
  /**
   * The default value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected static final String HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected String hex = HEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected IntegerValue r;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected IntegerValue g;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected IntegerValue b;

  /**
   * The cached value of the '{@link #getRp() <em>Rp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRp()
   * @generated
   * @ordered
   */
  protected IntegerValue rp;

  /**
   * The cached value of the '{@link #getGp() <em>Gp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGp()
   * @generated
   * @ordered
   */
  protected IntegerValue gp;

  /**
   * The cached value of the '{@link #getBp() <em>Bp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBp()
   * @generated
   * @ordered
   */
  protected IntegerValue bp;

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
  protected RGBColorImpl()
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
    return JFXCssPackage.Literals.RGB_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHex()
  {
    return hex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHex(String newHex)
  {
    String oldHex = hex;
    hex = newHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__HEX, oldHex, hex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(IntegerValue newR, NotificationChain msgs)
  {
    IntegerValue oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__R, oldR, newR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(IntegerValue newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__R, newR, newR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetG(IntegerValue newG, NotificationChain msgs)
  {
    IntegerValue oldG = g;
    g = newG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__G, oldG, newG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(IntegerValue newG)
  {
    if (newG != g)
    {
      NotificationChain msgs = null;
      if (g != null)
        msgs = ((InternalEObject)g).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__G, null, msgs);
      if (newG != null)
        msgs = ((InternalEObject)newG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__G, null, msgs);
      msgs = basicSetG(newG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__G, newG, newG));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(IntegerValue newB, NotificationChain msgs)
  {
    IntegerValue oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(IntegerValue newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getRp()
  {
    return rp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRp(IntegerValue newRp, NotificationChain msgs)
  {
    IntegerValue oldRp = rp;
    rp = newRp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__RP, oldRp, newRp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRp(IntegerValue newRp)
  {
    if (newRp != rp)
    {
      NotificationChain msgs = null;
      if (rp != null)
        msgs = ((InternalEObject)rp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__RP, null, msgs);
      if (newRp != null)
        msgs = ((InternalEObject)newRp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__RP, null, msgs);
      msgs = basicSetRp(newRp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__RP, newRp, newRp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getGp()
  {
    return gp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGp(IntegerValue newGp, NotificationChain msgs)
  {
    IntegerValue oldGp = gp;
    gp = newGp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__GP, oldGp, newGp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGp(IntegerValue newGp)
  {
    if (newGp != gp)
    {
      NotificationChain msgs = null;
      if (gp != null)
        msgs = ((InternalEObject)gp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__GP, null, msgs);
      if (newGp != null)
        msgs = ((InternalEObject)newGp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__GP, null, msgs);
      msgs = basicSetGp(newGp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__GP, newGp, newGp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue getBp()
  {
    return bp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBp(IntegerValue newBp, NotificationChain msgs)
  {
    IntegerValue oldBp = bp;
    bp = newBp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__BP, oldBp, newBp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBp(IntegerValue newBp)
  {
    if (newBp != bp)
    {
      NotificationChain msgs = null;
      if (bp != null)
        msgs = ((InternalEObject)bp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__BP, null, msgs);
      if (newBp != null)
        msgs = ((InternalEObject)newBp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__BP, null, msgs);
      msgs = basicSetBp(newBp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__BP, newBp, newBp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__ALPHA, oldAlpha, newAlpha);
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
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.RGB_COLOR__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.RGB_COLOR__ALPHA, newAlpha, newAlpha));
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
      case JFXCssPackage.RGB_COLOR__R:
        return basicSetR(null, msgs);
      case JFXCssPackage.RGB_COLOR__G:
        return basicSetG(null, msgs);
      case JFXCssPackage.RGB_COLOR__B:
        return basicSetB(null, msgs);
      case JFXCssPackage.RGB_COLOR__RP:
        return basicSetRp(null, msgs);
      case JFXCssPackage.RGB_COLOR__GP:
        return basicSetGp(null, msgs);
      case JFXCssPackage.RGB_COLOR__BP:
        return basicSetBp(null, msgs);
      case JFXCssPackage.RGB_COLOR__ALPHA:
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
      case JFXCssPackage.RGB_COLOR__HEX:
        return getHex();
      case JFXCssPackage.RGB_COLOR__R:
        return getR();
      case JFXCssPackage.RGB_COLOR__G:
        return getG();
      case JFXCssPackage.RGB_COLOR__B:
        return getB();
      case JFXCssPackage.RGB_COLOR__RP:
        return getRp();
      case JFXCssPackage.RGB_COLOR__GP:
        return getGp();
      case JFXCssPackage.RGB_COLOR__BP:
        return getBp();
      case JFXCssPackage.RGB_COLOR__ALPHA:
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
      case JFXCssPackage.RGB_COLOR__HEX:
        setHex((String)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__R:
        setR((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__G:
        setG((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__B:
        setB((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__RP:
        setRp((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__GP:
        setGp((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__BP:
        setBp((IntegerValue)newValue);
        return;
      case JFXCssPackage.RGB_COLOR__ALPHA:
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
      case JFXCssPackage.RGB_COLOR__HEX:
        setHex(HEX_EDEFAULT);
        return;
      case JFXCssPackage.RGB_COLOR__R:
        setR((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__G:
        setG((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__B:
        setB((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__RP:
        setRp((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__GP:
        setGp((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__BP:
        setBp((IntegerValue)null);
        return;
      case JFXCssPackage.RGB_COLOR__ALPHA:
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
      case JFXCssPackage.RGB_COLOR__HEX:
        return HEX_EDEFAULT == null ? hex != null : !HEX_EDEFAULT.equals(hex);
      case JFXCssPackage.RGB_COLOR__R:
        return r != null;
      case JFXCssPackage.RGB_COLOR__G:
        return g != null;
      case JFXCssPackage.RGB_COLOR__B:
        return b != null;
      case JFXCssPackage.RGB_COLOR__RP:
        return rp != null;
      case JFXCssPackage.RGB_COLOR__GP:
        return gp != null;
      case JFXCssPackage.RGB_COLOR__BP:
        return bp != null;
      case JFXCssPackage.RGB_COLOR__ALPHA:
        return alpha != null;
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
    result.append(" (hex: ");
    result.append(hex);
    result.append(')');
    return result.toString();
  }

} //RGBColorImpl
