
package at.bestsolution.e4.jfx.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JFXCssStandaloneSetup extends JFXCssStandaloneSetupGenerated{

	public static void doSetup() {
		new JFXCssStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

