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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.database.card.Creature#getPower <em>Power</em>}</li>
 *   <li>{@link madcow.magic.database.card.Creature#getToughness <em>Toughness</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.database.card.CardPackage#getCreature()
 * @model
 * @generated
 */
public interface Creature extends Card {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(int)
	 * @see madcow.magic.database.card.CardPackage#getCreature_Power()
	 * @model
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Creature#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Returns the value of the '<em><b>Toughness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toughness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toughness</em>' attribute.
	 * @see #setToughness(int)
	 * @see madcow.magic.database.card.CardPackage#getCreature_Toughness()
	 * @model
	 * @generated
	 */
	int getToughness();

	/**
	 * Sets the value of the '{@link madcow.magic.database.card.Creature#getToughness <em>Toughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toughness</em>' attribute.
	 * @see #getToughness()
	 * @generated
	 */
	void setToughness(int value);

} // Creature
