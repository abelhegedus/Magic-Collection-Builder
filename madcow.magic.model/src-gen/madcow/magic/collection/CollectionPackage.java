/**
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:    Ábel Hegedüs - initial API and implementation
 */
package madcow.magic.collection;

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
 * @see madcow.magic.collection.CollectionFactory
 * @model kind="package"
 * @generated
 */
public interface CollectionPackage extends EPackage {
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
	String eNAME = "collection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://madcow.magic.coll";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "coll";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectionPackage eINSTANCE = madcow.magic.collection.impl.CollectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link madcow.magic.collection.impl.CollectionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.impl.CollectionElementImpl
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCollectionElement()
	 * @generated
	 */
	int COLLECTION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ELEMENT__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link madcow.magic.collection.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.impl.CollectionImpl
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = COLLECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__OWNER = COLLECTION_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__DESCRIPTION = COLLECTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CONTAINERS = COLLECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__DATABASE = COLLECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = COLLECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link madcow.magic.collection.impl.DeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.impl.DeckImpl
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getDeck()
	 * @generated
	 */
	int DECK = 1;

	/**
	 * The meta object id for the '{@link madcow.magic.collection.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.impl.ContainerImpl
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COLLECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNER = COLLECTION_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = COLLECTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CARDS = COLLECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PLACE = COLLECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COLLECTION = COLLECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COLLECTION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__OWNER = CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__CARDS = CONTAINER__CARDS;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__PLACE = CONTAINER__PLACE;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__COLLECTION = CONTAINER__COLLECTION;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link madcow.magic.collection.impl.CardInstanceImpl <em>Card Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.impl.CardInstanceImpl
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCardInstance()
	 * @generated
	 */
	int CARD_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__NAME = COLLECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__OWNER = COLLECTION_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__DESCRIPTION = COLLECTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__CONDITION = COLLECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__FOIL = COLLECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__CARD = COLLECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__PROXY = COLLECTION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE__CONTAINER = COLLECTION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Card Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INSTANCE_FEATURE_COUNT = COLLECTION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link madcow.magic.collection.CardCondition <em>Card Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see madcow.magic.collection.CardCondition
	 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCardCondition()
	 * @generated
	 */
	int CARD_CONDITION = 5;


	/**
	 * Returns the meta object for class '{@link madcow.magic.collection.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see madcow.magic.collection.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link madcow.magic.collection.Collection#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see madcow.magic.collection.Collection#getContainers()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Containers();

	/**
	 * Returns the meta object for the reference '{@link madcow.magic.collection.Collection#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see madcow.magic.collection.Collection#getDatabase()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Database();

	/**
	 * Returns the meta object for class '{@link madcow.magic.collection.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see madcow.magic.collection.Deck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for class '{@link madcow.magic.collection.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see madcow.magic.collection.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link madcow.magic.collection.Container#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see madcow.magic.collection.Container#getCards()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Cards();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.Container#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see madcow.magic.collection.Container#getPlace()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Place();

	/**
	 * Returns the meta object for the container reference '{@link madcow.magic.collection.Container#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see madcow.magic.collection.Container#getCollection()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Collection();

	/**
	 * Returns the meta object for class '{@link madcow.magic.collection.CollectionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see madcow.magic.collection.CollectionElement
	 * @generated
	 */
	EClass getCollectionElement();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CollectionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see madcow.magic.collection.CollectionElement#getName()
	 * @see #getCollectionElement()
	 * @generated
	 */
	EAttribute getCollectionElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CollectionElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see madcow.magic.collection.CollectionElement#getOwner()
	 * @see #getCollectionElement()
	 * @generated
	 */
	EAttribute getCollectionElement_Owner();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CollectionElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see madcow.magic.collection.CollectionElement#getDescription()
	 * @see #getCollectionElement()
	 * @generated
	 */
	EAttribute getCollectionElement_Description();

	/**
	 * Returns the meta object for class '{@link madcow.magic.collection.CardInstance <em>Card Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Instance</em>'.
	 * @see madcow.magic.collection.CardInstance
	 * @generated
	 */
	EClass getCardInstance();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CardInstance#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see madcow.magic.collection.CardInstance#getCondition()
	 * @see #getCardInstance()
	 * @generated
	 */
	EAttribute getCardInstance_Condition();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CardInstance#isFoil <em>Foil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foil</em>'.
	 * @see madcow.magic.collection.CardInstance#isFoil()
	 * @see #getCardInstance()
	 * @generated
	 */
	EAttribute getCardInstance_Foil();

	/**
	 * Returns the meta object for the reference '{@link madcow.magic.collection.CardInstance#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see madcow.magic.collection.CardInstance#getCard()
	 * @see #getCardInstance()
	 * @generated
	 */
	EReference getCardInstance_Card();

	/**
	 * Returns the meta object for the attribute '{@link madcow.magic.collection.CardInstance#isProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see madcow.magic.collection.CardInstance#isProxy()
	 * @see #getCardInstance()
	 * @generated
	 */
	EAttribute getCardInstance_Proxy();

	/**
	 * Returns the meta object for the container reference '{@link madcow.magic.collection.CardInstance#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see madcow.magic.collection.CardInstance#getContainer()
	 * @see #getCardInstance()
	 * @generated
	 */
	EReference getCardInstance_Container();

	/**
	 * Returns the meta object for enum '{@link madcow.magic.collection.CardCondition <em>Card Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Condition</em>'.
	 * @see madcow.magic.collection.CardCondition
	 * @generated
	 */
	EEnum getCardCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectionFactory getCollectionFactory();

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
		 * The meta object literal for the '{@link madcow.magic.collection.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.impl.CollectionImpl
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__CONTAINERS = eINSTANCE.getCollection_Containers();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__DATABASE = eINSTANCE.getCollection_Database();

		/**
		 * The meta object literal for the '{@link madcow.magic.collection.impl.DeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.impl.DeckImpl
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getDeck()
		 * @generated
		 */
		EClass DECK = eINSTANCE.getDeck();

		/**
		 * The meta object literal for the '{@link madcow.magic.collection.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.impl.ContainerImpl
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CARDS = eINSTANCE.getContainer_Cards();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PLACE = eINSTANCE.getContainer_Place();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__COLLECTION = eINSTANCE.getContainer_Collection();

		/**
		 * The meta object literal for the '{@link madcow.magic.collection.impl.CollectionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.impl.CollectionElementImpl
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCollectionElement()
		 * @generated
		 */
		EClass COLLECTION_ELEMENT = eINSTANCE.getCollectionElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ELEMENT__NAME = eINSTANCE.getCollectionElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ELEMENT__OWNER = eINSTANCE.getCollectionElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ELEMENT__DESCRIPTION = eINSTANCE.getCollectionElement_Description();

		/**
		 * The meta object literal for the '{@link madcow.magic.collection.impl.CardInstanceImpl <em>Card Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.impl.CardInstanceImpl
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCardInstance()
		 * @generated
		 */
		EClass CARD_INSTANCE = eINSTANCE.getCardInstance();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INSTANCE__CONDITION = eINSTANCE.getCardInstance_Condition();

		/**
		 * The meta object literal for the '<em><b>Foil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INSTANCE__FOIL = eINSTANCE.getCardInstance_Foil();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_INSTANCE__CARD = eINSTANCE.getCardInstance_Card();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INSTANCE__PROXY = eINSTANCE.getCardInstance_Proxy();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_INSTANCE__CONTAINER = eINSTANCE.getCardInstance_Container();

		/**
		 * The meta object literal for the '{@link madcow.magic.collection.CardCondition <em>Card Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see madcow.magic.collection.CardCondition
		 * @see madcow.magic.collection.impl.CollectionPackageImpl#getCardCondition()
		 * @generated
		 */
		EEnum CARD_CONDITION = eINSTANCE.getCardCondition();

	}

} //CollectionPackage
