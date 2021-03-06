/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.swing.model;

import org.eclipse.core.databinding.observable.map.IObservableMap;

/**
 * Delegate consulted to construct the label
 *
 * @param <M>
 *            the element type
 */
public interface ILabelDelegate<M> {
	/**
	 * Delegate method called with domain object and maps
	 *
	 * @param object
	 *            the object
	 * @param maps
	 *            the observable maps
	 * @return the resulting label
	 */
	public String getText(M object, IObservableMap[] maps);
}
