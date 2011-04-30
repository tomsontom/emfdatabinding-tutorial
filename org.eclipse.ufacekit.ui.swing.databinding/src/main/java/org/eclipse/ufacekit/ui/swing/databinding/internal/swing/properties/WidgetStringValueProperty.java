package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.Container;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;

/**
 * @since 3.3
 * 
 */
public abstract class WidgetStringValueProperty<T extends EventType,W extends Container> extends WidgetValueProperty<T,W> {
	WidgetStringValueProperty() {
		super();
	}

	WidgetStringValueProperty(T event) {
		super(event);
	}

	WidgetStringValueProperty(T[] events) {
		super(events);
	}

	WidgetStringValueProperty(T[] events, T[] staleEvents) {
		super(events, staleEvents);
	}

	public Object getValueType() {
		return String.class;
	}

	protected Object doGetValue(Object source) {
		return doGetStringValue(source);
	}

	protected void doSetValue(Object source, Object value) {
		doSetStringValue(source, (String) value);
	}

	abstract String doGetStringValue(Object source);

	abstract void doSetStringValue(Object source, String value);
}
