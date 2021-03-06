/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.LymphaticSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lymphatic Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection#validateLymphaticSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymphatic Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection#validateLymphaticSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymphatic Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection#validateLymphaticSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymphatic Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LymphaticSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLymphaticSectionTemplateId() {
		OperationsTestCase<LymphaticSection> validateLymphaticSectionTemplateIdTestCase = new OperationsTestCase<LymphaticSection>(
			"validateLymphaticSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LYMPHATIC_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LymphaticSection target) {

			}

			@Override
			protected void updateToPass(LymphaticSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LymphaticSectionOperations.validateLymphaticSectionTemplateId(
					(LymphaticSection) objectToTest, diagnostician, map);
			}

		};

		validateLymphaticSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLymphaticSectionCode() {
		OperationsTestCase<LymphaticSection> validateLymphaticSectionCodeTestCase = new OperationsTestCase<LymphaticSection>(
			"validateLymphaticSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_LYMPHATIC_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LymphaticSection target) {

			}

			@Override
			protected void updateToPass(LymphaticSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LymphaticSectionOperations.validateLymphaticSectionCode(
					(LymphaticSection) objectToTest, diagnostician, map);
			}

		};

		validateLymphaticSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateLymphaticSectionProblemEntry() {
		OperationsTestCase<LymphaticSection> validateLymphaticSectionProblemEntryTestCase = new OperationsTestCase<LymphaticSection>(
			"validateLymphaticSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_LYMPHATIC_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LymphaticSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(LymphaticSection target) {

				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LymphaticSectionOperations.validateLymphaticSectionProblemEntry(
					(LymphaticSection) objectToTest, diagnostician, map);
			}

		};

		validateLymphaticSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		LymphaticSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LymphaticSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<LymphaticSection> {
		public LymphaticSection create() {
			return IHEFactory.eINSTANCE.createLymphaticSection();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends LymphaticSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // LymphaticSectionOperations
