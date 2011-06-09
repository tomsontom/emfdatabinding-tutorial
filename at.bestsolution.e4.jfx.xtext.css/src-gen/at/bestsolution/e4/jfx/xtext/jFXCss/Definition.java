/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getSelector <em>Selector</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.Selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getDefinition_Selector()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelector();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getDefinition_Properties()
   * @model containment="true"
   * @generated
   */
  EList<FXProperty> getProperties();

} // Definition
