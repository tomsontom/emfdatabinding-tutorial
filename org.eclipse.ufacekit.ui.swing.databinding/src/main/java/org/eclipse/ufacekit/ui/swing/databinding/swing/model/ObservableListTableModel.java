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

import java.util.ArrayList;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

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
 * A table model working on top of a {@link IObservableList}
 */
public class ObservableListTableModel extends AbstractTableModel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private IMapChangeListener mapChangeListener = new IMapChangeListener() {
		public void handleMapChange(MapChangeEvent event) {
			Set<?> affectedElements = event.diff.getChangedKeys();
			if (!affectedElements.isEmpty()) {
				for (Object o : affectedElements) {
					int index = list.indexOf(o);
					for (int i = 0; i < getColumnCount(); i++) {
						fireTableCellUpdated(index, i);
					}
				}
			}
		}
	};

	private IObservableList list;
	private IObservableMap[] maps;
	private ArrayList<String> columns = new ArrayList<String>();

	/**
	 * Create a new observable model
	 *
	 * @param list
	 *            the domain list
	 * @param properties
	 *            the observed properties
	 */
	public ObservableListTableModel(IObservableList list, IValueProperty... properties) {
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
				if( event.diff.getDifferences().length > 1 ) {
					//FIXME Not ideal but it looks the problem with the code below is that
					// we need to add index counting logic
					fireTableDataChanged();
				} else {
					event.diff.accept(new ListDiffVisitor() {
						@Override
						public void handleRemove(int index, Object element) {
							fireTableRowsDeleted(index, index);
						}

						@Override
						public void handleAdd(int index, Object element) {
							fireTableRowsInserted(index, index);
						}
					});
				}
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
	 * Adding a column
	 *
	 * @param columnName
	 *            the column name
	 */
	public void addColumn(String columnName) {
		columns.add(columnName);
		fireTableStructureChanged();
	}

	@Override
	public String getColumnName(int column) {
		return columns.get(column);
	}

	public int getColumnCount() {
		return columns.size();
	}

	public int getRowCount() {
		return list.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return list.get(rowIndex);
	}

	/**
	 * @return the observable maps
	 */
	IObservableMap[] getMaps() {
		return maps;
	}

}
