/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getValue <em>Value</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getFill <em>Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeFill()
 * @model
 * @generated
 */
public interface SizeFill extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(MultiSizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeFill_Value()
   * @model containment="true"
   * @generated
   */
  MultiSizeValue getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MultiSizeValue value);

  /**
   * Returns the value of the '<em><b>Fill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fill</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fill</em>' attribute.
   * @see #setFill(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeFill_Fill()
   * @model
   * @generated
   */
  String getFill();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getFill <em>Fill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fill</em>' attribute.
   * @see #getFill()
   * @generated
   */
  void setFill(String value);

} // SizeFill
