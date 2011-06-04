package at.bestsolution.e4.addressbook.ui.jfx;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ufacekit.ui.jfx.databinding.JFXBeanProperties;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

@SuppressWarnings("restriction")
public class PersonForm {
	private WritableValue master;

	private TextBox w_firstName;

	private TextBox w_lastName;

	private AddressForm privateAddressForm;

	private CheckBox w_hasBusinessAddress;

	private AddressForm businessAddress;

	private GridPane rootPane;

	private FadeTransition fadeOutTransition;
	
	private FadeTransition fadeInTransition;

	@Inject
	public PersonForm(BorderPane parent) {
		rootPane = new GridPane();
		
		fadeOutTransition = new FadeTransition(Duration.valueOf(1000), rootPane);
        fadeOutTransition.setFromValue(1.0f);
        fadeOutTransition.setToValue(0.2f);
        fadeOutTransition.setAutoReverse(true);
        
        fadeInTransition = new FadeTransition(Duration.valueOf(1000), rootPane);
        fadeInTransition.setFromValue(0.2f);
        fadeInTransition.setToValue(1.0f);
        fadeInTransition.setAutoReverse(true);

		{
			Label l = new Label("Firstname");
			rootPane.add(l, 0, 0);

			w_firstName = new TextBox();
			GridPane.setHgrow(w_firstName, Priority.ALWAYS);
			rootPane.add(w_firstName, 1, 0);

		}
		
		{
			Label l = new Label("Lastname");
			rootPane.add(l, 0, 1);

			w_lastName = new TextBox();
			GridPane.setHgrow(w_lastName, Priority.ALWAYS);
			rootPane.add(w_lastName, 1, 1);
		}
		
		{
			VBox box = new VBox();
			
			privateAddressForm = new AddressForm();
			privateAddressForm.setId("address-private");
			box.getChildren().add(privateAddressForm);
			
			GridPane.setColumnSpan(box, 2);
			GridPane.setHgrow(box, Priority.ALWAYS);
			
			rootPane.add(box, 0, 2);	
		}
		
		{
			VBox box = new VBox();
			
			w_hasBusinessAddress = new CheckBox();
			box.getChildren().add(w_hasBusinessAddress);
			
			businessAddress = new AddressForm();
			businessAddress.setId("address-business");
			box.getChildren().add(businessAddress);
			
			GridPane.setColumnSpan(box, 2);
			GridPane.setHgrow(box, Priority.ALWAYS);
			
			rootPane.add(box, 0, 3);	
		}
		
		parent.setCenter(rootPane);
	}

	@PostConstruct
	private void init(@Optional EditingDomain editingDomain, AddressBook book,
			@Optional Person person) {
		master = new WritableValue();
		
		if (editingDomain == null) {
			bindControls();
		} else {
			bindControls(editingDomain);
		}

		master.setValue(person);
	}

	private void bindControls() {
		EMFDataBindingContext dbc = new EMFDataBindingContext();

		IValueProperty tProp = JFXBeanProperties.value("text");

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.PERSON__FIRSTNAME);
			dbc.bindValue(tProp.observe(w_firstName),
					mProp.observeDetail(master));
		}
		
		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.PERSON__LASTNAME);
			dbc.bindValue(tProp.observe(w_lastName),
					mProp.observeDetail(master));
		}
	}
	
	private void bindControls(EditingDomain editingDomain) {
		
	}

	@Inject
	void setPerson(@Optional final Person person) {
		if (master != null) {
			fadeOutTransition.setOnFinished(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					master.setValue(person);
					fadeOutTransition.setOnFinished(null);
					fadeInTransition.playFromStart();
				}
			});
			
			fadeOutTransition.playFromStart();
		}
	}
}