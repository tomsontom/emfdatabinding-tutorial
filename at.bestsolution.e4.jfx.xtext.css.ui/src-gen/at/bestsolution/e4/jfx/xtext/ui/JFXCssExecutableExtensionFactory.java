/*
 * generated by Xtext
 */
package at.bestsolution.e4.jfx.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JFXCssExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return at.bestsolution.e4.jfx.xtext.ui.internal.JFXCssActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return at.bestsolution.e4.jfx.xtext.ui.internal.JFXCssActivator.getInstance().getInjector("at.bestsolution.e4.jfx.xtext.JFXCss");
	}
	
}