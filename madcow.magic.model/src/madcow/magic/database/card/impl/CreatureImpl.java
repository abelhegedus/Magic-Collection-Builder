/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package madcow.magic.database.card.impl;

import java.util.StringTokenizer;
import java.util.logging.Logger;

import madcow.magic.database.card.CardPackage;
import madcow.magic.database.card.Creature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link madcow.magic.database.card.impl.CreatureImpl#getPower <em>Power</em>}</li>
 *   <li>{@link madcow.magic.database.card.impl.CreatureImpl#getToughness <em>Toughness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatureImpl extends CardImpl implements Creature {
	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected int power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getToughness() <em>Toughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToughness()
	 * @generated
	 * @ordered
	 */
	protected static final int TOUGHNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToughness() <em>Toughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToughness()
	 * @generated
	 * @ordered
	 */
	protected int toughness = TOUGHNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardPackage.Literals.CREATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(int newPower) {
		int oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CREATURE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToughness() {
		return toughness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToughness(int newToughness) {
		int oldToughness = toughness;
		toughness = newToughness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardPackage.CREATURE__TOUGHNESS, oldToughness, toughness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CardPackage.CREATURE__POWER:
				return getPower();
			case CardPackage.CREATURE__TOUGHNESS:
				return getToughness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CardPackage.CREATURE__POWER:
				setPower((Integer)newValue);
				return;
			case CardPackage.CREATURE__TOUGHNESS:
				setToughness((Integer)newValue);
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
			case CardPackage.CREATURE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case CardPackage.CREATURE__TOUGHNESS:
				setToughness(TOUGHNESS_EDEFAULT);
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
			case CardPackage.CREATURE__POWER:
				return power != POWER_EDEFAULT;
			case CardPackage.CREATURE__TOUGHNESS:
				return toughness != TOUGHNESS_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (power: ");
		result.append(power);
		result.append(", toughness: ");
		result.append(toughness);
		result.append(')');
		return result.toString();
	}

	@Override
	public int initializeFromCSV(EList<EList<String>> values, int index) {
		int result = super.initializeFromCSV(values, index);
		
		// super.init successful
		if(result > index){
			String typeStringToProcess = null;
			// subtype contains power and toughness
			if(null != getSubtype() && !"".equals(getSubtype())){
				typeStringToProcess = getSubtype();
			} // type contains power and toughness
			else if(null != getTypeString() && !"".equals(getTypeString())){
				typeStringToProcess = getTypeString();
			}
			StringTokenizer st = new StringTokenizer(typeStringToProcess, " ");
			if(0 < st.countTokens())
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				int tIndex = 0;
				if(0 < (tIndex = token.indexOf('/'))){
					String powerS = token.substring(0, tIndex).trim();
					String toughS = token.substring(tIndex+1, token.length());
					try{
						if(!powerS.contains("*")){
							setPower(Integer.parseInt(powerS));
						} else {
							setPower(-1);
						}
						if(!toughS.contains("*")){
							setToughness(Integer.parseInt(toughS));
						} else {
							setToughness(-1);
						}
					} catch (NumberFormatException e) {
						// TODO alter logging to internal logger
						Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Creature P/S not formatted correctly " + e.getMessage());
					}
				}
			}
		}
		
		return result;
	}
	
} //CreatureImpl
