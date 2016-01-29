/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS Low Xor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship936(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship936</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship938(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship938</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship940(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship940</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship942(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship942</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship944(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship944</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship946(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship946</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship948(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship948</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship950(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship950</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2Indication2EntryRelationshipIndication2937(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Indication2 Entry Relationship Indication2937</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Instruction2 Entry Relationship Instruction2939</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Supply Order2 Entry Relationship Medication Supply Order2941</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Dispense2 Entry Relationship Medication Dispense2943</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Reaction Observation2 Entry Relationship Reaction Observation2945</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act Entry Relationship Drug Monitoring Act947</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Entry Relationship Substance Administered Act949</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Free Text Sig Entry Relationship Medication Free Text Sig951</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSorTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumableMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivity2Operations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2SubstanceAdministeredActInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2SubstanceAdministeredActInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(
			MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2SubstanceAdministeredActInversionInd"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2SubstanceAdministeredActSequenceNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Sequence Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActSequenceNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | not ent.sequenceNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2SubstanceAdministeredActSequenceNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Sequence Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActSequenceNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivity2SubstanceAdministeredActSequenceNumber(
			MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2SubstanceAdministeredActSequenceNumber"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(
			MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EffectiveTimeIVLTSLowXorValue"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS Low Xor Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1) )  and  ( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->forAll( eff | eff.oclAsType(datatypes:: SXCM_TS).value->size() = 1 or eff.oclAsType(datatypes::SXCM_TS).isNullFlavorDefined()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS Low Xor Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityStatusCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityStatusCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityStatusCodeP(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityStatusCodeP"),
						 new Object [] { medicationActivity2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityStatusCodeP", passToken);
				}
				passToken.add(medicationActivity2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityAdministrationUnitCodeP(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityAdministrationUnitCodeP"),
						 new Object [] { medicationActivity2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP", passToken);
				}
				passToken.add(medicationActivity2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2AuthorParticipation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2AuthorParticipation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2AuthorParticipation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2AuthorParticipation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivity2AuthorParticipation(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2AuthorParticipation"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship936(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship936</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship936(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship936(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship936</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship936(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship936(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship936"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship938(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship938</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship938(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship938(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship938</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship938(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship938(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship938"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship940(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship940</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship940(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship940(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship940</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship940(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship940(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship940"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship942(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship942</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship942(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship942(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship942</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship942(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship942(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship942"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship944(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship944</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship944(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship944(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship944</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship944(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship944(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship944"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship946(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship946</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship946(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship946(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship946</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship946(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship946(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship946"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship948(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship948</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship948(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship948(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship948</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship948(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship948(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship948"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2EntryRelationship950(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship950</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship950(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2EntryRelationship950(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship950</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2EntryRelationship950(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationActivity2EntryRelationship950(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2EntryRelationship950"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2Indication2EntryRelationshipIndication2937(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Indication2 Entry Relationship Indication2937</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2Indication2EntryRelationshipIndication2937(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2Indication2EntryRelationshipIndication2937(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Indication2 Entry Relationship Indication2937</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2Indication2EntryRelationshipIndication2937(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2Indication2EntryRelationshipIndication2937(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2Indication2EntryRelationshipIndication2937"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Instruction2 Entry Relationship Instruction2939</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Instruction2 Entry Relationship Instruction2939</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2Instruction2EntryRelationshipInstruction2939"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Supply Order2 Entry Relationship Medication Supply Order2941</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->one(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Supply Order2 Entry Relationship Medication Supply Order2941</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Dispense2 Entry Relationship Medication Dispense2943</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Dispense2 Entry Relationship Medication Dispense2943</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Reaction Observation2 Entry Relationship Reaction Observation2945</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Reaction Observation2 Entry Relationship Reaction Observation2945</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act Entry Relationship Drug Monitoring Act947</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DrugMonitoringAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act Entry Relationship Drug Monitoring Act947</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Entry Relationship Substance Administered Act949</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Entry Relationship Substance Administered Act949</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Free Text Sig Entry Relationship Medication Free Text Sig951</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationFreeTextSig)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Free Text Sig Entry Relationship Medication Free Text Sig951</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReference(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReference(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReference(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_TEXT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityTextReference"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityReferenceValue(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityReferenceValue"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReferenceValue(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityTextReferenceValue"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityInstructionsInversionInd(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityInstructionsInversionInd"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.doseQuantity->size() = 1 or self.rateQuantity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityDoseQuantityorrateQuantity"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->size() = 1 xor self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityEffectiveTimeIVLTSorTS"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityEffectiveTimeIVLTSLow"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).high->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityEffectiveTimeIVLTSHigh"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityEffectiveTimePIVLTS"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.16' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTemplateId(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityTemplateId"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRepeatNumber(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_REPEAT_NUMBER,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityRepeatNumber"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCodeP(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_ROUTE_CODE_P,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityRouteCodeP"),
						 new Object [] { medicationActivity2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP", passToken);
				}
				passToken.add(medicationActivity2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCode(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_ROUTE_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityRouteCode"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityCode(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityCode"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityStatusCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'normal' or value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'new' or value.code = 'suspended' or value.code = 'nullified' or value.code = 'obsolete')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityStatusCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C38192' or value.code = 'C38193' or value.code = 'C38194' or value.code = 'C38675' or value.code = 'C38197' or value.code = 'C38633' or value.code = 'C38205' or value.code = 'C38206' or value.code = 'C38208' or value.code = 'C38209' or value.code = 'C38210' or value.code = 'C38211' or value.code = 'C38212' or value.code = 'C38200' or value.code = 'C38215' or value.code = 'C38219' or value.code = 'C38220' or value.code = 'C38221' or value.code = 'C38222' or value.code = 'C38223' or value.code = 'C38224' or value.code = 'C38225' or value.code = 'C38226' or value.code = 'C38227' or value.code = 'C38228' or value.code = 'C38229' or value.code = 'C38230' or value.code = 'C38231' or value.code = 'C38232' or value.code = 'C38233' or value.code = 'C38234' or value.code = 'C38217' or value.code = 'C38218' or value.code = 'C38235' or value.code = 'C38238' or value.code = 'C38239' or value.code = 'C38240' or value.code = 'C38241' or value.code = 'C38242' or value.code = 'C38243' or value.code = 'C38245' or value.code = 'C38246' or value.code = 'C38247' or value.code = 'C38249' or value.code = 'C38250' or value.code = 'C38251' or value.code = 'C38252' or value.code = 'C38253' or value.code = 'C38254' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38256' or value.code = 'C38257' or value.code = 'C38258' or value.code = 'C38259' or value.code = 'C38260' or value.code = 'C38261' or value.code = 'C38262' or value.code = 'C38263' or value.code = 'C38264' or value.code = 'C38265' or value.code = 'C38266' or value.code = 'C38267' or value.code = 'C38207' or value.code = 'C38268' or value.code = 'C38269' or value.code = 'C38270' or value.code = 'C38272' or value.code = 'C38273' or value.code = 'C38276' or value.code = 'C38277' or value.code = 'C38278' or value.code = 'C38280' or value.code = 'C38203' or value.code = 'C38281' or value.code = 'C38282' or value.code = 'C38284' or value.code = 'C38285' or value.code = 'C48623' or value.code = 'C38286' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38289' or value.code = 'C38291' or value.code = 'C38676' or value.code = 'C38292' or value.code = 'C38677' or value.code = 'C38293' or value.code = 'C38294' or value.code = 'C38295' or value.code = 'C38216' or value.code = 'C38296' or value.code = 'C38198' or value.code = 'C38297' or value.code = 'C38298' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38301' or value.code = 'C38304' or value.code = 'C38305' or value.code = 'C38283' or value.code = 'C38307' or value.code = 'C38308' or value.code = 'C38309' or value.code = 'C38312' or value.code = 'C38271'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityStatusCode(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityStatusCode"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityAdministrationUnitCode(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityAdministrationUnitCode"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityText(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_TEXT,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityText"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in "+
"value.code = 'APPFUL' or value.code = 'DROP' or value.code = 'NDROP' or value.code = 'OPDROP' or value.code = 'ORDROP' or value.code = 'OTDROP' or value.code = 'PUFF' or value.code = 'SCOOP' or value.code = 'SPRY')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityText(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityText(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantity(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_DOSE_QUANTITY,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityDoseQuantity"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumable(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumable(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityConsumable(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_CONSUMABLE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityConsumable"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPrecondition(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPrecondition(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPrecondition(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_PRECONDITION,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityPrecondition"),
						 new Object [] { medicationActivity2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPreconditionTypeCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionTypeCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPreconditionTypeCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionTypeCode(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityPreconditionTypeCode(MedicationActivity2 medicationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityPreconditionTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
			MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityPreconditionPreconditionForSubstanceAdministration"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity2 The receiving '<em><b>Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityConsumableMedicationInformation(
			MedicationActivity2 medicationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_ACTIVITY2__MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION,
						 ConsolPlugin.INSTANCE.getString("MedicationActivity2MedicationActivityConsumableMedicationInformation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // MedicationActivity2Operations
