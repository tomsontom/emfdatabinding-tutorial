package at.bestsolution.e4.jfx.xtext.serializer;

import at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.AlignmentProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.ClassSelector;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.Definition;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontFamily;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontFamilyProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontSizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.FontWeightValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.HPositionProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.IdSelector;
import at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient;
import at.bestsolution.e4.jfx.xtext.jFXCss.LookedUpColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.PositionProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.PseudoClassSelector;
import at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient;
import at.bestsolution.e4.jfx.xtext.jFXCss.RealValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.Selector;
import at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.StopValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.StringProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty;
import at.bestsolution.e4.jfx.xtext.services.JFXCssGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractJFXCssSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected JFXCssGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JFXCssPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JFXCssPackage.ADDRESS_VALUE:
				if(context == grammarAccess.getAddressValueRule()) {
					sequence_AddressValue_AddressValue(context, (AddressValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.ALIGNMENT_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getAlignmentPropertyRule()) {
					sequence_AlignmentProperty_AlignmentProperty(context, (AlignmentProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BACKGROUND_IMAGE_SIZE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBackgroundImageSizePropertyRule()) {
					sequence_BackgroundImageSizeProperty_BackgroundImageSizeProperty(context, (BackgroundImageSizeProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BAR_POLICY_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBarPolicyPropertyRule()) {
					sequence_BarPolicyProperty_BarPolicyProperty(context, (BarPolicyProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BG_POSITION_VALUE:
				if(context == grammarAccess.getBgPositionValueRule()) {
					sequence_BgPositionValue_BgPositionValue(context, (BgPositionValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BG_SIZE_VALUE:
				if(context == grammarAccess.getBgSizeValueRule()) {
					sequence_BgSizeValue_BgSizeValue(context, (BgSizeValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BLEND_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBlendPropertyRule()) {
					sequence_BlendProperty_BlendProperty(context, (BlendProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BLUR_VALUE:
				if(context == grammarAccess.getBlurValueRule()) {
					sequence_BlurValue_BlurValue(context, (BlurValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BOOLEAN_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBooleanPropertyRule()) {
					sequence_BooleanProperty_BooleanProperty(context, (BooleanProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BORDER_IMAGE_SLICE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBorderImageSlicePropertyRule()) {
					sequence_BorderImageSliceProperty_BorderImageSliceProperty(context, (BorderImageSliceProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BORDER_STYLE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getBorderStylePropertyRule()) {
					sequence_BorderStyleProperty_BorderStyleProperty(context, (BorderStyleProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.BORDER_STYLE_VALUE:
				if(context == grammarAccess.getBorderStyleValueRule()) {
					sequence_BorderStyleValue_BorderStyleValue(context, (BorderStyleValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.CLASS_SELECTOR:
				if(context == grammarAccess.getClassSelectorRule()) {
					sequence_ClassSelector_ClassSelector(context, (ClassSelector) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.COLOR_FUNCTION:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getColorValueRule() ||
				   context == grammarAccess.getColorFunctionRule()) {
					sequence_ColorFunction_ColorFunction(context, (ColorFunction) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.COLOR_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getColorPropertyRule()) {
					sequence_ColorProperty_ColorProperty(context, (ColorProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.CURSOR_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getCursorPropertyRule()) {
					sequence_CursorProperty_CursorProperty(context, (CursorProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.DASH_STYLE_VALUE:
				if(context == grammarAccess.getDashStyleValueRule()) {
					sequence_DashStyleValue_DashStyleValue(context, (DashStyleValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.EFFECT_DROP_SHADOW:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEffectDropShadowRule()) {
					sequence_EffectDropShadow_EffectDropShadow(context, (EffectDropShadow) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.EFFECT_INNER_SHADOW:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEffectInnerShadowRule()) {
					sequence_EffectInnerShadow_EffectInnerShadow(context, (EffectInnerShadow) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.EFFECT_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getEffectPropertyRule()) {
					sequence_EffectProperty_EffectProperty(context, (EffectProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_FAMILY:
				if(context == grammarAccess.getFontFamilyRule()) {
					sequence_FontFamily_FontFamily(context, (FontFamily) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_FAMILY_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getFontFamilyPropertyRule()) {
					sequence_FontFamilyProperty_FontFamilyProperty(context, (FontFamilyProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getFontPropertyRule()) {
					sequence_FontProperty_FontProperty(context, (FontProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_SIZE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getFontSizePropertyRule()) {
					sequence_FontSizeProperty_FontSizeProperty(context, (FontSizeProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_STYLE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getFontStylePropertyRule()) {
					sequence_FontStyleProperty_FontStyleProperty(context, (FontStyleProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_STYLE_VALUE:
				if(context == grammarAccess.getFontStyleValueRule()) {
					sequence_FontStyleValue_FontStyleValue(context, (FontStyleValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_VALUE:
				if(context == grammarAccess.getFontValueRule()) {
					sequence_FontValue_FontValue(context, (FontValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_WEIGHT_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getFontWeightPropertyRule()) {
					sequence_FontWeightProperty_FontWeightProperty(context, (FontWeightProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.FONT_WEIGHT_VALUE:
				if(context == grammarAccess.getFontWeightValueRule()) {
					sequence_FontWeightValue_FontWeightValue(context, (FontWeightValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.HPOSITION_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getHPositionPropertyRule()) {
					sequence_HPositionProperty_HPositionProperty(context, (HPositionProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.HSB_COLOR:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getColorValueRule() ||
				   context == grammarAccess.getHSBColorRule()) {
					sequence_HSBColor_HSBColor(context, (HSBColor) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getHorizontalGridLineStrokeDashArrayPropertyRule()) {
					sequence_HorizontalGridLineStrokeDashArrayProperty_HorizontalGridLineStrokeDashArrayProperty(context, (HorizontalGridLineStrokeDashArrayProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.ID_SELECTOR:
				if(context == grammarAccess.getIdSelectorRule()) {
					sequence_IdSelector_IdSelector(context, (IdSelector) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.INSETS_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getInsetsPropertyRule()) {
					sequence_InsetsProperty_InsetsProperty(context, (InsetsProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.INTEGER_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getIntegerPropertyRule()) {
					sequence_IntegerProperty_IntegerProperty(context, (IntegerProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.INTEGER_VALUE:
				if(context == grammarAccess.getNumberValueRule() ||
				   context == grammarAccess.getIntegerValueRule()) {
					sequence_IntegerValue_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.JFX_CSS:
				if(context == grammarAccess.getJFXCssRule()) {
					sequence_JFXCss_JFXCss(context, (JFXCss) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.LINEAR_GRADIENT:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getLinearGradientRule()) {
					sequence_LinearGradient_LinearGradient(context, (LinearGradient) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.LOOKED_UP_COLOR:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getColorValueRule() ||
				   context == grammarAccess.getLookedUpColorRule()) {
					sequence_LookedUpColor_LookedUpColor(context, (LookedUpColor) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.MULTI_PAINT_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getMultiPaintPropertiesRule()) {
					sequence_MultiPaintProperties_MultiPaintProperties(context, (MultiPaintProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.MULTI_PAINT_VALUE:
				if(context == grammarAccess.getMultiPaintValueRule()) {
					sequence_MultiPaintValue_MultiPaintValue(context, (MultiPaintValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.MULTI_SIZE_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getMultiSizePropertiesRule()) {
					sequence_MultiSizeProperties_MultiSizeProperties(context, (MultiSizeProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.MULTI_SIZE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getMultiSizePropertyRule()) {
					sequence_MultiSizeProperty_MultiSizeProperty(context, (MultiSizeProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.MULTI_SIZE_VALUE:
				if(context == grammarAccess.getMultiSizeValueRule()) {
					sequence_MultiSizeValue_MultiSizeValue(context, (MultiSizeValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.NAMED_COLOR:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getColorValueRule() ||
				   context == grammarAccess.getNamedColorRule()) {
					sequence_NamedColor_NamedColor(context, (NamedColor) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.NUMBER_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getNumberPropertyRule()) {
					sequence_NumberProperty_NumberProperty(context, (NumberProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.PAINT_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getPaintPropertiesRule()) {
					sequence_PaintProperties_PaintProperties(context, (PaintProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.PAINT_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getPaintPropertyRule()) {
					sequence_PaintProperty_PaintProperty(context, (PaintProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.POSITION_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getPositionPropertyRule()) {
					sequence_PositionProperty_PositionProperty(context, (PositionProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.PSEUDO_CLASS_SELECTOR:
				if(context == grammarAccess.getPseudoClassSelectorRule()) {
					sequence_PseudoClassSelector_PseudoClassSelector(context, (PseudoClassSelector) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.RGB_COLOR:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getColorValueRule() ||
				   context == grammarAccess.getRGBColorRule()) {
					sequence_RGBColor_RGBColor(context, (RGBColor) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.RADIAL_GRADIENT:
				if(context == grammarAccess.getPaintValueRule() ||
				   context == grammarAccess.getRadialGradientRule()) {
					sequence_RadialGradient_RadialGradient(context, (RadialGradient) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.REAL_VALUE:
				if(context == grammarAccess.getNumberValueRule() ||
				   context == grammarAccess.getRealValueRule()) {
					sequence_RealValue_RealValue(context, (RealValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.REPEAT_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getRepeatPropertiesRule()) {
					sequence_RepeatProperties_RepeatProperties(context, (RepeatProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.REPEAT_STYLE_VALUE:
				if(context == grammarAccess.getRepeatStyleValueRule()) {
					sequence_RepeatStyleValue_RepeatStyleValue(context, (RepeatStyleValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_Selector_Selector(context, (Selector) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIDE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getSidePropertyRule()) {
					sequence_SideProperty_SideProperty(context, (SideProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimpleSelectorRule()) {
					sequence_SimpleSelector_SimpleSelector(context, (SimpleSelector) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIZE_FILL:
				if(context == grammarAccess.getSizeFillRule()) {
					sequence_SizeFill_SizeFill(context, (SizeFill) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIZE_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getSizePropertiesRule()) {
					sequence_SizeProperties_SizeProperties(context, (SizeProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIZE_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getSizePropertyRule()) {
					sequence_SizeProperty_SizeProperty(context, (SizeProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.SIZE_VALUE:
				if(context == grammarAccess.getSizeValueRule()) {
					sequence_SizeValue_SizeValue(context, (SizeValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.STOP_VALUE:
				if(context == grammarAccess.getStopValueRule()) {
					sequence_StopValue_StopValue(context, (StopValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.STRING_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getStringPropertyRule()) {
					sequence_StringProperty_StringProperty(context, (StringProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.STROKE_LINE_CAP_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getStrokeLineCapPropertyRule()) {
					sequence_StrokeLineCapProperty_StrokeLineCapProperty(context, (StrokeLineCapProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.STROKE_LINE_JOIN_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getStrokeLineJoinPropertyRule()) {
					sequence_StrokeLineJoinProperty_StrokeLineJoinProperty(context, (StrokeLineJoinProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.TEXT_ORIGIN_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getTextOriginPropertyRule()) {
					sequence_TextOriginProperty_TextOriginProperty(context, (TextOriginProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.TEXT_OVERRUN_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getTextOverrunPropertyRule()) {
					sequence_TextOverrunProperty_TextOverrunProperty(context, (TextOverrunProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.URL_PROPERTIES:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getUrlPropertiesRule()) {
					sequence_UrlProperties_UrlProperties(context, (UrlProperties) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.URL_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getUrlPropertyRule()) {
					sequence_UrlProperty_UrlProperty(context, (UrlProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.URL_VALUE:
				if(context == grammarAccess.getUrlValueRule()) {
					sequence_UrlValue_UrlValue(context, (UrlValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.VPOSITION_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getVPositionPropertyRule()) {
					sequence_VPositionProperty_VPositionProperty(context, (VPositionProperty) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.VPOSITION_VALUE:
				if(context == grammarAccess.getVPositionValueRule()) {
					sequence_VPositionValue_VPositionValue(context, (VPositionValue) semanticObject); 
					return; 
				}
				else break;
			case JFXCssPackage.VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY:
				if(context == grammarAccess.getFXPropertyRule() ||
				   context == grammarAccess.getVerticalGridLineStrokeDashArrayPropertyRule()) {
					sequence_VerticalGridLineStrokeDashArrayProperty_VerticalGridLineStrokeDashArrayProperty(context, (VerticalGridLineStrokeDashArrayProperty) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_AddressValue_AddressValue(EObject context, AddressValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.ADDRESS_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.ADDRESS_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddressValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-text-alignment' | property='-fx-alignment') (value='left' | value='center' | value='right' | value='justify'))
	 *
	 * Features:
	 *    property[0, 2]
	 *    value[0, 4]
	 */
	protected void sequence_AlignmentProperty_AlignmentProperty(EObject context, AlignmentProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=BgSizeValue values+=BgSizeValue*)
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_BackgroundImageSizeProperty_BackgroundImageSizeProperty(EObject context, BackgroundImageSizeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-hbar-policy' | property='-fx-vbar-policy') (value='never' | value='always' | value='as_needed'))
	 *
	 * Features:
	 *    property[0, 2]
	 *    value[0, 3]
	 */
	protected void sequence_BarPolicyProperty_BarPolicyProperty(EObject context, BarPolicyProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((absx=SizeValue | relx='left' | relx='center' | relx='right') (absy=SizeValue | rely='top' | rely='center' | rely='bottom'))
	 *
	 * Features:
	 *    absx[0, 1]
	 *         EXCLUDE_IF_SET relx
	 *         EXCLUDE_IF_SET relx
	 *         EXCLUDE_IF_SET relx
	 *    relx[0, 3]
	 *         EXCLUDE_IF_SET absx
	 *    absy[0, 1]
	 *         EXCLUDE_IF_SET rely
	 *         EXCLUDE_IF_SET rely
	 *         EXCLUDE_IF_SET rely
	 *    rely[0, 3]
	 *         EXCLUDE_IF_SET absy
	 */
	protected void sequence_BgPositionValue_BgPositionValue(EObject context, BgPositionValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((xsize=SizeValue | xauto='auto') (ysize=SizeValue | yauto='auto')?) | predefined='cover' | predefined='contain')
	 *
	 * Features:
	 *    xsize[0, 1]
	 *         EXCLUDE_IF_SET xauto
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    xauto[0, 1]
	 *         EXCLUDE_IF_SET xsize
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    ysize[0, 1]
	 *         EXCLUDE_IF_SET yauto
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    yauto[0, 1]
	 *         EXCLUDE_IF_SET ysize
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    predefined[0, 2]
	 *         EXCLUDE_IF_SET xsize
	 *         EXCLUDE_IF_SET xauto
	 *         EXCLUDE_IF_SET ysize
	 *         EXCLUDE_IF_SET yauto
	 */
	protected void sequence_BgSizeValue_BgSizeValue(EObject context, BgSizeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='add' | 
	 *         value='blue' | 
	 *         value='color-burn' | 
	 *         value='color-dodge' | 
	 *         value='darken' | 
	 *         value='difference' | 
	 *         value='exclusion' | 
	 *         value='green' | 
	 *         value='hard-light' | 
	 *         value='lighten' | 
	 *         value='multiply' | 
	 *         value='overlay' | 
	 *         value='red' | 
	 *         value='screen' | 
	 *         value='soft-light' | 
	 *         value='src-atop' | 
	 *         value='src-in' | 
	 *         value='src-out' | 
	 *         value='src-over'
	 *     )
	 *
	 * Features:
	 *    value[0, 19]
	 */
	protected void sequence_BlendProperty_BlendProperty(EObject context, BlendProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v='gaussian' | v='one-pass-box' | v='three-pass-box' | v='two-pass-box')
	 *
	 * Features:
	 *    v[0, 4]
	 */
	protected void sequence_BlurValue_BlurValue(EObject context, BlurValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-focus-traversable' | 
	 *             property='-fx-pannable' | 
	 *             property='-fx-hgap' | 
	 *             property='-fx-vpos' | 
	 *             property='-fx-snap-to-pixel' | 
	 *             property='-fx-vertical' | 
	 *             property='-fx-smooth' | 
	 *             property='-fx-strikethrough' | 
	 *             property='-fx-underline' | 
	 *             property='-fx-scale-shape' | 
	 *             property='-fx-vertical-zero-line-visible' | 
	 *             property='-fx-vertical-grid-line-visible' | 
	 *             property='-fx-horizontal-zero-line-visible' | 
	 *             property='-fx-horizontal-grid-line-visible' | 
	 *             property='-fx-pie-value-visible' | 
	 *             property='-fx-pie-to-label-line-curved' | 
	 *             property='-fx-pie-label-visible' | 
	 *             property='-fx-clockwise' | 
	 *             property='-fx-show-symbols' | 
	 *             property='-fx-legend-visible' | 
	 *             property='-fx-scale-bubble-radius-using-axis' | 
	 *             property='-fx-select-on-focus' | 
	 *             property='-fx-editable' | 
	 *             property='-fx-snap-to-ticks' | 
	 *             property='-fx-show-tick-marks' | 
	 *             property='-fx-show-tick-labels' | 
	 *             property='-fx-fit-to-width' | 
	 *             property='-fx-minor-tick-visible' | 
	 *             property='-fx-gap-start-and-end' | 
	 *             property='-fx-tick-mark-visible' | 
	 *             property='-fx-tick-labels-visible' | 
	 *             property='-fx-fit-to-height' | 
	 *             property='-fx-click-to-position' | 
	 *             property='-fx-text-wrap' | 
	 *             property='-fx-position-shape'
	 *         ) 
	 *         value=BooleanValue
	 *     )
	 *
	 * Features:
	 *    property[0, 35]
	 *    value[1, 1]
	 */
	protected void sequence_BooleanProperty_BooleanProperty(EObject context, BooleanProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=SizeFill values+=SizeFill*)
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_BorderImageSliceProperty_BorderImageSliceProperty(EObject context, BorderImageSliceProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=BorderStyleValue values+=BorderStyleValue*)
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_BorderStyleProperty_BorderStyleProperty(EObject context, BorderStyleProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         dashStyle=DashStyleValue 
	 *         (location='centered' | location='inside' | location='outside')? 
	 *         (miterAbs=NumberValue | miterPredefined='bevel' | miterPredefined='round')? 
	 *         (lineCap='square' | lineCap='butt' | lineCap='round')?
	 *     )
	 *
	 * Features:
	 *    dashStyle[1, 1]
	 *    location[0, 3]
	 *    miterAbs[0, 1]
	 *         EXCLUDE_IF_SET miterPredefined
	 *         EXCLUDE_IF_SET miterPredefined
	 *    miterPredefined[0, 2]
	 *         EXCLUDE_IF_SET miterAbs
	 *    lineCap[0, 3]
	 */
	protected void sequence_BorderStyleValue_BorderStyleValue(EObject context, BorderStyleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     class=ID
	 *
	 * Features:
	 *    class[1, 1]
	 */
	protected void sequence_ClassSelector_ClassSelector(EObject context, ClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.CLASS_SELECTOR__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.CLASS_SELECTOR__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassSelectorAccess().getClassIDTerminalRuleCall_1_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((orig=ColorValue mod=NumberValue) | (orig=ColorValue (stopNumbers+=NumberValue stopColors+=ColorValue)+))
	 *
	 * Features:
	 *    orig[2, 2]
	 *    mod[1, 1]
	 *         EXCLUDE_IF_UNSET orig
	 *         MANDATORY_IF_SET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET stopNumbers
	 *         EXCLUDE_IF_SET stopColors
	 *    stopNumbers[1, *]
	 *         SAME stopColors
	 *         EXCLUDE_IF_UNSET orig
	 *         MANDATORY_IF_SET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET mod
	 *    stopColors[1, *]
	 *         SAME stopNumbers
	 *         EXCLUDE_IF_UNSET orig
	 *         MANDATORY_IF_SET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET mod
	 */
	protected void sequence_ColorFunction_ColorFunction(EObject context, ColorFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=ColorPropertyKeys value=ColorValue)
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ColorProperty_ColorProperty(EObject context, ColorProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.COLOR_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.COLOR_PROPERTY__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.COLOR_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.COLOR_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorPropertyAccess().getPropertyColorPropertyKeysParserRuleCall_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getColorPropertyAccess().getValueColorValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='crosshair' | 
	 *         value='default' | 
	 *         value='hand' | 
	 *         value='move' | 
	 *         value='e-resize' | 
	 *         value='h-resize' | 
	 *         value='ne-resize' | 
	 *         value='nw-resize' | 
	 *         value='n-resize' | 
	 *         value='se-resize' | 
	 *         value='sw-resize' | 
	 *         value='s-resize' | 
	 *         value='w-resize' | 
	 *         value='v-resize' | 
	 *         value='text' | 
	 *         value='wait'
	 *     )
	 *
	 * Features:
	 *    value[0, 16]
	 */
	protected void sequence_CursorProperty_CursorProperty(EObject context, CursorProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v='none' | v='solid' | v='dotted' | v='dashed')
	 *
	 * Features:
	 *    v[0, 4]
	 */
	protected void sequence_DashStyleValue_DashStyleValue(EObject context, DashStyleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selector+=Selector selector+=Selector* properties+=FXProperty+)
	 *
	 * Features:
	 *    selector[1, *]
	 *    properties[1, *]
	 */
	protected void sequence_Definition_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         blur=BlurValue 
	 *         color=ColorValue 
	 *         blurRadius=NumberValue 
	 *         spread=NumberValue 
	 *         offsetX=NumberValue 
	 *         offsetY=NumberValue
	 *     )
	 *
	 * Features:
	 *    blur[1, 1]
	 *    color[1, 1]
	 *    blurRadius[1, 1]
	 *    offsetX[1, 1]
	 *    offsetY[1, 1]
	 *    spread[1, 1]
	 */
	protected void sequence_EffectDropShadow_EffectDropShadow(EObject context, EffectDropShadow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__COLOR));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR_RADIUS));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_X));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_Y));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT_DROP_SHADOW__SPREAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT_DROP_SHADOW__SPREAD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getBlurBlurValueParserRuleCall_2_0(), semanticObject.getBlur());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getColorColorValueParserRuleCall_4_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getBlurRadiusNumberValueParserRuleCall_6_0(), semanticObject.getBlurRadius());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getSpreadNumberValueParserRuleCall_8_0(), semanticObject.getSpread());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getOffsetXNumberValueParserRuleCall_10_0(), semanticObject.getOffsetX());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getOffsetYNumberValueParserRuleCall_12_0(), semanticObject.getOffsetY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         blur=BlurValue 
	 *         color=ColorValue 
	 *         blurRadius=NumberValue 
	 *         choke=NumberValue 
	 *         offsetX=NumberValue 
	 *         offsetY=NumberValue
	 *     )
	 *
	 * Features:
	 *    blur[1, 1]
	 *    color[1, 1]
	 *    blurRadius[1, 1]
	 *    offsetX[1, 1]
	 *    offsetY[1, 1]
	 *    choke[1, 1]
	 */
	protected void sequence_EffectInnerShadow_EffectInnerShadow(EObject context, EffectInnerShadow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__COLOR));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__BLUR_RADIUS));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_X));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT__OFFSET_Y));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT_INNER_SHADOW__CHOKE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT_INNER_SHADOW__CHOKE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getBlurBlurValueParserRuleCall_1_0(), semanticObject.getBlur());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getColorColorValueParserRuleCall_3_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getBlurRadiusNumberValueParserRuleCall_5_0(), semanticObject.getBlurRadius());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getChokeNumberValueParserRuleCall_7_0(), semanticObject.getChoke());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getOffsetXNumberValueParserRuleCall_9_0(), semanticObject.getOffsetX());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getOffsetYNumberValueParserRuleCall_11_0(), semanticObject.getOffsetY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Effect
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_EffectProperty_EffectProperty(EObject context, EffectProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.EFFECT_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.EFFECT_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectPropertyAccess().getValueEffectParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-family' | 
	 *             property='-fx-title-font-family' | 
	 *             property='-fx-pie-label-font-family' | 
	 *             property='-fx-pie-value-label-font-family' | 
	 *             property='-fx-label-font-family' | 
	 *             property='-fx-tick-label-font-family'
	 *         ) 
	 *         value=FontFamily
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_FontFamilyProperty_FontFamilyProperty(EObject context, FontFamilyProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_FontFamily_FontFamily(EObject context, FontFamily semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.FONT_FAMILY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.FONT_FAMILY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFontFamilyAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font' | 
	 *             property='-fx-title-font' | 
	 *             property='-fx-pie-label-font' | 
	 *             property='-fx-pie-value-label-font' | 
	 *             property='-fx-label-font' | 
	 *             property='-fx-tick-label-font'
	 *         ) 
	 *         value=FontValue
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_FontProperty_FontProperty(EObject context, FontProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-size' | 
	 *             property='-fx-title-font-size' | 
	 *             property='-fx-pie-label-font-size' | 
	 *             property='-fx-pie-value-label-font-size' | 
	 *             property='-fx-label-font-size' | 
	 *             property='-fx-tick-label-font-size'
	 *         ) 
	 *         value=SizeValue
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_FontSizeProperty_FontSizeProperty(EObject context, FontSizeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-style' | 
	 *             property='-fx-title-font-style' | 
	 *             property='-fx-pie-label-font-style' | 
	 *             property='-fx-pie-value-label-font-style' | 
	 *             property='-fx-label-font-style' | 
	 *             property='-fx-tick-label-font-style'
	 *         ) 
	 *         value=FontStyleValue
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_FontStyleProperty_FontStyleProperty(EObject context, FontStyleProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='normal' | value='italic' | value='oblique')
	 *
	 * Features:
	 *    value[0, 3]
	 */
	protected void sequence_FontStyleValue_FontStyleValue(EObject context, FontStyleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             styleOrWeightString='italic' | 
	 *             styleOrWeightString='oblique' | 
	 *             styleOrWeightString='normal' | 
	 *             styleOrWeightString='bold' | 
	 *             styleOrWeightString='bolder' | 
	 *             styleOrWeightString='lighter' | 
	 *             weight=IntegerProperty
	 *         )? 
	 *         size=SizeValue 
	 *         family=FontFamily
	 *     )
	 *
	 * Features:
	 *    styleOrWeightString[0, 6]
	 *         EXCLUDE_IF_SET weight
	 *    weight[0, 1]
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *    size[1, 1]
	 *    family[1, 1]
	 */
	protected void sequence_FontValue_FontValue(EObject context, FontValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-weight' | 
	 *             property='-fx-title-font-weight' | 
	 *             property='-fx-pie-label-font-weight' | 
	 *             property='-fx-pie-value-label-font-weight' | 
	 *             property='-fx-label-font-weight' | 
	 *             property='-fx-tick-label-font-weight'
	 *         ) 
	 *         value=FontWeightValue
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_FontWeightProperty_FontWeightProperty(EObject context, FontWeightProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueString='normal' | valueString='bold' | valueString='bolder' | valueString='lighter' | valueInt=NumberValue)
	 *
	 * Features:
	 *    valueString[0, 4]
	 *         EXCLUDE_IF_SET valueInt
	 *    valueInt[0, 1]
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 */
	protected void sequence_FontWeightValue_FontWeightValue(EObject context, FontWeightValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-hpos' | property='-fx-node-hpos' | property='-fx-graphic-hpos') value=HPositionValue)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_HPositionProperty_HPositionProperty(EObject context, HPositionProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (hue=NumberValue saturation=NumberValue brightness=NumberValue) | 
	 *         (hue=NumberValue saturation=NumberValue brightness=NumberValue alpha=NumberValue)
	 *     )
	 *
	 * Features:
	 *    hue[2, 2]
	 *    saturation[2, 2]
	 *    brightness[2, 2]
	 *    alpha[1, 1]
	 *         EXCLUDE_IF_UNSET hue
	 *         MANDATORY_IF_SET hue
	 *         EXCLUDE_IF_UNSET saturation
	 *         MANDATORY_IF_SET saturation
	 *         EXCLUDE_IF_UNSET brightness
	 *         MANDATORY_IF_SET brightness
	 *         EXCLUDE_IF_SET hue
	 *         EXCLUDE_IF_SET saturation
	 *         EXCLUDE_IF_SET brightness
	 */
	protected void sequence_HSBColor_HSBColor(EObject context, HSBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value+=NumberValue+
	 *
	 * Features:
	 *    value[1, *]
	 */
	protected void sequence_HorizontalGridLineStrokeDashArrayProperty_HorizontalGridLineStrokeDashArrayProperty(EObject context, HorizontalGridLineStrokeDashArrayProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 *
	 * Features:
	 *    id[1, 1]
	 */
	protected void sequence_IdSelector_IdSelector(EObject context, IdSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.ID_SELECTOR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.ID_SELECTOR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdSelectorAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value+=NumberValue | (value+=NumberValue value+=NumberValue value+=NumberValue value+=NumberValue))
	 *
	 * Features:
	 *    value[4, 5]
	 */
	protected void sequence_InsetsProperty_InsetsProperty(EObject context, InsetsProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-columns' | property='-fx-rows' | property='-fx-lines' | property='-fx-minor-tick-count') value=IntegerValue)
	 *
	 * Features:
	 *    property[0, 4]
	 *    value[1, 1]
	 */
	protected void sequence_IntegerProperty_IntegerProperty(EObject context, IntegerProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_IntegerValue_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definitions+=Definition+
	 *
	 * Features:
	 *    definitions[1, *]
	 */
	protected void sequence_JFXCss_JFXCss(EObject context, JFXCss semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x1=SizeValue y1=SizeValue x2=SizeValue y2=SizeValue stops+=StopValue+)
	 *
	 * Features:
	 *    x1[1, 1]
	 *    y1[1, 1]
	 *    x2[1, 1]
	 *    y2[1, 1]
	 *    stops[1, *]
	 */
	protected void sequence_LinearGradient_LinearGradient(EObject context, LinearGradient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=ColorPropertyKeys | value=ID)
	 *
	 * Features:
	 *    value[0, 2]
	 */
	protected void sequence_LookedUpColor_LookedUpColor(EObject context, LookedUpColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-border-color' (values+=MultiPaintValue values+=MultiPaintValue*)?)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[0, *]
	 */
	protected void sequence_MultiPaintProperties_MultiPaintProperties(EObject context, MultiPaintProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=PaintValue+
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_MultiPaintValue_MultiPaintValue(EObject context, MultiPaintValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-background-insets' | 
	 *             property='-fx-background-radius' | 
	 *             property='-fx-border-insets' | 
	 *             property='-fx-border-radius' | 
	 *             property='-fx-border-width' | 
	 *             property='-fx-border-image-insets' | 
	 *             property='-fx-border-image-width'
	 *         ) 
	 *         values+=MultiSizeValue 
	 *         values+=MultiSizeValue*
	 *     )
	 *
	 * Features:
	 *    property[0, 7]
	 *    values[1, *]
	 */
	protected void sequence_MultiSizeProperties_MultiSizeProperties(EObject context, MultiSizeProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-padding' value=MultiSizeValue)
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_MultiSizeProperty_MultiSizeProperty(EObject context, MultiSizeProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.MULTI_SIZE_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.MULTI_SIZE_PROPERTY__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.MULTI_SIZE_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.MULTI_SIZE_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiSizePropertyAccess().getPropertyFxPaddingKeyword_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getMultiSizePropertyAccess().getValueMultiSizeValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=SizeValue | (values+=SizeValue values+=SizeValue values+=SizeValue values+=SizeValue))
	 *
	 * Features:
	 *    values[4, 5]
	 */
	protected void sequence_MultiSizeValue_MultiSizeValue(EObject context, MultiSizeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='aliceblue' | 
	 *         value='antiquewhite' | 
	 *         value='aqua' | 
	 *         value='aquamarine' | 
	 *         value='azure' | 
	 *         value='beige' | 
	 *         value='bisque' | 
	 *         value='black' | 
	 *         value='blanchedalmond' | 
	 *         value='blue' | 
	 *         value='blueviolet' | 
	 *         value='brown' | 
	 *         value='burlywood' | 
	 *         value='cadetblue' | 
	 *         value='chartreuse' | 
	 *         value='chocolate' | 
	 *         value='coral' | 
	 *         value='cornflowerblue' | 
	 *         value='cornsilk' | 
	 *         value='crimson' | 
	 *         value='cyan' | 
	 *         value='darkblue' | 
	 *         value='darkcyan' | 
	 *         value='darkgoldenrod' | 
	 *         value='darkgray' | 
	 *         value='darkgreen' | 
	 *         value='darkgrey' | 
	 *         value='darkkhaki' | 
	 *         value='darkmagenta' | 
	 *         value='darkolivegreen' | 
	 *         value='darkorange' | 
	 *         value='darkorchid' | 
	 *         value='darkred' | 
	 *         value='darksalmon' | 
	 *         value='darkseagreen' | 
	 *         value='darkslateblue' | 
	 *         value='darkslategray' | 
	 *         value='darkslategrey' | 
	 *         value='darkturquoise' | 
	 *         value='darkviolet' | 
	 *         value='deeppink' | 
	 *         value='deepskyblue' | 
	 *         value='dimgray' | 
	 *         value='dimgrey' | 
	 *         value='dodgerblue' | 
	 *         value='firebrick' | 
	 *         value='floralwhite' | 
	 *         value='forestgreen' | 
	 *         value='fuchsia' | 
	 *         value='gainsboro' | 
	 *         value='ghostwhite' | 
	 *         value='gold' | 
	 *         value='goldenrod' | 
	 *         value='gray' | 
	 *         value='green' | 
	 *         value='greenyellow' | 
	 *         value='grey' | 
	 *         value='honeydew' | 
	 *         value='hotpink' | 
	 *         value='indianred' | 
	 *         value='indigo' | 
	 *         value='ivory' | 
	 *         value='khaki' | 
	 *         value='lavender' | 
	 *         value='lavenderblush' | 
	 *         value='lawngreen' | 
	 *         value='lemonchiffon' | 
	 *         value='lightblue' | 
	 *         value='lightcoral' | 
	 *         value='lightcyan' | 
	 *         value='lightgoldenrodyellow' | 
	 *         value='lightgray' | 
	 *         value='lightgreen' | 
	 *         value='lightgrey' | 
	 *         value='lightpink' | 
	 *         value='lightsalmon' | 
	 *         value='lightseagreen' | 
	 *         value='lightskyblue' | 
	 *         value='lightslategray' | 
	 *         value='lightslategrey' | 
	 *         value='lightsteelblue' | 
	 *         value='lightyellow' | 
	 *         value='lime' | 
	 *         value='limegreen' | 
	 *         value='linen' | 
	 *         value='magenta' | 
	 *         value='maroon' | 
	 *         value='mediumaquamarine' | 
	 *         value='mediumblue' | 
	 *         value='mediumorchid' | 
	 *         value='mediumpurple' | 
	 *         value='mediumseagreen' | 
	 *         value='mediumslateblue' | 
	 *         value='mediumspringgreen' | 
	 *         value='mediumturquoise' | 
	 *         value='mediumvioletred' | 
	 *         value='midnightblue' | 
	 *         value='mintcream' | 
	 *         value='mistyrose' | 
	 *         value='moccasin' | 
	 *         value='navajowhite' | 
	 *         value='navy' | 
	 *         value='oldlace' | 
	 *         value='olive' | 
	 *         value='olivedrab' | 
	 *         value='orange' | 
	 *         value='orangered' | 
	 *         value='orchid' | 
	 *         value='palegoldenrod' | 
	 *         value='palegreen' | 
	 *         value='paleturquoise' | 
	 *         value='palevioletred' | 
	 *         value='papayawhip' | 
	 *         value='peachpuff' | 
	 *         value='peru' | 
	 *         value='pink' | 
	 *         value='plum' | 
	 *         value='powderblue' | 
	 *         value='purple' | 
	 *         value='red' | 
	 *         value='rosybrown' | 
	 *         value='royalblue' | 
	 *         value='saddlebrown' | 
	 *         value='salmon' | 
	 *         value='sandybrown' | 
	 *         value='seagreen' | 
	 *         value='seashell' | 
	 *         value='sienna' | 
	 *         value='silver' | 
	 *         value='skyblue' | 
	 *         value='slateblue' | 
	 *         value='slategray' | 
	 *         value='slategrey' | 
	 *         value='snow' | 
	 *         value='springgreen' | 
	 *         value='steelblue' | 
	 *         value='tan' | 
	 *         value='teal' | 
	 *         value='thistle' | 
	 *         value='tomato' | 
	 *         value='turquoise' | 
	 *         value='violet' | 
	 *         value='wheat' | 
	 *         value='white' | 
	 *         value='whitesmoke' | 
	 *         value='yellow' | 
	 *         value='yellowgreen' | 
	 *         value='transparent'
	 *     )
	 *
	 * Features:
	 *    value[0, 148]
	 */
	protected void sequence_NamedColor_NamedColor(EObject context, NamedColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-rotate' | 
	 *             property='-fx-scale-x' | 
	 *             property='-fx-scale-y' | 
	 *             property='-fx-scale-z' | 
	 *             property='-fx-translate-x' | 
	 *             property='-fx-translate-y' | 
	 *             property='-fx-translate-z' | 
	 *             property='-fx-vgap' | 
	 *             property='-fx-tile-height' | 
	 *             property='-fx-tile-width' | 
	 *             property='-fx-stroke-dash-offset' | 
	 *             property='-fx-stroke-miter-limit' | 
	 *             property='-fx-block-increment' | 
	 *             property='-fx-unit-increment' | 
	 *             property='-fx-major-tick-unit' | 
	 *             property='-fx-data-opacity' | 
	 *             property='-fx-radius-scale' | 
	 *             property='-fx-pie-to-label-line-one-length' | 
	 *             property='-fx-pie-to-label-line-stroke-width' | 
	 *             property='-fx-pie-to-label-line-two-length' | 
	 *             property='-fx-start-angle' | 
	 *             property='-fx-tick-unit' | 
	 *             property='-fx-indent'
	 *         ) 
	 *         value=NumberValue
	 *     )
	 *
	 * Features:
	 *    property[0, 23]
	 *    value[1, 1]
	 */
	protected void sequence_NumberProperty_NumberProperty(EObject context, NumberProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-background-color' (values+=PaintValue values+=PaintValue*)?)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[0, *]
	 */
	protected void sequence_PaintProperties_PaintProperties(EObject context, PaintProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-fill' | 
	 *             property='-fx-stroke' | 
	 *             property='-fx-text-fill' | 
	 *             property='-fx-bar-fill' | 
	 *             property='-fx-bar-stroke' | 
	 *             property='-fx-bottom-shelf-fill' | 
	 *             property='-fx-bottom-shelf-stroke' | 
	 *             property='-fx-side-shelf-fill' | 
	 *             property='-fx-side-shelf-stroke' | 
	 *             property='-fx-zero-shelf-fill' | 
	 *             property='-fx-zero-shelf-stroke' | 
	 *             property='-fx-chart-background-fill' | 
	 *             property='-fx-chart-background-stroke' | 
	 *             property='-fx-hover-stroke' | 
	 *             property='-fx-title-fill' | 
	 *             property='-fx-pie-label-fill' | 
	 *             property='-fx-pie-stroke' | 
	 *             property='-fx-pie-to-label-line-stroke' | 
	 *             property='-fx-pie-value-label-fill' | 
	 *             property='-fx-horizontal-alternate-row-fill' | 
	 *             property='-fx-plot-background-fill' | 
	 *             property='-fx-horizontal-grid-line-stroke' | 
	 *             property='-fx-plot-background-stroke' | 
	 *             property='-fx-vertical-alternate-row-fill' | 
	 *             property='-fx-vertical-grid-line-stroke' | 
	 *             property='-fx-axis-stroke' | 
	 *             property='-fx-tick-label-fill' | 
	 *             property='-fx-label-fill' | 
	 *             property='-fx-tick-mark-stroke' | 
	 *             property='-fx-hover-fill'
	 *         ) 
	 *         value=PaintValue
	 *     )
	 *
	 * Features:
	 *    property[0, 30]
	 *    value[1, 1]
	 */
	protected void sequence_PaintProperty_PaintProperty(EObject context, PaintProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-background-image-position' | property='-fx-background-position') values+=BgPositionValue values+=BgPositionValue*)
	 *
	 * Features:
	 *    property[0, 2]
	 *    values[1, *]
	 */
	protected void sequence_PositionProperty_PositionProperty(EObject context, PositionProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='disabled' | 
	 *         value='focused' | 
	 *         value='hover' | 
	 *         value='pressed' | 
	 *         value='strong' | 
	 *         value='armed' | 
	 *         value='empty' | 
	 *         value='filled' | 
	 *         value='defined' | 
	 *         value='undefined' | 
	 *         value='showing' | 
	 *         value='visited' | 
	 *         value='even' | 
	 *         value='odd' | 
	 *         value='selected' | 
	 *         value='horizontal' | 
	 *         value='vertical' | 
	 *         value='determinate' | 
	 *         value='indetermindate' | 
	 *         value='pannable' | 
	 *         value='multiline' | 
	 *         value='editable' | 
	 *         value='readonly'
	 *     )
	 *
	 * Features:
	 *    value[0, 23]
	 */
	protected void sequence_PseudoClassSelector_PseudoClassSelector(EObject context, PseudoClassSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         hex=HEX_NUMBER | 
	 *         (r=IntegerValue g=IntegerValue b=IntegerValue) | 
	 *         (rp=IntegerValue gp=IntegerValue bp=IntegerValue) | 
	 *         (r=IntegerValue g=IntegerValue b=IntegerValue alpha=NumberValue) | 
	 *         (rp=IntegerValue gp=IntegerValue bp=IntegerValue alpha=NumberValue)
	 *     )
	 *
	 * Features:
	 *    hex[0, 1]
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    r[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    g[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    b[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    rp[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    gp[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    bp[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    alpha[2, 2]
	 *         EXCLUDE_IF_SET hex
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 */
	protected void sequence_RGBColor_RGBColor(EObject context, RGBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((cx=SizeValue cy=SizeValue)? radius=SizeValue fx=SizeValue fy=SizeValue stops+=StopValue+)
	 *
	 * Features:
	 *    cx[0, 1]
	 *         EXCLUDE_IF_UNSET cy
	 *         MANDATORY_IF_SET cy
	 *    cy[0, 1]
	 *         EXCLUDE_IF_UNSET cx
	 *         MANDATORY_IF_SET cx
	 *    radius[1, 1]
	 *    fx[1, 1]
	 *    fy[1, 1]
	 *    stops[1, *]
	 */
	protected void sequence_RadialGradient_RadialGradient(EObject context, RadialGradient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=REAL
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_RealValue_RealValue(EObject context, RealValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.REAL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.REAL_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (property='-fx-background-image-repeat' | property='-fx-border-image-repeat' | property='-fx-background-repeat') 
	 *         values+=RepeatStyleValue 
	 *         values+=RepeatStyleValue*
	 *     )
	 *
	 * Features:
	 *    property[0, 3]
	 *    values[1, *]
	 */
	protected void sequence_RepeatProperties_RepeatProperties(EObject context, RepeatProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         v='repeat-x' | 
	 *         v='repeat-y' | 
	 *         ((v='repeat' | v='space' | v='round' | v='no-repeat' | v='stretch') (v2='repeat' | v2='space' | v2='round' | v2='no-repeat' | v2='stretch')?)
	 *     )
	 *
	 * Features:
	 *    v[0, 7]
	 *    v2[0, 5]
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET v
	 */
	protected void sequence_RepeatStyleValue_RepeatStyleValue(EObject context, RepeatStyleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     simpleSelector+=SimpleSelector+
	 *
	 * Features:
	 *    simpleSelector[1, *]
	 */
	protected void sequence_Selector_Selector(EObject context, Selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-legend-side' | property='-fx-title-side' | property='-fx-side') (value='top' | value='bottom' | value='left' | value='right'))
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[0, 4]
	 */
	protected void sequence_SideProperty_SideProperty(EObject context, SideProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=ID | (id=IdSelector pseudoClass+=PseudoClassSelector*) | (class=ClassSelector pseudoClass+=PseudoClassSelector*))
	 *
	 * Features:
	 *    element[0, 1]
	 *         EXCLUDE_IF_SET id
	 *         EXCLUDE_IF_SET pseudoClass
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET pseudoClass
	 *    id[1, 1]
	 *         MANDATORY_IF_SET pseudoClass
	 *         EXCLUDE_IF_SET element
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET pseudoClass
	 *    pseudoClass[0, *]
	 *         EXCLUDE_IF_SET element
	 *    class[1, 1]
	 *         MANDATORY_IF_SET pseudoClass
	 *         EXCLUDE_IF_SET element
	 *         EXCLUDE_IF_SET id
	 *         EXCLUDE_IF_SET pseudoClass
	 */
	protected void sequence_SimpleSelector_SimpleSelector(EObject context, SimpleSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=MultiSizeValue fill='fill'?)
	 *
	 * Features:
	 *    value[1, 1]
	 *    fill[0, 1]
	 */
	protected void sequence_SizeFill_SizeFill(EObject context, SizeFill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-stroke-dash-array' values+=SizeValue+)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_SizeProperties_SizeProperties(EObject context, SizeProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-spacing' | 
	 *             property='-fx-arc-height' | 
	 *             property='-fx-arc-width' | 
	 *             property='-fx-minor-tick-length' | 
	 *             property='-fx-stroke-width' | 
	 *             property='-fx-start-margin' | 
	 *             property='-fx-end-margin' | 
	 *             property='-fx-tick-mark-stroke-width' | 
	 *             property='-fx-tick-mark-length' | 
	 *             property='-fx-tick-label-tick-gap' | 
	 *             property='-fx-axis-stroke-width' | 
	 *             property='-fx-label-tick-gap' | 
	 *             property='-fx-vertical-grid-line-stroke-width' | 
	 *             property='-fx-plot-background-stroke-width' | 
	 *             property='-fx-horizontal-grid-line-stroke-width' | 
	 *             property='-fx-pie-thickness' | 
	 *             property='-fx-pie-stroke-width' | 
	 *             property='-fx-title-gap' | 
	 *             property='-fx-legend-gap' | 
	 *             property='-fx-hover-stroke-width' | 
	 *             property='-fx-chart-background-stroke-width' | 
	 *             property='-fx-offset-y' | 
	 *             property='-fx-offset-x' | 
	 *             property='-fx-category-gap' | 
	 *             property='-fx-bar-gap' | 
	 *             property='-fx-graphic-text-gap' | 
	 *             property='-fx-tab-spacing'
	 *         ) 
	 *         value=SizeValue
	 *     )
	 *
	 * Features:
	 *    property[0, 27]
	 *    value[1, 1]
	 */
	protected void sequence_SizeProperty_SizeProperty(EObject context, SizeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=NumberValue 
	 *         (
	 *             dimension='%' | 
	 *             dimension='px' | 
	 *             dimension='mm' | 
	 *             dimension='cm' | 
	 *             dimension='in' | 
	 *             dimension='pt' | 
	 *             dimension='pc' | 
	 *             dimension='em' | 
	 *             dimension='ex'
	 *         )?
	 *     )
	 *
	 * Features:
	 *    value[1, 1]
	 *    dimension[0, 9]
	 */
	protected void sequence_SizeValue_SizeValue(EObject context, SizeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pos=SizeValue color=ColorValue)
	 *
	 * Features:
	 *    pos[1, 1]
	 *    color[1, 1]
	 */
	protected void sequence_StopValue_StopValue(EObject context, StopValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.STOP_VALUE__POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.STOP_VALUE__POS));
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.STOP_VALUE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.STOP_VALUE__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStopValueAccess().getPosSizeValueParserRuleCall_0_0(), semanticObject.getPos());
		feeder.accept(grammarAccess.getStopValueAccess().getColorColorValueParserRuleCall_2_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-skin' | property='-fx-shape' | property='-fx-text' | property='-fx-echo-char') value=STRING?)
	 *
	 * Features:
	 *    property[0, 4]
	 *    value[0, 1]
	 */
	protected void sequence_StringProperty_StringProperty(EObject context, StringProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='square' | value='butt' | value='round')
	 *
	 * Features:
	 *    value[0, 3]
	 */
	protected void sequence_StrokeLineCapProperty_StrokeLineCapProperty(EObject context, StrokeLineCapProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='miter' | value='bevel' | value='round')
	 *
	 * Features:
	 *    value[0, 3]
	 */
	protected void sequence_StrokeLineJoinProperty_StrokeLineJoinProperty(EObject context, StrokeLineJoinProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='baseline' | value='top' | value='bottom')
	 *
	 * Features:
	 *    value[0, 3]
	 */
	protected void sequence_TextOriginProperty_TextOriginProperty(EObject context, TextOriginProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='center-ellipses' | 
	 *         value='center-word-ellipses' | 
	 *         value='clip' | 
	 *         value='ellipses' | 
	 *         value='leading-ellipses' | 
	 *         value='leading-word-ellipses' | 
	 *         value='word-ellipses'
	 *     )
	 *
	 * Features:
	 *    value[0, 7]
	 */
	protected void sequence_TextOverrunProperty_TextOverrunProperty(EObject context, TextOverrunProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-background-image' | property='-fx-border-image') values+=UrlValue values+=UrlValue*)
	 *
	 * Features:
	 *    property[0, 2]
	 *    values[1, *]
	 */
	protected void sequence_UrlProperties_UrlProperties(EObject context, UrlProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-image' | property='-fx-graphic' | property='-fx-border-image-source') value=UrlValue)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_UrlProperty_UrlProperty(EObject context, UrlProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     address=AddressValue
	 *
	 * Features:
	 *    address[1, 1]
	 */
	protected void sequence_UrlValue_UrlValue(EObject context, UrlValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JFXCssPackage.Literals.URL_VALUE__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JFXCssPackage.Literals.URL_VALUE__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlValueAccess().getAddressAddressValueParserRuleCall_2_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-vpos' | property='-fx-node-vpos' | property='-fx-graphic-vpos') value=VPositionValue)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_VPositionProperty_VPositionProperty(EObject context, VPositionProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         v='top' | 
	 *         v='center' | 
	 *         v='baseline' | 
	 *         v='bottom' | 
	 *         v='page-end' | 
	 *         v='page-start'
	 *     )
	 *
	 * Features:
	 *    v[0, 6]
	 */
	protected void sequence_VPositionValue_VPositionValue(EObject context, VPositionValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=NumberValue values+=NumberValue+)
	 *
	 * Features:
	 *    values[2, *]
	 */
	protected void sequence_VerticalGridLineStrokeDashArrayProperty_VerticalGridLineStrokeDashArrayProperty(EObject context, VerticalGridLineStrokeDashArrayProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
