/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

import de.e4sm.tuilmenau.sse.commons.model.commons.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary <em>Externallibrary</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunction()
 * @model abstract="true"
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"VOID"</code>.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @see #setReturnType(Type)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunction_ReturnType()
	 * @model default="VOID"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Externallibrary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externallibrary</em>' container reference.
	 * @see #setExternallibrary(ExternalLibrary)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunction_Externallibrary()
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary#getFunctions
	 * @model opposite="functions" required="true" transient="false"
	 * @generated
	 */
	ExternalLibrary getExternallibrary();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function#getExternallibrary <em>Externallibrary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externallibrary</em>' container reference.
	 * @see #getExternallibrary()
	 * @generated
	 */
	void setExternallibrary(ExternalLibrary value);

} // Function
