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

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.core.databinding.observable.Diffs;

/**
 * ISwingObservableValue implementation to observe value of JList.
 *
 * @since 1.0
 */
public class ListObservableValue extends AbstractSwingObservableValue {

	private final JList list;

	private boolean updating = false;

	private Object currentValue;

	private ListSelectionListener listener;

	/**
	 * @param list
	 */
	public ListObservableValue(JList list) {
		super(list);
		this.list = list;
		this.currentValue = (String) doGetValue();
		if ((list.getSelectionMode() != ListSelectionModel.SINGLE_SELECTION))
			throw new IllegalArgumentException(
					"ListSelectionModel.SINGLE_SELECTION JList Selection Mode"); //$NON-NLS-1$

		listener = new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent listselectionevent) {
				if (!updating) {
					Object oldValue = currentValue;
					currentValue = (String) doGetValue();
					fireValueChange(Diffs.createValueDiff(oldValue, currentValue));
				}
			}
		};
		list.addListSelectionListener(listener);
	}

	public void doSetValue(Object value) {
		Object oldValue = list.getSelectedValue();
		try {
			updating = true;
			list.setSelectedValue(value, false);
			currentValue = value;
		} finally {
			updating = false;
		}
		fireValueChange(Diffs.createValueDiff(oldValue, value));
	}

	public Object doGetValue() {
		return list.getSelectedValue();
	}

	public Object getValueType() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.AbstractObservableValue
	 * #dispose()
	 */
	public synchronized void dispose() {
		super.dispose();
		if (listener != null) {
			list.removeListSelectionListener(listener);
		}
	}
}
