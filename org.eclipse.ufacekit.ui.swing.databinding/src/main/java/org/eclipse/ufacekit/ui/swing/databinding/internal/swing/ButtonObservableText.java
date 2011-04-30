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

import javax.swing.AbstractButton;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe text button.
 *
 * @since 1.0
 */
public class ButtonObservableText extends AbstractSwingObservableValue {

	private final AbstractButton button;

	/**
	 * Observable a text of a button
	 *
	 * @param button
	 *            the button
	 */
	public ButtonObservableText(AbstractButton button) {
		super(button);
		this.button = button;
	}

	/**
	 * Observable a text of a button
	 *
	 * @param realm
	 *            the realm
	 * @param button
	 */
	public ButtonObservableText(Realm realm, AbstractButton button) {
		super(realm, button);
		this.button = button;
	}

	public void doSetValue(final Object value) {
		String oldValue = button.getText();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		button.setText(newValue);

		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return button.getText();
	}

	public Object getValueType() {
		return String.class;
	}

}
