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

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JToggleButton;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;


/**
 * @since 3.3
 * 
 */
public class JToggleButtonSelectionProperty extends WidgetBooleanValueProperty<JToggleButtonSelectionProperty.SelectionType,JToggleButton> {
	public enum SelectionType implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}
	/**
	 * 
	 */
	public JToggleButtonSelectionProperty() {
		super(SelectionType.Selection);
	}

	boolean doGetBooleanValue(Object source) {
		return ((JToggleButton) source).isSelected();
	}

	void doSetBooleanValue(Object source, boolean value) {
		((JToggleButton) source).setSelected(value);
	}

	public String toString() {
		return "JToggleButton.selection <Boolean>"; //$NON-NLS-1$
	}
	
	@Override
	protected IDelegateRegistration registerDelegate(final SelectionType type, final JToggleButton widget, final Delegate delegate) {
		if( type == SelectionType.Selection ) {
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
		return super.registerDelegate(type, widget, delegate);
	}
}
