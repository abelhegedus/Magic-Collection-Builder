/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see madcow.magic.database.core.DatabasePackage
 * @generated
 */
public interface DatabaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseFactory eINSTANCE = madcow.magic.database.core.impl.DatabaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Magic DB Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magic DB Element</em>'.
	 * @generated
	 */
	MagicDBElement createMagicDBElement();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatabasePackage getDatabasePackage();

} //DatabaseFactory
