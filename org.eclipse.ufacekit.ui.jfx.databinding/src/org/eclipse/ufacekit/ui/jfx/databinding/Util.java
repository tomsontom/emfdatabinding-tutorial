package org.eclipse.ufacekit.ui.jfx.databinding;

import java.util.ArrayList;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;

import com.sun.javafx.collections.ObservableListWrapper;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Util {
	public static <E> ObservableList<E> create(IObservableList dbList) {
		final ObservableList<E> list = new ObservableListWrapper<E>(new ArrayList<E>(dbList));
		final boolean[] sync = new boolean[1];
		dbList.addListChangeListener(new IListChangeListener() {
			
			@Override
			public void handleListChange(ListChangeEvent event) {
				if( sync[0] ) {
					try {
						sync[0] = false;
						event.diff.applyTo(list);	
					} finally {
						sync[0] = true;
					}
				}
			}
		});
		
		list.addListener(new ListChangeListener<E>() {

			@Override
			public void onChanged(
					javafx.collections.ListChangeListener.Change<? extends E> arg0) {
				if( sync[0] ) {
					System.err.println("This is not yet implemented");
				}
			}
			
		});
		
		return list;
	}
}
