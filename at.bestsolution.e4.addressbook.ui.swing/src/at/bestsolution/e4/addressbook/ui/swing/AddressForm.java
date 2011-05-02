/*******************************************************************************
 * Copyright (c) 2011, BestSolution.at and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - Initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.addressbook.ui.swing;

import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ufacekit.ui.swing.databinding.swing.IWidgetValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ILabelDelegate;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableComboBoxModel;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableListCellRender;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;

public class AddressForm extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField w_street;
	private JTextField w_zip;
	private JTextField w_city;
	private JComboBox w_state;
	private JComboBox w_country;

	private Binding stateBinding;
	private DataBindingContext dbc;
	private IObservableValue master;

	private EditingDomain editingDomain;

	/**
	 * Create the panel.
	 */
	public AddressForm() {
		setLayout(new MigLayout("", "[][grow]", "[][][][]"));

		JLabel lblStreet = new JLabel("Street");
		add(lblStreet, "cell 0 0,alignx trailing");

		w_street = new JTextField();
		add(w_street, "cell 1 0,growx");
		w_street.setColumns(10);

		JLabel lblZipcity = new JLabel("Zip/City");
		add(lblZipcity, "cell 0 1,alignx trailing");

		w_zip = new JTextField();
		add(w_zip, "flowx,cell 1 1");
		w_zip.setColumns(10);

		w_city = new JTextField();
		add(w_city, "cell 1 1,growx");
		w_city.setColumns(10);

		JLabel lblCountry = new JLabel("Country");
		add(lblCountry, "cell 0 2,alignx trailing");

		w_country = new JComboBox();
		add(w_country, "cell 1 2,growx");

		JLabel lblState = new JLabel("State");
		add(lblState, "cell 0 3,alignx trailing");

		w_state = new JComboBox();
		add(w_state, "cell 1 3,growx");
	}

	public void init(AddressBook book) {
		
		// TODO Lab 2
		// Initialize viewer for Country 
		
		{
			IWidgetValueProperty p = SwingProperties.singleSelectionValue();
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
			IValueProperty[] props = { EMFProperties
					.value(AddressbookPackage.Literals.FEDERAL_STATE__NAME) };
			ObservableComboBoxModel<FederalState> model = new ObservableComboBoxModel<FederalState>(
					mProp.observeDetail(value), props);

			w_state.setRenderer(new ObservableListCellRender<FederalState>(
					model, new ILabelDelegate<FederalState>() {

						@Override
						public String getText(FederalState object,
								IObservableMap[] maps) {
							return object == null ? "" : object.getName();
						}
					}));
			w_state.setModel(model);

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

	public void bindControls(DataBindingContext dbc, IObservableValue master) {
		this.dbc = dbc;
		this.master = master;
		
		// TODO Lab 1
		// Binding Street/Zip/City Text Widgets
		
		// TODO Lab 2
		// Bind Selection of Country-ComboBox

		bindState(dbc, master);

		IWidgetValueProperty eProp = SwingProperties.enabled();
		for (Component c : getComponents()) {
			EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Address.class,
					boolean.class) {

				@Override
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});

			// Work around - No Idea
			final Binding b = dbc
					.bindValue(eProp.observe(c), master,
							new EMFUpdateValueStrategy(
									UpdateValueStrategy.POLICY_NEVER),
							modelToTarget);
			master.addValueChangeListener(new IValueChangeListener() {

				@Override
				public void handleValueChange(ValueChangeEvent event) {
					if (event.diff.getNewValue() == null)
						b.updateModelToTarget();
				}
			});
		}
	}

	public void bindControls(EditingDomain editingDomain,
			DataBindingContext dbc, IObservableValue master) {
		this.dbc = dbc;
		this.master = master;
		this.editingDomain = editingDomain;

		IWidgetValueProperty tProp = SwingProperties.text(TextType.Modify);
		IWidgetValueProperty sProp = SwingProperties.singleSelectionValue();

		{
			IEMFValueProperty mProp = EMFEditProperties.value(editingDomain,
					AddressbookPackage.Literals.ADDRESS__STREET);
			dbc.bindValue(tProp.observe(w_street), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFEditProperties.value(editingDomain,
					AddressbookPackage.Literals.ADDRESS__ZIP);
			dbc.bindValue(tProp.observe(w_zip), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFEditProperties.value(editingDomain,
					AddressbookPackage.Literals.ADDRESS__CITY);
			dbc.bindValue(tProp.observe(w_city), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFProperties.value(FeaturePath
					.fromList(AddressbookPackage.Literals.ADDRESS__COUNTRY));
			dbc.bindValue(sProp.observe(w_country), mProp.observeDetail(master));
		}

		bindState(dbc, master);

		IWidgetValueProperty eProp = SwingProperties.enabled();
		for (Component c : getComponents()) {
			EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Address.class,
					boolean.class) {

				@Override
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});

			// Work around - No Idea
			final Binding b = dbc
					.bindValue(eProp.observe(c), master,
							new EMFUpdateValueStrategy(
									UpdateValueStrategy.POLICY_NEVER),
							modelToTarget);
			master.addValueChangeListener(new IValueChangeListener() {

				@Override
				public void handleValueChange(ValueChangeEvent event) {
					if (event.diff.getNewValue() == null)
						b.updateModelToTarget();
				}
			});
		}
	}

	private void bindState(DataBindingContext dbc, IObservableValue master) {
		IWidgetValueProperty sProp = SwingProperties.singleSelectionValue();
		IEMFValueProperty prop;

		if (editingDomain == null) {
			prop = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);

		} else {
			prop = EMFEditProperties.value(editingDomain,
					AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);

		}
		stateBinding = dbc.bindValue(sProp.observe(w_state),
				prop.observeDetail(master));
	}
}
