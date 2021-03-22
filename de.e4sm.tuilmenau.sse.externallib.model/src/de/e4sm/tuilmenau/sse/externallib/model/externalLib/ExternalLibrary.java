/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getType <em>Type</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getPath <em>Path</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getVersion <em>Version</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getCollections <em>Collections</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary()
 * @model
 * @generated
 */
public interface ExternalLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language
	 * @see #setType(Language)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary_Type()
	 * @model
	 * @generated
	 */
	Language getType();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language
	 * @see #getType()
	 * @generated
	 */
	void setType(Language value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionCollection> getCollections();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary <em>Externallibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference.
	 * @see #setFunctions(Function)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getExternalLibrary_Functions()
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary
	 * @model opposite="externallibrary" containment="true"
	 * @generated
	 */
	Function getFunctions();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functions</em>' containment reference.
	 * @see #getFunctions()
	 * @generated
	 */
	void setFunctions(Function value);

} // ExternalLibrary
