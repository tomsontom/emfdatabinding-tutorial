/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getValue <em>Value</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeValue()
 * @model
 * @generated
 */
public interface SizeValue extends EObject
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
   * @see #setValue(NumberValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeValue_Value()
   * @model containment="true"
   * @generated
   */
  NumberValue getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumberValue value);

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute.
   * @see #setDimension(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getSizeValue_Dimension()
   * @model
   * @generated
   */
  String getDimension();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getDimension <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' attribute.
   * @see #getDimension()
   * @generated
   */
  void setDimension(String value);

} // SizeValue
