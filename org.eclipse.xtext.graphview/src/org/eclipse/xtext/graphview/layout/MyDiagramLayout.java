package org.eclipse.xtext.graphview.layout;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.google.common.collect.Lists;

public class MyDiagramLayout extends XYLayout {

	private int offset = 16;

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	@Override
	public void layout(IFigure container) {
		@SuppressWarnings("unchecked")
		List<IFigure> children = Lists.newArrayList(container.getChildren());
		for (IFigure child : children) {
			Dimension childSize = child.getPreferredSize();
			child.setBounds(new Rectangle(0, 0, childSize.width,
					childSize.height));
		}
		Collections.sort(children, new Comparator<IFigure>() {
			@Override
			public int compare(IFigure arg0, IFigure arg1) {
				return arg1.getBounds().height
						- arg0.getBounds().height;
			}
		});
		int numColumns = (int) Math.sqrt(children.size());
		int numRows = children.size() / numColumns
				+ ((children.size() % numColumns != 0) ? 1 : 0);
		int currentRowHeight = 0;
		int currentY = offset;
		for (int row = 0; row < numRows; ++row) {
			int currentX = offset;
			currentRowHeight = 0;
			for (int index = row * numColumns; index < (row + 1) * numColumns
					&& index < children.size(); ++index) {
				IFigure child = children.get(index);
				currentRowHeight = Math.max(currentRowHeight, child
						.getPreferredSize().height);
				child.setLocation(new Point(currentX, currentY));
				currentX += child.getBounds().width + offset;
			}
			currentY += currentRowHeight + offset;
		}
	}

}
