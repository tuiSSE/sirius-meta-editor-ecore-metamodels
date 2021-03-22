/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getElements <em>Elements</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getDiagram_Elements()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getDiagram_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Diagram
