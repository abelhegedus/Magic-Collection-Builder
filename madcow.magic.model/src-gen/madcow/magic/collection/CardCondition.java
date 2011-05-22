/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Card Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see madcow.magic.collection.CollectionPackage#getCardCondition()
 * @model
 * @generated
 */
public enum CardCondition implements Enumerator {
	/**
	 * The '<em><b>Mint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINT_VALUE
	 * @generated
	 * @ordered
	 */
	MINT(0, "Mint", "Mint"),

	/**
	 * The '<em><b>Near Mint Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR_MINT_PLUS(1, "NearMintPlus", "NearMintPlus"),

	/**
	 * The '<em><b>Near Mint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR_MINT(2, "NearMint", "NearMint"),

	/**
	 * The '<em><b>Near Mint Minus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT_MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR_MINT_MINUS(3, "NearMintMinus", "NearMintMinus"),

	/**
	 * The '<em><b>Excellent Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	EXCELLENT_PLUS(4, "ExcellentPlus", "ExcellentPlus"),

	/**
	 * The '<em><b>Excellent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXCELLENT(5, "Excellent", "Excellent"),

	/**
	 * The '<em><b>Excellent Minus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	EXCELLENT_MINUS(6, "ExcellentMinus", "ExcellentMinus"),

	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD(7, "Good", "Good"),

	/**
	 * The '<em><b>Poor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR_VALUE
	 * @generated
	 * @ordered
	 */
	POOR(8, "Poor", "Poor"),

	/**
	 * The '<em><b>Played</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYED_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYED(9, "Played", "Played");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The '<em><b>Mint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINT
	 * @model name="Mint"
	 * @generated
	 * @ordered
	 */
	public static final int MINT_VALUE = 0;

	/**
	 * The '<em><b>Near Mint Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Near Mint Plus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT_PLUS
	 * @model name="NearMintPlus"
	 * @generated
	 * @ordered
	 */
	public static final int NEAR_MINT_PLUS_VALUE = 1;

	/**
	 * The '<em><b>Near Mint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Near Mint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT
	 * @model name="NearMint"
	 * @generated
	 * @ordered
	 */
	public static final int NEAR_MINT_VALUE = 2;

	/**
	 * The '<em><b>Near Mint Minus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Near Mint Minus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEAR_MINT_MINUS
	 * @model name="NearMintMinus"
	 * @generated
	 * @ordered
	 */
	public static final int NEAR_MINT_MINUS_VALUE = 3;

	/**
	 * The '<em><b>Excellent Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Excellent Plus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_PLUS
	 * @model name="ExcellentPlus"
	 * @generated
	 * @ordered
	 */
	public static final int EXCELLENT_PLUS_VALUE = 4;

	/**
	 * The '<em><b>Excellent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Excellent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT
	 * @model name="Excellent"
	 * @generated
	 * @ordered
	 */
	public static final int EXCELLENT_VALUE = 5;

	/**
	 * The '<em><b>Excellent Minus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Excellent Minus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_MINUS
	 * @model name="ExcellentMinus"
	 * @generated
	 * @ordered
	 */
	public static final int EXCELLENT_MINUS_VALUE = 6;

	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Good</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @model name="Good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_VALUE = 7;

	/**
	 * The '<em><b>Poor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POOR
	 * @model name="Poor"
	 * @generated
	 * @ordered
	 */
	public static final int POOR_VALUE = 8;

	/**
	 * The '<em><b>Played</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Played</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYED
	 * @model name="Played"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYED_VALUE = 9;

	/**
	 * An array of all the '<em><b>Card Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardCondition[] VALUES_ARRAY =
		new CardCondition[] {
			MINT,
			NEAR_MINT_PLUS,
			NEAR_MINT,
			NEAR_MINT_MINUS,
			EXCELLENT_PLUS,
			EXCELLENT,
			EXCELLENT_MINUS,
			GOOD,
			POOR,
			PLAYED,
		};

	/**
	 * A public read-only list of all the '<em><b>Card Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CardCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Card Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardCondition get(int value) {
		switch (value) {
			case MINT_VALUE: return MINT;
			case NEAR_MINT_PLUS_VALUE: return NEAR_MINT_PLUS;
			case NEAR_MINT_VALUE: return NEAR_MINT;
			case NEAR_MINT_MINUS_VALUE: return NEAR_MINT_MINUS;
			case EXCELLENT_PLUS_VALUE: return EXCELLENT_PLUS;
			case EXCELLENT_VALUE: return EXCELLENT;
			case EXCELLENT_MINUS_VALUE: return EXCELLENT_MINUS;
			case GOOD_VALUE: return GOOD;
			case POOR_VALUE: return POOR;
			case PLAYED_VALUE: return PLAYED;
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
	private CardCondition(int value, String name, String literal) {
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
	
} //CardCondition
