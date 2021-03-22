/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends ModelElement, BlockStyle {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItem_Outgoing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getItem_Incoming()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getIncoming();

} // Item
