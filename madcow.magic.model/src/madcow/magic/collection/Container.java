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
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.collection.Container#getCards <em>Cards</em>}</li>
 *   <li>{@link madcow.magic.collection.Container#getPlace <em>Place</em>}</li>
 *   <li>{@link madcow.magic.collection.Container#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.collection.CollectionPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends CollectionElement {
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
	 * @see madcow.magic.collection.CollectionPackage#getContainer_Cards()
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
	 * @see madcow.magic.collection.CollectionPackage#getContainer_Place()
	 * @model
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.Container#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.collection.Collection#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see #setCollection(Collection)
	 * @see madcow.magic.collection.CollectionPackage#getContainer_Collection()
	 * @see madcow.magic.collection.Collection#getContainers
	 * @model opposite="containers" transient="false"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.Container#getCollection <em>Collection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' container reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

} // Container
