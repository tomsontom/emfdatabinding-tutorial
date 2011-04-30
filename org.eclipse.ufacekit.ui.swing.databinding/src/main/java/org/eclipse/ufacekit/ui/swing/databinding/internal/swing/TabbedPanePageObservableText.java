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

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.ufacekit.ui.swing.custom.JTabbedPanePage;

/**
 * Observe the text property of a TabbedPanePage
 *
 * @since 1.0
 */
public class TabbedPanePageObservableText extends AbstractSwingObservableValue {

	private final JTabbedPanePage tabbedPanePage;

	/**
	 * Create observable of the TabbedPanePage title
	 *
	 * @param tabbedPanePage
	 *            the control whose title is observed
	 */
	public TabbedPanePageObservableText(JTabbedPanePage tabbedPanePage) {
		super(tabbedPanePage);
		this.tabbedPanePage = tabbedPanePage;
	}

	/**
	 * Create observable of the TabbedPanePage title
	 *
	 * @param realm
	 *            the realm to sync with the UI thread
	 * @param tabbedPanePage
	 *            the control whose title is observed
	 */
	public TabbedPanePageObservableText(Realm realm, JTabbedPanePage tabbedPanePage) {
		super(realm, tabbedPanePage);
		this.tabbedPanePage = tabbedPanePage;
	}

	public void doSetValue(final Object value) {
		String oldValue = tabbedPanePage.getText();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		tabbedPanePage.setText(newValue);

		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return tabbedPanePage.getText();
	}

	public Object getValueType() {
		return String.class;
	}

}
