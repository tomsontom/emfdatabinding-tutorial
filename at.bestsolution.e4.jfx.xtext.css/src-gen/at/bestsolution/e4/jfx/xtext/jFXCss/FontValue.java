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
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeightString <em>Style Or Weight String</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getWeight <em>Weight</em>}</li>
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
   * Returns the value of the '<em><b>Style Or Weight String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Or Weight String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Or Weight String</em>' attribute.
   * @see #setStyleOrWeightString(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue_StyleOrWeightString()
   * @model
   * @generated
   */
  String getStyleOrWeightString();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeightString <em>Style Or Weight String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style Or Weight String</em>' attribute.
   * @see #getStyleOrWeightString()
   * @generated
   */
  void setStyleOrWeightString(String value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' containment reference.
   * @see #setWeight(IntegerProperty)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getFontValue_Weight()
   * @model containment="true"
   * @generated
   */
  IntegerProperty getWeight();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getWeight <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' containment reference.
   * @see #getWeight()
   * @generated
   */
  void setWeight(IntegerProperty value);

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
