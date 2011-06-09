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
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.Selector#getSimpleSelector <em>Simple Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Selector</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Selector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Selector</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSelector_SimpleSelector()
   * @model containment="true"
   * @generated
   */
  EList<SimpleSelector> getSimpleSelector();

} // Selector
