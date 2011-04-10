/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.database.card;

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
 * @see madcow.magic.database.card.CardFactory
 * @model kind="package"
 * @generated
 */
public interface CardPackage extends EPackage {
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
	String eNAME = "card";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://madcow.magic.database.card";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "card";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CardPackage eINSTANCE = madcow.magic.database.card.impl.CardPackageImpl.init();

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.CardImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = DatabasePackage.MAGIC_DB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID = DatabasePackage.MAGIC_DB_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = DatabasePackage.MAGIC_DB_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NUMBER = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MANACOST = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CONVERTED_MANA_COST = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ARTIST = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__LEGENDARY = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SUBTYPE = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RARITY = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ORIGINAL_CARD = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SET = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TRIBAL = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MANACOST_STRING = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE_STRING = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__REPRINTS = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = DatabasePackage.MAGIC_DB_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.ArtifactImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.CreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.CreatureImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getCreature()
	 * @generated
	 */
	int CREATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__REPRINTS = CARD__REPRINTS;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__POWER = CARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Toughness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__TOUGHNESS = CARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = CARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.EnchancementImpl <em>Enchancement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.EnchancementImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getEnchancement()
	 * @generated
	 */
	int ENCHANCEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Enchancement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCHANCEMENT_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.InstantImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.LandImpl <em>Land</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.LandImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getLand()
	 * @generated
	 */
	int LAND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Land</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAND_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.SorceryImpl <em>Sorcery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.SorceryImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getSorcery()
	 * @generated
	 */
	int SORCERY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Sorcery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCERY_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.ArtifactCreatureImpl <em>Artifact Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.ArtifactCreatureImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getArtifactCreature()
	 * @generated
	 */
	int ARTIFACT_CREATURE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__NAME = CREATURE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__ID = CREATURE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__DESCRIPTION = CREATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__NUMBER = CREATURE__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__MANACOST = CREATURE__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__CONVERTED_MANA_COST = CREATURE__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__ARTIST = CREATURE__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__LEGENDARY = CREATURE__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__SUBTYPE = CREATURE__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__RARITY = CREATURE__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__ORIGINAL_CARD = CREATURE__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__SET = CREATURE__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__TRIBAL = CREATURE__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__MANACOST_STRING = CREATURE__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__TYPE_STRING = CREATURE__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__REPRINTS = CREATURE__REPRINTS;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__POWER = CREATURE__POWER;

	/**
	 * The feature id for the '<em><b>Toughness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE__TOUGHNESS = CREATURE__TOUGHNESS;

	/**
	 * The number of structural features of the '<em>Artifact Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CREATURE_FEATURE_COUNT = CREATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.InterruptImpl <em>Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.InterruptImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getInterrupt()
	 * @generated
	 */
	int INTERRUPT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__NAME = INSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__ID = INSTANT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__DESCRIPTION = INSTANT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__NUMBER = INSTANT__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__MANACOST = INSTANT__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__CONVERTED_MANA_COST = INSTANT__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__ARTIST = INSTANT__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__LEGENDARY = INSTANT__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__SUBTYPE = INSTANT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__RARITY = INSTANT__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__ORIGINAL_CARD = INSTANT__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__SET = INSTANT__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__TRIBAL = INSTANT__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__MANACOST_STRING = INSTANT__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__TYPE_STRING = INSTANT__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__REPRINTS = INSTANT__REPRINTS;

	/**
	 * The number of structural features of the '<em>Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FEATURE_COUNT = INSTANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.impl.PlaneswalkerImpl <em>Planeswalker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.impl.PlaneswalkerImpl
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getPlaneswalker()
	 * @generated
	 */
	int PLANESWALKER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__NAME = CARD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__ID = CARD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__DESCRIPTION = CARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__NUMBER = CARD__NUMBER;

	/**
	 * The feature id for the '<em><b>Manacost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__MANACOST = CARD__MANACOST;

	/**
	 * The feature id for the '<em><b>Converted Mana Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__CONVERTED_MANA_COST = CARD__CONVERTED_MANA_COST;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__ARTIST = CARD__ARTIST;

	/**
	 * The feature id for the '<em><b>Legendary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__LEGENDARY = CARD__LEGENDARY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__SUBTYPE = CARD__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__RARITY = CARD__RARITY;

	/**
	 * The feature id for the '<em><b>Original Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__ORIGINAL_CARD = CARD__ORIGINAL_CARD;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__SET = CARD__SET;

	/**
	 * The feature id for the '<em><b>Tribal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__TRIBAL = CARD__TRIBAL;

	/**
	 * The feature id for the '<em><b>Manacost String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__MANACOST_STRING = CARD__MANACOST_STRING;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__TYPE_STRING = CARD__TYPE_STRING;

	/**
	 * The feature id for the '<em><b>Reprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER__REPRINTS = CARD__REPRINTS;

	/**
	 * The number of structural features of the '<em>Planeswalker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANESWALKER_FEATURE_COUNT = CARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.ManaType <em>Mana Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.ManaType
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getManaType()
	 * @generated
	 */
	int MANA_TYPE = 10;

	/**
	 * The meta object id for the '{@link madcow.magic.database.card.RarityType <em>Rarity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.database.card.RarityType
	 * @see madcow.magic.database.card.impl.CardPackageImpl#getRarityType()
	 * @generated
	 */
	int RARITY_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see madcow.magic.database.card.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see madcow.magic.database.card.Card#getNumber()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Number();

	/**
	 * Returns the meta object for the attribute list '{@link madcow.magic.database.card.Card#getManacost <em>Manacost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Manacost</em>'.
	 * @see madcow.magic.database.card.Card#getManacost()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Manacost();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getConvertedManaCost <em>Converted Mana Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted Mana Cost</em>'.
	 * @see madcow.magic.database.card.Card#getConvertedManaCost()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ConvertedManaCost();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artist</em>'.
	 * @see madcow.magic.database.card.Card#getArtist()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Artist();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#isLegendary <em>Legendary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legendary</em>'.
	 * @see madcow.magic.database.card.Card#isLegendary()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Legendary();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see madcow.magic.database.card.Card#getSubtype()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see madcow.magic.database.card.Card#getRarity()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Rarity();

	/**
	 * Returns the meta object for the reference '{@link madcow.magic.database.card.Card#getOriginalCard <em>Original Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Card</em>'.
	 * @see madcow.magic.database.card.Card#getOriginalCard()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_OriginalCard();

	/**
	 * Returns the meta object for the container reference '{@link madcow.magic.database.card.Card#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Set</em>'.
	 * @see madcow.magic.database.card.Card#getSet()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Set();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#isTribal <em>Tribal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tribal</em>'.
	 * @see madcow.magic.database.card.Card#isTribal()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Tribal();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getManacostString <em>Manacost String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manacost String</em>'.
	 * @see madcow.magic.database.card.Card#getManacostString()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ManacostString();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Card#getTypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type String</em>'.
	 * @see madcow.magic.database.card.Card#getTypeString()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_TypeString();

	/**
	 * Returns the meta object for the reference list '{@link madcow.magic.database.card.Card#getReprints <em>Reprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reprints</em>'.
	 * @see madcow.magic.database.card.Card#getReprints()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Reprints();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see madcow.magic.database.card.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Creature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creature</em>'.
	 * @see madcow.magic.database.card.Creature
	 * @generated
	 */
	EClass getCreature();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Creature#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see madcow.magic.database.card.Creature#getPower()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Power();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.database.card.Creature#getToughness <em>Toughness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toughness</em>'.
	 * @see madcow.magic.database.card.Creature#getToughness()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Toughness();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Enchancement <em>Enchancement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enchancement</em>'.
	 * @see madcow.magic.database.card.Enchancement
	 * @generated
	 */
	EClass getEnchancement();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see madcow.magic.database.card.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Land <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Land</em>'.
	 * @see madcow.magic.database.card.Land
	 * @generated
	 */
	EClass getLand();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Sorcery <em>Sorcery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorcery</em>'.
	 * @see madcow.magic.database.card.Sorcery
	 * @generated
	 */
	EClass getSorcery();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.ArtifactCreature <em>Artifact Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Creature</em>'.
	 * @see madcow.magic.database.card.ArtifactCreature
	 * @generated
	 */
	EClass getArtifactCreature();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt</em>'.
	 * @see madcow.magic.database.card.Interrupt
	 * @generated
	 */
	EClass getInterrupt();

	/**
	 * Returns the meta object for class '{@link madcow.magic.database.card.Planeswalker <em>Planeswalker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planeswalker</em>'.
	 * @see madcow.magic.database.card.Planeswalker
	 * @generated
	 */
	EClass getPlaneswalker();

	/**
	 * Returns the meta object for enum '{@link madcow.magic.database.card.ManaType <em>Mana Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mana Type</em>'.
	 * @see madcow.magic.database.card.ManaType
	 * @generated
	 */
	EEnum getManaType();

	/**
	 * Returns the meta object for enum '{@link madcow.magic.database.card.RarityType <em>Rarity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rarity Type</em>'.
	 * @see madcow.magic.database.card.RarityType
	 * @generated
	 */
	EEnum getRarityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CardFactory getCardFactory();

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
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.CardImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__NUMBER = eINSTANCE.getCard_Number();

		/**
		 * The meta object literal for the '<em><b>Manacost</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MANACOST = eINSTANCE.getCard_Manacost();

		/**
		 * The meta object literal for the '<em><b>Converted Mana Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CONVERTED_MANA_COST = eINSTANCE.getCard_ConvertedManaCost();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ARTIST = eINSTANCE.getCard_Artist();

		/**
		 * The meta object literal for the '<em><b>Legendary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__LEGENDARY = eINSTANCE.getCard_Legendary();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__SUBTYPE = eINSTANCE.getCard_Subtype();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RARITY = eINSTANCE.getCard_Rarity();

		/**
		 * The meta object literal for the '<em><b>Original Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ORIGINAL_CARD = eINSTANCE.getCard_OriginalCard();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__SET = eINSTANCE.getCard_Set();

		/**
		 * The meta object literal for the '<em><b>Tribal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TRIBAL = eINSTANCE.getCard_Tribal();

		/**
		 * The meta object literal for the '<em><b>Manacost String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MANACOST_STRING = eINSTANCE.getCard_ManacostString();

		/**
		 * The meta object literal for the '<em><b>Type String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE_STRING = eINSTANCE.getCard_TypeString();

		/**
		 * The meta object literal for the '<em><b>Reprints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__REPRINTS = eINSTANCE.getCard_Reprints();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.ArtifactImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.CreatureImpl <em>Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.CreatureImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getCreature()
		 * @generated
		 */
		EClass CREATURE = eINSTANCE.getCreature();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__POWER = eINSTANCE.getCreature_Power();

		/**
		 * The meta object literal for the '<em><b>Toughness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__TOUGHNESS = eINSTANCE.getCreature_Toughness();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.EnchancementImpl <em>Enchancement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.EnchancementImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getEnchancement()
		 * @generated
		 */
		EClass ENCHANCEMENT = eINSTANCE.getEnchancement();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.InstantImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.LandImpl <em>Land</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.LandImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getLand()
		 * @generated
		 */
		EClass LAND = eINSTANCE.getLand();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.SorceryImpl <em>Sorcery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.SorceryImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getSorcery()
		 * @generated
		 */
		EClass SORCERY = eINSTANCE.getSorcery();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.ArtifactCreatureImpl <em>Artifact Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.ArtifactCreatureImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getArtifactCreature()
		 * @generated
		 */
		EClass ARTIFACT_CREATURE = eINSTANCE.getArtifactCreature();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.InterruptImpl <em>Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.InterruptImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getInterrupt()
		 * @generated
		 */
		EClass INTERRUPT = eINSTANCE.getInterrupt();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.impl.PlaneswalkerImpl <em>Planeswalker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.impl.PlaneswalkerImpl
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getPlaneswalker()
		 * @generated
		 */
		EClass PLANESWALKER = eINSTANCE.getPlaneswalker();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.ManaType <em>Mana Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.ManaType
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getManaType()
		 * @generated
		 */
		EEnum MANA_TYPE = eINSTANCE.getManaType();

		/**
		 * The meta object literal for the '{@link madcow.magic.database.card.RarityType <em>Rarity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.database.card.RarityType
		 * @see madcow.magic.database.card.impl.CardPackageImpl#getRarityType()
		 * @generated
		 */
		EEnum RARITY_TYPE = eINSTANCE.getRarityType();

	}

} //CardPackage
