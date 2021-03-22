/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMax <em>Max</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMin <em>Min</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getAllowedTargets <em>Allowed Targets</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnection_Max()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnection_Min()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnection_Connector()
	 * @model required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Allowed Targets</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Targets</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnection_AllowedTargets()
	 * @model
	 * @generated
	 */
	EList<Item> getAllowedTargets();

} // Connection
