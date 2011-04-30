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

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.ufacekit.ui.swing.databinding.swing.IWidgetValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingObservables;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingRealm;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties.TextType;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.IEMFListProperty.ListElementAccess;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.bestsolution.e4.addressbook.model.addressbook.Address;
import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressType;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookFactory;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;

public class PersonForm extends JPanel {
	private JTextField w_firstName;
	private JTextField w_lastName;

	private WritableValue master;
	private AddressForm privateAddressForm;
	private AddressForm businessAddressForm;
	private JCheckBox w_hasBusinessAddress;

	/**
	 * Create the panel.
	 */
	public PersonForm() {
		setLayout(new MigLayout("", "[][grow]", "[][][grow][grow][grow]"));

		JLabel lblGivenname = new JLabel("Firstname");
		add(lblGivenname, "cell 0 0,alignx trailing");

		w_firstName = new JTextField();
		add(w_firstName, "cell 1 0,growx");
		w_firstName.setColumns(10);

		JLabel lblSurname = new JLabel("Surname");
		add(lblSurname, "cell 0 1,alignx trailing");

		w_lastName = new JTextField();
		add(w_lastName, "cell 1 1,growx");
		w_lastName.setColumns(10);

		privateAddressForm = new AddressForm();
		privateAddressForm.setBorder(new TitledBorder(null, "Private",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(privateAddressForm, "cell 0 2 2 1,grow");

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Business",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, "cell 0 3 2 1,grow");
		panel.setLayout(new BorderLayout(0, 0));

		w_hasBusinessAddress = new JCheckBox("");
		panel.add(w_hasBusinessAddress, BorderLayout.NORTH);

		businessAddressForm = new AddressForm();
		panel.add(businessAddressForm, BorderLayout.CENTER);
	}

	@PostConstruct
	private void init(AddressBook book) {
		master = new WritableValue();
		privateAddressForm.initUI(book);
		businessAddressForm.initUI(book);
		bindControls();

		w_hasBusinessAddress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (w_hasBusinessAddress.isSelected()) {
					Address address = AddressbookFactory.eINSTANCE
							.createAddress();
					address.setType(AddressType.BUSINESS);
					((Person) master.getValue()).getAddresses().add(address);
				} else {
					ElementAccessImpl e = new ElementAccessImpl(
							AddressType.BUSINESS);
					int idx = e.getReadValueIndex(((Person) master.getValue())
							.getAddresses());
					if (idx != -1) {
						((Person) master.getValue()).getAddresses().remove(idx);
					}
				}
			}
		});
	}

	private void bindControls() {
		EMFDataBindingContext dbc = new EMFDataBindingContext();

		IWidgetValueProperty tProp = SwingProperties.text(TextType.Modify);

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

		{
			IEMFValueProperty mProp = EMFProperties.list(
					AddressbookPackage.Literals.PERSON__ADDRESSES).value(
					new ElementAccessImpl(AddressType.PRIVATE));
			IObservableValue value = mProp.observeDetail(master);
			privateAddressForm.bindControls(dbc, value);
		}

		{
			IEMFValueProperty mProp = EMFProperties.list(
					AddressbookPackage.Literals.PERSON__ADDRESSES).value(
					new ElementAccessImpl(AddressType.BUSINESS));
			IObservableValue value = mProp.observeDetail(master);

			IWidgetValueProperty cProp = SwingProperties.selection();

			EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy(
					UpdateValueStrategy.POLICY_NEVER);
			EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Address.class,
					boolean.class) {

				@Override
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});
			dbc.bindValue(cProp.observe(w_hasBusinessAddress), value,
					targetToModel, modelToTarget);

			businessAddressForm.bindControls(dbc, value);
		}
	}

	@Inject
	void setPerson(Person person) {
		master.setValue(person);
	}

	public static void main(String[] args) {
		SwingRealm.createDefault();

		try {
			final JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AddressBook book = loadAddressBook();
			PersonForm form = new PersonForm();
			form.init(book);
			frame.getContentPane().add(form);
			frame.pack();

			form.setPerson(book.getPersons().get(0));
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static AddressBook loadAddressBook() {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(AddressbookPackage.eNS_URI,
				AddressbookPackage.eINSTANCE);

		Resource resource = resourceSet
				.getResource(
						URI.createFileURI("/Users/tomschindl/Documents/3x_workspaces/emf_dev/at.bestsolution.e4.addressbook.model/model/AddressBook.xmi"),
						true);
		return (AddressBook) resource.getContents().get(0);
	}

	private static Person createPerson() {
		final Person p = AddressbookFactory.eINSTANCE.createPerson();
		p.setFirstname("Tom");
		p.setLastname("Schindl");

		{
			Address addr = AddressbookFactory.eINSTANCE.createAddress();
			addr.setCity("Innsbruck");
			addr.setStreet("Hauptstrasse 11");
			addr.setZip("6020");
			addr.setType(AddressType.PRIVATE);

			p.getAddresses().add(addr);
		}

		{
			Address addr = AddressbookFactory.eINSTANCE.createAddress();
			addr.setCity("Innsbruck");
			addr.setStreet("Eduard-Bodemgasse 5-7");
			addr.setZip("6020");
			addr.setType(AddressType.BUSINESS);

			p.getAddresses().add(addr);
		}

		return p;
	}

	private class ElementAccessImpl extends ListElementAccess<Address> {
		private AddressType type;

		public ElementAccessImpl(AddressType type) {
			this.type = type;
		}

		@Override
		public int getReadValueIndex(List<Address> list) {
			int i = 0;
			for (Address o : list) {
				if (o.getType() == type) {
					return i;
				}
				i++;
			}
			return -1;
		}

		@Override
		public int getWriteValueIndex(List<Address> list) {
			int i = 0;
			for (Address o : list) {
				if (o.getType() == type) {
					return i;
				}
				i++;
			}
			return -1;
		}

	}
}
