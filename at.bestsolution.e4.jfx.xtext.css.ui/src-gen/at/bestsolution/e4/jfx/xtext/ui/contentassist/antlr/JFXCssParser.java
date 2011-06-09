/*
* generated by Xtext
*/
package at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.bestsolution.e4.jfx.xtext.services.JFXCssGrammarAccess;

public class JFXCssParser extends AbstractContentAssistParser {
	
	@Inject
	private JFXCssGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr.internal.InternalJFXCssParser createParser() {
		at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr.internal.InternalJFXCssParser result = new at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr.internal.InternalJFXCssParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFXPropertyAccess().getAlternatives_0(), "rule__FXProperty__Alternatives_0");
					put(grammarAccess.getFontPropertyAccess().getPropertyAlternatives_0_0(), "rule__FontProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getFontFamilyPropertyAccess().getPropertyAlternatives_0_0(), "rule__FontFamilyProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getFontSizePropertyAccess().getPropertyAlternatives_0_0(), "rule__FontSizeProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getFontStylePropertyAccess().getPropertyAlternatives_0_0(), "rule__FontStyleProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getFontWeightPropertyAccess().getPropertyAlternatives_0_0(), "rule__FontWeightProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getCursorPropertyAccess().getValueAlternatives_2_0(), "rule__CursorProperty__ValueAlternatives_2_0");
					put(grammarAccess.getEffectAccess().getAlternatives(), "rule__Effect__Alternatives");
					put(grammarAccess.getBooleanPropertyAccess().getPropertyAlternatives_0_0(), "rule__BooleanProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getSizePropertyAccess().getPropertyAlternatives_0_0(), "rule__SizeProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getNumberPropertyAccess().getPropertyAlternatives_0_0(), "rule__NumberProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getIntegerPropertyAccess().getPropertyAlternatives_0_0(), "rule__IntegerProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getPaintPropertyAccess().getPropertyAlternatives_0_0(), "rule__PaintProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getPaintPropertiesAccess().getAlternatives_2(), "rule__PaintProperties__Alternatives_2");
					put(grammarAccess.getBlendPropertyAccess().getValueAlternatives_2_0(), "rule__BlendProperty__ValueAlternatives_2_0");
					put(grammarAccess.getUrlPropertyAccess().getPropertyAlternatives_0_0(), "rule__UrlProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getMultiSizePropertiesAccess().getPropertyAlternatives_0_0(), "rule__MultiSizeProperties__PropertyAlternatives_0_0");
					put(grammarAccess.getHPositionPropertyAccess().getPropertyAlternatives_0_0(), "rule__HPositionProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getVPositionPropertyAccess().getPropertyAlternatives_0_0(), "rule__VPositionProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getSidePropertyAccess().getPropertyAlternatives_0_0(), "rule__SideProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getSidePropertyAccess().getValueAlternatives_2_0(), "rule__SideProperty__ValueAlternatives_2_0");
					put(grammarAccess.getBarPolicyPropertyAccess().getPropertyAlternatives_0_0(), "rule__BarPolicyProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getBarPolicyPropertyAccess().getValueAlternatives_2_0(), "rule__BarPolicyProperty__ValueAlternatives_2_0");
					put(grammarAccess.getUrlPropertiesAccess().getPropertyAlternatives_0_0(), "rule__UrlProperties__PropertyAlternatives_0_0");
					put(grammarAccess.getRepeatPropertiesAccess().getPropertyAlternatives_0_0(), "rule__RepeatProperties__PropertyAlternatives_0_0");
					put(grammarAccess.getStrokeLineCapPropertyAccess().getValueAlternatives_2_0(), "rule__StrokeLineCapProperty__ValueAlternatives_2_0");
					put(grammarAccess.getStrokeLineJoinPropertyAccess().getValueAlternatives_2_0(), "rule__StrokeLineJoinProperty__ValueAlternatives_2_0");
					put(grammarAccess.getTextAlignmentPropertyAccess().getValueAlternatives_2_0(), "rule__TextAlignmentProperty__ValueAlternatives_2_0");
					put(grammarAccess.getTextOriginPropertyAccess().getValueAlternatives_2_0(), "rule__TextOriginProperty__ValueAlternatives_2_0");
					put(grammarAccess.getTextOverrunPropertyAccess().getValueAlternatives_2_0(), "rule__TextOverrunProperty__ValueAlternatives_2_0");
					put(grammarAccess.getInsetsPropertyAccess().getAlternatives(), "rule__InsetsProperty__Alternatives");
					put(grammarAccess.getVPositionValueAccess().getVAlternatives_0(), "rule__VPositionValue__VAlternatives_0");
					put(grammarAccess.getBlurValueAccess().getVAlternatives_0(), "rule__BlurValue__VAlternatives_0");
					put(grammarAccess.getNumberValueAccess().getAlternatives(), "rule__NumberValue__Alternatives");
					put(grammarAccess.getSizeValueAccess().getDimensionAlternatives_1_0(), "rule__SizeValue__DimensionAlternatives_1_0");
					put(grammarAccess.getMultiSizeValueAccess().getAlternatives(), "rule__MultiSizeValue__Alternatives");
					put(grammarAccess.getBgPositionValueAccess().getAlternatives_0(), "rule__BgPositionValue__Alternatives_0");
					put(grammarAccess.getBgPositionValueAccess().getRelxAlternatives_0_1_0(), "rule__BgPositionValue__RelxAlternatives_0_1_0");
					put(grammarAccess.getBgPositionValueAccess().getAlternatives_1(), "rule__BgPositionValue__Alternatives_1");
					put(grammarAccess.getBgPositionValueAccess().getRelyAlternatives_1_1_0(), "rule__BgPositionValue__RelyAlternatives_1_1_0");
					put(grammarAccess.getRepeatStyleValueAccess().getAlternatives(), "rule__RepeatStyleValue__Alternatives");
					put(grammarAccess.getRepeatStyleValueAccess().getVAlternatives_0_0(), "rule__RepeatStyleValue__VAlternatives_0_0");
					put(grammarAccess.getRepeatStyleValueAccess().getVAlternatives_1_0_0(), "rule__RepeatStyleValue__VAlternatives_1_0_0");
					put(grammarAccess.getRepeatStyleValueAccess().getV2Alternatives_1_1_0(), "rule__RepeatStyleValue__V2Alternatives_1_1_0");
					put(grammarAccess.getBgSizeValueAccess().getAlternatives(), "rule__BgSizeValue__Alternatives");
					put(grammarAccess.getBgSizeValueAccess().getAlternatives_0_0(), "rule__BgSizeValue__Alternatives_0_0");
					put(grammarAccess.getBgSizeValueAccess().getAlternatives_0_1(), "rule__BgSizeValue__Alternatives_0_1");
					put(grammarAccess.getBgSizeValueAccess().getPredefinedAlternatives_1_0(), "rule__BgSizeValue__PredefinedAlternatives_1_0");
					put(grammarAccess.getBorderStyleValueAccess().getLocationAlternatives_1_0(), "rule__BorderStyleValue__LocationAlternatives_1_0");
					put(grammarAccess.getBorderStyleValueAccess().getAlternatives_2_1(), "rule__BorderStyleValue__Alternatives_2_1");
					put(grammarAccess.getBorderStyleValueAccess().getMiterPredefinedAlternatives_2_1_1_0(), "rule__BorderStyleValue__MiterPredefinedAlternatives_2_1_1_0");
					put(grammarAccess.getBorderStyleValueAccess().getLineCapAlternatives_3_1_0(), "rule__BorderStyleValue__LineCapAlternatives_3_1_0");
					put(grammarAccess.getDashStyleValueAccess().getVAlternatives_0(), "rule__DashStyleValue__VAlternatives_0");
					put(grammarAccess.getFontValueAccess().getAlternatives_0(), "rule__FontValue__Alternatives_0");
					put(grammarAccess.getFontValueAccess().getStyleOrWeightStringAlternatives_0_0_0(), "rule__FontValue__StyleOrWeightStringAlternatives_0_0_0");
					put(grammarAccess.getFontStyleValueAccess().getValueAlternatives_0(), "rule__FontStyleValue__ValueAlternatives_0");
					put(grammarAccess.getFontWeightValueAccess().getAlternatives(), "rule__FontWeightValue__Alternatives");
					put(grammarAccess.getFontWeightValueAccess().getValueStringAlternatives_0_0(), "rule__FontWeightValue__ValueStringAlternatives_0_0");
					put(grammarAccess.getPaintValueAccess().getAlternatives(), "rule__PaintValue__Alternatives");
					put(grammarAccess.getLinearGradientAccess().getAlternatives_14(), "rule__LinearGradient__Alternatives_14");
					put(grammarAccess.getRadialGradientAccess().getAlternatives_6(), "rule__RadialGradient__Alternatives_6");
					put(grammarAccess.getColorValueAccess().getAlternatives(), "rule__ColorValue__Alternatives");
					put(grammarAccess.getNamedColorAccess().getValueAlternatives_0(), "rule__NamedColor__ValueAlternatives_0");
					put(grammarAccess.getRGBColorAccess().getAlternatives(), "rule__RGBColor__Alternatives");
					put(grammarAccess.getHSBColorAccess().getAlternatives(), "rule__HSBColor__Alternatives");
					put(grammarAccess.getColorFunctionAccess().getAlternatives(), "rule__ColorFunction__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getHPositionValueAccess().getAlternatives(), "rule__HPositionValue__Alternatives");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup_0(), "rule__Definition__Group_0__0");
					put(grammarAccess.getFXPropertyAccess().getGroup(), "rule__FXProperty__Group__0");
					put(grammarAccess.getFontPropertyAccess().getGroup(), "rule__FontProperty__Group__0");
					put(grammarAccess.getFontFamilyPropertyAccess().getGroup(), "rule__FontFamilyProperty__Group__0");
					put(grammarAccess.getFontSizePropertyAccess().getGroup(), "rule__FontSizeProperty__Group__0");
					put(grammarAccess.getFontStylePropertyAccess().getGroup(), "rule__FontStyleProperty__Group__0");
					put(grammarAccess.getFontWeightPropertyAccess().getGroup(), "rule__FontWeightProperty__Group__0");
					put(grammarAccess.getCursorPropertyAccess().getGroup(), "rule__CursorProperty__Group__0");
					put(grammarAccess.getEffectPropertyAccess().getGroup(), "rule__EffectProperty__Group__0");
					put(grammarAccess.getEffectDropShadowAccess().getGroup(), "rule__EffectDropShadow__Group__0");
					put(grammarAccess.getEffectInnerShadowAccess().getGroup(), "rule__EffectInnerShadow__Group__0");
					put(grammarAccess.getBooleanPropertyAccess().getGroup(), "rule__BooleanProperty__Group__0");
					put(grammarAccess.getSizePropertyAccess().getGroup(), "rule__SizeProperty__Group__0");
					put(grammarAccess.getNumberPropertyAccess().getGroup(), "rule__NumberProperty__Group__0");
					put(grammarAccess.getIntegerPropertyAccess().getGroup(), "rule__IntegerProperty__Group__0");
					put(grammarAccess.getPaintPropertyAccess().getGroup(), "rule__PaintProperty__Group__0");
					put(grammarAccess.getPaintPropertiesAccess().getGroup(), "rule__PaintProperties__Group__0");
					put(grammarAccess.getPaintPropertiesAccess().getGroup_2_0(), "rule__PaintProperties__Group_2_0__0");
					put(grammarAccess.getPaintPropertiesAccess().getGroup_2_0_1(), "rule__PaintProperties__Group_2_0_1__0");
					put(grammarAccess.getBlendPropertyAccess().getGroup(), "rule__BlendProperty__Group__0");
					put(grammarAccess.getUrlPropertyAccess().getGroup(), "rule__UrlProperty__Group__0");
					put(grammarAccess.getMultiSizePropertiesAccess().getGroup(), "rule__MultiSizeProperties__Group__0");
					put(grammarAccess.getMultiSizePropertiesAccess().getGroup_3(), "rule__MultiSizeProperties__Group_3__0");
					put(grammarAccess.getHPositionPropertyAccess().getGroup(), "rule__HPositionProperty__Group__0");
					put(grammarAccess.getVPositionPropertyAccess().getGroup(), "rule__VPositionProperty__Group__0");
					put(grammarAccess.getSidePropertyAccess().getGroup(), "rule__SideProperty__Group__0");
					put(grammarAccess.getBarPolicyPropertyAccess().getGroup(), "rule__BarPolicyProperty__Group__0");
					put(grammarAccess.getUrlPropertiesAccess().getGroup(), "rule__UrlProperties__Group__0");
					put(grammarAccess.getUrlPropertiesAccess().getGroup_3(), "rule__UrlProperties__Group_3__0");
					put(grammarAccess.getRepeatPropertiesAccess().getGroup(), "rule__RepeatProperties__Group__0");
					put(grammarAccess.getRepeatPropertiesAccess().getGroup_3(), "rule__RepeatProperties__Group_3__0");
					put(grammarAccess.getMultiSizePropertyAccess().getGroup(), "rule__MultiSizeProperty__Group__0");
					put(grammarAccess.getSizePropertiesAccess().getGroup(), "rule__SizeProperties__Group__0");
					put(grammarAccess.getStrokeLineCapPropertyAccess().getGroup(), "rule__StrokeLineCapProperty__Group__0");
					put(grammarAccess.getStrokeLineJoinPropertyAccess().getGroup(), "rule__StrokeLineJoinProperty__Group__0");
					put(grammarAccess.getTextAlignmentPropertyAccess().getGroup(), "rule__TextAlignmentProperty__Group__0");
					put(grammarAccess.getTextOriginPropertyAccess().getGroup(), "rule__TextOriginProperty__Group__0");
					put(grammarAccess.getBackgroundImagePositionPropertyAccess().getGroup(), "rule__BackgroundImagePositionProperty__Group__0");
					put(grammarAccess.getBackgroundImagePositionPropertyAccess().getGroup_3(), "rule__BackgroundImagePositionProperty__Group_3__0");
					put(grammarAccess.getBackgroundImageSizePropertyAccess().getGroup(), "rule__BackgroundImageSizeProperty__Group__0");
					put(grammarAccess.getBackgroundImageSizePropertyAccess().getGroup_3(), "rule__BackgroundImageSizeProperty__Group_3__0");
					put(grammarAccess.getBorderColorPropertyAccess().getGroup(), "rule__BorderColorProperty__Group__0");
					put(grammarAccess.getBorderColorPropertyAccess().getGroup_3(), "rule__BorderColorProperty__Group_3__0");
					put(grammarAccess.getBorderStylePropertyAccess().getGroup(), "rule__BorderStyleProperty__Group__0");
					put(grammarAccess.getBorderStylePropertyAccess().getGroup_3(), "rule__BorderStyleProperty__Group_3__0");
					put(grammarAccess.getBorderImageSlicePropertyAccess().getGroup(), "rule__BorderImageSliceProperty__Group__0");
					put(grammarAccess.getBorderImageSlicePropertyAccess().getGroup_3(), "rule__BorderImageSliceProperty__Group_3__0");
					put(grammarAccess.getShapePropertyAccess().getGroup(), "rule__ShapeProperty__Group__0");
					put(grammarAccess.getTextPropertyAccess().getGroup(), "rule__TextProperty__Group__0");
					put(grammarAccess.getTextOverrunPropertyAccess().getGroup(), "rule__TextOverrunProperty__Group__0");
					put(grammarAccess.getEchoCharPropertyAccess().getGroup(), "rule__EchoCharProperty__Group__0");
					put(grammarAccess.getInsetsPropertyAccess().getGroup_0(), "rule__InsetsProperty__Group_0__0");
					put(grammarAccess.getInsetsPropertyAccess().getGroup_1(), "rule__InsetsProperty__Group_1__0");
					put(grammarAccess.getHorizontalGridLineStrokeDashArrayPropertyAccess().getGroup(), "rule__HorizontalGridLineStrokeDashArrayProperty__Group__0");
					put(grammarAccess.getVerticalGridLineStrokeDashArrayPropertyAccess().getGroup(), "rule__VerticalGridLineStrokeDashArrayProperty__Group__0");
					put(grammarAccess.getUrlValueAccess().getGroup(), "rule__UrlValue__Group__0");
					put(grammarAccess.getSizeValueAccess().getGroup(), "rule__SizeValue__Group__0");
					put(grammarAccess.getMultiSizeValueAccess().getGroup_1(), "rule__MultiSizeValue__Group_1__0");
					put(grammarAccess.getBgPositionValueAccess().getGroup(), "rule__BgPositionValue__Group__0");
					put(grammarAccess.getRepeatStyleValueAccess().getGroup_1(), "rule__RepeatStyleValue__Group_1__0");
					put(grammarAccess.getBgSizeValueAccess().getGroup_0(), "rule__BgSizeValue__Group_0__0");
					put(grammarAccess.getBorderStyleValueAccess().getGroup(), "rule__BorderStyleValue__Group__0");
					put(grammarAccess.getBorderStyleValueAccess().getGroup_2(), "rule__BorderStyleValue__Group_2__0");
					put(grammarAccess.getBorderStyleValueAccess().getGroup_2_1_0(), "rule__BorderStyleValue__Group_2_1_0__0");
					put(grammarAccess.getBorderStyleValueAccess().getGroup_3(), "rule__BorderStyleValue__Group_3__0");
					put(grammarAccess.getSizeFillAccess().getGroup(), "rule__SizeFill__Group__0");
					put(grammarAccess.getFontValueAccess().getGroup(), "rule__FontValue__Group__0");
					put(grammarAccess.getLinearGradientAccess().getGroup(), "rule__LinearGradient__Group__0");
					put(grammarAccess.getLinearGradientAccess().getGroup_13(), "rule__LinearGradient__Group_13__0");
					put(grammarAccess.getRadialGradientAccess().getGroup(), "rule__RadialGradient__Group__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_1(), "rule__RadialGradient__Group_1__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_3(), "rule__RadialGradient__Group_3__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_5(), "rule__RadialGradient__Group_5__0");
					put(grammarAccess.getStopValueAccess().getGroup(), "rule__StopValue__Group__0");
					put(grammarAccess.getRGBColorAccess().getGroup_1(), "rule__RGBColor__Group_1__0");
					put(grammarAccess.getRGBColorAccess().getGroup_2(), "rule__RGBColor__Group_2__0");
					put(grammarAccess.getRGBColorAccess().getGroup_3(), "rule__RGBColor__Group_3__0");
					put(grammarAccess.getRGBColorAccess().getGroup_4(), "rule__RGBColor__Group_4__0");
					put(grammarAccess.getHSBColorAccess().getGroup_0(), "rule__HSBColor__Group_0__0");
					put(grammarAccess.getHSBColorAccess().getGroup_1(), "rule__HSBColor__Group_1__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_0(), "rule__ColorFunction__Group_0__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_1(), "rule__ColorFunction__Group_1__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_1_5(), "rule__ColorFunction__Group_1_5__0");
					put(grammarAccess.getJFXCssAccess().getDefinitionsAssignment(), "rule__JFXCss__DefinitionsAssignment");
					put(grammarAccess.getDefinitionAccess().getIdAssignment_0_1(), "rule__Definition__IdAssignment_0_1");
					put(grammarAccess.getDefinitionAccess().getPropertiesAssignment_2(), "rule__Definition__PropertiesAssignment_2");
					put(grammarAccess.getFontPropertyAccess().getPropertyAssignment_0(), "rule__FontProperty__PropertyAssignment_0");
					put(grammarAccess.getFontPropertyAccess().getValueAssignment_2(), "rule__FontProperty__ValueAssignment_2");
					put(grammarAccess.getFontFamilyPropertyAccess().getPropertyAssignment_0(), "rule__FontFamilyProperty__PropertyAssignment_0");
					put(grammarAccess.getFontFamilyPropertyAccess().getValueAssignment_2(), "rule__FontFamilyProperty__ValueAssignment_2");
					put(grammarAccess.getFontSizePropertyAccess().getPropertyAssignment_0(), "rule__FontSizeProperty__PropertyAssignment_0");
					put(grammarAccess.getFontSizePropertyAccess().getValueAssignment_2(), "rule__FontSizeProperty__ValueAssignment_2");
					put(grammarAccess.getFontStylePropertyAccess().getPropertyAssignment_0(), "rule__FontStyleProperty__PropertyAssignment_0");
					put(grammarAccess.getFontStylePropertyAccess().getValueAssignment_2(), "rule__FontStyleProperty__ValueAssignment_2");
					put(grammarAccess.getFontWeightPropertyAccess().getPropertyAssignment_0(), "rule__FontWeightProperty__PropertyAssignment_0");
					put(grammarAccess.getFontWeightPropertyAccess().getValueAssignment_2(), "rule__FontWeightProperty__ValueAssignment_2");
					put(grammarAccess.getCursorPropertyAccess().getValueAssignment_2(), "rule__CursorProperty__ValueAssignment_2");
					put(grammarAccess.getEffectPropertyAccess().getValueAssignment_2(), "rule__EffectProperty__ValueAssignment_2");
					put(grammarAccess.getEffectDropShadowAccess().getBlurAssignment_2(), "rule__EffectDropShadow__BlurAssignment_2");
					put(grammarAccess.getEffectDropShadowAccess().getColorAssignment_4(), "rule__EffectDropShadow__ColorAssignment_4");
					put(grammarAccess.getEffectDropShadowAccess().getBlurRadiusAssignment_6(), "rule__EffectDropShadow__BlurRadiusAssignment_6");
					put(grammarAccess.getEffectDropShadowAccess().getSpreadAssignment_8(), "rule__EffectDropShadow__SpreadAssignment_8");
					put(grammarAccess.getEffectDropShadowAccess().getOffsetXAssignment_10(), "rule__EffectDropShadow__OffsetXAssignment_10");
					put(grammarAccess.getEffectDropShadowAccess().getOffsetYAssignment_12(), "rule__EffectDropShadow__OffsetYAssignment_12");
					put(grammarAccess.getEffectInnerShadowAccess().getBlurAssignment_1(), "rule__EffectInnerShadow__BlurAssignment_1");
					put(grammarAccess.getEffectInnerShadowAccess().getColorAssignment_3(), "rule__EffectInnerShadow__ColorAssignment_3");
					put(grammarAccess.getEffectInnerShadowAccess().getBlurRadiusAssignment_5(), "rule__EffectInnerShadow__BlurRadiusAssignment_5");
					put(grammarAccess.getEffectInnerShadowAccess().getChokeAssignment_7(), "rule__EffectInnerShadow__ChokeAssignment_7");
					put(grammarAccess.getEffectInnerShadowAccess().getOffsetXAssignment_9(), "rule__EffectInnerShadow__OffsetXAssignment_9");
					put(grammarAccess.getEffectInnerShadowAccess().getOffsetYAssignment_11(), "rule__EffectInnerShadow__OffsetYAssignment_11");
					put(grammarAccess.getBooleanPropertyAccess().getPropertyAssignment_0(), "rule__BooleanProperty__PropertyAssignment_0");
					put(grammarAccess.getBooleanPropertyAccess().getValueAssignment_2(), "rule__BooleanProperty__ValueAssignment_2");
					put(grammarAccess.getSizePropertyAccess().getPropertyAssignment_0(), "rule__SizeProperty__PropertyAssignment_0");
					put(grammarAccess.getSizePropertyAccess().getValueAssignment_2(), "rule__SizeProperty__ValueAssignment_2");
					put(grammarAccess.getNumberPropertyAccess().getPropertyAssignment_0(), "rule__NumberProperty__PropertyAssignment_0");
					put(grammarAccess.getNumberPropertyAccess().getValueAssignment_2(), "rule__NumberProperty__ValueAssignment_2");
					put(grammarAccess.getIntegerPropertyAccess().getPropertyAssignment_0(), "rule__IntegerProperty__PropertyAssignment_0");
					put(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2(), "rule__IntegerProperty__ValueAssignment_2");
					put(grammarAccess.getPaintPropertyAccess().getPropertyAssignment_0(), "rule__PaintProperty__PropertyAssignment_0");
					put(grammarAccess.getPaintPropertyAccess().getValueAssignment_2(), "rule__PaintProperty__ValueAssignment_2");
					put(grammarAccess.getPaintPropertiesAccess().getPropertyAssignment_0(), "rule__PaintProperties__PropertyAssignment_0");
					put(grammarAccess.getPaintPropertiesAccess().getValuesAssignment_2_0_0(), "rule__PaintProperties__ValuesAssignment_2_0_0");
					put(grammarAccess.getPaintPropertiesAccess().getValuesAssignment_2_0_1_1(), "rule__PaintProperties__ValuesAssignment_2_0_1_1");
					put(grammarAccess.getBlendPropertyAccess().getValueAssignment_2(), "rule__BlendProperty__ValueAssignment_2");
					put(grammarAccess.getUrlPropertyAccess().getPropertyAssignment_0(), "rule__UrlProperty__PropertyAssignment_0");
					put(grammarAccess.getUrlPropertyAccess().getValueAssignment_2(), "rule__UrlProperty__ValueAssignment_2");
					put(grammarAccess.getMultiSizePropertiesAccess().getPropertyAssignment_0(), "rule__MultiSizeProperties__PropertyAssignment_0");
					put(grammarAccess.getMultiSizePropertiesAccess().getValuesAssignment_2(), "rule__MultiSizeProperties__ValuesAssignment_2");
					put(grammarAccess.getMultiSizePropertiesAccess().getValuesAssignment_3_1(), "rule__MultiSizeProperties__ValuesAssignment_3_1");
					put(grammarAccess.getHPositionPropertyAccess().getPropertyAssignment_0(), "rule__HPositionProperty__PropertyAssignment_0");
					put(grammarAccess.getHPositionPropertyAccess().getValueAssignment_2(), "rule__HPositionProperty__ValueAssignment_2");
					put(grammarAccess.getVPositionPropertyAccess().getPropertyAssignment_0(), "rule__VPositionProperty__PropertyAssignment_0");
					put(grammarAccess.getVPositionPropertyAccess().getValueAssignment_2(), "rule__VPositionProperty__ValueAssignment_2");
					put(grammarAccess.getSidePropertyAccess().getPropertyAssignment_0(), "rule__SideProperty__PropertyAssignment_0");
					put(grammarAccess.getSidePropertyAccess().getValueAssignment_2(), "rule__SideProperty__ValueAssignment_2");
					put(grammarAccess.getBarPolicyPropertyAccess().getPropertyAssignment_0(), "rule__BarPolicyProperty__PropertyAssignment_0");
					put(grammarAccess.getBarPolicyPropertyAccess().getValueAssignment_2(), "rule__BarPolicyProperty__ValueAssignment_2");
					put(grammarAccess.getUrlPropertiesAccess().getPropertyAssignment_0(), "rule__UrlProperties__PropertyAssignment_0");
					put(grammarAccess.getUrlPropertiesAccess().getValuesAssignment_2(), "rule__UrlProperties__ValuesAssignment_2");
					put(grammarAccess.getUrlPropertiesAccess().getValuesAssignment_3_1(), "rule__UrlProperties__ValuesAssignment_3_1");
					put(grammarAccess.getRepeatPropertiesAccess().getPropertyAssignment_0(), "rule__RepeatProperties__PropertyAssignment_0");
					put(grammarAccess.getRepeatPropertiesAccess().getValuesAssignment_2(), "rule__RepeatProperties__ValuesAssignment_2");
					put(grammarAccess.getRepeatPropertiesAccess().getValuesAssignment_3_1(), "rule__RepeatProperties__ValuesAssignment_3_1");
					put(grammarAccess.getMultiSizePropertyAccess().getPropertyAssignment_0(), "rule__MultiSizeProperty__PropertyAssignment_0");
					put(grammarAccess.getMultiSizePropertyAccess().getValueAssignment_2(), "rule__MultiSizeProperty__ValueAssignment_2");
					put(grammarAccess.getSizePropertiesAccess().getPropertyAssignment_0(), "rule__SizeProperties__PropertyAssignment_0");
					put(grammarAccess.getSizePropertiesAccess().getValuesAssignment_2(), "rule__SizeProperties__ValuesAssignment_2");
					put(grammarAccess.getStrokeLineCapPropertyAccess().getValueAssignment_2(), "rule__StrokeLineCapProperty__ValueAssignment_2");
					put(grammarAccess.getStrokeLineJoinPropertyAccess().getValueAssignment_2(), "rule__StrokeLineJoinProperty__ValueAssignment_2");
					put(grammarAccess.getTextAlignmentPropertyAccess().getValueAssignment_2(), "rule__TextAlignmentProperty__ValueAssignment_2");
					put(grammarAccess.getTextOriginPropertyAccess().getValueAssignment_2(), "rule__TextOriginProperty__ValueAssignment_2");
					put(grammarAccess.getBackgroundImagePositionPropertyAccess().getValuesAssignment_2(), "rule__BackgroundImagePositionProperty__ValuesAssignment_2");
					put(grammarAccess.getBackgroundImagePositionPropertyAccess().getValuesAssignment_3_1(), "rule__BackgroundImagePositionProperty__ValuesAssignment_3_1");
					put(grammarAccess.getBackgroundImageSizePropertyAccess().getValuesAssignment_2(), "rule__BackgroundImageSizeProperty__ValuesAssignment_2");
					put(grammarAccess.getBackgroundImageSizePropertyAccess().getValuesAssignment_3_1(), "rule__BackgroundImageSizeProperty__ValuesAssignment_3_1");
					put(grammarAccess.getBorderColorPropertyAccess().getValuesAssignment_2(), "rule__BorderColorProperty__ValuesAssignment_2");
					put(grammarAccess.getBorderColorPropertyAccess().getValuesAssignment_3_1(), "rule__BorderColorProperty__ValuesAssignment_3_1");
					put(grammarAccess.getBorderStylePropertyAccess().getValuesAssignment_2(), "rule__BorderStyleProperty__ValuesAssignment_2");
					put(grammarAccess.getBorderStylePropertyAccess().getValuesAssignment_3_1(), "rule__BorderStyleProperty__ValuesAssignment_3_1");
					put(grammarAccess.getBorderImageSlicePropertyAccess().getValuesAssignment_2(), "rule__BorderImageSliceProperty__ValuesAssignment_2");
					put(grammarAccess.getBorderImageSlicePropertyAccess().getValuesAssignment_3_1(), "rule__BorderImageSliceProperty__ValuesAssignment_3_1");
					put(grammarAccess.getShapePropertyAccess().getValueAssignment_2(), "rule__ShapeProperty__ValueAssignment_2");
					put(grammarAccess.getTextPropertyAccess().getValueAssignment_2(), "rule__TextProperty__ValueAssignment_2");
					put(grammarAccess.getTextOverrunPropertyAccess().getValueAssignment_2(), "rule__TextOverrunProperty__ValueAssignment_2");
					put(grammarAccess.getEchoCharPropertyAccess().getValueAssignment_2(), "rule__EchoCharProperty__ValueAssignment_2");
					put(grammarAccess.getInsetsPropertyAccess().getValueAssignment_0_2(), "rule__InsetsProperty__ValueAssignment_0_2");
					put(grammarAccess.getInsetsPropertyAccess().getValueAssignment_1_0(), "rule__InsetsProperty__ValueAssignment_1_0");
					put(grammarAccess.getInsetsPropertyAccess().getValueAssignment_1_1(), "rule__InsetsProperty__ValueAssignment_1_1");
					put(grammarAccess.getInsetsPropertyAccess().getValueAssignment_1_2(), "rule__InsetsProperty__ValueAssignment_1_2");
					put(grammarAccess.getInsetsPropertyAccess().getValueAssignment_1_3(), "rule__InsetsProperty__ValueAssignment_1_3");
					put(grammarAccess.getHorizontalGridLineStrokeDashArrayPropertyAccess().getValueAssignment_2(), "rule__HorizontalGridLineStrokeDashArrayProperty__ValueAssignment_2");
					put(grammarAccess.getVerticalGridLineStrokeDashArrayPropertyAccess().getValuesAssignment_2(), "rule__VerticalGridLineStrokeDashArrayProperty__ValuesAssignment_2");
					put(grammarAccess.getVerticalGridLineStrokeDashArrayPropertyAccess().getValuesAssignment_3(), "rule__VerticalGridLineStrokeDashArrayProperty__ValuesAssignment_3");
					put(grammarAccess.getVPositionValueAccess().getVAssignment(), "rule__VPositionValue__VAssignment");
					put(grammarAccess.getBlurValueAccess().getVAssignment(), "rule__BlurValue__VAssignment");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
					put(grammarAccess.getRealValueAccess().getValueAssignment(), "rule__RealValue__ValueAssignment");
					put(grammarAccess.getUrlValueAccess().getAddressAssignment_1(), "rule__UrlValue__AddressAssignment_1");
					put(grammarAccess.getAddressValueAccess().getValueAssignment(), "rule__AddressValue__ValueAssignment");
					put(grammarAccess.getSizeValueAccess().getValueAssignment_0(), "rule__SizeValue__ValueAssignment_0");
					put(grammarAccess.getSizeValueAccess().getDimensionAssignment_1(), "rule__SizeValue__DimensionAssignment_1");
					put(grammarAccess.getMultiSizeValueAccess().getValuesAssignment_0(), "rule__MultiSizeValue__ValuesAssignment_0");
					put(grammarAccess.getMultiSizeValueAccess().getValuesAssignment_1_0(), "rule__MultiSizeValue__ValuesAssignment_1_0");
					put(grammarAccess.getMultiSizeValueAccess().getValuesAssignment_1_1(), "rule__MultiSizeValue__ValuesAssignment_1_1");
					put(grammarAccess.getMultiSizeValueAccess().getValuesAssignment_1_2(), "rule__MultiSizeValue__ValuesAssignment_1_2");
					put(grammarAccess.getMultiSizeValueAccess().getValuesAssignment_1_3(), "rule__MultiSizeValue__ValuesAssignment_1_3");
					put(grammarAccess.getBgPositionValueAccess().getAbsxAssignment_0_0(), "rule__BgPositionValue__AbsxAssignment_0_0");
					put(grammarAccess.getBgPositionValueAccess().getRelxAssignment_0_1(), "rule__BgPositionValue__RelxAssignment_0_1");
					put(grammarAccess.getBgPositionValueAccess().getAbsyAssignment_1_0(), "rule__BgPositionValue__AbsyAssignment_1_0");
					put(grammarAccess.getBgPositionValueAccess().getRelyAssignment_1_1(), "rule__BgPositionValue__RelyAssignment_1_1");
					put(grammarAccess.getRepeatStyleValueAccess().getVAssignment_0(), "rule__RepeatStyleValue__VAssignment_0");
					put(grammarAccess.getRepeatStyleValueAccess().getVAssignment_1_0(), "rule__RepeatStyleValue__VAssignment_1_0");
					put(grammarAccess.getRepeatStyleValueAccess().getV2Assignment_1_1(), "rule__RepeatStyleValue__V2Assignment_1_1");
					put(grammarAccess.getBgSizeValueAccess().getXsizeAssignment_0_0_0(), "rule__BgSizeValue__XsizeAssignment_0_0_0");
					put(grammarAccess.getBgSizeValueAccess().getXautoAssignment_0_0_1(), "rule__BgSizeValue__XautoAssignment_0_0_1");
					put(grammarAccess.getBgSizeValueAccess().getYsizeAssignment_0_1_0(), "rule__BgSizeValue__YsizeAssignment_0_1_0");
					put(grammarAccess.getBgSizeValueAccess().getYautoAssignment_0_1_1(), "rule__BgSizeValue__YautoAssignment_0_1_1");
					put(grammarAccess.getBgSizeValueAccess().getPredefinedAssignment_1(), "rule__BgSizeValue__PredefinedAssignment_1");
					put(grammarAccess.getMultiPaintValueAccess().getValuesAssignment(), "rule__MultiPaintValue__ValuesAssignment");
					put(grammarAccess.getBorderStyleValueAccess().getDashStyleAssignment_0(), "rule__BorderStyleValue__DashStyleAssignment_0");
					put(grammarAccess.getBorderStyleValueAccess().getLocationAssignment_1(), "rule__BorderStyleValue__LocationAssignment_1");
					put(grammarAccess.getBorderStyleValueAccess().getMiterAbsAssignment_2_1_0_1(), "rule__BorderStyleValue__MiterAbsAssignment_2_1_0_1");
					put(grammarAccess.getBorderStyleValueAccess().getMiterPredefinedAssignment_2_1_1(), "rule__BorderStyleValue__MiterPredefinedAssignment_2_1_1");
					put(grammarAccess.getBorderStyleValueAccess().getLineCapAssignment_3_1(), "rule__BorderStyleValue__LineCapAssignment_3_1");
					put(grammarAccess.getDashStyleValueAccess().getVAssignment(), "rule__DashStyleValue__VAssignment");
					put(grammarAccess.getSizeFillAccess().getValueAssignment_0(), "rule__SizeFill__ValueAssignment_0");
					put(grammarAccess.getSizeFillAccess().getFillAssignment_1(), "rule__SizeFill__FillAssignment_1");
					put(grammarAccess.getFontValueAccess().getStyleOrWeightStringAssignment_0_0(), "rule__FontValue__StyleOrWeightStringAssignment_0_0");
					put(grammarAccess.getFontValueAccess().getWeightAssignment_0_1(), "rule__FontValue__WeightAssignment_0_1");
					put(grammarAccess.getFontValueAccess().getSizeAssignment_1(), "rule__FontValue__SizeAssignment_1");
					put(grammarAccess.getFontValueAccess().getFamilyAssignment_2(), "rule__FontValue__FamilyAssignment_2");
					put(grammarAccess.getFontStyleValueAccess().getValueAssignment(), "rule__FontStyleValue__ValueAssignment");
					put(grammarAccess.getFontWeightValueAccess().getValueStringAssignment_0(), "rule__FontWeightValue__ValueStringAssignment_0");
					put(grammarAccess.getFontWeightValueAccess().getValueIntAssignment_1(), "rule__FontWeightValue__ValueIntAssignment_1");
					put(grammarAccess.getFontFamilyAccess().getValueAssignment(), "rule__FontFamily__ValueAssignment");
					put(grammarAccess.getLinearGradientAccess().getX1Assignment_2(), "rule__LinearGradient__X1Assignment_2");
					put(grammarAccess.getLinearGradientAccess().getY1Assignment_4(), "rule__LinearGradient__Y1Assignment_4");
					put(grammarAccess.getLinearGradientAccess().getX2Assignment_8(), "rule__LinearGradient__X2Assignment_8");
					put(grammarAccess.getLinearGradientAccess().getY2Assignment_10(), "rule__LinearGradient__Y2Assignment_10");
					put(grammarAccess.getLinearGradientAccess().getStopsAssignment_13_1(), "rule__LinearGradient__StopsAssignment_13_1");
					put(grammarAccess.getRadialGradientAccess().getCxAssignment_1_1(), "rule__RadialGradient__CxAssignment_1_1");
					put(grammarAccess.getRadialGradientAccess().getCyAssignment_1_3(), "rule__RadialGradient__CyAssignment_1_3");
					put(grammarAccess.getRadialGradientAccess().getRadiusAssignment_2(), "rule__RadialGradient__RadiusAssignment_2");
					put(grammarAccess.getRadialGradientAccess().getFxAssignment_3_2(), "rule__RadialGradient__FxAssignment_3_2");
					put(grammarAccess.getRadialGradientAccess().getFyAssignment_3_4(), "rule__RadialGradient__FyAssignment_3_4");
					put(grammarAccess.getRadialGradientAccess().getStopsAssignment_5_1(), "rule__RadialGradient__StopsAssignment_5_1");
					put(grammarAccess.getStopValueAccess().getPosAssignment_0(), "rule__StopValue__PosAssignment_0");
					put(grammarAccess.getStopValueAccess().getColorAssignment_2(), "rule__StopValue__ColorAssignment_2");
					put(grammarAccess.getNamedColorAccess().getValueAssignment(), "rule__NamedColor__ValueAssignment");
					put(grammarAccess.getRGBColorAccess().getHexAssignment_0(), "rule__RGBColor__HexAssignment_0");
					put(grammarAccess.getRGBColorAccess().getRAssignment_1_2(), "rule__RGBColor__RAssignment_1_2");
					put(grammarAccess.getRGBColorAccess().getGAssignment_1_4(), "rule__RGBColor__GAssignment_1_4");
					put(grammarAccess.getRGBColorAccess().getBAssignment_1_6(), "rule__RGBColor__BAssignment_1_6");
					put(grammarAccess.getRGBColorAccess().getRpAssignment_2_2(), "rule__RGBColor__RpAssignment_2_2");
					put(grammarAccess.getRGBColorAccess().getGpAssignment_2_5(), "rule__RGBColor__GpAssignment_2_5");
					put(grammarAccess.getRGBColorAccess().getBpAssignment_2_8(), "rule__RGBColor__BpAssignment_2_8");
					put(grammarAccess.getRGBColorAccess().getRAssignment_3_2(), "rule__RGBColor__RAssignment_3_2");
					put(grammarAccess.getRGBColorAccess().getGAssignment_3_4(), "rule__RGBColor__GAssignment_3_4");
					put(grammarAccess.getRGBColorAccess().getBAssignment_3_6(), "rule__RGBColor__BAssignment_3_6");
					put(grammarAccess.getRGBColorAccess().getAlphaAssignment_3_8(), "rule__RGBColor__AlphaAssignment_3_8");
					put(grammarAccess.getRGBColorAccess().getRpAssignment_4_2(), "rule__RGBColor__RpAssignment_4_2");
					put(grammarAccess.getRGBColorAccess().getGpAssignment_4_5(), "rule__RGBColor__GpAssignment_4_5");
					put(grammarAccess.getRGBColorAccess().getBpAssignment_4_8(), "rule__RGBColor__BpAssignment_4_8");
					put(grammarAccess.getRGBColorAccess().getAlphaAssignment_4_11(), "rule__RGBColor__AlphaAssignment_4_11");
					put(grammarAccess.getHSBColorAccess().getHueAssignment_0_2(), "rule__HSBColor__HueAssignment_0_2");
					put(grammarAccess.getHSBColorAccess().getSaturationAssignment_0_4(), "rule__HSBColor__SaturationAssignment_0_4");
					put(grammarAccess.getHSBColorAccess().getBrightnessAssignment_0_7(), "rule__HSBColor__BrightnessAssignment_0_7");
					put(grammarAccess.getHSBColorAccess().getHueAssignment_1_2(), "rule__HSBColor__HueAssignment_1_2");
					put(grammarAccess.getHSBColorAccess().getSaturationAssignment_1_4(), "rule__HSBColor__SaturationAssignment_1_4");
					put(grammarAccess.getHSBColorAccess().getBrightnessAssignment_1_7(), "rule__HSBColor__BrightnessAssignment_1_7");
					put(grammarAccess.getHSBColorAccess().getAlphaAssignment_1_10(), "rule__HSBColor__AlphaAssignment_1_10");
					put(grammarAccess.getColorFunctionAccess().getOrigAssignment_0_2(), "rule__ColorFunction__OrigAssignment_0_2");
					put(grammarAccess.getColorFunctionAccess().getModAssignment_0_4(), "rule__ColorFunction__ModAssignment_0_4");
					put(grammarAccess.getColorFunctionAccess().getOrigAssignment_1_2(), "rule__ColorFunction__OrigAssignment_1_2");
					put(grammarAccess.getColorFunctionAccess().getStopNumbersAssignment_1_5_1(), "rule__ColorFunction__StopNumbersAssignment_1_5_1");
					put(grammarAccess.getColorFunctionAccess().getStopColorsAssignment_1_5_3(), "rule__ColorFunction__StopColorsAssignment_1_5_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr.internal.InternalJFXCssParser typedParser = (at.bestsolution.e4.jfx.xtext.ui.contentassist.antlr.internal.InternalJFXCssParser) parser;
			typedParser.entryRuleJFXCss();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT" };
	}
	
	public JFXCssGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JFXCssGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
