/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.core.impl;

import java.util.Collection;

import madcow.magic.database.card.Card;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.DatabasePackage;
import madcow.magic.database.set.Block;
import madcow.magic.database.set.Set;
import org.eclipse.emf.common.notify.Notification;
import madcow.magic.database.set.SetFactory;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.database.core.impl.DatabaseImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link madcow.magic.database.core.impl.DatabaseImpl#getCardTotal <em>Card Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends MagicDBElementImpl implements Database {
	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The default value of the '{@link #getCardTotal() <em>Card Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_TOTAL_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getCardTotal() <em>Card Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTotal()
	 * @generated
	 * @ordered
	 */
	protected int cardTotal = CARD_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<Block>(Block.class, this, DatabasePackage.DATABASE__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardTotal() {
		return cardTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardTotal(int newCardTotal) {
		int oldCardTotal = cardTotal;
		cardTotal = newCardTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__CARD_TOTAL, oldCardTotal, cardTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Set findSetByName(String setName) {

		Set result = null;
		
		for (Block block : getBlocks()) {
			for (Set set : block.getSets()) {
				if(set.getName().equals(setName)){
					result = set;
					break;
				}
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Card findCardByName(String cardName) {
		
		Card result = null;
		
		for (Block block : getBlocks()) {
			for (Set set : block.getSets()) {
				for (Card card : set.getCards()) {
					if (card.getName().equals(cardName)) {
						if(null == card.getOriginalCard()){
							result = card;
						} else {
							result = card.getOriginalCard();
						}
						return result;
					}
				}
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.DATABASE__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.DATABASE__BLOCKS:
				return getBlocks();
			case DatabasePackage.DATABASE__CARD_TOTAL:
				return getCardTotal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.DATABASE__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case DatabasePackage.DATABASE__CARD_TOTAL:
				setCardTotal((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabasePackage.DATABASE__BLOCKS:
				getBlocks().clear();
				return;
			case DatabasePackage.DATABASE__CARD_TOTAL:
				setCardTotal(CARD_TOTAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.DATABASE__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case DatabasePackage.DATABASE__CARD_TOTAL:
				return cardTotal != CARD_TOTAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardTotal: ");
		result.append(cardTotal);
		result.append(')');
		return result.toString();
	}

	@Override
	public int initializeFromCSV(EList<EList<String>> values, int index) {
		index = super.initializeFromCSV(values, index)+1;
		
		while(index < values.size() && 0 < values.get(index).size()){
			EList<String> line = values.get(index);
			
			if(line.get(0).equals("BLOCK")){
				Block block = SetFactory.eINSTANCE.createBlock();
				getBlocks().add(block);
				index = block.initializeFromCSV(values, index);
			}
			
		}
		
		return index;
	}
} //DatabaseImpl
