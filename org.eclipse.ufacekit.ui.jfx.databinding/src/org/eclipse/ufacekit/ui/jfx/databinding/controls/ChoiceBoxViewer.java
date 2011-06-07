package org.eclipse.ufacekit.ui.jfx.databinding.controls;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

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
			return o.domainObject.equals(domainObject);
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
	
	private ObjectProperty<T> selectedItem;
	
	public ChoiceBoxViewer() {
		this.box = new ChoiceBox<StringWrapper<T>>();
	}
	
	public ChoiceBox<StringWrapper<T>> getChoiceBox() {
		return box;
	}
	
	public void setLabelConverter(LabelConverter<T> labelConverter) {
		this.labelConverter = labelConverter;
	}
	
	public void getSelectedItem() {
		
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
