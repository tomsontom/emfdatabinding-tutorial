/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ufacekit.ui.swing.databinding.swing;

import java.awt.Container;

import org.eclipse.core.databinding.observable.IObservable;

/**
 * {@link IObservable} observing an SWT widget.
 *
 * @since 1.0
 *
 */
public interface ISwingObservable extends IObservable {

	/**
	 * Returns the widget of this observable
	 *
	 * @return the widget
	 */
	public Container getContainer();

}
