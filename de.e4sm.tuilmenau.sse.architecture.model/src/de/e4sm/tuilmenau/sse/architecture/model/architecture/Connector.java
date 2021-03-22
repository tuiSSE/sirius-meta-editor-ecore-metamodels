/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector#isDistinct <em>Distinct</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends ModelElement, LineStyle {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getConnector_Distinct()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

} // Connector
