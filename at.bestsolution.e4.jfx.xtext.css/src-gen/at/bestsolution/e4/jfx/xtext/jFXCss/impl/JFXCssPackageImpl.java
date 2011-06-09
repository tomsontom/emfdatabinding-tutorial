/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.e4.jfx.xtext.jFXCss.impl;

import at.bestsolution.e4.jfx.xtext.jFXCss.AddressValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImagePositionProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BackgroundImageSizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BarPolicyProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BgPositionValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BgSizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BlendProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BlurValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BooleanProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BooleanValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderColorProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderImageSliceProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.BorderStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorFunction;
import at.bestsolution.e4.jfx.xtext.jFXCss.ColorValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.CursorProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.DashStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.Definition;
import at.bestsolution.e4.jfx.xtext.jFXCss.EchoCharProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.Effect;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectDropShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectInnerShadow;
import at.bestsolution.e4.jfx.xtext.jFXCss.EffectProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementClass;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementId;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementName;
import at.bestsolution.e4.jfx.xtext.jFXCss.ElementPseudoClass;
import at.bestsolution.e4.jfx.xtext.jFXCss.FXProperty;
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
import at.bestsolution.e4.jfx.xtext.jFXCss.HPositionValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.HSBColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.HorizontalGridLineStrokeDashArrayProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.InsetsProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.IntegerValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCss;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssFactory;
import at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage;
import at.bestsolution.e4.jfx.xtext.jFXCss.LinearGradient;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiPaintValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.MultiSizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.NamedColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.NumberValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.PaintProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.PaintValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.RGBColor;
import at.bestsolution.e4.jfx.xtext.jFXCss.RadialGradient;
import at.bestsolution.e4.jfx.xtext.jFXCss.RealValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.RepeatProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.RepeatStyleValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.Selector;
import at.bestsolution.e4.jfx.xtext.jFXCss.ShapeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.SideProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeFill;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.SizeValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.StopValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineCapProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.StrokeLineJoinProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextAlignmentProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextOriginProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextOverrunProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.TextProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperties;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.UrlValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.VPositionProperty;
import at.bestsolution.e4.jfx.xtext.jFXCss.VPositionValue;
import at.bestsolution.e4.jfx.xtext.jFXCss.VerticalGridLineStrokeDashArrayProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JFXCssPackageImpl extends EPackageImpl implements JFXCssPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jfxCssEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementPseudoClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fxPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFamilyPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontSizePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontStylePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontWeightPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cursorPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectDropShadowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectInnerShadowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paintPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paintPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blendPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiSizePropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hPositionPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vPositionPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sidePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass barPolicyPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiSizePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizePropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strokeLineCapPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strokeLineJoinPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textAlignmentPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textOriginPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundImagePositionPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundImageSizePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderColorPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderStylePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderImageSlicePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textOverrunPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass echoCharPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insetsPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horizontalGridLineStrokeDashArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verticalGridLineStrokeDashArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vPositionValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blurValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiSizeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bgPositionValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatStyleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bgSizeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiPaintValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderStyleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dashStyleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeFillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontStyleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontWeightValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFamilyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paintValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearGradientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radialGradientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stopValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hsbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum hPositionValueEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.e4.jfx.xtext.jFXCss.JFXCssPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JFXCssPackageImpl()
  {
    super(eNS_URI, JFXCssFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JFXCssPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JFXCssPackage init()
  {
    if (isInited) return (JFXCssPackage)EPackage.Registry.INSTANCE.getEPackage(JFXCssPackage.eNS_URI);

    // Obtain or create and register package
    JFXCssPackageImpl theJFXCssPackage = (JFXCssPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JFXCssPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JFXCssPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJFXCssPackage.createPackageContents();

    // Initialize created meta-data
    theJFXCssPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJFXCssPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JFXCssPackage.eNS_URI, theJFXCssPackage);
    return theJFXCssPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJFXCss()
  {
    return jfxCssEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJFXCss_Definitions()
  {
    return (EReference)jfxCssEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Selector()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Properties()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelector_SimpleSelector()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleSelector()
  {
    return simpleSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelector_Element()
  {
    return (EReference)simpleSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelector_Id()
  {
    return (EReference)simpleSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelector_Class()
  {
    return (EReference)simpleSelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelector_PseudoClass()
  {
    return (EReference)simpleSelectorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementName()
  {
    return elementNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementName_Value()
  {
    return (EAttribute)elementNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementId()
  {
    return elementIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementId_Id()
  {
    return (EAttribute)elementIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementClass()
  {
    return elementClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementClass_Id()
  {
    return (EAttribute)elementClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementPseudoClass()
  {
    return elementPseudoClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementPseudoClass_Value()
  {
    return (EAttribute)elementPseudoClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFXProperty()
  {
    return fxPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontProperty()
  {
    return fontPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontProperty_Property()
  {
    return (EAttribute)fontPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontProperty_Value()
  {
    return (EReference)fontPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFamilyProperty()
  {
    return fontFamilyPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFamilyProperty_Property()
  {
    return (EAttribute)fontFamilyPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontFamilyProperty_Value()
  {
    return (EReference)fontFamilyPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontSizeProperty()
  {
    return fontSizePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontSizeProperty_Property()
  {
    return (EAttribute)fontSizePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontSizeProperty_Value()
  {
    return (EReference)fontSizePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontStyleProperty()
  {
    return fontStylePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontStyleProperty_Property()
  {
    return (EAttribute)fontStylePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontStyleProperty_Value()
  {
    return (EReference)fontStylePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontWeightProperty()
  {
    return fontWeightPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontWeightProperty_Property()
  {
    return (EAttribute)fontWeightPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontWeightProperty_Value()
  {
    return (EReference)fontWeightPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCursorProperty()
  {
    return cursorPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCursorProperty_Value()
  {
    return (EAttribute)cursorPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectProperty()
  {
    return effectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffectProperty_Value()
  {
    return (EReference)effectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Blur()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Color()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_BlurRadius()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_OffsetX()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_OffsetY()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectDropShadow()
  {
    return effectDropShadowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffectDropShadow_Spread()
  {
    return (EReference)effectDropShadowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectInnerShadow()
  {
    return effectInnerShadowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffectInnerShadow_Choke()
  {
    return (EReference)effectInnerShadowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanProperty()
  {
    return booleanPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanProperty_Property()
  {
    return (EAttribute)booleanPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanProperty_Value()
  {
    return (EAttribute)booleanPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeProperty()
  {
    return sizePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeProperty_Property()
  {
    return (EAttribute)sizePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSizeProperty_Value()
  {
    return (EReference)sizePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberProperty()
  {
    return numberPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberProperty_Property()
  {
    return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberProperty_Value()
  {
    return (EReference)numberPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerProperty()
  {
    return integerPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerProperty_Property()
  {
    return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerProperty_Value()
  {
    return (EReference)integerPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaintProperty()
  {
    return paintPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPaintProperty_Property()
  {
    return (EAttribute)paintPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPaintProperty_Value()
  {
    return (EReference)paintPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaintProperties()
  {
    return paintPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPaintProperties_Property()
  {
    return (EAttribute)paintPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPaintProperties_Values()
  {
    return (EReference)paintPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlendProperty()
  {
    return blendPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlendProperty_Value()
  {
    return (EAttribute)blendPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlProperty()
  {
    return urlPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUrlProperty_Property()
  {
    return (EAttribute)urlPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUrlProperty_Value()
  {
    return (EReference)urlPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiSizeProperties()
  {
    return multiSizePropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiSizeProperties_Property()
  {
    return (EAttribute)multiSizePropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiSizeProperties_Values()
  {
    return (EReference)multiSizePropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHPositionProperty()
  {
    return hPositionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHPositionProperty_Property()
  {
    return (EAttribute)hPositionPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHPositionProperty_Value()
  {
    return (EAttribute)hPositionPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVPositionProperty()
  {
    return vPositionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVPositionProperty_Property()
  {
    return (EAttribute)vPositionPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVPositionProperty_Value()
  {
    return (EReference)vPositionPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSideProperty()
  {
    return sidePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSideProperty_Property()
  {
    return (EAttribute)sidePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSideProperty_Value()
  {
    return (EAttribute)sidePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBarPolicyProperty()
  {
    return barPolicyPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBarPolicyProperty_Property()
  {
    return (EAttribute)barPolicyPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBarPolicyProperty_Value()
  {
    return (EAttribute)barPolicyPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlProperties()
  {
    return urlPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUrlProperties_Property()
  {
    return (EAttribute)urlPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUrlProperties_Values()
  {
    return (EReference)urlPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatProperties()
  {
    return repeatPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatProperties_Property()
  {
    return (EAttribute)repeatPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeatProperties_Values()
  {
    return (EReference)repeatPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiSizeProperty()
  {
    return multiSizePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiSizeProperty_Property()
  {
    return (EAttribute)multiSizePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiSizeProperty_Value()
  {
    return (EReference)multiSizePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeProperties()
  {
    return sizePropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeProperties_Property()
  {
    return (EAttribute)sizePropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSizeProperties_Values()
  {
    return (EReference)sizePropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrokeLineCapProperty()
  {
    return strokeLineCapPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrokeLineCapProperty_Value()
  {
    return (EAttribute)strokeLineCapPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrokeLineJoinProperty()
  {
    return strokeLineJoinPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrokeLineJoinProperty_Value()
  {
    return (EAttribute)strokeLineJoinPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextAlignmentProperty()
  {
    return textAlignmentPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextAlignmentProperty_Value()
  {
    return (EAttribute)textAlignmentPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextOriginProperty()
  {
    return textOriginPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextOriginProperty_Value()
  {
    return (EAttribute)textOriginPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackgroundImagePositionProperty()
  {
    return backgroundImagePositionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackgroundImagePositionProperty_Values()
  {
    return (EReference)backgroundImagePositionPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackgroundImageSizeProperty()
  {
    return backgroundImageSizePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackgroundImageSizeProperty_Values()
  {
    return (EReference)backgroundImageSizePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderColorProperty()
  {
    return borderColorPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderColorProperty_Values()
  {
    return (EReference)borderColorPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderStyleProperty()
  {
    return borderStylePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderStyleProperty_Values()
  {
    return (EReference)borderStylePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderImageSliceProperty()
  {
    return borderImageSlicePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderImageSliceProperty_Values()
  {
    return (EReference)borderImageSlicePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeProperty()
  {
    return shapePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShapeProperty_Value()
  {
    return (EAttribute)shapePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextProperty()
  {
    return textPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextProperty_Value()
  {
    return (EAttribute)textPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextOverrunProperty()
  {
    return textOverrunPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextOverrunProperty_Value()
  {
    return (EAttribute)textOverrunPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEchoCharProperty()
  {
    return echoCharPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEchoCharProperty_Value()
  {
    return (EAttribute)echoCharPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsetsProperty()
  {
    return insetsPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsetsProperty_Value()
  {
    return (EReference)insetsPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorizontalGridLineStrokeDashArrayProperty()
  {
    return horizontalGridLineStrokeDashArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorizontalGridLineStrokeDashArrayProperty_Value()
  {
    return (EReference)horizontalGridLineStrokeDashArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerticalGridLineStrokeDashArrayProperty()
  {
    return verticalGridLineStrokeDashArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerticalGridLineStrokeDashArrayProperty_Values()
  {
    return (EReference)verticalGridLineStrokeDashArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVPositionValue()
  {
    return vPositionValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVPositionValue_V()
  {
    return (EAttribute)vPositionValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlurValue()
  {
    return blurValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlurValue_V()
  {
    return (EAttribute)blurValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberValue()
  {
    return numberValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValue()
  {
    return integerValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerValue_Value()
  {
    return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealValue()
  {
    return realValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealValue_Value()
  {
    return (EAttribute)realValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlValue()
  {
    return urlValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUrlValue_Address()
  {
    return (EReference)urlValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddressValue()
  {
    return addressValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddressValue_Value()
  {
    return (EAttribute)addressValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeValue()
  {
    return sizeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSizeValue_Value()
  {
    return (EReference)sizeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeValue_Dimension()
  {
    return (EAttribute)sizeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiSizeValue()
  {
    return multiSizeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiSizeValue_Values()
  {
    return (EReference)multiSizeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBgPositionValue()
  {
    return bgPositionValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBgPositionValue_Absx()
  {
    return (EReference)bgPositionValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPositionValue_Relx()
  {
    return (EAttribute)bgPositionValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBgPositionValue_Absy()
  {
    return (EReference)bgPositionValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPositionValue_Rely()
  {
    return (EAttribute)bgPositionValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatStyleValue()
  {
    return repeatStyleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatStyleValue_V()
  {
    return (EAttribute)repeatStyleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatStyleValue_V2()
  {
    return (EAttribute)repeatStyleValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBgSizeValue()
  {
    return bgSizeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBgSizeValue_Xsize()
  {
    return (EReference)bgSizeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSizeValue_Xauto()
  {
    return (EAttribute)bgSizeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBgSizeValue_Ysize()
  {
    return (EReference)bgSizeValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSizeValue_Yauto()
  {
    return (EAttribute)bgSizeValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSizeValue_Predefined()
  {
    return (EAttribute)bgSizeValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiPaintValue()
  {
    return multiPaintValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiPaintValue_Values()
  {
    return (EReference)multiPaintValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderStyleValue()
  {
    return borderStyleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderStyleValue_DashStyle()
  {
    return (EReference)borderStyleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyleValue_Location()
  {
    return (EAttribute)borderStyleValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderStyleValue_MiterAbs()
  {
    return (EReference)borderStyleValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyleValue_MiterPredefined()
  {
    return (EAttribute)borderStyleValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyleValue_LineCap()
  {
    return (EAttribute)borderStyleValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDashStyleValue()
  {
    return dashStyleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDashStyleValue_V()
  {
    return (EAttribute)dashStyleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeFill()
  {
    return sizeFillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSizeFill_Value()
  {
    return (EReference)sizeFillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFill_Fill()
  {
    return (EAttribute)sizeFillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontValue()
  {
    return fontValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontValue_StyleOrWeightString()
  {
    return (EAttribute)fontValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontValue_Weight()
  {
    return (EReference)fontValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontValue_Size()
  {
    return (EReference)fontValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontValue_Family()
  {
    return (EReference)fontValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontStyleValue()
  {
    return fontStyleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontStyleValue_Value()
  {
    return (EAttribute)fontStyleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontWeightValue()
  {
    return fontWeightValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontWeightValue_ValueString()
  {
    return (EAttribute)fontWeightValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontWeightValue_ValueInt()
  {
    return (EReference)fontWeightValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFamily()
  {
    return fontFamilyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFamily_Value()
  {
    return (EAttribute)fontFamilyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaintValue()
  {
    return paintValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearGradient()
  {
    return linearGradientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_X1()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_Y1()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_X2()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_Y2()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_Stops()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadialGradient()
  {
    return radialGradientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Cx()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Cy()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Radius()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Fx()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Fy()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Stops()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStopValue()
  {
    return stopValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStopValue_Pos()
  {
    return (EReference)stopValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStopValue_Color()
  {
    return (EReference)stopValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorValue()
  {
    return colorValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedColor()
  {
    return namedColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedColor_Value()
  {
    return (EAttribute)namedColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGBColor()
  {
    return rgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Hex()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_R()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_G()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_B()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_Rp()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_Gp()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_Bp()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRGBColor_Alpha()
  {
    return (EReference)rgbColorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHSBColor()
  {
    return hsbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHSBColor_Hue()
  {
    return (EReference)hsbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHSBColor_Saturation()
  {
    return (EReference)hsbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHSBColor_Brightness()
  {
    return (EReference)hsbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHSBColor_Alpha()
  {
    return (EReference)hsbColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFunction()
  {
    return colorFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_Orig()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_Mod()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_StopNumbers()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_StopColors()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanValue()
  {
    return booleanValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHPositionValue()
  {
    return hPositionValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JFXCssFactory getJFXCssFactory()
  {
    return (JFXCssFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jfxCssEClass = createEClass(JFX_CSS);
    createEReference(jfxCssEClass, JFX_CSS__DEFINITIONS);

    definitionEClass = createEClass(DEFINITION);
    createEReference(definitionEClass, DEFINITION__SELECTOR);
    createEReference(definitionEClass, DEFINITION__PROPERTIES);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__SIMPLE_SELECTOR);

    simpleSelectorEClass = createEClass(SIMPLE_SELECTOR);
    createEReference(simpleSelectorEClass, SIMPLE_SELECTOR__ELEMENT);
    createEReference(simpleSelectorEClass, SIMPLE_SELECTOR__ID);
    createEReference(simpleSelectorEClass, SIMPLE_SELECTOR__CLASS);
    createEReference(simpleSelectorEClass, SIMPLE_SELECTOR__PSEUDO_CLASS);

    elementNameEClass = createEClass(ELEMENT_NAME);
    createEAttribute(elementNameEClass, ELEMENT_NAME__VALUE);

    elementIdEClass = createEClass(ELEMENT_ID);
    createEAttribute(elementIdEClass, ELEMENT_ID__ID);

    elementClassEClass = createEClass(ELEMENT_CLASS);
    createEAttribute(elementClassEClass, ELEMENT_CLASS__ID);

    elementPseudoClassEClass = createEClass(ELEMENT_PSEUDO_CLASS);
    createEAttribute(elementPseudoClassEClass, ELEMENT_PSEUDO_CLASS__VALUE);

    fxPropertyEClass = createEClass(FX_PROPERTY);

    fontPropertyEClass = createEClass(FONT_PROPERTY);
    createEAttribute(fontPropertyEClass, FONT_PROPERTY__PROPERTY);
    createEReference(fontPropertyEClass, FONT_PROPERTY__VALUE);

    fontFamilyPropertyEClass = createEClass(FONT_FAMILY_PROPERTY);
    createEAttribute(fontFamilyPropertyEClass, FONT_FAMILY_PROPERTY__PROPERTY);
    createEReference(fontFamilyPropertyEClass, FONT_FAMILY_PROPERTY__VALUE);

    fontSizePropertyEClass = createEClass(FONT_SIZE_PROPERTY);
    createEAttribute(fontSizePropertyEClass, FONT_SIZE_PROPERTY__PROPERTY);
    createEReference(fontSizePropertyEClass, FONT_SIZE_PROPERTY__VALUE);

    fontStylePropertyEClass = createEClass(FONT_STYLE_PROPERTY);
    createEAttribute(fontStylePropertyEClass, FONT_STYLE_PROPERTY__PROPERTY);
    createEReference(fontStylePropertyEClass, FONT_STYLE_PROPERTY__VALUE);

    fontWeightPropertyEClass = createEClass(FONT_WEIGHT_PROPERTY);
    createEAttribute(fontWeightPropertyEClass, FONT_WEIGHT_PROPERTY__PROPERTY);
    createEReference(fontWeightPropertyEClass, FONT_WEIGHT_PROPERTY__VALUE);

    cursorPropertyEClass = createEClass(CURSOR_PROPERTY);
    createEAttribute(cursorPropertyEClass, CURSOR_PROPERTY__VALUE);

    effectPropertyEClass = createEClass(EFFECT_PROPERTY);
    createEReference(effectPropertyEClass, EFFECT_PROPERTY__VALUE);

    effectEClass = createEClass(EFFECT);
    createEReference(effectEClass, EFFECT__BLUR);
    createEReference(effectEClass, EFFECT__COLOR);
    createEReference(effectEClass, EFFECT__BLUR_RADIUS);
    createEReference(effectEClass, EFFECT__OFFSET_X);
    createEReference(effectEClass, EFFECT__OFFSET_Y);

    effectDropShadowEClass = createEClass(EFFECT_DROP_SHADOW);
    createEReference(effectDropShadowEClass, EFFECT_DROP_SHADOW__SPREAD);

    effectInnerShadowEClass = createEClass(EFFECT_INNER_SHADOW);
    createEReference(effectInnerShadowEClass, EFFECT_INNER_SHADOW__CHOKE);

    booleanPropertyEClass = createEClass(BOOLEAN_PROPERTY);
    createEAttribute(booleanPropertyEClass, BOOLEAN_PROPERTY__PROPERTY);
    createEAttribute(booleanPropertyEClass, BOOLEAN_PROPERTY__VALUE);

    sizePropertyEClass = createEClass(SIZE_PROPERTY);
    createEAttribute(sizePropertyEClass, SIZE_PROPERTY__PROPERTY);
    createEReference(sizePropertyEClass, SIZE_PROPERTY__VALUE);

    numberPropertyEClass = createEClass(NUMBER_PROPERTY);
    createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__PROPERTY);
    createEReference(numberPropertyEClass, NUMBER_PROPERTY__VALUE);

    integerPropertyEClass = createEClass(INTEGER_PROPERTY);
    createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__PROPERTY);
    createEReference(integerPropertyEClass, INTEGER_PROPERTY__VALUE);

    paintPropertyEClass = createEClass(PAINT_PROPERTY);
    createEAttribute(paintPropertyEClass, PAINT_PROPERTY__PROPERTY);
    createEReference(paintPropertyEClass, PAINT_PROPERTY__VALUE);

    paintPropertiesEClass = createEClass(PAINT_PROPERTIES);
    createEAttribute(paintPropertiesEClass, PAINT_PROPERTIES__PROPERTY);
    createEReference(paintPropertiesEClass, PAINT_PROPERTIES__VALUES);

    blendPropertyEClass = createEClass(BLEND_PROPERTY);
    createEAttribute(blendPropertyEClass, BLEND_PROPERTY__VALUE);

    urlPropertyEClass = createEClass(URL_PROPERTY);
    createEAttribute(urlPropertyEClass, URL_PROPERTY__PROPERTY);
    createEReference(urlPropertyEClass, URL_PROPERTY__VALUE);

    multiSizePropertiesEClass = createEClass(MULTI_SIZE_PROPERTIES);
    createEAttribute(multiSizePropertiesEClass, MULTI_SIZE_PROPERTIES__PROPERTY);
    createEReference(multiSizePropertiesEClass, MULTI_SIZE_PROPERTIES__VALUES);

    hPositionPropertyEClass = createEClass(HPOSITION_PROPERTY);
    createEAttribute(hPositionPropertyEClass, HPOSITION_PROPERTY__PROPERTY);
    createEAttribute(hPositionPropertyEClass, HPOSITION_PROPERTY__VALUE);

    vPositionPropertyEClass = createEClass(VPOSITION_PROPERTY);
    createEAttribute(vPositionPropertyEClass, VPOSITION_PROPERTY__PROPERTY);
    createEReference(vPositionPropertyEClass, VPOSITION_PROPERTY__VALUE);

    sidePropertyEClass = createEClass(SIDE_PROPERTY);
    createEAttribute(sidePropertyEClass, SIDE_PROPERTY__PROPERTY);
    createEAttribute(sidePropertyEClass, SIDE_PROPERTY__VALUE);

    barPolicyPropertyEClass = createEClass(BAR_POLICY_PROPERTY);
    createEAttribute(barPolicyPropertyEClass, BAR_POLICY_PROPERTY__PROPERTY);
    createEAttribute(barPolicyPropertyEClass, BAR_POLICY_PROPERTY__VALUE);

    urlPropertiesEClass = createEClass(URL_PROPERTIES);
    createEAttribute(urlPropertiesEClass, URL_PROPERTIES__PROPERTY);
    createEReference(urlPropertiesEClass, URL_PROPERTIES__VALUES);

    repeatPropertiesEClass = createEClass(REPEAT_PROPERTIES);
    createEAttribute(repeatPropertiesEClass, REPEAT_PROPERTIES__PROPERTY);
    createEReference(repeatPropertiesEClass, REPEAT_PROPERTIES__VALUES);

    multiSizePropertyEClass = createEClass(MULTI_SIZE_PROPERTY);
    createEAttribute(multiSizePropertyEClass, MULTI_SIZE_PROPERTY__PROPERTY);
    createEReference(multiSizePropertyEClass, MULTI_SIZE_PROPERTY__VALUE);

    sizePropertiesEClass = createEClass(SIZE_PROPERTIES);
    createEAttribute(sizePropertiesEClass, SIZE_PROPERTIES__PROPERTY);
    createEReference(sizePropertiesEClass, SIZE_PROPERTIES__VALUES);

    strokeLineCapPropertyEClass = createEClass(STROKE_LINE_CAP_PROPERTY);
    createEAttribute(strokeLineCapPropertyEClass, STROKE_LINE_CAP_PROPERTY__VALUE);

    strokeLineJoinPropertyEClass = createEClass(STROKE_LINE_JOIN_PROPERTY);
    createEAttribute(strokeLineJoinPropertyEClass, STROKE_LINE_JOIN_PROPERTY__VALUE);

    textAlignmentPropertyEClass = createEClass(TEXT_ALIGNMENT_PROPERTY);
    createEAttribute(textAlignmentPropertyEClass, TEXT_ALIGNMENT_PROPERTY__VALUE);

    textOriginPropertyEClass = createEClass(TEXT_ORIGIN_PROPERTY);
    createEAttribute(textOriginPropertyEClass, TEXT_ORIGIN_PROPERTY__VALUE);

    backgroundImagePositionPropertyEClass = createEClass(BACKGROUND_IMAGE_POSITION_PROPERTY);
    createEReference(backgroundImagePositionPropertyEClass, BACKGROUND_IMAGE_POSITION_PROPERTY__VALUES);

    backgroundImageSizePropertyEClass = createEClass(BACKGROUND_IMAGE_SIZE_PROPERTY);
    createEReference(backgroundImageSizePropertyEClass, BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES);

    borderColorPropertyEClass = createEClass(BORDER_COLOR_PROPERTY);
    createEReference(borderColorPropertyEClass, BORDER_COLOR_PROPERTY__VALUES);

    borderStylePropertyEClass = createEClass(BORDER_STYLE_PROPERTY);
    createEReference(borderStylePropertyEClass, BORDER_STYLE_PROPERTY__VALUES);

    borderImageSlicePropertyEClass = createEClass(BORDER_IMAGE_SLICE_PROPERTY);
    createEReference(borderImageSlicePropertyEClass, BORDER_IMAGE_SLICE_PROPERTY__VALUES);

    shapePropertyEClass = createEClass(SHAPE_PROPERTY);
    createEAttribute(shapePropertyEClass, SHAPE_PROPERTY__VALUE);

    textPropertyEClass = createEClass(TEXT_PROPERTY);
    createEAttribute(textPropertyEClass, TEXT_PROPERTY__VALUE);

    textOverrunPropertyEClass = createEClass(TEXT_OVERRUN_PROPERTY);
    createEAttribute(textOverrunPropertyEClass, TEXT_OVERRUN_PROPERTY__VALUE);

    echoCharPropertyEClass = createEClass(ECHO_CHAR_PROPERTY);
    createEAttribute(echoCharPropertyEClass, ECHO_CHAR_PROPERTY__VALUE);

    insetsPropertyEClass = createEClass(INSETS_PROPERTY);
    createEReference(insetsPropertyEClass, INSETS_PROPERTY__VALUE);

    horizontalGridLineStrokeDashArrayPropertyEClass = createEClass(HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY);
    createEReference(horizontalGridLineStrokeDashArrayPropertyEClass, HORIZONTAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUE);

    verticalGridLineStrokeDashArrayPropertyEClass = createEClass(VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY);
    createEReference(verticalGridLineStrokeDashArrayPropertyEClass, VERTICAL_GRID_LINE_STROKE_DASH_ARRAY_PROPERTY__VALUES);

    vPositionValueEClass = createEClass(VPOSITION_VALUE);
    createEAttribute(vPositionValueEClass, VPOSITION_VALUE__V);

    blurValueEClass = createEClass(BLUR_VALUE);
    createEAttribute(blurValueEClass, BLUR_VALUE__V);

    numberValueEClass = createEClass(NUMBER_VALUE);

    integerValueEClass = createEClass(INTEGER_VALUE);
    createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

    realValueEClass = createEClass(REAL_VALUE);
    createEAttribute(realValueEClass, REAL_VALUE__VALUE);

    urlValueEClass = createEClass(URL_VALUE);
    createEReference(urlValueEClass, URL_VALUE__ADDRESS);

    addressValueEClass = createEClass(ADDRESS_VALUE);
    createEAttribute(addressValueEClass, ADDRESS_VALUE__VALUE);

    sizeValueEClass = createEClass(SIZE_VALUE);
    createEReference(sizeValueEClass, SIZE_VALUE__VALUE);
    createEAttribute(sizeValueEClass, SIZE_VALUE__DIMENSION);

    multiSizeValueEClass = createEClass(MULTI_SIZE_VALUE);
    createEReference(multiSizeValueEClass, MULTI_SIZE_VALUE__VALUES);

    bgPositionValueEClass = createEClass(BG_POSITION_VALUE);
    createEReference(bgPositionValueEClass, BG_POSITION_VALUE__ABSX);
    createEAttribute(bgPositionValueEClass, BG_POSITION_VALUE__RELX);
    createEReference(bgPositionValueEClass, BG_POSITION_VALUE__ABSY);
    createEAttribute(bgPositionValueEClass, BG_POSITION_VALUE__RELY);

    repeatStyleValueEClass = createEClass(REPEAT_STYLE_VALUE);
    createEAttribute(repeatStyleValueEClass, REPEAT_STYLE_VALUE__V);
    createEAttribute(repeatStyleValueEClass, REPEAT_STYLE_VALUE__V2);

    bgSizeValueEClass = createEClass(BG_SIZE_VALUE);
    createEReference(bgSizeValueEClass, BG_SIZE_VALUE__XSIZE);
    createEAttribute(bgSizeValueEClass, BG_SIZE_VALUE__XAUTO);
    createEReference(bgSizeValueEClass, BG_SIZE_VALUE__YSIZE);
    createEAttribute(bgSizeValueEClass, BG_SIZE_VALUE__YAUTO);
    createEAttribute(bgSizeValueEClass, BG_SIZE_VALUE__PREDEFINED);

    multiPaintValueEClass = createEClass(MULTI_PAINT_VALUE);
    createEReference(multiPaintValueEClass, MULTI_PAINT_VALUE__VALUES);

    borderStyleValueEClass = createEClass(BORDER_STYLE_VALUE);
    createEReference(borderStyleValueEClass, BORDER_STYLE_VALUE__DASH_STYLE);
    createEAttribute(borderStyleValueEClass, BORDER_STYLE_VALUE__LOCATION);
    createEReference(borderStyleValueEClass, BORDER_STYLE_VALUE__MITER_ABS);
    createEAttribute(borderStyleValueEClass, BORDER_STYLE_VALUE__MITER_PREDEFINED);
    createEAttribute(borderStyleValueEClass, BORDER_STYLE_VALUE__LINE_CAP);

    dashStyleValueEClass = createEClass(DASH_STYLE_VALUE);
    createEAttribute(dashStyleValueEClass, DASH_STYLE_VALUE__V);

    sizeFillEClass = createEClass(SIZE_FILL);
    createEReference(sizeFillEClass, SIZE_FILL__VALUE);
    createEAttribute(sizeFillEClass, SIZE_FILL__FILL);

    fontValueEClass = createEClass(FONT_VALUE);
    createEAttribute(fontValueEClass, FONT_VALUE__STYLE_OR_WEIGHT_STRING);
    createEReference(fontValueEClass, FONT_VALUE__WEIGHT);
    createEReference(fontValueEClass, FONT_VALUE__SIZE);
    createEReference(fontValueEClass, FONT_VALUE__FAMILY);

    fontStyleValueEClass = createEClass(FONT_STYLE_VALUE);
    createEAttribute(fontStyleValueEClass, FONT_STYLE_VALUE__VALUE);

    fontWeightValueEClass = createEClass(FONT_WEIGHT_VALUE);
    createEAttribute(fontWeightValueEClass, FONT_WEIGHT_VALUE__VALUE_STRING);
    createEReference(fontWeightValueEClass, FONT_WEIGHT_VALUE__VALUE_INT);

    fontFamilyEClass = createEClass(FONT_FAMILY);
    createEAttribute(fontFamilyEClass, FONT_FAMILY__VALUE);

    paintValueEClass = createEClass(PAINT_VALUE);

    linearGradientEClass = createEClass(LINEAR_GRADIENT);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__X1);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__Y1);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__X2);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__Y2);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__STOPS);

    radialGradientEClass = createEClass(RADIAL_GRADIENT);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__CX);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__CY);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__RADIUS);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__FX);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__FY);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__STOPS);

    stopValueEClass = createEClass(STOP_VALUE);
    createEReference(stopValueEClass, STOP_VALUE__POS);
    createEReference(stopValueEClass, STOP_VALUE__COLOR);

    colorValueEClass = createEClass(COLOR_VALUE);

    namedColorEClass = createEClass(NAMED_COLOR);
    createEAttribute(namedColorEClass, NAMED_COLOR__VALUE);

    rgbColorEClass = createEClass(RGB_COLOR);
    createEAttribute(rgbColorEClass, RGB_COLOR__HEX);
    createEReference(rgbColorEClass, RGB_COLOR__R);
    createEReference(rgbColorEClass, RGB_COLOR__G);
    createEReference(rgbColorEClass, RGB_COLOR__B);
    createEReference(rgbColorEClass, RGB_COLOR__RP);
    createEReference(rgbColorEClass, RGB_COLOR__GP);
    createEReference(rgbColorEClass, RGB_COLOR__BP);
    createEReference(rgbColorEClass, RGB_COLOR__ALPHA);

    hsbColorEClass = createEClass(HSB_COLOR);
    createEReference(hsbColorEClass, HSB_COLOR__HUE);
    createEReference(hsbColorEClass, HSB_COLOR__SATURATION);
    createEReference(hsbColorEClass, HSB_COLOR__BRIGHTNESS);
    createEReference(hsbColorEClass, HSB_COLOR__ALPHA);

    colorFunctionEClass = createEClass(COLOR_FUNCTION);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__ORIG);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__MOD);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__STOP_NUMBERS);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__STOP_COLORS);

    // Create enums
    booleanValueEEnum = createEEnum(BOOLEAN_VALUE);
    hPositionValueEEnum = createEEnum(HPOSITION_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fontPropertyEClass.getESuperTypes().add(this.getFXProperty());
    fontFamilyPropertyEClass.getESuperTypes().add(this.getFXProperty());
    fontSizePropertyEClass.getESuperTypes().add(this.getFXProperty());
    fontStylePropertyEClass.getESuperTypes().add(this.getFXProperty());
    fontWeightPropertyEClass.getESuperTypes().add(this.getFXProperty());
    cursorPropertyEClass.getESuperTypes().add(this.getFXProperty());
    effectPropertyEClass.getESuperTypes().add(this.getFXProperty());
    effectDropShadowEClass.getESuperTypes().add(this.getEffect());
    effectInnerShadowEClass.getESuperTypes().add(this.getEffect());
    booleanPropertyEClass.getESuperTypes().add(this.getFXProperty());
    sizePropertyEClass.getESuperTypes().add(this.getFXProperty());
    numberPropertyEClass.getESuperTypes().add(this.getFXProperty());
    integerPropertyEClass.getESuperTypes().add(this.getFXProperty());
    paintPropertyEClass.getESuperTypes().add(this.getFXProperty());
    paintPropertiesEClass.getESuperTypes().add(this.getFXProperty());
    blendPropertyEClass.getESuperTypes().add(this.getFXProperty());
    urlPropertyEClass.getESuperTypes().add(this.getFXProperty());
    multiSizePropertiesEClass.getESuperTypes().add(this.getFXProperty());
    hPositionPropertyEClass.getESuperTypes().add(this.getFXProperty());
    vPositionPropertyEClass.getESuperTypes().add(this.getFXProperty());
    sidePropertyEClass.getESuperTypes().add(this.getFXProperty());
    barPolicyPropertyEClass.getESuperTypes().add(this.getFXProperty());
    urlPropertiesEClass.getESuperTypes().add(this.getFXProperty());
    repeatPropertiesEClass.getESuperTypes().add(this.getFXProperty());
    multiSizePropertyEClass.getESuperTypes().add(this.getFXProperty());
    sizePropertiesEClass.getESuperTypes().add(this.getFXProperty());
    strokeLineCapPropertyEClass.getESuperTypes().add(this.getFXProperty());
    strokeLineJoinPropertyEClass.getESuperTypes().add(this.getFXProperty());
    textAlignmentPropertyEClass.getESuperTypes().add(this.getFXProperty());
    textOriginPropertyEClass.getESuperTypes().add(this.getFXProperty());
    backgroundImagePositionPropertyEClass.getESuperTypes().add(this.getFXProperty());
    backgroundImageSizePropertyEClass.getESuperTypes().add(this.getFXProperty());
    borderColorPropertyEClass.getESuperTypes().add(this.getFXProperty());
    borderStylePropertyEClass.getESuperTypes().add(this.getFXProperty());
    borderImageSlicePropertyEClass.getESuperTypes().add(this.getFXProperty());
    shapePropertyEClass.getESuperTypes().add(this.getFXProperty());
    textPropertyEClass.getESuperTypes().add(this.getFXProperty());
    textOverrunPropertyEClass.getESuperTypes().add(this.getFXProperty());
    echoCharPropertyEClass.getESuperTypes().add(this.getFXProperty());
    insetsPropertyEClass.getESuperTypes().add(this.getFXProperty());
    horizontalGridLineStrokeDashArrayPropertyEClass.getESuperTypes().add(this.getFXProperty());
    verticalGridLineStrokeDashArrayPropertyEClass.getESuperTypes().add(this.getFXProperty());
    integerValueEClass.getESuperTypes().add(this.getNumberValue());
    realValueEClass.getESuperTypes().add(this.getNumberValue());
    linearGradientEClass.getESuperTypes().add(this.getPaintValue());
    radialGradientEClass.getESuperTypes().add(this.getPaintValue());
    colorValueEClass.getESuperTypes().add(this.getPaintValue());
    namedColorEClass.getESuperTypes().add(this.getColorValue());
    rgbColorEClass.getESuperTypes().add(this.getColorValue());
    hsbColorEClass.getESuperTypes().add(this.getColorValue());
    colorFunctionEClass.getESuperTypes().add(this.getColorValue());

    // Initialize classes and features; add operations and parameters
    initEClass(jfxCssEClass, JFXCss.class, "JFXCss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJFXCss_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, JFXCss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinition_Selector(), this.getSelector(), null, "selector", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Properties(), this.getFXProperty(), null, "properties", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelector_SimpleSelector(), this.getSimpleSelector(), null, "simpleSelector", null, 0, -1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleSelectorEClass, SimpleSelector.class, "SimpleSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSelector_Element(), this.getElementName(), null, "element", null, 0, 1, SimpleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleSelector_Id(), this.getElementId(), null, "id", null, 0, 1, SimpleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleSelector_Class(), this.getElementClass(), null, "class", null, 0, 1, SimpleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleSelector_PseudoClass(), this.getElementPseudoClass(), null, "pseudoClass", null, 0, 1, SimpleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementNameEClass, ElementName.class, "ElementName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementName_Value(), ecorePackage.getEString(), "value", null, 0, 1, ElementName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementIdEClass, ElementId.class, "ElementId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementId_Id(), ecorePackage.getEString(), "id", null, 0, 1, ElementId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementClassEClass, ElementClass.class, "ElementClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementClass_Id(), ecorePackage.getEString(), "id", null, 0, 1, ElementClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementPseudoClassEClass, ElementPseudoClass.class, "ElementPseudoClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementPseudoClass_Value(), ecorePackage.getEString(), "value", null, 0, 1, ElementPseudoClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fxPropertyEClass, FXProperty.class, "FXProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fontPropertyEClass, FontProperty.class, "FontProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FontProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontProperty_Value(), this.getFontValue(), null, "value", null, 0, 1, FontProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontFamilyPropertyEClass, FontFamilyProperty.class, "FontFamilyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontFamilyProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FontFamilyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontFamilyProperty_Value(), this.getFontFamily(), null, "value", null, 0, 1, FontFamilyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontSizePropertyEClass, FontSizeProperty.class, "FontSizeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontSizeProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FontSizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontSizeProperty_Value(), this.getSizeValue(), null, "value", null, 0, 1, FontSizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontStylePropertyEClass, FontStyleProperty.class, "FontStyleProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontStyleProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FontStyleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontStyleProperty_Value(), this.getFontStyleValue(), null, "value", null, 0, 1, FontStyleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontWeightPropertyEClass, FontWeightProperty.class, "FontWeightProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontWeightProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FontWeightProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontWeightProperty_Value(), this.getFontWeightValue(), null, "value", null, 0, 1, FontWeightProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cursorPropertyEClass, CursorProperty.class, "CursorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCursorProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, CursorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectPropertyEClass, EffectProperty.class, "EffectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffectProperty_Value(), this.getEffect(), null, "value", null, 0, 1, EffectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Blur(), this.getBlurValue(), null, "blur", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Color(), this.getColorValue(), null, "color", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_BlurRadius(), this.getNumberValue(), null, "blurRadius", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_OffsetX(), this.getNumberValue(), null, "offsetX", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_OffsetY(), this.getNumberValue(), null, "offsetY", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectDropShadowEClass, EffectDropShadow.class, "EffectDropShadow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffectDropShadow_Spread(), this.getNumberValue(), null, "spread", null, 0, 1, EffectDropShadow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectInnerShadowEClass, EffectInnerShadow.class, "EffectInnerShadow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffectInnerShadow_Choke(), this.getNumberValue(), null, "choke", null, 0, 1, EffectInnerShadow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanPropertyEClass, BooleanProperty.class, "BooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, BooleanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanProperty_Value(), this.getBooleanValue(), "value", null, 0, 1, BooleanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizePropertyEClass, SizeProperty.class, "SizeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSizeProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, SizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSizeProperty_Value(), this.getSizeValue(), null, "value", null, 0, 1, SizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberPropertyEClass, NumberProperty.class, "NumberProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberProperty_Value(), this.getNumberValue(), null, "value", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPropertyEClass, IntegerProperty.class, "IntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerProperty_Value(), this.getIntegerValue(), null, "value", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paintPropertyEClass, PaintProperty.class, "PaintProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPaintProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, PaintProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPaintProperty_Value(), this.getPaintValue(), null, "value", null, 0, 1, PaintProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paintPropertiesEClass, PaintProperties.class, "PaintProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPaintProperties_Property(), ecorePackage.getEString(), "property", null, 0, 1, PaintProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPaintProperties_Values(), this.getPaintValue(), null, "values", null, 0, -1, PaintProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blendPropertyEClass, BlendProperty.class, "BlendProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlendProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, BlendProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlPropertyEClass, UrlProperty.class, "UrlProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUrlProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, UrlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUrlProperty_Value(), this.getUrlValue(), null, "value", null, 0, 1, UrlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiSizePropertiesEClass, MultiSizeProperties.class, "MultiSizeProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiSizeProperties_Property(), ecorePackage.getEString(), "property", null, 0, 1, MultiSizeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiSizeProperties_Values(), this.getMultiSizeValue(), null, "values", null, 0, -1, MultiSizeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hPositionPropertyEClass, HPositionProperty.class, "HPositionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHPositionProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, HPositionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHPositionProperty_Value(), this.getHPositionValue(), "value", null, 0, 1, HPositionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vPositionPropertyEClass, VPositionProperty.class, "VPositionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVPositionProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, VPositionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVPositionProperty_Value(), this.getVPositionValue(), null, "value", null, 0, 1, VPositionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sidePropertyEClass, SideProperty.class, "SideProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSideProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, SideProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSideProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, SideProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(barPolicyPropertyEClass, BarPolicyProperty.class, "BarPolicyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBarPolicyProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, BarPolicyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBarPolicyProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, BarPolicyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlPropertiesEClass, UrlProperties.class, "UrlProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUrlProperties_Property(), ecorePackage.getEString(), "property", null, 0, 1, UrlProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUrlProperties_Values(), this.getUrlValue(), null, "values", null, 0, -1, UrlProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatPropertiesEClass, RepeatProperties.class, "RepeatProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatProperties_Property(), ecorePackage.getEString(), "property", null, 0, 1, RepeatProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeatProperties_Values(), this.getRepeatStyleValue(), null, "values", null, 0, -1, RepeatProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiSizePropertyEClass, MultiSizeProperty.class, "MultiSizeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiSizeProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, MultiSizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiSizeProperty_Value(), this.getMultiSizeValue(), null, "value", null, 0, 1, MultiSizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizePropertiesEClass, SizeProperties.class, "SizeProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSizeProperties_Property(), ecorePackage.getEString(), "property", null, 0, 1, SizeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSizeProperties_Values(), this.getSizeValue(), null, "values", null, 0, -1, SizeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strokeLineCapPropertyEClass, StrokeLineCapProperty.class, "StrokeLineCapProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrokeLineCapProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, StrokeLineCapProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strokeLineJoinPropertyEClass, StrokeLineJoinProperty.class, "StrokeLineJoinProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrokeLineJoinProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, StrokeLineJoinProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textAlignmentPropertyEClass, TextAlignmentProperty.class, "TextAlignmentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextAlignmentProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextAlignmentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textOriginPropertyEClass, TextOriginProperty.class, "TextOriginProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextOriginProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextOriginProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(backgroundImagePositionPropertyEClass, BackgroundImagePositionProperty.class, "BackgroundImagePositionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBackgroundImagePositionProperty_Values(), this.getBgPositionValue(), null, "values", null, 0, -1, BackgroundImagePositionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(backgroundImageSizePropertyEClass, BackgroundImageSizeProperty.class, "BackgroundImageSizeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBackgroundImageSizeProperty_Values(), this.getBgSizeValue(), null, "values", null, 0, -1, BackgroundImageSizeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderColorPropertyEClass, BorderColorProperty.class, "BorderColorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderColorProperty_Values(), this.getMultiPaintValue(), null, "values", null, 0, -1, BorderColorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderStylePropertyEClass, BorderStyleProperty.class, "BorderStyleProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderStyleProperty_Values(), this.getBorderStyleValue(), null, "values", null, 0, -1, BorderStyleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderImageSlicePropertyEClass, BorderImageSliceProperty.class, "BorderImageSliceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderImageSliceProperty_Values(), this.getSizeFill(), null, "values", null, 0, -1, BorderImageSliceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapePropertyEClass, ShapeProperty.class, "ShapeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShapeProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, ShapeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textPropertyEClass, TextProperty.class, "TextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textOverrunPropertyEClass, TextOverrunProperty.class, "TextOverrunProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextOverrunProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextOverrunProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(echoCharPropertyEClass, EchoCharProperty.class, "EchoCharProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEchoCharProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, EchoCharProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insetsPropertyEClass, InsetsProperty.class, "InsetsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsetsProperty_Value(), this.getNumberValue(), null, "value", null, 0, -1, InsetsProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horizontalGridLineStrokeDashArrayPropertyEClass, HorizontalGridLineStrokeDashArrayProperty.class, "HorizontalGridLineStrokeDashArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHorizontalGridLineStrokeDashArrayProperty_Value(), this.getNumberValue(), null, "value", null, 0, -1, HorizontalGridLineStrokeDashArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verticalGridLineStrokeDashArrayPropertyEClass, VerticalGridLineStrokeDashArrayProperty.class, "VerticalGridLineStrokeDashArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerticalGridLineStrokeDashArrayProperty_Values(), this.getNumberValue(), null, "values", null, 0, -1, VerticalGridLineStrokeDashArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vPositionValueEClass, VPositionValue.class, "VPositionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVPositionValue_V(), ecorePackage.getEString(), "v", null, 0, 1, VPositionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blurValueEClass, BlurValue.class, "BlurValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlurValue_V(), ecorePackage.getEString(), "v", null, 0, 1, BlurValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealValue_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RealValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlValueEClass, UrlValue.class, "UrlValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUrlValue_Address(), this.getAddressValue(), null, "address", null, 0, 1, UrlValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressValueEClass, AddressValue.class, "AddressValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, AddressValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeValueEClass, SizeValue.class, "SizeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSizeValue_Value(), this.getNumberValue(), null, "value", null, 0, 1, SizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSizeValue_Dimension(), ecorePackage.getEString(), "dimension", null, 0, 1, SizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiSizeValueEClass, MultiSizeValue.class, "MultiSizeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiSizeValue_Values(), this.getSizeValue(), null, "values", null, 0, -1, MultiSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bgPositionValueEClass, BgPositionValue.class, "BgPositionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBgPositionValue_Absx(), this.getSizeValue(), null, "absx", null, 0, 1, BgPositionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgPositionValue_Relx(), ecorePackage.getEString(), "relx", null, 0, 1, BgPositionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBgPositionValue_Absy(), this.getSizeValue(), null, "absy", null, 0, 1, BgPositionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgPositionValue_Rely(), ecorePackage.getEString(), "rely", null, 0, 1, BgPositionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatStyleValueEClass, RepeatStyleValue.class, "RepeatStyleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatStyleValue_V(), ecorePackage.getEString(), "v", null, 0, 1, RepeatStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatStyleValue_V2(), ecorePackage.getEString(), "v2", null, 0, 1, RepeatStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bgSizeValueEClass, BgSizeValue.class, "BgSizeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBgSizeValue_Xsize(), this.getSizeValue(), null, "xsize", null, 0, 1, BgSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgSizeValue_Xauto(), ecorePackage.getEString(), "xauto", null, 0, 1, BgSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBgSizeValue_Ysize(), this.getSizeValue(), null, "ysize", null, 0, 1, BgSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgSizeValue_Yauto(), ecorePackage.getEString(), "yauto", null, 0, 1, BgSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgSizeValue_Predefined(), ecorePackage.getEString(), "predefined", null, 0, 1, BgSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiPaintValueEClass, MultiPaintValue.class, "MultiPaintValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiPaintValue_Values(), this.getPaintValue(), null, "values", null, 0, -1, MultiPaintValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderStyleValueEClass, BorderStyleValue.class, "BorderStyleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderStyleValue_DashStyle(), this.getDashStyleValue(), null, "dashStyle", null, 0, 1, BorderStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyleValue_Location(), ecorePackage.getEString(), "location", null, 0, 1, BorderStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBorderStyleValue_MiterAbs(), this.getNumberValue(), null, "miterAbs", null, 0, 1, BorderStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyleValue_MiterPredefined(), ecorePackage.getEString(), "miterPredefined", null, 0, 1, BorderStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyleValue_LineCap(), ecorePackage.getEString(), "lineCap", null, 0, 1, BorderStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dashStyleValueEClass, DashStyleValue.class, "DashStyleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDashStyleValue_V(), ecorePackage.getEString(), "v", null, 0, 1, DashStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeFillEClass, SizeFill.class, "SizeFill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSizeFill_Value(), this.getMultiSizeValue(), null, "value", null, 0, 1, SizeFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSizeFill_Fill(), ecorePackage.getEString(), "fill", null, 0, 1, SizeFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontValueEClass, FontValue.class, "FontValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontValue_StyleOrWeightString(), ecorePackage.getEString(), "styleOrWeightString", null, 0, 1, FontValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontValue_Weight(), this.getIntegerProperty(), null, "weight", null, 0, 1, FontValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontValue_Size(), this.getSizeValue(), null, "size", null, 0, 1, FontValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontValue_Family(), this.getFontFamily(), null, "family", null, 0, 1, FontValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontStyleValueEClass, FontStyleValue.class, "FontStyleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontStyleValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, FontStyleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontWeightValueEClass, FontWeightValue.class, "FontWeightValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontWeightValue_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, FontWeightValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontWeightValue_ValueInt(), this.getNumberValue(), null, "valueInt", null, 0, 1, FontWeightValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontFamilyEClass, FontFamily.class, "FontFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontFamily_Value(), ecorePackage.getEString(), "value", null, 0, 1, FontFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paintValueEClass, PaintValue.class, "PaintValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linearGradientEClass, LinearGradient.class, "LinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinearGradient_X1(), this.getSizeValue(), null, "x1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearGradient_Y1(), this.getSizeValue(), null, "y1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearGradient_X2(), this.getSizeValue(), null, "x2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearGradient_Y2(), this.getSizeValue(), null, "y2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearGradient_Stops(), this.getStopValue(), null, "stops", null, 0, -1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radialGradientEClass, RadialGradient.class, "RadialGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRadialGradient_Cx(), this.getSizeValue(), null, "cx", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Cy(), this.getSizeValue(), null, "cy", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Radius(), this.getSizeValue(), null, "radius", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Fx(), this.getSizeValue(), null, "fx", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Fy(), this.getSizeValue(), null, "fy", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Stops(), this.getStopValue(), null, "stops", null, 0, -1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stopValueEClass, StopValue.class, "StopValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStopValue_Pos(), this.getSizeValue(), null, "pos", null, 0, 1, StopValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStopValue_Color(), this.getColorValue(), null, "color", null, 0, 1, StopValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorValueEClass, ColorValue.class, "ColorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedColorEClass, NamedColor.class, "NamedColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedColor_Value(), ecorePackage.getEString(), "value", null, 0, 1, NamedColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGBColor_Hex(), ecorePackage.getEString(), "hex", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_R(), this.getIntegerValue(), null, "r", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_G(), this.getIntegerValue(), null, "g", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_B(), this.getIntegerValue(), null, "b", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_Rp(), this.getIntegerValue(), null, "rp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_Gp(), this.getIntegerValue(), null, "gp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_Bp(), this.getIntegerValue(), null, "bp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRGBColor_Alpha(), this.getNumberValue(), null, "alpha", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hsbColorEClass, HSBColor.class, "HSBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHSBColor_Hue(), this.getNumberValue(), null, "hue", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHSBColor_Saturation(), this.getNumberValue(), null, "saturation", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHSBColor_Brightness(), this.getNumberValue(), null, "brightness", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHSBColor_Alpha(), this.getNumberValue(), null, "alpha", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFunctionEClass, ColorFunction.class, "ColorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorFunction_Orig(), this.getColorValue(), null, "orig", null, 0, 1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorFunction_Mod(), this.getNumberValue(), null, "mod", null, 0, 1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorFunction_StopNumbers(), this.getNumberValue(), null, "stopNumbers", null, 0, -1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorFunction_StopColors(), this.getColorValue(), null, "stopColors", null, 0, -1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(booleanValueEEnum, BooleanValue.class, "BooleanValue");
    addEEnumLiteral(booleanValueEEnum, BooleanValue.TRUE);
    addEEnumLiteral(booleanValueEEnum, BooleanValue.FALSE);

    initEEnum(hPositionValueEEnum, HPositionValue.class, "HPositionValue");
    addEEnumLiteral(hPositionValueEEnum, HPositionValue.LEFT);
    addEEnumLiteral(hPositionValueEEnum, HPositionValue.CENTER);
    addEEnumLiteral(hPositionValueEEnum, HPositionValue.RIGHT);
    addEEnumLiteral(hPositionValueEEnum, HPositionValue.LEADING);
    addEEnumLiteral(hPositionValueEEnum, HPositionValue.TRAILING);

    // Create resource
    createResource(eNS_URI);
  }

} //JFXCssPackageImpl
