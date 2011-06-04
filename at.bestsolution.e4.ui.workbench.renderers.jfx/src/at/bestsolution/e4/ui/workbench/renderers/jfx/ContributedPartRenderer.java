package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;


@SuppressWarnings("restriction")
public class ContributedPartRenderer extends JFXPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		BorderPane pane = new BorderPane();
		
		if( element.getElementId() != null ) {
			pane.setId(element.getElementId());
		}
		
		MPart part = (MPart) element;
		IEclipseContext localContext = part.getContext();
		localContext.set(BorderPane.class, pane);
		
		IContributionFactory contributionFactory = (IContributionFactory) localContext
				.get(IContributionFactory.class.getName());
		Object newPart = contributionFactory.create(part.getContributionURI(),
				localContext);
		part.setObject(newPart);
		
		return pane;
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement,
			MUIElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}

}
