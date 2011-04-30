package at.bestsolution.e4.ui.workbench.renderers.swing;

import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.e4.ui.workbench.swing.AbstractPartRenderer;


@SuppressWarnings("restriction")
public abstract class SwingPartRenderer extends AbstractPartRenderer {
	
	public void bindWidget(MUIElement me, Object widget) {
		me.setWidget(widget);
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
