/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement}.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getContainer_Children()
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<ContainableElement> getChildren();

} // Container
