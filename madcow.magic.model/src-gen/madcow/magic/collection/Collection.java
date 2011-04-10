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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

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
