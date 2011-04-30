/*******************************************************************************
 * Copyright (c) 2007, Daniel Spiewak and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eclipse.org - original authors of the org.eclipse.swt.layout.GridLayout
 *     Daniel Spiewak <djspiewak@gmail.com> - original author
 *     James Strachan <james.strachan@iona.com>
 *     Tom Schindl <tom.schindl@bestsolution.at> - modified for UFacekit
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * SWT-GridLayout reimplementation for Swing
 *
 * @since 1.0
 *
 */
public final class SwingGridLayout implements LayoutManager2 {
	private Map<Component, SwingGridData> constraints;

	/**
	 * Number of columns
	 */
	public int numColumns = 0;

	/**
	 * All columns have equal width
	 */
	public boolean makeColumnsEqualWidth = false;

	/**
	 * Margin width
	 */
	public int marginWidth = 5;

	/**
	 * Margin height
	 */
	public int marginHeight = 5;

	/**
	 * Left margin
	 */
	public int marginLeft = 0;

	/**
	 * Top margin
	 */
	public int marginTop = 0;

	/**
	 * Right margin
	 */
	public int marginRight = 0;

	/**
	 * Bottom margin
	 */
	public int marginBottom = 0;

	/**
	 * Horizontal spacing
	 */
	public int horizontalSpacing = 5;

	/**
	 * Vertical spacing
	 */
	public int verticalSpacing = 5;

	/**
	 * Create default layout
	 *
	 * @since 1.0
	 */
	public SwingGridLayout() {
		constraints = new HashMap<Component, SwingGridData>();
	}

	/**
	 * Create new layout
	 *
	 * @param numColumns
	 *            the number of columns
	 * @param makeColumnsEqualWidth
	 *            all columns equal width
	 * @since 1.0
	 */
	public SwingGridLayout(int numColumns, boolean makeColumnsEqualWidth) {
		this();

		this.numColumns = numColumns;
		this.makeColumnsEqualWidth = makeColumnsEqualWidth;
	}

	public void addLayoutComponent(Component comp, Object constraints) {
		if (constraints == null) {
			constraints = new SwingGridData();
		}

		this.constraints.put(comp, (SwingGridData) constraints);
	}

	public float getLayoutAlignmentX(Container target) {
		return 0.5f;
	}

	public float getLayoutAlignmentY(Container target) {
		return 0.5f;
	}

	public void invalidateLayout(Container target) {
		Iterator<SwingGridData> it = constraints.values().iterator();

		while (it.hasNext()) {
			it.next().flushCache();
		}
	}

	public Dimension maximumLayoutSize(Container target) {
		return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	public void addLayoutComponent(String name, Component comp) {
		constraints.put(comp, new SwingGridData());
	}

	public void layoutContainer(Container parent) {
		Rectangle rect = new Rectangle();
		Insets insets = parent.getInsets();

		rect.x = insets.left;
		rect.y = insets.right;
		rect.width = parent.getSize().width - insets.left - insets.right;
		rect.height = parent.getSize().height - insets.top - insets.bottom;

		layout(parent, true, rect.x, rect.y, rect.width, rect.height);
	}

	public Dimension minimumLayoutSize(Container parent) {
		return preferredLayoutSize(parent);
	}

	public Dimension preferredLayoutSize(Container parent) {
		Dimension size = layout(parent, false, 0, 0, 0, 0);

		return size;
	}

	public void removeLayoutComponent(Component comp) {
		constraints.remove(comp);
	}

	/**
	 * Get the data for the components
	 *
	 * @param grid
	 *            the components
	 * @param row
	 *            the row
	 * @param column
	 *            the column
	 * @param rowCount
	 *            the row count
	 * @param columnCount
	 *            the column count
	 * @param first
	 *            is it the first column
	 * @return the data
	 * @since 1.0
	 */
	SwingGridData getData(Component[][] grid, int row, int column, int rowCount, int columnCount, boolean first) {
		Component control = grid[row][column];
		if (control != null) {
			SwingGridData data = (SwingGridData) constraints.get(control);
			int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
			int vSpan = Math.max(1, data.verticalSpan);
			int i = first ? row + vSpan - 1 : row - vSpan + 1;
			int j = first ? column + hSpan - 1 : column - hSpan + 1;
			if (0 <= i && i < rowCount) {
				if (0 <= j && j < columnCount) {
					if (control == grid[i][j])
						return data;
				}
			}
		}
		return null;
	}

	/**
	 * Layout the components
	 *
	 * @param composite
	 *            the container
	 * @param move
	 *            is moved
	 * @param x
	 *            the x coord
	 * @param y
	 *            the y coord
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @return the dimension
	 * @since 1.0
	 */
	Dimension layout(Container composite, boolean move, int x, int y, int width, int height) {
		if (numColumns < 1) {
			return new Dimension(marginLeft + marginWidth * 2 + marginRight, marginTop + marginHeight * 2 + marginBottom);
		}
		Component[] children = composite.getComponents();
		int count = 0;
		for (int i = 0; i < children.length; i++) {
			Component control = children[i];
			SwingGridData data = constraints.get(control);
			if (data == null || !data.exclude) {
				children[count++] = children[i];
			}
		}
		if (count == 0) {
			return new Dimension(marginLeft + marginWidth * 2 + marginRight, marginTop + marginHeight * 2 + marginBottom);
		}
		for (int i = 0; i < count; i++) {
			Component child = children[i];
			SwingGridData data = constraints.get(child);

			if (data == null) {
				constraints.put(child, (data = new SwingGridData()));
			}

			data.computeSize(child, data.widthHint, data.heightHint);
			if (data.grabExcessHorizontalSpace && data.minimumWidth > 0) {
				if (data.cacheWidth < data.minimumWidth) {
					int trim = 0;
					// TEMPORARY CODE
					// if (child instanceof Scrollable) {
					// Rectangle rect = ((Scrollable) child).computeTrim(0, 0,
					// 0, 0);
					// trim = rect.width;
					// } else {
					// trim = child.getBorderWidth() * 2;
					// }
					data.cacheWidth = data.cacheHeight = SwingGridData.DEFAULT;
					data.computeSize(child, Math.max(0, data.minimumWidth - trim), data.heightHint);
				}
			}
			if (data.grabExcessVerticalSpace && data.minimumHeight > 0) {
				data.cacheHeight = Math.max(data.cacheHeight, data.minimumHeight);
			}
		}

		/* Build the grid */
		int row = 0, column = 0, rowCount = 0, columnCount = numColumns;
		Component[][] grid = new Component[4][columnCount];
		for (int i = 0; i < count; i++) {
			Component child = children[i];
			SwingGridData data = (SwingGridData) constraints.get(child);
			int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
			int vSpan = Math.max(1, data.verticalSpan);
			while (true) {
				int lastRow = row + vSpan;
				if (lastRow >= grid.length) {
					Component[][] newGrid = new Component[lastRow + 4][columnCount];
					System.arraycopy(grid, 0, newGrid, 0, grid.length);
					grid = newGrid;
				}
				if (grid[row] == null) {
					grid[row] = new Component[columnCount];
				}
				while (column < columnCount && grid[row][column] != null) {
					column++;
				}
				int endCount = column + hSpan;
				if (endCount <= columnCount) {
					int index = column;
					while (index < endCount && grid[row][index] == null) {
						index++;
					}
					if (index == endCount)
						break;
					column = index;
				}
				if (column + hSpan >= columnCount) {
					column = 0;
					row++;
				}
			}
			for (int j = 0; j < vSpan; j++) {
				if (grid[row + j] == null) {
					grid[row + j] = new Component[columnCount];
				}
				for (int k = 0; k < hSpan; k++) {
					grid[row + j][column + k] = child;
				}
			}
			rowCount = Math.max(rowCount, row + vSpan);
			column += hSpan;
		}

		/* Column widths */
		int availableWidth = width - horizontalSpacing * (columnCount - 1) - (marginLeft + marginWidth * 2 + marginRight);
		int expandCount = 0;
		int[] widths = new int[columnCount];
		int[] minWidths = new int[columnCount];
		boolean[] expandColumn = new boolean[columnCount];
		for (int j = 0; j < columnCount; j++) {
			for (int i = 0; i < rowCount; i++) {
				SwingGridData data = getData(grid, i, j, rowCount, columnCount, true);
				if (data != null) {
					int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
					if (hSpan == 1) {
						int w = data.cacheWidth + data.horizontalIndent;
						widths[j] = Math.max(widths[j], w);
						if (data.grabExcessHorizontalSpace) {
							if (!expandColumn[j])
								expandCount++;
							expandColumn[j] = true;
						}
						if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
							w = !data.grabExcessHorizontalSpace || data.minimumWidth == SwingGridData.DEFAULT ? data.cacheWidth : data.minimumWidth;
							w += data.horizontalIndent;
							minWidths[j] = Math.max(minWidths[j], w);
						}
					}
				}
			}
			for (int i = 0; i < rowCount; i++) {
				SwingGridData data = getData(grid, i, j, rowCount, columnCount, false);
				if (data != null) {
					int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
					if (hSpan > 1) {
						int spanWidth = 0, spanMinWidth = 0, spanExpandCount = 0;
						for (int k = 0; k < hSpan; k++) {
							spanWidth += widths[j - k];
							spanMinWidth += minWidths[j - k];
							if (expandColumn[j - k])
								spanExpandCount++;
						}
						if (data.grabExcessHorizontalSpace && spanExpandCount == 0) {
							expandCount++;
							expandColumn[j] = true;
						}
						int w = data.cacheWidth + data.horizontalIndent - spanWidth - (hSpan - 1) * horizontalSpacing;
						if (w > 0) {
							if (makeColumnsEqualWidth) {
								int equalWidth = (w + spanWidth) / hSpan;
								int remainder = (w + spanWidth) % hSpan, last = -1;
								for (int k = 0; k < hSpan; k++) {
									widths[last = j - k] = Math.max(equalWidth, widths[j - k]);
								}
								if (last > -1)
									widths[last] += remainder;
							} else {
								if (spanExpandCount == 0) {
									widths[j] += w;
								} else {
									int delta = w / spanExpandCount;
									int remainder = w % spanExpandCount, last = -1;
									for (int k = 0; k < hSpan; k++) {
										if (expandColumn[j - k]) {
											widths[last = j - k] += delta;
										}
									}
									if (last > -1)
										widths[last] += remainder;
								}
							}
						}
						if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
							w = !data.grabExcessHorizontalSpace || data.minimumWidth == SwingGridData.DEFAULT ? data.cacheWidth : data.minimumWidth;
							w += data.horizontalIndent - spanMinWidth - (hSpan - 1) * horizontalSpacing;
							if (w > 0) {
								if (spanExpandCount == 0) {
									minWidths[j] += w;
								} else {
									int delta = w / spanExpandCount;
									int remainder = w % spanExpandCount, last = -1;
									for (int k = 0; k < hSpan; k++) {
										if (expandColumn[j - k]) {
											minWidths[last = j - k] += delta;
										}
									}
									if (last > -1)
										minWidths[last] += remainder;
								}
							}
						}
					}
				}
			}
		}
		if (makeColumnsEqualWidth) {
			int minColumnWidth = 0;
			int columnWidth = 0;
			for (int i = 0; i < columnCount; i++) {
				minColumnWidth = Math.max(minColumnWidth, minWidths[i]);
				columnWidth = Math.max(columnWidth, widths[i]);
			}
			columnWidth = width == SwingGridData.DEFAULT || expandCount == 0 ? columnWidth : Math.max(minColumnWidth, availableWidth / columnCount);
			for (int i = 0; i < columnCount; i++) {
				expandColumn[i] = expandCount > 0;
				widths[i] = columnWidth;
			}
		} else {
			if (width != SwingGridData.DEFAULT && expandCount > 0) {
				int totalWidth = 0;
				for (int i = 0; i < columnCount; i++) {
					totalWidth += widths[i];
				}
				int c = expandCount;
				int delta = (availableWidth - totalWidth) / c;
				int remainder = (availableWidth - totalWidth) % c;
				int last = -1;
				while (totalWidth != availableWidth) {
					for (int j = 0; j < columnCount; j++) {
						if (expandColumn[j]) {
							if (widths[j] + delta > minWidths[j]) {
								widths[last = j] = widths[j] + delta;
							} else {
								widths[j] = minWidths[j];
								expandColumn[j] = false;
								c--;
							}
						}
					}
					if (last > -1)
						widths[last] += remainder;

					for (int j = 0; j < columnCount; j++) {
						for (int i = 0; i < rowCount; i++) {
							SwingGridData data = getData(grid, i, j, rowCount, columnCount, false);
							if (data != null) {
								int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
								if (hSpan > 1) {
									if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
										int spanWidth = 0, spanExpandCount = 0;
										for (int k = 0; k < hSpan; k++) {
											spanWidth += widths[j - k];
											if (expandColumn[j - k])
												spanExpandCount++;
										}
										int w = !data.grabExcessHorizontalSpace || data.minimumWidth == SwingGridData.DEFAULT ? data.cacheWidth
												: data.minimumWidth;
										w += data.horizontalIndent - spanWidth - (hSpan - 1) * horizontalSpacing;
										if (w > 0) {
											if (spanExpandCount == 0) {
												widths[j] += w;
											} else {
												int delta2 = w / spanExpandCount;
												int remainder2 = w % spanExpandCount, last2 = -1;
												for (int k = 0; k < hSpan; k++) {
													if (expandColumn[j - k]) {
														widths[last2 = j - k] += delta2;
													}
												}
												if (last2 > -1)
													widths[last2] += remainder2;
											}
										}
									}
								}
							}
						}
					}
					if (c == 0)
						break;
					totalWidth = 0;
					for (int i = 0; i < columnCount; i++) {
						totalWidth += widths[i];
					}
					delta = (availableWidth - totalWidth) / c;
					remainder = (availableWidth - totalWidth) % c;
					last = -1;
				}
			}
		}

		/* Wrapping */
		SwingGridData[] flush = null;
		int flushLength = 0;
		if (width != SwingGridData.DEFAULT) {
			for (int j = 0; j < columnCount; j++) {
				for (int i = 0; i < rowCount; i++) {
					SwingGridData data = getData(grid, i, j, rowCount, columnCount, false);
					if (data != null) {
						if (data.heightHint == SwingGridData.DEFAULT) {
							Component child = grid[i][j];
							// TEMPORARY CODE
							int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
							int currentWidth = 0;
							for (int k = 0; k < hSpan; k++) {
								currentWidth += widths[j - k];
							}
							currentWidth += (hSpan - 1) * horizontalSpacing - data.horizontalIndent;
							if ((currentWidth != data.cacheWidth && data.horizontalAlignment == SwingGridData.FILL)
									|| (data.cacheWidth > currentWidth)) {
								int trim = 0;
								// if (child instanceof Scrollable) {
								// Rectangle rect = ((Scrollable)
								// child).computeTrim(0, 0, 0, 0);
								// trim = rect.width;
								// } else {
								// trim = child.getBorderWidth() * 2;
								// }
								data.cacheWidth = data.cacheHeight = SwingGridData.DEFAULT;
								data.computeSize(child, Math.max(0, currentWidth - trim), data.heightHint);
								if (data.grabExcessVerticalSpace && data.minimumHeight > 0) {
									data.cacheHeight = Math.max(data.cacheHeight, data.minimumHeight);
								}
								if (flush == null)
									flush = new SwingGridData[count];
								flush[flushLength++] = data;
							}
						}
					}
				}
			}
		}

		/* Row heights */
		int availableHeight = height - verticalSpacing * (rowCount - 1) - (marginTop + marginHeight * 2 + marginBottom);
		expandCount = 0;
		int[] heights = new int[rowCount];
		int[] minHeights = new int[rowCount];
		boolean[] expandRow = new boolean[rowCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				SwingGridData data = getData(grid, i, j, rowCount, columnCount, true);
				if (data != null) {
					int vSpan = Math.max(1, Math.min(data.verticalSpan, rowCount));
					if (vSpan == 1) {
						int h = data.cacheHeight + data.verticalIndent;
						heights[i] = Math.max(heights[i], h);
						if (data.grabExcessVerticalSpace) {
							if (!expandRow[i])
								expandCount++;
							expandRow[i] = true;
						}
						if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
							h = !data.grabExcessVerticalSpace || data.minimumHeight == SwingGridData.DEFAULT ? data.cacheHeight : data.minimumHeight;
							h += data.verticalIndent;
							minHeights[i] = Math.max(minHeights[i], h);
						}
					}
				}
			}
			for (int j = 0; j < columnCount; j++) {
				SwingGridData data = getData(grid, i, j, rowCount, columnCount, false);
				if (data != null) {
					int vSpan = Math.max(1, Math.min(data.verticalSpan, rowCount));
					if (vSpan > 1) {
						int spanHeight = 0, spanMinHeight = 0, spanExpandCount = 0;
						for (int k = 0; k < vSpan; k++) {
							spanHeight += heights[i - k];
							spanMinHeight += minHeights[i - k];
							if (expandRow[i - k])
								spanExpandCount++;
						}
						if (data.grabExcessVerticalSpace && spanExpandCount == 0) {
							expandCount++;
							expandRow[i] = true;
						}
						int h = data.cacheHeight + data.verticalIndent - spanHeight - (vSpan - 1) * verticalSpacing;
						if (h > 0) {
							if (spanExpandCount == 0) {
								heights[i] += h;
							} else {
								int delta = h / spanExpandCount;
								int remainder = h % spanExpandCount, last = -1;
								for (int k = 0; k < vSpan; k++) {
									if (expandRow[i - k]) {
										heights[last = i - k] += delta;
									}
								}
								if (last > -1)
									heights[last] += remainder;
							}
						}
						if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
							h = !data.grabExcessVerticalSpace || data.minimumHeight == SwingGridData.DEFAULT ? data.cacheHeight : data.minimumHeight;
							h += data.verticalIndent - spanMinHeight - (vSpan - 1) * verticalSpacing;
							if (h > 0) {
								if (spanExpandCount == 0) {
									minHeights[i] += h;
								} else {
									int delta = h / spanExpandCount;
									int remainder = h % spanExpandCount, last = -1;
									for (int k = 0; k < vSpan; k++) {
										if (expandRow[i - k]) {
											minHeights[last = i - k] += delta;
										}
									}
									if (last > -1)
										minHeights[last] += remainder;
								}
							}
						}
					}
				}
			}
		}
		if (height != SwingGridData.DEFAULT && expandCount > 0) {
			int totalHeight = 0;
			for (int i = 0; i < rowCount; i++) {
				totalHeight += heights[i];
			}
			int c = expandCount;
			int delta = (availableHeight - totalHeight) / c;
			int remainder = (availableHeight - totalHeight) % c;
			int last = -1;
			while (totalHeight != availableHeight) {
				for (int i = 0; i < rowCount; i++) {
					if (expandRow[i]) {
						if (heights[i] + delta > minHeights[i]) {
							heights[last = i] = heights[i] + delta;
						} else {
							heights[i] = minHeights[i];
							expandRow[i] = false;
							c--;
						}
					}
				}
				if (last > -1)
					heights[last] += remainder;

				for (int i = 0; i < rowCount; i++) {
					for (int j = 0; j < columnCount; j++) {
						SwingGridData data = getData(grid, i, j, rowCount, columnCount, false);
						if (data != null) {
							int vSpan = Math.max(1, Math.min(data.verticalSpan, rowCount));
							if (vSpan > 1) {
								if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
									int spanHeight = 0, spanExpandCount = 0;
									for (int k = 0; k < vSpan; k++) {
										spanHeight += heights[i - k];
										if (expandRow[i - k])
											spanExpandCount++;
									}
									int h = !data.grabExcessVerticalSpace || data.minimumHeight == SwingGridData.DEFAULT ? data.cacheHeight
											: data.minimumHeight;
									h += data.verticalIndent - spanHeight - (vSpan - 1) * verticalSpacing;
									if (h > 0) {
										if (spanExpandCount == 0) {
											heights[i] += h;
										} else {
											int delta2 = h / spanExpandCount;
											int remainder2 = h % spanExpandCount, last2 = -1;
											for (int k = 0; k < vSpan; k++) {
												if (expandRow[i - k]) {
													heights[last2 = i - k] += delta2;
												}
											}
											if (last2 > -1)
												heights[last2] += remainder2;
										}
									}
								}
							}
						}
					}
				}
				if (c == 0)
					break;
				totalHeight = 0;
				for (int i = 0; i < rowCount; i++) {
					totalHeight += heights[i];
				}
				delta = (availableHeight - totalHeight) / c;
				remainder = (availableHeight - totalHeight) % c;
				last = -1;
			}
		}

		/* Position the controls */
		if (move) {
			int gridY = y + marginTop + marginHeight;
			for (int i = 0; i < rowCount; i++) {
				int gridX = x + marginLeft + marginWidth;
				for (int j = 0; j < columnCount; j++) {
					SwingGridData data = getData(grid, i, j, rowCount, columnCount, true);
					if (data != null) {
						int hSpan = Math.max(1, Math.min(data.horizontalSpan, columnCount));
						int vSpan = Math.max(1, data.verticalSpan);
						int cellWidth = 0, cellHeight = 0;
						for (int k = 0; k < hSpan; k++) {
							cellWidth += widths[j + k];
						}
						for (int k = 0; k < vSpan; k++) {
							cellHeight += heights[i + k];
						}
						cellWidth += horizontalSpacing * (hSpan - 1);
						int childX = gridX + data.horizontalIndent;
						int childWidth = Math.min(data.cacheWidth, cellWidth);
						switch (data.horizontalAlignment) {
						case SwingGridData.CENTER:
							childX += Math.max(0, (cellWidth - data.horizontalIndent - childWidth) / 2);
							break;
						case SwingGridData.RIGHT:
						case SwingGridData.END:
							childX += Math.max(0, cellWidth - data.horizontalIndent - childWidth);
							break;
						case SwingGridData.FILL:
							childWidth = cellWidth - data.horizontalIndent;
							break;
						}
						cellHeight += verticalSpacing * (vSpan - 1);
						int childY = gridY + data.verticalIndent;
						int childHeight = Math.min(data.cacheHeight, cellHeight);
						switch (data.verticalAlignment) {
						case SwingGridData.CENTER:
							childY += Math.max(0, (cellHeight - data.verticalIndent - childHeight) / 2);
							break;
						case SwingGridData.END:
							childY += Math.max(0, cellHeight - data.verticalIndent - childHeight);
							break;
						case SwingGridData.FILL:
							childHeight = cellHeight - data.verticalIndent;
							break;
						}

						Component child = grid[i][j];
						if (child != null) {
							child.setBounds(childX, childY, childWidth, childHeight);
						}
					}
					gridX += widths[j] + horizontalSpacing;
				}
				gridY += heights[i] + verticalSpacing;
			}
		}

		// clean up cache
		for (int i = 0; i < flushLength; i++) {
			flush[i].cacheWidth = flush[i].cacheHeight = -1;
		}

		int totalDefaultWidth = 0;
		int totalDefaultHeight = 0;
		for (int i = 0; i < columnCount; i++) {
			totalDefaultWidth += widths[i];
		}
		for (int i = 0; i < rowCount; i++) {
			totalDefaultHeight += heights[i];
		}
		totalDefaultWidth += horizontalSpacing * (columnCount - 1) + marginLeft + marginWidth * 2 + marginRight;
		totalDefaultHeight += verticalSpacing * (rowCount - 1) + marginTop + marginHeight * 2 + marginBottom;
		return new Dimension(totalDefaultWidth, totalDefaultHeight);
	}
}