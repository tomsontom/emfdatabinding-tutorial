/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getPersons <em>Persons</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getCountries <em>Countries</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddressBook()
 * @model
 * @generated
 */
public interface AddressBook extends EObject
{
  /**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.e4.addressbook.model.addressbook.Person}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddressBook_Persons()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook
	 * @model opposite="addressBook" containment="true"
	 * @generated
	 */
  EList<Person> getPersons();

  /**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.e4.addressbook.model.addressbook.Country}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Countries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddressBook_Countries()
	 * @model containment="true"
	 * @generated
	 */
  EList<Country> getCountries();

} // AddressBook
