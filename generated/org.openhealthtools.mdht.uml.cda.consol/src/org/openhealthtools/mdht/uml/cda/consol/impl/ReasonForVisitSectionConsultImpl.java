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
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForVisitSectionConsultOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Visit Section Consult</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitSectionConsultImpl extends SectionImpl implements ReasonForVisitSectionConsult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForVisitSectionConsultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REASON_FOR_VISIT_SECTION_CONSULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSectionConsultTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonForVisitSectionConsultOperations.validateReasonForVisitSectionConsultTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSectionConsultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForVisitSectionConsultOperations.validateReasonForVisitSectionConsultCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSectionConsult init() {
		CDAUtil.init(this);
		return this;
	}
} // ReasonForVisitSectionConsultImpl
