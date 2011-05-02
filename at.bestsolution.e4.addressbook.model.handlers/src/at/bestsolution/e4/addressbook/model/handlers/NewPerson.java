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

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressType;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookFactory;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

@SuppressWarnings("restriction")
public class NewPerson {
	@Execute
	public void createPerson(AddressBook book) {
		Person p = AddressbookFactory.eINSTANCE.createPerson();
		Address address = AddressbookFactory.eINSTANCE.createAddress();
		address.setType(AddressType.PRIVATE);
		p.getAddresses().add(address);
		book.getPersons().add(p);
	}
}
