package org.eclipse.ufacekit.ui.jfx.databinding;

import java.beans.PropertyDescriptor;

import org.eclipse.core.databinding.property.IProperty;

public interface IFXBeanProperty extends IProperty {
	public PropertyDescriptor getPropertyDescriptor();
}
