/*******************************************************************************
 * Copyright (c) 2007, Angelo Zerr and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.swing;

import javax.swing.SwingUtilities;

import org.eclipse.core.databinding.observable.Realm;

/**
 * Swing Implementation Realm.
 *
 */
public class SwingRealm extends Realm {
	// Thread which have instanciate SwingRealm
	private Thread currentThread = null;

	/**
	 * Create a default realm
	 *
	 * @since 1.0
	 */
	public static void createDefault() {
		setDefault(new SwingRealm());
	}

	/**
	 * Create a realm in the current thread
	 *
	 * @since 1.0
	 */
	public SwingRealm() {
		this(Thread.currentThread());
	}

	/**
	 * Create a realm in the given thread
	 *
	 * @param thread
	 *            the thread the realm runs in
	 * @since 1.0
	 */
	public SwingRealm(Thread thread) {
		this.currentThread = thread;
	}

	public boolean isCurrent() {
		if (SwingUtilities.isEventDispatchThread()) {
			// It's EDT (Swing Thread which manage events)
			// return true
			return true;
		}
		// Test if current thread it's the thread which have
		// instanciate the SwingRealm.
		return Thread.currentThread() == currentThread;
	}

	public void asyncExec(final Runnable runnable) {
		// Realm with several thread
		// according to article at
		// http://www.eclipse.org/articles/article.php?file=Article-Swing-SWT-
		// Integration/index.html
		// org.eclipse.swt.widgets.Display.asyncExec()
		// is equivalent with javax.swing.SwingUtilities.invokeLater()
		Runnable safeRunnable = new Runnable() {
			public void run() {
				safeRun(runnable);
			}
		};
		SwingUtilities.invokeLater(safeRunnable);
	}

	/**
	 * @return the thread the realm runs in
	 * @since 1.0
	 */
	public Thread getCurrentThread() {
		return currentThread;
	}
}
