/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Fu Zebest<fuzebest@mail.ru> - bugfix in 320685
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.swing.model;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.tree.TreeNode;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffVisitor;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;

public class ObservableTreeNode implements TreeNode {
	private ObservableTreeNode parent;
	private Vector<ObservableTreeNode> nodeList;
	private Object userObject;

	// Only root-node
	private IObservableList list;
	private IObservableFactory factory;
	private ObservableTreeNodeModel treeModel;

	public ObservableTreeNode(ObservableTreeNode parent, Object userObject) {
		this.parent = parent;
		this.userObject = userObject;
	}

	ObservableTreeNode(IObservableList list, IObservableFactory factory) {
		this.list = list;
		this.factory = factory;
		children();
	}

	void setTreeModel(ObservableTreeNodeModel treeModel) {
		this.treeModel = treeModel;
	}
	
	private ObservableTreeNodeModel getTreeModel() {
		if(this.treeModel == null && this.parent != null) {
			return parent.getTreeModel();
		}
		return this.treeModel;
	}

	public Enumeration children() {
		if( nodeList == null ) {
			nodeList = new Vector<ObservableTreeNode>();
			list = createObservableList();
			if( list != null ) {
				for( Object o : list ) {
					nodeList.add(new ObservableTreeNode(this, o));
				}

				list.addListChangeListener(new IListChangeListener() {

					public void handleListChange(ListChangeEvent event) {
						event.diff.accept(new ListDiffVisitor() {

							@Override
							public void handleRemove(int index, Object element) {
								nodeList.remove(index);
								getTreeModel().fireTreeNodesRemoved(getTreeModel(), getTreeModel().getPathToRoot(ObservableTreeNode.this), new int[] {index}, new Object[] {element});
							}

							@Override
							public void handleAdd(int index, Object element) {
								nodeList.add(index, new ObservableTreeNode(ObservableTreeNode.this, element));
								getTreeModel().fireTreeNodesInserted(getTreeModel(), getTreeModel().getPathToRoot(ObservableTreeNode.this), new int[] {index}, new Object[] {element});
							}
						});
					}
				});
			}
		}

		return nodeList.elements();
	}

	private IObservableFactory getFactory() {
		return factory == null ? parent.getFactory() : factory;
	}

	private IObservableList createObservableList() {
		return list == null ? (IObservableList)getFactory().createObservable(userObject) : list;
	}

	public boolean getAllowsChildren() {
		// We need to be more clever here to no materialize until expanded!
		if( nodeList == null ) {
			children();
		}
		return nodeList == null || nodeList.size() > 0;
	}

	public TreeNode getChildAt(int childIndex) {
		return nodeList != null ? nodeList.get(childIndex) : null;
	}

	public int getChildCount() {
		if( nodeList == null ) {
			children();
		}
		return nodeList != null ? nodeList.size() : 0;
	}

	public int getIndex(TreeNode node) {
		return nodeList != null ? nodeList.indexOf(node) : -1;
	}

	public TreeNode getParent() {
		return parent;
	}

	public boolean isLeaf() {
		return nodeList != null && nodeList.size() == 0;
	}

	@Override
	public String toString() {
		return userObject == null ? "" : userObject.toString(); //$NON-NLS-1$
	}
}
