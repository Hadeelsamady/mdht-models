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
import org.openhealthtools.mdht.uml.cda.consol.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.consol.operations.SupportGuardianOperations;
import org.openhealthtools.mdht.uml.cda.impl.GuardianImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Support Guardian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SupportGuardianImpl extends GuardianImpl implements SupportGuardian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportGuardianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SUPPORT_GUARDIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardianTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupportGuardianOperations.validateSupportGuardianTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupportGuardianOperations.validateSupportGuardianClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardianCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupportGuardianOperations.validateSupportGuardianCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardianAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupportGuardianOperations.validateSupportGuardianAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardianTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupportGuardianOperations.validateSupportGuardianTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportGuardian init() {
		CDAUtil.init(this);
		return this;
	}
} // SupportGuardianImpl
