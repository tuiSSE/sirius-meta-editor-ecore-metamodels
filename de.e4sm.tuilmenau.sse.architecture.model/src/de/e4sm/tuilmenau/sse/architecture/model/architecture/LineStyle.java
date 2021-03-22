/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.Color;
import de.e4sm.tuilmenau.sse.commons.model.commons.Line;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getColor <em>Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getLineStyle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LineStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getLineStyle_Width()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #setColor(Color)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getLineStyle_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * The literals are from the enumeration {@link de.e4sm.tuilmenau.sse.commons.model.commons.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Line
	 * @see #setLineStyle(Line)
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage#getLineStyle_LineStyle()
	 * @model default="solid"
	 * @generated
	 */
	Line getLineStyle();

	/**
	 * Sets the value of the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Line
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(Line value);

} // LineStyle
