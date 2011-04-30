package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Container;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IVetoableValue;
import org.eclipse.core.databinding.observable.value.ValueChangingEvent;

/**
 * {@link IObservableValue} implementation that wraps an
 * {@link IObservableValue} and delays notification of value change events from
 * the wrapped observable value until a certain time has passed since the last
 * change event, or until a FocusOut event is received from the underlying
 * widget, if any (whichever happens earlier). This class helps to delay
 * validation until the user stops typing. To notify about pending changes, a
 * delayed observable value will fire a stale event when the wrapped observable
 * value fires a change event, but this change is being delayed.
 * 
 * Note that this class will not forward {@link ValueChangingEvent} events from
 * a wrapped {@link IVetoableValue}.
 * 
 * @since 1.2
 */
public class SwingDelayedObservableValueDecorator extends
		SwingObservableValueDecorator {
	private Container control;
	private FocusListener listener = new FocusAdapter() {
		@Override
		public void focusLost(FocusEvent e) {
			if( isStale() ) {
				getValue();	
			}
		}
	};

	/**
	 * Constructs a new instance bound to the given
	 * <code>ISWTObservableValue</code> and configured to fire change events
	 * once there have been no value changes in the observable for
	 * <code>delay</code> milliseconds.
	 * 
	 * @param decorated
	 * @param widget
	 * @throws IllegalArgumentException
	 *             if <code>updateEventType</code> is an incorrect type.
	 */
	public SwingDelayedObservableValueDecorator(IObservableValue decorated,
			Container widget) {
		super(decorated, widget);
		this.control = widget;

		widget.addFocusListener(listener);
	}

	public synchronized void dispose() {
		if (control != null) {
			control.removeFocusListener(listener);
			listener = null;
			control = null;
		}
		super.dispose();
	}
}
