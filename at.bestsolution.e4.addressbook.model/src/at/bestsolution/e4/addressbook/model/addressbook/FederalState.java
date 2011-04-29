/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federal State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getFederalState()
 * @model
 * @generated
 */
public interface FederalState extends EObject
{
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
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getFederalState_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

		/**
	 * Returns the value of the '<em><b>Country</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.e4.addressbook.model.addressbook.Country#getFederalStates <em>Federal States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' container reference.
	 * @see #setCountry(Country)
	 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getFederalState_Country()
	 * @see at.bestsolution.e4.addressbook.model.addressbook.Country#getFederalStates
	 * @model opposite="federalStates" transient="false"
	 * @generated
	 */
	Country getCountry();

		/**
	 * Sets the value of the '{@link at.bestsolution.e4.addressbook.model.addressbook.FederalState#getCountry <em>Country</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' container reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // FederalState
