/*******************************************************************************
 * Copyright (c) 2009 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 264286)
 *******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JComboBox;
import javax.swing.JList;

import org.eclipse.core.databinding.property.value.IValueProperty;

/**
 * @since 3.3
 * 
 */
public final class WidgetSingleSelectionValueProperty extends
		WidgetDelegatingValueProperty {
	private IValueProperty combo;
	private IValueProperty list;
	private IValueProperty table;

	/**
	 * 
	 */
	public WidgetSingleSelectionValueProperty() {
		super(Object.class);
	}

	protected IValueProperty doGetDelegate(Object source) {
		if (source instanceof JComboBox) {
			if (combo == null)
				combo = new JComboBoxSingleSelectionValueProperty();
			return combo;
		}
		if (source instanceof JList) {
			if (list == null)
				list = new JListSingleSelectionValueProperty();
			return list;
		}
//		if (source instanceof Table) {
//			if (table == null)
//				table = new TableSingleSelectionIndexProperty();
//			return table;
//		}
		throw notSupported(source);
	}
}