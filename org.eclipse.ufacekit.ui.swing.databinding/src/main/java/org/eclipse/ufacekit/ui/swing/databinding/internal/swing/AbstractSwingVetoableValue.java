/*******************************************************************************
 * Copyright (c) 2006 The Pampered Chef, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The Pampered Chef, Inc. - initial API and implementation
 ******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Container;

import javax.swing.JComponent;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.AbstractVetoableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingRealm;

/**
 * NON-API - An abstract superclass for vetoable values that gurantees that the
 * observable will be disposed when the control to which it is attached is
 * disposed.
 *
 * @since 1.0
 */
public abstract class AbstractSwingVetoableValue extends AbstractVetoableValue implements ISwingObservableValue {

	private final JComponent widget;

	/**
	 * Standard constructor for an SWT VetoableValue.  Makes sure that
	 * the observable gets disposed when the SWT widget is disposed.
	 *
	 * @param widget
	 */
	protected AbstractSwingVetoableValue(JComponent widget) {
		this(SwingRealm.getDefault(), widget);
	}

	/**
	 * Constructs a new instance for the provided <code>realm</code> and <code>widget</code>.
	 *
	 * @param realm
	 * @param widget
	 */
	protected AbstractSwingVetoableValue(Realm realm, JComponent widget) {
		super(realm);
		this.widget = widget;
		if (widget == null) {
			throw new IllegalArgumentException("The widget parameter is null."); //$NON-NLS-1$
		}
//		widget.addDisposeListener(disposeListener);
	}

//	private DisposeListener disposeListener = new DisposeListener() {
//		public void widgetDisposed(DisposeEvent e) {
//			AbstractSWTVetoableValue.this.dispose();
//		}
//	};

	/**
	 * @return Returns the widget.
	 */
	public Container getContainer() {
		return widget;
	}
}
