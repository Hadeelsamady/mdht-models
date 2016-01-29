/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;

import org.openhealthtools.mdht.uml.cda.consol.operations.SensoryStatusOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensory Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SensoryStatusImpl extends ObservationImpl implements SensoryStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensoryStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SENSORY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusEntryRelationship736(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusEntryRelationship736(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensoryStatusAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation737(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryStatusOperations.validateSensoryStatusAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation737(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensoryStatus init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SensoryStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SensoryStatusImpl
