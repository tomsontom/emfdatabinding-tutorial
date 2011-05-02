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
package at.bestsolution.e4.addressbook.ui.undo;

import java.util.HashMap;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

@SuppressWarnings("restriction")
public class EditingDomainFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext arg0) {
		IEclipseContext context = arg0.get(MApplication.class).getContext();
		EditingDomain domain = context.get(AdapterFactoryEditingDomain.class);
		
		if( domain == null ) {
			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			BasicCommandStack commandStack = new BasicCommandStack();
			domain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
			context.set(AdapterFactoryEditingDomain.class, (AdapterFactoryEditingDomain)domain);
		}
		
		return domain;
	}
}