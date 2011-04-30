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
package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import javax.swing.JComponent;

/**
 *
 * Mark widget to ignore the events.
 *
 */
public class MarkWidgetUtils {

	/**
	 * Set items is called into ComboObservableList.
	 */
	public static final String COMBOOBSERVABLELIST_SETITEMS = "COMBOOBSERVABLELIST_SETITEMS"; //$NON-NLS-1$

	/**
	 * Mark component to ignore events
	 *
	 * @param component
	 *            the component to mark
	 * @param key
	 *            the key restoring the information
	 * @since 1.0
	 */
	public static void markWidget(JComponent component, String key) {
		component.putClientProperty(key, "true"); //$NON-NLS-1$
	}

	/**
	 * Remove the mark from the component to ignore events
	 *
	 * @param component
	 *            the component to remove the mark from
	 * @param key
	 *            the key restoring the information
	 * @since 1.0
	 */
	public static void unMarkWidget(JComponent component, String key) {
		component.putClientProperty(key, null);
	}

	/**
	 * Check if marked to ignore events
	 *
	 * @param component
	 *            the component to check for
	 * @param key
	 *            the key with the information
	 * @return <code>true</code> if marked for ignoring events
	 * @since 1.0
	 */
	public static boolean isWidgetMarked(JComponent component, String key) {
		return (component.getClientProperty(key) != null);
	}
}
