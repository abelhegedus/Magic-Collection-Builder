/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.core.impl;

import madcow.magic.collection.CollectionPackage;

import madcow.magic.collection.impl.CollectionPackageImpl;

import madcow.magic.database.card.CardPackage;

import madcow.magic.database.card.impl.CardPackageImpl;

import madcow.magic.database.core.CardCSVFields;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.DatabaseFactory;
import madcow.magic.database.core.DatabasePackage;
import madcow.magic.database.core.MagicDBElement;

import madcow.magic.database.set.SetPackage;

import madcow.magic.database.set.impl.SetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabasePackageImpl extends EPackageImpl implements DatabasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magicDBElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardCSVFieldsEEnum = null;

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
	 * @see madcow.magic.database.core.DatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabasePackageImpl() {
		super(eNS_URI, DatabaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabasePackage init() {
		if (isInited) return (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);

		// Obtain or create and register package
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) : SetPackage.eINSTANCE);
		CardPackageImpl theCardPackage = (CardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) instanceof CardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI) : CardPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabasePackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theSetPackage.createPackageContents();
		theCardPackage.createPackageContents();

		// Initialize created meta-data
		theDatabasePackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theSetPackage.initializePackageContents();
		theCardPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabasePackage.eNS_URI, theDatabasePackage);
		return theDatabasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagicDBElement() {
		return magicDBElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagicDBElement_Name() {
		return (EAttribute)magicDBElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagicDBElement_Id() {
		return (EAttribute)magicDBElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagicDBElement_Description() {
		return (EAttribute)magicDBElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Blocks() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_CardTotal() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardCSVFields() {
		return cardCSVFieldsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseFactory getDatabaseFactory() {
		return (DatabaseFactory)getEFactoryInstance();
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
		magicDBElementEClass = createEClass(MAGIC_DB_ELEMENT);
		createEAttribute(magicDBElementEClass, MAGIC_DB_ELEMENT__NAME);
		createEAttribute(magicDBElementEClass, MAGIC_DB_ELEMENT__ID);
		createEAttribute(magicDBElementEClass, MAGIC_DB_ELEMENT__DESCRIPTION);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__BLOCKS);
		createEAttribute(databaseEClass, DATABASE__CARD_TOTAL);

		// Create enums
		cardCSVFieldsEEnum = createEEnum(CARD_CSV_FIELDS);
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
		SetPackage theSetPackage = (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);
		CardPackage theCardPackage = (CardPackage)EPackage.Registry.INSTANCE.getEPackage(CardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databaseEClass.getESuperTypes().add(this.getMagicDBElement());

		// Initialize classes and features; add operations and parameters
		initEClass(magicDBElementEClass, MagicDBElement.class, "MagicDBElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagicDBElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, MagicDBElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMagicDBElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, MagicDBElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMagicDBElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, MagicDBElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(magicDBElementEClass, ecorePackage.getEInt(), "initializeFromCSV", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "values", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Blocks(), theSetPackage.getBlock(), null, "blocks", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_CardTotal(), ecorePackage.getEInt(), "cardTotal", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(databaseEClass, theSetPackage.getSet(), "findSetByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "setName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseEClass, theCardPackage.getCard(), "findCardByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardName", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardCSVFieldsEEnum, CardCSVFields.class, "CardCSVFields");
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.NUMBER);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.NAME);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.TYPE);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.MANA_COST);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.RARITY);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.ARTIST);
		addEEnumLiteral(cardCSVFieldsEEnum, CardCSVFields.SET);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabasePackageImpl
