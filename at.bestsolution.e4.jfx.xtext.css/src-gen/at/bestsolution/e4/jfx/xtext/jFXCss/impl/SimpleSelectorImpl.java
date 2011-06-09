/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl#getPseudoClass <em>Pseudo Class</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSelectorImpl extends MinimalEObjectImpl.Container implements SimpleSelector
{
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getPseudoClass() <em>Pseudo Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoClass()
   * @generated
   * @ordered
   */
  protected EList<ElementPseudoClass> pseudoClass;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleSelectorImpl()
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
    return JFXCssPackage.Literals.SIMPLE_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementPseudoClass> getPseudoClass()
  {
    if (pseudoClass == null)
    {
      pseudoClass = new EObjectContainmentEList<ElementPseudoClass>(ElementPseudoClass.class, this, JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS);
    }
    return pseudoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(String newClass)
  {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__CLASS, oldClass, class_));
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
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        return ((InternalEList<?>)getPseudoClass()).basicRemove(otherEnd, msgs);
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
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        return getElement();
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        return getId();
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        return getPseudoClass();
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        return getClass_();
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
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement((String)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        setId((String)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        getPseudoClass().clear();
        getPseudoClass().addAll((Collection<? extends ElementPseudoClass>)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        setClass((String)newValue);
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
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        setId(ID_EDEFAULT);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        getPseudoClass().clear();
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        setClass(CLASS_EDEFAULT);
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
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        return pseudoClass != null && !pseudoClass.isEmpty();
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
    result.append(" (element: ");
    result.append(element);
    result.append(", id: ");
    result.append(id);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //SimpleSelectorImpl
