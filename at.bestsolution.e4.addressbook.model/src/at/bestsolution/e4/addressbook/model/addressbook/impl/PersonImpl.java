/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook.impl;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.impl.PersonImpl#getAddressBook <em>Address Book</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person
{
  /**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
  protected EList<Address> addresses;

  /**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
  protected static final String FIRSTNAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
  protected String firstname = FIRSTNAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
  protected static final String LASTNAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
  protected String lastname = LASTNAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PersonImpl()
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
		return AddressbookPackage.Literals.PERSON;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Address> getAddresses()
  {
		if (addresses == null) {
			addresses = new EObjectContainmentWithInverseEList<Address>(Address.class, this, AddressbookPackage.PERSON__ADDRESSES, AddressbookPackage.ADDRESS__PERSON);
		}
		return addresses;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFirstname()
  {
		return firstname;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFirstname(String newFirstname)
  {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLastname()
  {
		return lastname;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLastname(String newLastname)
  {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.PERSON__LASTNAME, oldLastname, lastname));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBook getAddressBook() {
		if (eContainerFeatureID() != AddressbookPackage.PERSON__ADDRESS_BOOK) return null;
		return (AddressBook)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressBook(AddressBook newAddressBook, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAddressBook, AddressbookPackage.PERSON__ADDRESS_BOOK, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressBook(AddressBook newAddressBook) {
		if (newAddressBook != eInternalContainer() || (eContainerFeatureID() != AddressbookPackage.PERSON__ADDRESS_BOOK && newAddressBook != null)) {
			if (EcoreUtil.isAncestor(this, newAddressBook))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAddressBook != null)
				msgs = ((InternalEObject)newAddressBook).eInverseAdd(this, AddressbookPackage.ADDRESS_BOOK__PERSONS, AddressBook.class, msgs);
			msgs = basicSetAddressBook(newAddressBook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.PERSON__ADDRESS_BOOK, newAddressBook, newAddressBook));
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
			case AddressbookPackage.PERSON__ADDRESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddresses()).basicAdd(otherEnd, msgs);
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAddressBook((AddressBook)otherEnd, msgs);
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
			case AddressbookPackage.PERSON__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				return basicSetAddressBook(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				return eInternalContainer().eInverseRemove(this, AddressbookPackage.ADDRESS_BOOK__PERSONS, AddressBook.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case AddressbookPackage.PERSON__ADDRESSES:
				return getAddresses();
			case AddressbookPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case AddressbookPackage.PERSON__LASTNAME:
				return getLastname();
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				return getAddressBook();
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
			case AddressbookPackage.PERSON__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case AddressbookPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case AddressbookPackage.PERSON__LASTNAME:
				setLastname((String)newValue);
				return;
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				setAddressBook((AddressBook)newValue);
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
			case AddressbookPackage.PERSON__ADDRESSES:
				getAddresses().clear();
				return;
			case AddressbookPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case AddressbookPackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				setAddressBook((AddressBook)null);
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
			case AddressbookPackage.PERSON__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case AddressbookPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case AddressbookPackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case AddressbookPackage.PERSON__ADDRESS_BOOK:
				return getAddressBook() != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
