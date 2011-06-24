/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.interpreter;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

@SuppressWarnings("restriction")
public class GraphViewStyleInterpreter extends XbaseInterpreter {
	
	protected Object _evaluateColorLiteral(XColorLiteral literal,
			IEvaluationContext context, CancelIndicator indicator) {
		return new ColorLiteral(literal.getColor());
	}
	
	protected Object _featureCallJvmIdentifyableElement(JvmIdentifiableElement identifiable, XFeatureCall featureCall, Object receiver,
			IEvaluationContext context, CancelIndicator indicator) {
		Object value = context.getValue(QualifiedName.create(featureCall.getConcreteSyntaxFeatureName()));
		if(value == null) { 
			super._featureCallJvmIdentifyableElement(identifiable, featureCall, receiver, context, indicator);
		}
		return value;
	}
}
