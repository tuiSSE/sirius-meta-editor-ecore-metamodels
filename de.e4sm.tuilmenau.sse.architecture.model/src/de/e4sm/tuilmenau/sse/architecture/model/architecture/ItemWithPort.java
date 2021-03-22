/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item With Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#getAllowedPorts <em>Allowed Ports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isInvertAllowedPorts <em>Invert Allowed Ports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isNoDirectConnections <em>No Direct Connections</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItemWithPort()
 * @model abstract="true"
 * @generated
 */
public interface ItemWithPort extends Item {
	/**
	 * Returns the value of the '<em><b>Allowed Ports</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Ports</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItemWithPort_AllowedPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getAllowedPorts();

	/**
	 * Returns the value of the '<em><b>Invert Allowed Ports</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Allowed Ports</em>' attribute.
	 * @see #setInvertAllowedPorts(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItemWithPort_InvertAllowedPorts()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInvertAllowedPorts();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isInvertAllowedPorts <em>Invert Allowed Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Allowed Ports</em>' attribute.
	 * @see #isInvertAllowedPorts()
	 * @generated
	 */
	void setInvertAllowedPorts(boolean value);

	/**
	 * Returns the value of the '<em><b>No Direct Connections</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Direct Connections</em>' attribute.
	 * @see #setNoDirectConnections(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItemWithPort_NoDirectConnections()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNoDirectConnections();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isNoDirectConnections <em>No Direct Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Direct Connections</em>' attribute.
	 * @see #isNoDirectConnections()
	 * @generated
	 */
	void setNoDirectConnections(boolean value);

} // ItemWithPort
