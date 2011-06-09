/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Weight Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueString <em>Value String</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueInt <em>Value Int</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontWeightValue()
 * @model
 * @generated
 */
public interface FontWeightValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value String</em>' attribute.
   * @see #setValueString(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontWeightValue_ValueString()
   * @model
   * @generated
   */
  String getValueString();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueString <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value String</em>' attribute.
   * @see #getValueString()
   * @generated
   */
  void setValueString(String value);

  /**
   * Returns the value of the '<em><b>Value Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Int</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Int</em>' containment reference.
   * @see #setValueInt(NumberValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontWeightValue_ValueInt()
   * @model containment="true"
   * @generated
   */
  NumberValue getValueInt();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueInt <em>Value Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Int</em>' containment reference.
   * @see #getValueInt()
   * @generated
   */
  void setValueInt(NumberValue value);

} // FontWeightValue
