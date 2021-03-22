/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.impl;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.ItemWithPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl#getAllowedChildren <em>Allowed Children</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ContainerImpl#isInvertAllowedChildren <em>Invert Allowed Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ItemWithPortImpl implements de.e4sm.tuilmenau.sse.architecture.model.architecture.Container {
	/**
	 * The cached value of the '{@link #getAllowedChildren() <em>Allowed Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemWithPort> allowedChildren;

	/**
	 * The default value of the '{@link #isInvertAllowedChildren() <em>Invert Allowed Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedChildren()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERT_ALLOWED_CHILDREN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvertAllowedChildren() <em>Invert Allowed Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedChildren()
	 * @generated
	 * @ordered
	 */
	protected boolean invertAllowedChildren = INVERT_ALLOWED_CHILDREN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemWithPort> getAllowedChildren() {
		if (allowedChildren == null) {
			allowedChildren = new EObjectResolvingEList<ItemWithPort>(ItemWithPort.class, this, ArchitecturePackage.CONTAINER__ALLOWED_CHILDREN);
		}
		return allowedChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvertAllowedChildren() {
		return invertAllowedChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvertAllowedChildren(boolean newInvertAllowedChildren) {
		boolean oldInvertAllowedChildren = invertAllowedChildren;
		invertAllowedChildren = newInvertAllowedChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONTAINER__INVERT_ALLOWED_CHILDREN, oldInvertAllowedChildren, invertAllowedChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.CONTAINER__ALLOWED_CHILDREN:
				return getAllowedChildren();
			case ArchitecturePackage.CONTAINER__INVERT_ALLOWED_CHILDREN:
				return isInvertAllowedChildren();
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
			case ArchitecturePackage.CONTAINER__ALLOWED_CHILDREN:
				getAllowedChildren().clear();
				getAllowedChildren().addAll((Collection<? extends ItemWithPort>)newValue);
				return;
			case ArchitecturePackage.CONTAINER__INVERT_ALLOWED_CHILDREN:
				setInvertAllowedChildren((Boolean)newValue);
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
			case ArchitecturePackage.CONTAINER__ALLOWED_CHILDREN:
				getAllowedChildren().clear();
				return;
			case ArchitecturePackage.CONTAINER__INVERT_ALLOWED_CHILDREN:
				setInvertAllowedChildren(INVERT_ALLOWED_CHILDREN_EDEFAULT);
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
			case ArchitecturePackage.CONTAINER__ALLOWED_CHILDREN:
				return allowedChildren != null && !allowedChildren.isEmpty();
			case ArchitecturePackage.CONTAINER__INVERT_ALLOWED_CHILDREN:
				return invertAllowedChildren != INVERT_ALLOWED_CHILDREN_EDEFAULT;
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
		result.append(" (invertAllowedChildren: ");
		result.append(invertAllowedChildren);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
