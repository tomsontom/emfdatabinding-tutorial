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

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Represents a single selection observable value for a {@link JTabbedPane}
 *
 * @since 1.0
 */
public class TabbedPaneSingleSelectionObservableValue extends SingleSelectionObservableValue {

	private ChangeListener changeListener;

	/**
	 * Observe the selection of a TabbedPane
	 *
	 * @param tabbedPane
	 *            the control whose selection index is observed
	 * @since 1.0
	 */
	public TabbedPaneSingleSelectionObservableValue(JTabbedPane tabbedPane) {
		super(tabbedPane);
	}

	private JTabbedPane getTabbedPane() {
		return (JTabbedPane) getContainer();
	}

	protected void doAddSelectionListener(final Runnable runnable) {
		changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				runnable.run();
			}
		};
		getTabbedPane().getModel().addChangeListener(changeListener);
	}

	protected int doGetSelectionIndex() {
		return getTabbedPane().getSelectedIndex();
	}

	protected void doSetSelectionIndex(int index) {
		getTabbedPane().setSelectedIndex(index);
	}

	public synchronized void dispose() {
		super.dispose();
		if (changeListener != null) {
			getTabbedPane().getModel().removeChangeListener(changeListener);
		}
	}
}