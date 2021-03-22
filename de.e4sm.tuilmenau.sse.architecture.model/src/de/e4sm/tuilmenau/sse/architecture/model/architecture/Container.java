/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

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
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#getAllowedChildren <em>Allowed Children</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#isInvertAllowedChildren <em>Invert Allowed Children</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends ItemWithPort {
	/**
	 * Returns the value of the '<em><b>Allowed Children</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Children</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getContainer_AllowedChildren()
	 * @model
	 * @generated
	 */
	EList<ItemWithPort> getAllowedChildren();

	/**
	 * Returns the value of the '<em><b>Invert Allowed Children</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Allowed Children</em>' attribute.
	 * @see #setInvertAllowedChildren(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getContainer_InvertAllowedChildren()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInvertAllowedChildren();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#isInvertAllowedChildren <em>Invert Allowed Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Allowed Children</em>' attribute.
	 * @see #isInvertAllowedChildren()
	 * @generated
	 */
	void setInvertAllowedChildren(boolean value);

} // Container
