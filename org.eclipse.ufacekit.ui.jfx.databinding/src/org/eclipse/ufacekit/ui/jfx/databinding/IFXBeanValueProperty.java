package org.eclipse.ufacekit.ui.jfx.databinding;

import org.eclipse.core.databinding.property.value.IValueProperty;

public interface IFXBeanValueProperty extends IFXBeanProperty, IValueProperty {
	public IFXBeanValueProperty value(String propertyName);

	public IFXBeanValueProperty value(String propertyName, Class<?> valueType);

	public IFXBeanValueProperty value(IFXBeanValueProperty property);
}
