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

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;

/**
 * @since 3.3
 * 
 */
public class ComponentEnabledProperty extends WidgetBooleanValueProperty<EventType,Component> {
	public boolean doGetBooleanValue(Object source) {
		return ((Component) source).isEnabled();
	}

	void doSetBooleanValue(Object source, boolean value) {
		((Component) source).setEnabled(value);
	}

	public String toString() {
		return "Control.enabled <boolean>"; //$NON-NLS-1$
	}
}
