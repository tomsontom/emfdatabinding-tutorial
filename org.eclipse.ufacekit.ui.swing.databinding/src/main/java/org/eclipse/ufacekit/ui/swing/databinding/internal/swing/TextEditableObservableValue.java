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

import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe editable property of
 * of a Swing JTextComponent.
 *
 */
public class TextEditableObservableValue extends AbstractSwingObservableValue {
	private JTextComponent text;

	/**
	 * @param text
	 */
	public TextEditableObservableValue(JTextComponent text) {
		super(text);
		this.text = text;
	}

	/**
	 * @param realm
	 * @param text
	 */
	public TextEditableObservableValue(Realm realm, JTextComponent text) {
		super(realm, text);
		this.text = text;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doGetValue()
	 */
	protected Object doGetValue() {
		return (text.isEditable()) ? Boolean.TRUE : Boolean.FALSE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue#getValueType()
	 */
	public Object getValueType() {
		return Boolean.TYPE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doSetValue(java.lang.Object)
	 */
	protected void doSetValue(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Parameter value was null."); //$NON-NLS-1$
		}

		Boolean oldValue = Boolean.valueOf(text.isEditable());
		Boolean newValue = (Boolean) value;

		text.setEditable(newValue.booleanValue());

		if (!oldValue.equals(newValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}
}
