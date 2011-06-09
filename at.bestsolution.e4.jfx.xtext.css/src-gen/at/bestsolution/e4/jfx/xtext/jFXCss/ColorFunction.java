/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getOrig <em>Orig</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getMod <em>Mod</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopNumbers <em>Stop Numbers</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopColors <em>Stop Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getColorFunction()
 * @model
 * @generated
 */
public interface ColorFunction extends ColorValue
{
  /**
   * Returns the value of the '<em><b>Orig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orig</em>' containment reference.
   * @see #setOrig(ColorValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getColorFunction_Orig()
   * @model containment="true"
   * @generated
   */
  ColorValue getOrig();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getOrig <em>Orig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orig</em>' containment reference.
   * @see #getOrig()
   * @generated
   */
  void setOrig(ColorValue value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(NumberValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getColorFunction_Mod()
   * @model containment="true"
   * @generated
   */
  NumberValue getMod();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(NumberValue value);

  /**
   * Returns the value of the '<em><b>Stop Numbers</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Numbers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Numbers</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getColorFunction_StopNumbers()
   * @model containment="true"
   * @generated
   */
  EList<NumberValue> getStopNumbers();

  /**
   * Returns the value of the '<em><b>Stop Colors</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Colors</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getColorFunction_StopColors()
   * @model containment="true"
   * @generated
   */
  EList<ColorValue> getStopColors();

} // ColorFunction
