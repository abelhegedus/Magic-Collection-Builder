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

import madcow.magic.collection.CollectionPackage;

import madcow.magic.collection.impl.CollectionPackageImpl;

import madcow.magic.database.card.Artifact;
import madcow.magic.database.card.ArtifactCreature;
import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardFactory;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.card.Creature;
import madcow.magic.database.card.Enchancement;
import madcow.magic.database.card.Instant;
import madcow.magic.database.card.Interrupt;
import madcow.magic.database.card.Land;
import madcow.magic.database.card.ManaType;
import madcow.magic.database.card.Planeswalker;
import madcow.magic.database.card.RarityType;
import madcow.magic.database.card.Sorcery;

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
public class CardPackageImpl extends EPackageImpl implements CardPackage {
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
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enchancementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorceryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactCreatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeswalkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rarityTypeEEnum = null;

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
	 * @see madcow.magic.database.card.CardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CardPackageImpl() {
		super(eNS_URI, CardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CardPackage init() {
		if (isInited) return (CardPackage)EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI);

		// Obtain or create and register package
		CardPackageImpl theCardPackage = (CardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CardPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) : SetPackage.eINSTANCE);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) instanceof DatabasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) : DatabasePackage.eINSTANCE);

		// Create package meta-data objects
		theCardPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theSetPackage.createPackageContents();
		theDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theCardPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theSetPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CardPackage.eNS_URI, theCardPackage);
		return theCardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Number() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Manacost() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ConvertedManaCost() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Artist() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Legendary() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Subtype() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Rarity() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_OriginalCard() {
		return (EReference)cardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Set() {
		return (EReference)cardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Tribal() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ManacostString() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_TypeString() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Reprints() {
		return (EReference)cardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreature() {
		return creatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Power() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Toughness() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnchancement() {
		return enchancementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstant() {
		return instantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLand() {
		return landEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSorcery() {
		return sorceryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactCreature() {
		return artifactCreatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterrupt() {
		return interruptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaneswalker() {
		return planeswalkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManaType() {
		return manaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRarityType() {
		return rarityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFactory getCardFactory() {
		return (CardFactory)getEFactoryInstance();
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
		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__NUMBER);
		createEAttribute(cardEClass, CARD__MANACOST);
		createEAttribute(cardEClass, CARD__CONVERTED_MANA_COST);
		createEAttribute(cardEClass, CARD__ARTIST);
		createEAttribute(cardEClass, CARD__LEGENDARY);
		createEAttribute(cardEClass, CARD__SUBTYPE);
		createEAttribute(cardEClass, CARD__RARITY);
		createEReference(cardEClass, CARD__ORIGINAL_CARD);
		createEReference(cardEClass, CARD__SET);
		createEAttribute(cardEClass, CARD__TRIBAL);
		createEAttribute(cardEClass, CARD__MANACOST_STRING);
		createEAttribute(cardEClass, CARD__TYPE_STRING);
		createEReference(cardEClass, CARD__REPRINTS);

		artifactEClass = createEClass(ARTIFACT);

		creatureEClass = createEClass(CREATURE);
		createEAttribute(creatureEClass, CREATURE__POWER);
		createEAttribute(creatureEClass, CREATURE__TOUGHNESS);

		enchancementEClass = createEClass(ENCHANCEMENT);

		instantEClass = createEClass(INSTANT);

		landEClass = createEClass(LAND);

		sorceryEClass = createEClass(SORCERY);

		artifactCreatureEClass = createEClass(ARTIFACT_CREATURE);

		interruptEClass = createEClass(INTERRUPT);

		planeswalkerEClass = createEClass(PLANESWALKER);

		// Create enums
		manaTypeEEnum = createEEnum(MANA_TYPE);
		rarityTypeEEnum = createEEnum(RARITY_TYPE);
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
		SetPackage theSetPackage = (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cardEClass.getESuperTypes().add(theDatabasePackage.getMagicDBElement());
		artifactEClass.getESuperTypes().add(this.getCard());
		creatureEClass.getESuperTypes().add(this.getCard());
		enchancementEClass.getESuperTypes().add(this.getCard());
		instantEClass.getESuperTypes().add(this.getCard());
		landEClass.getESuperTypes().add(this.getCard());
		sorceryEClass.getESuperTypes().add(this.getCard());
		artifactCreatureEClass.getESuperTypes().add(this.getCreature());
		artifactCreatureEClass.getESuperTypes().add(this.getArtifact());
		interruptEClass.getESuperTypes().add(this.getInstant());
		planeswalkerEClass.getESuperTypes().add(this.getCard());

		// Initialize classes and features; add operations and parameters
		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Manacost(), this.getManaType(), "manacost", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ConvertedManaCost(), ecorePackage.getEInt(), "convertedManaCost", null, 1, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Artist(), ecorePackage.getEString(), "artist", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Legendary(), ecorePackage.getEBoolean(), "legendary", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Rarity(), this.getRarityType(), "rarity", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_OriginalCard(), this.getCard(), this.getCard_Reprints(), "originalCard", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Set(), theSetPackage.getSet(), theSetPackage.getSet_Cards(), "set", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Tribal(), ecorePackage.getEBoolean(), "tribal", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ManacostString(), ecorePackage.getEString(), "manacostString", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_TypeString(), ecorePackage.getEString(), "typeString", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Reprints(), this.getCard(), this.getCard_OriginalCard(), "reprints", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(creatureEClass, Creature.class, "Creature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreature_Power(), ecorePackage.getEInt(), "power", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Toughness(), ecorePackage.getEInt(), "toughness", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enchancementEClass, Enchancement.class, "Enchancement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instantEClass, Instant.class, "Instant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landEClass, Land.class, "Land", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sorceryEClass, Sorcery.class, "Sorcery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactCreatureEClass, ArtifactCreature.class, "ArtifactCreature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptEClass, Interrupt.class, "Interrupt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planeswalkerEClass, Planeswalker.class, "Planeswalker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(manaTypeEEnum, ManaType.class, "ManaType");
		addEEnumLiteral(manaTypeEEnum, ManaType.COLORLESS);
		addEEnumLiteral(manaTypeEEnum, ManaType.WHITE);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLUE);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLACK);
		addEEnumLiteral(manaTypeEEnum, ManaType.RED);
		addEEnumLiteral(manaTypeEEnum, ManaType.GREEN);
		addEEnumLiteral(manaTypeEEnum, ManaType.WHITE_BLUE);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLUE_BLACK);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLACK_RED);
		addEEnumLiteral(manaTypeEEnum, ManaType.RED_GREEN);
		addEEnumLiteral(manaTypeEEnum, ManaType.GREEN_WHITE);
		addEEnumLiteral(manaTypeEEnum, ManaType.WHITE_BLACK);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLUE_RED);
		addEEnumLiteral(manaTypeEEnum, ManaType.BLACK_GREEN);
		addEEnumLiteral(manaTypeEEnum, ManaType.RED_WHITE);
		addEEnumLiteral(manaTypeEEnum, ManaType.GREEN_BLUE);
		addEEnumLiteral(manaTypeEEnum, ManaType.TWO_WHITE);
		addEEnumLiteral(manaTypeEEnum, ManaType.TWO_BLUE);
		addEEnumLiteral(manaTypeEEnum, ManaType.TWO_BLACK);
		addEEnumLiteral(manaTypeEEnum, ManaType.TWO_RED);
		addEEnumLiteral(manaTypeEEnum, ManaType.TWO_GREEN);
		addEEnumLiteral(manaTypeEEnum, ManaType.MANY);
		addEEnumLiteral(manaTypeEEnum, ManaType.OTHER);

		initEEnum(rarityTypeEEnum, RarityType.class, "RarityType");
		addEEnumLiteral(rarityTypeEEnum, RarityType.COMMON);
		addEEnumLiteral(rarityTypeEEnum, RarityType.UNCOMMON);
		addEEnumLiteral(rarityTypeEEnum, RarityType.RARE);
		addEEnumLiteral(rarityTypeEEnum, RarityType.MYTHIC_RARE);
		addEEnumLiteral(rarityTypeEEnum, RarityType.SPECIAL);
		addEEnumLiteral(rarityTypeEEnum, RarityType.LAND);

		// Create resource
		createResource(eNS_URI);
	}

} //CardPackageImpl
