package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Container;

import org.eclipse.core.databinding.observable.value.DecoratingObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;

/**
 * @since 3.3
 * 
 */
public class SwingObservableValueDecorator extends DecoratingObservableValue
		implements ISwingObservableValue {
	private Container widget;

	/**
	 * @param decorated
	 * @param widget
	 */
	public SwingObservableValueDecorator(IObservableValue decorated, Container widget) {
		super(decorated, true);
		this.widget = widget;
//		FIXME Can we findout if widget is disposed in Swing
//		WidgetListenerUtil.asyncAddListener(widget, SWT.Dispose, this);
	}

//	public void handleEvent(Event event) {
//		if (event.type == SWT.Dispose)
//			dispose();
//	}

	public synchronized void dispose() {
//		if (widget != null) {
//			WidgetListenerUtil.asyncRemoveListener(widget, SWT.Dispose, this);
//			widget = null;
//		}
		super.dispose();
	}

	public Container getContainer() {
		return widget;
	}
}
