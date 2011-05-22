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
import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionElement;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.collection.Deck;

import madcow.magic.database.card.CardPackage;

import madcow.magic.database.card.impl.CardPackageImpl;

import madcow.magic.database.core.DatabasePackage;

import madcow.magic.database.core.impl.DatabasePackageImpl;

import madcow.magic.database.set.SetPackage;

import madcow.magic.database.set.impl.SetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionPackageImpl extends EPackageImpl implements CollectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardConditionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see madcow.magic.collection.CollectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectionPackageImpl() {
		super(eNS_URI, CollectionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CollectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectionPackage init() {
		if (isInited) return (CollectionPackage)EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);

		// Obtain or create and register package
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) : SetPackage.eINSTANCE);
		CardPackageImpl theCardPackage = (CardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) instanceof CardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) : CardPackage.eINSTANCE);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) instanceof DatabasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) : DatabasePackage.eINSTANCE);

		// Create package meta-data objects
		theCollectionPackage.createPackageContents();
		theSetPackage.createPackageContents();
		theCardPackage.createPackageContents();
		theDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theCollectionPackage.initializePackageContents();
		theSetPackage.initializePackageContents();
		theCardPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectionPackage.eNS_URI, theCollectionPackage);
		return theCollectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Containers() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Database() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeck() {
		return deckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Cards() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Place() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Collection() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionElement() {
		return collectionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionElement_Name() {
		return (EAttribute)collectionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionElement_Owner() {
		return (EAttribute)collectionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionElement_Description() {
		return (EAttribute)collectionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardInstance() {
		return cardInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInstance_Condition() {
		return (EAttribute)cardInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInstance_Foil() {
		return (EAttribute)cardInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardInstance_Card() {
		return (EReference)cardInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInstance_Proxy() {
		return (EAttribute)cardInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardInstance_Container() {
		return (EReference)cardInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardCondition() {
		return cardConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFactory getCollectionFactory() {
		return (CollectionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collectionEClass = createEClass(COLLECTION);
		createEReference(collectionEClass, COLLECTION__CONTAINERS);
		createEReference(collectionEClass, COLLECTION__DATABASE);

		deckEClass = createEClass(DECK);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CARDS);
		createEAttribute(containerEClass, CONTAINER__PLACE);
		createEReference(containerEClass, CONTAINER__COLLECTION);

		collectionElementEClass = createEClass(COLLECTION_ELEMENT);
		createEAttribute(collectionElementEClass, COLLECTION_ELEMENT__NAME);
		createEAttribute(collectionElementEClass, COLLECTION_ELEMENT__OWNER);
		createEAttribute(collectionElementEClass, COLLECTION_ELEMENT__DESCRIPTION);

		cardInstanceEClass = createEClass(CARD_INSTANCE);
		createEAttribute(cardInstanceEClass, CARD_INSTANCE__CONDITION);
		createEAttribute(cardInstanceEClass, CARD_INSTANCE__FOIL);
		createEReference(cardInstanceEClass, CARD_INSTANCE__CARD);
		createEAttribute(cardInstanceEClass, CARD_INSTANCE__PROXY);
		createEReference(cardInstanceEClass, CARD_INSTANCE__CONTAINER);

		// Create enums
		cardConditionEEnum = createEEnum(CARD_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		CardPackage theCardPackage = (CardPackage)EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collectionEClass.getESuperTypes().add(this.getCollectionElement());
		deckEClass.getESuperTypes().add(this.getContainer());
		containerEClass.getESuperTypes().add(this.getCollectionElement());
		cardInstanceEClass.getESuperTypes().add(this.getCollectionElement());

		// Initialize classes and features; add operations and parameters
		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollection_Containers(), this.getContainer(), this.getContainer_Collection(), "containers", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Database(), theDatabasePackage.getDatabase(), null, "database", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, madcow.magic.collection.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Cards(), this.getCardInstance(), this.getCardInstance_Container(), "cards", null, 0, -1, madcow.magic.collection.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Place(), ecorePackage.getEString(), "place", null, 0, 1, madcow.magic.collection.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Collection(), this.getCollection(), this.getCollection_Containers(), "collection", null, 0, 1, madcow.magic.collection.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionElementEClass, CollectionElement.class, "CollectionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CollectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionElement_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, CollectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CollectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardInstanceEClass, CardInstance.class, "CardInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardInstance_Condition(), this.getCardCondition(), "condition", null, 0, 1, CardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardInstance_Foil(), ecorePackage.getEBoolean(), "foil", null, 0, 1, CardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardInstance_Card(), theCardPackage.getCard(), null, "card", null, 1, 1, CardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardInstance_Proxy(), ecorePackage.getEBoolean(), "proxy", null, 0, 1, CardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardInstance_Container(), this.getContainer(), this.getContainer_Cards(), "container", null, 0, 1, CardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardConditionEEnum, CardCondition.class, "CardCondition");
		addEEnumLiteral(cardConditionEEnum, CardCondition.MINT);
		addEEnumLiteral(cardConditionEEnum, CardCondition.NEAR_MINT_PLUS);
		addEEnumLiteral(cardConditionEEnum, CardCondition.NEAR_MINT);
		addEEnumLiteral(cardConditionEEnum, CardCondition.NEAR_MINT_MINUS);
		addEEnumLiteral(cardConditionEEnum, CardCondition.EXCELLENT_PLUS);
		addEEnumLiteral(cardConditionEEnum, CardCondition.EXCELLENT);
		addEEnumLiteral(cardConditionEEnum, CardCondition.EXCELLENT_MINUS);
		addEEnumLiteral(cardConditionEEnum, CardCondition.GOOD);
		addEEnumLiteral(cardConditionEEnum, CardCondition.POOR);
		addEEnumLiteral(cardConditionEEnum, CardCondition.PLAYED);

		// Create resource
		createResource(eNS_URI);
	}

} //CollectionPackageImpl
