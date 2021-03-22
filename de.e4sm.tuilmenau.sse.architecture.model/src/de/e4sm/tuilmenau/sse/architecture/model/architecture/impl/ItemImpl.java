/**
 */
package de.e4sm.tuilmenau.sse.architecture.model.architecture.impl;

import de.e4sm.tuilmenau.sse.architecture.model.architecture.ArchitecturePackage;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.BlockStyle;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Connection;
import de.e4sm.tuilmenau.sse.architecture.model.architecture.Item;

import de.e4sm.tuilmenau.sse.commons.model.commons.Color;

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
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl#getLabelColor <em>Label Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.e4sm.tuilmenau.sse.architecture.model.architecture.impl.ItemImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ItemImpl extends ModelElementImpl implements Item {
	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelColor() <em>Label Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color LABEL_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getLabelColor() <em>Label Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelColor()
	 * @generated
	 * @ordered
	 */
	protected Color labelColor = LABEL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BORDER_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected Color borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ITEM__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getLabelColor() {
		return labelColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelColor(Color newLabelColor) {
		Color oldLabelColor = labelColor;
		labelColor = newLabelColor == null ? LABEL_COLOR_EDEFAULT : newLabelColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ITEM__LABEL_COLOR, oldLabelColor, labelColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(Color newBorderColor) {
		Color oldBorderColor = borderColor;
		borderColor = newBorderColor == null ? BORDER_COLOR_EDEFAULT : newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ITEM__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectContainmentEList<Connection>(Connection.class, this, ArchitecturePackage.ITEM__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectContainmentEList<Connection>(Connection.class, this, ArchitecturePackage.ITEM__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ITEM__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ITEM__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.ITEM__BACKGROUND_COLOR:
				return getBackgroundColor();
			case ArchitecturePackage.ITEM__LABEL_COLOR:
				return getLabelColor();
			case ArchitecturePackage.ITEM__BORDER_COLOR:
				return getBorderColor();
			case ArchitecturePackage.ITEM__OUTGOING:
				return getOutgoing();
			case ArchitecturePackage.ITEM__INCOMING:
				return getIncoming();
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
			case ArchitecturePackage.ITEM__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case ArchitecturePackage.ITEM__LABEL_COLOR:
				setLabelColor((Color)newValue);
				return;
			case ArchitecturePackage.ITEM__BORDER_COLOR:
				setBorderColor((Color)newValue);
				return;
			case ArchitecturePackage.ITEM__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Connection>)newValue);
				return;
			case ArchitecturePackage.ITEM__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Connection>)newValue);
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
			case ArchitecturePackage.ITEM__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case ArchitecturePackage.ITEM__LABEL_COLOR:
				setLabelColor(LABEL_COLOR_EDEFAULT);
				return;
			case ArchitecturePackage.ITEM__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case ArchitecturePackage.ITEM__OUTGOING:
				getOutgoing().clear();
				return;
			case ArchitecturePackage.ITEM__INCOMING:
				getIncoming().clear();
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
			case ArchitecturePackage.ITEM__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case ArchitecturePackage.ITEM__LABEL_COLOR:
				return labelColor != LABEL_COLOR_EDEFAULT;
			case ArchitecturePackage.ITEM__BORDER_COLOR:
				return borderColor != BORDER_COLOR_EDEFAULT;
			case ArchitecturePackage.ITEM__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ArchitecturePackage.ITEM__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BlockStyle.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.ITEM__BACKGROUND_COLOR: return ArchitecturePackage.BLOCK_STYLE__BACKGROUND_COLOR;
				case ArchitecturePackage.ITEM__LABEL_COLOR: return ArchitecturePackage.BLOCK_STYLE__LABEL_COLOR;
				case ArchitecturePackage.ITEM__BORDER_COLOR: return ArchitecturePackage.BLOCK_STYLE__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BlockStyle.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.BLOCK_STYLE__BACKGROUND_COLOR: return ArchitecturePackage.ITEM__BACKGROUND_COLOR;
				case ArchitecturePackage.BLOCK_STYLE__LABEL_COLOR: return ArchitecturePackage.ITEM__LABEL_COLOR;
				case ArchitecturePackage.BLOCK_STYLE__BORDER_COLOR: return ArchitecturePackage.ITEM__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", labelColor: ");
		result.append(labelColor);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
