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

import javax.swing.JComponent;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * Abstract class which is able to observe single selection.
 *
 * @since 1.0
 */
public abstract class SingleSelectionObservableValue extends AbstractSwingObservableValue {

	private boolean updating;
	private int currentSelection;

	/**
	 * Create a selection index observable for the given component
	 *
	 * @param component
	 *            the component whose single selection is observed
	 * @since 1.0
	 */
	public SingleSelectionObservableValue(JComponent component) {
		super(component);
		init();
	}

	/**
	 * Create a selection index observable for the given component
	 *
	 * @param realm
	 *            the realm to sync with UI thread
	 * @param component
	 *            the component whose selection index is observed
	 * @since 1.0
	 */
	public SingleSelectionObservableValue(Realm realm, JComponent component) {
		super(realm, component);
		init();
	}

	private void init() {
		currentSelection = doGetSelectionIndex();
		doAddSelectionListener(new Runnable() {
			public void run() {
				if (!updating) {
					int newSelection = doGetSelectionIndex();
					notifyIfChanged(currentSelection, newSelection);
					currentSelection = newSelection;
				}
			}
		});
	}

	/**
	 * @param runnable
	 */
	protected abstract void doAddSelectionListener(Runnable runnable);

	public void doSetValue(Object value) {
		try {
			updating = true;
			int intValue = ((Integer) value).intValue();
			doSetSelectionIndex(intValue);
			notifyIfChanged(currentSelection, intValue);
			currentSelection = intValue;
		} finally {
			updating = false;
		}
	}

	/**
	 * @param intValue
	 *            the selection index
	 */
	protected abstract void doSetSelectionIndex(int intValue);

	public Object doGetValue() {
		return Integer.valueOf(doGetSelectionIndex());
	}

	/**
	 * @return the selection index
	 */
	protected abstract int doGetSelectionIndex();

	public Object getValueType() {
		return Integer.TYPE;
	}

	private void notifyIfChanged(int oldValue, int newValue) {
		if (oldValue != newValue) {
			fireValueChange(Diffs.createValueDiff(Integer.valueOf(oldValue), Integer.valueOf(newValue)));
		}
	}
}
