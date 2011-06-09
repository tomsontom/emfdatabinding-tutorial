/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JFXCssFactoryImpl extends EFactoryImpl implements JFXCssFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JFXCssFactory init()
  {
    try
    {
      JFXCssFactory theJFXCssFactory = (JFXCssFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/e4/jfx/xtext/JFXCss"); 
      if (theJFXCssFactory != null)
      {
        return theJFXCssFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JFXCssFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCssFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JFXCssPackage.JFX_CSS: return createJFXCss();
      case JFXCssPackage.DEFINITION: return createDefinition();
      case JFXCssPackage.SELECTOR: return createSelector();
      case JFXCssPackage.SIMPLE_SELECTOR: return createSimpleSelector();
      case JFXCssPackage.ELEMENT_NAME: return createElementName();
      case JFXCssPackage.ELEMENT_ID: return createElementId();
      case JFXCssPackage.ELEMENT_CLASS: return createElementClass();
      case JFXCssPackage.ELEMENT_PSEUDO_CLASS: return createElementPseudoClass();
      case JFXCssPackage.FX_PROPERTY: return createFXProperty();
      case JFXCssPackage.FONT_PROPERTY: return createFontProperty();
      case JFXCssPackage.FONT_FAMILY_PROPERTY: return createFontFamilyProperty();
      case JFXCssPackage.FONT_SIZE_PROPERTY: return createFontSizeProperty();
      case JFXCssPackage.FONT_STYLE_PROPERTY: return createFontStyleProperty();
      case JFXCssPackage.FONT_WEIGHT_PROPERTY: return createFontWeightProperty();
      case JFXCssPackage.CURSOR_PROPERTY: return createCursorProperty();
      case JFXCssPackage.EFFECT_PROPERTY: return createEffectProperty();
      case JFXCssPackage.EFFECT: return createEffect();
      case JFXCssPackage.EFFECT_DROP_SHADOW: return createEffectDropShadow();
      case JFXCssPackage.EFFECT_INNER_SHADOW: return createEffectInnerShadow();
      case JFXCssPackage.BOOLEAN_PROPERTY: return createBooleanProperty();
      case JFXCssPackage.SIZE_PROPERTY: return createSizeProperty();
      case JFXCssPackage.NUMBER_PROPERTY: return createNumberProperty();
      case JFXCssPackage.INTEGER_PROPERTY: return createIntegerProperty();
      case JFXCssPackage.PAINT_PROPERTY: return createPaintProperty();
      case JFXCssPackage.PAINT_PROPERTIES: return createPaintProperties();
      case JFXCssPackage.BLEND_PROPERTY: return createBlendProperty();
      case JFXCssPackage.URL_PROPERTY: return createUrlProperty();
      case JFXCssPackage.MULTI_SIZE_PROPERTIES: return createMultiSizeProperties();
      case JFXCssPackage.HPOSITION_PROPERTY: return createHPositionProperty();
      case JFXCssPackage.VPOSITION_PROPERTY: return createVPositionProperty();
      case JFXCssPackage.SIDE_PROPERTY: return createSideProperty();
      case JFXCssPackage.BAR_POLICY_PROPERTY: return createBarPolicyProperty();
      case JFXCssPackage.URL_PROPERTIES: return createUrlProperties();
      case JFXCssPackage.REPEAT_PROPERTIES: return createRepeatProperties();
      case JFXCssPackage.MULTI_SIZE_PROPERTY: return createMultiSizeProperty();
      case JFXCssPackage.SIZE_PROPERTIES: return createSizeProperties();
      case JFXCssPackage.STROKE_LINE_CAP_PROPERTY: return createStrokeLineCapProperty();
      case JFXCssPackage.STROKE_LINE_JOIN_PROPERTY: return createStrokeLineJoinProperty();
      case JFXCssPackage.TEXT_ALIGNMENT_PROPERTY: return createTextAlignmentProperty();
      case JFXCssPackage.TEXT_ORIGIN_PROPERTY: return createTextOriginProperty();
      case JFXCssPackage.BACKGROUND_IMAGE_POSITION_PROPERTY: return createBackgroundImagePositionProperty();
      case JFXCssPackage.BACKGROUND_IMAGE_SIZE_PROPERTY: return createBackgroundImageSizeProperty();
      case JFXCssPackage.BORDER_COLOR_PROPERTY: return createBorderColorProperty();
      case JFXCssPackage.BORDER_STYLE_PROPERTY: return createBorderStyleProperty();
      case JFXCssPackage.BORDER_IMAGE_SLICE_PROPERTY: return createBorderImageSliceProperty();
      case JFXCssPackage.SHAPE_PROPERTY: return createShapeProperty();
      case JFXCssPackage.TEXT_PROPERTY: return createTextProperty();
      case JFXCssPackage.TEXT_OVERRUN_PROPERTY: return createTextOverrunProperty();
      case JFXCssPackage.ECHO_CHAR_PROPERTY: return createEchoCharProperty();
      case JFXCssPackage.INSETS_PROPERTY: return createInsetsProperty();
      case JFXCssPackage.HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY: return createHorizontalGridLineStrokeDashArrayProperty();
      case JFXCssPackage.VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY: return createVerticalGridLineStrokeDashArrayProperty();
      case JFXCssPackage.VPOSITION_VALUE: return createVPositionValue();
      case JFXCssPackage.BLUR_VALUE: return createBlurValue();
      case JFXCssPackage.NUMBER_VALUE: return createNumberValue();
      case JFXCssPackage.INTEGER_VALUE: return createIntegerValue();
      case JFXCssPackage.REAL_VALUE: return createRealValue();
      case JFXCssPackage.URL_VALUE: return createUrlValue();
      case JFXCssPackage.ADDRESS_VALUE: return createAddressValue();
      case JFXCssPackage.SIZE_VALUE: return createSizeValue();
      case JFXCssPackage.MULTI_SIZE_VALUE: return createMultiSizeValue();
      case JFXCssPackage.BG_POSITION_VALUE: return createBgPositionValue();
      case JFXCssPackage.REPEAT_STYLE_VALUE: return createRepeatStyleValue();
      case JFXCssPackage.BG_SIZE_VALUE: return createBgSizeValue();
      case JFXCssPackage.MULTI_PAINT_VALUE: return createMultiPaintValue();
      case JFXCssPackage.BORDER_STYLE_VALUE: return createBorderStyleValue();
      case JFXCssPackage.DASH_STYLE_VALUE: return createDashStyleValue();
      case JFXCssPackage.SIZE_FILL: return createSizeFill();
      case JFXCssPackage.FONT_VALUE: return createFontValue();
      case JFXCssPackage.FONT_STYLE_VALUE: return createFontStyleValue();
      case JFXCssPackage.FONT_WEIGHT_VALUE: return createFontWeightValue();
      case JFXCssPackage.FONT_FAMILY: return createFontFamily();
      case JFXCssPackage.PAINT_VALUE: return createPaintValue();
      case JFXCssPackage.LINEAR_GRADIENT: return createLinearGradient();
      case JFXCssPackage.RADIAL_GRADIENT: return createRadialGradient();
      case JFXCssPackage.STOP_VALUE: return createStopValue();
      case JFXCssPackage.COLOR_VALUE: return createColorValue();
      case JFXCssPackage.NAMED_COLOR: return createNamedColor();
      case JFXCssPackage.RGB_COLOR: return createRGBColor();
      case JFXCssPackage.HSB_COLOR: return createHSBColor();
      case JFXCssPackage.COLOR_FUNCTION: return createColorFunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JFXCssPackage.BOOLEAN_VALUE:
        return createBooleanValueFromString(eDataType, initialValue);
      case JFXCssPackage.HPOSITION_VALUE:
        return createHPositionValueFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JFXCssPackage.BOOLEAN_VALUE:
        return convertBooleanValueToString(eDataType, instanceValue);
      case JFXCssPackage.HPOSITION_VALUE:
        return convertHPositionValueToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCss createJFXCss()
  {
    JFXCssImpl jfxCss = new JFXCssImpl();
    return jfxCss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelector createSimpleSelector()
  {
    SimpleSelectorImpl simpleSelector = new SimpleSelectorImpl();
    return simpleSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementName createElementName()
  {
    ElementNameImpl elementName = new ElementNameImpl();
    return elementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementId createElementId()
  {
    ElementIdImpl elementId = new ElementIdImpl();
    return elementId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementClass createElementClass()
  {
    ElementClassImpl elementClass = new ElementClassImpl();
    return elementClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementPseudoClass createElementPseudoClass()
  {
    ElementPseudoClassImpl elementPseudoClass = new ElementPseudoClassImpl();
    return elementPseudoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXProperty createFXProperty()
  {
    FXPropertyImpl fxProperty = new FXPropertyImpl();
    return fxProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontProperty createFontProperty()
  {
    FontPropertyImpl fontProperty = new FontPropertyImpl();
    return fontProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamilyProperty createFontFamilyProperty()
  {
    FontFamilyPropertyImpl fontFamilyProperty = new FontFamilyPropertyImpl();
    return fontFamilyProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSizeProperty createFontSizeProperty()
  {
    FontSizePropertyImpl fontSizeProperty = new FontSizePropertyImpl();
    return fontSizeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleProperty createFontStyleProperty()
  {
    FontStylePropertyImpl fontStyleProperty = new FontStylePropertyImpl();
    return fontStyleProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontWeightProperty createFontWeightProperty()
  {
    FontWeightPropertyImpl fontWeightProperty = new FontWeightPropertyImpl();
    return fontWeightProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CursorProperty createCursorProperty()
  {
    CursorPropertyImpl cursorProperty = new CursorPropertyImpl();
    return cursorProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectProperty createEffectProperty()
  {
    EffectPropertyImpl effectProperty = new EffectPropertyImpl();
    return effectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectDropShadow createEffectDropShadow()
  {
    EffectDropShadowImpl effectDropShadow = new EffectDropShadowImpl();
    return effectDropShadow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectInnerShadow createEffectInnerShadow()
  {
    EffectInnerShadowImpl effectInnerShadow = new EffectInnerShadowImpl();
    return effectInnerShadow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanProperty createBooleanProperty()
  {
    BooleanPropertyImpl booleanProperty = new BooleanPropertyImpl();
    return booleanProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeProperty createSizeProperty()
  {
    SizePropertyImpl sizeProperty = new SizePropertyImpl();
    return sizeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberProperty createNumberProperty()
  {
    NumberPropertyImpl numberProperty = new NumberPropertyImpl();
    return numberProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerProperty createIntegerProperty()
  {
    IntegerPropertyImpl integerProperty = new IntegerPropertyImpl();
    return integerProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaintProperty createPaintProperty()
  {
    PaintPropertyImpl paintProperty = new PaintPropertyImpl();
    return paintProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaintProperties createPaintProperties()
  {
    PaintPropertiesImpl paintProperties = new PaintPropertiesImpl();
    return paintProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlendProperty createBlendProperty()
  {
    BlendPropertyImpl blendProperty = new BlendPropertyImpl();
    return blendProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlProperty createUrlProperty()
  {
    UrlPropertyImpl urlProperty = new UrlPropertyImpl();
    return urlProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiSizeProperties createMultiSizeProperties()
  {
    MultiSizePropertiesImpl multiSizeProperties = new MultiSizePropertiesImpl();
    return multiSizeProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HPositionProperty createHPositionProperty()
  {
    HPositionPropertyImpl hPositionProperty = new HPositionPropertyImpl();
    return hPositionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VPositionProperty createVPositionProperty()
  {
    VPositionPropertyImpl vPositionProperty = new VPositionPropertyImpl();
    return vPositionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SideProperty createSideProperty()
  {
    SidePropertyImpl sideProperty = new SidePropertyImpl();
    return sideProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarPolicyProperty createBarPolicyProperty()
  {
    BarPolicyPropertyImpl barPolicyProperty = new BarPolicyPropertyImpl();
    return barPolicyProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlProperties createUrlProperties()
  {
    UrlPropertiesImpl urlProperties = new UrlPropertiesImpl();
    return urlProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatProperties createRepeatProperties()
  {
    RepeatPropertiesImpl repeatProperties = new RepeatPropertiesImpl();
    return repeatProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiSizeProperty createMultiSizeProperty()
  {
    MultiSizePropertyImpl multiSizeProperty = new MultiSizePropertyImpl();
    return multiSizeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeProperties createSizeProperties()
  {
    SizePropertiesImpl sizeProperties = new SizePropertiesImpl();
    return sizeProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrokeLineCapProperty createStrokeLineCapProperty()
  {
    StrokeLineCapPropertyImpl strokeLineCapProperty = new StrokeLineCapPropertyImpl();
    return strokeLineCapProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrokeLineJoinProperty createStrokeLineJoinProperty()
  {
    StrokeLineJoinPropertyImpl strokeLineJoinProperty = new StrokeLineJoinPropertyImpl();
    return strokeLineJoinProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAlignmentProperty createTextAlignmentProperty()
  {
    TextAlignmentPropertyImpl textAlignmentProperty = new TextAlignmentPropertyImpl();
    return textAlignmentProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextOriginProperty createTextOriginProperty()
  {
    TextOriginPropertyImpl textOriginProperty = new TextOriginPropertyImpl();
    return textOriginProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackgroundImagePositionProperty createBackgroundImagePositionProperty()
  {
    BackgroundImagePositionPropertyImpl backgroundImagePositionProperty = new BackgroundImagePositionPropertyImpl();
    return backgroundImagePositionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackgroundImageSizeProperty createBackgroundImageSizeProperty()
  {
    BackgroundImageSizePropertyImpl backgroundImageSizeProperty = new BackgroundImageSizePropertyImpl();
    return backgroundImageSizeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderColorProperty createBorderColorProperty()
  {
    BorderColorPropertyImpl borderColorProperty = new BorderColorPropertyImpl();
    return borderColorProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyleProperty createBorderStyleProperty()
  {
    BorderStylePropertyImpl borderStyleProperty = new BorderStylePropertyImpl();
    return borderStyleProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderImageSliceProperty createBorderImageSliceProperty()
  {
    BorderImageSlicePropertyImpl borderImageSliceProperty = new BorderImageSlicePropertyImpl();
    return borderImageSliceProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeProperty createShapeProperty()
  {
    ShapePropertyImpl shapeProperty = new ShapePropertyImpl();
    return shapeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextProperty createTextProperty()
  {
    TextPropertyImpl textProperty = new TextPropertyImpl();
    return textProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextOverrunProperty createTextOverrunProperty()
  {
    TextOverrunPropertyImpl textOverrunProperty = new TextOverrunPropertyImpl();
    return textOverrunProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EchoCharProperty createEchoCharProperty()
  {
    EchoCharPropertyImpl echoCharProperty = new EchoCharPropertyImpl();
    return echoCharProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsetsProperty createInsetsProperty()
  {
    InsetsPropertyImpl insetsProperty = new InsetsPropertyImpl();
    return insetsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalGridLineStrokeDashArrayProperty createHorizontalGridLineStrokeDashArrayProperty()
  {
    HorizontalGridLineStrokeDashArrayPropertyImpl horizontalGridLineStrokeDashArrayProperty = new HorizontalGridLineStrokeDashArrayPropertyImpl();
    return horizontalGridLineStrokeDashArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalGridLineStrokeDashArrayProperty createVerticalGridLineStrokeDashArrayProperty()
  {
    VerticalGridLineStrokeDashArrayPropertyImpl verticalGridLineStrokeDashArrayProperty = new VerticalGridLineStrokeDashArrayPropertyImpl();
    return verticalGridLineStrokeDashArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VPositionValue createVPositionValue()
  {
    VPositionValueImpl vPositionValue = new VPositionValueImpl();
    return vPositionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlurValue createBlurValue()
  {
    BlurValueImpl blurValue = new BlurValueImpl();
    return blurValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue createNumberValue()
  {
    NumberValueImpl numberValue = new NumberValueImpl();
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealValue createRealValue()
  {
    RealValueImpl realValue = new RealValueImpl();
    return realValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlValue createUrlValue()
  {
    UrlValueImpl urlValue = new UrlValueImpl();
    return urlValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressValue createAddressValue()
  {
    AddressValueImpl addressValue = new AddressValueImpl();
    return addressValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue createSizeValue()
  {
    SizeValueImpl sizeValue = new SizeValueImpl();
    return sizeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiSizeValue createMultiSizeValue()
  {
    MultiSizeValueImpl multiSizeValue = new MultiSizeValueImpl();
    return multiSizeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BgPositionValue createBgPositionValue()
  {
    BgPositionValueImpl bgPositionValue = new BgPositionValueImpl();
    return bgPositionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatStyleValue createRepeatStyleValue()
  {
    RepeatStyleValueImpl repeatStyleValue = new RepeatStyleValueImpl();
    return repeatStyleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BgSizeValue createBgSizeValue()
  {
    BgSizeValueImpl bgSizeValue = new BgSizeValueImpl();
    return bgSizeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiPaintValue createMultiPaintValue()
  {
    MultiPaintValueImpl multiPaintValue = new MultiPaintValueImpl();
    return multiPaintValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyleValue createBorderStyleValue()
  {
    BorderStyleValueImpl borderStyleValue = new BorderStyleValueImpl();
    return borderStyleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DashStyleValue createDashStyleValue()
  {
    DashStyleValueImpl dashStyleValue = new DashStyleValueImpl();
    return dashStyleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeFill createSizeFill()
  {
    SizeFillImpl sizeFill = new SizeFillImpl();
    return sizeFill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontValue createFontValue()
  {
    FontValueImpl fontValue = new FontValueImpl();
    return fontValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleValue createFontStyleValue()
  {
    FontStyleValueImpl fontStyleValue = new FontStyleValueImpl();
    return fontStyleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontWeightValue createFontWeightValue()
  {
    FontWeightValueImpl fontWeightValue = new FontWeightValueImpl();
    return fontWeightValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamily createFontFamily()
  {
    FontFamilyImpl fontFamily = new FontFamilyImpl();
    return fontFamily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaintValue createPaintValue()
  {
    PaintValueImpl paintValue = new PaintValueImpl();
    return paintValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearGradient createLinearGradient()
  {
    LinearGradientImpl linearGradient = new LinearGradientImpl();
    return linearGradient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadialGradient createRadialGradient()
  {
    RadialGradientImpl radialGradient = new RadialGradientImpl();
    return radialGradient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StopValue createStopValue()
  {
    StopValueImpl stopValue = new StopValueImpl();
    return stopValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValue createColorValue()
  {
    ColorValueImpl colorValue = new ColorValueImpl();
    return colorValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedColor createNamedColor()
  {
    NamedColorImpl namedColor = new NamedColorImpl();
    return namedColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGBColor createRGBColor()
  {
    RGBColorImpl rgbColor = new RGBColorImpl();
    return rgbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HSBColor createHSBColor()
  {
    HSBColorImpl hsbColor = new HSBColorImpl();
    return hsbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFunction createColorFunction()
  {
    ColorFunctionImpl colorFunction = new ColorFunctionImpl();
    return colorFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValueFromString(EDataType eDataType, String initialValue)
  {
    BooleanValue result = BooleanValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HPositionValue createHPositionValueFromString(EDataType eDataType, String initialValue)
  {
    HPositionValue result = HPositionValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHPositionValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCssPackage getJFXCssPackage()
  {
    return (JFXCssPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JFXCssPackage getPackage()
  {
    return JFXCssPackage.eINSTANCE;
  }

} //JFXCssFactoryImpl
