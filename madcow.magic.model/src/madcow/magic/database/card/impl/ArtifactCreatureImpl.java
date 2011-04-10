/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card.impl;

import madcow.magic.database.card.ArtifactCreature;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.card.Creature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Creature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArtifactCreatureImpl extends CreatureImpl implements ArtifactCreature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactCreatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardPackage.Literals.ARTIFACT_CREATURE;
	}

	@Override
	public int initializeFromCSV(EList<EList<String>> values, int index) {
		// TODO Auto-generated method stub
		return super.initializeFromCSV(values, index);
		
	}
} //ArtifactCreatureImpl
