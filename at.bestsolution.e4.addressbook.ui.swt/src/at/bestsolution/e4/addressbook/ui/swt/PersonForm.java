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

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.e4.core.di.annotations.Optional;
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

public class PersonForm extends Composite {
	private Text w_firstName;
	private Text w_lastName;
	private WritableValue master;
	private AddressForm privateAddressForm;
	private AddressForm businessAddressForm;
	private Button w_hasBusinessAddress;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public PersonForm(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		Label lblFirstname = new Label(this, SWT.NONE);
		lblFirstname.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblFirstname.setText("Firstname");

		w_firstName = new Text(this, SWT.BORDER);
		w_firstName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblLastname = new Label(this, SWT.NONE);
		lblLastname.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblLastname.setText("Lastname");

		w_lastName = new Text(this, SWT.BORDER);
		w_lastName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Group grpPrivate = new Group(this, SWT.NONE);
		grpPrivate.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpPrivate.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true,
				2, 1));
		grpPrivate.setText("Private");

		privateAddressForm = new AddressForm(grpPrivate, SWT.NONE);

		Group grpBusiness = new Group(this, SWT.NONE);
		grpBusiness.setLayout(new GridLayout(1, false));
		grpBusiness.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true,
				2, 1));
		grpBusiness.setText("Business");

		w_hasBusinessAddress = new Button(grpBusiness, SWT.CHECK);
		w_hasBusinessAddress.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});

		businessAddressForm = new AddressForm(grpBusiness, SWT.NONE);
		businessAddressForm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
	}

	@Inject
	public PersonForm(Composite parent) {
		this(parent, SWT.NONE);
		parent.setLayout(new FillLayout());
	}

	@PostConstruct
	private void init(AddressBook book, @Optional Person person) {
		master = new WritableValue();
		privateAddressForm.initUI(book);
		businessAddressForm.initUI(book);

		bindControls();

		w_hasBusinessAddress.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent ev) {
				if (w_hasBusinessAddress.getSelection()) {
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
		master.setValue(person);
	}

	private void bindControls() {
		EMFDataBindingContext dbc = new EMFDataBindingContext();

		IWidgetValueProperty tProp = WidgetProperties.text(SWT.Modify);

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

			IWidgetValueProperty cProp = WidgetProperties.selection();

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
	public void setPerson(@Optional Person person) {
		if( master != null ) {
			master.setValue(person);	
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public static void main(String[] args) {
		final Display display = new Display();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {

			@Override
			public void run() {
				try {
					final Shell frame = new Shell();
					frame.setLayout(new FillLayout());
					AddressBook book = loadAddressBook();
					PersonForm form = new PersonForm(frame, SWT.NONE);
					form.init(book,book.getPersons().get(0));
					frame.pack();

					frame.setVisible(true);
					frame.open();

					while (!frame.isDisposed()) {
						if (!display.readAndDispatch()) {
							display.sleep();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		display.dispose();
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
