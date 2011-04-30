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

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public class JListSingleSelectionIndexProperty extends WidgetIntValueProperty<JListSingleSelectionIndexProperty.SelectionTypes, JList> {
	public enum SelectionTypes implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}

	/**
	 * 
	 */
	public JListSingleSelectionIndexProperty() {
		super(new SelectionTypes[] { SelectionTypes.Selection });
	}

	int doGetIntValue(Object source) {
		return ((JList) source).getSelectedIndex();
	}

	void doSetIntValue(Object source, int value) {
		((JList) source).setSelectedIndex(value);
	}

	public String toString() {
		return "List.selectionIndex <int>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(final SelectionTypes type, final JList widget, final Delegate delegate) {
		final ListSelectionListener l = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				delegate.handle(type, widget);				
			}
		};
		widget.addListSelectionListener(l);
		return new IDelegateRegistration() {

			public void dispose() {
				widget.removeListSelectionListener(l);
			}
		};
	}
}
