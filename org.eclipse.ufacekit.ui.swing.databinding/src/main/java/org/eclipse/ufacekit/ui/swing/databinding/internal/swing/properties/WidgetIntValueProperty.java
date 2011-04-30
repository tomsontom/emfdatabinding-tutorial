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

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;

/**
 * @since 3.3
 * 
 */
public abstract class WidgetIntValueProperty<E extends EventType,W extends Component> extends WidgetValueProperty<E,W> {
	WidgetIntValueProperty() {
		super();
	}

	WidgetIntValueProperty(E event) {
		super(event);
	}

	WidgetIntValueProperty(E[] events) {
		super(events);
	}

	public Object getValueType() {
		return Integer.TYPE;
	}

	protected Object doGetValue(Object source) {
		return new Integer(doGetIntValue(source));
	}

	protected void doSetValue(Object source, Object value) {
		doSetIntValue(source, ((Integer) value).intValue());
	}

	abstract int doGetIntValue(Object source);

	abstract void doSetIntValue(Object source, int intValue);
}
