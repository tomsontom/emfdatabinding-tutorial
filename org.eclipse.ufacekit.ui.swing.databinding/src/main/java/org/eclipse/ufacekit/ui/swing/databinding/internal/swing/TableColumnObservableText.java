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

import javax.swing.table.TableColumn;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe text of table column.
 * 
 */
public class TableColumnObservableText extends AbstractSwingObservableValue {

	private final TableColumn tableColumn;

	/**
	 * @param tableColumn
	 */
	public TableColumnObservableText(TableColumn tableColumn) {
		super(null);
		this.tableColumn = tableColumn;
	}

	/**
	 * @param realm
	 * @param tableColumn
	 */
	public TableColumnObservableText(Realm realm, TableColumn tableColumn) {
		super(realm, null);
		this.tableColumn = tableColumn;
	}

	public void doSetValue(final Object value) {
		String oldValue = (String) tableColumn.getIdentifier();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		tableColumn.setHeaderValue(newValue);
		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return tableColumn.getIdentifier();
	}

	public Object getValueType() {
		return String.class;
	}

}
