/**
 */
package de.e4sm.tuilmenau.sse.commons.model.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.e4sm.tuilmenau.sse.commons.model.commons.CommonsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://e4sm-projekt.de/ecore/com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Language
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 1;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 2;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Line <em>Line</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Line
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;


	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement#getVersion()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Version();

	/**
	 * Returns the meta object for enum '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Line
	 * @generated
	 */
	EEnum getLine();

	/**
	 * Returns the meta object for enum '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.NamedElement
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VERSION = eINSTANCE.getNamedElement_Version();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Language
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Color
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Line <em>Line</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Line
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getLine()
		 * @generated
		 */
		EEnum LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.commons.model.commons.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.Type
		 * @see de.e4sm.tuilmenau.sse.commons.model.commons.impl.CommonsPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //CommonsPackage
