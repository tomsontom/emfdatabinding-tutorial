/*******************************************************************************
 * Copyright (c) 2007 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 207844)
 *     IBM Corporation - initial API and implementation
 *     Brad Reynolds - initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import javax.swing.JFrame;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * Observe the title of a Shell
 *
 * @since 1.0
 *
 */
public class ShellObservableValue extends AbstractSwingObservableValue {

	private final JFrame shell;

	/**
	 * Create new observable for the title of the given JFrame
	 *
	 * @param shell
	 *            the JFrame whose title is observed
	 * @since 1.0
	 */
	public ShellObservableValue(JFrame shell) {
		super(shell);
		this.shell = shell;
	}

	/**
	 * Create new observable for the title of the given JFrame
	 *
	 * @param realm
	 *            the realm to sync with UI thread
	 * @param shell
	 *            the JFrame whose title is observed
	 * @since 1.0
	 */
	public ShellObservableValue(Realm realm, JFrame shell) {
		super(realm, shell);
		this.shell = shell;
	}

	public void doSetValue(final Object value) {
		String oldValue = shell.getTitle();
		String newValue = value == null ? "" : value.toString(); //$NON-NLS-1$
		shell.setTitle(newValue);

		if (!newValue.equals(oldValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	public Object doGetValue() {
		return shell.getTitle();
	}

	public Object getValueType() {
		return String.class;
	}
}
