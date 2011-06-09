/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementId;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementName;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected ElementName element;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected ElementId id;

  /**
   * The cached value of the '{@link #getPseudoClass() <em>Pseudo Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoClass()
   * @generated
   * @ordered
   */
  protected ElementPseudoClass pseudoClass;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected ElementClass class_;

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
  public ElementName getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(ElementName newElement, NotificationChain msgs)
  {
    ElementName oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(ElementName newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementId getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(ElementId newId, NotificationChain msgs)
  {
    ElementId oldId = id;
    id = newId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(ElementId newId)
  {
    if (newId != id)
    {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementPseudoClass getPseudoClass()
  {
    return pseudoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPseudoClass(ElementPseudoClass newPseudoClass, NotificationChain msgs)
  {
    ElementPseudoClass oldPseudoClass = pseudoClass;
    pseudoClass = newPseudoClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS, oldPseudoClass, newPseudoClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPseudoClass(ElementPseudoClass newPseudoClass)
  {
    if (newPseudoClass != pseudoClass)
    {
      NotificationChain msgs = null;
      if (pseudoClass != null)
        msgs = ((InternalEObject)pseudoClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS, null, msgs);
      if (newPseudoClass != null)
        msgs = ((InternalEObject)newPseudoClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS, null, msgs);
      msgs = basicSetPseudoClass(newPseudoClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS, newPseudoClass, newPseudoClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementClass getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(ElementClass newClass, NotificationChain msgs)
  {
    ElementClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(ElementClass newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFXCssPackage.SIMPLE_SELECTOR__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JFXCssPackage.SIMPLE_SELECTOR__CLASS, newClass, newClass));
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
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        return basicSetElement(null, msgs);
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        return basicSetId(null, msgs);
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        return basicSetPseudoClass(null, msgs);
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        return basicSetClass(null, msgs);
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JFXCssPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement((ElementName)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        setId((ElementId)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        setPseudoClass((ElementPseudoClass)newValue);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        setClass((ElementClass)newValue);
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
        setElement((ElementName)null);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        setId((ElementId)null);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        setPseudoClass((ElementPseudoClass)null);
        return;
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        setClass((ElementClass)null);
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
        return element != null;
      case JFXCssPackage.SIMPLE_SELECTOR__ID:
        return id != null;
      case JFXCssPackage.SIMPLE_SELECTOR__PSEUDO_CLASS:
        return pseudoClass != null;
      case JFXCssPackage.SIMPLE_SELECTOR__CLASS:
        return class_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleSelectorImpl
