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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.Assert;

/**
 * ISwingObservableValue implementation to observe value of JComboBox.
 *
 * @since 1.0
 */
public class ComboObservableValue extends AbstractSwingObservableValue {

	private final JComboBox combo;
	private JTextComponent textEditor;
	private final String attribute;
	private boolean updating = false;
	private Object currentValue;
	private KeyListener keyListener;
	private ActionListener modifyListener;

	/**
	 * @param combo
	 * @param attribute
	 */
	public ComboObservableValue(JComboBox combo, String attribute) {
		super(combo);
		this.combo = combo;
		this.attribute = attribute;
		init();
	}

	/**
	 * @param realm
	 * @param combo
	 * @param attribute
	 */
	public ComboObservableValue(Realm realm, JComboBox combo, String attribute) {
		super(realm, combo);
		this.combo = combo;
		this.attribute = attribute;
		init();
	}

	private void init() {
		if (attribute.equals(SwingProperties.SELECTION) || attribute.equals(SwingProperties.TEXT)) {
			this.currentValue = combo.getSelectedItem();
			// Add Selected changed listener
			modifyListener = new ActionListener() {

				public void actionPerformed(ActionEvent actionevent) {
					if (!updating) {
						Object oldValue = currentValue;
						currentValue = ComboObservableValue.this.combo.getSelectedItem();
						notifyIfChanged(oldValue, currentValue);
					}
				}
			};
			combo.addActionListener(modifyListener);
			Component editor = combo.getEditor().getEditorComponent();
			if (editor instanceof JTextComponent)
				textEditor = (JTextComponent) editor;
			else
				textEditor = null;
			// Add key listener (for editable combo)
			if (textEditor != null) {
				keyListener = new KeyAdapter() {
					public void keyReleased(KeyEvent e) {
						if (!updating && combo.isEditable()) {
							Object oldValue = currentValue;
							currentValue = getComboValue();
							notifyIfChanged(oldValue, currentValue);
						}
					}
				};
				textEditor.addKeyListener(keyListener);
			}
		} else

			throw new IllegalArgumentException();
	}

	public void doSetValue(final Object value) {
		Object oldValue = combo.getSelectedItem();
		try {
			updating = true;
			combo.setSelectedItem(value);
			combo.updateUI();
		} finally {
			updating = false;
		}
		notifyIfChanged(oldValue, value);
	}

	public Object doGetValue() {
		if (attribute.equals(SwingProperties.TEXT))
			return getComboValue();
		Assert.isTrue(attribute.equals(SwingProperties.SELECTION), "unexpected attribute: " + attribute); //$NON-NLS-1$
		// The problem with a ccombo, is that it changes the text and
		// fires before it update its selection index
		return getComboValue();
	}

	public Object getValueType() {
		Assert.isTrue(attribute.equals(SwingProperties.TEXT) || attribute.equals(SwingProperties.SELECTION), "unexpected attribute: " + attribute); //$NON-NLS-1$
		if( attribute.equals(SwingProperties.TEXT) ) {
			return String.class;
		}
		return null;
	}

	/**
	 * @return attribute being observed
	 */
	public String getAttribute() {
		return attribute;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.databinding.observable.value.AbstractObservableValue
	 * #dispose()
	 */
	public synchronized void dispose() {
		super.dispose();

		if (modifyListener != null) {
			combo.removeActionListener(modifyListener);
		}
		if (keyListener != null) {
			combo.removeKeyListener(keyListener);
		}
	}

	private void notifyIfChanged(Object oldValue, Object newValue) {
		if ((oldValue == null && newValue != null) || (oldValue != null && !oldValue.equals(newValue))) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	private Object getComboValue() {
		Object value = combo.getSelectedItem();
		if (combo.isEditable() && textEditor != null) {
			if (value instanceof Integer) {
				try {
					return new Integer(textEditor.getText());
				} catch (Throwable e) {
					// FIXME : the user type String value into editable
					// JComboBox and the setter is mapped with Integer.
					// How can do notify that?
				}
			}
			if (value instanceof Long) {
				try {
					return new Long(textEditor.getText());
				} catch (Throwable e) {
					// FIXME : the user type String value into editable
					// JComboBox and the setter is mapped with Integer.
					// How can do notify that?
				}
			}
			return textEditor.getText();
		}
		return combo.getSelectedItem();
	}
}
