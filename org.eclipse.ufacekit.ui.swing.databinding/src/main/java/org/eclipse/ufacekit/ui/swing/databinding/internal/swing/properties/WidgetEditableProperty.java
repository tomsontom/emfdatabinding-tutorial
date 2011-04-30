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
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.property.value.IValueProperty;

/**
 * @since 3.3
 * 
 */
public class WidgetEditableProperty extends WidgetDelegatingValueProperty {
	IValueProperty text;
	IValueProperty combo;

	/**
	 * 
	 */
	public WidgetEditableProperty() {
		super(Boolean.TYPE);
	}

	protected IValueProperty doGetDelegate(Object source) {
		if (source instanceof JTextComponent) {
			if (text == null)
				text = new JTextComponentEditableProperty();
			return text;
		}
		if( source instanceof JComboBox ) {
			if( combo == null ) 
				combo = new JComboBoxEditableProperty();
			return combo;
		}
		
		throw notSupported(source);
	}
}