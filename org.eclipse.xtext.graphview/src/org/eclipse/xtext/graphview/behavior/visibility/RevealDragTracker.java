/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditDomain;
import org.eclipse.xtext.graphview.behavior.buttons.AbstractRapidButton;
import org.eclipse.xtext.graphview.behavior.buttons.AbstractRapidButtonDragTracker;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.common.collect.Lists;

public class RevealDragTracker extends AbstractRapidButtonDragTracker {

	protected RevealDragTracker(IInstanceModelEditPart hostEditPart, AbstractRapidButton button) {
		super(hostEditPart);
	}

	public static final int STATE_ACTIVATED = 64;

	@Override
	protected String getCommandName() {
		return "Add element";
	}

	@Override
	protected List<IInstanceModelEditPart> createOperationSet() {
		return Collections.singletonList(getHostEditPart());
	}

	@Override
	protected RevealRequest createSourceRequest() {
		AbstractInstance model = getHostEditPart().getModel();
		if (model instanceof NodeInstance) {
			NodeInstance node = (NodeInstance) model;
			List<AbstractInstance> toBeRevealed = Lists.newArrayList();
			for (EdgeInstance edge : node.getIncomingEdges()) {
				if (edge.getSource().getVisibility() == Visibility.HIDDEN) {
					toBeRevealed.add(edge);
					toBeRevealed.add(edge.getSource());
				}
			}
			for (EdgeInstance edge : node.getOutgoingEdges()) {
				if (edge.getTarget().getVisibility() == Visibility.HIDDEN) {
					toBeRevealed.add(edge);
					toBeRevealed.add(edge.getTarget());
				}
			}
			RevealRequest revealRequest = new RevealRequest(toBeRevealed);
			return revealRequest;
		} else {
			return null;
		}
	}

	@Override
	public RevealRequest getSourceRequest() {
		return (RevealRequest) super.getSourceRequest();
	}

	protected boolean handleButtonDown(int button) {
		if (stateTransition(STATE_INITIAL, STATE_ACTIVATED)) {
			updateMouseLocation();
			showSourceFeedback();
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected boolean handleDrag() {
		stateTransition(STATE_ACTIVATED, STATE_DRAG);
		return true;
	}

	@Override
	protected boolean handleDragInProgress() {
		stateTransition(STATE_DRAG, STATE_DRAG_IN_PROGRESS);
		updateMouseLocation();
		showSourceFeedback();
		return true;
	}

	protected boolean handleButtonUp(int button) {
		EditDomain editDomain = getHostEditPart().getViewer().getEditDomain();
		if (stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
			getSourceRequest().selectAll();
			setCurrentCommand(getHostEditPart().getCommand(getSourceRequest()));
			commitDrag();
			return true;
		} else if (stateTransition(STATE_ACTIVATED, STATE_TERMINAL)) {
			editDomain.setActiveTool(new RevealGestureTool(this));
			return true;
		} else {
			return false;
		}
	}

	protected void updateMouseLocation() {
		Point currentMouseLocation = getCurrentInput().getMouseLocation();
		IFigure hostFigure = getHostEditPart().getFigure();
		Point center = hostFigure.getBounds().getCenter();
		if (hostFigure.getParent() != null)
			hostFigure.getParent().translateToAbsolute(center);
		Dimension dragDifference = currentMouseLocation.getDifference(center);
		double dist = diameter(dragDifference);
		double angle = Math.atan2(dragDifference.preciseHeight(), dragDifference.preciseWidth());
		getSourceRequest().setMouseDistance(dist);
		getSourceRequest().setMouseAngle(angle);
	}

	protected double diameter(Dimension dimension) {
		return Math.sqrt(dimension.width * dimension.width + dimension.height * dimension.height);
	}
}
