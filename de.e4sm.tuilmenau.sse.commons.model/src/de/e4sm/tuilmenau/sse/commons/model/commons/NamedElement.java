/**
 */
package de.e4sm.tuilmenau.sse.commons.model.commons;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.commons.model.commons.CommonsPackage#getNamedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.CommonsPackage#getNamedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.CommonsPackage#getNamedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.CommonsPackage#getNamedElement_Version()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // NamedElement
