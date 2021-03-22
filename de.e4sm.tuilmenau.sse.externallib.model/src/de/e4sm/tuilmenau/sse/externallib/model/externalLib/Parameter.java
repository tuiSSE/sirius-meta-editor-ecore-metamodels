/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib;

import de.e4sm.tuilmenau.sse.commons.model.commons.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @see #setType(Type)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage#getParameter_Optional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Parameter
