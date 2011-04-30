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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;
import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

public class PersonList extends Composite {

	private Table w_list;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public PersonList(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));

		w_list = new Table(this, SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION);

	}

	@Inject
	public PersonList(Composite parent) {
		this(parent, SWT.NONE);
		parent.setLayout(new FillLayout());
	}

	@PostConstruct
	void init(AddressBook book, final PersonSelectionPublisher personService) {
		{
			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.ADDRESS_BOOK__PERSONS);

			TableViewer viewer = new TableViewer(w_list);
			ObservableListContentProvider cp = new ObservableListContentProvider();
			viewer.setContentProvider(cp);

			IObservableMap[] map = {
					EMFProperties.value(
							AddressbookPackage.Literals.PERSON__FIRSTNAME)
							.observeDetail(cp.getKnownElements()),
					EMFProperties.value(
							AddressbookPackage.Literals.PERSON__LASTNAME)
							.observeDetail(cp.getKnownElements()) };

			viewer.setLabelProvider(new ObservableMapLabelProvider(map) {
				@Override
				public String getColumnText(Object element, int columnIndex) {
					Person object = (Person) element;
					return object == null ? "" : object.getFirstname() + " "
							+ object.getLastname();
				}
			});
			viewer.setInput(mProp.observe(book));
			ViewerProperties.singleSelection().observe(viewer)
					.addValueChangeListener(new IValueChangeListener() {

						@Override
						public void handleValueChange(ValueChangeEvent event) {
							personService.setPerson((Person) event.diff
									.getNewValue());
						}
					});
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
					PersonList form = new PersonList(frame, SWT.NONE);
					form.init(book, new SelectedPersonServiceMock());
					frame.pack();

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

	static class SelectedPersonServiceMock implements PersonSelectionPublisher {

		@Override
		public void setPerson(Person person) {
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
}
