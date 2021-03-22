/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import com='platform:/resource/de.e4sm.tuilmenau.sse.commons.model/model/commons.ecore#/'"
 * @generated
 */
public interface ExternalLibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "externalLib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://e4sm-projekt.de/ecore/el";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "el";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalLibPackage eINSTANCE = de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.NamedElementImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl <em>External Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getExternalLibrary()
	 * @generated
	 */
	int EXTERNAL_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__PATH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__COLLECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>External Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>External Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Externallibrary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTERNALLIBRARY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.LibraryFunctionImpl <em>Library Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.LibraryFunctionImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getLibraryFunction()
	 * @generated
	 */
	int LIBRARY_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Externallibrary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__EXTERNALLIBRARY = FUNCTION__EXTERNALLIBRARY;

	/**
	 * The number of structural features of the '<em>Library Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ImplementedFunctionImpl <em>Implemented Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ImplementedFunctionImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getImplementedFunction()
	 * @generated
	 */
	int IMPLEMENTED_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Externallibrary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION__EXTERNALLIBRARY = FUNCTION__EXTERNALLIBRARY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION__CODE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implemented Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implemented Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ParameterImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionCollectionImpl <em>Function Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionCollectionImpl
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getFunctionCollection()
	 * @generated
	 */
	int FUNCTION_COLLECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_COLLECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_COLLECTION__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_COLLECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_COLLECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 7;


	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary <em>External Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Library</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary
	 * @generated
	 */
	EClass getExternalLibrary();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getType()
	 * @see #getExternalLibrary()
	 * @generated
	 */
	EAttribute getExternalLibrary_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getPath()
	 * @see #getExternalLibrary()
	 * @generated
	 */
	EAttribute getExternalLibrary_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getVersion()
	 * @see #getExternalLibrary()
	 * @generated
	 */
	EAttribute getExternalLibrary_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getCollections()
	 * @see #getExternalLibrary()
	 * @generated
	 */
	EReference getExternalLibrary_Collections();

	/**
	 * Returns the meta object for the containment reference '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functions</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions()
	 * @see #getExternalLibrary()
	 * @generated
	 */
	EReference getExternalLibrary_Functions();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ReturnType();

	/**
	 * Returns the meta object for the container reference '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary <em>Externallibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Externallibrary</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Externallibrary();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.LibraryFunction <em>Library Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Function</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.LibraryFunction
	 * @generated
	 */
	EClass getLibraryFunction();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ImplementedFunction <em>Implemented Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implemented Function</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ImplementedFunction
	 * @generated
	 */
	EClass getImplementedFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ImplementedFunction#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ImplementedFunction#getCode()
	 * @see #getImplementedFunction()
	 * @generated
	 */
	EAttribute getImplementedFunction_Code();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection <em>Function Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Collection</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection
	 * @generated
	 */
	EClass getFunctionCollection();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functions</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection#getFunctions()
	 * @see #getFunctionCollection()
	 * @generated
	 */
	EReference getFunctionCollection_Functions();

	/**
	 * Returns the meta object for enum '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalLibFactory getExternalLibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl <em>External Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getExternalLibrary()
		 * @generated
		 */
		EClass EXTERNAL_LIBRARY = eINSTANCE.getExternalLibrary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_LIBRARY__TYPE = eINSTANCE.getExternalLibrary_Type();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_LIBRARY__PATH = eINSTANCE.getExternalLibrary_Path();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_LIBRARY__VERSION = eINSTANCE.getExternalLibrary_Version();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_LIBRARY__COLLECTIONS = eINSTANCE.getExternalLibrary_Collections();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_LIBRARY__FUNCTIONS = eINSTANCE.getExternalLibrary_Functions();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.NamedElementImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Externallibrary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__EXTERNALLIBRARY = eINSTANCE.getFunction_Externallibrary();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.LibraryFunctionImpl <em>Library Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.LibraryFunctionImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getLibraryFunction()
		 * @generated
		 */
		EClass LIBRARY_FUNCTION = eINSTANCE.getLibraryFunction();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ImplementedFunctionImpl <em>Implemented Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ImplementedFunctionImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getImplementedFunction()
		 * @generated
		 */
		EClass IMPLEMENTED_FUNCTION = eINSTANCE.getImplementedFunction();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTED_FUNCTION__CODE = eINSTANCE.getImplementedFunction_Code();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ParameterImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionCollectionImpl <em>Function Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionCollectionImpl
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getFunctionCollection()
		 * @generated
		 */
		EClass FUNCTION_COLLECTION = eINSTANCE.getFunctionCollection();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_COLLECTION__FUNCTIONS = eINSTANCE.getFunctionCollection_Functions();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language
		 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //ExternalLibPackage
