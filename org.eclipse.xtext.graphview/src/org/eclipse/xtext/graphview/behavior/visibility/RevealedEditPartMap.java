/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class RevealedEditPartMap {
	private Map<IInstanceModelEditPart, List<IInstanceModelEditPart>> map = Maps.newLinkedHashMap();

	protected List<IInstanceModelEditPart> addLayoutable(IInstanceModelEditPart layoutable) {
		List<IInstanceModelEditPart> connections = map.get(layoutable);
		if (connections == null) {
			connections = Lists.newArrayList();
			map.put(layoutable, connections);
		}
		return connections;
	}

	protected void addSecondary(IInstanceModelEditPart layoutable, IInstanceModelEditPart secondary) {
		addLayoutable(layoutable).add(secondary);
	}

	public Iterable<IInstanceModelEditPart> getLayoutables() {
		return map.keySet();
	}

	public List<IInstanceModelEditPart> getSecondaries(IInstanceModelEditPart primary) {
		return map.get(primary);
	}

}