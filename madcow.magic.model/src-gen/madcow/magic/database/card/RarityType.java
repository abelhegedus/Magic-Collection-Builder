/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.database.card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rarity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see madcow.magic.database.card.CardPackage#getRarityType()
 * @model
 * @generated
 */
public enum RarityType implements Enumerator {
	/**
	 * The '<em><b>Common</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMON_VALUE
	 * @generated
	 * @ordered
	 */
	COMMON(0, "Common", "Common"),

	/**
	 * The '<em><b>Uncommon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCOMMON_VALUE
	 * @generated
	 * @ordered
	 */
	UNCOMMON(1, "Uncommon", "Uncommon"),

	/**
	 * The '<em><b>Rare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RARE_VALUE
	 * @generated
	 * @ordered
	 */
	RARE(2, "Rare", "Rare"),

	/**
	 * The '<em><b>Mythic Rare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYTHIC_RARE_VALUE
	 * @generated
	 * @ordered
	 */
	MYTHIC_RARE(3, "MythicRare", "Mythic Rare"),

	/**
	 * The '<em><b>Special</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL(4, "Special", "Special"),

	/**
	 * The '<em><b>Land</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAND_VALUE
	 * @generated
	 * @ordered
	 */
	LAND(5, "Land", "Land");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The '<em><b>Common</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Common</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMON
	 * @model name="Common"
	 * @generated
	 * @ordered
	 */
	public static final int COMMON_VALUE = 0;

	/**
	 * The '<em><b>Uncommon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uncommon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCOMMON
	 * @model name="Uncommon"
	 * @generated
	 * @ordered
	 */
	public static final int UNCOMMON_VALUE = 1;

	/**
	 * The '<em><b>Rare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RARE
	 * @model name="Rare"
	 * @generated
	 * @ordered
	 */
	public static final int RARE_VALUE = 2;

	/**
	 * The '<em><b>Mythic Rare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mythic Rare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYTHIC_RARE
	 * @model name="MythicRare" literal="Mythic Rare"
	 * @generated
	 * @ordered
	 */
	public static final int MYTHIC_RARE_VALUE = 3;

	/**
	 * The '<em><b>Special</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL
	 * @model name="Special"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_VALUE = 4;

	/**
	 * The '<em><b>Land</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Land</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAND
	 * @model name="Land"
	 * @generated
	 * @ordered
	 */
	public static final int LAND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Rarity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RarityType[] VALUES_ARRAY =
		new RarityType[] {
			COMMON,
			UNCOMMON,
			RARE,
			MYTHIC_RARE,
			SPECIAL,
			LAND,
		};

	/**
	 * A public read-only list of all the '<em><b>Rarity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RarityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rarity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RarityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RarityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rarity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RarityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RarityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rarity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RarityType get(int value) {
		switch (value) {
			case COMMON_VALUE: return COMMON;
			case UNCOMMON_VALUE: return UNCOMMON;
			case RARE_VALUE: return RARE;
			case MYTHIC_RARE_VALUE: return MYTHIC_RARE;
			case SPECIAL_VALUE: return SPECIAL;
			case LAND_VALUE: return LAND;
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
	private RarityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RarityType
