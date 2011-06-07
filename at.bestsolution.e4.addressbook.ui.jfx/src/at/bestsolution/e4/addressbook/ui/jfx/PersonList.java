package at.bestsolution.e4.addressbook.ui.jfx;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.JFXUIProperties;
import org.eclipse.ufacekit.ui.jfx.databinding.UIFactory;
import org.eclipse.ufacekit.ui.jfx.databinding.Util;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;
import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

public class PersonList {
	private ListView<Person> listView;
	
	@Inject
	public PersonList(BorderPane pane) {
		IValueProperty[] props = {
				EMFProperties
						.value(AddressbookPackage.Literals.PERSON__FIRSTNAME),
				EMFProperties
						.value(AddressbookPackage.Literals.PERSON__LASTNAME) };
		
		listView = UIFactory.createListView(props, "{0}, {1}");
		listView.setId("detail-list");
		
		pane.setCenter(listView);
	}

	@PostConstruct
	void init(AddressBook book, final PersonSelectionPublisher personService) {
		IEMFListProperty mProp = EMFProperties
				.list(AddressbookPackage.Literals.ADDRESS_BOOK__PERSONS);

		final IObservableList list = mProp.observe(book);
		ObservableList<Person> l = Util.create(list);
		listView.setItems(l);
		
		JFXUIProperties.singleListViewSelection().observe(listView).addValueChangeListener(new IValueChangeListener() {
			
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				personService.setPerson((Person) event.diff.getNewValue());
			}
		});
	}
}