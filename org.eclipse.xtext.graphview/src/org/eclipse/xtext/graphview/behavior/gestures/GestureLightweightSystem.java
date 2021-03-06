/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.gestures;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.swt.events.GestureListener;
import org.eclipse.swt.widgets.Canvas;

public class GestureLightweightSystem extends LightweightSystem {

	// super.canvas is private
	private Canvas canvas;

	@Override
	protected void addListeners() {
		super.addListeners();
		canvas.addGestureListener(new GestureHandler());
	}

	// super.canvas is private
	@Override
	public void setControl(Canvas c) {
		this.canvas = c;
		super.setControl(c);
	}

	public class GestureHandler implements GestureListener {
		public void gesture(GestureEvent e) {
			if (getEventDispatcher() instanceof GestureDomainEventDispatcher) {
				((GestureDomainEventDispatcher) getEventDispatcher()).dispatchGesture(e);
			}
		}
	}
}
