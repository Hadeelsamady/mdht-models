/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Supply</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivitySupplyOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivitySupplyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyMoodCodeValue(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCodeValue(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::INT or self.moodCode = vocab::x_DocumentSubstanceMood::RQO"
			+ "  or self.moodCode = vocab::x_DocumentSubstanceMood::PRMS or self.moodCode = vocab::x_DocumentSubstanceMood::PRP";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyMoodCodeValue(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCodeValue(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::INT or self.moodCode = vocab::x_DocumentSubstanceMood::RQO
	 *   or self.moodCode = vocab::x_DocumentSubstanceMood::PRMS or self.moodCode = vocab::x_DocumentSubstanceMood::PRP
	 * @param planOfCareActivitySupply The receiving '<em><b>Plan Of Care Activity Supply</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivitySupplyMoodCodeValue(
			PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivitySupply)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivitySupplyMoodCodeValue"),
					new Object[] { planOfCareActivitySupply }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')
	 * @param planOfCareActivitySupply The receiving '<em><b>Plan Of Care Activity Supply</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply planOfCareActivitySupply,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivitySupply)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivitySupplyTemplateId"),
					new Object[] { planOfCareActivitySupply }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param planOfCareActivitySupply The receiving '<em><b>Plan Of Care Activity Supply</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply planOfCareActivitySupply,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivitySupply)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivitySupplyMoodCode"),
					new Object[] { planOfCareActivitySupply }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param planOfCareActivitySupply The receiving '<em><b>Plan Of Care Activity Supply</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply planOfCareActivitySupply,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivitySupply)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivitySupplyId"),
					new Object[] { planOfCareActivitySupply }));
			}
			return false;
		}
		return true;
	}

} // PlanOfCareActivitySupplyOperations
