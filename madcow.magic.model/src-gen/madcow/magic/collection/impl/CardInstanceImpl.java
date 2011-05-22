/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.collection.impl;

import madcow.magic.collection.CardCondition;
import madcow.magic.collection.CardInstance;
import madcow.magic.collection.CollectionPackage;

import madcow.magic.collection.Container;
import madcow.magic.database.card.Card;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.collection.impl.CardInstanceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CardInstanceImpl#isFoil <em>Foil</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CardInstanceImpl#getCard <em>Card</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CardInstanceImpl#isProxy <em>Proxy</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CardInstanceImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardInstanceImpl extends CollectionElementImpl implements CardInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final CardCondition CONDITION_EDEFAULT = CardCondition.MINT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected CardCondition condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFoil() <em>Foil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFoil()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFoil() <em>Foil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFoil()
	 * @generated
	 * @ordered
	 */
	protected boolean foil = FOIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected Card card;

	/**
	 * The default value of the '{@link #isProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROXY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected boolean proxy = PROXY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.CARD_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(CardCondition newCondition) {
		CardCondition oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.CARD_INSTANCE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFoil() {
		return foil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoil(boolean newFoil) {
		boolean oldFoil = foil;
		foil = newFoil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.CARD_INSTANCE__FOIL, oldFoil, foil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getCard() {
		if (card != null && card.eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (Card)eResolveProxy(oldCard);
			if (card != oldCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.CARD_INSTANCE__CARD, oldCard, card));
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(Card newCard) {
		Card oldCard = card;
		card = newCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.CARD_INSTANCE__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(boolean newProxy) {
		boolean oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.CARD_INSTANCE__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getContainer() {
		if (eContainerFeatureID() != CollectionPackage.CARD_INSTANCE__CONTAINER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, CollectionPackage.CARD_INSTANCE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != CollectionPackage.CARD_INSTANCE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, CollectionPackage.CONTAINER__CARDS, Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.CARD_INSTANCE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Container)otherEnd, msgs);
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
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, CollectionPackage.CONTAINER__CARDS, Container.class, msgs);
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
			case CollectionPackage.CARD_INSTANCE__CONDITION:
				return getCondition();
			case CollectionPackage.CARD_INSTANCE__FOIL:
				return isFoil();
			case CollectionPackage.CARD_INSTANCE__CARD:
				if (resolve) return getCard();
				return basicGetCard();
			case CollectionPackage.CARD_INSTANCE__PROXY:
				return isProxy();
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				return getContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollectionPackage.CARD_INSTANCE__CONDITION:
				setCondition((CardCondition)newValue);
				return;
			case CollectionPackage.CARD_INSTANCE__FOIL:
				setFoil((Boolean)newValue);
				return;
			case CollectionPackage.CARD_INSTANCE__CARD:
				setCard((Card)newValue);
				return;
			case CollectionPackage.CARD_INSTANCE__PROXY:
				setProxy((Boolean)newValue);
				return;
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				setContainer((Container)newValue);
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
			case CollectionPackage.CARD_INSTANCE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case CollectionPackage.CARD_INSTANCE__FOIL:
				setFoil(FOIL_EDEFAULT);
				return;
			case CollectionPackage.CARD_INSTANCE__CARD:
				setCard((Card)null);
				return;
			case CollectionPackage.CARD_INSTANCE__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				setContainer((Container)null);
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
			case CollectionPackage.CARD_INSTANCE__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case CollectionPackage.CARD_INSTANCE__FOIL:
				return foil != FOIL_EDEFAULT;
			case CollectionPackage.CARD_INSTANCE__CARD:
				return card != null;
			case CollectionPackage.CARD_INSTANCE__PROXY:
				return proxy != PROXY_EDEFAULT;
			case CollectionPackage.CARD_INSTANCE__CONTAINER:
				return getContainer() != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", foil: ");
		result.append(foil);
		result.append(", proxy: ");
		result.append(proxy);
		result.append(')');
		return result.toString();
	}

} //CardInstanceImpl
