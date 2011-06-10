/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.util;

import at.bestsolution.e4.jfx.xtext.jFXCss.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage
 * @generated
 */
public class JFXCssSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JFXCssPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCssSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JFXCssPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JFXCssPackage.JFX_CSS:
      {
        JFXCss jfxCss = (JFXCss)theEObject;
        T result = caseJFXCss(jfxCss);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SELECTOR:
      {
        Selector selector = (Selector)theEObject;
        T result = caseSelector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIMPLE_SELECTOR:
      {
        SimpleSelector simpleSelector = (SimpleSelector)theEObject;
        T result = caseSimpleSelector(simpleSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.ID_SELECTOR:
      {
        IdSelector idSelector = (IdSelector)theEObject;
        T result = caseIdSelector(idSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.CLASS_SELECTOR:
      {
        ClassSelector classSelector = (ClassSelector)theEObject;
        T result = caseClassSelector(classSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.PSEUDO_CLASS_SELECTOR:
      {
        PseudoClassSelector pseudoClassSelector = (PseudoClassSelector)theEObject;
        T result = casePseudoClassSelector(pseudoClassSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FX_PROPERTY:
      {
        FXProperty fxProperty = (FXProperty)theEObject;
        T result = caseFXProperty(fxProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_PROPERTY:
      {
        FontProperty fontProperty = (FontProperty)theEObject;
        T result = caseFontProperty(fontProperty);
        if (result == null) result = caseFXProperty(fontProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_FAMILY_PROPERTY:
      {
        FontFamilyProperty fontFamilyProperty = (FontFamilyProperty)theEObject;
        T result = caseFontFamilyProperty(fontFamilyProperty);
        if (result == null) result = caseFXProperty(fontFamilyProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_SIZE_PROPERTY:
      {
        FontSizeProperty fontSizeProperty = (FontSizeProperty)theEObject;
        T result = caseFontSizeProperty(fontSizeProperty);
        if (result == null) result = caseFXProperty(fontSizeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_STYLE_PROPERTY:
      {
        FontStyleProperty fontStyleProperty = (FontStyleProperty)theEObject;
        T result = caseFontStyleProperty(fontStyleProperty);
        if (result == null) result = caseFXProperty(fontStyleProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_WEIGHT_PROPERTY:
      {
        FontWeightProperty fontWeightProperty = (FontWeightProperty)theEObject;
        T result = caseFontWeightProperty(fontWeightProperty);
        if (result == null) result = caseFXProperty(fontWeightProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.CURSOR_PROPERTY:
      {
        CursorProperty cursorProperty = (CursorProperty)theEObject;
        T result = caseCursorProperty(cursorProperty);
        if (result == null) result = caseFXProperty(cursorProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.EFFECT_PROPERTY:
      {
        EffectProperty effectProperty = (EffectProperty)theEObject;
        T result = caseEffectProperty(effectProperty);
        if (result == null) result = caseFXProperty(effectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.EFFECT_DROP_SHADOW:
      {
        EffectDropShadow effectDropShadow = (EffectDropShadow)theEObject;
        T result = caseEffectDropShadow(effectDropShadow);
        if (result == null) result = caseEffect(effectDropShadow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.EFFECT_INNER_SHADOW:
      {
        EffectInnerShadow effectInnerShadow = (EffectInnerShadow)theEObject;
        T result = caseEffectInnerShadow(effectInnerShadow);
        if (result == null) result = caseEffect(effectInnerShadow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BOOLEAN_PROPERTY:
      {
        BooleanProperty booleanProperty = (BooleanProperty)theEObject;
        T result = caseBooleanProperty(booleanProperty);
        if (result == null) result = caseFXProperty(booleanProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIZE_PROPERTY:
      {
        SizeProperty sizeProperty = (SizeProperty)theEObject;
        T result = caseSizeProperty(sizeProperty);
        if (result == null) result = caseFXProperty(sizeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.NUMBER_PROPERTY:
      {
        NumberProperty numberProperty = (NumberProperty)theEObject;
        T result = caseNumberProperty(numberProperty);
        if (result == null) result = caseFXProperty(numberProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.INTEGER_PROPERTY:
      {
        IntegerProperty integerProperty = (IntegerProperty)theEObject;
        T result = caseIntegerProperty(integerProperty);
        if (result == null) result = caseFXProperty(integerProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.PAINT_PROPERTY:
      {
        PaintProperty paintProperty = (PaintProperty)theEObject;
        T result = casePaintProperty(paintProperty);
        if (result == null) result = caseFXProperty(paintProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.PAINT_PROPERTIES:
      {
        PaintProperties paintProperties = (PaintProperties)theEObject;
        T result = casePaintProperties(paintProperties);
        if (result == null) result = caseFXProperty(paintProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BLEND_PROPERTY:
      {
        BlendProperty blendProperty = (BlendProperty)theEObject;
        T result = caseBlendProperty(blendProperty);
        if (result == null) result = caseFXProperty(blendProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.URL_PROPERTY:
      {
        UrlProperty urlProperty = (UrlProperty)theEObject;
        T result = caseUrlProperty(urlProperty);
        if (result == null) result = caseFXProperty(urlProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.MULTI_SIZE_PROPERTIES:
      {
        MultiSizeProperties multiSizeProperties = (MultiSizeProperties)theEObject;
        T result = caseMultiSizeProperties(multiSizeProperties);
        if (result == null) result = caseFXProperty(multiSizeProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.HPOSITION_PROPERTY:
      {
        HPositionProperty hPositionProperty = (HPositionProperty)theEObject;
        T result = caseHPositionProperty(hPositionProperty);
        if (result == null) result = caseFXProperty(hPositionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.VPOSITION_PROPERTY:
      {
        VPositionProperty vPositionProperty = (VPositionProperty)theEObject;
        T result = caseVPositionProperty(vPositionProperty);
        if (result == null) result = caseFXProperty(vPositionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIDE_PROPERTY:
      {
        SideProperty sideProperty = (SideProperty)theEObject;
        T result = caseSideProperty(sideProperty);
        if (result == null) result = caseFXProperty(sideProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BAR_POLICY_PROPERTY:
      {
        BarPolicyProperty barPolicyProperty = (BarPolicyProperty)theEObject;
        T result = caseBarPolicyProperty(barPolicyProperty);
        if (result == null) result = caseFXProperty(barPolicyProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.URL_PROPERTIES:
      {
        UrlProperties urlProperties = (UrlProperties)theEObject;
        T result = caseUrlProperties(urlProperties);
        if (result == null) result = caseFXProperty(urlProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.REPEAT_PROPERTIES:
      {
        RepeatProperties repeatProperties = (RepeatProperties)theEObject;
        T result = caseRepeatProperties(repeatProperties);
        if (result == null) result = caseFXProperty(repeatProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.MULTI_SIZE_PROPERTY:
      {
        MultiSizeProperty multiSizeProperty = (MultiSizeProperty)theEObject;
        T result = caseMultiSizeProperty(multiSizeProperty);
        if (result == null) result = caseFXProperty(multiSizeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIZE_PROPERTIES:
      {
        SizeProperties sizeProperties = (SizeProperties)theEObject;
        T result = caseSizeProperties(sizeProperties);
        if (result == null) result = caseFXProperty(sizeProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.MULTI_PAINT_PROPERTIES:
      {
        MultiPaintProperties multiPaintProperties = (MultiPaintProperties)theEObject;
        T result = caseMultiPaintProperties(multiPaintProperties);
        if (result == null) result = caseFXProperty(multiPaintProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.COLOR_PROPERTY:
      {
        ColorProperty colorProperty = (ColorProperty)theEObject;
        T result = caseColorProperty(colorProperty);
        if (result == null) result = caseFXProperty(colorProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.STRING_PROPERTY:
      {
        StringProperty stringProperty = (StringProperty)theEObject;
        T result = caseStringProperty(stringProperty);
        if (result == null) result = caseFXProperty(stringProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.POSITION_PROPERTY:
      {
        PositionProperty positionProperty = (PositionProperty)theEObject;
        T result = casePositionProperty(positionProperty);
        if (result == null) result = caseFXProperty(positionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.ALIGNMENT_PROPERTY:
      {
        AlignmentProperty alignmentProperty = (AlignmentProperty)theEObject;
        T result = caseAlignmentProperty(alignmentProperty);
        if (result == null) result = caseFXProperty(alignmentProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.STROKE_LINE_CAP_PROPERTY:
      {
        StrokeLineCapProperty strokeLineCapProperty = (StrokeLineCapProperty)theEObject;
        T result = caseStrokeLineCapProperty(strokeLineCapProperty);
        if (result == null) result = caseFXProperty(strokeLineCapProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.STROKE_LINE_JOIN_PROPERTY:
      {
        StrokeLineJoinProperty strokeLineJoinProperty = (StrokeLineJoinProperty)theEObject;
        T result = caseStrokeLineJoinProperty(strokeLineJoinProperty);
        if (result == null) result = caseFXProperty(strokeLineJoinProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.TEXT_ORIGIN_PROPERTY:
      {
        TextOriginProperty textOriginProperty = (TextOriginProperty)theEObject;
        T result = caseTextOriginProperty(textOriginProperty);
        if (result == null) result = caseFXProperty(textOriginProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BACKGROUND_IMAGE_SIZE_PROPERTY:
      {
        BackgroundImageSizeProperty backgroundImageSizeProperty = (BackgroundImageSizeProperty)theEObject;
        T result = caseBackgroundImageSizeProperty(backgroundImageSizeProperty);
        if (result == null) result = caseFXProperty(backgroundImageSizeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BORDER_STYLE_PROPERTY:
      {
        BorderStyleProperty borderStyleProperty = (BorderStyleProperty)theEObject;
        T result = caseBorderStyleProperty(borderStyleProperty);
        if (result == null) result = caseFXProperty(borderStyleProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BORDER_IMAGE_SLICE_PROPERTY:
      {
        BorderImageSliceProperty borderImageSliceProperty = (BorderImageSliceProperty)theEObject;
        T result = caseBorderImageSliceProperty(borderImageSliceProperty);
        if (result == null) result = caseFXProperty(borderImageSliceProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.TEXT_OVERRUN_PROPERTY:
      {
        TextOverrunProperty textOverrunProperty = (TextOverrunProperty)theEObject;
        T result = caseTextOverrunProperty(textOverrunProperty);
        if (result == null) result = caseFXProperty(textOverrunProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.INSETS_PROPERTY:
      {
        InsetsProperty insetsProperty = (InsetsProperty)theEObject;
        T result = caseInsetsProperty(insetsProperty);
        if (result == null) result = caseFXProperty(insetsProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY:
      {
        HorizontalGridLineStrokeDashArrayProperty horizontalGridLineStrokeDashArrayProperty = (HorizontalGridLineStrokeDashArrayProperty)theEObject;
        T result = caseHorizontalGridLineStrokeDashArrayProperty(horizontalGridLineStrokeDashArrayProperty);
        if (result == null) result = caseFXProperty(horizontalGridLineStrokeDashArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY:
      {
        VerticalGridLineStrokeDashArrayProperty verticalGridLineStrokeDashArrayProperty = (VerticalGridLineStrokeDashArrayProperty)theEObject;
        T result = caseVerticalGridLineStrokeDashArrayProperty(verticalGridLineStrokeDashArrayProperty);
        if (result == null) result = caseFXProperty(verticalGridLineStrokeDashArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.VPOSITION_VALUE:
      {
        VPositionValue vPositionValue = (VPositionValue)theEObject;
        T result = caseVPositionValue(vPositionValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BLUR_VALUE:
      {
        BlurValue blurValue = (BlurValue)theEObject;
        T result = caseBlurValue(blurValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.NUMBER_VALUE:
      {
        NumberValue numberValue = (NumberValue)theEObject;
        T result = caseNumberValue(numberValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseNumberValue(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.REAL_VALUE:
      {
        RealValue realValue = (RealValue)theEObject;
        T result = caseRealValue(realValue);
        if (result == null) result = caseNumberValue(realValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.URL_VALUE:
      {
        UrlValue urlValue = (UrlValue)theEObject;
        T result = caseUrlValue(urlValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.ADDRESS_VALUE:
      {
        AddressValue addressValue = (AddressValue)theEObject;
        T result = caseAddressValue(addressValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIZE_VALUE:
      {
        SizeValue sizeValue = (SizeValue)theEObject;
        T result = caseSizeValue(sizeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.MULTI_SIZE_VALUE:
      {
        MultiSizeValue multiSizeValue = (MultiSizeValue)theEObject;
        T result = caseMultiSizeValue(multiSizeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BG_POSITION_VALUE:
      {
        BgPositionValue bgPositionValue = (BgPositionValue)theEObject;
        T result = caseBgPositionValue(bgPositionValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.REPEAT_STYLE_VALUE:
      {
        RepeatStyleValue repeatStyleValue = (RepeatStyleValue)theEObject;
        T result = caseRepeatStyleValue(repeatStyleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BG_SIZE_VALUE:
      {
        BgSizeValue bgSizeValue = (BgSizeValue)theEObject;
        T result = caseBgSizeValue(bgSizeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.MULTI_PAINT_VALUE:
      {
        MultiPaintValue multiPaintValue = (MultiPaintValue)theEObject;
        T result = caseMultiPaintValue(multiPaintValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.BORDER_STYLE_VALUE:
      {
        BorderStyleValue borderStyleValue = (BorderStyleValue)theEObject;
        T result = caseBorderStyleValue(borderStyleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.DASH_STYLE_VALUE:
      {
        DashStyleValue dashStyleValue = (DashStyleValue)theEObject;
        T result = caseDashStyleValue(dashStyleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.SIZE_FILL:
      {
        SizeFill sizeFill = (SizeFill)theEObject;
        T result = caseSizeFill(sizeFill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_VALUE:
      {
        FontValue fontValue = (FontValue)theEObject;
        T result = caseFontValue(fontValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_STYLE_VALUE:
      {
        FontStyleValue fontStyleValue = (FontStyleValue)theEObject;
        T result = caseFontStyleValue(fontStyleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_WEIGHT_VALUE:
      {
        FontWeightValue fontWeightValue = (FontWeightValue)theEObject;
        T result = caseFontWeightValue(fontWeightValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.FONT_FAMILY:
      {
        FontFamily fontFamily = (FontFamily)theEObject;
        T result = caseFontFamily(fontFamily);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.PAINT_VALUE:
      {
        PaintValue paintValue = (PaintValue)theEObject;
        T result = casePaintValue(paintValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.LINEAR_GRADIENT:
      {
        LinearGradient linearGradient = (LinearGradient)theEObject;
        T result = caseLinearGradient(linearGradient);
        if (result == null) result = casePaintValue(linearGradient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.RADIAL_GRADIENT:
      {
        RadialGradient radialGradient = (RadialGradient)theEObject;
        T result = caseRadialGradient(radialGradient);
        if (result == null) result = casePaintValue(radialGradient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.STOP_VALUE:
      {
        StopValue stopValue = (StopValue)theEObject;
        T result = caseStopValue(stopValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.COLOR_VALUE:
      {
        ColorValue colorValue = (ColorValue)theEObject;
        T result = caseColorValue(colorValue);
        if (result == null) result = casePaintValue(colorValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.LOOKED_UP_COLOR:
      {
        LookedUpColor lookedUpColor = (LookedUpColor)theEObject;
        T result = caseLookedUpColor(lookedUpColor);
        if (result == null) result = caseColorValue(lookedUpColor);
        if (result == null) result = casePaintValue(lookedUpColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.NAMED_COLOR:
      {
        NamedColor namedColor = (NamedColor)theEObject;
        T result = caseNamedColor(namedColor);
        if (result == null) result = caseColorValue(namedColor);
        if (result == null) result = casePaintValue(namedColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.RGB_COLOR:
      {
        RGBColor rgbColor = (RGBColor)theEObject;
        T result = caseRGBColor(rgbColor);
        if (result == null) result = caseColorValue(rgbColor);
        if (result == null) result = casePaintValue(rgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.HSB_COLOR:
      {
        HSBColor hsbColor = (HSBColor)theEObject;
        T result = caseHSBColor(hsbColor);
        if (result == null) result = caseColorValue(hsbColor);
        if (result == null) result = casePaintValue(hsbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JFXCssPackage.COLOR_FUNCTION:
      {
        ColorFunction colorFunction = (ColorFunction)theEObject;
        T result = caseColorFunction(colorFunction);
        if (result == null) result = caseColorValue(colorFunction);
        if (result == null) result = casePaintValue(colorFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JFX Css</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JFX Css</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJFXCss(JFXCss object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelector(Selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSelector(SimpleSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdSelector(IdSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassSelector(ClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClassSelector(PseudoClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FX Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FX Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFXProperty(FXProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontProperty(FontProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Family Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Family Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontFamilyProperty(FontFamilyProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Size Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Size Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontSizeProperty(FontSizeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Style Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Style Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontStyleProperty(FontStyleProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Weight Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Weight Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontWeightProperty(FontWeightProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cursor Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cursor Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCursorProperty(CursorProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectProperty(EffectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffect(Effect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Drop Shadow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Drop Shadow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectDropShadow(EffectDropShadow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Inner Shadow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Inner Shadow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectInnerShadow(EffectInnerShadow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanProperty(BooleanProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeProperty(SizeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberProperty(NumberProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerProperty(IntegerProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paint Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paint Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaintProperty(PaintProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paint Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paint Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaintProperties(PaintProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blend Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlendProperty(BlendProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlProperty(UrlProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Size Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Size Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiSizeProperties(MultiSizeProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HPosition Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HPosition Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHPositionProperty(HPositionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VPosition Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VPosition Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVPositionProperty(VPositionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Side Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Side Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSideProperty(SideProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bar Policy Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bar Policy Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBarPolicyProperty(BarPolicyProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlProperties(UrlProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatProperties(RepeatProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Size Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Size Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiSizeProperty(MultiSizeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeProperties(SizeProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Paint Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Paint Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiPaintProperties(MultiPaintProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorProperty(ColorProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringProperty(StringProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionProperty(PositionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alignment Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alignment Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlignmentProperty(AlignmentProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stroke Line Cap Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stroke Line Cap Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrokeLineCapProperty(StrokeLineCapProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stroke Line Join Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stroke Line Join Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrokeLineJoinProperty(StrokeLineJoinProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Origin Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Origin Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextOriginProperty(TextOriginProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Background Image Size Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Background Image Size Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackgroundImageSizeProperty(BackgroundImageSizeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Style Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Style Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderStyleProperty(BorderStyleProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Image Slice Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Image Slice Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderImageSliceProperty(BorderImageSliceProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Overrun Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Overrun Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextOverrunProperty(TextOverrunProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insets Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insets Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsetsProperty(InsetsProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horizontal Grid Line Stroke Dash Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horizontal Grid Line Stroke Dash Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorizontalGridLineStrokeDashArrayProperty(HorizontalGridLineStrokeDashArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vertical Grid Line Stroke Dash Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vertical Grid Line Stroke Dash Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerticalGridLineStrokeDashArrayProperty(VerticalGridLineStrokeDashArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VPosition Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VPosition Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVPositionValue(VPositionValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blur Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blur Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlurValue(BlurValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberValue(NumberValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealValue(RealValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlValue(UrlValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressValue(AddressValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeValue(SizeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Size Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Size Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiSizeValue(MultiSizeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bg Position Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bg Position Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBgPositionValue(BgPositionValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat Style Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat Style Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatStyleValue(RepeatStyleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bg Size Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bg Size Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBgSizeValue(BgSizeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Paint Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Paint Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiPaintValue(MultiPaintValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Style Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Style Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderStyleValue(BorderStyleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dash Style Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dash Style Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDashStyleValue(DashStyleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeFill(SizeFill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontValue(FontValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Style Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Style Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontStyleValue(FontStyleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Weight Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Weight Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontWeightValue(FontWeightValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Family</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Family</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontFamily(FontFamily object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paint Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paint Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaintValue(PaintValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearGradient(LinearGradient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadialGradient(RadialGradient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopValue(StopValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorValue(ColorValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Looked Up Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Looked Up Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookedUpColor(LookedUpColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedColor(NamedColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGBColor(RGBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HSB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HSB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHSBColor(HSBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorFunction(ColorFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JFXCssSwitch
