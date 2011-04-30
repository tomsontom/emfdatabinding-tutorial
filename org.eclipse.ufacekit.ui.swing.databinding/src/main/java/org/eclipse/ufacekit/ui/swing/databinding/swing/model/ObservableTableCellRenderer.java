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

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Create a new renderer
 *
 * @param <M>
 *            the domain model type
 */
public class ObservableTableCellRenderer<M> extends DefaultTableCellRenderer {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ObservableListTableModel model;
	private ILabelDelegate<M> delegate;

	/**
	 * Create a new renderer instance
	 *
	 * @param model
	 *            the model
	 * @param delegate
	 *            the delegate
	 */
	public ObservableTableCellRenderer(ObservableListTableModel model, ILabelDelegate<M> delegate) {
		this.model = model;
		this.delegate = delegate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		return super.getTableCellRendererComponent(table, delegate.getText((M) value, model.getMaps()), isSelected, hasFocus, row, column);
	}
}
