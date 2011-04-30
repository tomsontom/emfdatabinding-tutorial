package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;

/**
 * @since 3.3
 * 
 */
public class WidgetTextWithEventsProperty extends WidgetDelegatingValueProperty {
	private final TextType[] events;

//	private IValueProperty styledText;
	private IValueProperty text;

	/**
	 * @param events
	 */
	public WidgetTextWithEventsProperty(TextType[] events) {
		super(String.class);
		this.events = checkEvents(events);
	}

	private static TextType[] checkEvents(TextType[] events) {
		for (int i = 0; i < events.length; i++)
			checkEvent(events[i]);
		return events;
	}

	private static void checkEvent(TextType event) {
		if (event == null)
			throw new IllegalArgumentException("UpdateEventType [" //$NON-NLS-1$
					+ event + "] is not supported."); //$NON-NLS-1$
	}

	protected IValueProperty doGetDelegate(Object source) {
//		if (source instanceof StyledText) {
//			if (styledText == null)
//				styledText = new StyledTextTextProperty(events);
//			return styledText;
//		}
		if (source instanceof JTextComponent) {
			if (text == null)
				text = new JTextComponentTextProperty(events);
			return text;
		}
		throw notSupported(source);
	}
}