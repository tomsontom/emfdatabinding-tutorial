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

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;

/**
 * ISwingObservableValue implementation to observe value of JSlider.
 *
 * @since 1.0
 */
public class SliderObservableValue extends AbstractSwingObservableValue {

	private JSlider slider;
	private ChangeListener changeListener;
	private boolean updating;

	/**
	 * Previous value of the Slider.
	 */
	private Integer oldValue;

	/**
	 * Observe the value of a slider
	 *
	 * @param slider
	 *            the slider to observe
	 * @since 1.0
	 */
	public SliderObservableValue(JSlider slider) {
		super(slider);
		this.slider = slider;
		init();
	}

	/**
	 * Observe the value of a slider
	 *
	 * @param realm
	 *            the realm to sync with ui thread
	 * @param slider
	 *            the slider to observe
	 * @since 1.0
	 */
	public SliderObservableValue(Realm realm, JSlider slider) {
		super(realm, slider);
		this.slider = slider;
		init();
	}

	private void init() {
		changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!updating) {
					Integer newValue = getSliderValue();
					notifyIfChanged(oldValue, newValue);
					oldValue = newValue;
				}
			}
		};
		slider.addChangeListener(changeListener);
	}

	public synchronized void dispose() {
		super.dispose();
		slider.removeChangeListener(changeListener);
	}

	protected Object doGetValue() {
		return getSliderValue();
	}

	protected void doSetValue(Object value) {
		Object oldValue = getSliderValue();
		try {
			updating = true;
			if ((value instanceof Integer)) {
				Integer newValue = (Integer) value;
				if (newValue != null)
					slider.setValue(newValue.intValue());
			}
		} finally {
			updating = false;
		}
		notifyIfChanged(oldValue, value);
	}

	public Object getValueType() {
		return Integer.class;
	}

	private void notifyIfChanged(Object oldValue, Object newValue) {
		if (oldValue == null || !oldValue.equals(newValue)) {
			fireValueChange(Diffs.createValueDiff(oldValue, newValue));
		}
	}

	private Integer getSliderValue() {
		return Integer.valueOf(slider.getValue());
	}
}
