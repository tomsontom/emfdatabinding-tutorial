/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EMF_codetemplates.xml,v 1.1 2008/05/06 20:12:20 nickb Exp $
 */
package at.bestsolution.e4.addressbook.swt.application.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

@SuppressWarnings("restriction")
public class RemovePerson {
	@Execute
	public void removePerson() {
		System.err.println("Execute Remove Person");
	}
}