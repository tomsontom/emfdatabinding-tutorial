package org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.ufacekit.ui.swing.custom.JTabbedPanePage;
//import org.eclipse.swt.custom.CCombo;
//import org.eclipse.swt.custom.CLabel;
//import org.eclipse.swt.custom.StyledText;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Combo;
//import org.eclipse.swt.widgets.Item;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.Link;
//import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Text;

/**
 * @since 3.3
 * 
 */
public class WidgetTextProperty extends WidgetDelegatingValueProperty {
	private IValueProperty button;
	private IValueProperty combo;
	private IValueProperty label;
	private IValueProperty link;
	private IValueProperty text;
	private IValueProperty tabbedPanePage;

	/**
	 * 
	 */
	public WidgetTextProperty() {
		super(String.class);
	}

	protected IValueProperty doGetDelegate(Object source) {
		if (source instanceof JButton) {
			if (button == null)
				button = new JButtonTextProperty();
			return button;
		}
		
		if (source instanceof JLabel) {
			if (label == null)
				label = new JLabelTextProperty();
			return label;
		}
		
		if(source instanceof JTabbedPanePage) {
			if(tabbedPanePage == null)
				tabbedPanePage = new JTabbedPanePageTextProperty();
			return tabbedPanePage;
		}
		
		if (source instanceof JComboBox) {
			if (combo == null)
				combo = new JComboBoxTextProperty();
			return combo;
		}
		if (source instanceof JTextComponent) {
			if (text == null)
				text = new JTextComponentTextProperty();
			return text;
		}
		throw notSupported(source);
	}
}