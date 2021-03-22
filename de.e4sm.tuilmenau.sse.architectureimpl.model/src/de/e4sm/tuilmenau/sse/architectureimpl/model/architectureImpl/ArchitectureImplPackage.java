/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl;

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
 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitectureImplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architectureImpl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://e4sm-projekt.de/ecore/ari";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ari";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureImplPackage eINSTANCE = de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ModelElementImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectableElementImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getConnectableElement()
	 * @generated
	 */
	int CONNECTABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__ADDONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl <em>Containable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getContainableElement()
	 * @generated
	 */
	int CONTAINABLE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__NAME = CONNECTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__ADDONS = CONNECTABLE_ELEMENT__ADDONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__CONTAINER = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__PORTS = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_OPERATION_COUNT = CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.NodeImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = CONTAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ADDONS = CONTAINABLE_ELEMENT__ADDONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINER = CONTAINABLE_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORTS = CONTAINABLE_ELEMENT__PORTS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainerImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = CONTAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADDONS = CONTAINABLE_ELEMENT__ADDONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER = CONTAINABLE_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = CONTAINABLE_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.PortImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = CONNECTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ADDONS = CONNECTABLE_ELEMENT__ADDONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OWNER = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectorImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.EdgeImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RangeConnectorImpl <em>Range Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RangeConnectorImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getRangeConnector()
	 * @generated
	 */
	int RANGE_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTOR__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTOR__TARGETS = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RootImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 8;

	/**
	 * The feature id for the '<em><b>Modelelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MODELELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.AddOnImpl <em>Add On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.AddOnImpl
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getAddOn()
	 * @generated
	 */
	int ADD_ON = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container#getChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Children();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port#getOwner()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Owner();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.RangeConnector <em>Range Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Connector</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.RangeConnector
	 * @generated
	 */
	EClass getRangeConnector();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.RangeConnector#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.RangeConnector#getTargets()
	 * @see #getRangeConnector()
	 * @generated
	 */
	EReference getRangeConnector_Targets();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement
	 * @generated
	 */
	EClass getConnectableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement#getAddons <em>Addons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addons</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement#getAddons()
	 * @see #getConnectableElement()
	 * @generated
	 */
	EReference getConnectableElement_Addons();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Root#getModelelements <em>Modelelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelements</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Root#getModelelements()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Modelelements();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Element</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement
	 * @generated
	 */
	EClass getContainableElement();

	/**
	 * Returns the meta object for the container reference '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getContainer()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_Container();

	/**
	 * Returns the meta object for the reference list '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement#getPorts()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_Ports();

	/**
	 * Returns the meta object for class '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.AddOn <em>Add On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add On</em>'.
	 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.AddOn
	 * @generated
	 */
	EClass getAddOn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureImplFactory getArchitectureImplFactory();

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
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ModelElementImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.NodeImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainerImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CHILDREN = eINSTANCE.getContainer_Children();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.PortImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OWNER = eINSTANCE.getPort_Owner();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectorImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.EdgeImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RangeConnectorImpl <em>Range Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RangeConnectorImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getRangeConnector()
		 * @generated
		 */
		EClass RANGE_CONNECTOR = eINSTANCE.getRangeConnector();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONNECTOR__TARGETS = eINSTANCE.getRangeConnector_Targets();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectableElementImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getConnectableElement()
		 * @generated
		 */
		EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

		/**
		 * The meta object literal for the '<em><b>Addons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTABLE_ELEMENT__ADDONS = eINSTANCE.getConnectableElement_Addons();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.RootImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Modelelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MODELELEMENTS = eINSTANCE.getRoot_Modelelements();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.NamedElement
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl <em>Containable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getContainableElement()
		 * @generated
		 */
		EClass CONTAINABLE_ELEMENT = eINSTANCE.getContainableElement();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__CONTAINER = eINSTANCE.getContainableElement_Container();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__PORTS = eINSTANCE.getContainableElement_Ports();

		/**
		 * The meta object literal for the '{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.AddOnImpl <em>Add On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.AddOnImpl
		 * @see de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ArchitectureImplPackageImpl#getAddOn()
		 * @generated
		 */
		EClass ADD_ON = eINSTANCE.getAddOn();

	}

} //ArchitectureImplPackage
