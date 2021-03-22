/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunctionCollection()
 * @model
 * @generated
 */
public interface FunctionCollection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getFunctionCollection_Functions()
	 * @model
	 * @generated
	 */
	EList<Function> getFunctions();

} // FunctionCollection
