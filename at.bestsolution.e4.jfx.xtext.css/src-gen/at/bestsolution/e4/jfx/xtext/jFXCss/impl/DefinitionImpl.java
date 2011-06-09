/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.Definition;
import at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.Selector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected EList<Selector> selector;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<FXProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return JFXCssPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Selector> getSelector()
  {
    if (selector == null)
    {
      selector = new EObjectContainmentEList<Selector>(Selector.class, this, JFXCssPackage.DEFINITION__SELECTOR);
    }
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FXProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<FXProperty>(FXProperty.class, this, JFXCssPackage.DEFINITION__PROPERTIES);
    }
    return properties;
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
      case JFXCssPackage.DEFINITION__SELECTOR:
        return ((InternalEList<?>)getSelector()).basicRemove(otherEnd, msgs);
      case JFXCssPackage.DEFINITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case JFXCssPackage.DEFINITION__SELECTOR:
        return getSelector();
      case JFXCssPackage.DEFINITION__PROPERTIES:
        return getProperties();
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
      case JFXCssPackage.DEFINITION__SELECTOR:
        getSelector().clear();
        getSelector().addAll((Collection<? extends Selector>)newValue);
        return;
      case JFXCssPackage.DEFINITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends FXProperty>)newValue);
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
      case JFXCssPackage.DEFINITION__SELECTOR:
        getSelector().clear();
        return;
      case JFXCssPackage.DEFINITION__PROPERTIES:
        getProperties().clear();
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
      case JFXCssPackage.DEFINITION__SELECTOR:
        return selector != null && !selector.isEmpty();
      case JFXCssPackage.DEFINITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
