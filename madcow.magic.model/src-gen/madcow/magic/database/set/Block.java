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

import madcow.magic.database.core.MagicDBElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link madcow.magic.database.set.Block#getSets <em>Sets</em>}</li>
 *   <li>{@link madcow.magic.database.set.Block#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see madcow.magic.database.set.SetPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends MagicDBElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:    Ábel Hegedüs - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link madcow.magic.database.set.Set}.
	 * It is bidirectional and its opposite is '{@link madcow.magic.database.set.Set#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see madcow.magic.database.set.SetPackage#getBlock_Sets()
	 * @see madcow.magic.database.set.Set#getBlock
	 * @model opposite="block" containment="true"
	 * @generated
	 */
	EList<Set> getSets();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link madcow.magic.database.set.BlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see madcow.magic.database.set.BlockType
	 * @see #setType(BlockType)
	 * @see madcow.magic.database.set.SetPackage#getBlock_Type()
	 * @model
	 * @generated
	 */
	BlockType getType();

	/**
	 * Sets the value of the '{@link madcow.magic.database.set.Block#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see madcow.magic.database.set.BlockType
	 * @see #getType()
	 * @generated
	 */
	void setType(BlockType value);

} // Block
