package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.IDelegateRegistration;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetValueProperty.WidgetListener.Delegate;

public class JComboBoxSingleSelectionValueProperty extends WidgetValueProperty<JComboBoxSingleSelectionValueProperty.SelectionTypes, JComboBox> {
	public enum SelectionTypes implements EventType {
		Selection;

		public boolean isNone() {
			return false;
		}
	}
	
	public JComboBoxSingleSelectionValueProperty() {
		super(SelectionTypes.Selection);
	}

	public Object getValueType() {
		return null;
	}

	@Override
	protected IDelegateRegistration registerDelegate(final SelectionTypes type, final JComboBox widget, final Delegate delegate) {
		final ItemListener l = new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				delegate.handle(type, widget);
			}
		};
		widget.addItemListener(l);
		return new IDelegateRegistration() {

			public void dispose() {
				widget.removeItemListener(l);
			}
		};
	}

	@Override
	protected Object doGetValue(Object source) {
		return ((JComboBox)source).getSelectedItem();
	}

	@Override
	protected void doSetValue(Object source, Object value) {
		JComboBox box = (JComboBox) source;
		box.setSelectedItem(value);
		box.updateUI(); //FIXME Is this really needed?
	}
}
