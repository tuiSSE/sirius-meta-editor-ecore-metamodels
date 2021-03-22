/**
 */
package de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl;

import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.AddOn;
import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ArchitectureImplPackage;
import de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.ConnectableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architectureimpl.model.architectureImpl.impl.ConnectableElementImpl#getAddons <em>Addons</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends ModelElementImpl implements ConnectableElement {
	/**
	 * The cached value of the '{@link #getAddons() <em>Addons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddons()
	 * @generated
	 * @ordered
	 */
	protected EList<AddOn> addons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureImplPackage.Literals.CONNECTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddOn> getAddons() {
		if (addons == null) {
			addons = new EObjectContainmentEList<AddOn>(AddOn.class, this, ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS);
		}
		return addons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS:
				return ((InternalEList<?>)getAddons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS:
				return getAddons();
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
			case ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS:
				getAddons().clear();
				getAddons().addAll((Collection<? extends AddOn>)newValue);
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
			case ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS:
				getAddons().clear();
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
			case ArchitectureImplPackage.CONNECTABLE_ELEMENT__ADDONS:
				return addons != null && !addons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectableElementImpl
