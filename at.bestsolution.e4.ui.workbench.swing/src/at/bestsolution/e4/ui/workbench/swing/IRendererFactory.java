package at.bestsolution.e4.ui.workbench.swing;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

public interface IRendererFactory {
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent);
}
