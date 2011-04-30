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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Person</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddresses
 * <em>Addresses</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getFirstname
 * <em>Firstname</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getLastname
 * <em>Lastname</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook
 * <em>Address Book</em>}</li>
 * </ul>
 * </p>
 * 
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address}. It is
	 * bidirectional and its opposite is '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson
	 * <em>Person</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getPerson_Addresses()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson
	 * @model opposite="person" containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getPerson_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getFirstname
	 * <em>Firstname</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getPerson_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getLastname
	 * <em>Lastname</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Address Book</b></em>' container
	 * reference. It is bidirectional and its opposite is '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getPersons
	 * <em>Persons</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Book</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address Book</em>' container reference.
	 * @see #setAddressBook(AddressBook)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getPerson_AddressBook()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	AddressBook getAddressBook();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook
	 * <em>Address Book</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Address Book</em>' container
	 *            reference.
	 * @see #getAddressBook()
	 * @generated
	 */
	void setAddressBook(AddressBook value);

} // Person
