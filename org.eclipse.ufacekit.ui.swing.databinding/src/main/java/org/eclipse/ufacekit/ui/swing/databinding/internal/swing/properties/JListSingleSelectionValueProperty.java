package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

public class JListSingleSelectionValueProperty extends WidgetValueProperty<JListSingleSelectionValueProperty.SelectionTypes, JList> {
	public enum SelectionTypes implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}
	
	public JListSingleSelectionValueProperty() {
		super(SelectionTypes.Selection);
	}

	public Object getValueType() {
		return null;
	}

	@Override
	protected IDelegateRegistration registerDelegate(final SelectionTypes type, final JList widget, final Delegate delegate) {
		final ListSelectionListener l = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				delegate.handle(type, widget);				
			}
		};
		widget.addListSelectionListener(l);
		return new IDelegateRegistration() {

			public void dispose() {
				widget.removeListSelectionListener(l);
			}
		};
	}

	@Override
	protected Object doGetValue(Object source) {
		return ((JList)source).getSelectedValue();
	}

	@Override
	protected void doSetValue(Object source, Object value) {
		JList box = (JList) source;
		box.setSelectedValue(value, true);
	}
}
