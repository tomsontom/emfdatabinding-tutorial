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
package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;

import org.eclipse.core.databinding.observable.Diffs;

/**
 * ISwingObservableValue implementation to observe properties of a Swing
 * Container This class can observe enabled, visible, tooltipText, foreground,
 * background and font properties.
 *
 * @since 1.0
 */
public class ControlObservableValue extends AbstractSwingObservableValue {
	private final Container control;

	private final String attribute;

	private Object valueType;

	/**
	 * Map of supported properties.
	 */
	private static final Map<String,Object> SUPPORTED_ATTRIBUTES = new HashMap<String,Object>();
	static {
		SUPPORTED_ATTRIBUTES.put(SwingProperties.ENABLED, Boolean.TYPE);
		SUPPORTED_ATTRIBUTES.put(SwingProperties.VISIBLE, Boolean.TYPE);
		SUPPORTED_ATTRIBUTES.put(SwingProperties.TOOLTIP_TEXT, String.class);
		SUPPORTED_ATTRIBUTES.put(SwingProperties.FOREGROUND, Color.class);
		SUPPORTED_ATTRIBUTES.put(SwingProperties.BACKGROUND, Color.class);
		SUPPORTED_ATTRIBUTES.put(SwingProperties.FONT, Font.class);
	}

	/**
	 * @param control
	 * @param attribute
	 */
	public ControlObservableValue(Container control, String attribute) {
		super(control);
		this.control = control;
		this.attribute = attribute;
		if (SUPPORTED_ATTRIBUTES.keySet().contains(attribute)) {
			this.valueType = SUPPORTED_ATTRIBUTES.get(attribute);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void doSetValue(Object value) {
		Object oldValue = doGetValue();
		if (attribute.equals(SwingProperties.ENABLED)) {
			control.setEnabled(((Boolean) value).booleanValue());
		} else if (attribute.equals(SwingProperties.VISIBLE)) {
			control.setVisible(((Boolean) value).booleanValue());
		} else if (attribute.equals(SwingProperties.TOOLTIP_TEXT)) {
			if (control instanceof JComponent) {
				((JComponent) control).setToolTipText((String) value);
			} else {
				throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] can not support toolTipText."); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} else if (attribute.equals(SwingProperties.FOREGROUND)) {
			control.setForeground((Color) value);
		} else if (attribute.equals(SwingProperties.BACKGROUND)) {
			control.setBackground((Color) value);
		} else if (attribute.equals(SwingProperties.FONT)) {
			control.setFont((Font) value);
		}
		fireValueChange(Diffs.createValueDiff(oldValue, value));
	}

	public Object doGetValue() {
		if (attribute.equals(SwingProperties.ENABLED)) {
			return control.isEnabled() ? Boolean.TRUE : Boolean.FALSE;
		}
		if (attribute.equals(SwingProperties.VISIBLE)) {
			return control.isVisible() ? Boolean.TRUE : Boolean.FALSE;
		}
		if (attribute.equals(SwingProperties.TOOLTIP_TEXT)) {
			if (control instanceof JComponent) {
				((JComponent) control).getToolTipText();
			} else {
				throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] can not support toolTipText."); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		if (attribute.equals(SwingProperties.FOREGROUND)) {
			return control.getForeground();
		}
		if (attribute.equals(SwingProperties.BACKGROUND)) {
			return control.getBackground();
		}
		if (attribute.equals(SwingProperties.FONT)) {
			return control.getFont();
		}

		return null;
	}

	public Object getValueType() {
		return valueType;
	}

}