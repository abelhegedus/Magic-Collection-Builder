/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.collection;

import madcow.magic.database.core.Database;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.collection.Collection#getContainers <em>Containers</em>}</li>
 *   <li>{@link madcow.magic.collection.Collection#getDecks <em>Decks</em>}</li>
 *   <li>{@link madcow.magic.collection.Collection#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.collection.CollectionPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends CollectionElement {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link madcow.magic.collection.Container}.
	 * It is bidirectional and its opposite is '{@link madcow.magic.collection.Container#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see madcow.magic.collection.CollectionPackage#getCollection_Containers()
	 * @see madcow.magic.collection.Container#getCollection
	 * @model opposite="collection" containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Decks</b></em>' containment reference list.
	 * The list contents are of type {@link madcow.magic.collection.Deck}.
	 * It is bidirectional and its opposite is '{@link madcow.magic.collection.Deck#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decks</em>' containment reference list.
	 * @see madcow.magic.collection.CollectionPackage#getCollection_Decks()
	 * @see madcow.magic.collection.Deck#getCollection
	 * @model opposite="collection" containment="true"
	 * @generated
	 */
	EList<Deck> getDecks();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see madcow.magic.collection.CollectionPackage#getCollection_Database()
	 * @model
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.Collection#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // Collection
