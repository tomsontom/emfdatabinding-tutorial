/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue;
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
 * An implementation of the model object '<em><b>Border Style Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl#getDashStyle <em>Dash Style</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl#getMiterAbs <em>Miter Abs</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl#getMiterPredefined <em>Miter Predefined</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl#getLineCap <em>Line Cap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderStyleValueImpl extends MinimalEObjectImpl.Container implements BorderStyleValue
{
  /**
   * The cached value of the '{@link #getDashStyle() <em>Dash Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDashStyle()
   * @generated
   * @ordered
   */
  protected DashStyleValue dashStyle;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMiterAbs() <em>Miter Abs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterAbs()
   * @generated
   * @ordered
   */
  protected NumberValue miterAbs;

  /**
   * The default value of the '{@link #getMiterPredefined() <em>Miter Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterPredefined()
   * @generated
   * @ordered
   */
  protected static final String MITER_PREDEFINED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiterPredefined() <em>Miter Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterPredefined()
   * @generated
   * @ordered
   */
  protected String miterPredefined = MITER_PREDEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineCap()
   * @generated
   * @ordered
   */
  protected static final String LINE_CAP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineCap()
   * @generated
   * @ordered
   */
  protected String lineCap = LINE_CAP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BorderStyleValueImpl()
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
    return JFXCssPackage.Literals.BORDER_STYLE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DashStyleValue getDashStyle()
  {
    return dashStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDashStyle(DashStyleValue newDashStyle, NotificationChain msgs)
  {
    DashStyleValue oldDashStyle = dashStyle;
    dashStyle = newDashStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE, oldDashStyle, newDashStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDashStyle(DashStyleValue newDashStyle)
  {
    if (newDashStyle != dashStyle)
    {
      NotificationChain msgs = null;
      if (dashStyle != null)
        msgs = ((InternalEObject)dashStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE, null, msgs);
      if (newDashStyle != null)
        msgs = ((InternalEObject)newDashStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE, null, msgs);
      msgs = basicSetDashStyle(newDashStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE, newDashStyle, newDashStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getMiterAbs()
  {
    return miterAbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMiterAbs(NumberValue newMiterAbs, NotificationChain msgs)
  {
    NumberValue oldMiterAbs = miterAbs;
    miterAbs = newMiterAbs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS, oldMiterAbs, newMiterAbs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiterAbs(NumberValue newMiterAbs)
  {
    if (newMiterAbs != miterAbs)
    {
      NotificationChain msgs = null;
      if (miterAbs != null)
        msgs = ((InternalEObject)miterAbs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS, null, msgs);
      if (newMiterAbs != null)
        msgs = ((InternalEObject)newMiterAbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS, null, msgs);
      msgs = basicSetMiterAbs(newMiterAbs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS, newMiterAbs, newMiterAbs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiterPredefined()
  {
    return miterPredefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiterPredefined(String newMiterPredefined)
  {
    String oldMiterPredefined = miterPredefined;
    miterPredefined = newMiterPredefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__MITER_PREDEFINED, oldMiterPredefined, miterPredefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLineCap()
  {
    return lineCap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineCap(String newLineCap)
  {
    String oldLineCap = lineCap;
    lineCap = newLineCap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BORDER_STYLE_VALUE__LINE_CAP, oldLineCap, lineCap));
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
      case JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE:
        return basicSetDashStyle(null, msgs);
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS:
        return basicSetMiterAbs(null, msgs);
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
      case JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE:
        return getDashStyle();
      case JFXCssPackage.BORDER_STYLE_VALUE__LOCATION:
        return getLocation();
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS:
        return getMiterAbs();
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_PREDEFINED:
        return getMiterPredefined();
      case JFXCssPackage.BORDER_STYLE_VALUE__LINE_CAP:
        return getLineCap();
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
      case JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE:
        setDashStyle((DashStyleValue)newValue);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__LOCATION:
        setLocation((String)newValue);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS:
        setMiterAbs((NumberValue)newValue);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_PREDEFINED:
        setMiterPredefined((String)newValue);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__LINE_CAP:
        setLineCap((String)newValue);
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
      case JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE:
        setDashStyle((DashStyleValue)null);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS:
        setMiterAbs((NumberValue)null);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_PREDEFINED:
        setMiterPredefined(MITER_PREDEFINED_EDEFAULT);
        return;
      case JFXCssPackage.BORDER_STYLE_VALUE__LINE_CAP:
        setLineCap(LINE_CAP_EDEFAULT);
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
      case JFXCssPackage.BORDER_STYLE_VALUE__DASH_STYLE:
        return dashStyle != null;
      case JFXCssPackage.BORDER_STYLE_VALUE__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_ABS:
        return miterAbs != null;
      case JFXCssPackage.BORDER_STYLE_VALUE__MITER_PREDEFINED:
        return MITER_PREDEFINED_EDEFAULT == null ? miterPredefined != null : !MITER_PREDEFINED_EDEFAULT.equals(miterPredefined);
      case JFXCssPackage.BORDER_STYLE_VALUE__LINE_CAP:
        return LINE_CAP_EDEFAULT == null ? lineCap != null : !LINE_CAP_EDEFAULT.equals(lineCap);
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
    result.append(" (location: ");
    result.append(location);
    result.append(", miterPredefined: ");
    result.append(miterPredefined);
    result.append(", lineCap: ");
    result.append(lineCap);
    result.append(')');
    return result.toString();
  }

} //BorderStyleValueImpl
