/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX1 <em>X1</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY1 <em>Y1</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX2 <em>X2</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY2 <em>Y2</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient()
 * @model
 * @generated
 */
public interface LinearGradient extends PaintValue
{
  /**
   * Returns the value of the '<em><b>X1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X1</em>' containment reference.
   * @see #setX1(SizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient_X1()
   * @model containment="true"
   * @generated
   */
  SizeValue getX1();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX1 <em>X1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X1</em>' containment reference.
   * @see #getX1()
   * @generated
   */
  void setX1(SizeValue value);

  /**
   * Returns the value of the '<em><b>Y1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y1</em>' containment reference.
   * @see #setY1(SizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient_Y1()
   * @model containment="true"
   * @generated
   */
  SizeValue getY1();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY1 <em>Y1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y1</em>' containment reference.
   * @see #getY1()
   * @generated
   */
  void setY1(SizeValue value);

  /**
   * Returns the value of the '<em><b>X2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X2</em>' containment reference.
   * @see #setX2(SizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient_X2()
   * @model containment="true"
   * @generated
   */
  SizeValue getX2();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX2 <em>X2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X2</em>' containment reference.
   * @see #getX2()
   * @generated
   */
  void setX2(SizeValue value);

  /**
   * Returns the value of the '<em><b>Y2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y2</em>' containment reference.
   * @see #setY2(SizeValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient_Y2()
   * @model containment="true"
   * @generated
   */
  SizeValue getY2();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY2 <em>Y2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y2</em>' containment reference.
   * @see #getY2()
   * @generated
   */
  void setY2(SizeValue value);

  /**
   * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.e4.jfx.xtext.jFXCss.StopValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stops</em>' containment reference list.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getLinearGradient_Stops()
   * @model containment="true"
   * @generated
   */
  EList<StopValue> getStops();

} // LinearGradient
