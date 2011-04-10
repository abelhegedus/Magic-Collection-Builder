/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card;

import madcow.magic.database.core.MagicDBElement;

import madcow.magic.database.set.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.database.card.Card#getNumber <em>Number</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getManacost <em>Manacost</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getConvertedManaCost <em>Converted Mana Cost</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getArtist <em>Artist</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#isLegendary <em>Legendary</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getRarity <em>Rarity</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getOriginalCard <em>Original Card</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getSet <em>Set</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#isTribal <em>Tribal</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getManacostString <em>Manacost String</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getTypeString <em>Type String</em>}</li>
 *   <li>{@link madcow.magic.database.card.Card#getReprints <em>Reprints</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.database.card.CardPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends MagicDBElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see madcow.magic.database.card.CardPackage#getCard_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Manacost</b></em>' attribute list.
	 * The list contents are of type {@link madcow.magic.database.card.ManaType}.
	 * The literals are from the enumeration {@link madcow.magic.database.card.ManaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manacost</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manacost</em>' attribute list.
	 * @see madcow.magic.database.card.ManaType
	 * @see madcow.magic.database.card.CardPackage#getCard_Manacost()
	 * @model unique="false"
	 * @generated
	 */
	EList<ManaType> getManacost();

	/**
	 * Returns the value of the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converted Mana Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converted Mana Cost</em>' attribute.
	 * @see #setConvertedManaCost(int)
	 * @see madcow.magic.database.card.CardPackage#getCard_ConvertedManaCost()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getConvertedManaCost();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getConvertedManaCost <em>Converted Mana Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted Mana Cost</em>' attribute.
	 * @see #getConvertedManaCost()
	 * @generated
	 */
	void setConvertedManaCost(int value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' attribute.
	 * @see #setArtist(String)
	 * @see madcow.magic.database.card.CardPackage#getCard_Artist()
	 * @model
	 * @generated
	 */
	String getArtist();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getArtist <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' attribute.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(String value);

	/**
	 * Returns the value of the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legendary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legendary</em>' attribute.
	 * @see #setLegendary(boolean)
	 * @see madcow.magic.database.card.CardPackage#getCard_Legendary()
	 * @model
	 * @generated
	 */
	boolean isLegendary();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#isLegendary <em>Legendary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legendary</em>' attribute.
	 * @see #isLegendary()
	 * @generated
	 */
	void setLegendary(boolean value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see madcow.magic.database.card.CardPackage#getCard_Subtype()
	 * @model
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Rarity</b></em>' attribute.
	 * The literals are from the enumeration {@link madcow.magic.database.card.RarityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rarity</em>' attribute.
	 * @see madcow.magic.database.card.RarityType
	 * @see #setRarity(RarityType)
	 * @see madcow.magic.database.card.CardPackage#getCard_Rarity()
	 * @model
	 * @generated
	 */
	RarityType getRarity();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see madcow.magic.database.card.RarityType
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(RarityType value);

	/**
	 * Returns the value of the '<em><b>Original Card</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.card.Card#getReprints <em>Reprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Card</em>' reference.
	 * @see #setOriginalCard(Card)
	 * @see madcow.magic.database.card.CardPackage#getCard_OriginalCard()
	 * @see madcow.magic.database.card.Card#getReprints
	 * @model opposite="reprints"
	 * @generated
	 */
	Card getOriginalCard();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getOriginalCard <em>Original Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Card</em>' reference.
	 * @see #getOriginalCard()
	 * @generated
	 */
	void setOriginalCard(Card value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.set.Set#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' container reference.
	 * @see #setSet(Set)
	 * @see madcow.magic.database.card.CardPackage#getCard_Set()
	 * @see madcow.magic.database.set.Set#getCards
	 * @model opposite="cards" transient="false"
	 * @generated
	 */
	Set getSet();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getSet <em>Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' container reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(Set value);

	/**
	 * Returns the value of the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tribal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tribal</em>' attribute.
	 * @see #setTribal(boolean)
	 * @see madcow.magic.database.card.CardPackage#getCard_Tribal()
	 * @model
	 * @generated
	 */
	boolean isTribal();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#isTribal <em>Tribal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tribal</em>' attribute.
	 * @see #isTribal()
	 * @generated
	 */
	void setTribal(boolean value);

	/**
	 * Returns the value of the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manacost String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manacost String</em>' attribute.
	 * @see #setManacostString(String)
	 * @see madcow.magic.database.card.CardPackage#getCard_ManacostString()
	 * @model
	 * @generated
	 */
	String getManacostString();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getManacostString <em>Manacost String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manacost String</em>' attribute.
	 * @see #getManacostString()
	 * @generated
	 */
	void setManacostString(String value);

	/**
	 * Returns the value of the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type String</em>' attribute.
	 * @see #setTypeString(String)
	 * @see madcow.magic.database.card.CardPackage#getCard_TypeString()
	 * @model
	 * @generated
	 */
	String getTypeString();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Card#getTypeString <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type String</em>' attribute.
	 * @see #getTypeString()
	 * @generated
	 */
	void setTypeString(String value);

	/**
	 * Returns the value of the '<em><b>Reprints</b></em>' reference list.
	 * The list contents are of type {@link madcow.magic.database.card.Card}.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.card.Card#getOriginalCard <em>Original Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reprints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reprints</em>' reference list.
	 * @see madcow.magic.database.card.CardPackage#getCard_Reprints()
	 * @see madcow.magic.database.card.Card#getOriginalCard
	 * @model opposite="originalCard"
	 * @generated
	 */
	EList<Card> getReprints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean parseType(String typeString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean parseManaCost(String manaCostString);

} // Card
