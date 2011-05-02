/*******************************************************************************
 * Copyright (c) 2011, BestSolution.at and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - Initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.addressbook.model.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("restriction")
public class UndoHandler {
	@Execute
	public void undo(EditingDomain editingDomain) {
		editingDomain.getCommandStack().undo();
	}
}
