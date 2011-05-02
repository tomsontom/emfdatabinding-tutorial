/*******************************************************************************
 * Copyright (c) 2011, BestSolution.at and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - Initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.ui.workbench.swing;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

public interface IRendererFactory {
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent);
}
