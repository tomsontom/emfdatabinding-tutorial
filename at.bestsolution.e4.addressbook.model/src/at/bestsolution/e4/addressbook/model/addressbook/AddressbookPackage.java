/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookFactory
 * @model kind="package"
 * @generated
 */
public interface AddressbookPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "addressbook";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.eclipse.org/example";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "addressbook";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  AddressbookPackage eINSTANCE = at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl.init();

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl <em>Address Book</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddressBook()
	 * @generated
	 */
  int ADDRESS_BOOK = 0;

  /**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS_BOOK__PERSONS = 0;

  /**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS_BOOK__COUNTRIES = 1;

  /**
	 * The number of structural features of the '<em>Address Book</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS_BOOK_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getPerson()
	 * @generated
	 */
  int PERSON = 1;

  /**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERSON__ADDRESSES = 0;

  /**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERSON__FIRSTNAME = 1;

  /**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERSON__LASTNAME = 2;

  /**
	 * The feature id for the '<em><b>Address Book</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS_BOOK = 3;

		/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERSON_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddress()
	 * @generated
	 */
  int ADDRESS = 2;

  /**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__STREET = 0;

  /**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__ZIP = 1;

  /**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__CITY = 2;

  /**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__COUNTRY = 3;

  /**
	 * The feature id for the '<em><b>Federal State</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__FEDERAL_STATE = 4;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS__TYPE = 5;

  /**
	 * The feature id for the '<em><b>Person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERSON = 6;

		/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDRESS_FEATURE_COUNT = 7;

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getCountry()
	 * @generated
	 */
  int COUNTRY = 3;

  /**
	 * The feature id for the '<em><b>Federal States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNTRY__FEDERAL_STATES = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNTRY__NAME = 1;

  /**
	 * The feature id for the '<em><b>Address Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ADDRESS_BOOK = 2;

		/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNTRY_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.FederalStateImpl <em>Federal State</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.FederalStateImpl
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getFederalState()
	 * @generated
	 */
  int FEDERAL_STATE = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEDERAL_STATE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERAL_STATE__COUNTRY = 1;

		/**
	 * The number of structural features of the '<em>Federal State</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEDERAL_STATE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressType
	 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddressType()
	 * @generated
	 */
  int ADDRESS_TYPE = 5;


  /**
	 * Returns the meta object for class '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Book</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressBook
	 * @generated
	 */
  EClass getAddressBook();

  /**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getPersons()
	 * @see #getAddressBook()
	 * @generated
	 */
  EReference getAddressBook_Persons();

  /**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressBook#getCountries()
	 * @see #getAddressBook()
	 * @generated
	 */
  EReference getAddressBook_Countries();

  /**
	 * Returns the meta object for class '{@link at.bestsolution.e4.addressbook.model.addressbook.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person
	 * @generated
	 */
  EClass getPerson();

  /**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
  EReference getPerson_Addresses();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
  EAttribute getPerson_Firstname();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
  EAttribute getPerson_Lastname();

  /**
	 * Returns the meta object for the container reference '{@link at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Address Book</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Person#getAddressBook()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_AddressBook();

		/**
	 * Returns the meta object for class '{@link at.bestsolution.e4.addressbook.model.addressbook.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address
	 * @generated
	 */
  EClass getAddress();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
  EAttribute getAddress_Street();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getZip()
	 * @see #getAddress()
	 * @generated
	 */
  EAttribute getAddress_Zip();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
  EAttribute getAddress_City();

  /**
	 * Returns the meta object for the reference '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
  EReference getAddress_Country();

  /**
	 * Returns the meta object for the reference '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getFederalState <em>Federal State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Federal State</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getFederalState()
	 * @see #getAddress()
	 * @generated
	 */
  EReference getAddress_FederalState();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
  EAttribute getAddress_Type();

  /**
	 * Returns the meta object for the container reference '{@link at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Person</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Address#getPerson()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Person();

		/**
	 * Returns the meta object for class '{@link at.bestsolution.e4.addressbook.model.addressbook.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Country
	 * @generated
	 */
  EClass getCountry();

  /**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getFederalStates <em>Federal States</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Federal States</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Country#getFederalStates()
	 * @see #getCountry()
	 * @generated
	 */
  EReference getCountry_FederalStates();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
  EAttribute getCountry_Name();

  /**
	 * Returns the meta object for the reference '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getAddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address Book</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Country#getAddressBook()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_AddressBook();

		/**
	 * Returns the meta object for class '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState <em>Federal State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federal State</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.FederalState
	 * @generated
	 */
  EClass getFederalState();

  /**
	 * Returns the meta object for the attribute '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.FederalState#getName()
	 * @see #getFederalState()
	 * @generated
	 */
  EAttribute getFederalState_Name();

  /**
	 * Returns the meta object for the container reference '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry()
	 * @see #getFederalState()
	 * @generated
	 */
	EReference getFederalState_Country();

		/**
	 * Returns the meta object for enum '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressType
	 * @generated
	 */
  EEnum getAddressType();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  AddressbookFactory getAddressbookFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl <em>Address Book</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddressBook()
		 * @generated
		 */
    EClass ADDRESS_BOOK = eINSTANCE.getAddressBook();

    /**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ADDRESS_BOOK__PERSONS = eINSTANCE.getAddressBook_Persons();

    /**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ADDRESS_BOOK__COUNTRIES = eINSTANCE.getAddressBook_Countries();

    /**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getPerson()
		 * @generated
		 */
    EClass PERSON = eINSTANCE.getPerson();

    /**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

    /**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

    /**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

    /**
		 * The meta object literal for the '<em><b>Address Book</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESS_BOOK = eINSTANCE.getPerson_AddressBook();

				/**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddress()
		 * @generated
		 */
    EClass ADDRESS = eINSTANCE.getAddress();

    /**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

    /**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ADDRESS__ZIP = eINSTANCE.getAddress_Zip();

    /**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

    /**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

    /**
		 * The meta object literal for the '<em><b>Federal State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ADDRESS__FEDERAL_STATE = eINSTANCE.getAddress_FederalState();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ADDRESS__TYPE = eINSTANCE.getAddress_Type();

    /**
		 * The meta object literal for the '<em><b>Person</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__PERSON = eINSTANCE.getAddress_Person();

				/**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getCountry()
		 * @generated
		 */
    EClass COUNTRY = eINSTANCE.getCountry();

    /**
		 * The meta object literal for the '<em><b>Federal States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COUNTRY__FEDERAL_STATES = eINSTANCE.getCountry_FederalStates();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

    /**
		 * The meta object literal for the '<em><b>Address Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__ADDRESS_BOOK = eINSTANCE.getCountry_AddressBook();

				/**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.impl.FederalStateImpl <em>Federal State</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.FederalStateImpl
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getFederalState()
		 * @generated
		 */
    EClass FEDERAL_STATE = eINSTANCE.getFederalState();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FEDERAL_STATE__NAME = eINSTANCE.getFederalState_Name();

    /**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERAL_STATE__COUNTRY = eINSTANCE.getFederalState_Country();

				/**
		 * The meta object literal for the '{@link at.bestsolution.e4.addressbook.model.addressbook.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressType
		 * @see at.bestsolution.e4.addressbook.model.addressbook.impl.AddressbookPackageImpl#getAddressType()
		 * @generated
		 */
    EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

  }

} //AddressbookPackage
