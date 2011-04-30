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

import javax.swing.JComboBox;

/**
 * ISwingObservableValue implementation to observe selection (single) of
 * JComboBox.
 *
 * @since 1.0
 */
public class ComboSingleSelectionObservableValue extends SingleSelectionObservableValue {

	private ItemListener itemListener;

	/**
	 * Observe the selection in a combo
	 *
	 * @param comboBox
	 *            the combo to observe
	 * @since 1.0
	 */
	public ComboSingleSelectionObservableValue(JComboBox comboBox) {
		super(comboBox);
	}

	private JComboBox getCombo() {
		return (JComboBox) getContainer();
	}

	protected void doAddSelectionListener(final Runnable runnable) {
		itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				runnable.run();
			}
		};
		getCombo().addItemListener(itemListener);
	}

	protected int doGetSelectionIndex() {
		return getCombo().getSelectedIndex();
	}

	protected void doSetSelectionIndex(int index) {
		getCombo().setSelectedIndex(index);
	}

	public synchronized void dispose() {
		super.dispose();
		if (itemListener != null) {
			getCombo().removeItemListener(itemListener);
		}
	}
}
