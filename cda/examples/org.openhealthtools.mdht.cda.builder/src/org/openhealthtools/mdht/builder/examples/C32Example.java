/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.examples;

import java.io.FileOutputStream;
import java.util.List;

import org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.MedicationsSectionDirector;
import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * C32Example is an example implementation of the MDHT DocumentBuilder based on
 * the GOF BuilderPattern. see http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example uses C32DocumentBuilder which creates the minimum structures to
 * create valid (no errors) C32 V2.5
 * 
 */

public class C32Example {

	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		PatientSummaryBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public MedicationsSectionDirector getMedicationsSectionDirector() {
				return new MedicationsSectionDirector()
				{
		
					@Override
					public ST buildSectionTitle() {
						// TODO Auto-generated method stub
						return super.buildSectionTitle();
					}

					@Override
					public List<Act> buildActs() {
						// TODO Auto-generated method stub
						return super.buildActs();
					}
					
				};
			}

			@Override
			public Component2 buildComponentBuider() {
				
						Component2 c = CDAFactory.eINSTANCE.createComponent2();

						NonXMLBody nonXMLBody = CDAFactory.eINSTANCE.createNonXMLBody();

						nonXMLBody.setText(DatatypesFactory.eINSTANCE.createED());

						c.setNonXMLBody(nonXMLBody);

						return c;

				
			}

		};

		try {

			System.out.println("Start C32 Document Build Example");

			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();

			CDAUtil.save(clinicalDocument, new FileOutputStream("ExampleC32.xml"));

			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}