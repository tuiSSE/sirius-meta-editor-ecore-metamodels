/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer <em>Container</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getContainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainableElement extends ConnectableElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getContainableElement_Container()
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port}.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getContainableElement_Ports()
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<Port> getPorts();

} // ContainableElement
