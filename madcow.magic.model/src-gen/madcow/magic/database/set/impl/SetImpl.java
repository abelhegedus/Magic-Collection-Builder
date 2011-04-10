/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.database.set.impl;

import java.util.Collection;
import java.util.Date;

import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardPackage;

import madcow.magic.database.core.impl.MagicDBElementImpl;

import madcow.magic.database.set.Block;
import madcow.magic.database.set.Set;
import madcow.magic.database.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.database.set.impl.SetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link madcow.magic.database.set.impl.SetImpl#getCardTotal <em>Card Total</em>}</li>
 *   <li>{@link madcow.magic.database.set.impl.SetImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link madcow.magic.database.set.impl.SetImpl#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetImpl extends MagicDBElementImpl implements Set {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET__CARD_TOTAL, oldCardTotal, cardTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		if (eContainerFeatureID() != SetPackage.SET__BLOCK) return null;
		return (Block)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, SetPackage.SET__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID() != SetPackage.SET__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, SetPackage.BLOCK__SETS, Block.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCards() {
		if (cards == null) {
			cards = new EObjectContainmentWithInverseEList<Card>(Card.class, this, SetPackage.SET__CARDS, CardPackage.CARD__SET);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.SET__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((Block)otherEnd, msgs);
			case SetPackage.SET__CARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCards()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.SET__BLOCK:
				return basicSetBlock(null, msgs);
			case SetPackage.SET__CARDS:
				return ((InternalEList<?>)getCards()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SetPackage.SET__BLOCK:
				return eInternalContainer().eInverseRemove(this, SetPackage.BLOCK__SETS, Block.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetPackage.SET__DATE:
				return getDate();
			case SetPackage.SET__CARD_TOTAL:
				return getCardTotal();
			case SetPackage.SET__BLOCK:
				return getBlock();
			case SetPackage.SET__CARDS:
				return getCards();
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
			case SetPackage.SET__DATE:
				setDate((Date)newValue);
				return;
			case SetPackage.SET__CARD_TOTAL:
				setCardTotal((Integer)newValue);
				return;
			case SetPackage.SET__BLOCK:
				setBlock((Block)newValue);
				return;
			case SetPackage.SET__CARDS:
				getCards().clear();
				getCards().addAll((Collection<? extends Card>)newValue);
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
			case SetPackage.SET__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SetPackage.SET__CARD_TOTAL:
				setCardTotal(CARD_TOTAL_EDEFAULT);
				return;
			case SetPackage.SET__BLOCK:
				setBlock((Block)null);
				return;
			case SetPackage.SET__CARDS:
				getCards().clear();
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
			case SetPackage.SET__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SetPackage.SET__CARD_TOTAL:
				return cardTotal != CARD_TOTAL_EDEFAULT;
			case SetPackage.SET__BLOCK:
				return getBlock() != null;
			case SetPackage.SET__CARDS:
				return cards != null && !cards.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", cardTotal: ");
		result.append(cardTotal);
		result.append(')');
		return result.toString();
	}

} //SetImpl
