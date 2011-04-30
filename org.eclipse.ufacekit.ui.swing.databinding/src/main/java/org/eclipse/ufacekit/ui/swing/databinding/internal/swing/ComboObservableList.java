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

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.ListDiff;

/**
 * Observe items of Swing JComboBox.
 *
 * @since 1.0
 */
public class ComboObservableList extends SwingObservableList {

	private final JComboBox combo;
	private boolean updating;
	private List<Object> oldItems;
	private ListDataListener listener;

	/**
	 * Create a new observable for the given combo
	 *
	 * @param combo
	 *            the combo to observe
	 * @since 1.0
	 */
	public ComboObservableList(JComboBox combo) {
		super();
		this.combo = combo;
		initListener();
	}

	/**
	 * Create a new observable for the given combo and the given realm
	 *
	 * @param realm
	 *            the realm
	 *
	 * @param combo
	 *            the combo to observe
	 */
	public ComboObservableList(Realm realm, JComboBox combo) {
		super(realm);
		this.combo = combo;
		initListener();
	}

	private void initListener() {
		this.listener = new ListDataListener() {
			public void intervalAdded(ListDataEvent e) {
				fireItemsChanged();
			}

			public void contentsChanged(ListDataEvent e) {
				// Do nothing
			}

			public void intervalRemoved(ListDataEvent e) {
				fireItemsChanged();
			}
		};
		combo.getModel().addListDataListener(listener);
	}

	protected int getItemCount() {
		return combo.getItemCount();
	}

	protected void setItems(Object[] newItems) {
		try {
			this.updating = true;
			if (newItems != null) {
				Object selectedItem = combo.getSelectedItem();
				// removeAllItems, setSelectedIndex fire Swing events
				// Mark combo in order to ignore the events
				// see org.ufacekit.ui.swing.databinding.events.internal.
				// SelectionObservableEvent
				// which ignore the events if JComboBox is marked as
				// COMBOOBSERVABLELIST_SETITEMS.
				MarkWidgetUtils.markWidget(combo, MarkWidgetUtils.COMBOOBSERVABLELIST_SETITEMS);
				combo.removeAllItems();
				for (int i = 0; i < newItems.length; i++) {
					combo.addItem(newItems[i]);
				}
				if (selectedItem != null)
					combo.setSelectedItem(selectedItem);
			}
			// Store old items
			oldItems = getItemsAsArray();
		} finally {
			MarkWidgetUtils.unMarkWidget(combo, MarkWidgetUtils.COMBOOBSERVABLELIST_SETITEMS);
			this.updating = false;
		}
	}

	protected Object[] getItems() {
		int count = combo.getItemCount();
		Object[] items = new Object[count];
		for (int i = 0; i < count; i++) {
			items[i] = combo.getItemAt(i);
		}
		return items;
	}

	private List<Object> getItemsAsArray() {
		int count = combo.getItemCount();
		List<Object> items = new ArrayList<Object>();
		for (int i = 0; i < count; i++) {
			items.add(combo.getItemAt(i));
		}
		return items;
	}

	protected Object getItem(int index) {
		return combo.getItemAt(index);
	}

	protected void setItem(int index, Object value) {
		try {
			this.updating = true;
			combo.removeItemAt(index);
			combo.insertItemAt(value, index);
		} finally {
			this.updating = false;
		}
	}

	private void fireItemsChanged() {
		if (updating)
			return;
		List<Object> newList = getItemsAsArray();
		ListDiff listDiff = Diffs.computeListDiff(oldItems, newList);
		fireListChange(listDiff);
		oldItems = newList;
	}

	public synchronized void dispose() {
		super.dispose();
		combo.getModel().removeListDataListener(listener);
	}
}
