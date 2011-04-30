/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Address</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getStreet
 * <em>Street</em>}</li>
 * <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getZip
 * <em>Zip</em>}</li>
 * <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCity
 * <em>City</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCountry
 * <em>Country</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getFederalState
 * <em>Federal State</em>}</li>
 * <li>{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson
 * <em>Person</em>}</li>
 * </ul>
 * </p>
 * 
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getStreet
	 * <em>Street</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_Zip()
	 * @model
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getZip
	 * <em>Zip</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCity
	 * <em>City</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCountry
	 * <em>Country</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Federal State</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federal State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Federal State</em>' reference.
	 * @see #setFederalState(FederalState)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_FederalState()
	 * @model
	 * @generated
	 */
	FederalState getFederalState();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getFederalState
	 * <em>Federal State</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Federal State</em>' reference.
	 * @see #getFederalState()
	 * @generated
	 */
	void setFederalState(FederalState value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
	 * are from the enumeration
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressType
	 * @see #setType(AddressType)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_Type()
	 * @model
	 * @generated
	 */
	AddressType getType();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressType
	 * @see #getType()
	 * @generated
	 */
	void setType(AddressType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddresses
	 * <em>Addresses</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Person</em>' container reference.
	 * @see #setPerson(Person)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddress_Person()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getAddresses
	 * @model opposite="addresses" transient="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '
	 * {@link at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson
	 * <em>Person</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Person</em>' container reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Address
