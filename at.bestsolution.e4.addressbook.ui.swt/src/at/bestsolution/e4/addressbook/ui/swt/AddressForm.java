/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EMF_codetemplates.xml,v 1.1 2008/05/06 20:12:20 nickb Exp $
 */
package at.bestsolution.e4.addressbook.ui.swt;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerValueProperty;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;

public class AddressForm extends Composite {
	private Text w_street;
	private Text w_zip;
	private Text w_city;
	private Combo w_country;
	private Combo w_state;

	private ComboViewer v_country;
	private ComboViewer v_state;
	private Binding stateBinding;
	private DataBindingContext dbc;
	private IObservableValue master;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public AddressForm(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, false));

		Label lblStreet = new Label(this, SWT.NONE);
		lblStreet.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblStreet.setText("Street");

		w_street = new Text(this, SWT.BORDER);
		w_street.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				2, 1));

		Label lblCity = new Label(this, SWT.NONE);
		lblCity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblCity.setText("ZIP/City");

		w_zip = new Text(this, SWT.BORDER);
		w_zip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1,
				1));

		w_city = new Text(this, SWT.BORDER);
		w_city.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));

		Label lblCountry = new Label(this, SWT.NONE);
		lblCountry.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblCountry.setText("Country");

		w_country = new Combo(this, SWT.NONE);
		w_country.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				2, 1));

		Label lblState = new Label(this, SWT.NONE);
		lblState.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblState.setText("State");

		w_state = new Combo(this, SWT.NONE);
		w_state.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				2, 1));
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void bindControls(DataBindingContext dbc, IObservableValue master) {
		this.dbc = dbc;
		this.master = master;

		IWidgetValueProperty tProp = WidgetProperties.text(SWT.Modify);
		IViewerValueProperty sProp = ViewerProperties.singleSelection();

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__STREET);
			dbc.bindValue(tProp.observe(w_street), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__ZIP);
			dbc.bindValue(tProp.observe(w_zip), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFProperties
					.value(AddressbookPackage.Literals.ADDRESS__CITY);
			dbc.bindValue(tProp.observe(w_city), mProp.observeDetail(master));
		}

		{
			IEMFValueProperty mProp = EMFProperties.value(FeaturePath
					.fromList(AddressbookPackage.Literals.ADDRESS__COUNTRY));
			dbc.bindValue(sProp.observe(v_country), mProp.observeDetail(master));
		}

		bindState(dbc, master);

		IWidgetValueProperty eProp = WidgetProperties.enabled();

		for (Control c : getChildren()) {
			EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Address.class,
					boolean.class) {

				@Override
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});

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

	public void initUI(AddressBook book) {
		{
			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.ADDRESS_BOOK__COUNTRIES);
			IValueProperty props = EMFProperties
					.value(AddressbookPackage.Literals.COUNTRY__NAME);

			v_country = new ComboViewer(w_country);
			ObservableListContentProvider cp = new ObservableListContentProvider();
			v_country.setContentProvider(cp);
			v_country.setLabelProvider(new ObservableMapLabelProvider(props
					.observeDetail(cp.getKnownElements())));
			v_country.setInput(mProp.observe(book));
		}

		{
			IObservableValue value = ViewerProperties.singleSelection()
					.observe(v_country);
			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.COUNTRY__FEDERAL_STATES);
			IValueProperty props = EMFProperties
					.value(AddressbookPackage.Literals.FEDERAL_STATE__NAME);

			value.addValueChangeListener(new IValueChangeListener() {

				@Override
				public void handleValueChange(ValueChangeEvent event) {
					if (stateBinding != null) {
						stateBinding.dispose();
						stateBinding = null;
					}
				}
			});

			v_state = new ComboViewer(w_state);
			ObservableListContentProvider cp = new ObservableListContentProvider();
			v_state.setContentProvider(cp);
			v_state.setLabelProvider(new ObservableMapLabelProvider(props
					.observeDetail(cp.getKnownElements())));
			v_state.setInput(mProp.observeDetail(value));

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

	private void bindState(DataBindingContext dbc, IObservableValue master) {
		IViewerValueProperty sProp = ViewerProperties.singleSelection();
		IEMFValueProperty prop = EMFProperties
				.value(AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);
		stateBinding = dbc.bindValue(sProp.observe(v_state),
				prop.observeDetail(master));
	}
}
