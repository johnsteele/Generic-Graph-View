/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map;

import org.eclipse.xtext.graphview.map.imports.GVMImportsConfiguration;
import org.eclipse.xtext.graphview.map.names.GVMIdentifiableSimpleNameProvider;
import org.eclipse.xtext.graphview.map.names.GVMQualifiedNameProvider;
import org.eclipse.xtext.graphview.map.types.GVMImplicitlyImportedTypes;
import org.eclipse.xtext.graphview.map.types.GVMTypeResolver;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.imports.IImportsConfiguration;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class GraphViewMappingRuntimeModule extends org.eclipse.xtext.graphview.map.AbstractGraphViewMappingRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return GVMQualifiedNameProvider.class;
	}
	
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return GVMIdentifiableSimpleNameProvider.class;
	}
	
	public Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
		return GVMTypeResolver.class;
	}
	
	public Class<? extends ImplicitlyImportedTypes> bindImplicitlyImportedTypes() {
		return GVMImplicitlyImportedTypes.class;
	}
	
	public Class<? extends IImportsConfiguration> bindIImportsConfiguration() {
		return GVMImportsConfiguration.class;
	}

}
