/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.core;

import madcow.magic.database.card.Card;
import madcow.magic.database.set.Block;
import madcow.magic.database.set.Set;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.database.core.Database#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link madcow.magic.database.core.Database#getCardTotal <em>Card Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.database.core.DatabasePackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends MagicDBElement {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link madcow.magic.database.set.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see madcow.magic.database.core.DatabasePackage#getDatabase_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

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
	 * @see madcow.magic.database.core.DatabasePackage#getDatabase_CardTotal()
	 * @model derived="true"
	 * @generated
	 */
	int getCardTotal();

	/**
	 * Sets the value of the '{@link madcow.magic.database.core.Database#getCardTotal <em>Card Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Total</em>' attribute.
	 * @see #getCardTotal()
	 * @generated
	 */
	void setCardTotal(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Set findSetByName(String setName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Card findCardByName(String cardName);

} // Database
