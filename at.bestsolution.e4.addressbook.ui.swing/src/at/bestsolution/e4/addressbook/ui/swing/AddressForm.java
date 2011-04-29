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
import org.eclipse.ufacekit.ui.swing.databinding.swing.IWidgetValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ILabelDelegate;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableComboBoxModel;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableListCellRender;

import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Country;
import at.bestsolution.e4.addressbook.model.addressbook.FederalState;


public class AddressForm extends JPanel
{
  private JTextField w_street;
  private JTextField w_zip;
  private JTextField w_city;
  private JComboBox w_state;
  private JComboBox w_country;

  private Binding stateBinding;
  private DataBindingContext dbc;
  private IObservableValue master;

  /**
   * Create the panel.
   */
  public AddressForm()
  {
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

  public void bindControls(DataBindingContext dbc, IObservableValue master)
  {
    this.dbc = dbc;
    this.master = master;
    IWidgetValueProperty tProp = SwingProperties.text(TextType.Modify);
    IWidgetValueProperty sProp = SwingProperties.singleSelectionValue();

    {
      IEMFValueProperty mProp = EMFProperties.value(AddressbookPackage.Literals.ADDRESS__STREET);
      dbc.bindValue(tProp.observe(w_street), mProp.observeDetail(master));
    }

    {
      IEMFValueProperty mProp = EMFProperties.value(AddressbookPackage.Literals.ADDRESS__ZIP);
      dbc.bindValue(tProp.observe(w_zip), mProp.observeDetail(master));
    }

    {
      IEMFValueProperty mProp = EMFProperties.value(AddressbookPackage.Literals.ADDRESS__CITY);
      dbc.bindValue(tProp.observe(w_city), mProp.observeDetail(master));
    }

    {
      IEMFValueProperty mProp = EMFProperties.value(FeaturePath.fromList(AddressbookPackage.Literals.ADDRESS__COUNTRY));
      dbc.bindValue(sProp.observe(w_country), mProp.observeDetail(master));
    }

    bindState(dbc, master);

    IWidgetValueProperty eProp = SwingProperties.enabled();
    for (Component c : getComponents())
    {
      EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
      modelToTarget.setConverter(new Converter(Address.class, boolean.class)
        {

          @Override
          public Object convert(Object fromObject)
          {
            return fromObject != null;
          }
        });

      // Work around - No Idea
      final Binding b = dbc.bindValue(eProp.observe(c), master, new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
      master.addValueChangeListener(new IValueChangeListener()
        {

          @Override
          public void handleValueChange(ValueChangeEvent event)
          {
            if (event.diff.getNewValue() == null)
              b.updateModelToTarget();
          }
        });
    }
  }

  public void initUI(AddressBook book)
  {
    {
      IEMFListProperty mProp = EMFProperties.list(AddressbookPackage.Literals.ADDRESS_BOOK__COUNTRIES);
      IValueProperty[] props = { EMFProperties.value(AddressbookPackage.Literals.COUNTRY__NAME) };
      ObservableComboBoxModel<Country> model = new ObservableComboBoxModel<Country>(mProp.observe(book), props);

      w_country.setRenderer(new ObservableListCellRender<Country>(model, new ILabelDelegate<Country>()
        {

          @Override
          public String getText(Country object, IObservableMap[] maps)
          {
            return object == null ? "" : object.getName();
          }
        }));
      w_country.setModel(model);
    }

    {
      IWidgetValueProperty p = SwingProperties.singleSelectionValue();
      IObservableValue value = p.observe(w_country);
      value.addValueChangeListener(new IValueChangeListener()
        {

          @Override
          public void handleValueChange(ValueChangeEvent event)
          {
            if (stateBinding != null)
            {
              stateBinding.dispose();
              stateBinding = null;
            }
          }
        });

      IEMFListProperty mProp = EMFProperties.list(AddressbookPackage.Literals.COUNTRY__FEDERAL_STATES);
      IValueProperty[] props = { EMFProperties.value(AddressbookPackage.Literals.FEDERAL_STATE__NAME) };
      ObservableComboBoxModel<FederalState> model = new ObservableComboBoxModel<FederalState>(mProp.observeDetail(value), props);

      w_state.setRenderer(new ObservableListCellRender<FederalState>(model, new ILabelDelegate<FederalState>()
        {

          @Override
          public String getText(FederalState object, IObservableMap[] maps)
          {
            return object == null ? "" : object.getName();
          }
        }));
      w_state.setModel(model);

      value.addValueChangeListener(new IValueChangeListener()
        {

          @Override
          public void handleValueChange(ValueChangeEvent event)
          {
            if (stateBinding == null && dbc != null && master != null)
            {
              bindState(dbc, master);
            }
          }
        });
    }
  }

  private void bindState(DataBindingContext dbc, IObservableValue master)
  {
    IWidgetValueProperty sProp = SwingProperties.singleSelectionValue();
    IEMFValueProperty prop = EMFProperties.value(AddressbookPackage.Literals.ADDRESS__FEDERAL_STATE);
    stateBinding = dbc.bindValue(sProp.observe(w_state), prop.observeDetail(master));
  }
}
