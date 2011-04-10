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

import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.collection.Container;
import madcow.magic.collection.Deck;

import madcow.magic.database.core.Database;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.collection.impl.CollectionImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CollectionImpl#getDecks <em>Decks</em>}</li>
 *   <li>{@link madcow.magic.collection.impl.CollectionImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends CollectionElementImpl implements Collection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> containers;

	/**
	 * The cached value of the '{@link #getDecks() <em>Decks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Deck> decks;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentWithInverseEList<Container>(Container.class, this, CollectionPackage.COLLECTION__CONTAINERS, CollectionPackage.CONTAINER__COLLECTION);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deck> getDecks() {
		if (decks == null) {
			decks = new EObjectContainmentWithInverseEList<Deck>(Deck.class, this, CollectionPackage.COLLECTION__DECKS, CollectionPackage.DECK__COLLECTION);
		}
		return decks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.COLLECTION__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION__DATABASE, oldDatabase, database));
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainers()).basicAdd(otherEnd, msgs);
			case CollectionPackage.COLLECTION__DECKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecks()).basicAdd(otherEnd, msgs);
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case CollectionPackage.COLLECTION__DECKS:
				return ((InternalEList<?>)getDecks()).basicRemove(otherEnd, msgs);
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				return getContainers();
			case CollectionPackage.COLLECTION__DECKS:
				return getDecks();
			case CollectionPackage.COLLECTION__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((java.util.Collection<? extends Container>)newValue);
				return;
			case CollectionPackage.COLLECTION__DECKS:
				getDecks().clear();
				getDecks().addAll((java.util.Collection<? extends Deck>)newValue);
				return;
			case CollectionPackage.COLLECTION__DATABASE:
				setDatabase((Database)newValue);
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				getContainers().clear();
				return;
			case CollectionPackage.COLLECTION__DECKS:
				getDecks().clear();
				return;
			case CollectionPackage.COLLECTION__DATABASE:
				setDatabase((Database)null);
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
			case CollectionPackage.COLLECTION__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case CollectionPackage.COLLECTION__DECKS:
				return decks != null && !decks.isEmpty();
			case CollectionPackage.COLLECTION__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionImpl
