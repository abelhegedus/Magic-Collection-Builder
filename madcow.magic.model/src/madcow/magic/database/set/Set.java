/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.set;

import java.util.Date;

import madcow.magic.database.card.Card;

import madcow.magic.database.core.MagicDBElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.database.set.Set#getDate <em>Date</em>}</li>
 *   <li>{@link madcow.magic.database.set.Set#getCardTotal <em>Card Total</em>}</li>
 *   <li>{@link madcow.magic.database.set.Set#getBlock <em>Block</em>}</li>
 *   <li>{@link madcow.magic.database.set.Set#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.database.set.SetPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends MagicDBElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see madcow.magic.database.set.SetPackage#getSet_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link madcow.magic.database.set.Set#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Card Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Total</em>' attribute.
	 * @see #setCardTotal(int)
	 * @see madcow.magic.database.set.SetPackage#getSet_CardTotal()
	 * @model
	 * @generated
	 */
	int getCardTotal();

	/**
	 * Sets the value of the '{@link madcow.magic.database.set.Set#getCardTotal <em>Card Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Total</em>' attribute.
	 * @see #getCardTotal()
	 * @generated
	 */
	void setCardTotal(int value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.set.Block#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(Block)
	 * @see madcow.magic.database.set.SetPackage#getSet_Block()
	 * @see madcow.magic.database.set.Block#getSets
	 * @model opposite="sets" transient="false"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link madcow.magic.database.set.Set#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
	 * The list contents are of type {@link madcow.magic.database.card.Card}.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.card.Card#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' containment reference list.
	 * @see madcow.magic.database.set.SetPackage#getSet_Cards()
	 * @see madcow.magic.database.card.Card#getSet
	 * @model opposite="set" containment="true"
	 * @generated
	 */
	EList<Card> getCards();

} // Set
