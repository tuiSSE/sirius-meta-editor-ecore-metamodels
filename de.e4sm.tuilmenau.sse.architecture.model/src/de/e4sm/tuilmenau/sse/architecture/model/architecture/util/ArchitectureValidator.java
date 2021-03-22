/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.util;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArchitectureValidator INSTANCE = new ArchitectureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.e4sm.tuilmenau.sse.architecture.model.architecture";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ArchitecturePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ArchitecturePackage.DIAGRAM:
				return validateDiagram((Diagram)value, diagnostics, context);
			case ArchitecturePackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case ArchitecturePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case ArchitecturePackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case ArchitecturePackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case ArchitecturePackage.ADD_ON:
				return validateAddOn((AddOn)value, diagnostics, context);
			case ArchitecturePackage.ARCHITECTURE:
				return validateArchitecture((Architecture)value, diagnostics, context);
			case ArchitecturePackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case ArchitecturePackage.RANGE_CONNECTION:
				return validateRangeConnection((RangeConnection)value, diagnostics, context);
			case ArchitecturePackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case ArchitecturePackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case ArchitecturePackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ArchitecturePackage.ITEM_WITH_PORT:
				return validateItemWithPort((ItemWithPort)value, diagnostics, context);
			case ArchitecturePackage.METAMODEL:
				return validateMetamodel((Metamodel)value, diagnostics, context);
			case ArchitecturePackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case ArchitecturePackage.BLOCK_STYLE:
				return validateBlockStyle((BlockStyle)value, diagnostics, context);
			case ArchitecturePackage.LINE_STYLE:
				return validateLineStyle((LineStyle)value, diagnostics, context);
			case ArchitecturePackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(modelElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the superTypeIsNotSelf constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_ELEMENT__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION = "self.isA <> self";

	/**
	 * Validates the superTypeIsNotSelf constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement_superTypeIsNotSelf(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ArchitecturePackage.Literals.MODEL_ELEMENT,
				 modelElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "superTypeIsNotSelf",
				 MODEL_ELEMENT__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the superTypeIsCompatible constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_ELEMENT__SUPER_TYPE_IS_COMPATIBLE__EEXPRESSION = "self.isA.oclIsUndefined() or self.oclIsKindOf(self.isA.oclType())";

	/**
	 * Validates the superTypeIsCompatible constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement_superTypeIsCompatible(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ArchitecturePackage.Literals.MODEL_ELEMENT,
				 modelElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "superTypeIsCompatible",
				 MODEL_ELEMENT__SUPER_TYPE_IS_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the propertiesWithSameName constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_ELEMENT__PROPERTIES_WITH_SAME_NAME__EEXPRESSION = "self.isA.oclIsUndefined() or self.properties->forAll(p:Property | self.isA.properties->forAll(sp: Property|sp.name <> p.name))";

	/**
	 * Validates the propertiesWithSameName constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement_propertiesWithSameName(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ArchitecturePackage.Literals.MODEL_ELEMENT,
				 modelElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "propertiesWithSameName",
				 MODEL_ELEMENT__PROPERTIES_WITH_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(container, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddOn(AddOn addOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addOn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(addOn, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(addOn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchitecture(Architecture architecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(architecture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(edge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeConnection(RangeConnection rangeConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rangeConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(rangeConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(rangeConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(item, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(connector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemWithPort(ItemWithPort itemWithPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemWithPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsNotSelf(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_superTypeIsCompatible(itemWithPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_propertiesWithSameName(itemWithPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetamodel(Metamodel metamodel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metamodel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockStyle(BlockStyle blockStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyle(LineStyle lineStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavior, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ArchitectureValidator
