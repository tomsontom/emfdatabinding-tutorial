package org.eclipse.ufacekit.ui.jfx.databinding.controls;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SingleSelectionModel;

public class ChoiceBoxViewer<T> {
	public interface LabelConverter<T> {
		public String getLabel(T label);
	}
	
	public static class StringWrapper<T> {
		private final T domainObject;
		private final ChoiceBoxViewer<T> viewer;
		
		public StringWrapper(ChoiceBoxViewer<T> viewer, T domainObject) {
			this.viewer = viewer;
			this.domainObject = domainObject;
		}
		
		public String toString() {
			return viewer.getLabel(domainObject);
		}
		
		@Override
		public boolean equals(Object obj) {
			@SuppressWarnings("unchecked")
			StringWrapper<T> o = (StringWrapper<T>) obj;
			if( o != null ) {
				return o.domainObject.equals(domainObject);
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return domainObject.hashCode();
		}
	}
	
	private ChoiceBox<StringWrapper<T>> box;
	private LabelConverter<T> labelConverter;
	private ObservableList<T> list;
	private ListChangeListener<T> changeListener = new ListChangeListener<T>() {

		@Override
		public void onChanged(
				javafx.collections.ListChangeListener.Change<? extends T> arg0) {
			ChoiceBoxViewer.this.handleChange(arg0);
		}
		
	};
	
	private ObjectProperty<T> selectedItem = new ObjectProperty<T>();
	
	public ChoiceBoxViewer() {
		this.box = new ChoiceBox<StringWrapper<T>>();
		
		this.box.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<StringWrapper<T>>() {

			@Override
			public void changed(
					ObservableValue<? extends StringWrapper<T>> arg0,
					StringWrapper<T> arg1, StringWrapper<T> arg2) {
				if( arg2 == null ) {
					selectedItem.setValue(null);
				} else {
					selectedItem.setValue(arg2.domainObject);
				}
			}
		});
	}
	
	public T getSelectedItem() {
		return selectedItem.get();
	}
	
	public void setSelectedItem(T selectedItem) {
		this.selectedItem.set(selectedItem);
		
		if( selectedItem != null ) {
			this.box.getSelectionModel().select(new StringWrapper<T>(this, selectedItem));
		} else {
			this.box.getSelectionModel().clearSelection();
		}
			
	}
	
	public ObjectProperty<T> selectedItemProperty() {
		return selectedItem;
	}
	
	public ChoiceBox<StringWrapper<T>> getChoiceBox() {
		return box;
	}
	
	public void setLabelConverter(LabelConverter<T> labelConverter) {
		this.labelConverter = labelConverter;
	}
	
	public void setItems(ObservableList<T> list) {
		if( this.list != null ) {
			this.list.removeListener(changeListener);
		}
		
		this.list = list;
		this.list.addListener(changeListener);
		
		List<StringWrapper<T>> l = new ArrayList<StringWrapper<T>>(list.size());

		for( T t : list ) {
			l.add(new StringWrapper<T>(this,t));
		}
		
		box.getItems().setAll(l);
	}
	
	private void handleChange(javafx.collections.ListChangeListener.Change<? extends T> change)  {
		List<StringWrapper<T>> list = new ArrayList<StringWrapper<T>>();
		
		for( T t : change.getRemoved() ) {
			list.add(new StringWrapper<T>(this,t));
		}
		
		box.getItems().removeAll(list);
		
		list.clear();
		
		for( T t : change.getAddedSubList() ) {
			list.add(new StringWrapper<T>(this,t));
		}
		
		box.getItems().addAll(list);
		
	}
	
	private String getLabel(T item) {
		if( labelConverter == null ) {
			return item.toString();
		} else {
			return labelConverter.getLabel(item);
		}
	}
}
