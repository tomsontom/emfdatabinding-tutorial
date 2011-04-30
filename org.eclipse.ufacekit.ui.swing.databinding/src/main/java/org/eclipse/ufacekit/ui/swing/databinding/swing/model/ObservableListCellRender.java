/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.swing.model;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 * Renderer used in conjunction with an observable list model rendering the
 * informations
 *
 * @param <M>
 *            the model object type
 */
public class ObservableListCellRender<M> extends DefaultListCellRenderer {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ObservableListModel<M> model;
	private ILabelDelegate<M> delegate;

	/**
	 * Create a new cell renderer
	 *
	 * @param model
	 *            the list model
	 * @param delegate
	 *            the delegate to use
	 */
	public ObservableListCellRender(ObservableListModel<M> model, ILabelDelegate<M> delegate) {
		this.model = model;
		this.delegate = delegate;
	}

	@SuppressWarnings("unchecked")
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		return super.getListCellRendererComponent(list, delegate.getText((M) value, model.getMaps()), index, isSelected, cellHasFocus);
	}

}
