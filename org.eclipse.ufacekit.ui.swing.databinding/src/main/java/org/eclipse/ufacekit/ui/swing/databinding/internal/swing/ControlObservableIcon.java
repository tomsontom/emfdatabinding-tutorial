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

import java.awt.Image;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.ufacekit.ui.swing.custom.JTabbedPanePage;

/**
 * Class providing observable to icon property for different Swing controls
 * <ul>
 * <li>{@link AbstractButton}</li>
 * <li>{@link JLabel}</li>
 * <li>{@link JTabbedPanePage}</li>
 * </ul>
 *
 * @since 1.0
 *
 */
public class ControlObservableIcon extends AbstractSwingObservableValue {

	/**
	 * Create icon observable for a button
	 *
	 * @param button
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(AbstractButton button) {
		super(button);
	}

	/**
	 * Create icon observable for a button
	 *
	 * @param realm
	 *            the realm to sync to the ui thread
	 *
	 * @param button
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(Realm realm, AbstractButton button) {
		super(realm, button);
	}

	/**
	 * Create icon observable for a label
	 *
	 * @param label
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(JLabel label) {
		super(label);
	}

	/**
	 * Create icon observable for a label
	 *
	 * @param realm
	 *            the realm to sync to the ui thread
	 *
	 * @param label
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(Realm realm, JLabel label) {
		super(realm, label);
	}

	/**
	 * Create icon observable for a tabbed pane
	 *
	 * @param tabbedPanePage
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(JTabbedPanePage tabbedPanePage) {
		super(tabbedPanePage);
	}

	/**
	 * Create icon observable for a tabbed pane
	 *
	 * @param realm
	 *            the realm to sync to the ui thread
	 *
	 * @param tabbedPanePage
	 *            the control whose icon is observed
	 * @since 1.0
	 */
	public ControlObservableIcon(Realm realm, JTabbedPanePage tabbedPanePage) {
		super(realm, tabbedPanePage);
	}

	public void doSetValue(final Object value) {
		InputStream inputStream = (InputStream) value;
		if (inputStream == null)
			return;
		try {
			Image image = ImageIO.read(inputStream);
			ImageIcon icon = new ImageIcon(image);
			setIcon(icon);

			// if (!newValue.equals(oldValue)) {
			// fireValueChange(Diffs.createValueDiff(oldValue, newValue));
			// }
		} catch (Exception e) {

		}
	}

	public Object doGetValue() {
		return null;// button.getText();
	}

	public Object getValueType() {
		return InputStream.class;
	}

	private void setIcon(ImageIcon icon) {
		if (getContainer() instanceof AbstractButton)
			((AbstractButton) getContainer()).setIcon(icon);
		if (getContainer() instanceof JLabel)
			((JLabel) getContainer()).setIcon(icon);
		if (getContainer() instanceof JTabbedPanePage)
			((JTabbedPanePage) getContainer()).setIcon(icon);
	}

}
