/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Root#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getRoot()
 * @model abstract="true"
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getRoot_Modelelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelements();

} // Root
