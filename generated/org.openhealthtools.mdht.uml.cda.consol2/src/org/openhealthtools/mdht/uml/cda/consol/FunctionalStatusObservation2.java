/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservationTemplateId ResultObservationCode ResultObservationCodeP ResultObservationText ResultObservationInterpretationCode ResultObservationMethodCode ResultObservationTargetSiteCode FunctionalStatusResultObservationAuthor FunctionalStatusObservation2EntryRelationship910 FunctionalStatusResultObservationReferenceRangeObservationRange' templateId.root='2.16.840.1.113883.10.20.22.4.67' templateId.extension='2014-06-09' constraints.validation.info='ResultObservationTextReference ResultObservationTextReferenceValue FunctionalStatusResultObservationReferenceRange FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode FunctionalStatusObservation2NonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2911' code.code='54522-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Functional status' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' constraints.validation.warning='FunctionalStatusObservation2AuthorParticipation' constraints.validation.query='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode FunctionalStatusResultObservationReferenceRangeObservationRange FunctionalStatusObservation2NonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2911'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusObservation2ReferenceRange constraints.validation.error='FunctionalStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusObservation2ReferenceRangeObservationRange constraints.validation.info='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusObservation2NonMedicinalSupplyActivity2EntryRelationship constraints.validation.info='FunctionalStatusObservation2NonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2911'"
 * @generated
 */
public interface FunctionalStatusObservation2 extends FunctionalStatusResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateFunctionalStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateFunctionalStatusObservation2EntryRelationship910(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->one(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusObservation2NonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2911(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusObservation2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public FunctionalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusObservation2
