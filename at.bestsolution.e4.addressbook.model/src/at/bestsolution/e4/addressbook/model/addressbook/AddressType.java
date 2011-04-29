/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.e4.addressbook.model.addressbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Address Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage#getAddressType()
 * @model
 * @generated
 */
public enum AddressType implements Enumerator
{
  /**
	 * The '<em><b>PRIVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
  PRIVATE(0, "PRIVATE", "PRIVATE"),

  /**
	 * The '<em><b>BUSINESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
  BUSINESS(1, "BUSINESS", "BUSINESS"),

  /**
	 * The '<em><b>DELIVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
  DELIVERY(2, "DELIVERY", "DELIVERY");

  /**
	 * The '<em><b>PRIVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRIVATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int PRIVATE_VALUE = 0;

  /**
	 * The '<em><b>BUSINESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BUSINESS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int BUSINESS_VALUE = 1;

  /**
	 * The '<em><b>DELIVERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DELIVERY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DELIVERY
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int DELIVERY_VALUE = 2;

  /**
	 * An array of all the '<em><b>Address Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AddressType[] VALUES_ARRAY =
    new AddressType[] {
			PRIVATE,
			BUSINESS,
			DELIVERY,
		};

  /**
	 * A public read-only list of all the '<em><b>Address Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<AddressType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Address Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AddressType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Address Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AddressType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Address Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AddressType get(int value)
  {
		switch (value) {
			case PRIVATE_VALUE: return PRIVATE;
			case BUSINESS_VALUE: return BUSINESS;
			case DELIVERY_VALUE: return DELIVERY;
		}
		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final int value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String name;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String literal;

  /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private AddressType(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //AddressType
