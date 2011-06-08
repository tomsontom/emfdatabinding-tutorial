package at.bestsolution.e4.addressbook.ui.jfx;

import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ufacekit.ui.jfx.databinding.IJFXBeanValueProperty;
import org.eclipse.ufacekit.ui.jfx.databinding.JFXBeanProperties;
import org.eclipse.ufacekit.ui.jfx.databinding.UIFactory;
import org.eclipse.ufacekit.ui.jfx.databinding.Util;
import org.eclipse.ufacekit.ui.jfx.databinding.controls.ChoiceBoxViewer;
import org.eclipse.ufacekit.ui.jfx.databinding.controls.ChoiceBoxViewer.StringWrapper;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Country;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;

public class AddressForm extends GridPane {
	private TextBox w_zip;
	private TextBox w_city;
	private TextBox w_street;
	private ChoiceBoxViewer<Country> w_country;
	
	private Binding stateBinding;
	private ChoiceBoxViewer<FederalState> w_federalState;
	private DataBindingContext dbc;
	private IObservableValue master;
	private EditingDomain editingDomain;

	public AddressForm() {
		{
			Label l = new Label("Street");
			l.getStyleClass().add("detail-label");
			add(l,0,0);
			
			w_street = new TextBox();
			GridPane.setHgrow(w_street, Priority.ALWAYS);
			GridPane.setColumnSpan(w_street, 2);
			add(w_street,1,0);
		}
		
		{
			Label l = new Label("ZIP/City");
			l.getStyleClass().add("detail-label");
			add(l,0,1);
			
			w_zip = new TextBox();
			add(w_zip,1,1);
			
			w_city = new TextBox();
			GridPane.setHgrow(w_city, Priority.ALWAYS);
			add(w_city,2,1);
		}
		
		{
			Label l = new Label("Country");
			l.getStyleClass().add("detail-label");
			add(l,0,2);
			
			w_country = UIFactory.createChoiceBox("{0}", EMFProperties.values(AddressbookPackage.Literals.COUNTRY__NAME));
			ChoiceBox<StringWrapper<Country>> country = w_country.getChoiceBox();
			GridPane.setHgrow(country, Priority.ALWAYS);
			GridPane.setColumnSpan(country, 2);
			add(country,1,2);
		}
		
		{
			Label l = new Label("Federalstate");
			l.getStyleClass().add("detail-label");
			add(l,0,3);
			
			w_federalState = UIFactory.createChoiceBox("{0}", EMFProperties.values(AddressbookPackage.Literals.FEDERAL_STATE__NAME));
			ChoiceBox<StringWrapper<FederalState>> federalState = w_federalState.getChoiceBox();
			GridPane.setHgrow(federalState, Priority.ALWAYS);
			GridPane.setColumnSpan(federalState, 2);
			add(federalState,1,3);
		}
	}
	
	public void init(AddressBook book) {
		{
			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.ADDRESS_BOOK__COUNTRIES);
			
			ObservableList<Country> list = Util.create(mProp.observe(book));
			w_country.setItems(list);
		}
		
		{
			IJFXBeanValueProperty p = JFXBeanProperties.value("selectedItem");
			IObservableValue value = p.observe(w_country);
			value.addValueChangeListener(new IValueChangeListener() {

				@Override
				public void handleValueChange(ValueChangeEvent event) {
					if (stateBinding != null) {
						stateBinding.dispose();
						stateBinding = null;
					}
				}
			});

			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.COUNTRY__FEDERAL_STATES);
			
			ObservableList<FederalState> list = Util.create(mProp.observeDetail(value));
			w_federalState.setItems(list);
			
			value.addValueChangeListener(new IValueChangeListener() {

				@Override
				public void handleValueChange(ValueChangeEvent event) {
					if (stateBinding == null && dbc != null && master != null) {
						bindState(dbc, master);
					}
				}
			});
		}
	}
	
	private static final EMFUpdateValueStrategy createNullToEmptyString() {
		return (EMFUpdateValueStrategy) new EMFUpdateValueStrategy().setConverter(new Converter(String.class,String.class) {
			
			@Override
			public Object convert(Object fromObject) {
				return fromObject == null ? "" : fromObject;
			}
		});
	}
	
	private static final EMFUpdateValueStrategy createEmptyStringToNull() {
		return (EMFUpdateValueStrategy) new EMFUpdateValueStrategy().setConverter(new Converter(String.class,String.class) {
			
			@Override
			public Object convert(Object fromObject) {
				return "".equals(fromObject) ? null : fromObject;
			}
		});
	}
	
	public void bindControls(DataBindingContext dbc, IObservableValue master) {
		this.dbc = dbc;
		this.master = master;
		
		IJFXBeanValueProperty tProp = JFXBeanProperties.value("text");
		IJFXBeanValueProperty sProp = JFXBeanProperties.value("selectedItem");
		
		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__STREET);
			dbc.bindValue(tProp.observe(w_street), mProp.observeDetail(master), createEmptyStringToNull(), createNullToEmptyString());
		}

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__ZIP);
			dbc.bindValue(tProp.observe(w_zip), mProp.observeDetail(master), createEmptyStringToNull(), createNullToEmptyString());
		}

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__CITY);
			dbc.bindValue(tProp.observe(w_city), mProp.observeDetail(master), createEmptyStringToNull(), createNullToEmptyString());
		}
		
		{
			IEMFValueProperty mProp = EMFProperties.value(FeaturePath
					.fromList(AddressbookPackage.Literals.ADDRESS__COUNTRY));
			dbc.bindValue(sProp.observe(w_country), mProp.observeDetail(master));
		}
		
		bindState(dbc, master);
	}
	
	private void bindState(DataBindingContext dbc, IObservableValue master) {
		IJFXBeanValueProperty sProp = JFXBeanProperties.value("selectedItem");
		IEMFValueProperty prop;

		if (editingDomain == null) {
			prop = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);

		} else {
			prop = EMFEditProperties.value(editingDomain,
					AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);

		}
		stateBinding = dbc.bindValue(sProp.observe(w_federalState),
				prop.observeDetail(master));
	}
}
