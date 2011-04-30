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

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;

/**
 * Observable model for use with {@link JComboBox}
 *
 * @param <M>
 *            the object type
 */
public class ObservableComboBoxModel<M> extends ObservableListModel<M> implements ComboBoxModel {
	private M selectedObject;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create an observable model
	 *
	 * @param list
	 *            the domain list
	 * @param properties
	 *            the properties
	 */
	public ObservableComboBoxModel(IObservableList list, IValueProperty[] properties) {
		super(list, properties);
	}

	public Object getSelectedItem() {
		return selectedObject;
	}

	@SuppressWarnings("unchecked")
	public void setSelectedItem(Object newSelectedObject) {
		if ((selectedObject != null && !selectedObject.equals(newSelectedObject)) || selectedObject == null && newSelectedObject != null) {
			selectedObject = (M) newSelectedObject;
			fireContentsChanged(this, -1, -1);
		}
	}
}