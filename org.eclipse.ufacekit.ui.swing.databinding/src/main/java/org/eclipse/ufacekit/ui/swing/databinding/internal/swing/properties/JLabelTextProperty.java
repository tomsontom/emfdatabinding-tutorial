package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JLabel;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

/**
 * @since 3.3
 * 
 */
public class JLabelTextProperty extends WidgetStringValueProperty<EventType,JLabel> {
	String doGetStringValue(Object source) {
		return ((JLabel) source).getText();
	}

	void doSetStringValue(Object source, String value) {
		((JLabel) source).setText(value == null ? "" : value); //$NON-NLS-1$
	}

	public String toString() {
		return "Label.text <String>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(EventType type, JLabel widget, @SuppressWarnings("rawtypes") Delegate delegate) {
		return null;
	}
}
