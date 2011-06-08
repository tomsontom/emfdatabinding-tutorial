package at.bestsolution.e4.ui.workbench.renderers.jfx;

import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.e4.ui.workbench.jfx.AbstractPartRenderer;


@SuppressWarnings("restriction")
public abstract class JFXPartRenderer extends AbstractPartRenderer {
	
	protected void setCSSInfo(MUIElement me, Object widget) {
		if( !(widget instanceof Node) ) {
			return;
		}
		// Set up the CSS Styling parameters; id & class
//		IEclipseContext ctxt = getContext(me);
//		if (ctxt == null)
//			ctxt = getContext(me);
		
		// Put all the tags into the class string
//		EObject eObj = (EObject) me;
//		String cssClassStr = 'M' + eObj.eClass().getName();
//		for (String tag : me.getTags())
//			cssClassStr += ' ' + tag;

		// this will trigger style()
		String id = me.getElementId();
		if (id != null) {
			id = id.replace(".", "-"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		
		Node n = (Node) widget;
		n.setId(id);
	}
	
	public void bindWidget(MUIElement me, Object widget) {
		me.setWidget(widget);
		
		setCSSInfo(me, widget);
	}
	
	public void hookControllerLogic(MUIElement me) {
		
	}
	
	public void processContents(MElementContainer<MUIElement> container) {
		// EMF gives us null lists if empty
		if (container == null)
			return;

		// Process any contents of the newly created ME
		List<MUIElement> parts = container.getChildren();
		if (parts != null) {
			// loading a legacy app will add children to the window while it is
			// being rendered.
			// this is *not* the correct place for this
			// hope that the ADD event will pick up the new part.
			IPresentationEngine renderer = (IPresentationEngine) context
					.get(IPresentationEngine.class.getName());
			MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
			for (int i = 0; i < plist.length; i++) {
				MUIElement childME = plist[i];
				renderer.createGui(childME);
			}
		}
	}
}
