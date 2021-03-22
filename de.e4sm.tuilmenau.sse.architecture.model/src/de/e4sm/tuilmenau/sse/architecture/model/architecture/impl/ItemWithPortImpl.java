/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.impl;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item With Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl#getAllowedPorts <em>Allowed Ports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl#isInvertAllowedPorts <em>Invert Allowed Ports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemWithPortImpl#isNoDirectConnections <em>No Direct Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ItemWithPortImpl extends ItemImpl implements ItemWithPort {
	/**
	 * The cached value of the '{@link #getAllowedPorts() <em>Allowed Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> allowedPorts;

	/**
	 * The default value of the '{@link #isInvertAllowedPorts() <em>Invert Allowed Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERT_ALLOWED_PORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvertAllowedPorts() <em>Invert Allowed Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedPorts()
	 * @generated
	 * @ordered
	 */
	protected boolean invertAllowedPorts = INVERT_ALLOWED_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDirectConnections() <em>No Direct Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectConnections()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DIRECT_CONNECTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoDirectConnections() <em>No Direct Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectConnections()
	 * @generated
	 * @ordered
	 */
	protected boolean noDirectConnections = NO_DIRECT_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemWithPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ITEM_WITH_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getAllowedPorts() {
		if (allowedPorts == null) {
			allowedPorts = new EObjectResolvingEList<Port>(Port.class, this, ArchitecturePackage.ITEM_WITH_PORT__ALLOWED_PORTS);
		}
		return allowedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvertAllowedPorts() {
		return invertAllowedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvertAllowedPorts(boolean newInvertAllowedPorts) {
		boolean oldInvertAllowedPorts = invertAllowedPorts;
		invertAllowedPorts = newInvertAllowedPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ITEM_WITH_PORT__INVERT_ALLOWED_PORTS, oldInvertAllowedPorts, invertAllowedPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoDirectConnections() {
		return noDirectConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoDirectConnections(boolean newNoDirectConnections) {
		boolean oldNoDirectConnections = noDirectConnections;
		noDirectConnections = newNoDirectConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS, oldNoDirectConnections, noDirectConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.ITEM_WITH_PORT__ALLOWED_PORTS:
				return getAllowedPorts();
			case ArchitecturePackage.ITEM_WITH_PORT__INVERT_ALLOWED_PORTS:
				return isInvertAllowedPorts();
			case ArchitecturePackage.ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS:
				return isNoDirectConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.ITEM_WITH_PORT__ALLOWED_PORTS:
				getAllowedPorts().clear();
				getAllowedPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ArchitecturePackage.ITEM_WITH_PORT__INVERT_ALLOWED_PORTS:
				setInvertAllowedPorts((Boolean)newValue);
				return;
			case ArchitecturePackage.ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS:
				setNoDirectConnections((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.ITEM_WITH_PORT__ALLOWED_PORTS:
				getAllowedPorts().clear();
				return;
			case ArchitecturePackage.ITEM_WITH_PORT__INVERT_ALLOWED_PORTS:
				setInvertAllowedPorts(INVERT_ALLOWED_PORTS_EDEFAULT);
				return;
			case ArchitecturePackage.ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS:
				setNoDirectConnections(NO_DIRECT_CONNECTIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.ITEM_WITH_PORT__ALLOWED_PORTS:
				return allowedPorts != null && !allowedPorts.isEmpty();
			case ArchitecturePackage.ITEM_WITH_PORT__INVERT_ALLOWED_PORTS:
				return invertAllowedPorts != INVERT_ALLOWED_PORTS_EDEFAULT;
			case ArchitecturePackage.ITEM_WITH_PORT__NO_DIRECT_CONNECTIONS:
				return noDirectConnections != NO_DIRECT_CONNECTIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (invertAllowedPorts: ");
		result.append(invertAllowedPorts);
		result.append(", noDirectConnections: ");
		result.append(noDirectConnections);
		result.append(')');
		return result.toString();
	}

} //ItemWithPortImpl
