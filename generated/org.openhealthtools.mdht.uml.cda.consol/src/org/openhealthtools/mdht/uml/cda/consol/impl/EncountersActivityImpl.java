/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.EncounterImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncountersActivityImpl extends EncounterImpl implements EncountersActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTERS_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityHasIndications(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityHasIndications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityHasPractitioners(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityHasPractitioners(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityPractitionerRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityPractitionerRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityPatientInstruction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityPatientInstruction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getPatientInstructions() {
		return EncountersActivityOperations.getPatientInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return EncountersActivityOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersActivity init() {
		CDAUtil.init(this);
		return this;
	}
} // EncountersActivityImpl
