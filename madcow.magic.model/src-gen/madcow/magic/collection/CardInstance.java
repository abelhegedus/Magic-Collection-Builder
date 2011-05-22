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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.collection.CardInstance#getCondition <em>Condition</em>}</li>
 *   <li>{@link madcow.magic.collection.CardInstance#isFoil <em>Foil</em>}</li>
 *   <li>{@link madcow.magic.collection.CardInstance#getCard <em>Card</em>}</li>
 *   <li>{@link madcow.magic.collection.CardInstance#isProxy <em>Proxy</em>}</li>
 *   <li>{@link madcow.magic.collection.CardInstance#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.collection.CollectionPackage#getCardInstance()
 * @model
 * @generated
 */
public interface CardInstance extends CollectionElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link madcow.magic.collection.CardCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see madcow.magic.collection.CardCondition
	 * @see #setCondition(CardCondition)
	 * @see madcow.magic.collection.CollectionPackage#getCardInstance_Condition()
	 * @model
	 * @generated
	 */
	CardCondition getCondition();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.CardInstance#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see madcow.magic.collection.CardCondition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CardCondition value);

	/**
	 * Returns the value of the '<em><b>Foil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foil</em>' attribute.
	 * @see #setFoil(boolean)
	 * @see madcow.magic.collection.CollectionPackage#getCardInstance_Foil()
	 * @model
	 * @generated
	 */
	boolean isFoil();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.CardInstance#isFoil <em>Foil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foil</em>' attribute.
	 * @see #isFoil()
	 * @generated
	 */
	void setFoil(boolean value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(Card)
	 * @see madcow.magic.collection.CollectionPackage#getCardInstance_Card()
	 * @model required="true"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.CardInstance#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(boolean)
	 * @see madcow.magic.collection.CollectionPackage#getCardInstance_Proxy()
	 * @model
	 * @generated
	 */
	boolean isProxy();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.CardInstance#isProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #isProxy()
	 * @generated
	 */
	void setProxy(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.collection.Container#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see madcow.magic.collection.CollectionPackage#getCardInstance_Container()
	 * @see madcow.magic.collection.Container#getCards
	 * @model opposite="cards" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link madcow.magic.collection.CardInstance#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // CardInstance
