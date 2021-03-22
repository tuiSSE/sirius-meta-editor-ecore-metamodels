/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement#getAddons <em>Addons</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Addons</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.AddOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addons</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getConnectableElement_Addons()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddOn> getAddons();

} // ConnectableElement
