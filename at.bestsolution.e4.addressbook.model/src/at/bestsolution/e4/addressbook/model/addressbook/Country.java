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
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getFederalStates <em>Federal States</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getAddressBook <em>Address Book</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject
{
  /**
	 * Returns the value of the '<em><b>Federal States</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.e4.addressbook.model.addressbook.FederalState}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Federal States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Federal States</em>' containment reference list.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getCountry_FederalStates()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry
	 * @model opposite="country" containment="true"
	 * @generated
	 */
  EList<FederalState> getFederalStates();

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

		/**
	 * Returns the value of the '<em><b>Address Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Book</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Book</em>' reference.
	 * @see #setAddressBook(AddressBook)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getCountry_AddressBook()
	 * @model
	 * @generated
	 */
	AddressBook getAddressBook();

		/**
	 * Sets the value of the '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getAddressBook <em>Address Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Book</em>' reference.
	 * @see #getAddressBook()
	 * @generated
	 */
	void setAddressBook(AddressBook value);

} // Country
