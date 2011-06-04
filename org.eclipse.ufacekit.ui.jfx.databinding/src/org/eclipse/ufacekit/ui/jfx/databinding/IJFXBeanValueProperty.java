package org.eclipse.ufacekit.ui.jfx.databinding;

import org.eclipse.core.databinding.property.value.IValueProperty;

public interface IJFXBeanValueProperty extends IJFXBeanProperty, IValueProperty {
	public IJFXBeanValueProperty value(String propertyName);

	public IJFXBeanValueProperty value(String propertyName, Class<?> valueType);

	public IJFXBeanValueProperty value(IJFXBeanValueProperty property);
}
