/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
