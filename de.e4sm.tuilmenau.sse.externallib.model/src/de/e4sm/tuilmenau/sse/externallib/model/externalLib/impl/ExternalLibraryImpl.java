/**
 */
package de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl;

import de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibPackage;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.ExternalLibrary;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.Function;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.FunctionCollection;
import de.e4sm.tuilmenau.sse.externallib.model.externalLib.Language;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.externallib.model.externalLib.impl.ExternalLibraryImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalLibraryImpl extends NamedElementImpl implements ExternalLibrary {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Language TYPE_EDEFAULT = Language.CPP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Language type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionCollection> collections;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected Function functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalLibPackage.Literals.EXTERNAL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Language newType) {
		Language oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.EXTERNAL_LIBRARY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.EXTERNAL_LIBRARY__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.EXTERNAL_LIBRARY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionCollection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<FunctionCollection>(FunctionCollection.class, this, ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunctions() {
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctions(Function newFunctions, NotificationChain msgs) {
		Function oldFunctions = functions;
		functions = newFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS, oldFunctions, newFunctions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctions(Function newFunctions) {
		if (newFunctions != functions) {
			NotificationChain msgs = null;
			if (functions != null)
				msgs = ((InternalEObject)functions).eInverseRemove(this, ExternalLibPackage.FUNCTION__EXTERNALLIBRARY, Function.class, msgs);
			if (newFunctions != null)
				msgs = ((InternalEObject)newFunctions).eInverseAdd(this, ExternalLibPackage.FUNCTION__EXTERNALLIBRARY, Function.class, msgs);
			msgs = basicSetFunctions(newFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS, newFunctions, newFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				if (functions != null)
					msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS, null, msgs);
				return basicSetFunctions((Function)otherEnd, msgs);
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
			case ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				return basicSetFunctions(null, msgs);
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
			case ExternalLibPackage.EXTERNAL_LIBRARY__TYPE:
				return getType();
			case ExternalLibPackage.EXTERNAL_LIBRARY__PATH:
				return getPath();
			case ExternalLibPackage.EXTERNAL_LIBRARY__VERSION:
				return getVersion();
			case ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS:
				return getCollections();
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				return getFunctions();
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
			case ExternalLibPackage.EXTERNAL_LIBRARY__TYPE:
				setType((Language)newValue);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__PATH:
				setPath((String)newValue);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__VERSION:
				setVersion((String)newValue);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((Collection<? extends FunctionCollection>)newValue);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				setFunctions((Function)newValue);
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
			case ExternalLibPackage.EXTERNAL_LIBRARY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS:
				getCollections().clear();
				return;
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				setFunctions((Function)null);
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
			case ExternalLibPackage.EXTERNAL_LIBRARY__TYPE:
				return type != TYPE_EDEFAULT;
			case ExternalLibPackage.EXTERNAL_LIBRARY__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ExternalLibPackage.EXTERNAL_LIBRARY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ExternalLibPackage.EXTERNAL_LIBRARY__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case ExternalLibPackage.EXTERNAL_LIBRARY__FUNCTIONS:
				return functions != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", path: ");
		result.append(path);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExternalLibraryImpl
