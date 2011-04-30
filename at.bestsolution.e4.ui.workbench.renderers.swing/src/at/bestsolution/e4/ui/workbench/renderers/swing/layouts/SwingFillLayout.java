/*******************************************************************************
 * Copyright (c) 2008, BestSolution.at and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     James Strachan <james.strachan@iona.com> - Initial API and implementation
 *     Tom Schindl <tom.schindl@bestsolution.at> - Initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.ui.workbench.renderers.swing.layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 * SWT-FillLayout reimplementation for Swing
 *
 * @since 1.0
 *
 */
public class SwingFillLayout implements LayoutManager {
	public void addLayoutComponent(String name, Component comp) {

	}

	public void layoutContainer(Container parent) {
		int componentCount = parent.getComponentCount();
		int width = (componentCount > 0 ? parent.getWidth() / componentCount : parent.getWidth());
		int height = parent.getHeight();
		Component components[] = parent.getComponents();
		for (int i = 0; i < components.length; i++) {
			int x = 0;
			components[i].setBounds(x, 0, width, height);
			x += width;
		}
	}

	public Dimension minimumLayoutSize(Container parent) {
		return preferredLayoutSize(parent);
	}

	public Dimension preferredLayoutSize(Container parent) {
		Dimension dim = new Dimension();

		Component components[] = parent.getComponents();
		for (int i = 0; i < components.length; i++) {
			dim.width += components[i].getPreferredSize().width;
			int height = components[i].getPreferredSize().height;
			if (dim.height < height) {
				dim.height = height;
			}
		}

		return dim;
	}

	public void removeLayoutComponent(Component comp) {

	}
}
