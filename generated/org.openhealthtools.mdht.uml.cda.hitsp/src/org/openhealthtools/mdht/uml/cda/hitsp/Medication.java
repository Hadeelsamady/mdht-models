/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getMedication()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation contextDependent='true' templateId.root='2.16.840.1.113883.3.88.11.83.8' constraints.validation.error='HITSPMedicationTemplateId HITSPMedicationMedicationStopped HITSPMedicationFirstEffectiveTimeDatatype HITSPMedicationHasMedicationInformation HITSPMedicationHasIndication HITSPMedicationHasIndicationNarrativeText HITSPMedicationHasIndicationVocab HITSPMedicationHasPatientInstructions HITSPMedicationMedicationVehicleType HITSPMedicationMedicationVehicleClass HITSPMedicationMedicationVehicleCode HITSPMedicationMedicationVehicleName HITSPMedicationMedicationVehicleCodedNameVocab' constraints.validation.info='HITSPMedicationDoseUnits HITSPMedicationDeliveryMethodDescription HITSPMedicationHasStatusOfMedication HITSPMedicationHasMedicationVehicle HITSPMedicationMedicationVehicleCodedName HITSPMedicationEffectiveTime HITSPMedicationRouteCode HITSPMedicationDoseQuantity HITSPMedicationAdministrationUnitCode HITSPMedicationMaxDoseQuantity HITSPMedicationApproachSiteCode HITSPMedicationCode'"
 * @generated
 */
public interface Medication extends org.openhealthtools.mdht.uml.cda.ihe.Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.high->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime.high->size() = 1'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationStopped(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime->exists (ef : datatypes::SXCM_TS | not ef.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->exists (ef : datatypes::SXCM_TS | not ef.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationFirstEffectiveTimeDatatype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.doseQuantity->exists(dq : datatypes::IVL_PQ | dq.unit='2.16.840.1.113883.3.88.12.80.29')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.doseQuantity->exists(dq : datatypes::IVL_PQ | dq.unit=\'2.16.840.1.113883.3.88.12.80.29\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationDoseUnits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.originalText.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateHITSPMedicationDeliveryMethodDescription(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct->exists(mp : cda::ManufacturedProduct | mp.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.2'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable.manufacturedProduct->exists(mp : cda::ManufacturedProduct | mp.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.8.2\'))'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasMedicationInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasObservationTemplate('2.16.840.1.113883.10.20.1.47')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasObservationTemplate(\'2.16.840.1.113883.10.20.1.47\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasStatusOfMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasObservationTemplate('2.16.840.1.113883.10.20.1.28')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasObservationTemplate(\'2.16.840.1.113883.10.20.1.28\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(po : cda::Observation | po.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.28') and not po.text.reference.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation | po.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.28\') and not po.text.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndicationNarrativeText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(po : cda::Observation | po.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.28') and po.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.4')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation | po.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.28\') and po.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.7.4\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndicationVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasActTemplate('1.3.6.1.4.1.19376.1.5.3.1.4.3')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasActTemplate(\'1.3.6.1.4.1.19376.1.5.3.1.4.3\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasPatientInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0)'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasMedicationVehicle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\'))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = 'MANU')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = \'MANU\')))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleClass(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = 'MANU' and pr.code.code = '412307009' and pr.code.codeSystem = '2.16.840.1.113883.6.96')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = \'MANU\' and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\')))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = 'MANU' and pr.code.code = '412307009' and pr.code.codeSystem = '2.16.840.1.113883.6.96' and pr.playingEntity.name->size() > 0)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = \'MANU\' and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.name->size() > 0)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = 'MANU' and pr.code.code = '412307009' and pr.code.codeSystem = '2.16.840.1.113883.6.96' and pr.playingEntity.code->size() > 0)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = \'MANU\' and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.code->size() > 0)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCodedName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = 'CSM' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = 'MANU' and pr.code.code = '412307009' and pr.code.codeSystem = '2.16.840.1.113883.6.96' and pr.playingEntity.code->size() > 0 and pr.playingEntity.code.codeSystem = '2.16.840.1.113883.3.88.12.80.21')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = \'CSM\' and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = \'MANU\' and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.code->size() > 0 and pr.playingEntity.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.21\')))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCodedNameVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.8\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty() and self.effectiveTime->forAll(element | element.oclIsTypeOf(datatypes::IVL_TS)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty() and self.effectiveTime->forAll(element | element.oclIsTypeOf(datatypes::IVL_TS)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (\r\nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateHITSPMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in (\r\nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateHITSPMedicationAdministrationUnitCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateHITSPMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::MedicationType))->asSequence()->first().oclAsType(hitsp::MedicationType)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::MedicationType))->asSequence()->first().oclAsType(hitsp::MedicationType)'"
	 * @generated
	 */
	MedicationType getMedicationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(hitsp::MedicationOrderInformation)).oclAsType(hitsp::MedicationOrderInformation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(hitsp::MedicationOrderInformation)).oclAsType(hitsp::MedicationOrderInformation)'"
	 * @generated
	 */
	EList<MedicationOrderInformation> getMedicationOrderInformations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)'"
	 * @generated
	 */
	ReactionObservation getHITSPReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init();
} // Medication
