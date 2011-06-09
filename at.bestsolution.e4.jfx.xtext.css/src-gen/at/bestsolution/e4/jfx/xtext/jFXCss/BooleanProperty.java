/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBooleanProperty()
 * @model
 * @generated
 */
public interface BooleanProperty extends FXProperty
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
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBooleanProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue
   * @see #setValue(BooleanValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBooleanProperty_Value()
   * @model
   * @generated
   */
  BooleanValue getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanValue value);

} // BooleanProperty
