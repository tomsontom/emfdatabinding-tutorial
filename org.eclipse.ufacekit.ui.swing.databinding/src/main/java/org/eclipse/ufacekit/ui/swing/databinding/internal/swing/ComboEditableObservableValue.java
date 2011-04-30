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

import javax.swing.JComboBox;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe editable property of of a
 * Swing JComboBox.
 *
 * @since 1.0
 */
public class ComboEditableObservableValue extends AbstractSwingObservableValue {
	private JComboBox combo;

	/**
	 * @param combo
	 */
	public ComboEditableObservableValue(JComboBox combo) {
		super(combo);
		this.combo = combo;
	}

	/**
	 * @param realm
	 * @param combo
	 */
	public ComboEditableObservableValue(Realm realm, JComboBox combo) {
		super(realm, combo);
		this.combo = combo;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.AbstractObservableValue
	 * #doGetValue()
	 */
	protected Object doGetValue() {
		return (combo.isEditable()) ? Boolean.TRUE : Boolean.FALSE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.IObservableValue#getValueType
	 * ()
	 */
	public Object getValueType() {
		return Boolean.TYPE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.AbstractObservableValue
	 * #doSetValue(java.lang.Object)
	 */
	protected void doSetValue(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Parameter value was null."); //$NON-NLS-1$
		}

		Boolean oldValue = Boolean.valueOf(combo.isEditable());
		Boolean newValue = (Boolean) value;

		combo.setEditable(newValue.booleanValue());

		if (!oldValue.equals(newValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}
}
