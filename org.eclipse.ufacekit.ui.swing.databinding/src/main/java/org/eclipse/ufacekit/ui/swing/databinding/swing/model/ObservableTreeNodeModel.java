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

import javax.swing.tree.DefaultTreeModel;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;

public class ObservableTreeNodeModel extends DefaultTreeModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ObservableTreeNodeModel(IObservableList list, IObservableFactory factory) {
		super(new ObservableTreeNode(list, factory),true);
		((ObservableTreeNode)getRoot()).setTreeModel(this);
	}

	@Override
	protected void fireTreeStructureChanged(Object source, Object[] path, int[] childIndices, Object[] children) {
		super.fireTreeStructureChanged(source, path, childIndices, children);
	}

	@Override
	protected void fireTreeNodesInserted(Object source, Object[] path, int[] childIndices, Object[] children) {
		// TODO Auto-generated method stub
		super.fireTreeNodesInserted(source, path, childIndices, children);
	}

	@Override
	protected void fireTreeNodesRemoved(Object source, Object[] path, int[] childIndices, Object[] children) {
		// TODO Auto-generated method stub
		super.fireTreeNodesRemoved(source, path, childIndices, children);
	}
}
