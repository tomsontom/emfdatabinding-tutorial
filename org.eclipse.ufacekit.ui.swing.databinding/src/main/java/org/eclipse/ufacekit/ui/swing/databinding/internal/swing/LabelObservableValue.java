/*******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Brad Reynolds - bug 164653
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import javax.swing.JLabel;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * Observe the text attribute of a label
 *
 * @since 1.0
 *
 */
public class LabelObservableValue extends AbstractSwingObservableValue {

	private final JLabel label;

	/**
	 * Create an observable for the text of label
	 *
	 * @param label
	 *            the label whose text is observed
	 * @since 1.0
	 */
	public LabelObservableValue(JLabel label) {
		super(label);
		this.label = label;
	}

	/**
	 * Create an observable for the text of label
	 *
	 * @param realm
	 *            the realm to sync to ui thread
	 * @param label
	 *            the label whose text is observed
	 * @since 1.0
	 */
	public LabelObservableValue(Realm realm, JLabel label) {
		super(realm, label);
		this.label = label;
	}

	public void doSetValue(final Object value) {
		String oldValue = label.getText();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		label.setText(newValue);

		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return label.getText();
	}

	public Object getValueType() {
		return String.class;
	}

}
