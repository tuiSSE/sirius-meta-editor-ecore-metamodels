/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ConnectableElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ContainableElement)
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getPort_Owner()
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getPorts
	 * @model opposite="ports" required="true"
	 * @generated
	 */
	ContainableElement getOwner();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ContainableElement value);

} // Port
