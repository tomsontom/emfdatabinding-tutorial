/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeight <em>Style Or Weight</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getSize <em>Size</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue()
 * @model
 * @generated
 */
public interface FontValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Style Or Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Or Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Or Weight</em>' attribute.
   * @see #setStyleOrWeight(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue_StyleOrWeight()
   * @model
   * @generated
   */
  String getStyleOrWeight();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeight <em>Style Or Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style Or Weight</em>' attribute.
   * @see #getStyleOrWeight()
   * @generated
   */
  void setStyleOrWeight(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(SizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue_Size()
   * @model containment="true"
   * @generated
   */
  SizeValue getSize();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(SizeValue value);

  /**
   * Returns the value of the '<em><b>Family</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Family</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Family</em>' containment reference.
   * @see #setFamily(FontFamily)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue_Family()
   * @model containment="true"
   * @generated
   */
  FontFamily getFamily();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getFamily <em>Family</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Family</em>' containment reference.
   * @see #getFamily()
   * @generated
   */
  void setFamily(FontFamily value);

} // FontValue
