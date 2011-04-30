/*******************************************************************************
 * Copyright (c) 2008, 2009 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 213893)
 ******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JButton;

import org.eclipse.ufacekit.ui.swing.custom.JTabbedPanePage;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public class JTabbedPanePageTextProperty extends WidgetStringValueProperty<EventType,JTabbedPanePage> {
	String doGetStringValue(Object source) {
		return ((JButton) source).getText();
	}

	void doSetStringValue(Object source, String value) {
		((JTabbedPanePage) source).setText(value == null ? "" : value); //$NON-NLS-1$
	}

	public String toString() {
		return "Button.text <String>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(EventType type, JTabbedPanePage widget, Delegate delegate) {
		return null;
	}
}
