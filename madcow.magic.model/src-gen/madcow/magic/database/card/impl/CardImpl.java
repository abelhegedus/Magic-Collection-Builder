/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.database.card.impl;

import java.util.Collection;

import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.card.ManaType;
import madcow.magic.database.card.RarityType;

import madcow.magic.database.core.impl.MagicDBElementImpl;

import madcow.magic.database.set.Set;
import madcow.magic.database.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getManacost <em>Manacost</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getConvertedManaCost <em>Converted Mana Cost</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#isLegendary <em>Legendary</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getOriginalCard <em>Original Card</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getSet <em>Set</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#isTribal <em>Tribal</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getManacostString <em>Manacost String</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getTypeString <em>Type String</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CardImpl#getReprints <em>Reprints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MagicDBElementImpl implements Card {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManacost() <em>Manacost</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManacost()
	 * @generated
	 * @ordered
	 */
	protected EList<ManaType> manacost;

	/**
	 * The default value of the '{@link #getConvertedManaCost() <em>Converted Mana Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedManaCost()
	 * @generated
	 * @ordered
	 */
	protected static final int CONVERTED_MANA_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConvertedManaCost() <em>Converted Mana Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedManaCost()
	 * @generated
	 * @ordered
	 */
	protected int convertedManaCost = CONVERTED_MANA_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtist() <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected String artist = ARTIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isLegendary() <em>Legendary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegendary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEGENDARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLegendary() <em>Legendary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegendary()
	 * @generated
	 * @ordered
	 */
	protected boolean legendary = LEGENDARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected static final RarityType RARITY_EDEFAULT = RarityType.COMMON;

	/**
	 * The cached value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected RarityType rarity = RARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalCard() <em>Original Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalCard()
	 * @generated
	 * @ordered
	 */
	protected Card originalCard;

	/**
	 * The default value of the '{@link #isTribal() <em>Tribal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTribal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIBAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTribal() <em>Tribal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTribal()
	 * @generated
	 * @ordered
	 */
	protected boolean tribal = TRIBAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getManacostString() <em>Manacost String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManacostString()
	 * @generated
	 * @ordered
	 */
	protected static final String MANACOST_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManacostString() <em>Manacost String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManacostString()
	 * @generated
	 * @ordered
	 */
	protected String manacostString = MANACOST_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected String typeString = TYPE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReprints() <em>Reprints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReprints()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> reprints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManaType> getManacost() {
		if (manacost == null) {
			manacost = new EDataTypeEList<ManaType>(ManaType.class, this, CardPackage.CARD__MANACOST);
		}
		return manacost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConvertedManaCost() {
		return convertedManaCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertedManaCost(int newConvertedManaCost) {
		int oldConvertedManaCost = convertedManaCost;
		convertedManaCost = newConvertedManaCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__CONVERTED_MANA_COST, oldConvertedManaCost, convertedManaCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(String newArtist) {
		String oldArtist = artist;
		artist = newArtist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__ARTIST, oldArtist, artist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLegendary() {
		return legendary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendary(boolean newLegendary) {
		boolean oldLegendary = legendary;
		legendary = newLegendary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__LEGENDARY, oldLegendary, legendary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RarityType getRarity() {
		return rarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRarity(RarityType newRarity) {
		RarityType oldRarity = rarity;
		rarity = newRarity == null ? RARITY_EDEFAULT : newRarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getOriginalCard() {
		if (originalCard != null && originalCard.eIsProxy()) {
			InternalEObject oldOriginalCard = (InternalEObject)originalCard;
			originalCard = (Card)eResolveProxy(oldOriginalCard);
			if (originalCard != oldOriginalCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CardPackage.CARD__ORIGINAL_CARD, oldOriginalCard, originalCard));
			}
		}
		return originalCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetOriginalCard() {
		return originalCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalCard(Card newOriginalCard, NotificationChain msgs) {
		Card oldOriginalCard = originalCard;
		originalCard = newOriginalCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardPackage.CARD__ORIGINAL_CARD, oldOriginalCard, newOriginalCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalCard(Card newOriginalCard) {
		if (newOriginalCard != originalCard) {
			NotificationChain msgs = null;
			if (originalCard != null)
				msgs = ((InternalEObject)originalCard).eInverseRemove(this, CardPackage.CARD__REPRINTS, Card.class, msgs);
			if (newOriginalCard != null)
				msgs = ((InternalEObject)newOriginalCard).eInverseAdd(this, CardPackage.CARD__REPRINTS, Card.class, msgs);
			msgs = basicSetOriginalCard(newOriginalCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__ORIGINAL_CARD, newOriginalCard, newOriginalCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getSet() {
		if (eContainerFeatureID() != CardPackage.CARD__SET) return null;
		return (Set)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(Set newSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSet, CardPackage.CARD__SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(Set newSet) {
		if (newSet != eInternalContainer() || (eContainerFeatureID() != CardPackage.CARD__SET && newSet != null)) {
			if (EcoreUtil.isAncestor(this, newSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSet != null)
				msgs = ((InternalEObject)newSet).eInverseAdd(this, SetPackage.SET__CARDS, Set.class, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__SET, newSet, newSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTribal() {
		return tribal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTribal(boolean newTribal) {
		boolean oldTribal = tribal;
		tribal = newTribal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__TRIBAL, oldTribal, tribal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManacostString() {
		return manacostString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManacostString(String newManacostString) {
		String oldManacostString = manacostString;
		manacostString = newManacostString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__MANACOST_STRING, oldManacostString, manacostString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeString() {
		return typeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeString(String newTypeString) {
		String oldTypeString = typeString;
		typeString = newTypeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CARD__TYPE_STRING, oldTypeString, typeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getReprints() {
		if (reprints == null) {
			reprints = new EObjectWithInverseResolvingEList<Card>(Card.class, this, CardPackage.CARD__REPRINTS, CardPackage.CARD__ORIGINAL_CARD);
		}
		return reprints;
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
			case CardPackage.CARD__ORIGINAL_CARD:
				if (originalCard != null)
					msgs = ((InternalEObject)originalCard).eInverseRemove(this, CardPackage.CARD__REPRINTS, Card.class, msgs);
				return basicSetOriginalCard((Card)otherEnd, msgs);
			case CardPackage.CARD__SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSet((Set)otherEnd, msgs);
			case CardPackage.CARD__REPRINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReprints()).basicAdd(otherEnd, msgs);
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
			case CardPackage.CARD__ORIGINAL_CARD:
				return basicSetOriginalCard(null, msgs);
			case CardPackage.CARD__SET:
				return basicSetSet(null, msgs);
			case CardPackage.CARD__REPRINTS:
				return ((InternalEList<?>)getReprints()).basicRemove(otherEnd, msgs);
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
			case CardPackage.CARD__SET:
				return eInternalContainer().eInverseRemove(this, SetPackage.SET__CARDS, Set.class, msgs);
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
			case CardPackage.CARD__NUMBER:
				return getNumber();
			case CardPackage.CARD__MANACOST:
				return getManacost();
			case CardPackage.CARD__CONVERTED_MANA_COST:
				return getConvertedManaCost();
			case CardPackage.CARD__ARTIST:
				return getArtist();
			case CardPackage.CARD__LEGENDARY:
				return isLegendary();
			case CardPackage.CARD__SUBTYPE:
				return getSubtype();
			case CardPackage.CARD__RARITY:
				return getRarity();
			case CardPackage.CARD__ORIGINAL_CARD:
				if (resolve) return getOriginalCard();
				return basicGetOriginalCard();
			case CardPackage.CARD__SET:
				return getSet();
			case CardPackage.CARD__TRIBAL:
				return isTribal();
			case CardPackage.CARD__MANACOST_STRING:
				return getManacostString();
			case CardPackage.CARD__TYPE_STRING:
				return getTypeString();
			case CardPackage.CARD__REPRINTS:
				return getReprints();
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
			case CardPackage.CARD__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CardPackage.CARD__MANACOST:
				getManacost().clear();
				getManacost().addAll((Collection<? extends ManaType>)newValue);
				return;
			case CardPackage.CARD__CONVERTED_MANA_COST:
				setConvertedManaCost((Integer)newValue);
				return;
			case CardPackage.CARD__ARTIST:
				setArtist((String)newValue);
				return;
			case CardPackage.CARD__LEGENDARY:
				setLegendary((Boolean)newValue);
				return;
			case CardPackage.CARD__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case CardPackage.CARD__RARITY:
				setRarity((RarityType)newValue);
				return;
			case CardPackage.CARD__ORIGINAL_CARD:
				setOriginalCard((Card)newValue);
				return;
			case CardPackage.CARD__SET:
				setSet((Set)newValue);
				return;
			case CardPackage.CARD__TRIBAL:
				setTribal((Boolean)newValue);
				return;
			case CardPackage.CARD__MANACOST_STRING:
				setManacostString((String)newValue);
				return;
			case CardPackage.CARD__TYPE_STRING:
				setTypeString((String)newValue);
				return;
			case CardPackage.CARD__REPRINTS:
				getReprints().clear();
				getReprints().addAll((Collection<? extends Card>)newValue);
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
			case CardPackage.CARD__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CardPackage.CARD__MANACOST:
				getManacost().clear();
				return;
			case CardPackage.CARD__CONVERTED_MANA_COST:
				setConvertedManaCost(CONVERTED_MANA_COST_EDEFAULT);
				return;
			case CardPackage.CARD__ARTIST:
				setArtist(ARTIST_EDEFAULT);
				return;
			case CardPackage.CARD__LEGENDARY:
				setLegendary(LEGENDARY_EDEFAULT);
				return;
			case CardPackage.CARD__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case CardPackage.CARD__RARITY:
				setRarity(RARITY_EDEFAULT);
				return;
			case CardPackage.CARD__ORIGINAL_CARD:
				setOriginalCard((Card)null);
				return;
			case CardPackage.CARD__SET:
				setSet((Set)null);
				return;
			case CardPackage.CARD__TRIBAL:
				setTribal(TRIBAL_EDEFAULT);
				return;
			case CardPackage.CARD__MANACOST_STRING:
				setManacostString(MANACOST_STRING_EDEFAULT);
				return;
			case CardPackage.CARD__TYPE_STRING:
				setTypeString(TYPE_STRING_EDEFAULT);
				return;
			case CardPackage.CARD__REPRINTS:
				getReprints().clear();
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
			case CardPackage.CARD__NUMBER:
				return number != NUMBER_EDEFAULT;
			case CardPackage.CARD__MANACOST:
				return manacost != null && !manacost.isEmpty();
			case CardPackage.CARD__CONVERTED_MANA_COST:
				return convertedManaCost != CONVERTED_MANA_COST_EDEFAULT;
			case CardPackage.CARD__ARTIST:
				return ARTIST_EDEFAULT == null ? artist != null : !ARTIST_EDEFAULT.equals(artist);
			case CardPackage.CARD__LEGENDARY:
				return legendary != LEGENDARY_EDEFAULT;
			case CardPackage.CARD__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case CardPackage.CARD__RARITY:
				return rarity != RARITY_EDEFAULT;
			case CardPackage.CARD__ORIGINAL_CARD:
				return originalCard != null;
			case CardPackage.CARD__SET:
				return getSet() != null;
			case CardPackage.CARD__TRIBAL:
				return tribal != TRIBAL_EDEFAULT;
			case CardPackage.CARD__MANACOST_STRING:
				return MANACOST_STRING_EDEFAULT == null ? manacostString != null : !MANACOST_STRING_EDEFAULT.equals(manacostString);
			case CardPackage.CARD__TYPE_STRING:
				return TYPE_STRING_EDEFAULT == null ? typeString != null : !TYPE_STRING_EDEFAULT.equals(typeString);
			case CardPackage.CARD__REPRINTS:
				return reprints != null && !reprints.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", manacost: ");
		result.append(manacost);
		result.append(", convertedManaCost: ");
		result.append(convertedManaCost);
		result.append(", artist: ");
		result.append(artist);
		result.append(", legendary: ");
		result.append(legendary);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", tribal: ");
		result.append(tribal);
		result.append(", manacostString: ");
		result.append(manacostString);
		result.append(", typeString: ");
		result.append(typeString);
		result.append(')');
		return result.toString();
	}

} //CardImpl
