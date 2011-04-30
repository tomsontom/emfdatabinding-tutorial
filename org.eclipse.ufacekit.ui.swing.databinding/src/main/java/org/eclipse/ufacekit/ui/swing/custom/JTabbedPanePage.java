/*******************************************************************************
 * Copyright (c) 2007, Angelo Zerr and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.custom;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

/**
 * JTabbedPanePage used to bind title and icon of tab header.
 *
 * @since 1.0
 * FIXME Angelo
 */
public class JTabbedPanePage extends JComponent {

	/**
	 *
	 */
	private static final long serialVersionUID = 8853744216443992011L;

	private int index = -1;
	private JTabbedPane tabbedPane;
	private Component page;

	private String text;
	private String tooltipText;
	private Icon icon;

	/**
	 * FIXME Angelo
	 * @param tabbedPane
	 * @since 1.0
	 */
	public JTabbedPanePage(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	/**
	 * FIXME Angelo
	 * @return FIXME Angelo
	 * @since 1.0
	 */
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	/**
	 * FIXME Angelo
	 * @param text
	 * @since 1.0
	 */
	public void setText(String text) {
		this.text = text;
		if (index != -1) {
			if (page != null)
				tabbedPane.setTitleAt(index, text);
			else
				setPageBody(text, icon, null, tooltipText, false);
		} else
			setPageBody(null, true);
	}

	/**
	 * FIXME Angelo
	 * @return FIXME Angelo
	 * @since 1.0
	 */
	public String getText() {
		if (index != -1)
			return tabbedPane.getTitleAt(index);
		return text;
	}

	/**
	 * FIXME Angelo
	 * @param icon FIXME Angelo
	 * @since 1.0
	 */
	public void setIcon(Icon icon) {
		this.icon = icon;
		if (index != -1)
			tabbedPane.setIconAt(index, icon);
	}

	/**
	 * FIXME Angelo
	 * @return FIXME Angelo
	 * @since 1.0
	 */
	public Icon getIcon() {
		if (index != -1)
			return tabbedPane.getIconAt(index);
		return this.icon;
	}

	public void setToolTipText(String tooltipText) {
		this.tooltipText = tooltipText;
		if (index != -1)
			tabbedPane.setToolTipTextAt(index, tooltipText);
	}

	public String getToolTipText() {
		if (index != -1)
			return tabbedPane.getToolTipTextAt(index);
		return tooltipText;
	}

	/**
	 * FIXME Angelo
	 * @param index FIXME Angelo
	 * @since 1.0
	 */
	public void setPageIndex(int index) {
		this.index = index;
	}

	/**
	 * FIXME Angelo
	 * @return FIXME Angelo
	 * @since 1.0
	 */
	public int getPageIndex() {
		return index;
	}

	/**
	 * FIXME Angelo
	 * @return FIXME Angelo
	 * @since 1.0
	 */
	public Component getPageBody() {
		return page;
	}

	/**
	 * FIXME Angelo
	 * @param page
	 * @since 1.0
	 */
	public void setPageBody(Component page) {
		setPageBody(page, true);
	}

	/**
	 * FIXME Angelo
	 * @param page
	 * @param update
	 * @since 1.0
	 */
	public void setPageBody(Component page, boolean update) {
		setPageBody(getText(), getIcon(), page, getToolTipText(), update);
	}

	/**
	 * FIXME Angelo
	 * @param title
	 * @param icon
	 * @param page
	 * @param tooltipText
	 * @param update
	 * @since 1.0
	 */
	public void setPageBody(String title, Icon icon, Component page, String tooltipText, boolean update) {
		if (this.index != -1) {
			if (!update)
				this.tabbedPane.insertTab(title, icon, page, tooltipText, index);
			else {
				this.tabbedPane.setTitleAt(index, title);
				this.tabbedPane.setIconAt(index, icon);
				this.tabbedPane.setComponentAt(index, page);
				this.tabbedPane.setToolTipTextAt(index, tooltipText);
			}

		} else {
			this.tabbedPane.addTab(title, icon, page, tooltipText);
			this.index = tabbedPane.getTabCount() - 1;
		}
		this.page = page;
	}

}
