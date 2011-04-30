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

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public class JSliderValueProperty extends WidgetIntValueProperty<JSliderValueProperty.SelectionTypes, JSlider> {
	public enum SelectionTypes implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}

	/**
	 * 
	 */
	public JSliderValueProperty() {
		super(new SelectionTypes[] { SelectionTypes.Selection });
	}

	int doGetIntValue(Object source) {
		return ((JSlider) source).getValue();
	}

	void doSetIntValue(Object source, int value) {
		((JSlider) source).setValue(value);
	}

	public String toString() {
		return "Combo.selectionIndex <int>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(final SelectionTypes type, final JSlider widget, final Delegate delegate) {
		final ChangeListener l = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				delegate.handle(type, widget);
			}
		};
		widget.addChangeListener(l);
		return new IDelegateRegistration() {

			public void dispose() {
				widget.removeChangeListener(l);
			}
		};
	}
}
