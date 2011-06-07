package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.e4.ui.workbench.jfx.AbstractPartRenderer;
import at.bestsolution.e4.ui.workbench.jfx.IRendererFactory;


@SuppressWarnings("restriction")
public class WorkbenchRendererFactory implements IRendererFactory {
	private IEclipseContext context;
	
	private WBWRenderer windowRenderer;
	private SashRenderer sashRenderer;
	private ContributedPartRenderer partRenderer;
	private TrimBarRenderer trimRenderer;
	private ToolbarRenderer toolbarRenderer;
	private ToolItemRenderer toolitemRenderer;
	
	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if( uiElement instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(WBWRenderer.class, context);
			}
			return windowRenderer;
		} else if( uiElement instanceof MPartSashContainer ) {
			if( sashRenderer == null ) {
				sashRenderer = ContextInjectionFactory.make(SashRenderer.class, context);
			}
			return sashRenderer;
		} else if( uiElement instanceof MPart ) {
			if( partRenderer == null ) {
				partRenderer = ContextInjectionFactory.make(ContributedPartRenderer.class, context);
			}
			return partRenderer;
		} else if( uiElement instanceof MTrimBar ) {
			if( trimRenderer == null ) {
				trimRenderer = ContextInjectionFactory.make(TrimBarRenderer.class, context); 
			}
			return trimRenderer;
		} else if( uiElement instanceof MToolBar ) {
			if( toolbarRenderer == null ) {
				toolbarRenderer = ContextInjectionFactory.make(ToolbarRenderer.class, context);
			}
			return toolbarRenderer;
		} else if( uiElement instanceof MToolItem ) {
			if( toolitemRenderer == null ) {
				toolitemRenderer = ContextInjectionFactory.make(ToolItemRenderer.class, context);
			}
			return toolitemRenderer;
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@PostConstruct
	void init(IEclipseContext context) {
		this.context = context;
	}
}
