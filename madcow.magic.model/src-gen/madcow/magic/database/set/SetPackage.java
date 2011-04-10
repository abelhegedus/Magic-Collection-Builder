/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.database.set;

import madcow.magic.database.core.DatabasePackage;

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
 * @see madcow.magic.database.set.SetFactory
 * @model kind="package"
 * @generated
 */
public interface SetPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "set";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://madcow.magic.database.set";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "set";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetPackage eINSTANCE = madcow.magic.database.set.impl.SetPackageImpl.init();

	/**
	 * The meta object id for the '{@link madcow.magic.database.set.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.set.impl.SetImpl
	 * @see madcow.magic.database.set.impl.SetPackageImpl#getSet()
	 * @generated
	 */
	int SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NAME = DatabasePackage.MAGIC_DB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ID = DatabasePackage.MAGIC_DB_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DESCRIPTION = DatabasePackage.MAGIC_DB_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DATE = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CARD_TOTAL = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__BLOCK = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CARDS = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link madcow.magic.database.set.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.set.impl.BlockImpl
	 * @see madcow.magic.database.set.impl.SetPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = DatabasePackage.MAGIC_DB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = DatabasePackage.MAGIC_DB_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = DatabasePackage.MAGIC_DB_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SETS = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TYPE = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link madcow.magic.database.set.BlockType <em>Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.set.BlockType
	 * @see madcow.magic.database.set.impl.SetPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link madcow.magic.database.set.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see madcow.magic.database.set.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.set.Set#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see madcow.magic.database.set.Set#getDate()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Date();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.set.Set#getCardTotal <em>Card Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Total</em>'.
	 * @see madcow.magic.database.set.Set#getCardTotal()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_CardTotal();

	/**
	 * Returns the meta object for the container reference '{@link madcow.magic.database.set.Set#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see madcow.magic.database.set.Set#getBlock()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link madcow.magic.database.set.Set#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see madcow.magic.database.set.Set#getCards()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Cards();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.set.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see madcow.magic.database.set.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link madcow.magic.database.set.Block#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see madcow.magic.database.set.Block#getSets()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Sets();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.set.Block#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see madcow.magic.database.set.Block#getType()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Type();

	/**
	 * Returns the meta object for enum '{@link madcow.magic.database.set.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Type</em>'.
	 * @see madcow.magic.database.set.BlockType
	 * @generated
	 */
	EEnum getBlockType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SetFactory getSetFactory();

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
		 * The meta object literal for the '{@link madcow.magic.database.set.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.set.impl.SetImpl
		 * @see madcow.magic.database.set.impl.SetPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__DATE = eINSTANCE.getSet_Date();

		/**
		 * The meta object literal for the '<em><b>Card Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__CARD_TOTAL = eINSTANCE.getSet_CardTotal();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__BLOCK = eINSTANCE.getSet_Block();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__CARDS = eINSTANCE.getSet_Cards();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.set.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.set.impl.BlockImpl
		 * @see madcow.magic.database.set.impl.SetPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SETS = eINSTANCE.getBlock_Sets();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__TYPE = eINSTANCE.getBlock_Type();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.set.BlockType <em>Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.set.BlockType
		 * @see madcow.magic.database.set.impl.SetPackageImpl#getBlockType()
		 * @generated
		 */
		EEnum BLOCK_TYPE = eINSTANCE.getBlockType();

	}

} //SetPackage
