/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#getAllowedOnItems <em>Allowed On Items</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#isInvertAllowedItems <em>Invert Allowed Items</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getAddOn()
 * @model
 * @generated
 */
public interface AddOn extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Allowed On Items</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed On Items</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getAddOn_AllowedOnItems()
	 * @model
	 * @generated
	 */
	EList<Item> getAllowedOnItems();

	/**
	 * Returns the value of the '<em><b>Invert Allowed Items</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Allowed Items</em>' attribute.
	 * @see #setInvertAllowedItems(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getAddOn_InvertAllowedItems()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInvertAllowedItems();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#isInvertAllowedItems <em>Invert Allowed Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Allowed Items</em>' attribute.
	 * @see #isInvertAllowedItems()
	 * @generated
	 */
	void setInvertAllowedItems(boolean value);

} // AddOn
