/*******************************************************************************
 * Copyright (c) 2008, 2009 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 194734)
 *     Matthew Hall - bug 195222, 263413
 ******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.Component;
import java.awt.Container;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public abstract class WidgetBooleanValueProperty<E extends EventType,W extends Component> extends WidgetValueProperty<E,W> {
	WidgetBooleanValueProperty() {
		super();
	}

	WidgetBooleanValueProperty(E event) {
		super(event);
	}

	WidgetBooleanValueProperty(E[] events) {
		super(events);
	}

	public Object getValueType() {
		return Boolean.TYPE;
	}

	protected Object doGetValue(Object source) {
		return doGetBooleanValue(source) ? Boolean.TRUE : Boolean.FALSE;
	}

	protected void doSetValue(Object source, Object value) {
		if (value == null)
			value = Boolean.FALSE;
		doSetBooleanValue(source, ((Boolean) value).booleanValue());
	}

	abstract boolean doGetBooleanValue(Object source);

	abstract void doSetBooleanValue(Object source, boolean value);
	
	@Override
	protected IDelegateRegistration registerDelegate(E type, W widget, Delegate delegate) {
		return null;
	}
}
