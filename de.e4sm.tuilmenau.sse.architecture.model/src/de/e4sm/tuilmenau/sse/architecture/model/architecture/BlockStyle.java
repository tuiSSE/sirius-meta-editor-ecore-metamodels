/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.Color;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getLabelColor <em>Label Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getBlockStyle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BlockStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #setBackgroundColor(Color)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getBlockStyle_BackgroundColor()
	 * @model default="white"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Label Color</b></em>' attribute.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #setLabelColor(Color)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getBlockStyle_LabelColor()
	 * @model
	 * @generated
	 */
	Color getLabelColor();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getLabelColor <em>Label Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #getLabelColor()
	 * @generated
	 */
	void setLabelColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #setBorderColor(Color)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getBlockStyle_BorderColor()
	 * @model
	 * @generated
	 */
	Color getBorderColor();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(Color value);

} // BlockStyle
