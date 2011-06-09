/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssFactory
 * @model kind="package"
 * @generated
 */
public interface JFXCssPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jFXCss";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/e4/jfx/xtext/JFXCss";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jFXCss";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JFXCssPackage eINSTANCE = at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssImpl <em>JFX Css</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getJFXCss()
   * @generated
   */
  int JFX_CSS = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JFX_CSS__DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>JFX Css</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JFX_CSS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__SELECTOR = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SelectorImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 2;

  /**
   * The feature id for the '<em><b>Simple Selector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SIMPLE_SELECTOR = 0;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl <em>Simple Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSimpleSelector()
   * @generated
   */
  int SIMPLE_SELECTOR = 3;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ID = 1;

  /**
   * The feature id for the '<em><b>Pseudo Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__PSEUDO_CLASS = 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__CLASS = 3;

  /**
   * The number of structural features of the '<em>Simple Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementNameImpl <em>Element Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementNameImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementName()
   * @generated
   */
  int ELEMENT_NAME = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Element Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementIdImpl <em>Element Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementIdImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementId()
   * @generated
   */
  int ELEMENT_ID = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ID__ID = 0;

  /**
   * The number of structural features of the '<em>Element Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementClassImpl <em>Element Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementClassImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementClass()
   * @generated
   */
  int ELEMENT_CLASS = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_CLASS__ID = 0;

  /**
   * The number of structural features of the '<em>Element Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementPseudoClassImpl <em>Element Pseudo Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementPseudoClassImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementPseudoClass()
   * @generated
   */
  int ELEMENT_PSEUDO_CLASS = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PSEUDO_CLASS__VALUE = 0;

  /**
   * The number of structural features of the '<em>Element Pseudo Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PSEUDO_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FXPropertyImpl <em>FX Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FXPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFXProperty()
   * @generated
   */
  int FX_PROPERTY = 8;

  /**
   * The number of structural features of the '<em>FX Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontPropertyImpl <em>Font Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontProperty()
   * @generated
   */
  int FONT_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Font Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyPropertyImpl <em>Font Family Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontFamilyProperty()
   * @generated
   */
  int FONT_FAMILY_PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Font Family Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontSizePropertyImpl <em>Font Size Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontSizePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontSizeProperty()
   * @generated
   */
  int FONT_SIZE_PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Font Size Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStylePropertyImpl <em>Font Style Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStylePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontStyleProperty()
   * @generated
   */
  int FONT_STYLE_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Font Style Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightPropertyImpl <em>Font Weight Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontWeightProperty()
   * @generated
   */
  int FONT_WEIGHT_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Font Weight Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.CursorPropertyImpl <em>Cursor Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.CursorPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getCursorProperty()
   * @generated
   */
  int CURSOR_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURSOR_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cursor Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURSOR_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectPropertyImpl <em>Effect Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectProperty()
   * @generated
   */
  int EFFECT_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 16;

  /**
   * The feature id for the '<em><b>Blur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__BLUR = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__COLOR = 1;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__BLUR_RADIUS = 2;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__OFFSET_X = 3;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__OFFSET_Y = 4;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectDropShadowImpl <em>Effect Drop Shadow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectDropShadowImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectDropShadow()
   * @generated
   */
  int EFFECT_DROP_SHADOW = 17;

  /**
   * The feature id for the '<em><b>Blur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__BLUR = EFFECT__BLUR;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__COLOR = EFFECT__COLOR;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__BLUR_RADIUS = EFFECT__BLUR_RADIUS;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__OFFSET_X = EFFECT__OFFSET_X;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__OFFSET_Y = EFFECT__OFFSET_Y;

  /**
   * The feature id for the '<em><b>Spread</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__SPREAD = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Drop Shadow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectInnerShadowImpl <em>Effect Inner Shadow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectInnerShadowImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectInnerShadow()
   * @generated
   */
  int EFFECT_INNER_SHADOW = 18;

  /**
   * The feature id for the '<em><b>Blur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__BLUR = EFFECT__BLUR;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__COLOR = EFFECT__COLOR;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__BLUR_RADIUS = EFFECT__BLUR_RADIUS;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__OFFSET_X = EFFECT__OFFSET_X;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__OFFSET_Y = EFFECT__OFFSET_Y;

  /**
   * The feature id for the '<em><b>Choke</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__CHOKE = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Inner Shadow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BooleanPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBooleanProperty()
   * @generated
   */
  int BOOLEAN_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertyImpl <em>Size Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeProperty()
   * @generated
   */
  int SIZE_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberPropertyImpl <em>Number Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNumberProperty()
   * @generated
   */
  int NUMBER_PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getIntegerProperty()
   * @generated
   */
  int INTEGER_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertyImpl <em>Paint Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintProperty()
   * @generated
   */
  int PAINT_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Paint Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertiesImpl <em>Paint Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertiesImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintProperties()
   * @generated
   */
  int PAINT_PROPERTIES = 24;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTIES__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTIES__VALUES = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Paint Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_PROPERTIES_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlendPropertyImpl <em>Blend Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlendPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBlendProperty()
   * @generated
   */
  int BLEND_PROPERTY = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLEND_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Blend Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLEND_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertyImpl <em>Url Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlProperty()
   * @generated
   */
  int URL_PROPERTY = 26;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Url Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertiesImpl <em>Multi Size Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertiesImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeProperties()
   * @generated
   */
  int MULTI_SIZE_PROPERTIES = 27;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTIES__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTIES__VALUES = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Size Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTIES_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HPositionPropertyImpl <em>HPosition Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HPositionPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHPositionProperty()
   * @generated
   */
  int HPOSITION_PROPERTY = 28;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HPOSITION_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HPOSITION_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HPosition Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HPOSITION_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionPropertyImpl <em>VPosition Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVPositionProperty()
   * @generated
   */
  int VPOSITION_PROPERTY = 29;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VPOSITION_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VPOSITION_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VPosition Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VPOSITION_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SidePropertyImpl <em>Side Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SidePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSideProperty()
   * @generated
   */
  int SIDE_PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIDE_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIDE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Side Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIDE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BarPolicyPropertyImpl <em>Bar Policy Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BarPolicyPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBarPolicyProperty()
   * @generated
   */
  int BAR_POLICY_PROPERTY = 31;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAR_POLICY_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAR_POLICY_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bar Policy Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAR_POLICY_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertiesImpl <em>Url Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertiesImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlProperties()
   * @generated
   */
  int URL_PROPERTIES = 32;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTIES__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTIES__VALUES = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Url Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PROPERTIES_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatPropertiesImpl <em>Repeat Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatPropertiesImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRepeatProperties()
   * @generated
   */
  int REPEAT_PROPERTIES = 33;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_PROPERTIES__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_PROPERTIES__VALUES = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_PROPERTIES_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertyImpl <em>Multi Size Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeProperty()
   * @generated
   */
  int MULTI_SIZE_PROPERTY = 34;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTY__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Size Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertiesImpl <em>Size Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertiesImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeProperties()
   * @generated
   */
  int SIZE_PROPERTIES = 35;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTIES__PROPERTY = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTIES__VALUES = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_PROPERTIES_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineCapPropertyImpl <em>Stroke Line Cap Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineCapPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStrokeLineCapProperty()
   * @generated
   */
  int STROKE_LINE_CAP_PROPERTY = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_LINE_CAP_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stroke Line Cap Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_LINE_CAP_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineJoinPropertyImpl <em>Stroke Line Join Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineJoinPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStrokeLineJoinProperty()
   * @generated
   */
  int STROKE_LINE_JOIN_PROPERTY = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_LINE_JOIN_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stroke Line Join Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_LINE_JOIN_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextAlignmentPropertyImpl <em>Text Alignment Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextAlignmentPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextAlignmentProperty()
   * @generated
   */
  int TEXT_ALIGNMENT_PROPERTY = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ALIGNMENT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Alignment Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ALIGNMENT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOriginPropertyImpl <em>Text Origin Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOriginPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextOriginProperty()
   * @generated
   */
  int TEXT_ORIGIN_PROPERTY = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ORIGIN_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Origin Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ORIGIN_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImagePositionPropertyImpl <em>Background Image Position Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImagePositionPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBackgroundImagePositionProperty()
   * @generated
   */
  int BACKGROUND_IMAGE_POSITION_PROPERTY = 40;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_IMAGE_POSITION_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Background Image Position Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_IMAGE_POSITION_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImageSizePropertyImpl <em>Background Image Size Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImageSizePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBackgroundImageSizeProperty()
   * @generated
   */
  int BACKGROUND_IMAGE_SIZE_PROPERTY = 41;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Background Image Size Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_IMAGE_SIZE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderColorPropertyImpl <em>Border Color Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderColorPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderColorProperty()
   * @generated
   */
  int BORDER_COLOR_PROPERTY = 42;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_COLOR_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Border Color Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_COLOR_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStylePropertyImpl <em>Border Style Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStylePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderStyleProperty()
   * @generated
   */
  int BORDER_STYLE_PROPERTY = 43;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Border Style Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderImageSlicePropertyImpl <em>Border Image Slice Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderImageSlicePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderImageSliceProperty()
   * @generated
   */
  int BORDER_IMAGE_SLICE_PROPERTY = 44;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_IMAGE_SLICE_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Border Image Slice Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_IMAGE_SLICE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ShapePropertyImpl <em>Shape Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ShapePropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getShapeProperty()
   * @generated
   */
  int SHAPE_PROPERTY = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shape Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextPropertyImpl <em>Text Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextProperty()
   * @generated
   */
  int TEXT_PROPERTY = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOverrunPropertyImpl <em>Text Overrun Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOverrunPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextOverrunProperty()
   * @generated
   */
  int TEXT_OVERRUN_PROPERTY = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_OVERRUN_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Overrun Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_OVERRUN_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EchoCharPropertyImpl <em>Echo Char Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EchoCharPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEchoCharProperty()
   * @generated
   */
  int ECHO_CHAR_PROPERTY = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECHO_CHAR_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Echo Char Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECHO_CHAR_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.InsetsPropertyImpl <em>Insets Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.InsetsPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getInsetsProperty()
   * @generated
   */
  int INSETS_PROPERTY = 49;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSETS_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Insets Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSETS_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HorizontalGridLineStrokeDashArrayPropertyImpl <em>Horizontal Grid Line Stroke Dash Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HorizontalGridLineStrokeDashArrayPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHorizontalGridLineStrokeDashArrayProperty()
   * @generated
   */
  int HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY = 50;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUE = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Horizontal Grid Line Stroke Dash Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VerticalGridLineStrokeDashArrayPropertyImpl <em>Vertical Grid Line Stroke Dash Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VerticalGridLineStrokeDashArrayPropertyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVerticalGridLineStrokeDashArrayProperty()
   * @generated
   */
  int VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY = 51;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUES = FX_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Vertical Grid Line Stroke Dash Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY_FEATURE_COUNT = FX_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionValueImpl <em>VPosition Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVPositionValue()
   * @generated
   */
  int VPOSITION_VALUE = 52;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VPOSITION_VALUE__V = 0;

  /**
   * The number of structural features of the '<em>VPosition Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VPOSITION_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlurValueImpl <em>Blur Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlurValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBlurValue()
   * @generated
   */
  int BLUR_VALUE = 53;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUR_VALUE__V = 0;

  /**
   * The number of structural features of the '<em>Blur Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUR_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 54;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = NUMBER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = NUMBER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RealValueImpl <em>Real Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RealValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRealValue()
   * @generated
   */
  int REAL_VALUE = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_VALUE__VALUE = NUMBER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_VALUE_FEATURE_COUNT = NUMBER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlValueImpl <em>Url Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlValue()
   * @generated
   */
  int URL_VALUE = 57;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_VALUE__ADDRESS = 0;

  /**
   * The number of structural features of the '<em>Url Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.AddressValueImpl <em>Address Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.AddressValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getAddressValue()
   * @generated
   */
  int ADDRESS_VALUE = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Address Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeValueImpl <em>Size Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeValue()
   * @generated
   */
  int SIZE_VALUE = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE__DIMENSION = 1;

  /**
   * The number of structural features of the '<em>Size Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizeValueImpl <em>Multi Size Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizeValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeValue()
   * @generated
   */
  int MULTI_SIZE_VALUE = 60;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_VALUE__VALUES = 0;

  /**
   * The number of structural features of the '<em>Multi Size Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_SIZE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl <em>Bg Position Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBgPositionValue()
   * @generated
   */
  int BG_POSITION_VALUE = 61;

  /**
   * The feature id for the '<em><b>Absx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_VALUE__ABSX = 0;

  /**
   * The feature id for the '<em><b>Relx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_VALUE__RELX = 1;

  /**
   * The feature id for the '<em><b>Absy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_VALUE__ABSY = 2;

  /**
   * The feature id for the '<em><b>Rely</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_VALUE__RELY = 3;

  /**
   * The number of structural features of the '<em>Bg Position Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl <em>Repeat Style Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRepeatStyleValue()
   * @generated
   */
  int REPEAT_STYLE_VALUE = 62;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE_VALUE__V = 0;

  /**
   * The feature id for the '<em><b>V2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE_VALUE__V2 = 1;

  /**
   * The number of structural features of the '<em>Repeat Style Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl <em>Bg Size Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBgSizeValue()
   * @generated
   */
  int BG_SIZE_VALUE = 63;

  /**
   * The feature id for the '<em><b>Xsize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE__XSIZE = 0;

  /**
   * The feature id for the '<em><b>Xauto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE__XAUTO = 1;

  /**
   * The feature id for the '<em><b>Ysize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE__YSIZE = 2;

  /**
   * The feature id for the '<em><b>Yauto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE__YAUTO = 3;

  /**
   * The feature id for the '<em><b>Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE__PREDEFINED = 4;

  /**
   * The number of structural features of the '<em>Bg Size Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_VALUE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiPaintValueImpl <em>Multi Paint Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiPaintValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiPaintValue()
   * @generated
   */
  int MULTI_PAINT_VALUE = 64;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PAINT_VALUE__VALUES = 0;

  /**
   * The number of structural features of the '<em>Multi Paint Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PAINT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl <em>Border Style Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderStyleValue()
   * @generated
   */
  int BORDER_STYLE_VALUE = 65;

  /**
   * The feature id for the '<em><b>Dash Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE__DASH_STYLE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Miter Abs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE__MITER_ABS = 2;

  /**
   * The feature id for the '<em><b>Miter Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE__MITER_PREDEFINED = 3;

  /**
   * The feature id for the '<em><b>Line Cap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE__LINE_CAP = 4;

  /**
   * The number of structural features of the '<em>Border Style Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_VALUE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DashStyleValueImpl <em>Dash Style Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.DashStyleValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getDashStyleValue()
   * @generated
   */
  int DASH_STYLE_VALUE = 66;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_STYLE_VALUE__V = 0;

  /**
   * The number of structural features of the '<em>Dash Style Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_STYLE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeFillImpl <em>Size Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeFillImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeFill()
   * @generated
   */
  int SIZE_FILL = 67;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Fill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL__FILL = 1;

  /**
   * The number of structural features of the '<em>Size Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl <em>Font Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontValue()
   * @generated
   */
  int FONT_VALUE = 68;

  /**
   * The feature id for the '<em><b>Style Or Weight String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_VALUE__STYLE_OR_WEIGHT_STRING = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_VALUE__WEIGHT = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_VALUE__SIZE = 2;

  /**
   * The feature id for the '<em><b>Family</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_VALUE__FAMILY = 3;

  /**
   * The number of structural features of the '<em>Font Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStyleValueImpl <em>Font Style Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStyleValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontStyleValue()
   * @generated
   */
  int FONT_STYLE_VALUE = 69;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Font Style Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl <em>Font Weight Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontWeightValue()
   * @generated
   */
  int FONT_WEIGHT_VALUE = 70;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_VALUE__VALUE_STRING = 0;

  /**
   * The feature id for the '<em><b>Value Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_VALUE__VALUE_INT = 1;

  /**
   * The number of structural features of the '<em>Font Weight Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_WEIGHT_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyImpl <em>Font Family</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontFamily()
   * @generated
   */
  int FONT_FAMILY = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Font Family</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintValueImpl <em>Paint Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintValue()
   * @generated
   */
  int PAINT_VALUE = 72;

  /**
   * The number of structural features of the '<em>Paint Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.LinearGradientImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getLinearGradient()
   * @generated
   */
  int LINEAR_GRADIENT = 73;

  /**
   * The feature id for the '<em><b>X1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__X1 = PAINT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__Y1 = PAINT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>X2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__X2 = PAINT_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Y2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__Y2 = PAINT_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Stops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__STOPS = PAINT_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Linear Gradient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT_FEATURE_COUNT = PAINT_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RadialGradientImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRadialGradient()
   * @generated
   */
  int RADIAL_GRADIENT = 74;

  /**
   * The feature id for the '<em><b>Cx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__CX = PAINT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__CY = PAINT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__RADIUS = PAINT_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__FX = PAINT_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__FY = PAINT_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Stops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__STOPS = PAINT_VALUE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Radial Gradient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT_FEATURE_COUNT = PAINT_VALUE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StopValueImpl <em>Stop Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StopValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStopValue()
   * @generated
   */
  int STOP_VALUE = 75;

  /**
   * The feature id for the '<em><b>Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE__POS = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE__COLOR = 1;

  /**
   * The number of structural features of the '<em>Stop Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorValueImpl <em>Color Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorValueImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getColorValue()
   * @generated
   */
  int COLOR_VALUE = 76;

  /**
   * The number of structural features of the '<em>Color Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_VALUE_FEATURE_COUNT = PAINT_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NamedColorImpl <em>Named Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NamedColorImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNamedColor()
   * @generated
   */
  int NAMED_COLOR = 77;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR__VALUE = COLOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR_FEATURE_COUNT = COLOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl <em>RGB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRGBColor()
   * @generated
   */
  int RGB_COLOR = 78;

  /**
   * The feature id for the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__HEX = COLOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__R = COLOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>G</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__G = COLOR_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__B = COLOR_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__RP = COLOR_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Gp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__GP = COLOR_VALUE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Bp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__BP = COLOR_VALUE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__ALPHA = COLOR_VALUE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>RGB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR_FEATURE_COUNT = COLOR_VALUE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl <em>HSB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHSBColor()
   * @generated
   */
  int HSB_COLOR = 79;

  /**
   * The feature id for the '<em><b>Hue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__HUE = COLOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Saturation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__SATURATION = COLOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Brightness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__BRIGHTNESS = COLOR_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__ALPHA = COLOR_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>HSB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR_FEATURE_COUNT = COLOR_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl <em>Color Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getColorFunction()
   * @generated
   */
  int COLOR_FUNCTION = 80;

  /**
   * The feature id for the '<em><b>Orig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__ORIG = COLOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__MOD = COLOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stop Numbers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__STOP_NUMBERS = COLOR_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stop Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__STOP_COLORS = COLOR_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Color Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION_FEATURE_COUNT = COLOR_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue <em>Boolean Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 81;

  /**
   * The meta object id for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue <em>HPosition Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHPositionValue()
   * @generated
   */
  int HPOSITION_VALUE = 82;


  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss <em>JFX Css</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JFX Css</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss
   * @generated
   */
  EClass getJFXCss();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss#getDefinitions()
   * @see #getJFXCss()
   * @generated
   */
  EReference getJFXCss_Definitions();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selector</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getSelector()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Selector();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Definition#getProperties()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Properties();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Selector#getSimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simple Selector</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Selector#getSimpleSelector()
   * @see #getSelector()
   * @generated
   */
  EReference getSelector_SimpleSelector();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Selector</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector
   * @generated
   */
  EClass getSimpleSelector();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getElement()
   * @see #getSimpleSelector()
   * @generated
   */
  EReference getSimpleSelector_Element();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getId()
   * @see #getSimpleSelector()
   * @generated
   */
  EReference getSimpleSelector_Id();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getPseudoClass <em>Pseudo Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pseudo Class</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getPseudoClass()
   * @see #getSimpleSelector()
   * @generated
   */
  EReference getSimpleSelector_PseudoClass();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector#getClass_()
   * @see #getSimpleSelector()
   * @generated
   */
  EReference getSimpleSelector_Class();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Name</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementName
   * @generated
   */
  EClass getElementName();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementName#getValue()
   * @see #getElementName()
   * @generated
   */
  EAttribute getElementName_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementId <em>Element Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Id</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementId
   * @generated
   */
  EClass getElementId();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementId#getId()
   * @see #getElementId()
   * @generated
   */
  EAttribute getElementId_Id();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass <em>Element Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Class</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass
   * @generated
   */
  EClass getElementClass();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass#getId()
   * @see #getElementClass()
   * @generated
   */
  EAttribute getElementClass_Id();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass <em>Element Pseudo Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Pseudo Class</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass
   * @generated
   */
  EClass getElementPseudoClass();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass#getValue()
   * @see #getElementPseudoClass()
   * @generated
   */
  EAttribute getElementPseudoClass_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty <em>FX Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FX Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty
   * @generated
   */
  EClass getFXProperty();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty <em>Font Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty
   * @generated
   */
  EClass getFontProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty#getProperty()
   * @see #getFontProperty()
   * @generated
   */
  EAttribute getFontProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty#getValue()
   * @see #getFontProperty()
   * @generated
   */
  EReference getFontProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty <em>Font Family Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Family Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty
   * @generated
   */
  EClass getFontFamilyProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getProperty()
   * @see #getFontFamilyProperty()
   * @generated
   */
  EAttribute getFontFamilyProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty#getValue()
   * @see #getFontFamilyProperty()
   * @generated
   */
  EReference getFontFamilyProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty <em>Font Size Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty
   * @generated
   */
  EClass getFontSizeProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty#getProperty()
   * @see #getFontSizeProperty()
   * @generated
   */
  EAttribute getFontSizeProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty#getValue()
   * @see #getFontSizeProperty()
   * @generated
   */
  EReference getFontSizeProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty <em>Font Style Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty
   * @generated
   */
  EClass getFontStyleProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty#getProperty()
   * @see #getFontStyleProperty()
   * @generated
   */
  EAttribute getFontStyleProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty#getValue()
   * @see #getFontStyleProperty()
   * @generated
   */
  EReference getFontStyleProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty <em>Font Weight Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Weight Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty
   * @generated
   */
  EClass getFontWeightProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty#getProperty()
   * @see #getFontWeightProperty()
   * @generated
   */
  EAttribute getFontWeightProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty#getValue()
   * @see #getFontWeightProperty()
   * @generated
   */
  EReference getFontWeightProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty <em>Cursor Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cursor Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty
   * @generated
   */
  EClass getCursorProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty#getValue()
   * @see #getCursorProperty()
   * @generated
   */
  EAttribute getCursorProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty <em>Effect Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty
   * @generated
   */
  EClass getEffectProperty();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty#getValue()
   * @see #getEffectProperty()
   * @generated
   */
  EReference getEffectProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getBlur <em>Blur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blur</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getBlur()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Blur();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getColor()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Color();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getBlurRadius <em>Blur Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blur Radius</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getBlurRadius()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_BlurRadius();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getOffsetX <em>Offset X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Offset X</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getOffsetX()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_OffsetX();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getOffsetY <em>Offset Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Offset Y</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect#getOffsetY()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_OffsetY();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow <em>Effect Drop Shadow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Drop Shadow</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow
   * @generated
   */
  EClass getEffectDropShadow();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow#getSpread <em>Spread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spread</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow#getSpread()
   * @see #getEffectDropShadow()
   * @generated
   */
  EReference getEffectDropShadow_Spread();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow <em>Effect Inner Shadow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Inner Shadow</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow
   * @generated
   */
  EClass getEffectInnerShadow();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow#getChoke <em>Choke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choke</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow#getChoke()
   * @see #getEffectInnerShadow()
   * @generated
   */
  EReference getEffectInnerShadow_Choke();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty <em>Boolean Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty
   * @generated
   */
  EClass getBooleanProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getProperty()
   * @see #getBooleanProperty()
   * @generated
   */
  EAttribute getBooleanProperty_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty#getValue()
   * @see #getBooleanProperty()
   * @generated
   */
  EAttribute getBooleanProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty <em>Size Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty
   * @generated
   */
  EClass getSizeProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty#getProperty()
   * @see #getSizeProperty()
   * @generated
   */
  EAttribute getSizeProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty#getValue()
   * @see #getSizeProperty()
   * @generated
   */
  EReference getSizeProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty <em>Number Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty
   * @generated
   */
  EClass getNumberProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty#getProperty()
   * @see #getNumberProperty()
   * @generated
   */
  EAttribute getNumberProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty#getValue()
   * @see #getNumberProperty()
   * @generated
   */
  EReference getNumberProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty <em>Integer Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty
   * @generated
   */
  EClass getIntegerProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty#getProperty()
   * @see #getIntegerProperty()
   * @generated
   */
  EAttribute getIntegerProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty#getValue()
   * @see #getIntegerProperty()
   * @generated
   */
  EReference getIntegerProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty <em>Paint Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paint Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty
   * @generated
   */
  EClass getPaintProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty#getProperty()
   * @see #getPaintProperty()
   * @generated
   */
  EAttribute getPaintProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty#getValue()
   * @see #getPaintProperty()
   * @generated
   */
  EReference getPaintProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties <em>Paint Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paint Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties
   * @generated
   */
  EClass getPaintProperties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties#getProperty()
   * @see #getPaintProperties()
   * @generated
   */
  EAttribute getPaintProperties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties#getValues()
   * @see #getPaintProperties()
   * @generated
   */
  EReference getPaintProperties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty <em>Blend Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blend Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty
   * @generated
   */
  EClass getBlendProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty#getValue()
   * @see #getBlendProperty()
   * @generated
   */
  EAttribute getBlendProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty <em>Url Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty
   * @generated
   */
  EClass getUrlProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty#getProperty()
   * @see #getUrlProperty()
   * @generated
   */
  EAttribute getUrlProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty#getValue()
   * @see #getUrlProperty()
   * @generated
   */
  EReference getUrlProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties <em>Multi Size Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Size Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties
   * @generated
   */
  EClass getMultiSizeProperties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties#getProperty()
   * @see #getMultiSizeProperties()
   * @generated
   */
  EAttribute getMultiSizeProperties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties#getValues()
   * @see #getMultiSizeProperties()
   * @generated
   */
  EReference getMultiSizeProperties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty <em>HPosition Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HPosition Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty
   * @generated
   */
  EClass getHPositionProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty#getProperty()
   * @see #getHPositionProperty()
   * @generated
   */
  EAttribute getHPositionProperty_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty#getValue()
   * @see #getHPositionProperty()
   * @generated
   */
  EAttribute getHPositionProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty <em>VPosition Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VPosition Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty
   * @generated
   */
  EClass getVPositionProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty#getProperty()
   * @see #getVPositionProperty()
   * @generated
   */
  EAttribute getVPositionProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty#getValue()
   * @see #getVPositionProperty()
   * @generated
   */
  EReference getVPositionProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty <em>Side Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Side Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty
   * @generated
   */
  EClass getSideProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty#getProperty()
   * @see #getSideProperty()
   * @generated
   */
  EAttribute getSideProperty_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty#getValue()
   * @see #getSideProperty()
   * @generated
   */
  EAttribute getSideProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty <em>Bar Policy Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bar Policy Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty
   * @generated
   */
  EClass getBarPolicyProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty#getProperty()
   * @see #getBarPolicyProperty()
   * @generated
   */
  EAttribute getBarPolicyProperty_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty#getValue()
   * @see #getBarPolicyProperty()
   * @generated
   */
  EAttribute getBarPolicyProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties <em>Url Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties
   * @generated
   */
  EClass getUrlProperties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties#getProperty()
   * @see #getUrlProperties()
   * @generated
   */
  EAttribute getUrlProperties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties#getValues()
   * @see #getUrlProperties()
   * @generated
   */
  EReference getUrlProperties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties <em>Repeat Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties
   * @generated
   */
  EClass getRepeatProperties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties#getProperty()
   * @see #getRepeatProperties()
   * @generated
   */
  EAttribute getRepeatProperties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties#getValues()
   * @see #getRepeatProperties()
   * @generated
   */
  EReference getRepeatProperties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty <em>Multi Size Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Size Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty
   * @generated
   */
  EClass getMultiSizeProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getProperty()
   * @see #getMultiSizeProperty()
   * @generated
   */
  EAttribute getMultiSizeProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty#getValue()
   * @see #getMultiSizeProperty()
   * @generated
   */
  EReference getMultiSizeProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties <em>Size Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Properties</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties
   * @generated
   */
  EClass getSizeProperties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties#getProperty()
   * @see #getSizeProperties()
   * @generated
   */
  EAttribute getSizeProperties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties#getValues()
   * @see #getSizeProperties()
   * @generated
   */
  EReference getSizeProperties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty <em>Stroke Line Cap Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stroke Line Cap Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty
   * @generated
   */
  EClass getStrokeLineCapProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty#getValue()
   * @see #getStrokeLineCapProperty()
   * @generated
   */
  EAttribute getStrokeLineCapProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty <em>Stroke Line Join Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stroke Line Join Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty
   * @generated
   */
  EClass getStrokeLineJoinProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty#getValue()
   * @see #getStrokeLineJoinProperty()
   * @generated
   */
  EAttribute getStrokeLineJoinProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextAlignmentProperty <em>Text Alignment Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Alignment Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextAlignmentProperty
   * @generated
   */
  EClass getTextAlignmentProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextAlignmentProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextAlignmentProperty#getValue()
   * @see #getTextAlignmentProperty()
   * @generated
   */
  EAttribute getTextAlignmentProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty <em>Text Origin Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Origin Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty
   * @generated
   */
  EClass getTextOriginProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty#getValue()
   * @see #getTextOriginProperty()
   * @generated
   */
  EAttribute getTextOriginProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImagePositionProperty <em>Background Image Position Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background Image Position Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImagePositionProperty
   * @generated
   */
  EClass getBackgroundImagePositionProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImagePositionProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImagePositionProperty#getValues()
   * @see #getBackgroundImagePositionProperty()
   * @generated
   */
  EReference getBackgroundImagePositionProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty <em>Background Image Size Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background Image Size Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty
   * @generated
   */
  EClass getBackgroundImageSizeProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty#getValues()
   * @see #getBackgroundImageSizeProperty()
   * @generated
   */
  EReference getBackgroundImageSizeProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderColorProperty <em>Border Color Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Color Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderColorProperty
   * @generated
   */
  EClass getBorderColorProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderColorProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderColorProperty#getValues()
   * @see #getBorderColorProperty()
   * @generated
   */
  EReference getBorderColorProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty <em>Border Style Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Style Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty
   * @generated
   */
  EClass getBorderStyleProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty#getValues()
   * @see #getBorderStyleProperty()
   * @generated
   */
  EReference getBorderStyleProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty <em>Border Image Slice Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Image Slice Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty
   * @generated
   */
  EClass getBorderImageSliceProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty#getValues()
   * @see #getBorderImageSliceProperty()
   * @generated
   */
  EReference getBorderImageSliceProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ShapeProperty <em>Shape Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ShapeProperty
   * @generated
   */
  EClass getShapeProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ShapeProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ShapeProperty#getValue()
   * @see #getShapeProperty()
   * @generated
   */
  EAttribute getShapeProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextProperty <em>Text Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextProperty
   * @generated
   */
  EClass getTextProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextProperty#getValue()
   * @see #getTextProperty()
   * @generated
   */
  EAttribute getTextProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty <em>Text Overrun Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Overrun Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty
   * @generated
   */
  EClass getTextOverrunProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty#getValue()
   * @see #getTextOverrunProperty()
   * @generated
   */
  EAttribute getTextOverrunProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EchoCharProperty <em>Echo Char Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Echo Char Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EchoCharProperty
   * @generated
   */
  EClass getEchoCharProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EchoCharProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EchoCharProperty#getValue()
   * @see #getEchoCharProperty()
   * @generated
   */
  EAttribute getEchoCharProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty <em>Insets Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insets Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty
   * @generated
   */
  EClass getInsetsProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty#getValue()
   * @see #getInsetsProperty()
   * @generated
   */
  EReference getInsetsProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty <em>Horizontal Grid Line Stroke Dash Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horizontal Grid Line Stroke Dash Array Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty
   * @generated
   */
  EClass getHorizontalGridLineStrokeDashArrayProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty#getValue()
   * @see #getHorizontalGridLineStrokeDashArrayProperty()
   * @generated
   */
  EReference getHorizontalGridLineStrokeDashArrayProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty <em>Vertical Grid Line Stroke Dash Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertical Grid Line Stroke Dash Array Property</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty
   * @generated
   */
  EClass getVerticalGridLineStrokeDashArrayProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty#getValues()
   * @see #getVerticalGridLineStrokeDashArrayProperty()
   * @generated
   */
  EReference getVerticalGridLineStrokeDashArrayProperty_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue <em>VPosition Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VPosition Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue
   * @generated
   */
  EClass getVPositionValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue#getV()
   * @see #getVPositionValue()
   * @generated
   */
  EAttribute getVPositionValue_V();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue <em>Blur Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blur Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue
   * @generated
   */
  EClass getBlurValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue#getV()
   * @see #getBlurValue()
   * @generated
   */
  EAttribute getBlurValue_V();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RealValue <em>Real Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RealValue
   * @generated
   */
  EClass getRealValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RealValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RealValue#getValue()
   * @see #getRealValue()
   * @generated
   */
  EAttribute getRealValue_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue <em>Url Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue
   * @generated
   */
  EClass getUrlValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue#getAddress()
   * @see #getUrlValue()
   * @generated
   */
  EReference getUrlValue_Address();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue <em>Address Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue
   * @generated
   */
  EClass getAddressValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue#getValue()
   * @see #getAddressValue()
   * @generated
   */
  EAttribute getAddressValue_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue <em>Size Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue
   * @generated
   */
  EClass getSizeValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getValue()
   * @see #getSizeValue()
   * @generated
   */
  EReference getSizeValue_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dimension</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue#getDimension()
   * @see #getSizeValue()
   * @generated
   */
  EAttribute getSizeValue_Dimension();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue <em>Multi Size Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Size Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue
   * @generated
   */
  EClass getMultiSizeValue();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue#getValues()
   * @see #getMultiSizeValue()
   * @generated
   */
  EReference getMultiSizeValue_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue <em>Bg Position Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bg Position Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue
   * @generated
   */
  EClass getBgPositionValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getAbsx <em>Absx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Absx</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getAbsx()
   * @see #getBgPositionValue()
   * @generated
   */
  EReference getBgPositionValue_Absx();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getRelx <em>Relx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relx</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getRelx()
   * @see #getBgPositionValue()
   * @generated
   */
  EAttribute getBgPositionValue_Relx();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getAbsy <em>Absy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Absy</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getAbsy()
   * @see #getBgPositionValue()
   * @generated
   */
  EReference getBgPositionValue_Absy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getRely <em>Rely</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rely</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue#getRely()
   * @see #getBgPositionValue()
   * @generated
   */
  EAttribute getBgPositionValue_Rely();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue <em>Repeat Style Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Style Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue
   * @generated
   */
  EClass getRepeatStyleValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue#getV()
   * @see #getRepeatStyleValue()
   * @generated
   */
  EAttribute getRepeatStyleValue_V();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V2</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue#getV2()
   * @see #getRepeatStyleValue()
   * @generated
   */
  EAttribute getRepeatStyleValue_V2();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue <em>Bg Size Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bg Size Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue
   * @generated
   */
  EClass getBgSizeValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getXsize <em>Xsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xsize</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getXsize()
   * @see #getBgSizeValue()
   * @generated
   */
  EReference getBgSizeValue_Xsize();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getXauto <em>Xauto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xauto</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getXauto()
   * @see #getBgSizeValue()
   * @generated
   */
  EAttribute getBgSizeValue_Xauto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getYsize <em>Ysize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ysize</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getYsize()
   * @see #getBgSizeValue()
   * @generated
   */
  EReference getBgSizeValue_Ysize();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getYauto <em>Yauto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yauto</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getYauto()
   * @see #getBgSizeValue()
   * @generated
   */
  EAttribute getBgSizeValue_Yauto();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getPredefined <em>Predefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Predefined</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue#getPredefined()
   * @see #getBgSizeValue()
   * @generated
   */
  EAttribute getBgSizeValue_Predefined();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue <em>Multi Paint Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Paint Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue
   * @generated
   */
  EClass getMultiPaintValue();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue#getValues()
   * @see #getMultiPaintValue()
   * @generated
   */
  EReference getMultiPaintValue_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue <em>Border Style Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Style Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue
   * @generated
   */
  EClass getBorderStyleValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getDashStyle <em>Dash Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dash Style</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getDashStyle()
   * @see #getBorderStyleValue()
   * @generated
   */
  EReference getBorderStyleValue_DashStyle();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLocation()
   * @see #getBorderStyleValue()
   * @generated
   */
  EAttribute getBorderStyleValue_Location();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterAbs <em>Miter Abs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Miter Abs</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterAbs()
   * @see #getBorderStyleValue()
   * @generated
   */
  EReference getBorderStyleValue_MiterAbs();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterPredefined <em>Miter Predefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miter Predefined</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getMiterPredefined()
   * @see #getBorderStyleValue()
   * @generated
   */
  EAttribute getBorderStyleValue_MiterPredefined();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLineCap <em>Line Cap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Cap</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue#getLineCap()
   * @see #getBorderStyleValue()
   * @generated
   */
  EAttribute getBorderStyleValue_LineCap();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue <em>Dash Style Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dash Style Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue
   * @generated
   */
  EClass getDashStyleValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue#getV()
   * @see #getDashStyleValue()
   * @generated
   */
  EAttribute getDashStyleValue_V();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill <em>Size Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Fill</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill
   * @generated
   */
  EClass getSizeFill();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getValue()
   * @see #getSizeFill()
   * @generated
   */
  EReference getSizeFill_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getFill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fill</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill#getFill()
   * @see #getSizeFill()
   * @generated
   */
  EAttribute getSizeFill_Fill();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue <em>Font Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue
   * @generated
   */
  EClass getFontValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeightString <em>Style Or Weight String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style Or Weight String</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getStyleOrWeightString()
   * @see #getFontValue()
   * @generated
   */
  EAttribute getFontValue_StyleOrWeightString();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weight</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getWeight()
   * @see #getFontValue()
   * @generated
   */
  EReference getFontValue_Weight();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getSize()
   * @see #getFontValue()
   * @generated
   */
  EReference getFontValue_Size();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getFamily <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Family</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue#getFamily()
   * @see #getFontValue()
   * @generated
   */
  EReference getFontValue_Family();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue <em>Font Style Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue
   * @generated
   */
  EClass getFontStyleValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue#getValue()
   * @see #getFontStyleValue()
   * @generated
   */
  EAttribute getFontStyleValue_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue <em>Font Weight Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Weight Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue
   * @generated
   */
  EClass getFontWeightValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueString <em>Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value String</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueString()
   * @see #getFontWeightValue()
   * @generated
   */
  EAttribute getFontWeightValue_ValueString();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueInt <em>Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Int</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue#getValueInt()
   * @see #getFontWeightValue()
   * @generated
   */
  EReference getFontWeightValue_ValueInt();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily <em>Font Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Family</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily
   * @generated
   */
  EClass getFontFamily();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily#getValue()
   * @see #getFontFamily()
   * @generated
   */
  EAttribute getFontFamily_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintValue <em>Paint Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paint Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintValue
   * @generated
   */
  EClass getPaintValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient <em>Linear Gradient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Gradient</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient
   * @generated
   */
  EClass getLinearGradient();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX1 <em>X1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X1</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX1()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_X1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY1 <em>Y1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y1</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY1()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_Y1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X2</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getX2()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_X2();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY2 <em>Y2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y2</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getY2()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_Y2();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getStops <em>Stops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stops</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient#getStops()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_Stops();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient <em>Radial Gradient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radial Gradient</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient
   * @generated
   */
  EClass getRadialGradient();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getCx <em>Cx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cx</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getCx()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Cx();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getCy <em>Cy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cy</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getCy()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Cy();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radius</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getRadius()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Radius();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getFx <em>Fx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fx</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getFx()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Fx();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getFy <em>Fy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fy</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getFy()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Fy();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getStops <em>Stops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stops</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient#getStops()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Stops();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StopValue <em>Stop Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StopValue
   * @generated
   */
  EClass getStopValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StopValue#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pos</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StopValue#getPos()
   * @see #getStopValue()
   * @generated
   */
  EReference getStopValue_Pos();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StopValue#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StopValue#getColor()
   * @see #getStopValue()
   * @generated
   */
  EReference getStopValue_Color();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue <em>Color Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue
   * @generated
   */
  EClass getColorValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Color</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor
   * @generated
   */
  EClass getNamedColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor#getValue()
   * @see #getNamedColor()
   * @generated
   */
  EAttribute getNamedColor_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB Color</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor
   * @generated
   */
  EClass getRGBColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getHex <em>Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getHex()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Hex();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getR()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_R();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>G</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getG()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_G();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getB()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_B();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getRp <em>Rp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rp</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getRp()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_Rp();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getGp <em>Gp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gp</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getGp()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_Gp();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getBp <em>Bp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bp</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getBp()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_Bp();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor#getAlpha()
   * @see #getRGBColor()
   * @generated
   */
  EReference getRGBColor_Alpha();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor <em>HSB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HSB Color</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor
   * @generated
   */
  EClass getHSBColor();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getHue <em>Hue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hue</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getHue()
   * @see #getHSBColor()
   * @generated
   */
  EReference getHSBColor_Hue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getSaturation <em>Saturation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Saturation</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getSaturation()
   * @see #getHSBColor()
   * @generated
   */
  EReference getHSBColor_Saturation();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getBrightness <em>Brightness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Brightness</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getBrightness()
   * @see #getHSBColor()
   * @generated
   */
  EReference getHSBColor_Brightness();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor#getAlpha()
   * @see #getHSBColor()
   * @generated
   */
  EReference getHSBColor_Alpha();

  /**
   * Returns the meta object for class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction <em>Color Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Function</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction
   * @generated
   */
  EClass getColorFunction();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getOrig <em>Orig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orig</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getOrig()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_Orig();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getMod()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_Mod();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopNumbers <em>Stop Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stop Numbers</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopNumbers()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_StopNumbers();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopColors <em>Stop Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stop Colors</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction#getStopColors()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_StopColors();

  /**
   * Returns the meta object for enum '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue
   * @generated
   */
  EEnum getBooleanValue();

  /**
   * Returns the meta object for enum '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue <em>HPosition Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>HPosition Value</em>'.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue
   * @generated
   */
  EEnum getHPositionValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JFXCssFactory getJFXCssFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssImpl <em>JFX Css</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getJFXCss()
     * @generated
     */
    EClass JFX_CSS = eINSTANCE.getJFXCss();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JFX_CSS__DEFINITIONS = eINSTANCE.getJFXCss_Definitions();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.DefinitionImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__SELECTOR = eINSTANCE.getDefinition_Selector();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__PROPERTIES = eINSTANCE.getDefinition_Properties();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SelectorImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '<em><b>Simple Selector</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SIMPLE_SELECTOR = eINSTANCE.getSelector_SimpleSelector();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl <em>Simple Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SimpleSelectorImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSimpleSelector()
     * @generated
     */
    EClass SIMPLE_SELECTOR = eINSTANCE.getSimpleSelector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__ELEMENT = eINSTANCE.getSimpleSelector_Element();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__ID = eINSTANCE.getSimpleSelector_Id();

    /**
     * The meta object literal for the '<em><b>Pseudo Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__PSEUDO_CLASS = eINSTANCE.getSimpleSelector_PseudoClass();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__CLASS = eINSTANCE.getSimpleSelector_Class();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementNameImpl <em>Element Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementNameImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementName()
     * @generated
     */
    EClass ELEMENT_NAME = eINSTANCE.getElementName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_NAME__VALUE = eINSTANCE.getElementName_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementIdImpl <em>Element Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementIdImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementId()
     * @generated
     */
    EClass ELEMENT_ID = eINSTANCE.getElementId();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_ID__ID = eINSTANCE.getElementId_Id();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementClassImpl <em>Element Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementClassImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementClass()
     * @generated
     */
    EClass ELEMENT_CLASS = eINSTANCE.getElementClass();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_CLASS__ID = eINSTANCE.getElementClass_Id();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementPseudoClassImpl <em>Element Pseudo Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ElementPseudoClassImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getElementPseudoClass()
     * @generated
     */
    EClass ELEMENT_PSEUDO_CLASS = eINSTANCE.getElementPseudoClass();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_PSEUDO_CLASS__VALUE = eINSTANCE.getElementPseudoClass_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FXPropertyImpl <em>FX Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FXPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFXProperty()
     * @generated
     */
    EClass FX_PROPERTY = eINSTANCE.getFXProperty();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontPropertyImpl <em>Font Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontProperty()
     * @generated
     */
    EClass FONT_PROPERTY = eINSTANCE.getFontProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_PROPERTY__PROPERTY = eINSTANCE.getFontProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_PROPERTY__VALUE = eINSTANCE.getFontProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyPropertyImpl <em>Font Family Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontFamilyProperty()
     * @generated
     */
    EClass FONT_FAMILY_PROPERTY = eINSTANCE.getFontFamilyProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_FAMILY_PROPERTY__PROPERTY = eINSTANCE.getFontFamilyProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_FAMILY_PROPERTY__VALUE = eINSTANCE.getFontFamilyProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontSizePropertyImpl <em>Font Size Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontSizePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontSizeProperty()
     * @generated
     */
    EClass FONT_SIZE_PROPERTY = eINSTANCE.getFontSizeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_SIZE_PROPERTY__PROPERTY = eINSTANCE.getFontSizeProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_SIZE_PROPERTY__VALUE = eINSTANCE.getFontSizeProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStylePropertyImpl <em>Font Style Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStylePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontStyleProperty()
     * @generated
     */
    EClass FONT_STYLE_PROPERTY = eINSTANCE.getFontStyleProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_STYLE_PROPERTY__PROPERTY = eINSTANCE.getFontStyleProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_STYLE_PROPERTY__VALUE = eINSTANCE.getFontStyleProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightPropertyImpl <em>Font Weight Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontWeightProperty()
     * @generated
     */
    EClass FONT_WEIGHT_PROPERTY = eINSTANCE.getFontWeightProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_WEIGHT_PROPERTY__PROPERTY = eINSTANCE.getFontWeightProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_WEIGHT_PROPERTY__VALUE = eINSTANCE.getFontWeightProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.CursorPropertyImpl <em>Cursor Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.CursorPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getCursorProperty()
     * @generated
     */
    EClass CURSOR_PROPERTY = eINSTANCE.getCursorProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURSOR_PROPERTY__VALUE = eINSTANCE.getCursorProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectPropertyImpl <em>Effect Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectProperty()
     * @generated
     */
    EClass EFFECT_PROPERTY = eINSTANCE.getEffectProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT_PROPERTY__VALUE = eINSTANCE.getEffectProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Blur</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__BLUR = eINSTANCE.getEffect_Blur();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__COLOR = eINSTANCE.getEffect_Color();

    /**
     * The meta object literal for the '<em><b>Blur Radius</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__BLUR_RADIUS = eINSTANCE.getEffect_BlurRadius();

    /**
     * The meta object literal for the '<em><b>Offset X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__OFFSET_X = eINSTANCE.getEffect_OffsetX();

    /**
     * The meta object literal for the '<em><b>Offset Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__OFFSET_Y = eINSTANCE.getEffect_OffsetY();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectDropShadowImpl <em>Effect Drop Shadow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectDropShadowImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectDropShadow()
     * @generated
     */
    EClass EFFECT_DROP_SHADOW = eINSTANCE.getEffectDropShadow();

    /**
     * The meta object literal for the '<em><b>Spread</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT_DROP_SHADOW__SPREAD = eINSTANCE.getEffectDropShadow_Spread();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectInnerShadowImpl <em>Effect Inner Shadow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EffectInnerShadowImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEffectInnerShadow()
     * @generated
     */
    EClass EFFECT_INNER_SHADOW = eINSTANCE.getEffectInnerShadow();

    /**
     * The meta object literal for the '<em><b>Choke</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT_INNER_SHADOW__CHOKE = eINSTANCE.getEffectInnerShadow_Choke();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BooleanPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBooleanProperty()
     * @generated
     */
    EClass BOOLEAN_PROPERTY = eINSTANCE.getBooleanProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PROPERTY__PROPERTY = eINSTANCE.getBooleanProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PROPERTY__VALUE = eINSTANCE.getBooleanProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertyImpl <em>Size Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeProperty()
     * @generated
     */
    EClass SIZE_PROPERTY = eINSTANCE.getSizeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_PROPERTY__PROPERTY = eINSTANCE.getSizeProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE_PROPERTY__VALUE = eINSTANCE.getSizeProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberPropertyImpl <em>Number Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNumberProperty()
     * @generated
     */
    EClass NUMBER_PROPERTY = eINSTANCE.getNumberProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_PROPERTY__PROPERTY = eINSTANCE.getNumberProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_PROPERTY__VALUE = eINSTANCE.getNumberProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getIntegerProperty()
     * @generated
     */
    EClass INTEGER_PROPERTY = eINSTANCE.getIntegerProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_PROPERTY__PROPERTY = eINSTANCE.getIntegerProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_PROPERTY__VALUE = eINSTANCE.getIntegerProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertyImpl <em>Paint Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintProperty()
     * @generated
     */
    EClass PAINT_PROPERTY = eINSTANCE.getPaintProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAINT_PROPERTY__PROPERTY = eINSTANCE.getPaintProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAINT_PROPERTY__VALUE = eINSTANCE.getPaintProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertiesImpl <em>Paint Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintPropertiesImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintProperties()
     * @generated
     */
    EClass PAINT_PROPERTIES = eINSTANCE.getPaintProperties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAINT_PROPERTIES__PROPERTY = eINSTANCE.getPaintProperties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAINT_PROPERTIES__VALUES = eINSTANCE.getPaintProperties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlendPropertyImpl <em>Blend Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlendPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBlendProperty()
     * @generated
     */
    EClass BLEND_PROPERTY = eINSTANCE.getBlendProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLEND_PROPERTY__VALUE = eINSTANCE.getBlendProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertyImpl <em>Url Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlProperty()
     * @generated
     */
    EClass URL_PROPERTY = eINSTANCE.getUrlProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_PROPERTY__PROPERTY = eINSTANCE.getUrlProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_PROPERTY__VALUE = eINSTANCE.getUrlProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertiesImpl <em>Multi Size Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertiesImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeProperties()
     * @generated
     */
    EClass MULTI_SIZE_PROPERTIES = eINSTANCE.getMultiSizeProperties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_SIZE_PROPERTIES__PROPERTY = eINSTANCE.getMultiSizeProperties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_SIZE_PROPERTIES__VALUES = eINSTANCE.getMultiSizeProperties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HPositionPropertyImpl <em>HPosition Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HPositionPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHPositionProperty()
     * @generated
     */
    EClass HPOSITION_PROPERTY = eINSTANCE.getHPositionProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HPOSITION_PROPERTY__PROPERTY = eINSTANCE.getHPositionProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HPOSITION_PROPERTY__VALUE = eINSTANCE.getHPositionProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionPropertyImpl <em>VPosition Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVPositionProperty()
     * @generated
     */
    EClass VPOSITION_PROPERTY = eINSTANCE.getVPositionProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VPOSITION_PROPERTY__PROPERTY = eINSTANCE.getVPositionProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VPOSITION_PROPERTY__VALUE = eINSTANCE.getVPositionProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SidePropertyImpl <em>Side Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SidePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSideProperty()
     * @generated
     */
    EClass SIDE_PROPERTY = eINSTANCE.getSideProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIDE_PROPERTY__PROPERTY = eINSTANCE.getSideProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIDE_PROPERTY__VALUE = eINSTANCE.getSideProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BarPolicyPropertyImpl <em>Bar Policy Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BarPolicyPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBarPolicyProperty()
     * @generated
     */
    EClass BAR_POLICY_PROPERTY = eINSTANCE.getBarPolicyProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BAR_POLICY_PROPERTY__PROPERTY = eINSTANCE.getBarPolicyProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BAR_POLICY_PROPERTY__VALUE = eINSTANCE.getBarPolicyProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertiesImpl <em>Url Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlPropertiesImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlProperties()
     * @generated
     */
    EClass URL_PROPERTIES = eINSTANCE.getUrlProperties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_PROPERTIES__PROPERTY = eINSTANCE.getUrlProperties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_PROPERTIES__VALUES = eINSTANCE.getUrlProperties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatPropertiesImpl <em>Repeat Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatPropertiesImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRepeatProperties()
     * @generated
     */
    EClass REPEAT_PROPERTIES = eINSTANCE.getRepeatProperties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_PROPERTIES__PROPERTY = eINSTANCE.getRepeatProperties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_PROPERTIES__VALUES = eINSTANCE.getRepeatProperties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertyImpl <em>Multi Size Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeProperty()
     * @generated
     */
    EClass MULTI_SIZE_PROPERTY = eINSTANCE.getMultiSizeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_SIZE_PROPERTY__PROPERTY = eINSTANCE.getMultiSizeProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_SIZE_PROPERTY__VALUE = eINSTANCE.getMultiSizeProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertiesImpl <em>Size Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizePropertiesImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeProperties()
     * @generated
     */
    EClass SIZE_PROPERTIES = eINSTANCE.getSizeProperties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_PROPERTIES__PROPERTY = eINSTANCE.getSizeProperties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE_PROPERTIES__VALUES = eINSTANCE.getSizeProperties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineCapPropertyImpl <em>Stroke Line Cap Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineCapPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStrokeLineCapProperty()
     * @generated
     */
    EClass STROKE_LINE_CAP_PROPERTY = eINSTANCE.getStrokeLineCapProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STROKE_LINE_CAP_PROPERTY__VALUE = eINSTANCE.getStrokeLineCapProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineJoinPropertyImpl <em>Stroke Line Join Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StrokeLineJoinPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStrokeLineJoinProperty()
     * @generated
     */
    EClass STROKE_LINE_JOIN_PROPERTY = eINSTANCE.getStrokeLineJoinProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STROKE_LINE_JOIN_PROPERTY__VALUE = eINSTANCE.getStrokeLineJoinProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextAlignmentPropertyImpl <em>Text Alignment Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextAlignmentPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextAlignmentProperty()
     * @generated
     */
    EClass TEXT_ALIGNMENT_PROPERTY = eINSTANCE.getTextAlignmentProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_ALIGNMENT_PROPERTY__VALUE = eINSTANCE.getTextAlignmentProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOriginPropertyImpl <em>Text Origin Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOriginPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextOriginProperty()
     * @generated
     */
    EClass TEXT_ORIGIN_PROPERTY = eINSTANCE.getTextOriginProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_ORIGIN_PROPERTY__VALUE = eINSTANCE.getTextOriginProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImagePositionPropertyImpl <em>Background Image Position Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImagePositionPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBackgroundImagePositionProperty()
     * @generated
     */
    EClass BACKGROUND_IMAGE_POSITION_PROPERTY = eINSTANCE.getBackgroundImagePositionProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND_IMAGE_POSITION_PROPERTY__VALUES = eINSTANCE.getBackgroundImagePositionProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImageSizePropertyImpl <em>Background Image Size Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BackgroundImageSizePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBackgroundImageSizeProperty()
     * @generated
     */
    EClass BACKGROUND_IMAGE_SIZE_PROPERTY = eINSTANCE.getBackgroundImageSizeProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES = eINSTANCE.getBackgroundImageSizeProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderColorPropertyImpl <em>Border Color Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderColorPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderColorProperty()
     * @generated
     */
    EClass BORDER_COLOR_PROPERTY = eINSTANCE.getBorderColorProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_COLOR_PROPERTY__VALUES = eINSTANCE.getBorderColorProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStylePropertyImpl <em>Border Style Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStylePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderStyleProperty()
     * @generated
     */
    EClass BORDER_STYLE_PROPERTY = eINSTANCE.getBorderStyleProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_STYLE_PROPERTY__VALUES = eINSTANCE.getBorderStyleProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderImageSlicePropertyImpl <em>Border Image Slice Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderImageSlicePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderImageSliceProperty()
     * @generated
     */
    EClass BORDER_IMAGE_SLICE_PROPERTY = eINSTANCE.getBorderImageSliceProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_IMAGE_SLICE_PROPERTY__VALUES = eINSTANCE.getBorderImageSliceProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ShapePropertyImpl <em>Shape Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ShapePropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getShapeProperty()
     * @generated
     */
    EClass SHAPE_PROPERTY = eINSTANCE.getShapeProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_PROPERTY__VALUE = eINSTANCE.getShapeProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextPropertyImpl <em>Text Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextProperty()
     * @generated
     */
    EClass TEXT_PROPERTY = eINSTANCE.getTextProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_PROPERTY__VALUE = eINSTANCE.getTextProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOverrunPropertyImpl <em>Text Overrun Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.TextOverrunPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getTextOverrunProperty()
     * @generated
     */
    EClass TEXT_OVERRUN_PROPERTY = eINSTANCE.getTextOverrunProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_OVERRUN_PROPERTY__VALUE = eINSTANCE.getTextOverrunProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.EchoCharPropertyImpl <em>Echo Char Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.EchoCharPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getEchoCharProperty()
     * @generated
     */
    EClass ECHO_CHAR_PROPERTY = eINSTANCE.getEchoCharProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECHO_CHAR_PROPERTY__VALUE = eINSTANCE.getEchoCharProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.InsetsPropertyImpl <em>Insets Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.InsetsPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getInsetsProperty()
     * @generated
     */
    EClass INSETS_PROPERTY = eINSTANCE.getInsetsProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSETS_PROPERTY__VALUE = eINSTANCE.getInsetsProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HorizontalGridLineStrokeDashArrayPropertyImpl <em>Horizontal Grid Line Stroke Dash Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HorizontalGridLineStrokeDashArrayPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHorizontalGridLineStrokeDashArrayProperty()
     * @generated
     */
    EClass HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY = eINSTANCE.getHorizontalGridLineStrokeDashArrayProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUE = eINSTANCE.getHorizontalGridLineStrokeDashArrayProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VerticalGridLineStrokeDashArrayPropertyImpl <em>Vertical Grid Line Stroke Dash Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VerticalGridLineStrokeDashArrayPropertyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVerticalGridLineStrokeDashArrayProperty()
     * @generated
     */
    EClass VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY = eINSTANCE.getVerticalGridLineStrokeDashArrayProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUES = eINSTANCE.getVerticalGridLineStrokeDashArrayProperty_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionValueImpl <em>VPosition Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.VPositionValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getVPositionValue()
     * @generated
     */
    EClass VPOSITION_VALUE = eINSTANCE.getVPositionValue();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VPOSITION_VALUE__V = eINSTANCE.getVPositionValue_V();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlurValueImpl <em>Blur Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BlurValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBlurValue()
     * @generated
     */
    EClass BLUR_VALUE = eINSTANCE.getBlurValue();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLUR_VALUE__V = eINSTANCE.getBlurValue_V();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NumberValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.IntegerValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RealValueImpl <em>Real Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RealValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRealValue()
     * @generated
     */
    EClass REAL_VALUE = eINSTANCE.getRealValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_VALUE__VALUE = eINSTANCE.getRealValue_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlValueImpl <em>Url Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.UrlValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getUrlValue()
     * @generated
     */
    EClass URL_VALUE = eINSTANCE.getUrlValue();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_VALUE__ADDRESS = eINSTANCE.getUrlValue_Address();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.AddressValueImpl <em>Address Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.AddressValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getAddressValue()
     * @generated
     */
    EClass ADDRESS_VALUE = eINSTANCE.getAddressValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_VALUE__VALUE = eINSTANCE.getAddressValue_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeValueImpl <em>Size Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeValue()
     * @generated
     */
    EClass SIZE_VALUE = eINSTANCE.getSizeValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE_VALUE__VALUE = eINSTANCE.getSizeValue_Value();

    /**
     * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_VALUE__DIMENSION = eINSTANCE.getSizeValue_Dimension();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizeValueImpl <em>Multi Size Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiSizeValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiSizeValue()
     * @generated
     */
    EClass MULTI_SIZE_VALUE = eINSTANCE.getMultiSizeValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_SIZE_VALUE__VALUES = eINSTANCE.getMultiSizeValue_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl <em>Bg Position Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgPositionValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBgPositionValue()
     * @generated
     */
    EClass BG_POSITION_VALUE = eINSTANCE.getBgPositionValue();

    /**
     * The meta object literal for the '<em><b>Absx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BG_POSITION_VALUE__ABSX = eINSTANCE.getBgPositionValue_Absx();

    /**
     * The meta object literal for the '<em><b>Relx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION_VALUE__RELX = eINSTANCE.getBgPositionValue_Relx();

    /**
     * The meta object literal for the '<em><b>Absy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BG_POSITION_VALUE__ABSY = eINSTANCE.getBgPositionValue_Absy();

    /**
     * The meta object literal for the '<em><b>Rely</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION_VALUE__RELY = eINSTANCE.getBgPositionValue_Rely();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl <em>Repeat Style Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RepeatStyleValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRepeatStyleValue()
     * @generated
     */
    EClass REPEAT_STYLE_VALUE = eINSTANCE.getRepeatStyleValue();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_STYLE_VALUE__V = eINSTANCE.getRepeatStyleValue_V();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_STYLE_VALUE__V2 = eINSTANCE.getRepeatStyleValue_V2();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl <em>Bg Size Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BgSizeValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBgSizeValue()
     * @generated
     */
    EClass BG_SIZE_VALUE = eINSTANCE.getBgSizeValue();

    /**
     * The meta object literal for the '<em><b>Xsize</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BG_SIZE_VALUE__XSIZE = eINSTANCE.getBgSizeValue_Xsize();

    /**
     * The meta object literal for the '<em><b>Xauto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE_VALUE__XAUTO = eINSTANCE.getBgSizeValue_Xauto();

    /**
     * The meta object literal for the '<em><b>Ysize</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BG_SIZE_VALUE__YSIZE = eINSTANCE.getBgSizeValue_Ysize();

    /**
     * The meta object literal for the '<em><b>Yauto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE_VALUE__YAUTO = eINSTANCE.getBgSizeValue_Yauto();

    /**
     * The meta object literal for the '<em><b>Predefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE_VALUE__PREDEFINED = eINSTANCE.getBgSizeValue_Predefined();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiPaintValueImpl <em>Multi Paint Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.MultiPaintValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getMultiPaintValue()
     * @generated
     */
    EClass MULTI_PAINT_VALUE = eINSTANCE.getMultiPaintValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_PAINT_VALUE__VALUES = eINSTANCE.getMultiPaintValue_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl <em>Border Style Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.BorderStyleValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBorderStyleValue()
     * @generated
     */
    EClass BORDER_STYLE_VALUE = eINSTANCE.getBorderStyleValue();

    /**
     * The meta object literal for the '<em><b>Dash Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_STYLE_VALUE__DASH_STYLE = eINSTANCE.getBorderStyleValue_DashStyle();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE_VALUE__LOCATION = eINSTANCE.getBorderStyleValue_Location();

    /**
     * The meta object literal for the '<em><b>Miter Abs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_STYLE_VALUE__MITER_ABS = eINSTANCE.getBorderStyleValue_MiterAbs();

    /**
     * The meta object literal for the '<em><b>Miter Predefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE_VALUE__MITER_PREDEFINED = eINSTANCE.getBorderStyleValue_MiterPredefined();

    /**
     * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE_VALUE__LINE_CAP = eINSTANCE.getBorderStyleValue_LineCap();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.DashStyleValueImpl <em>Dash Style Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.DashStyleValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getDashStyleValue()
     * @generated
     */
    EClass DASH_STYLE_VALUE = eINSTANCE.getDashStyleValue();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DASH_STYLE_VALUE__V = eINSTANCE.getDashStyleValue_V();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeFillImpl <em>Size Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.SizeFillImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getSizeFill()
     * @generated
     */
    EClass SIZE_FILL = eINSTANCE.getSizeFill();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE_FILL__VALUE = eINSTANCE.getSizeFill_Value();

    /**
     * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FILL__FILL = eINSTANCE.getSizeFill_Fill();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl <em>Font Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontValue()
     * @generated
     */
    EClass FONT_VALUE = eINSTANCE.getFontValue();

    /**
     * The meta object literal for the '<em><b>Style Or Weight String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_VALUE__STYLE_OR_WEIGHT_STRING = eINSTANCE.getFontValue_StyleOrWeightString();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_VALUE__WEIGHT = eINSTANCE.getFontValue_Weight();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_VALUE__SIZE = eINSTANCE.getFontValue_Size();

    /**
     * The meta object literal for the '<em><b>Family</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_VALUE__FAMILY = eINSTANCE.getFontValue_Family();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStyleValueImpl <em>Font Style Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontStyleValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontStyleValue()
     * @generated
     */
    EClass FONT_STYLE_VALUE = eINSTANCE.getFontStyleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_STYLE_VALUE__VALUE = eINSTANCE.getFontStyleValue_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl <em>Font Weight Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontWeightValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontWeightValue()
     * @generated
     */
    EClass FONT_WEIGHT_VALUE = eINSTANCE.getFontWeightValue();

    /**
     * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_WEIGHT_VALUE__VALUE_STRING = eINSTANCE.getFontWeightValue_ValueString();

    /**
     * The meta object literal for the '<em><b>Value Int</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_WEIGHT_VALUE__VALUE_INT = eINSTANCE.getFontWeightValue_ValueInt();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyImpl <em>Font Family</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.FontFamilyImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getFontFamily()
     * @generated
     */
    EClass FONT_FAMILY = eINSTANCE.getFontFamily();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_FAMILY__VALUE = eINSTANCE.getFontFamily_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintValueImpl <em>Paint Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.PaintValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getPaintValue()
     * @generated
     */
    EClass PAINT_VALUE = eINSTANCE.getPaintValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.LinearGradientImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getLinearGradient()
     * @generated
     */
    EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

    /**
     * The meta object literal for the '<em><b>X1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__X1 = eINSTANCE.getLinearGradient_X1();

    /**
     * The meta object literal for the '<em><b>Y1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__Y1 = eINSTANCE.getLinearGradient_Y1();

    /**
     * The meta object literal for the '<em><b>X2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__X2 = eINSTANCE.getLinearGradient_X2();

    /**
     * The meta object literal for the '<em><b>Y2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__Y2 = eINSTANCE.getLinearGradient_Y2();

    /**
     * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__STOPS = eINSTANCE.getLinearGradient_Stops();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RadialGradientImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRadialGradient()
     * @generated
     */
    EClass RADIAL_GRADIENT = eINSTANCE.getRadialGradient();

    /**
     * The meta object literal for the '<em><b>Cx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__CX = eINSTANCE.getRadialGradient_Cx();

    /**
     * The meta object literal for the '<em><b>Cy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__CY = eINSTANCE.getRadialGradient_Cy();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__RADIUS = eINSTANCE.getRadialGradient_Radius();

    /**
     * The meta object literal for the '<em><b>Fx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__FX = eINSTANCE.getRadialGradient_Fx();

    /**
     * The meta object literal for the '<em><b>Fy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__FY = eINSTANCE.getRadialGradient_Fy();

    /**
     * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__STOPS = eINSTANCE.getRadialGradient_Stops();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.StopValueImpl <em>Stop Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.StopValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getStopValue()
     * @generated
     */
    EClass STOP_VALUE = eINSTANCE.getStopValue();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP_VALUE__POS = eINSTANCE.getStopValue_Pos();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP_VALUE__COLOR = eINSTANCE.getStopValue_Color();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorValueImpl <em>Color Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorValueImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getColorValue()
     * @generated
     */
    EClass COLOR_VALUE = eINSTANCE.getColorValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.NamedColorImpl <em>Named Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.NamedColorImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getNamedColor()
     * @generated
     */
    EClass NAMED_COLOR = eINSTANCE.getNamedColor();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_COLOR__VALUE = eINSTANCE.getNamedColor_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl <em>RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.RGBColorImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getRGBColor()
     * @generated
     */
    EClass RGB_COLOR = eINSTANCE.getRGBColor();

    /**
     * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__HEX = eINSTANCE.getRGBColor_Hex();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__R = eINSTANCE.getRGBColor_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__G = eINSTANCE.getRGBColor_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__B = eINSTANCE.getRGBColor_B();

    /**
     * The meta object literal for the '<em><b>Rp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__RP = eINSTANCE.getRGBColor_Rp();

    /**
     * The meta object literal for the '<em><b>Gp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__GP = eINSTANCE.getRGBColor_Gp();

    /**
     * The meta object literal for the '<em><b>Bp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__BP = eINSTANCE.getRGBColor_Bp();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RGB_COLOR__ALPHA = eINSTANCE.getRGBColor_Alpha();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl <em>HSB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.HSBColorImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHSBColor()
     * @generated
     */
    EClass HSB_COLOR = eINSTANCE.getHSBColor();

    /**
     * The meta object literal for the '<em><b>Hue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSB_COLOR__HUE = eINSTANCE.getHSBColor_Hue();

    /**
     * The meta object literal for the '<em><b>Saturation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSB_COLOR__SATURATION = eINSTANCE.getHSBColor_Saturation();

    /**
     * The meta object literal for the '<em><b>Brightness</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSB_COLOR__BRIGHTNESS = eINSTANCE.getHSBColor_Brightness();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSB_COLOR__ALPHA = eINSTANCE.getHSBColor_Alpha();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl <em>Color Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.ColorFunctionImpl
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getColorFunction()
     * @generated
     */
    EClass COLOR_FUNCTION = eINSTANCE.getColorFunction();

    /**
     * The meta object literal for the '<em><b>Orig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__ORIG = eINSTANCE.getColorFunction_Orig();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__MOD = eINSTANCE.getColorFunction_Mod();

    /**
     * The meta object literal for the '<em><b>Stop Numbers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__STOP_NUMBERS = eINSTANCE.getColorFunction_StopNumbers();

    /**
     * The meta object literal for the '<em><b>Stop Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__STOP_COLORS = eINSTANCE.getColorFunction_StopColors();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue <em>Boolean Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getBooleanValue()
     * @generated
     */
    EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue <em>HPosition Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue
     * @see at.bestsolution.e4.jfx.xtext.jFXCss.impl.JFXCssPackageImpl#getHPositionValue()
     * @generated
     */
    EEnum HPOSITION_VALUE = eINSTANCE.getHPositionValue();

  }

} //JFXCssPackage
