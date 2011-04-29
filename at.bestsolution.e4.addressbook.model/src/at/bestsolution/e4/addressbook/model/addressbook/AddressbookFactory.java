/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage
 * @generated
 */
public interface AddressbookFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  AddressbookFactory eINSTANCE = at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Address Book</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Book</em>'.
	 * @generated
	 */
  AddressBook createAddressBook();

  /**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
  Person createPerson();

  /**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
  Address createAddress();

  /**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
  Country createCountry();

  /**
	 * Returns a new object of class '<em>Federal State</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federal State</em>'.
	 * @generated
	 */
  FederalState createFederalState();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  AddressbookPackage getAddressbookPackage();

} //AddressbookFactory
