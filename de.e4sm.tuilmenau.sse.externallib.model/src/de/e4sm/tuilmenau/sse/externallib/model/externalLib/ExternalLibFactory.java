/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage
 * @generated
 */
public interface ExternalLibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalLibFactory eINSTANCE = de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>External Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Library</em>'.
	 * @generated
	 */
	ExternalLibrary createExternalLibrary();

	/**
	 * Returns a new object of class '<em>Library Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Function</em>'.
	 * @generated
	 */
	LibraryFunction createLibraryFunction();

	/**
	 * Returns a new object of class '<em>Implemented Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implemented Function</em>'.
	 * @generated
	 */
	ImplementedFunction createImplementedFunction();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Function Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Collection</em>'.
	 * @generated
	 */
	FunctionCollection createFunctionCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExternalLibPackage getExternalLibPackage();

} //ExternalLibFactory
