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
package at.bestsolution.e4.addressbook.ui.services.di;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.e4.addressbook.model.addressbook.Person;
import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

@SuppressWarnings("restriction")
public class ContextPersonSelectionPublisher implements
		PersonSelectionPublisher {
	private IEclipseContext context;

	@Inject
	public ContextPersonSelectionPublisher(IEclipseContext context) {
		this.context = context;
	}

	@Override
	public void setPerson(Person person) {
		context.set(Person.class, person);
	}
}