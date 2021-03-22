/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.RangeConnector#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getRangeConnector()
 * @model abstract="true"
 * @generated
 */
public interface RangeConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage#getRangeConnector_Targets()
	 * @model
	 * @generated
	 */
	EList<ConnectableElement> getTargets();

} // RangeConnector
