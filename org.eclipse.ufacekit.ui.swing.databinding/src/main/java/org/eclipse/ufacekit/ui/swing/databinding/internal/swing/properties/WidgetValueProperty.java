package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.IProperty;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.NativePropertyListener;
import org.eclipse.core.databinding.property.value.SimpleValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.SwingObservableValueDecorator;
import org.eclipse.ufacekit.ui.swing.databinding.swing.ISwingObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.IWidgetValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingObservables;

/**
 * Abstract value property implementation for {@link Widget} properties. This
 * class implements some basic behavior that widget properties are generally
 * expected to have, namely:
 * <ul>
 * <li>Calling {@link #observe(Object)} should create the observable on the
 * display realm of the widget, rather than the current default realm
 * <li>All <code>observe()</code> methods should return an
 * {@link ISWTObservableValue}
 * </ul>
 * This class also provides a default widget listener implementation using SWT's
 * {@link Listener untyped listener API}. Subclasses may pass one or more SWT
 * event type constants to the super constructor to indicate which events signal
 * a property change.
 * 
 * @since 1.3
 */
public abstract class WidgetValueProperty<T extends EventType,W extends Component> extends SimpleValueProperty implements
		IWidgetValueProperty {
	private T[] changeEvents;
	private T[] staleEvents;
	
	private Map<T,IDelegateRegistration> changeRegistrations = new HashMap<T, IDelegateRegistration>();
	private Map<T,IDelegateRegistration> staleRegistrations = new HashMap<T, IDelegateRegistration>();
	
	/**
	 * Constructs a WidgetValueProperty which does not listen for any SWT
	 * events.
	 */
	protected WidgetValueProperty() {
		this(null, null);
	}

	/**
	 * Constructs a WidgetValueProperty with the specified SWT event type
	 * 
	 * @param changeEvent
	 *            SWT event type constant of the event that signifies a property
	 *            change.
	 */
	protected WidgetValueProperty(T changeEvent) {
		this(toArray(changeEvent), null);
	}

	/**
	 * Constructs a WidgetValueProperty with the specified SWT event type(s).
	 * 
	 * @param changeEvents
	 *            array of SWT event type constants of the events that signify a
	 *            property change.
	 */
	protected WidgetValueProperty(T[] changeEvents) {
		this(changeEvents, null);
	}

	/**
	 * Constructs a WidgetValueProperty with the specified SWT event types.
	 * 
	 * @param changeEvents
	 *            array of SWT event type constants of the events that signify a
	 *            property change.
	 * @param staleEvents
	 *            array of SWT event type constants of the events that signify a
	 *            property became stale.
	 */
	public WidgetValueProperty(T[] changeEvents, T[] staleEvents) {
		this.changeEvents = changeEvents;
		this.staleEvents = staleEvents;
	}
	
	static <T> T[] toArray(T... vals) {
		return vals;
	}

	public INativePropertyListener adaptListener(
			ISimplePropertyListener listener) {
		return changeEvents == null && staleEvents == null ? null
				: new WidgetListener(this, listener);
	}

	protected class WidgetListener extends NativePropertyListener {
		public class Delegate {
			public void handle(EventType eventType, Container widget) {
				if (staleEvents != null)
					for (int i = 0; i < staleEvents.length; i++)
						if (eventType == staleEvents[i]) {
							fireStale(widget);
							break;
						}

				if (changeEvents != null)
					for (int i = 0; i < changeEvents.length; i++)
						if (eventType == changeEvents[i]) {
							fireChange(widget, null);
							break;
						}
			}
		}
		
		private Delegate delegate = new Delegate();
		
		protected WidgetListener(IProperty property,
				ISimplePropertyListener listener) {
			super(property, listener);
		}

		protected void doAddTo(Object source) {
			Container widget = (Container) source;
			if (changeEvents != null) {
				for (int i = 0; i < changeEvents.length; i++) {
					T event = changeEvents[i];
					if (! event.isNone()) {
						changeRegistrations.put(event, registerDelegate(event, (W) source, delegate));
					}
				}
			}
			if (staleEvents != null) {
				for (int i = 0; i < staleEvents.length; i++) {
					T event = staleEvents[i];
					if (! event.isNone()) {
						staleRegistrations.put(event, registerDelegate(event, (W) source, delegate));
					}
				}
			}
		}

		protected void doRemoveFrom(Object source) {
//			Container widget = (Container) source;
//			if (!widget.isDisposed()) {
				if (changeEvents != null) {
					for (int i = 0; i < changeEvents.length; i++) {
						T event = changeEvents[i];
						if (! event.isNone())
							changeRegistrations.remove(event).dispose();
					}
				}
				if (staleEvents != null) {
					for (int i = 0; i < staleEvents.length; i++) {
						T event = staleEvents[i];
						if (! event.isNone()) {
							staleRegistrations.remove(event).dispose();
						}
					}
				}
//			}
		}
	}

	public IObservableValue observe(Object source) {
		if (source instanceof Container) {
			return observe((Container) source);
		}
		return super.observe(source);
	}

	public IObservableValue observe(Realm realm, Object source) {
		return wrapObservable(super.observe(realm, source), (Container) source);
	}

	protected ISwingObservableValue wrapObservable(IObservableValue observable,
			Container widget) {
		return new SwingObservableValueDecorator(observable, widget);
	}

	public ISwingObservableValue observe(Container widget) {
		return (ISwingObservableValue) observe(SwingObservables.getRealm(), widget);
	}

	public ISwingObservableValue observeDelayed(int delay, Container widget) {
		return SwingObservables.observeDelayedValue(delay, observe(widget));
	}
	
	protected abstract IDelegateRegistration registerDelegate(T type, W widget, WidgetListener.Delegate delegate);
}
