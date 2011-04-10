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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

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
