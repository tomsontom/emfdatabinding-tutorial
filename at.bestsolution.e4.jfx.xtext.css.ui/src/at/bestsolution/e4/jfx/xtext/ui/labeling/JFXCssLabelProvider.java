/*
* generated by Xtext
*/
package at.bestsolution.e4.jfx.xtext.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import at.bestsolution.e4.jfx.xtext.jFXCss.Definition;
import at.bestsolution.e4.jfx.xtext.jFXCss.Selector;
import at.bestsolution.e4.jfx.xtext.jFXCss.SimpleSelector;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class JFXCssLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public JFXCssLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	/*public String text(Definition definition) {
		StringBuilder b = new StringBuilder();
		boolean flag = false;
		for( Selector selector : definition.getSelector() ) {
			if( flag ) {
				b.append(", ");
			}
			flag = true;
			for( SimpleSelector s : selector.getSimpleSelector() ) {
				if( s.getElement() != null ) {
					b.append(s.getElement());
				}
				
				if( s.getId() != null ) {
					b.append("#" + s.getId());
				}
				
				if( s.getClass_() != null ) {
					b.append("." + s.getClass_());
				}
				
				for( ElementPseudoClass cl: s.getPseudoClass() ) {
					b.append(":" + cl.getValue());
				}
				
				b.append(" ");
			}
		}

		return b.toString();
	}*/

/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
