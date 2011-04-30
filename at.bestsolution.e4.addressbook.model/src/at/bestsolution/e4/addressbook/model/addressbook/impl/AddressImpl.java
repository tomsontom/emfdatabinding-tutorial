/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressType;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Country;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Address</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getStreet
 * <em>Street</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getZip
 * <em>Zip</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getCity
 * <em>City</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getCountry
 * <em>Country</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getFederalState
 * <em>Federal State</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link at.bestsolution.e4.addressbook.model.addressbook.impl.AddressImpl#getPerson
 * <em>Person</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getFederalState()
	 * <em>Federal State</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFederalState()
	 * @generated
	 * @ordered
	 */
	protected FederalState federalState;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AddressType TYPE_EDEFAULT = AddressType.PRIVATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AddressType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject) country;
			country = (Country) eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AddressbookPackage.ADDRESS__COUNTRY, oldCountry,
							country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FederalState getFederalState() {
		if (federalState != null && federalState.eIsProxy()) {
			InternalEObject oldFederalState = (InternalEObject) federalState;
			federalState = (FederalState) eResolveProxy(oldFederalState);
			if (federalState != oldFederalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AddressbookPackage.ADDRESS__FEDERAL_STATE,
							oldFederalState, federalState));
			}
		}
		return federalState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FederalState basicGetFederalState() {
		return federalState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFederalState(FederalState newFederalState) {
		FederalState oldFederalState = federalState;
		federalState = newFederalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__FEDERAL_STATE, oldFederalState,
					federalState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(AddressType newType) {
		AddressType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person getPerson() {
		if (eContainerFeatureID() != AddressbookPackage.ADDRESS__PERSON)
			return null;
		return (Person) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPerson,
				AddressbookPackage.ADDRESS__PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != eInternalContainer()
				|| (eContainerFeatureID() != AddressbookPackage.ADDRESS__PERSON && newPerson != null)) {
			if (EcoreUtil.isAncestor(this, newPerson))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerson != null)
				msgs = ((InternalEObject) newPerson).eInverseAdd(this,
						AddressbookPackage.PERSON__ADDRESSES, Person.class,
						msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AddressbookPackage.ADDRESS__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AddressbookPackage.ADDRESS__PERSON:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPerson((Person) otherEnd, msgs);
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
		case AddressbookPackage.ADDRESS__PERSON:
			return basicSetPerson(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AddressbookPackage.ADDRESS__PERSON:
			return eInternalContainer().eInverseRemove(this,
					AddressbookPackage.PERSON__ADDRESSES, Person.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AddressbookPackage.ADDRESS__STREET:
			return getStreet();
		case AddressbookPackage.ADDRESS__ZIP:
			return getZip();
		case AddressbookPackage.ADDRESS__CITY:
			return getCity();
		case AddressbookPackage.ADDRESS__COUNTRY:
			if (resolve)
				return getCountry();
			return basicGetCountry();
		case AddressbookPackage.ADDRESS__FEDERAL_STATE:
			if (resolve)
				return getFederalState();
			return basicGetFederalState();
		case AddressbookPackage.ADDRESS__TYPE:
			return getType();
		case AddressbookPackage.ADDRESS__PERSON:
			return getPerson();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AddressbookPackage.ADDRESS__STREET:
			setStreet((String) newValue);
			return;
		case AddressbookPackage.ADDRESS__ZIP:
			setZip((String) newValue);
			return;
		case AddressbookPackage.ADDRESS__CITY:
			setCity((String) newValue);
			return;
		case AddressbookPackage.ADDRESS__COUNTRY:
			setCountry((Country) newValue);
			return;
		case AddressbookPackage.ADDRESS__FEDERAL_STATE:
			setFederalState((FederalState) newValue);
			return;
		case AddressbookPackage.ADDRESS__TYPE:
			setType((AddressType) newValue);
			return;
		case AddressbookPackage.ADDRESS__PERSON:
			setPerson((Person) newValue);
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
		case AddressbookPackage.ADDRESS__STREET:
			setStreet(STREET_EDEFAULT);
			return;
		case AddressbookPackage.ADDRESS__ZIP:
			setZip(ZIP_EDEFAULT);
			return;
		case AddressbookPackage.ADDRESS__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case AddressbookPackage.ADDRESS__COUNTRY:
			setCountry((Country) null);
			return;
		case AddressbookPackage.ADDRESS__FEDERAL_STATE:
			setFederalState((FederalState) null);
			return;
		case AddressbookPackage.ADDRESS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AddressbookPackage.ADDRESS__PERSON:
			setPerson((Person) null);
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
		case AddressbookPackage.ADDRESS__STREET:
			return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT
					.equals(street);
		case AddressbookPackage.ADDRESS__ZIP:
			return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT
					.equals(zip);
		case AddressbookPackage.ADDRESS__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT
					.equals(city);
		case AddressbookPackage.ADDRESS__COUNTRY:
			return country != null;
		case AddressbookPackage.ADDRESS__FEDERAL_STATE:
			return federalState != null;
		case AddressbookPackage.ADDRESS__TYPE:
			return type != TYPE_EDEFAULT;
		case AddressbookPackage.ADDRESS__PERSON:
			return getPerson() != null;
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
		result.append(" (street: ");
		result.append(street);
		result.append(", zip: ");
		result.append(zip);
		result.append(", city: ");
		result.append(city);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // AddressImpl
