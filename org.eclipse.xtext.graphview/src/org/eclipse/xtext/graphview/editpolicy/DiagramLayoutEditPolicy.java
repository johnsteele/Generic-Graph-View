/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public class DiagramLayoutEditPolicy extends XYLayoutEditPolicy {

	protected static class ChangeBoundsCommand extends Command {
		private ChangeBoundsRequest request;

		private Rectangle originalBounds;

		private GraphicalEditPart child;

		public ChangeBoundsCommand(ChangeBoundsRequest request, GraphicalEditPart child) {
			this.request = request;
			this.child = child;
		}
	
		@Override
		public void execute() {
			IFigure figure = child.getFigure();
			originalBounds = figure.getBounds();
			figure.setBounds(request.getTransformedRectangle(originalBounds));
			figure.validate();
		}
		
		@Override
		public void undo() {
			IFigure figure = child.getFigure();
			figure.setBounds(originalBounds);
			figure.validate();
		}
	}
	
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}
	
	@Override
	protected Command createChangeConstraintCommand(
			final ChangeBoundsRequest request, final EditPart child, Object constraint) {
		return new ChangeBoundsCommand(request, (GraphicalEditPart) child);
	}

	
	@Override
	protected Command createAddCommand(ChangeBoundsRequest request,
			EditPart child, Object constraint) {
		if(child.getModel() instanceof AbstractInstance 
				&& ((AbstractInstance) child.getModel()).eContainer() == getHost().getModel()) 
			return createChangeConstraintCommand(request, child, constraint);
		else 
			return super.createAddCommand(request, child, constraint);
	}
}
