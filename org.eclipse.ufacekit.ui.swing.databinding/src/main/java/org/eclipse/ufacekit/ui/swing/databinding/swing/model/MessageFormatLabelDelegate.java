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

import java.text.MessageFormat;

import org.eclipse.core.databinding.observable.map.IObservableMap;

/**
 * A label delegate which uses {@link MessageFormat} to construct the label
 *
 * @param <M>
 *            the element type
 */
public class MessageFormatLabelDelegate<M> implements ILabelDelegate<M> {
	private String messageFormat;

	/**
	 * Create a new delegate
	 *
	 * @param messageFormat
	 *            a valid {@link MessageFormat} format
	 */
	public MessageFormatLabelDelegate(String messageFormat) {
		this.messageFormat = messageFormat;
	}

	public String getText(M object, IObservableMap[] maps) {
		if( object == null ) {
			return ""; //$NON-NLS-1$
		}
		Object[] elements = new Object[maps.length];

		int idx = 0;
		for (IObservableMap m : maps) {
			Object o = m.get(object);
			if (o == null) {
				o = ""; //$NON-NLS-1$
			}
			elements[idx++] = o;
		}
		return MessageFormat.format(messageFormat, elements);
	}

}
