package org.eclipse.ufacekit.ui.jfx.databinding;

public class JFXUIProperties {
	public static IJFXBeanValueProperty singleListViewSelection() {
		return JFXBeanProperties.value("selectionModel.selectedItem");
	}
}
