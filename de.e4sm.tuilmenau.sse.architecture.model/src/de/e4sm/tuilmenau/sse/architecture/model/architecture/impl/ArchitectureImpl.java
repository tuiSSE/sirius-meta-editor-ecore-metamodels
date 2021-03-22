/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.impl;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.Architecture;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Behavior;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Diagram;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Metamodel;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getModelelements <em>Modelelements</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ArchitectureImpl#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends MinimalEObjectImpl.Container implements Architecture {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

	/**
	 * The cached value of the '{@link #getModelelements() <em>Modelelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelelements;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> imports;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectContainmentEList<Diagram>(Diagram.class, this, ArchitecturePackage.ARCHITECTURE__DIAGRAMS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getModelelements() {
		if (modelelements == null) {
			modelelements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, ArchitecturePackage.ARCHITECTURE__MODELELEMENTS);
		}
		return modelelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metamodel> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, ArchitecturePackage.ARCHITECTURE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, ArchitecturePackage.ARCHITECTURE__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ARCHITECTURE__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ARCHITECTURE__MODELELEMENTS:
				return ((InternalEList<?>)getModelelements()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ARCHITECTURE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ARCHITECTURE__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.ARCHITECTURE__NAME:
				return getName();
			case ArchitecturePackage.ARCHITECTURE__DESCRIPTION:
				return getDescription();
			case ArchitecturePackage.ARCHITECTURE__VERSION:
				return getVersion();
			case ArchitecturePackage.ARCHITECTURE__DIAGRAMS:
				return getDiagrams();
			case ArchitecturePackage.ARCHITECTURE__MODELELEMENTS:
				return getModelelements();
			case ArchitecturePackage.ARCHITECTURE__IMPORTS:
				return getImports();
			case ArchitecturePackage.ARCHITECTURE__BEHAVIORS:
				return getBehaviors();
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
			case ArchitecturePackage.ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__VERSION:
				setVersion((Integer)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__MODELELEMENTS:
				getModelelements().clear();
				getModelelements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
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
			case ArchitecturePackage.ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.ARCHITECTURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArchitecturePackage.ARCHITECTURE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ArchitecturePackage.ARCHITECTURE__DIAGRAMS:
				getDiagrams().clear();
				return;
			case ArchitecturePackage.ARCHITECTURE__MODELELEMENTS:
				getModelelements().clear();
				return;
			case ArchitecturePackage.ARCHITECTURE__IMPORTS:
				getImports().clear();
				return;
			case ArchitecturePackage.ARCHITECTURE__BEHAVIORS:
				getBehaviors().clear();
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
			case ArchitecturePackage.ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.ARCHITECTURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArchitecturePackage.ARCHITECTURE__VERSION:
				return version != VERSION_EDEFAULT;
			case ArchitecturePackage.ARCHITECTURE__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case ArchitecturePackage.ARCHITECTURE__MODELELEMENTS:
				return modelelements != null && !modelelements.isEmpty();
			case ArchitecturePackage.ARCHITECTURE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ArchitecturePackage.ARCHITECTURE__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ArchitectureImpl
