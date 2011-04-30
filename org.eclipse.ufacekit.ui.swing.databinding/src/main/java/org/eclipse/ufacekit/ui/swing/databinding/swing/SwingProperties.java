package org.eclipse.ufacekit.ui.swing.databinding.swing;

import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.EventType;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.ComponentEnabledProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.JFrameTitleProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.JSliderValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetEditableProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetSelectionProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetSingleSelectionIndexProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetSingleSelectionValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetTextProperty;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.properties.WidgetTextWithEventsProperty;

public class SwingProperties {
	public enum TextType implements EventType {
		None {
			public boolean isNone() {
				return true;
			}
		},
		Modify,
		FocusOut
//		DefaultSelection
		;
		
		public boolean isNone() {
			return false;
		}
	}
	
	public static IWidgetValueProperty text(final TextType event) {
		return text(new TextType[] { event });
	}
	
	public static IWidgetValueProperty text(TextType[] events) {
		return new WidgetTextWithEventsProperty(events);
	}
	
	public static IWidgetValueProperty text() {
		return new WidgetTextProperty();
	}
	
	public static IWidgetValueProperty title() {
		return new JFrameTitleProperty();
	}
	
	public static IWidgetValueProperty enabled() {
		return new ComponentEnabledProperty();
	}
	
	public static IWidgetValueProperty selection() {
		return new WidgetSelectionProperty();
	}
	
	public static IWidgetValueProperty editable() {
		return new WidgetEditableProperty();
	}
	
	public static IWidgetValueProperty singleSelectionIndex() {
		return new WidgetSingleSelectionIndexProperty();
	}
	
	public static IWidgetValueProperty singleSelectionValue() {
		return new WidgetSingleSelectionValueProperty();
	}
	
	public static IWidgetValueProperty value() {
		return new JSliderValueProperty();
	}
}
