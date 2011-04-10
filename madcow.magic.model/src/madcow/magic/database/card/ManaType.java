/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mana Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see madcow.magic.database.card.CardPackage#getManaType()
 * @model
 * @generated
 */
public enum ManaType implements Enumerator {
	/**
	 * The '<em><b>Colorless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLORLESS_VALUE
	 * @generated
	 * @ordered
	 */
	COLORLESS(0, "Colorless", "C"),

	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(1, "White", "W"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(2, "Blue", "U"),

	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(3, "Black", "B"),

	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(4, "Red", "R"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(5, "Green", "G"),

	/**
	 * The '<em><b>White Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_BLUE(6, "WhiteBlue", "{W/U}"),

	/**
	 * The '<em><b>Blue Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE_BLACK(7, "BlueBlack", "{U/B}"),

	/**
	 * The '<em><b>Black Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_RED_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK_RED(8, "BlackRed", "{B/R}"),

	/**
	 * The '<em><b>Red Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	RED_GREEN(9, "RedGreen", "{R/G}"),

	/**
	 * The '<em><b>Green White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN_WHITE(10, "GreenWhite", "{G/W}"),

	/**
	 * The '<em><b>White Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_BLACK(11, "WhiteBlack", "{W/B}"),

	/**
	 * The '<em><b>Blue Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_RED_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE_RED(12, "BlueRed", "{U/R}"),

	/**
	 * The '<em><b>Black Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK_GREEN(13, "BlackGreen", "{B/G}"),

	/**
	 * The '<em><b>Red White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	RED_WHITE(14, "RedWhite", "{R/W}"),

	/**
	 * The '<em><b>Green Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN_BLUE(15, "GreenBlue", "{G/U}"), /**
	 * The '<em><b>Two White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_WHITE(16, "TwoWhite", "{2/W}"), /**
	 * The '<em><b>Two Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_BLUE(17, "TwoBlue", "{2/U}"), /**
	 * The '<em><b>Two Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_BLACK(18, "TwoBlack", "{2/B}"), /**
	 * The '<em><b>Two Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_RED_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_RED(19, "TwoRed", "{2/R}"), /**
	 * The '<em><b>Two Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_GREEN(20, "TwoGreen", "{2/G}"), /**
	 * The '<em><b>Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY(-1, "Many", "X"), /**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(-2, "Other", "O");

	/**
	 * The '<em><b>Colorless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Colorless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLORLESS
	 * @model name="Colorless" literal="C"
	 * @generated
	 * @ordered
	 */
	public static final int COLORLESS_VALUE = 0;

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model name="White" literal="W"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 1;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="Blue" literal="U"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 2;

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="Black" literal="B"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 3;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="Red" literal="R"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 4;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="Green" literal="G"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 5;

	/**
	 * The '<em><b>White Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE_BLUE
	 * @model name="WhiteBlue" literal="{W/U}"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_BLUE_VALUE = 6;

	/**
	 * The '<em><b>Blue Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE_BLACK
	 * @model name="BlueBlack" literal="{U/B}"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_BLACK_VALUE = 7;

	/**
	 * The '<em><b>Black Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK_RED
	 * @model name="BlackRed" literal="{B/R}"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_RED_VALUE = 8;

	/**
	 * The '<em><b>Red Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED_GREEN
	 * @model name="RedGreen" literal="{R/G}"
	 * @generated
	 * @ordered
	 */
	public static final int RED_GREEN_VALUE = 9;

	/**
	 * The '<em><b>Green White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN_WHITE
	 * @model name="GreenWhite" literal="{G/W}"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_WHITE_VALUE = 10;

	/**
	 * The '<em><b>White Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE_BLACK
	 * @model name="WhiteBlack" literal="{W/B}"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_BLACK_VALUE = 11;

	/**
	 * The '<em><b>Blue Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE_RED
	 * @model name="BlueRed" literal="{U/R}"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_RED_VALUE = 12;

	/**
	 * The '<em><b>Black Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK_GREEN
	 * @model name="BlackGreen" literal="{B/G}"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_GREEN_VALUE = 13;

	/**
	 * The '<em><b>Red White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED_WHITE
	 * @model name="RedWhite" literal="{R/W}"
	 * @generated
	 * @ordered
	 */
	public static final int RED_WHITE_VALUE = 14;

	/**
	 * The '<em><b>Green Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN_BLUE
	 * @model name="GreenBlue" literal="{G/U}"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_BLUE_VALUE = 15;

	/**
	 * The '<em><b>Two White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_WHITE
	 * @model name="TwoWhite" literal="{2/W}"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_WHITE_VALUE = 16;

	/**
	 * The '<em><b>Two Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_BLUE
	 * @model name="TwoBlue" literal="{2/U}"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_BLUE_VALUE = 17;

	/**
	 * The '<em><b>Two Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_BLACK
	 * @model name="TwoBlack" literal="{2/B}"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_BLACK_VALUE = 18;

	/**
	 * The '<em><b>Two Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_RED
	 * @model name="TwoRed" literal="{2/R}"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_RED_VALUE = 19;

	/**
	 * The '<em><b>Two Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_GREEN
	 * @model name="TwoGreen" literal="{2/G}"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_GREEN_VALUE = 20;

	/**
	 * The '<em><b>Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY
	 * @model name="Many" literal="X"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_VALUE = -1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other" literal="O"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = -2;

	/**
	 * An array of all the '<em><b>Mana Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ManaType[] VALUES_ARRAY =
		new ManaType[] {
			COLORLESS,
			WHITE,
			BLUE,
			BLACK,
			RED,
			GREEN,
			WHITE_BLUE,
			BLUE_BLACK,
			BLACK_RED,
			RED_GREEN,
			GREEN_WHITE,
			WHITE_BLACK,
			BLUE_RED,
			BLACK_GREEN,
			RED_WHITE,
			GREEN_BLUE,
			TWO_WHITE,
			TWO_BLUE,
			TWO_BLACK,
			TWO_RED,
			TWO_GREEN,
			MANY,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Mana Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ManaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mana Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mana Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ManaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mana Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManaType get(int value) {
		switch (value) {
			case COLORLESS_VALUE: return COLORLESS;
			case WHITE_VALUE: return WHITE;
			case BLUE_VALUE: return BLUE;
			case BLACK_VALUE: return BLACK;
			case RED_VALUE: return RED;
			case GREEN_VALUE: return GREEN;
			case WHITE_BLUE_VALUE: return WHITE_BLUE;
			case BLUE_BLACK_VALUE: return BLUE_BLACK;
			case BLACK_RED_VALUE: return BLACK_RED;
			case RED_GREEN_VALUE: return RED_GREEN;
			case GREEN_WHITE_VALUE: return GREEN_WHITE;
			case WHITE_BLACK_VALUE: return WHITE_BLACK;
			case BLUE_RED_VALUE: return BLUE_RED;
			case BLACK_GREEN_VALUE: return BLACK_GREEN;
			case RED_WHITE_VALUE: return RED_WHITE;
			case GREEN_BLUE_VALUE: return GREEN_BLUE;
			case TWO_WHITE_VALUE: return TWO_WHITE;
			case TWO_BLUE_VALUE: return TWO_BLUE;
			case TWO_BLACK_VALUE: return TWO_BLACK;
			case TWO_RED_VALUE: return TWO_RED;
			case TWO_GREEN_VALUE: return TWO_GREEN;
			case MANY_VALUE: return MANY;
			case OTHER_VALUE: return OTHER;
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
	private ManaType(int value, String name, String literal) {
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
	
} //ManaType
