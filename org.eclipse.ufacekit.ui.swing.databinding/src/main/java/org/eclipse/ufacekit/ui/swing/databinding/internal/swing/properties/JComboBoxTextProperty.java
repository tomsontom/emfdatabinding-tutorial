package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JComboBox;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;

public class JComboBoxTextProperty extends WidgetValueProperty<EventType, JComboBox> {
	public enum Type implements EventType {
		Modify;

		public boolean isNone() {
			return false;
		}
	}

	public Object getValueType() {
		return String.class;
	}

	@Override
	protected IDelegateRegistration registerDelegate(final EventType type, final JComboBox widget, final Delegate delegate) {
		if( widget.isEditable() && widget.getEditor() instanceof JTextComponent ) {
			final DocumentListener listener = new DocumentListener() {

				public void insertUpdate(DocumentEvent e) {
					delegate.handle(type, widget);
				}

				public void removeUpdate(DocumentEvent e) {
					delegate.handle(type, widget);
				}

				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}
			};
			((JTextComponent)widget.getEditor()).getDocument().addDocumentListener(listener);
			return new IDelegateRegistration() {
				
				public void dispose() {
					((JTextComponent)widget.getEditor()).getDocument().removeDocumentListener(listener);
				}
			};
		}
		return null;
	}

	@Override
	protected Object doGetValue(Object source) {
		JComboBox box = (JComboBox) source;
		
		if( box.isEditable() && box.getEditor() instanceof JTextComponent ) {
			return ((JTextComponent)box.getEditor()).getText();
		}
		
		return null;
	}

	@Override
	protected void doSetValue(Object source, Object value) {
		JComboBox box = (JComboBox) source;
		
		if( box.isEditable() && box.getEditor() instanceof JTextComponent ) {
			((JTextComponent)box.getEditor()).setText( value == null ? "" : value.toString()); //$NON-NLS-1$
		}
	}
}
