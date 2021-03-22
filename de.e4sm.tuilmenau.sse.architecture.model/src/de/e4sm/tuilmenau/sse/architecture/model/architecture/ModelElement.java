/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getModelElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='superTypeIsNotSelf superTypeIsCompatible propertiesWithSameName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot superTypeIsNotSelf='self.isA &lt;&gt; self' superTypeIsCompatible='self.isA.oclIsUndefined() or self.oclIsKindOf(self.isA.oclType())' propertiesWithSameName='self.isA.oclIsUndefined() or self.properties-&gt;forAll(p:Property | self.isA.properties-&gt;forAll(sp: Property|sp.name &lt;&gt; p.name))'"
 * @generated
 */
public interface ModelElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getModelElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getModelElement_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A</em>' reference.
	 * @see #setIsA(ModelElement)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getModelElement_IsA()
	 * @model
	 * @generated
	 */
	ModelElement getIsA();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getIsA <em>Is A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A</em>' reference.
	 * @see #getIsA()
	 * @generated
	 */
	void setIsA(ModelElement value);

} // ModelElement
