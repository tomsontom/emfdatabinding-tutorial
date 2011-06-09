/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Size Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getMultiSizeProperty()
 * @model
 * @generated
 */
public interface MultiSizeProperty extends FXProperty
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getMultiSizeProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

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
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getMultiSizeProperty_Value()
   * @model containment="true"
   * @generated
   */
  MultiSizeValue getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MultiSizeValue value);

} // MultiSizeProperty
