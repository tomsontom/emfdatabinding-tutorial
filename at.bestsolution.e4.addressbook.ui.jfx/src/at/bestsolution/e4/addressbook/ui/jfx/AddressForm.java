package at.bestsolution.e4.addressbook.ui.jfx;

import at.bestsolution.e4.addressbook.model.addressbook.Country;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class AddressForm extends GridPane {
	public AddressForm() {
		{
			Label l = new Label("Street");
			add(l,0,0);
			
			TextBox street = new TextBox();
			GridPane.setHgrow(street, Priority.ALWAYS);
			GridPane.setColumnSpan(street, 2);
			add(street,1,0);
		}
		
		{
			Label l = new Label("ZIP/City");
			add(l,0,1);
			
			TextBox zip = new TextBox();
			add(zip,1,1);
			
			TextBox city = new TextBox();
			GridPane.setHgrow(city, Priority.ALWAYS);
			add(city,2,1);
		}
		
		{
			Label l = new Label("Country");
			add(l,0,2);
			
			ChoiceBox<Country> country = new ChoiceBox<Country>();
			GridPane.setHgrow(country, Priority.ALWAYS);
			GridPane.setColumnSpan(country, 2);
			add(country,1,2);
		}
		
		{
			Label l = new Label("Federalstate");
			add(l,0,3);
			
			ChoiceBox<Country> federalState = new ChoiceBox<Country>();
			GridPane.setHgrow(federalState, Priority.ALWAYS);
			GridPane.setColumnSpan(federalState, 2);
			add(federalState,1,3);
		}
	}
}
