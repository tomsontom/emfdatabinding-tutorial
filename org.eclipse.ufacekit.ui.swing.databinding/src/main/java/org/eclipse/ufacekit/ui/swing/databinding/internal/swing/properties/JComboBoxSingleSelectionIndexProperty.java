/*******************************************************************************
 * Copyright (c) 2008, 2009 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 194734)
 ******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public class JComboBoxSingleSelectionIndexProperty extends WidgetIntValueProperty<JComboBoxSingleSelectionIndexProperty.SelectionTypes, JComboBox> {
	public enum SelectionTypes implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}

	/**
	 * 
	 */
	public JComboBoxSingleSelectionIndexProperty() {
		super(new SelectionTypes[] { SelectionTypes.Selection });
	}

	int doGetIntValue(Object source) {
		return ((JComboBox) source).getSelectedIndex();
	}

	void doSetIntValue(Object source, int value) {
		((JComboBox) source).setSelectedIndex(value);
	}

	public String toString() {
		return "Combo.selectionIndex <int>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(final SelectionTypes type, final JComboBox widget, final Delegate delegate) {
		final ItemListener l = new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				delegate.handle(type, widget);
			}
		};
		widget.addItemListener(l);
		return new IDelegateRegistration() {

			public void dispose() {
				widget.removeItemListener(l);
			}
		};
	}
}
