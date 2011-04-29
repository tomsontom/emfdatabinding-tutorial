/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook.impl;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Country;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressBookImpl#getCountries <em>Countries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressBookImpl extends EObjectImpl implements AddressBook
{
  /**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
  protected EList<Person> persons;

  /**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
  protected EList<Country> countries;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AddressBookImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return AddressbookPackage.Literals.ADDRESS_BOOK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Person> getPersons()
  {
		if (persons == null) {
			persons = new EObjectContainmentWithInverseEList<Person>(Person.class, this, AddressbookPackage.ADDRESS_BOOK__PERSONS, AddressbookPackage.PERSON__ADDRESS_BOOK);
		}
		return persons;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Country> getCountries()
  {
		if (countries == null) {
			countries = new EObjectContainmentEList<Country>(Country.class, this, AddressbookPackage.ADDRESS_BOOK__COUNTRIES);
		}
		return countries;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersons()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.ADDRESS_BOOK__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return getPersons();
			case AddressbookPackage.ADDRESS_BOOK__COUNTRIES:
				return getCountries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case AddressbookPackage.ADDRESS_BOOK__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				getPersons().clear();
				return;
			case AddressbookPackage.ADDRESS_BOOK__COUNTRIES:
				getCountries().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return persons != null && !persons.isEmpty();
			case AddressbookPackage.ADDRESS_BOOK__COUNTRIES:
				return countries != null && !countries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddressBookImpl
