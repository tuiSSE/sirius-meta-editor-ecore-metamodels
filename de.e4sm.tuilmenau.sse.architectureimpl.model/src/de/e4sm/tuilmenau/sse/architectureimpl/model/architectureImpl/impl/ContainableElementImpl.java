/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl;

import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage;
import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ContainableElement;
import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ContainableElementImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainableElementImpl extends ConnectableElementImpl implements ContainableElement {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureImplPackage.Literals.CONTAINABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container getContainer() {
		if (eContainerFeatureID() != ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER) return null;
		return (de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, ArchitectureImplPackage.CONTAINER__CHILDREN, de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectWithInverseResolvingEList<Port>(Port.class, this, ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS, ArchitectureImplPackage.PORT__OWNER);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container)otherEnd, msgs);
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				return basicSetContainer(null, msgs);
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, ArchitectureImplPackage.CONTAINER__CHILDREN, de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				return getContainer();
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				return getPorts();
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
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				setContainer((de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container)newValue);
				return;
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				setContainer((de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.Container)null);
				return;
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				getPorts().clear();
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
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__CONTAINER:
				return getContainer() != null;
			case ArchitectureImplPackage.CONTAINABLE_ELEMENT__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainableElementImpl
