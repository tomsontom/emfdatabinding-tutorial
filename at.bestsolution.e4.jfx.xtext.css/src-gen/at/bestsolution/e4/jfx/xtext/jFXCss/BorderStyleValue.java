/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Style Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getDashStyle <em>Dash Style</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLocation <em>Location</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterAbs <em>Miter Abs</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterPredefined <em>Miter Predefined</em>}</li>
 *   <li>{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLineCap <em>Line Cap</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue()
 * @model
 * @generated
 */
public interface BorderStyleValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Dash Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dash Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dash Style</em>' containment reference.
   * @see #setDashStyle(DashStyleValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue_DashStyle()
   * @model containment="true"
   * @generated
   */
  DashStyleValue getDashStyle();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getDashStyle <em>Dash Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dash Style</em>' containment reference.
   * @see #getDashStyle()
   * @generated
   */
  void setDashStyle(DashStyleValue value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Miter Abs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Miter Abs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Miter Abs</em>' containment reference.
   * @see #setMiterAbs(NumberValue)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue_MiterAbs()
   * @model containment="true"
   * @generated
   */
  NumberValue getMiterAbs();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterAbs <em>Miter Abs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Miter Abs</em>' containment reference.
   * @see #getMiterAbs()
   * @generated
   */
  void setMiterAbs(NumberValue value);

  /**
   * Returns the value of the '<em><b>Miter Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Miter Predefined</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Miter Predefined</em>' attribute.
   * @see #setMiterPredefined(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue_MiterPredefined()
   * @model
   * @generated
   */
  String getMiterPredefined();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterPredefined <em>Miter Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Miter Predefined</em>' attribute.
   * @see #getMiterPredefined()
   * @generated
   */
  void setMiterPredefined(String value);

  /**
   * Returns the value of the '<em><b>Line Cap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Cap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Cap</em>' attribute.
   * @see #setLineCap(String)
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#getBorderStyleValue_LineCap()
   * @model
   * @generated
   */
  String getLineCap();

  /**
   * Sets the value of the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLineCap <em>Line Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Cap</em>' attribute.
   * @see #getLineCap()
   * @generated
   */
  void setLineCap(String value);

} // BorderStyleValue
