/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getPseudoClass <em>Pseudo Class</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSimpleSelector()
 * @model
 * @generated
 */
public interface SimpleSelector extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(ElementName)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSimpleSelector_Element()
   * @model containment="true"
   * @generated
   */
  ElementName getElement();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElementName value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(ElementId)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSimpleSelector_Id()
   * @model containment="true"
   * @generated
   */
  ElementId getId();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(ElementId value);

  /**
   * Returns the value of the '<em><b>Pseudo Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Class</em>' containment reference.
   * @see #setPseudoClass(ElementPseudoClass)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSimpleSelector_PseudoClass()
   * @model containment="true"
   * @generated
   */
  ElementPseudoClass getPseudoClass();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getPseudoClass <em>Pseudo Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo Class</em>' containment reference.
   * @see #getPseudoClass()
   * @generated
   */
  void setPseudoClass(ElementPseudoClass value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(ElementClass)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSimpleSelector_Class()
   * @model containment="true"
   * @generated
   */
  ElementClass getClass_();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(ElementClass value);

} // SimpleSelector
