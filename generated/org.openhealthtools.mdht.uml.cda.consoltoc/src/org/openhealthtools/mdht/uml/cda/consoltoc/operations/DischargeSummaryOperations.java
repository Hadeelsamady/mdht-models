/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeDiagnosisSection() <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getDischargeDietSection() <em>Get Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargePhysicalSection() <em>Get Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryOperations extends GeneralHeaderConstraintsOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DischargeSummaryOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(136));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_COURSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalCourseSection))->asSequence()->first().oclAsType(HospitalCourseSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalCourseSection))->asSequence()->first().oclAsType(HospitalCourseSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalCourseSection getHospitalCourseSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_COURSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(137));
			try {
				GET_HOSPITAL_COURSE_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_QRY);
		return (HospitalCourseSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeDiagnosisSection))->asSequence()->first().oclAsType(HospitalDischargeDiagnosisSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeDiagnosisSection))->asSequence()->first().oclAsType(HospitalDischargeDiagnosisSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(138));
			try {
				GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalDischargeDiagnosisSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(139));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalDischargeMedicationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)";

  /**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(DischargeSummary dischargeSummary)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(140));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(141));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintSection))->asSequence()->first().oclAsType(ChiefComplaintSection)";

  /**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintSection))->asSequence()->first().oclAsType(ChiefComplaintSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ChiefComplaintSection getChiefComplaintSection(DischargeSummary dischargeSummary)
  {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(142));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(ChiefComplaintAndReasonForVisitSection)";

  /**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(ChiefComplaintAndReasonForVisitSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(DischargeSummary dischargeSummary)
  {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(143));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_DISCHARGE_DIET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(DischargeDietSection))->asSequence()->first().oclAsType(DischargeDietSection)";

  /**
	 * The cached OCL query for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(DischargeDietSection))->asSequence()->first().oclAsType(DischargeDietSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  DischargeDietSection getDischargeDietSection(DischargeSummary dischargeSummary)
  {
		if (GET_DISCHARGE_DIET_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(144));
			try {
				GET_DISCHARGE_DIET_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_QRY);
		return (DischargeDietSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FamilyHistorySection getFamilyHistorySection(DischargeSummary dischargeSummary)
  {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(145));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)";

  /**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FunctionalStatusSection getFunctionalStatusSection(DischargeSummary dischargeSummary)
  {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(146));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(HistoryOfPresentIllnessSection)";

  /**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(HistoryOfPresentIllnessSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary)
  {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(147));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargePhysicalSection))->asSequence()->first().oclAsType(HospitalDischargePhysicalSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargePhysicalSection))->asSequence()->first().oclAsType(HospitalDischargePhysicalSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargePhysicalSection getHospitalDischargePhysicalSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(148));
			try {
				GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY);
		return (HospitalDischargePhysicalSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(HospitalDischargeStudiesSummarySection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(HospitalDischargeStudiesSummarySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(149));
			try {
				GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY);
		return (HospitalDischargeStudiesSummarySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(150));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReasonForVisitSection))->asSequence()->first().oclAsType(ReasonForVisitSection)";

  /**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReasonForVisitSection))->asSequence()->first().oclAsType(ReasonForVisitSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ReasonForVisitSection getReasonForVisitSection(DischargeSummary dischargeSummary)
  {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(151));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReviewOfSystemsSection))->asSequence()->first().oclAsType(ReviewOfSystemsSection)";

  /**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReviewOfSystemsSection))->asSequence()->first().oclAsType(ReviewOfSystemsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ReviewOfSystemsSection getReviewOfSystemsSection(DischargeSummary dischargeSummary)
  {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(152));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  SocialHistorySection getSocialHistorySection(DischargeSummary dischargeSummary)
  {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(153));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(154));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(155));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.1.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.1.1')
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dischargeSummary, context) }),
						 new Object [] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

} // DischargeSummaryOperations