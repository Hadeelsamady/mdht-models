/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationStatusObservationImpl extends ObservationImpl implements MedicationStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationTargetOfEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationTargetOfEntryRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationNoAdditionalParticipants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationNoAdditionalParticipants(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationNoAdditionalRelationships(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationNoAdditionalRelationships(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationStatusObservationOperations.validateMedicationStatusObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationStatusObservationImpl
