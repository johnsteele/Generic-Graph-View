/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.AbstractJvmModelRenameStrategy;

import com.google.inject.Inject;

/**
 * Encapsulates the model changes of a rename refactoring.  
 */
public class GraphViewMappingRenameStrategy extends AbstractJvmModelRenameStrategy {

	public static class Provider extends DefaultRenameStrategy.Provider {

		@Inject
		private IJvmModelAssociations jvmModelAssociations;

		@Override
		public IRenameStrategy get(EObject targetElement, IRenameElementContext renameElementContext) {
			return new GraphViewMappingRenameStrategy(targetElement, getLocationInFileProvider(), jvmModelAssociations);
		}
	}
	
	protected GraphViewMappingRenameStrategy(EObject targetElement, ILocationInFileProvider locationInFileProvider,
			IJvmModelAssociations jvmModelAssociations) {
		super(targetElement, locationInFileProvider, jvmModelAssociations);
	}

	@Override
	protected void setInferredJvmElementName(String name, EObject renamedSourceElement) {
		/*
		 * TODO: rename inferred elements as you would in IJvmModelInferrer 
		 */
	}
}
