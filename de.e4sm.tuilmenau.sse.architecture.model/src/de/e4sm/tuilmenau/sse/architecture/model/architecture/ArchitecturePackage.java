/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture;

import de.e4sm.tuilmenau.sse.commons.model.commons.CommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitectureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import com='platform:/resource/de.e4sm.tuilmenau.sse.commons.model/model/commons.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore' el='platform:/resource/de.e4sm.tuilmenau.sse.externallib.model/model/externalLib.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://e4sm-projekt.de/ecore/ar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.DiagramImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = CommonsPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VERSION = CommonsPackage.NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LEVEL = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ModelElementImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = CommonsPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__VERSION = CommonsPackage.NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__PROPERTIES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_ABSTRACT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_A = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VERSION = MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PROPERTIES = MODEL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_ABSTRACT = MODEL_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_A = MODEL_ELEMENT__IS_A;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BACKGROUND_COLOR = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LABEL_COLOR = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BORDER_COLOR = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OUTGOING = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INCOMING = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl <em>Item With Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getItemWithPort()
	 * @generated
	 */
	int ITEM_WITH_PORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__VERSION = ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__PROPERTIES = ITEM__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__IS_ABSTRACT = ITEM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__IS_A = ITEM__IS_A;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__BACKGROUND_COLOR = ITEM__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__LABEL_COLOR = ITEM__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__BORDER_COLOR = ITEM__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__OUTGOING = ITEM__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__INCOMING = ITEM__INCOMING;

	/**
	 * The feature id for the '<em><b>Allowed Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__ALLOWED_PORTS = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invert Allowed Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__INVERT_ALLOWED_PORTS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Direct Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item With Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Item With Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WITH_PORT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.NodeImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ITEM_WITH_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = ITEM_WITH_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VERSION = ITEM_WITH_PORT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = ITEM_WITH_PORT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_ABSTRACT = ITEM_WITH_PORT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_A = ITEM_WITH_PORT__IS_A;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BACKGROUND_COLOR = ITEM_WITH_PORT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL_COLOR = ITEM_WITH_PORT__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BORDER_COLOR = ITEM_WITH_PORT__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = ITEM_WITH_PORT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = ITEM_WITH_PORT__INCOMING;

	/**
	 * The feature id for the '<em><b>Allowed Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ALLOWED_PORTS = ITEM_WITH_PORT__ALLOWED_PORTS;

	/**
	 * The feature id for the '<em><b>Invert Allowed Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INVERT_ALLOWED_PORTS = ITEM_WITH_PORT__INVERT_ALLOWED_PORTS;

	/**
	 * The feature id for the '<em><b>No Direct Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NO_DIRECT_CONNECTIONS = ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ITEM_WITH_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ITEM_WITH_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ITEM_WITH_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = ITEM_WITH_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSION = ITEM_WITH_PORT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROPERTIES = ITEM_WITH_PORT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_ABSTRACT = ITEM_WITH_PORT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_A = ITEM_WITH_PORT__IS_A;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BACKGROUND_COLOR = ITEM_WITH_PORT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LABEL_COLOR = ITEM_WITH_PORT__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BORDER_COLOR = ITEM_WITH_PORT__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OUTGOING = ITEM_WITH_PORT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INCOMING = ITEM_WITH_PORT__INCOMING;

	/**
	 * The feature id for the '<em><b>Allowed Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ALLOWED_PORTS = ITEM_WITH_PORT__ALLOWED_PORTS;

	/**
	 * The feature id for the '<em><b>Invert Allowed Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INVERT_ALLOWED_PORTS = ITEM_WITH_PORT__INVERT_ALLOWED_PORTS;

	/**
	 * The feature id for the '<em><b>No Direct Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NO_DIRECT_CONNECTIONS = ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Allowed Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ALLOWED_CHILDREN = ITEM_WITH_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invert Allowed Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INVERT_ALLOWED_CHILDREN = ITEM_WITH_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ITEM_WITH_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ITEM_WITH_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PortImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VERSION = ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROPERTIES = ITEM__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_ABSTRACT = ITEM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_A = ITEM__IS_A;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BACKGROUND_COLOR = ITEM__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LABEL_COLOR = ITEM__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BORDER_COLOR = ITEM__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUTGOING = ITEM__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INCOMING = ITEM__INCOMING;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl <em>Add On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getAddOn()
	 * @generated
	 */
	int ADD_ON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__VERSION = MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__PROPERTIES = MODEL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__IS_ABSTRACT = MODEL_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__IS_A = MODEL_ELEMENT__IS_A;

	/**
	 * The feature id for the '<em><b>Allowed On Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__ALLOWED_ON_ITEMS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invert Allowed Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__INVERT_ALLOWED_ITEMS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DESCRIPTION = CommonsPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__VERSION = CommonsPackage.NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DIAGRAMS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modelelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__MODELELEMENTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__IMPORTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__BEHAVIORS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectorImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VERSION = MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPERTIES = MODEL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ABSTRACT = MODEL_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_A = MODEL_ELEMENT__IS_A;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__WIDTH = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COLOR = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LINE_STYLE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DISTINCT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.EdgeImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VERSION = CONNECTOR__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PROPERTIES = CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__IS_A = CONNECTOR__IS_A;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WIDTH = CONNECTOR__WIDTH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COLOR = CONNECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LINE_STYLE = CONNECTOR__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DISTINCT = CONNECTOR__DISTINCT;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BIDIRECTIONAL = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Connect To Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CAN_CONNECT_TO_SELF = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.RangeConnectionImpl <em>Range Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.RangeConnectionImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getRangeConnection()
	 * @generated
	 */
	int RANGE_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__DESCRIPTION = CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__VERSION = CONNECTOR__VERSION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__PROPERTIES = CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__IS_A = CONNECTOR__IS_A;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__WIDTH = CONNECTOR__WIDTH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__COLOR = CONNECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__LINE_STYLE = CONNECTOR__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION__DISTINCT = CONNECTOR__DISTINCT;

	/**
	 * The number of structural features of the '<em>Range Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Range Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PropertyImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = CommonsPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VERSION = CommonsPackage.NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_VALUE = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.MetamodelImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 13;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__URI = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectionImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = CommonsPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VERSION = CommonsPackage.NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MAX = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MIN = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTOR = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allowed Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ALLOWED_TARGETS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle <em>Block Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getBlockStyle()
	 * @generated
	 */
	int BLOCK_STYLE = 15;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STYLE__BACKGROUND_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STYLE__LABEL_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STYLE__BORDER_COLOR = 2;

	/**
	 * The number of structural features of the '<em>Block Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 16;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__LINE_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.BehaviorImpl
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 17;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PRECONDITION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BODY = 1;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__POST_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getElements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Elements();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram#getLevel()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Level();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getProperties()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Properties();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#isIsAbstract()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_IsAbstract();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is A</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement#getIsA()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsA();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#getAllowedChildren <em>Allowed Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Children</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#getAllowedChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_AllowedChildren();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#isInvertAllowedChildren <em>Invert Allowed Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert Allowed Children</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Container#isInvertAllowedChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_InvertAllowedChildren();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn <em>Add On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add On</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn
	 * @generated
	 */
	EClass getAddOn();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#getAllowedOnItems <em>Allowed On Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed On Items</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#getAllowedOnItems()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_AllowedOnItems();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#isInvertAllowedItems <em>Invert Allowed Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert Allowed Items</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn#isInvertAllowedItems()
	 * @see #getAddOn()
	 * @generated
	 */
	EAttribute getAddOn_InvertAllowedItems();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getDiagrams()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Diagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getModelelements <em>Modelelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelements</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getModelelements()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Modelelements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getImports()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture#getBehaviors()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Behaviors();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge#isBidirectional()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Bidirectional();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge#isCanConnectToSelf <em>Can Connect To Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Connect To Self</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Edge#isCanConnectToSelf()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_CanConnectToSelf();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.RangeConnection <em>Range Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Connection</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.RangeConnection
	 * @generated
	 */
	EClass getRangeConnection();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getOutgoing()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Outgoing();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Item#getIncoming()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Incoming();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connector#isDistinct()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Distinct();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#isRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Property#getDefaultValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DefaultValue();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort <em>Item With Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item With Port</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort
	 * @generated
	 */
	EClass getItemWithPort();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#getAllowedPorts <em>Allowed Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Ports</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#getAllowedPorts()
	 * @see #getItemWithPort()
	 * @generated
	 */
	EReference getItemWithPort_AllowedPorts();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isInvertAllowedPorts <em>Invert Allowed Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert Allowed Ports</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isInvertAllowedPorts()
	 * @see #getItemWithPort()
	 * @generated
	 */
	EAttribute getItemWithPort_InvertAllowedPorts();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isNoDirectConnections <em>No Direct Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Direct Connections</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort#isNoDirectConnections()
	 * @see #getItemWithPort()
	 * @generated
	 */
	EAttribute getItemWithPort_NoDirectConnections();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel#getUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Uri();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMax()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getMin()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Min();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getConnector()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Connector();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getAllowedTargets <em>Allowed Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Targets</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection#getAllowedTargets()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_AllowedTargets();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle <em>Block Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Style</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle
	 * @generated
	 */
	EClass getBlockStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBackgroundColor()
	 * @see #getBlockStyle()
	 * @generated
	 */
	EAttribute getBlockStyle_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getLabelColor <em>Label Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Color</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getLabelColor()
	 * @see #getBlockStyle()
	 * @generated
	 */
	EAttribute getBlockStyle_LabelColor();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle#getBorderColor()
	 * @see #getBlockStyle()
	 * @generated
	 */
	EAttribute getBlockStyle_BorderColor();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getWidth()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getColor()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle#getLineStyle()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_LineStyle();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getPrecondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Precondition();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getBody()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Body();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior#getPostCondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_PostCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.DiagramImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ELEMENTS = eINSTANCE.getDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__LEVEL = eINSTANCE.getDiagram_Level();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ModelElementImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__PROPERTIES = eINSTANCE.getModelElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__IS_ABSTRACT = eINSTANCE.getModelElement_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_A = eINSTANCE.getModelElement_IsA();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.NodeImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Allowed Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ALLOWED_CHILDREN = eINSTANCE.getContainer_AllowedChildren();

		/**
		 * The meta object literal for the '<em><b>Invert Allowed Children</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__INVERT_ALLOWED_CHILDREN = eINSTANCE.getContainer_InvertAllowedChildren();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PortImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl <em>Add On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getAddOn()
		 * @generated
		 */
		EClass ADD_ON = eINSTANCE.getAddOn();

		/**
		 * The meta object literal for the '<em><b>Allowed On Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__ALLOWED_ON_ITEMS = eINSTANCE.getAddOn_AllowedOnItems();

		/**
		 * The meta object literal for the '<em><b>Invert Allowed Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ON__INVERT_ALLOWED_ITEMS = eINSTANCE.getAddOn_InvertAllowedItems();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__DIAGRAMS = eINSTANCE.getArchitecture_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Modelelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__MODELELEMENTS = eINSTANCE.getArchitecture_Modelelements();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__IMPORTS = eINSTANCE.getArchitecture_Imports();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__BEHAVIORS = eINSTANCE.getArchitecture_Behaviors();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.EdgeImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__BIDIRECTIONAL = eINSTANCE.getEdge_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Can Connect To Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__CAN_CONNECT_TO_SELF = eINSTANCE.getEdge_CanConnectToSelf();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.RangeConnectionImpl <em>Range Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.RangeConnectionImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getRangeConnection()
		 * @generated
		 */
		EClass RANGE_CONNECTION = eINSTANCE.getRangeConnection();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OUTGOING = eINSTANCE.getItem_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__INCOMING = eINSTANCE.getItem_Incoming();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectorImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DISTINCT = eINSTANCE.getConnector_Distinct();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.PropertyImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REQUIRED = eINSTANCE.getProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT_VALUE = eINSTANCE.getProperty_DefaultValue();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl <em>Item With Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getItemWithPort()
		 * @generated
		 */
		EClass ITEM_WITH_PORT = eINSTANCE.getItemWithPort();

		/**
		 * The meta object literal for the '<em><b>Allowed Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_WITH_PORT__ALLOWED_PORTS = eINSTANCE.getItemWithPort_AllowedPorts();

		/**
		 * The meta object literal for the '<em><b>Invert Allowed Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_WITH_PORT__INVERT_ALLOWED_PORTS = eINSTANCE.getItemWithPort_InvertAllowedPorts();

		/**
		 * The meta object literal for the '<em><b>No Direct Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS = eINSTANCE.getItemWithPort_NoDirectConnections();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.MetamodelImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__URI = eINSTANCE.getMetamodel_Uri();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ConnectionImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__MAX = eINSTANCE.getConnection_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__MIN = eINSTANCE.getConnection_Min();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTOR = eINSTANCE.getConnection_Connector();

		/**
		 * The meta object literal for the '<em><b>Allowed Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ALLOWED_TARGETS = eINSTANCE.getConnection_AllowedTargets();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle <em>Block Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getBlockStyle()
		 * @generated
		 */
		EClass BLOCK_STYLE = eINSTANCE.getBlockStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_STYLE__BACKGROUND_COLOR = eINSTANCE.getBlockStyle_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Label Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_STYLE__LABEL_COLOR = eINSTANCE.getBlockStyle_LabelColor();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_STYLE__BORDER_COLOR = eINSTANCE.getBlockStyle_BorderColor();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle <em>Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.LineStyle
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getLineStyle()
		 * @generated
		 */
		EClass LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__WIDTH = eINSTANCE.getLineStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__COLOR = eINSTANCE.getLineStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__LINE_STYLE = eINSTANCE.getLineStyle_LineStyle();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.BehaviorImpl
		 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitecturePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__PRECONDITION = eINSTANCE.getBehavior_Precondition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__BODY = eINSTANCE.getBehavior_Body();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__POST_CONDITION = eINSTANCE.getBehavior_PostCondition();

	}

} //ArchitecturePackage
