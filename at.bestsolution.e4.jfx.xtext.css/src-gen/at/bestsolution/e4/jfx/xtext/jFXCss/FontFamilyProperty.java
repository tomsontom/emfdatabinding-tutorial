/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Family Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontFamilyProperty()
 * @model
 * @generated
 */
public interface FontFamilyProperty extends FXProperty
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
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontFamilyProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getProperty <em>Property</em>}' attribute.
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
   * @see #setValue(FontFamily)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontFamilyProperty_Value()
   * @model containment="true"
   * @generated
   */
  FontFamily getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(FontFamily value);

} // FontFamilyProperty
