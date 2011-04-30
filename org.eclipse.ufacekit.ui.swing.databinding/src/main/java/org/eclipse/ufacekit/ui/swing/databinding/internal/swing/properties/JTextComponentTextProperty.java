package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.Container;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.SwingVetoableValueDecorator;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;

/**
 * @since 3.3
 * 
 */
public class JTextComponentTextProperty extends WidgetStringValueProperty<TextType, JTextComponent> {
	/**
	 * 
	 */
	public JTextComponentTextProperty() {
		this(null);
	}

	/**
	 * @param events
	 */
	public JTextComponentTextProperty(TextType[] events) {
		super(checkEvents(events), staleEvents(events));
	}

	private static TextType[] checkEvents(TextType[] events) {
		if (events != null)
			for (int i = 0; i < events.length; i++)
				checkEvent(events[i]);
		return events;
	}

	private static void checkEvent(TextType event) {
		if (event == null)
			throw new IllegalArgumentException("UpdateEventType [" //$NON-NLS-1$
					+ event + "] is not supported."); //$NON-NLS-1$
	}

	private static TextType[] staleEvents(TextType[] changeEvents) {
		if (changeEvents != null)
			for (int i = 0; i < changeEvents.length; i++)
				if (changeEvents[i] == TextType.Modify)
					return null;
		return new TextType[] { TextType.Modify };
	}

	String doGetStringValue(Object source) {
		return ((JTextComponent) source).getText();
	}

	void doSetStringValue(Object source, String value) {
		((JTextComponent) source).setText(value == null ? "" : value); //$NON-NLS-1$
	}

	public String toString() {
		return "Text.text <String>"; //$NON-NLS-1$
	}

	protected ISwingObservableValue wrapObservable(IObservableValue observable,
			Container widget) {
		JTextComponent component = (JTextComponent) widget;
		
		return new SwingVetoableValueDecorator(widget, this, observable) {
			
			@Override
			protected IDelegateRegistration registerEventDelegate(Delegate delegate) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

	@Override
	protected IDelegateRegistration registerDelegate(final TextType type,
			final JTextComponent widget, final WidgetListener.Delegate delegate) {
		switch (type) {
		case Modify:
			final DocumentListener listener = new DocumentListener() {
				public void changedUpdate(DocumentEvent documentevent) {
					//FIXME Why not update here?
				}

				public void insertUpdate(DocumentEvent documentevent) {
					delegate.handle(type, widget);
				}

				public void removeUpdate(DocumentEvent documentevent) {
					delegate.handle(type, widget);
				}
			};
			widget.getDocument().addDocumentListener(listener);
			return new IDelegateRegistration() {
				
				public void dispose() {
					widget.getDocument().removeDocumentListener(listener);
				}
			};
		case FocusOut:
			final FocusListener l = new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					delegate.handle(type, widget);
				}
			};
			widget.addFocusListener(l);
			return new IDelegateRegistration() {
				
				public void dispose() {
					widget.removeFocusListener(l);
				}
			};
//		case DefaultSelection:
//			break;
		default:
			throw new IllegalArgumentException("Unsupported type '"+type+"'");
		}
		
	}
}
