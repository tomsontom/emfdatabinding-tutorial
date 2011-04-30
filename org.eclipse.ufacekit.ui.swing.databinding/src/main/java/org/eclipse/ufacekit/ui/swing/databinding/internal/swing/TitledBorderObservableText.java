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

import javax.swing.border.TitledBorder;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe title of TitledBorder.
 * 
 */
public class TitledBorderObservableText extends AbstractSwingObservableValue {

	private final TitledBorder titledBorder;

	/**
	 * @param titledBorder
	 */
	public TitledBorderObservableText(TitledBorder titledBorder) {
		super(null);
		this.titledBorder = titledBorder;
	}

	/**
	 * @param realm
	 * @param titledBorder
	 */
	public TitledBorderObservableText(Realm realm, TitledBorder titledBorder) {
		super(realm, null);
		this.titledBorder = titledBorder;
	}

	public void doSetValue(final Object value) {
		String oldValue = (String) titledBorder.getTitle();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		titledBorder.setTitle(newValue);
		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return titledBorder.getTitle();
	}

	public Object getValueType() {
		return String.class;
	}

}
