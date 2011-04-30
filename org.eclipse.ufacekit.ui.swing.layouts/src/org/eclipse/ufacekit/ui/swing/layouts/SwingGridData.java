/*******************************************************************************
 * Copyright (c) 2007, Daniel Spiewak and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eclipse.org - original authors of the org.eclipse.swt.layout.GridData
 *     Daniel Spiewak <djspiewak@gmail.com> - original author
 *     James Strachan <james.strachan@iona.com>
 *     Tom Schindl <tom.schindl@bestsolution.at> - modified for UFacekit
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.layouts;

import java.awt.Component;
import java.awt.Dimension;

/**
 * SWT-GridData reimplementation for Swing
 *
 * @since 1.0
 *
 */
public final class SwingGridData {
	/**
	 * verticalAlignment specifies how controls will be positioned vertically
	 * within a cell.
	 *
	 * The default value is CENTER.
	 *
	 * Possible values are:
	 * <ul>
	 * <li>BEGINNING (or SWT.TOP): Position the control at the top of the cell</li>
	 * <li>CENTER: Position the control in the vertical center of the cell</li>
	 * <li>END (or BOTTOM): Position the control at the bottom of the cell</li>
	 * <li>FILL: Resize the control to fill the cell vertically</li>
	 * </ul>
	 */
	public int verticalAlignment = CENTER;

	/**
	 * horizontalAlignment specifies how controls will be positioned
	 * horizontally within a cell.
	 *
	 * The default value is BEGINNING.
	 *
	 * Possible values are:
	 * <ul>
	 * <li>BEGINNING (or LEFT): Position the control at the left of the cell</li>
	 * <li>CENTER: Position the control in the horizontal center of the cell</li>
	 * <li>END (or RIGHT): Position the control at the right of the cell</li>
	 * <li>FILL: Resize the control to fill the cell horizontally</li>
	 * </ul>
	 */
	public int horizontalAlignment = BEGINNING;

	/**
	 * widthHint specifies the preferred width in pixels. This value is the
	 * wHint passed into Control.getPreferredSize() to determine the preferred
	 * size of the control.
	 *
	 * The default value is SWT.DEFAULT.
	 *
	 * @see Component#getPreferredSize()
	 */
	public int widthHint = DEFAULT;

	/**
	 * heightHint specifies the preferred height in pixels. This value is the
	 * hHint passed into Component.getPreferredSize() to determine the preferred
	 * size of the control.
	 *
	 * The default value is SWT.DEFAULT.
	 *
	 * @see Component#getPreferredSize()
	 */
	public int heightHint = DEFAULT;

	/**
	 * horizontalIndent specifies the number of pixels of indentation that will
	 * be placed along the left side of the cell.
	 *
	 * The default value is 0.
	 */
	public int horizontalIndent = 0;

	/**
	 * verticalIndent specifies the number of pixels of indentation that will be
	 * placed along the top side of the cell.
	 *
	 * The default value is 0.
	 *
	 * @since 3.1
	 */
	public int verticalIndent = 0;

	/**
	 * horizontalSpan specifies the number of column cells that the control will
	 * take up.
	 *
	 * The default value is 1.
	 */
	public int horizontalSpan = 1;

	/**
	 * verticalSpan specifies the number of row cells that the control will take
	 * up.
	 *
	 * The default value is 1.
	 */
	public int verticalSpan = 1;

	/**
	 * <p>
	 * grabExcessHorizontalSpace specifies whether the width of the cell changes
	 * depending on the size of the parent Composite. If
	 * grabExcessHorizontalSpace is <code>true</code>, the following rules apply
	 * to the width of the cell:
	 * </p>
	 * <ul>
	 * <li>If extra horizontal space is available in the parent, the cell will
	 * grow to be wider than its preferred width. The new width will be
	 * "preferred width + delta" where delta is the extra horizontal space
	 * divided by the number of grabbing columns.</li>
	 * <li>If there is not enough horizontal space available in the parent, the
	 * cell will shrink until it reaches its minimum width as specified by
	 * GridData.minimumWidth. The new width will be the maximum of
	 * "minimumWidth" and "preferred width - delta", where delta is the amount
	 * of space missing divided by the number of grabbing columns.</li>
	 * <li>If the parent is packed, the cell will be its preferred width as
	 * specified by GridData.widthHint.</li>
	 * <li>If the control spans multiple columns and there are no other grabbing
	 * controls in any of the spanned columns, the last column in the span will
	 * grab the extra space. If there is at least one other grabbing control in
	 * the span, the grabbing will be spread over the columns already marked as
	 * grabExcessHorizontalSpace.</li>
	 * </ul>
	 *
	 * <p>
	 * The default value is false.
	 * </p>
	 *
	 * @see SwingGridData#minimumWidth
	 * @see SwingGridData#widthHint
	 */
	public boolean grabExcessHorizontalSpace = false;

	/**
	 * <p>
	 * grabExcessVerticalSpace specifies whether the height of the cell changes
	 * depending on the size of the parent Composite. If grabExcessVerticalSpace
	 * is <code>true</code>, the following rules apply to the height of the
	 * cell:
	 * </p>
	 * <ul>
	 * <li>If extra vertical space is available in the parent, the cell will
	 * grow to be taller than its preferred height. The new height will be
	 * "preferred height + delta" where delta is the extra vertical space
	 * divided by the number of grabbing rows.</li>
	 * <li>If there is not enough vertical space available in the parent, the
	 * cell will shrink until it reaches its minimum height as specified by
	 * GridData.minimumHeight. The new height will be the maximum of
	 * "minimumHeight" and "preferred height - delta", where delta is the amount
	 * of space missing divided by the number of grabbing rows.</li>
	 * <li>If the parent is packed, the cell will be its preferred height as
	 * specified by GridData.heightHint.</li>
	 * <li>If the control spans multiple rows and there are no other grabbing
	 * controls in any of the spanned rows, the last row in the span will grab
	 * the extra space. If there is at least one other grabbing control in the
	 * span, the grabbing will be spread over the rows already marked as
	 * grabExcessVerticalSpace.</li>
	 * </ul>
	 *
	 * <p>
	 * The default value is false.
	 * </p>
	 *
	 * @see SwingGridData#minimumHeight
	 * @see SwingGridData#heightHint
	 */
	public boolean grabExcessVerticalSpace = false;

	/**
	 * minimumWidth specifies the minimum width in pixels. This value applies
	 * only if grabExcessHorizontalSpace is true. A value of DEFAULT means that
	 * the minimum width will be the result of Component.getPreferredSize()
	 * where wHint is determined by GridData.widthHint.
	 *
	 * The default value is 0.
	 *
	 * @since 3.1
	 * @see Component#getPreferredSize()
	 * @see SwingGridData#widthHint
	 */
	public int minimumWidth = 0;

	/**
	 * minimumHeight specifies the minimum height in pixels. This value applies
	 * only if grabExcessVerticalSpace is true. A value of SWT.DEFAULT means
	 * that the minimum height will be the result of Control.computeSize(int,
	 * int, boolean) where hHint is determined by GridData.heightHint.
	 *
	 * The default value is 0.
	 *
	 * @since 3.1
	 * @see Component#getPreferredSize()
	 * @see SwingGridData#heightHint
	 */
	public int minimumHeight = 0;

	/**
	 * Exclude item form layouting
	 */
	public boolean exclude = false;

	/**
	 * Default value e.g. the default width and height
	 */
	public static final int DEFAULT = -1;

	/**
	 * Align at the start
	 */
	public static final int BEGINNING = 1;

	/**
	 * Align to the center
	 */
	public static final int CENTER = 2;

	/**
	 * Align to the end
	 */
	public static final int END = 3;

	/**
	 * Fill the available space
	 */
	public static final int FILL = 4;

	/**
	 * Locate element to the left of the cell
	 */
	public static final int RIGHT = 5;

	/**
	 * Align vertical to the beginning
	 */
	public static final int VERTICAL_ALIGN_BEGINNING = 1 << 1;

	/**
	 * Align vertical to the center
	 */
	public static final int VERTICAL_ALIGN_CENTER = 1 << 2;

	/**
	 * Align vertical to the end
	 */
	public static final int VERTICAL_ALIGN_END = 1 << 3;

	/**
	 * Fill vertical space
	 */
	public static final int VERTICAL_ALIGN_FILL = 1 << 4;

	/**
	 * Align horizontal at the beginning
	 */
	public static final int HORIZONTAL_ALIGN_BEGINNING = 1 << 5;

	/**
	 * Align horizontal to the center
	 */
	public static final int HORIZONTAL_ALIGN_CENTER = 1 << 6;

	/**
	 * Align horizontal to the end
	 */
	public static final int HORIZONTAL_ALIGN_END = 1 << 7;

	/**
	 * Fill horizontal space
	 */
	public static final int HORIZONTAL_ALIGN_FILL = 1 << 8;

	/**
	 * Grab horizontal space
	 */
	public static final int GRAB_HORIZONTAL = 1 << 9;

	/**
	 * Grab the vertical space
	 */
	public static final int GRAB_VERTICAL = 1 << 10;

	/**
	 * Fill & Grab vertical space
	 */
	public static final int FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL;

	/**
	 * Fill & Grab the horizontal space
	 */
	public static final int FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL;

	/**
	 * Fill & Grab horizontal and vertical space
	 */
	public static final int FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL;

	/**
	 * Cached width
	 */
	int cacheWidth = -1;

	/**
	 * Cached height
	 */
	int cacheHeight = -1;

	/**
	 * Default width hint
	 */
	int defaultWhint = -1;

	/**
	 * Default height hint
	 */
	int defaultHhint = -1;

	/**
	 * Default width
	 */
	int defaultWidth = -1;

	/**
	 * Default height
	 */
	int defaultHeight = -1;

	/**
	 * The current width hint
	 */
	int currentWhint = -1;

	/**
	 * The current height hint
	 */
	int currentHhint = -1;

	/**
	 * The current width
	 */
	int currentWidth = -1;

	/**
	 * The current height
	 */
	int currentHeight = -1;

	/**
	 * New data object with all default values
	 *
	 * @since 1.0
	 */
	public SwingGridData() {
	}

	/**
	 * Create data object using the style masks to set the values
	 *
	 * @param style
	 *            the style to set the fields using bit masks
	 * @since 1.0
	 */
	public SwingGridData(int style) {
		super();
		if ((style & VERTICAL_ALIGN_BEGINNING) != 0) {
			verticalAlignment = BEGINNING;
		}
		if ((style & VERTICAL_ALIGN_CENTER) != 0) {
			verticalAlignment = CENTER;
		}
		if ((style & VERTICAL_ALIGN_FILL) != 0) {
			verticalAlignment = FILL;
		}
		if ((style & VERTICAL_ALIGN_END) != 0) {
			verticalAlignment = END;
		}
		if ((style & HORIZONTAL_ALIGN_BEGINNING) != 0) {
			horizontalAlignment = BEGINNING;
		}
		if ((style & HORIZONTAL_ALIGN_CENTER) != 0) {
			horizontalAlignment = CENTER;
		}
		if ((style & HORIZONTAL_ALIGN_FILL) != 0) {
			horizontalAlignment = FILL;
		}
		if ((style & HORIZONTAL_ALIGN_END) != 0) {
			horizontalAlignment = END;
		}

		grabExcessHorizontalSpace = (style & GRAB_HORIZONTAL) != 0;
		grabExcessVerticalSpace = (style & GRAB_VERTICAL) != 0;
	}

	/**
	 * Create new layout data definition
	 *
	 * @param horizontalAlignment
	 *            the horizontal alignment
	 * @param verticalAlignment
	 *            the vertical alignment
	 * @param grabExcessHorizontalSpace
	 *            grab the horizontal space
	 * @param grabExcessVerticalSpace
	 *            grab the vertical space
	 * @since 1.0
	 */
	public SwingGridData(int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace) {
		this(horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace, grabExcessVerticalSpace, 1, 1);
	}

	/**
	 * Create new layout data definition
	 *
	 * @param horizontalAlignment
	 *            the horizontal alignment
	 * @param verticalAlignment
	 *            the vertical alignment
	 * @param grabExcessHorizontalSpace
	 *            grab the horizontal space
	 * @param grabExcessVerticalSpace
	 *            grab the vertical space
	 * @param horizontalSpan
	 *            the horizontal span
	 * @param verticalSpan
	 *            the vertical span
	 * @since 1.0
	 */
	public SwingGridData(int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace,
			int horizontalSpan, int verticalSpan) {
		this.horizontalAlignment = horizontalAlignment;
		this.verticalAlignment = verticalAlignment;
		this.grabExcessHorizontalSpace = grabExcessHorizontalSpace;
		this.grabExcessVerticalSpace = grabExcessVerticalSpace;
		this.horizontalSpan = horizontalSpan;
		this.verticalSpan = verticalSpan;
	}

	/**
	 * Create new layout data definition
	 *
	 * @param width
	 *            the default height
	 * @param height
	 *            the default width
	 * @since 1.0
	 */
	public SwingGridData(int width, int height) {
		super();
		this.widthHint = width;
		this.heightHint = height;
	}

	/**
	 * Compute the size and take the internal fields into consideration
	 *
	 * @param control
	 *            the control to compute the size for
	 * @param wHint
	 *            the width hint
	 * @param hHint
	 *            the height hint
	 * @since 1.0
	 */
	void computeSize(Component control, int wHint, int hHint) {
		if (cacheWidth != -1 && cacheHeight != -1) {
			return;
		}

		if (wHint == this.widthHint && hHint == this.heightHint) {
			if (defaultWidth == -1 || defaultHeight == -1 || wHint != defaultWhint || hHint != defaultHhint) {
				Dimension size = control.getPreferredSize();

				if (wHint != DEFAULT) {
					size.width = wHint;
				}
				if (hHint != DEFAULT) {
					size.height = hHint;
				}

				defaultWhint = wHint;
				defaultHhint = hHint;
				defaultWidth = size.width;
				defaultHeight = size.height;
			}
			cacheWidth = defaultWidth;
			cacheHeight = defaultHeight;
			return;
		}

		if (currentWidth == -1 || currentHeight == -1 || wHint != currentWhint || hHint != currentHhint) {
			Dimension size = control.getPreferredSize();

			if (wHint != DEFAULT) {
				size.width = wHint;
			}
			if (hHint != DEFAULT) {
				size.height = hHint;
			}

			currentWhint = wHint;
			currentHhint = hHint;
			currentWidth = size.width;
			currentHeight = size.height;
		}
		cacheWidth = currentWidth;
		cacheHeight = currentHeight;
	}

	/**
	 * Flush cached values
	 *
	 * @since 1.0
	 */
	void flushCache() {
		cacheWidth = cacheHeight = -1;
		defaultWidth = defaultHeight = -1;
		currentWidth = currentHeight = -1;
	}

	/**
	 * @return the class name
	 * @since 1.0
	 */
	String getName() {
		String string = getClass().getName();
		int index = string.lastIndexOf('.');
		if (index == -1)
			return string;
		return string.substring(index + 1, string.length());
	}
}