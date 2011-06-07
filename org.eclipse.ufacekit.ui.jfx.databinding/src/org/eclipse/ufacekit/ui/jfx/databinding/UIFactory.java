package org.eclipse.ufacekit.ui.jfx.databinding;

import java.text.MessageFormat;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.controls.ChoiceBoxViewer;
import org.eclipse.ufacekit.ui.jfx.databinding.controls.ChoiceBoxViewer.LabelConverter;

public class UIFactory {
	public static <T> ChoiceBoxViewer<T> createChoiceBox(final String template, final IValueProperty... properties) {
		ChoiceBoxViewer<T> viewer = new ChoiceBoxViewer<T>();
		viewer.setLabelConverter(new LabelConverter<T>() {

			@Override
			public String getLabel(T object) {
				Object[] data = new Object[properties.length];
				int i = 0;
				for( IValueProperty p : properties ) {
					data[i] = p.getValue(object);
				}
				return MessageFormat.format(template, data);
			}
		});
		return viewer;
	}
	
	public static <T> ListView<T> createListView(final IValueProperty[] properties, final String template) {
		ListView<T> listView = new ListView<T>();
		listView.setCellFactory(new Callback<ListView<T>, ListCell<T>>() {
			
			@Override
			public ListCell<T> call(ListView<T> arg0) {
				ListCell<T> cell = new ListCell<T>();
				final Label l = new Label();
				cell.setNode(l);
				
				final IObservableValue v = JFXBeanProperties.value("item").observe(cell);
				
				IValueChangeListener listener = new IValueChangeListener() {
					
					@Override
					public void handleValueChange(ValueChangeEvent event) {
						Object[] values = new Object[properties.length];
						for( int i = 0; i < properties.length; i++ ) {
							@SuppressWarnings("unchecked")
							T o = (T) v.getValue();
							if( o == null ) {
								l.setText("");
								return;
							}
							values[i] = properties[i].getValue(o);
						}
						
						l.setText(MessageFormat.format(template, values));
					}
				};
				
				for( IValueProperty p : properties ) {
					p.observeDetail(v).addValueChangeListener(listener);
				}
				
				return cell;
			}
		});
		
		return listView;
	}
}
