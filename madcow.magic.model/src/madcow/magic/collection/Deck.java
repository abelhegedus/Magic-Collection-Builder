/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.collection;

import madcow.magic.database.card.Card;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.collection.Deck#getCards <em>Cards</em>}</li>
 *   <li>{@link madcow.magic.collection.Deck#getPlace <em>Place</em>}</li>
 *   <li>{@link madcow.magic.collection.Deck#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.collection.CollectionPackage#getDeck()
 * @model
 * @generated
 */
public interface Deck extends CollectionElement {
	/**
	 * Returns the value of the '<em><b>Cards</b></em>' reference list.
	 * The list contents are of type {@link madcow.magic.database.card.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' reference list.
	 * @see madcow.magic.collection.CollectionPackage#getDeck_Cards()
	 * @model
	 * @generated
	 */
	EList<Card> getCards();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see madcow.magic.collection.CollectionPackage#getDeck_Place()
	 * @model
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.Deck#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.collection.Collection#getDecks <em>Decks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see #setCollection(Collection)
	 * @see madcow.magic.collection.CollectionPackage#getDeck_Collection()
	 * @see madcow.magic.collection.Collection#getDecks
	 * @model opposite="decks" transient="false"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.Deck#getCollection <em>Collection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' container reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

} // Deck
