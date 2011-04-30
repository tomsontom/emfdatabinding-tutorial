package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JFrame;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;


/**
 * @since 3.3
 * 
 */
public class JFrameTitleProperty extends WidgetStringValueProperty<EventType,JFrame> {
	String doGetStringValue(Object source) {
		return ((JFrame) source).getTitle();
	}

	void doSetStringValue(Object source, String value) {
		((JFrame) source).setTitle(value == null ? "" : value); //$NON-NLS-1$
	}

	public String toString() {
		return "Shell.text <String>"; //$NON-NLS-1$
	}

	@Override
	protected IDelegateRegistration registerDelegate(EventType type, JFrame widget, Delegate delegate) {
		return null;
	}
}
