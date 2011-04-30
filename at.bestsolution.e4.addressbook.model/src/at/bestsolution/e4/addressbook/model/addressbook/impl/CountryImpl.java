/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Country;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Country</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl#getFederalStates
 * <em>Federal States</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.CountryImpl#getAddressBook
 * <em>Address Book</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CountryImpl extends EObjectImpl implements Country {
	/**
	 * The cached value of the '{@link #getFederalStates()
	 * <em>Federal States</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFederalStates()
	 * @generated
	 * @ordered
	 */
	protected EList<FederalState> federalStates;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddressBook() <em>Address Book</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddressBook()
	 * @generated
	 * @ordered
	 */
	protected AddressBook addressBook;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<FederalState> getFederalStates() {
		if (federalStates == null) {
			federalStates = new EObjectContainmentWithInverseEList<FederalState>(
					FederalState.class, this,
					AddressbookPackage.COUNTRY__FEDERAL_STATES,
					AddressbookPackage.FEDERAL_STATE__COUNTRY);
		}
		return federalStates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressBook getAddressBook() {
		if (addressBook != null && addressBook.eIsProxy()) {
			InternalEObject oldAddressBook = (InternalEObject) addressBook;
			addressBook = (AddressBook) eResolveProxy(oldAddressBook);
			if (addressBook != oldAddressBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AddressbookPackage.COUNTRY__ADDRESS_BOOK,
							oldAddressBook, addressBook));
			}
		}
		return addressBook;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressBook basicGetAddressBook() {
		return addressBook;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddressBook(AddressBook newAddressBook) {
		AddressBook oldAddressBook = addressBook;
		addressBook = newAddressBook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.COUNTRY__ADDRESS_BOOK, oldAddressBook,
					addressBook));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFederalStates())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			return ((InternalEList<?>) getFederalStates()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			return getFederalStates();
		case AddressbookPackage.COUNTRY__NAME:
			return getName();
		case AddressbookPackage.COUNTRY__ADDRESS_BOOK:
			if (resolve)
				return getAddressBook();
			return basicGetAddressBook();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			getFederalStates().clear();
			getFederalStates().addAll(
					(Collection<? extends FederalState>) newValue);
			return;
		case AddressbookPackage.COUNTRY__NAME:
			setName((String) newValue);
			return;
		case AddressbookPackage.COUNTRY__ADDRESS_BOOK:
			setAddressBook((AddressBook) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			getFederalStates().clear();
			return;
		case AddressbookPackage.COUNTRY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AddressbookPackage.COUNTRY__ADDRESS_BOOK:
			setAddressBook((AddressBook) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AddressbookPackage.COUNTRY__FEDERAL_STATES:
			return federalStates != null && !federalStates.isEmpty();
		case AddressbookPackage.COUNTRY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case AddressbookPackage.COUNTRY__ADDRESS_BOOK:
			return addressBook != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // CountryImpl
