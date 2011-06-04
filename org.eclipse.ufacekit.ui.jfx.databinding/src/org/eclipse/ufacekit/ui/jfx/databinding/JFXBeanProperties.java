package org.eclipse.ufacekit.ui.jfx.databinding;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.internal.AnonymousFXBeanValueProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.internal.FXBeanPropertyHelper;
import org.eclipse.ufacekit.ui.jfx.databinding.internal.FXBeanValueProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.internal.FXBeanValuePropertyDecorator;

import javafx.beans.property.Property;


public class JFXBeanProperties {
	public static IJFXBeanValueProperty value(String propertyName) {
		return value(null, propertyName, null);
	}
	
	public static IJFXBeanValueProperty value(String propertyName, Class valueType) {
		return value(null, propertyName, valueType);
	}
	
	public static IJFXBeanValueProperty value(Class beanClass,
			String propertyName, Class valueType) {
		String[] propertyNames = split(propertyName);
		if (propertyNames.length > 1)
			valueType = null;

		PropertyDescriptor propertyDescriptor;
		IValueProperty property;
		if (beanClass == null) {
			propertyDescriptor = null;
			property = new AnonymousFXBeanValueProperty(propertyNames[0],
					valueType);
		} else {
			propertyDescriptor = FXBeanPropertyHelper.getPropertyDescriptor(
					beanClass, propertyNames[0]);
			property = new FXBeanValueProperty(propertyDescriptor, valueType);
		}

		IJFXBeanValueProperty beanProperty = new FXBeanValuePropertyDecorator(
				property, propertyDescriptor);
		for (int i = 1; i < propertyNames.length; i++) {
			beanProperty = beanProperty.value(propertyNames[i]);
		}
		return beanProperty;
	}
	
	private static String[] split(String propertyName) {
		if (propertyName.indexOf('.') == -1)
			return new String[] { propertyName };
		List<String> propertyNames = new ArrayList<String>();
		int index;
		while ((index = propertyName.indexOf('.')) != -1) {
			propertyNames.add(propertyName.substring(0, index));
			propertyName = propertyName.substring(index + 1);
		}
		propertyNames.add(propertyName);
		return (String[]) propertyNames
				.toArray(new String[propertyNames.size()]);
	}
}
