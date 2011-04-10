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

import madcow.magic.collection.CollectionPackage;

import madcow.magic.collection.impl.CollectionPackageImpl;

import madcow.magic.database.card.CardPackage;

import madcow.magic.database.card.impl.CardPackageImpl;

import madcow.magic.database.core.DatabasePackage;

import madcow.magic.database.core.impl.DatabasePackageImpl;

import madcow.magic.database.set.Block;
import madcow.magic.database.set.BlockType;
import madcow.magic.database.set.Set;
import madcow.magic.database.set.SetFactory;
import madcow.magic.database.set.SetPackage;

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
public class SetPackageImpl extends EPackageImpl implements SetPackage {
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
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockTypeEEnum = null;

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
	 * @see madcow.magic.database.set.SetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SetPackageImpl() {
		super(eNS_URI, SetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SetPackage init() {
		if (isInited) return (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);

		// Obtain or create and register package
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		CardPackageImpl theCardPackage = (CardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) instanceof CardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) : CardPackage.eINSTANCE);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) instanceof DatabasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI) : DatabasePackage.eINSTANCE);

		// Create package meta-data objects
		theSetPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theCardPackage.createPackageContents();
		theDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theSetPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theCardPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SetPackage.eNS_URI, theSetPackage);
		return theSetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Date() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_CardTotal() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Block() {
		return (EReference)setEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Cards() {
		return (EReference)setEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Sets() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Type() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockType() {
		return blockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFactory getSetFactory() {
		return (SetFactory)getEFactoryInstance();
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
		setEClass = createEClass(SET);
		createEAttribute(setEClass, SET__DATE);
		createEAttribute(setEClass, SET__CARD_TOTAL);
		createEReference(setEClass, SET__BLOCK);
		createEReference(setEClass, SET__CARDS);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__SETS);
		createEAttribute(blockEClass, BLOCK__TYPE);

		// Create enums
		blockTypeEEnum = createEEnum(BLOCK_TYPE);
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
		setEClass.getESuperTypes().add(theDatabasePackage.getMagicDBElement());
		blockEClass.getESuperTypes().add(theDatabasePackage.getMagicDBElement());

		// Initialize classes and features; add operations and parameters
		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSet_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_CardTotal(), ecorePackage.getEInt(), "cardTotal", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Block(), this.getBlock(), this.getBlock_Sets(), "block", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Cards(), theCardPackage.getCard(), theCardPackage.getCard_Set(), "cards", null, 0, -1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Sets(), this.getSet(), this.getSet_Block(), "sets", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Type(), this.getBlockType(), "type", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(blockTypeEEnum, BlockType.class, "BlockType");
		addEEnumLiteral(blockTypeEEnum, BlockType.CORE);
		addEEnumLiteral(blockTypeEEnum, BlockType.CYCLE);
		addEEnumLiteral(blockTypeEEnum, BlockType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //SetPackageImpl
