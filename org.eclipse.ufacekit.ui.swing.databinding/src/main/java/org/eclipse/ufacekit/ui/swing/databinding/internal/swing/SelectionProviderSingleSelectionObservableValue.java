/*******************************************************************************
 * Copyright (c) 2007, Angelo Zerr and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Container;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.core.databinding.observable.Diffs;

/**
 * Observe the selection of a widget which is a selection provider
 *
 * @since 1.0
 *
 */
public abstract class SelectionProviderSingleSelectionObservableValue extends AbstractSwingObservableValue {
	private final ListSelectionModel model;
	private ListSelectionListener selectionListener;
	private boolean updating = false;
	private Object currentSelection;

	/**
	 * Derived classes must call {@link #registerSelectionListener()} when they
	 * are fully initialised to register the listener
	 *
	 * @param container
	 *            the component to observe
	 * @param model
	 *            the list model backing the model of the column
	 *
	 * @since 1.0
	 */
	private SelectionProviderSingleSelectionObservableValue(Container container, ListSelectionModel model) {
		super(container);
		this.model = model;
	}

	/**
	 * Observe the selection of an JList
	 *
	 * @param list
	 *            the list whose selection is observed
	 * @since 1.0
	 */
	public SelectionProviderSingleSelectionObservableValue(JList list) {
		this(list, list.getSelectionModel());
	}

	/**
	 * Observe the selection of an JTable
	 *
	 * @param table
	 *            the table whose selection is observed
	 * @since 1.0
	 */
	public SelectionProviderSingleSelectionObservableValue(JTable table) {
		this(table, table.getSelectionModel());
	}

	public synchronized void dispose() {
		super.dispose();
		if (selectionListener != null) {
			model.removeListSelectionListener(selectionListener);
		}
	}

	public Object getValueType() {
		return null;
	}

	/**
	 * Sets the selection to the provided <code>value</code>. Value change
	 * events are fired after selection is set in the selection provider.
	 *
	 * @param value
	 *            object to set as selected, <code>null</code> if wanting to
	 *            remove selection
	 */
	public void doSetValue(final Object value) {
		try {
			updating = true;

			Object oldSelection = currentSelection;
			doSetSelectedValue(value);

			currentSelection = doGetValue();
			if (!Util.equals(oldSelection, currentSelection)) {
				fireValueChange(Diffs.createValueDiff(oldSelection, currentSelection));
			}
		} finally {
			updating = false;
		}
	}

	/**
	 * Sets the selected value without having to raise any events as that is
	 * done by the {@link #doSetValue(Object)} method.
	 *
	 * @param value
	 *            the value to set
	 */
	protected abstract void doSetSelectedValue(Object value);

	/**
	 * Calls {@link #doGetValue()} and adds the selection listener to the model
	 * so this method should only be called after the object is fully
	 * initialized.
	 */
	protected void registerSelectionListener() {
		this.currentSelection = doGetValue();

		selectionListener = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				if (!updating) {
					Object oldSelection = currentSelection;
					currentSelection = doGetValue();
					fireValueChange(Diffs.createValueDiff(oldSelection, currentSelection));
				}
			}
		};
		model.addListSelectionListener(selectionListener);
	}
}
