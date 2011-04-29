/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook.validation;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link at.bestsolution.e4.addressbook.model.addressbook.Country}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CountryValidator {
	boolean validate();

	boolean validateFederalStates(EList<FederalState> value);
	boolean validateName(String value);
	boolean validateAddressBook(AddressBook value);
}