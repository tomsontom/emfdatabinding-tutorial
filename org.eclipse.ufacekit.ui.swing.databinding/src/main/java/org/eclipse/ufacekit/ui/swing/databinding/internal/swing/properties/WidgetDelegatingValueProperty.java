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

import java.awt.Container;

import org.eclipse.core.databinding.property.value.DelegatingValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.IWidgetValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingObservables;

abstract class WidgetDelegatingValueProperty extends DelegatingValueProperty
		implements IWidgetValueProperty {
	RuntimeException notSupported(Object source) {
		return new IllegalArgumentException(
				"Widget [" + source.getClass().getName() + "] is not supported."); //$NON-NLS-1$//$NON-NLS-2$
	}

	public WidgetDelegatingValueProperty() {
	}

	public WidgetDelegatingValueProperty(Object valueType) {
		super(valueType);
	}

	public ISwingObservableValue observe(Container widget) {
		return (ISwingObservableValue) observe(SwingObservables.getRealm(), widget);
	}

	public ISwingObservableValue observeDelayed(int delay, Container widget) {
		return SwingObservables.observeDelayedValue(delay, observe(widget));
	}
}