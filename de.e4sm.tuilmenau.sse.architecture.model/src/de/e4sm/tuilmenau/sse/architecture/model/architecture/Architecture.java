/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getModelelements <em>Modelelements</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getImports <em>Imports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getArchitecture_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getArchitecture_Modelelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelements();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getArchitecture_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getImports();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getArchitecture_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

} // Architecture
