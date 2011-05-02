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

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

@SuppressWarnings("restriction")
public class PublisherServiceFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext arg0) {
		MApplication app = arg0.get(MApplication.class);
		PersonSelectionPublisher service = app.getContext().get(
				ContextPersonSelectionPublisher.class);
		if (service == null) {
			service = ContextInjectionFactory.make(
					ContextPersonSelectionPublisher.class, app.getContext());
			app.getContext().set(ContextPersonSelectionPublisher.class,
					(ContextPersonSelectionPublisher) service);
		}
		return service;
	}
}