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

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.eclipse.core.databinding.observable.Diffs;

/**
 * Represents a single selection observable value for a {@link JTree}
 *
 * @since 1.0
 */
public class TreeSingleSelectionObservableValue extends AbstractSwingObservableValue {
	private TreeSelectionListener selectionListener;
	private JTree tree;
	private boolean updating = false;
	private Object currentSelection;

	/**
	 * Create an observable for the selection in the JTree
	 *
	 * @param tree
	 *            the tree whose selection is observed
	 * @since 1.0
	 */
	public TreeSingleSelectionObservableValue(JTree tree) {
		super(tree);
		this.tree = tree;

		this.currentSelection = doGetValue();

		selectionListener = new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent event) {
				if (!updating) {
					Object oldSelection = currentSelection;
					currentSelection = doGetValue();
					fireValueChange(Diffs.createValueDiff(oldSelection, currentSelection));
				}
			}
		};
		tree.addTreeSelectionListener(selectionListener);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.AbstractObservableValue
	 * #dispose()
	 */
	public synchronized void dispose() {
		super.dispose();
		if (selectionListener != null) {
			tree.removeTreeSelectionListener(selectionListener);
		}
	}

	public Object getValueType() {
		return null;
	}

	/**
	 * Sets the selection to the provided <code>value</code>. Value change
	 * events are fired after selection is set in the selection provider.
	 *
	 * @param value
	 *            object to set as selected, <code>null</code> if wanting to
	 *            remove selection
	 */
	public void doSetValue(final Object value) {
		try {
			updating = true;

			Object oldSelection = currentSelection;
			doSetSelectedValue(value);

			currentSelection = doGetValue();
			if (!Util.equals(oldSelection, currentSelection)) {
				fireValueChange(Diffs.createValueDiff(oldSelection, currentSelection));
			}
		} finally {
			updating = false;
		}
	}

	/**
	 * Sets the selected value without having to raise any events as that is
	 * done by the {@link #doSetValue(Object)} method.
	 *
	 * @param value
	 *            the selection value
	 */
	protected void doSetSelectedValue(Object value) {
		throw new UnsupportedOperationException();
		/*
		 * Object root = tree.getModel().getRoot(); TreePath path = new
		 * TreePath(nodeArray); tree.setSelectionPath(path);
		 */
	}

	protected Object doGetValue() {
		TreePath path = tree.getSelectionPath();
		if (path != null) {
			Object value = path.getLastPathComponent();
			return getValueOfTreeNode(value);
		}
		return null;
	}

	private Object getValueOfTreeNode(Object treeNode) {
		if (treeNode instanceof DefaultMutableTreeNode) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeNode;
			return node.getUserObject();
		} else {
			return treeNode;
		}
	}
}