/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue;
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
 * An implementation of the model object '<em><b>Bg Size Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl#getXsize <em>Xsize</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl#getXauto <em>Xauto</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl#getYsize <em>Ysize</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl#getYauto <em>Yauto</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl#getPredefined <em>Predefined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BgSizeValueImpl extends MinimalEObjectImpl.Container implements BgSizeValue
{
  /**
   * The cached value of the '{@link #getXsize() <em>Xsize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXsize()
   * @generated
   * @ordered
   */
  protected SizeValue xsize;

  /**
   * The default value of the '{@link #getXauto() <em>Xauto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXauto()
   * @generated
   * @ordered
   */
  protected static final String XAUTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXauto() <em>Xauto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXauto()
   * @generated
   * @ordered
   */
  protected String xauto = XAUTO_EDEFAULT;

  /**
   * The cached value of the '{@link #getYsize() <em>Ysize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYsize()
   * @generated
   * @ordered
   */
  protected SizeValue ysize;

  /**
   * The default value of the '{@link #getYauto() <em>Yauto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYauto()
   * @generated
   * @ordered
   */
  protected static final String YAUTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYauto() <em>Yauto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYauto()
   * @generated
   * @ordered
   */
  protected String yauto = YAUTO_EDEFAULT;

  /**
   * The default value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected static final String PREDEFINED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected String predefined = PREDEFINED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BgSizeValueImpl()
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
    return JFXCssPackage.Literals.BG_SIZE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue getXsize()
  {
    return xsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXsize(SizeValue newXsize, NotificationChain msgs)
  {
    SizeValue oldXsize = xsize;
    xsize = newXsize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__XSIZE, oldXsize, newXsize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXsize(SizeValue newXsize)
  {
    if (newXsize != xsize)
    {
      NotificationChain msgs = null;
      if (xsize != null)
        msgs = ((InternalEObject)xsize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_SIZE_VALUE__XSIZE, null, msgs);
      if (newXsize != null)
        msgs = ((InternalEObject)newXsize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_SIZE_VALUE__XSIZE, null, msgs);
      msgs = basicSetXsize(newXsize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__XSIZE, newXsize, newXsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXauto()
  {
    return xauto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXauto(String newXauto)
  {
    String oldXauto = xauto;
    xauto = newXauto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__XAUTO, oldXauto, xauto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue getYsize()
  {
    return ysize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYsize(SizeValue newYsize, NotificationChain msgs)
  {
    SizeValue oldYsize = ysize;
    ysize = newYsize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__YSIZE, oldYsize, newYsize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYsize(SizeValue newYsize)
  {
    if (newYsize != ysize)
    {
      NotificationChain msgs = null;
      if (ysize != null)
        msgs = ((InternalEObject)ysize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_SIZE_VALUE__YSIZE, null, msgs);
      if (newYsize != null)
        msgs = ((InternalEObject)newYsize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.BG_SIZE_VALUE__YSIZE, null, msgs);
      msgs = basicSetYsize(newYsize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__YSIZE, newYsize, newYsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYauto()
  {
    return yauto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYauto(String newYauto)
  {
    String oldYauto = yauto;
    yauto = newYauto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__YAUTO, oldYauto, yauto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPredefined()
  {
    return predefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefined(String newPredefined)
  {
    String oldPredefined = predefined;
    predefined = newPredefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.BG_SIZE_VALUE__PREDEFINED, oldPredefined, predefined));
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
      case JFXCssPackage.BG_SIZE_VALUE__XSIZE:
        return basicSetXsize(null, msgs);
      case JFXCssPackage.BG_SIZE_VALUE__YSIZE:
        return basicSetYsize(null, msgs);
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
      case JFXCssPackage.BG_SIZE_VALUE__XSIZE:
        return getXsize();
      case JFXCssPackage.BG_SIZE_VALUE__XAUTO:
        return getXauto();
      case JFXCssPackage.BG_SIZE_VALUE__YSIZE:
        return getYsize();
      case JFXCssPackage.BG_SIZE_VALUE__YAUTO:
        return getYauto();
      case JFXCssPackage.BG_SIZE_VALUE__PREDEFINED:
        return getPredefined();
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
      case JFXCssPackage.BG_SIZE_VALUE__XSIZE:
        setXsize((SizeValue)newValue);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__XAUTO:
        setXauto((String)newValue);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__YSIZE:
        setYsize((SizeValue)newValue);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__YAUTO:
        setYauto((String)newValue);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__PREDEFINED:
        setPredefined((String)newValue);
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
      case JFXCssPackage.BG_SIZE_VALUE__XSIZE:
        setXsize((SizeValue)null);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__XAUTO:
        setXauto(XAUTO_EDEFAULT);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__YSIZE:
        setYsize((SizeValue)null);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__YAUTO:
        setYauto(YAUTO_EDEFAULT);
        return;
      case JFXCssPackage.BG_SIZE_VALUE__PREDEFINED:
        setPredefined(PREDEFINED_EDEFAULT);
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
      case JFXCssPackage.BG_SIZE_VALUE__XSIZE:
        return xsize != null;
      case JFXCssPackage.BG_SIZE_VALUE__XAUTO:
        return XAUTO_EDEFAULT == null ? xauto != null : !XAUTO_EDEFAULT.equals(xauto);
      case JFXCssPackage.BG_SIZE_VALUE__YSIZE:
        return ysize != null;
      case JFXCssPackage.BG_SIZE_VALUE__YAUTO:
        return YAUTO_EDEFAULT == null ? yauto != null : !YAUTO_EDEFAULT.equals(yauto);
      case JFXCssPackage.BG_SIZE_VALUE__PREDEFINED:
        return PREDEFINED_EDEFAULT == null ? predefined != null : !PREDEFINED_EDEFAULT.equals(predefined);
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
    result.append(" (xauto: ");
    result.append(xauto);
    result.append(", yauto: ");
    result.append(yauto);
    result.append(", predefined: ");
    result.append(predefined);
    result.append(')');
    return result.toString();
  }

} //BgSizeValueImpl
