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

import java.util.Set;

import javax.swing.AbstractListModel;

import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffVisitor;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.core.databinding.observable.set.ListToSetAdapter;
import org.eclipse.core.databinding.property.value.IValueProperty;

/**
 * A list model implementation working with an {@link IObservableList} as the
 * data structure
 *
 * @param <M>
 *            the element type
 */
public class ObservableListModel<M> extends AbstractListModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private IObservableList list;
	private IObservableMap[] maps;

	private IMapChangeListener mapChangeListener = new IMapChangeListener() {
		public void handleMapChange(MapChangeEvent event) {
			Set<?> affectedElements = event.diff.getChangedKeys();
			if (!affectedElements.isEmpty()) {
				for (Object o : affectedElements) {
					int index = list.indexOf(o);
					fireContentsChanged(ObservableListModel.this, index, index);
				}
			}
		}
	};

	/**
	 * Create a new list model instance
	 *
	 * @param list
	 *            the list
	 * @param properties
	 *            the properties to listen to so that the list is in sync with
	 *            the model
	 */
	public ObservableListModel(IObservableList list, IValueProperty... properties) {
		this.list = list;
		this.maps = new IObservableMap[properties.length];

		final ListToSetAdapter adapter = new ListToSetAdapter(list);
		for (int i = 0; i < properties.length; i++) {
			IObservableMap p = properties[i].observeDetail(adapter);
			p.addMapChangeListener(mapChangeListener);
			maps[i] = p;
		}

		this.list.addListChangeListener(new IListChangeListener() {

			public void handleListChange(ListChangeEvent event) {
				event.diff.accept(new ListDiffVisitor() {

					@Override
					public void handleRemove(int index, Object element) {
						fireIntervalRemoved(ObservableListModel.this, index, index);
					}

					@Override
					public void handleAdd(int index, Object element) {
						fireIntervalAdded(ObservableListModel.this, index, index);
					}
				});
			}
		});
		
		this.list.addDisposeListener(new IDisposeListener() {
			
			public void handleDispose(DisposeEvent staleEvent) {
				for( IObservableMap p : maps ) {
					p.dispose();
				}
				adapter.dispose();
			}
		});
	}

	/**
	 * @return the observable maps
	 */
	IObservableMap[] getMaps() {
		return maps;
	}

	public Object getElementAt(int index) {
		return list.get(index);
	}

	public int getSize() {
		return list.size();
	}
}