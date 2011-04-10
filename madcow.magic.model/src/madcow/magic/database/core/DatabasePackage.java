/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see madcow.magic.database.core.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://madcow.magic.database.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = madcow.magic.database.core.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link madcow.magic.database.core.impl.MagicDBElementImpl <em>Magic DB Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.core.impl.MagicDBElementImpl
	 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getMagicDBElement()
	 * @generated
	 */
	int MAGIC_DB_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGIC_DB_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGIC_DB_ELEMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGIC_DB_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Magic DB Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGIC_DB_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link madcow.magic.database.core.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.core.impl.DatabaseImpl
	 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = MAGIC_DB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ID = MAGIC_DB_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DESCRIPTION = MAGIC_DB_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BLOCKS = MAGIC_DB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CARD_TOTAL = MAGIC_DB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = MAGIC_DB_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link madcow.magic.database.core.CardCSVFields <em>Card CSV Fields</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.core.CardCSVFields
	 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getCardCSVFields()
	 * @generated
	 */
	int CARD_CSV_FIELDS = 2;


	/**
	 * Returns the meta object for class '{@link madcow.magic.database.core.MagicDBElement <em>Magic DB Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magic DB Element</em>'.
	 * @see madcow.magic.database.core.MagicDBElement
	 * @generated
	 */
	EClass getMagicDBElement();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.core.MagicDBElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see madcow.magic.database.core.MagicDBElement#getName()
	 * @see #getMagicDBElement()
	 * @generated
	 */
	EAttribute getMagicDBElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.core.MagicDBElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see madcow.magic.database.core.MagicDBElement#getId()
	 * @see #getMagicDBElement()
	 * @generated
	 */
	EAttribute getMagicDBElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.core.MagicDBElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see madcow.magic.database.core.MagicDBElement#getDescription()
	 * @see #getMagicDBElement()
	 * @generated
	 */
	EAttribute getMagicDBElement_Description();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.core.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see madcow.magic.database.core.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link madcow.magic.database.core.Database#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see madcow.magic.database.core.Database#getBlocks()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.core.Database#getCardTotal <em>Card Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Total</em>'.
	 * @see madcow.magic.database.core.Database#getCardTotal()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_CardTotal();

	/**
	 * Returns the meta object for enum '{@link madcow.magic.database.core.CardCSVFields <em>Card CSV Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card CSV Fields</em>'.
	 * @see madcow.magic.database.core.CardCSVFields
	 * @generated
	 */
	EEnum getCardCSVFields();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link madcow.magic.database.core.impl.MagicDBElementImpl <em>Magic DB Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.core.impl.MagicDBElementImpl
		 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getMagicDBElement()
		 * @generated
		 */
		EClass MAGIC_DB_ELEMENT = eINSTANCE.getMagicDBElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGIC_DB_ELEMENT__NAME = eINSTANCE.getMagicDBElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGIC_DB_ELEMENT__ID = eINSTANCE.getMagicDBElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGIC_DB_ELEMENT__DESCRIPTION = eINSTANCE.getMagicDBElement_Description();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.core.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.core.impl.DatabaseImpl
		 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BLOCKS = eINSTANCE.getDatabase_Blocks();

		/**
		 * The meta object literal for the '<em><b>Card Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__CARD_TOTAL = eINSTANCE.getDatabase_CardTotal();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.core.CardCSVFields <em>Card CSV Fields</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.core.CardCSVFields
		 * @see madcow.magic.database.core.impl.DatabasePackageImpl#getCardCSVFields()
		 * @generated
		 */
		EEnum CARD_CSV_FIELDS = eINSTANCE.getCardCSVFields();

	}

} //DatabasePackage
