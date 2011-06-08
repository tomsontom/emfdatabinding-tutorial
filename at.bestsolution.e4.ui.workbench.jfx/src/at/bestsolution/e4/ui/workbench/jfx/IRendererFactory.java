package at.bestsolution.e4.ui.workbench.jfx;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

public interface IRendererFactory {
	public AbstractPartRenderer getRenderer(MUIElement uiElement);
}
