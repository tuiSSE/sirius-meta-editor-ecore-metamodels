/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.impl;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.AddOn;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Item;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl#getAllowedOnItems <em>Allowed On Items</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.AddOnImpl#isInvertAllowedItems <em>Invert Allowed Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddOnImpl extends ModelElementImpl implements AddOn {
	/**
	 * The cached value of the '{@link #getAllowedOnItems() <em>Allowed On Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedOnItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> allowedOnItems;

	/**
	 * The default value of the '{@link #isInvertAllowedItems() <em>Invert Allowed Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERT_ALLOWED_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvertAllowedItems() <em>Invert Allowed Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertAllowedItems()
	 * @generated
	 * @ordered
	 */
	protected boolean invertAllowedItems = INVERT_ALLOWED_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ADD_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getAllowedOnItems() {
		if (allowedOnItems == null) {
			allowedOnItems = new EObjectResolvingEList<Item>(Item.class, this, ArchitecturePackage.ADD_ON__ALLOWED_ON_ITEMS);
		}
		return allowedOnItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvertAllowedItems() {
		return invertAllowedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvertAllowedItems(boolean newInvertAllowedItems) {
		boolean oldInvertAllowedItems = invertAllowedItems;
		invertAllowedItems = newInvertAllowedItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ADD_ON__INVERT_ALLOWED_ITEMS, oldInvertAllowedItems, invertAllowedItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.ADD_ON__ALLOWED_ON_ITEMS:
				return getAllowedOnItems();
			case ArchitecturePackage.ADD_ON__INVERT_ALLOWED_ITEMS:
				return isInvertAllowedItems();
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
			case ArchitecturePackage.ADD_ON__ALLOWED_ON_ITEMS:
				getAllowedOnItems().clear();
				getAllowedOnItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ArchitecturePackage.ADD_ON__INVERT_ALLOWED_ITEMS:
				setInvertAllowedItems((Boolean)newValue);
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
			case ArchitecturePackage.ADD_ON__ALLOWED_ON_ITEMS:
				getAllowedOnItems().clear();
				return;
			case ArchitecturePackage.ADD_ON__INVERT_ALLOWED_ITEMS:
				setInvertAllowedItems(INVERT_ALLOWED_ITEMS_EDEFAULT);
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
			case ArchitecturePackage.ADD_ON__ALLOWED_ON_ITEMS:
				return allowedOnItems != null && !allowedOnItems.isEmpty();
			case ArchitecturePackage.ADD_ON__INVERT_ALLOWED_ITEMS:
				return invertAllowedItems != INVERT_ALLOWED_ITEMS_EDEFAULT;
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
		result.append(" (invertAllowedItems: ");
		result.append(invertAllowedItems);
		result.append(')');
		return result.toString();
	}

} //AddOnImpl
