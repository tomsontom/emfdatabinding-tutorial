/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.util;

import at.bestsolution.e4.jfx.xtext.jFXCss.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage
 * @generated
 */
public class JFXCssAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JFXCssPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCssAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JFXCssPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JFXCssSwitch<Adapter> modelSwitch =
    new JFXCssSwitch<Adapter>()
    {
      @Override
      public Adapter caseJFXCss(JFXCss object)
      {
        return createJFXCssAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseSelector(Selector object)
      {
        return createSelectorAdapter();
      }
      @Override
      public Adapter caseSimpleSelector(SimpleSelector object)
      {
        return createSimpleSelectorAdapter();
      }
      @Override
      public Adapter caseElementPseudoClass(ElementPseudoClass object)
      {
        return createElementPseudoClassAdapter();
      }
      @Override
      public Adapter caseFXProperty(FXProperty object)
      {
        return createFXPropertyAdapter();
      }
      @Override
      public Adapter caseFontProperty(FontProperty object)
      {
        return createFontPropertyAdapter();
      }
      @Override
      public Adapter caseFontFamilyProperty(FontFamilyProperty object)
      {
        return createFontFamilyPropertyAdapter();
      }
      @Override
      public Adapter caseFontSizeProperty(FontSizeProperty object)
      {
        return createFontSizePropertyAdapter();
      }
      @Override
      public Adapter caseFontStyleProperty(FontStyleProperty object)
      {
        return createFontStylePropertyAdapter();
      }
      @Override
      public Adapter caseFontWeightProperty(FontWeightProperty object)
      {
        return createFontWeightPropertyAdapter();
      }
      @Override
      public Adapter caseCursorProperty(CursorProperty object)
      {
        return createCursorPropertyAdapter();
      }
      @Override
      public Adapter caseEffectProperty(EffectProperty object)
      {
        return createEffectPropertyAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseEffectDropShadow(EffectDropShadow object)
      {
        return createEffectDropShadowAdapter();
      }
      @Override
      public Adapter caseEffectInnerShadow(EffectInnerShadow object)
      {
        return createEffectInnerShadowAdapter();
      }
      @Override
      public Adapter caseBooleanProperty(BooleanProperty object)
      {
        return createBooleanPropertyAdapter();
      }
      @Override
      public Adapter caseSizeProperty(SizeProperty object)
      {
        return createSizePropertyAdapter();
      }
      @Override
      public Adapter caseNumberProperty(NumberProperty object)
      {
        return createNumberPropertyAdapter();
      }
      @Override
      public Adapter caseIntegerProperty(IntegerProperty object)
      {
        return createIntegerPropertyAdapter();
      }
      @Override
      public Adapter casePaintProperty(PaintProperty object)
      {
        return createPaintPropertyAdapter();
      }
      @Override
      public Adapter casePaintProperties(PaintProperties object)
      {
        return createPaintPropertiesAdapter();
      }
      @Override
      public Adapter caseBlendProperty(BlendProperty object)
      {
        return createBlendPropertyAdapter();
      }
      @Override
      public Adapter caseUrlProperty(UrlProperty object)
      {
        return createUrlPropertyAdapter();
      }
      @Override
      public Adapter caseMultiSizeProperties(MultiSizeProperties object)
      {
        return createMultiSizePropertiesAdapter();
      }
      @Override
      public Adapter caseHPositionProperty(HPositionProperty object)
      {
        return createHPositionPropertyAdapter();
      }
      @Override
      public Adapter caseVPositionProperty(VPositionProperty object)
      {
        return createVPositionPropertyAdapter();
      }
      @Override
      public Adapter caseSideProperty(SideProperty object)
      {
        return createSidePropertyAdapter();
      }
      @Override
      public Adapter caseBarPolicyProperty(BarPolicyProperty object)
      {
        return createBarPolicyPropertyAdapter();
      }
      @Override
      public Adapter caseUrlProperties(UrlProperties object)
      {
        return createUrlPropertiesAdapter();
      }
      @Override
      public Adapter caseRepeatProperties(RepeatProperties object)
      {
        return createRepeatPropertiesAdapter();
      }
      @Override
      public Adapter caseMultiSizeProperty(MultiSizeProperty object)
      {
        return createMultiSizePropertyAdapter();
      }
      @Override
      public Adapter caseSizeProperties(SizeProperties object)
      {
        return createSizePropertiesAdapter();
      }
      @Override
      public Adapter caseMultiPaintProperties(MultiPaintProperties object)
      {
        return createMultiPaintPropertiesAdapter();
      }
      @Override
      public Adapter caseColorProperty(ColorProperty object)
      {
        return createColorPropertyAdapter();
      }
      @Override
      public Adapter caseStringProperty(StringProperty object)
      {
        return createStringPropertyAdapter();
      }
      @Override
      public Adapter casePositionProperty(PositionProperty object)
      {
        return createPositionPropertyAdapter();
      }
      @Override
      public Adapter caseAlignmentProperty(AlignmentProperty object)
      {
        return createAlignmentPropertyAdapter();
      }
      @Override
      public Adapter caseStrokeLineCapProperty(StrokeLineCapProperty object)
      {
        return createStrokeLineCapPropertyAdapter();
      }
      @Override
      public Adapter caseStrokeLineJoinProperty(StrokeLineJoinProperty object)
      {
        return createStrokeLineJoinPropertyAdapter();
      }
      @Override
      public Adapter caseTextOriginProperty(TextOriginProperty object)
      {
        return createTextOriginPropertyAdapter();
      }
      @Override
      public Adapter caseBackgroundImageSizeProperty(BackgroundImageSizeProperty object)
      {
        return createBackgroundImageSizePropertyAdapter();
      }
      @Override
      public Adapter caseBorderStyleProperty(BorderStyleProperty object)
      {
        return createBorderStylePropertyAdapter();
      }
      @Override
      public Adapter caseBorderImageSliceProperty(BorderImageSliceProperty object)
      {
        return createBorderImageSlicePropertyAdapter();
      }
      @Override
      public Adapter caseTextOverrunProperty(TextOverrunProperty object)
      {
        return createTextOverrunPropertyAdapter();
      }
      @Override
      public Adapter caseInsetsProperty(InsetsProperty object)
      {
        return createInsetsPropertyAdapter();
      }
      @Override
      public Adapter caseHorizontalGridLineStrokeDashArrayProperty(HorizontalGridLineStrokeDashArrayProperty object)
      {
        return createHorizontalGridLineStrokeDashArrayPropertyAdapter();
      }
      @Override
      public Adapter caseVerticalGridLineStrokeDashArrayProperty(VerticalGridLineStrokeDashArrayProperty object)
      {
        return createVerticalGridLineStrokeDashArrayPropertyAdapter();
      }
      @Override
      public Adapter caseVPositionValue(VPositionValue object)
      {
        return createVPositionValueAdapter();
      }
      @Override
      public Adapter caseBlurValue(BlurValue object)
      {
        return createBlurValueAdapter();
      }
      @Override
      public Adapter caseNumberValue(NumberValue object)
      {
        return createNumberValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
      }
      @Override
      public Adapter caseRealValue(RealValue object)
      {
        return createRealValueAdapter();
      }
      @Override
      public Adapter caseUrlValue(UrlValue object)
      {
        return createUrlValueAdapter();
      }
      @Override
      public Adapter caseAddressValue(AddressValue object)
      {
        return createAddressValueAdapter();
      }
      @Override
      public Adapter caseSizeValue(SizeValue object)
      {
        return createSizeValueAdapter();
      }
      @Override
      public Adapter caseMultiSizeValue(MultiSizeValue object)
      {
        return createMultiSizeValueAdapter();
      }
      @Override
      public Adapter caseBgPositionValue(BgPositionValue object)
      {
        return createBgPositionValueAdapter();
      }
      @Override
      public Adapter caseRepeatStyleValue(RepeatStyleValue object)
      {
        return createRepeatStyleValueAdapter();
      }
      @Override
      public Adapter caseBgSizeValue(BgSizeValue object)
      {
        return createBgSizeValueAdapter();
      }
      @Override
      public Adapter caseMultiPaintValue(MultiPaintValue object)
      {
        return createMultiPaintValueAdapter();
      }
      @Override
      public Adapter caseBorderStyleValue(BorderStyleValue object)
      {
        return createBorderStyleValueAdapter();
      }
      @Override
      public Adapter caseDashStyleValue(DashStyleValue object)
      {
        return createDashStyleValueAdapter();
      }
      @Override
      public Adapter caseSizeFill(SizeFill object)
      {
        return createSizeFillAdapter();
      }
      @Override
      public Adapter caseFontValue(FontValue object)
      {
        return createFontValueAdapter();
      }
      @Override
      public Adapter caseFontStyleValue(FontStyleValue object)
      {
        return createFontStyleValueAdapter();
      }
      @Override
      public Adapter caseFontWeightValue(FontWeightValue object)
      {
        return createFontWeightValueAdapter();
      }
      @Override
      public Adapter caseFontFamily(FontFamily object)
      {
        return createFontFamilyAdapter();
      }
      @Override
      public Adapter casePaintValue(PaintValue object)
      {
        return createPaintValueAdapter();
      }
      @Override
      public Adapter caseLinearGradient(LinearGradient object)
      {
        return createLinearGradientAdapter();
      }
      @Override
      public Adapter caseRadialGradient(RadialGradient object)
      {
        return createRadialGradientAdapter();
      }
      @Override
      public Adapter caseStopValue(StopValue object)
      {
        return createStopValueAdapter();
      }
      @Override
      public Adapter caseColorValue(ColorValue object)
      {
        return createColorValueAdapter();
      }
      @Override
      public Adapter caseLookedUpColor(LookedUpColor object)
      {
        return createLookedUpColorAdapter();
      }
      @Override
      public Adapter caseNamedColor(NamedColor object)
      {
        return createNamedColorAdapter();
      }
      @Override
      public Adapter caseRGBColor(RGBColor object)
      {
        return createRGBColorAdapter();
      }
      @Override
      public Adapter caseHSBColor(HSBColor object)
      {
        return createHSBColorAdapter();
      }
      @Override
      public Adapter caseColorFunction(ColorFunction object)
      {
        return createColorFunctionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss <em>JFX Css</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss
   * @generated
   */
  public Adapter createJFXCssAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Selector
   * @generated
   */
  public Adapter createSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector
   * @generated
   */
  public Adapter createSimpleSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass <em>Element Pseudo Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass
   * @generated
   */
  public Adapter createElementPseudoClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty <em>FX Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty
   * @generated
   */
  public Adapter createFXPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty <em>Font Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty
   * @generated
   */
  public Adapter createFontPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty <em>Font Family Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty
   * @generated
   */
  public Adapter createFontFamilyPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty <em>Font Size Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty
   * @generated
   */
  public Adapter createFontSizePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty <em>Font Style Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty
   * @generated
   */
  public Adapter createFontStylePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty <em>Font Weight Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty
   * @generated
   */
  public Adapter createFontWeightPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty <em>Cursor Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty
   * @generated
   */
  public Adapter createCursorPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty <em>Effect Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty
   * @generated
   */
  public Adapter createEffectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow <em>Effect Drop Shadow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow
   * @generated
   */
  public Adapter createEffectDropShadowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow <em>Effect Inner Shadow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow
   * @generated
   */
  public Adapter createEffectInnerShadowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty <em>Boolean Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty
   * @generated
   */
  public Adapter createBooleanPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty <em>Size Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty
   * @generated
   */
  public Adapter createSizePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty <em>Number Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty
   * @generated
   */
  public Adapter createNumberPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty <em>Integer Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty
   * @generated
   */
  public Adapter createIntegerPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty <em>Paint Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty
   * @generated
   */
  public Adapter createPaintPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties <em>Paint Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties
   * @generated
   */
  public Adapter createPaintPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty <em>Blend Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty
   * @generated
   */
  public Adapter createBlendPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty <em>Url Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty
   * @generated
   */
  public Adapter createUrlPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties <em>Multi Size Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties
   * @generated
   */
  public Adapter createMultiSizePropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty <em>HPosition Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty
   * @generated
   */
  public Adapter createHPositionPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty <em>VPosition Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty
   * @generated
   */
  public Adapter createVPositionPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty <em>Side Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty
   * @generated
   */
  public Adapter createSidePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty <em>Bar Policy Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty
   * @generated
   */
  public Adapter createBarPolicyPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties <em>Url Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties
   * @generated
   */
  public Adapter createUrlPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties <em>Repeat Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties
   * @generated
   */
  public Adapter createRepeatPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty <em>Multi Size Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty
   * @generated
   */
  public Adapter createMultiSizePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties <em>Size Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties
   * @generated
   */
  public Adapter createSizePropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintProperties <em>Multi Paint Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintProperties
   * @generated
   */
  public Adapter createMultiPaintPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorProperty <em>Color Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorProperty
   * @generated
   */
  public Adapter createColorPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StringProperty <em>String Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StringProperty
   * @generated
   */
  public Adapter createStringPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PositionProperty <em>Position Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PositionProperty
   * @generated
   */
  public Adapter createPositionPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.AlignmentProperty <em>Alignment Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.AlignmentProperty
   * @generated
   */
  public Adapter createAlignmentPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty <em>Stroke Line Cap Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty
   * @generated
   */
  public Adapter createStrokeLineCapPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty <em>Stroke Line Join Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty
   * @generated
   */
  public Adapter createStrokeLineJoinPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty <em>Text Origin Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty
   * @generated
   */
  public Adapter createTextOriginPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty <em>Background Image Size Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty
   * @generated
   */
  public Adapter createBackgroundImageSizePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty <em>Border Style Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty
   * @generated
   */
  public Adapter createBorderStylePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty <em>Border Image Slice Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty
   * @generated
   */
  public Adapter createBorderImageSlicePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty <em>Text Overrun Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty
   * @generated
   */
  public Adapter createTextOverrunPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty <em>Insets Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty
   * @generated
   */
  public Adapter createInsetsPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty <em>Horizontal Grid Line Stroke Dash Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty
   * @generated
   */
  public Adapter createHorizontalGridLineStrokeDashArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty <em>Vertical Grid Line Stroke Dash Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty
   * @generated
   */
  public Adapter createVerticalGridLineStrokeDashArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue <em>VPosition Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue
   * @generated
   */
  public Adapter createVPositionValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue <em>Blur Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue
   * @generated
   */
  public Adapter createBlurValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue
   * @generated
   */
  public Adapter createNumberValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RealValue <em>Real Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RealValue
   * @generated
   */
  public Adapter createRealValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue <em>Url Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue
   * @generated
   */
  public Adapter createUrlValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue <em>Address Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue
   * @generated
   */
  public Adapter createAddressValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue <em>Size Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue
   * @generated
   */
  public Adapter createSizeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue <em>Multi Size Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue
   * @generated
   */
  public Adapter createMultiSizeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue <em>Bg Position Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue
   * @generated
   */
  public Adapter createBgPositionValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue <em>Repeat Style Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue
   * @generated
   */
  public Adapter createRepeatStyleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue <em>Bg Size Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue
   * @generated
   */
  public Adapter createBgSizeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue <em>Multi Paint Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue
   * @generated
   */
  public Adapter createMultiPaintValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue <em>Border Style Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue
   * @generated
   */
  public Adapter createBorderStyleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue <em>Dash Style Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue
   * @generated
   */
  public Adapter createDashStyleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill <em>Size Fill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill
   * @generated
   */
  public Adapter createSizeFillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontValue <em>Font Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontValue
   * @generated
   */
  public Adapter createFontValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue <em>Font Style Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue
   * @generated
   */
  public Adapter createFontStyleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue <em>Font Weight Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue
   * @generated
   */
  public Adapter createFontWeightValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily <em>Font Family</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily
   * @generated
   */
  public Adapter createFontFamilyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.PaintValue <em>Paint Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.PaintValue
   * @generated
   */
  public Adapter createPaintValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient <em>Linear Gradient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient
   * @generated
   */
  public Adapter createLinearGradientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient <em>Radial Gradient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient
   * @generated
   */
  public Adapter createRadialGradientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.StopValue <em>Stop Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.StopValue
   * @generated
   */
  public Adapter createStopValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue <em>Color Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue
   * @generated
   */
  public Adapter createColorValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.LookedUpColor <em>Looked Up Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.LookedUpColor
   * @generated
   */
  public Adapter createLookedUpColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor
   * @generated
   */
  public Adapter createNamedColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor
   * @generated
   */
  public Adapter createRGBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor <em>HSB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor
   * @generated
   */
  public Adapter createHSBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction <em>Color Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction
   * @generated
   */
  public Adapter createColorFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JFXCssAdapterFactory
