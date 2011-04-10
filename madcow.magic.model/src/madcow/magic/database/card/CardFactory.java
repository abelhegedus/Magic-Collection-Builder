/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see madcow.magic.database.card.CardPackage
 * @generated
 */
public interface CardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CardFactory eINSTANCE = madcow.magic.database.card.impl.CardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card</em>'.
	 * @generated
	 */
	Card createCard();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Creature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creature</em>'.
	 * @generated
	 */
	Creature createCreature();

	/**
	 * Returns a new object of class '<em>Enchancement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enchancement</em>'.
	 * @generated
	 */
	Enchancement createEnchancement();

	/**
	 * Returns a new object of class '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant</em>'.
	 * @generated
	 */
	Instant createInstant();

	/**
	 * Returns a new object of class '<em>Land</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Land</em>'.
	 * @generated
	 */
	Land createLand();

	/**
	 * Returns a new object of class '<em>Sorcery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorcery</em>'.
	 * @generated
	 */
	Sorcery createSorcery();

	/**
	 * Returns a new object of class '<em>Artifact Creature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Creature</em>'.
	 * @generated
	 */
	ArtifactCreature createArtifactCreature();

	/**
	 * Returns a new object of class '<em>Interrupt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt</em>'.
	 * @generated
	 */
	Interrupt createInterrupt();

	/**
	 * Returns a new object of class '<em>Planeswalker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planeswalker</em>'.
	 * @generated
	 */
	Planeswalker createPlaneswalker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CardPackage getCardPackage();

} //CardFactory
