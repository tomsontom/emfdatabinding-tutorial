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

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe if button (JCheckBox,
 * JButton....) is selected or not.
 *
 * @since 1.0
 */
public class ButtonObservableValue extends AbstractSwingObservableValue {

	private final AbstractButton button;
	private boolean selectionValue;

	/**
	 * Flag to track when the model is updating the widget. When
	 * <code>true</code> the handlers for the Swing events should not process
	 * the event itemStateChanged into doSetValue method.
	 */
	private boolean updating = false;

	private ItemListener updateListener = new ItemListener() {
		public void itemStateChanged(ItemEvent itemevent) {
			if (updating)
				return;
			int stateChange = itemevent.getStateChange();
			if (stateChange != ItemEvent.DESELECTED && stateChange != ItemEvent.SELECTED) {
				// it's not selection, event, ignore it.
				return;
			}
			boolean oldSelectionValue = selectionValue;
			selectionValue = (stateChange == ItemEvent.SELECTED);
			// selectionValue = (stateChange == ItemEvent.SELECTED);
			// boolean oldSelectionValue = !selectionValue;
			notifyIfChanged(oldSelectionValue, selectionValue);
		}
	};

	/**
	 * @param button
	 */
	public ButtonObservableValue(AbstractButton button) {
		super(button);
		this.button = button;
		init();
	}

	/**
	 * @param realm
	 * @param button
	 */
	public ButtonObservableValue(Realm realm, AbstractButton button) {
		super(realm, button);
		this.button = button;
		init();
	}

	private void init() {
		this.selectionValue = button.isSelected();
		// button.addListener(SWT.Selection, updateListener);
		// button.addListener(SWT.DefaultSelection, updateListener);
		button.addItemListener(updateListener);
	}

	public void doSetValue(final Object value) {
		try {
			updating = true;
			boolean oldSelectionValue = selectionValue;
			selectionValue = value == null ? false : ((Boolean) value).booleanValue();
			button.setSelected(selectionValue);
			notifyIfChanged(oldSelectionValue, selectionValue);
		} finally {
			updating = false;
		}
	}

	public Object doGetValue() {
		return button.isSelected() ? Boolean.TRUE : Boolean.FALSE;
	}

	public Object getValueType() {
		return Boolean.TYPE;
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

		// if (!button.isDisposed()) {
		// button.removeListener(SWT.Selection, updateListener);
		// button.removeListener(SWT.DefaultSelection, updateListener);
		// }
		button.removeItemListener(updateListener);
	}

	/**
	 * Notifies consumers with a value change event only if a change occurred.
	 *
	 * @param oldValue
	 * @param newValue
	 */
	private void notifyIfChanged(boolean oldValue, boolean newValue) {
		if (oldValue != newValue) {
			fireValueChange(Diffs.createValueDiff(oldValue ? Boolean.TRUE : Boolean.FALSE, newValue ? Boolean.TRUE : Boolean.FALSE));
		}
	}
}
