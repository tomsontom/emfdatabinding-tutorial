package org.eclipse.ufacekit.ui.swing.databinding.internal.swing;

import java.awt.Container;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.DecoratingVetoableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.Assert;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetStringValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;

/**
 * @since 3.3
 * 
 */
public abstract class SwingVetoableValueDecorator extends DecoratingVetoableValue
		implements ISwingObservableValue {
	private Container widget;
	private WidgetStringValueProperty property;

	public static interface Delegate {
		public boolean handle(Object widget, String text, int start, int end);
	}
	
	private Delegate delegate = new Delegate() {
		public boolean handle(Object widget, String text, int start, int end) {
			String currentText = (String) property.getValue(widget);
			String newText = currentText.substring(0, start) + text
					+ currentText.substring(end);
			if (!fireValueChanging(Diffs.createValueDiff(currentText, newText))) {
				return false;
			}
			return true;
		}
	};
	
	private IDelegateRegistration registration;

//	private Listener disposeListener = new Listener() {
//		public void handleEvent(Event event) {
//			SwingVetoableValueDecorator.this.dispose();
//		}
//	};

	/**
	 * @param widget
	 * @param property
	 * @param decorated
	 */
	public SwingVetoableValueDecorator(Container widget,
			WidgetStringValueProperty property, IObservableValue decorated) {
		super(decorated, true);
		this.property = property;
		this.widget = widget;
		Assert
				.isTrue(decorated.getValueType().equals(String.class),
						"SWTVetoableValueDecorator can only decorate observable values of String value type"); //$NON-NLS-1$
//		WidgetListenerUtil.asyncAddListener(widget, SWT.Dispose,
//				disposeListener);
	}

	protected void firstListenerAdded() {
		super.firstListenerAdded();
		registration = registerEventDelegate(delegate);
	}

	protected void lastListenerRemoved() {
		if( registration != null ) {
			registration.dispose();
			registration = null;
		}
		super.lastListenerRemoved();
	}

	public synchronized void dispose() {
		if( registration != null ) {
			registration.dispose();
			registration = null;
		}
//		WidgetListenerUtil.asyncRemoveListener(widget, SWT.Dispose,
//				disposeListener);
		this.widget = null;
		super.dispose();
	}
	
	protected abstract IDelegateRegistration registerEventDelegate(Delegate delegate);

	public Container getContainer() {
		return widget;
	}
}
