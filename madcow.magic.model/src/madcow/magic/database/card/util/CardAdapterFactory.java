/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card.util;

import madcow.magic.database.card.*;

import madcow.magic.database.core.MagicDBElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see madcow.magic.database.card.CardPackage
 * @generated
 */
public class CardAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CardPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CardPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardSwitch<Adapter> modelSwitch =
		new CardSwitch<Adapter>() {
			@Override
			public Adapter caseCard(Card object) {
				return createCardAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseCreature(Creature object) {
				return createCreatureAdapter();
			}
			@Override
			public Adapter caseEnchancement(Enchancement object) {
				return createEnchancementAdapter();
			}
			@Override
			public Adapter caseInstant(Instant object) {
				return createInstantAdapter();
			}
			@Override
			public Adapter caseLand(Land object) {
				return createLandAdapter();
			}
			@Override
			public Adapter caseSorcery(Sorcery object) {
				return createSorceryAdapter();
			}
			@Override
			public Adapter caseArtifactCreature(ArtifactCreature object) {
				return createArtifactCreatureAdapter();
			}
			@Override
			public Adapter caseInterrupt(Interrupt object) {
				return createInterruptAdapter();
			}
			@Override
			public Adapter casePlaneswalker(Planeswalker object) {
				return createPlaneswalkerAdapter();
			}
			@Override
			public Adapter caseMagicDBElement(MagicDBElement object) {
				return createMagicDBElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Creature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Creature
	 * @generated
	 */
	public Adapter createCreatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Enchancement <em>Enchancement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Enchancement
	 * @generated
	 */
	public Adapter createEnchancementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Instant
	 * @generated
	 */
	public Adapter createInstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Land <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Land
	 * @generated
	 */
	public Adapter createLandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Sorcery <em>Sorcery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Sorcery
	 * @generated
	 */
	public Adapter createSorceryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.ArtifactCreature <em>Artifact Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.ArtifactCreature
	 * @generated
	 */
	public Adapter createArtifactCreatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Interrupt
	 * @generated
	 */
	public Adapter createInterruptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.card.Planeswalker <em>Planeswalker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.card.Planeswalker
	 * @generated
	 */
	public Adapter createPlaneswalkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link madcow.magic.database.core.MagicDBElement <em>Magic DB Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see madcow.magic.database.core.MagicDBElement
	 * @generated
	 */
	public Adapter createMagicDBElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CardAdapterFactory
