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
 * A representation of the model object '<em><b>JFX Css</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getJFXCss()
 * @model
 * @generated
 */
public interface JFXCss extends EObject
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getJFXCss_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

} // JFXCss
