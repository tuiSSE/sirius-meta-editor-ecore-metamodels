/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl;

import de.e4sm.tuilmenau.sse.commons.model.commons.Type;

import de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.FunctionImpl#getExternallibrary <em>Externallibrary</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionImpl extends NamedElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final Type RETURN_TYPE_EDEFAULT = Type.VOID;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalLibPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ExternalLibPackage.FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.FUNCTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalLibrary getExternallibrary() {
		if (eContainerFeatureID() != ExternalLibPackage.FUNCTION__EXTERNALLIBRARY) return null;
		return (ExternalLibrary)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternallibrary(ExternalLibrary newExternallibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExternallibrary, ExternalLibPackage.FUNCTION__EXTERNALLIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternallibrary(ExternalLibrary newExternallibrary) {
		if (newExternallibrary != eInternalContainer() || (eContainerFeatureID() != ExternalLibPackage.FUNCTION__EXTERNALLIBRARY && newExternallibrary != null)) {
			if (EcoreUtil.isAncestor(this, newExternallibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExternallibrary != null)
				msgs = ((InternalEObject)newExternallibrary).eInverseAdd(this, ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS, ExternalLibrary.class, msgs);
			msgs = basicSetExternallibrary(newExternallibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.FUNCTION__EXTERNALLIBRARY, newExternallibrary, newExternallibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExternallibrary((ExternalLibrary)otherEnd, msgs);
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
			case ExternalLibPackage.FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				return basicSetExternallibrary(null, msgs);
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
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				return eInternalContainer().eInverseRemove(this, ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS, ExternalLibrary.class, msgs);
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
			case ExternalLibPackage.FUNCTION__PARAMETERS:
				return getParameters();
			case ExternalLibPackage.FUNCTION__RETURN_TYPE:
				return getReturnType();
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				return getExternallibrary();
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
			case ExternalLibPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ExternalLibPackage.FUNCTION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				setExternallibrary((ExternalLibrary)newValue);
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
			case ExternalLibPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case ExternalLibPackage.FUNCTION__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				setExternallibrary((ExternalLibrary)null);
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
			case ExternalLibPackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ExternalLibPackage.FUNCTION__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case ExternalLibPackage.FUNCTION__EXTERNALLIBRARY:
				return getExternallibrary() != null;
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
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
