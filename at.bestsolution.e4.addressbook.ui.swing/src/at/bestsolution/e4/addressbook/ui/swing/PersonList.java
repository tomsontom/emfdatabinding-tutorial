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

import java.awt.BorderLayout;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffVisitor;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingRealm;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;
import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

public class PersonList extends JPanel {
	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	private JList w_list;

	/**
	 * Create the panel.
	 */
	public PersonList() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		w_list = new JList();
		scrollPane.setViewportView(w_list);
	}

	@Inject
	public PersonList(JPanel parent) {
		this();
		parent.setLayout(new BorderLayout());
		parent.add(this,BorderLayout.CENTER);
	}
	
	@PostConstruct
	void init(AddressBook book, final PersonSelectionPublisher personService) {
		{
			IEMFListProperty mProp = EMFProperties
					.list(AddressbookPackage.Literals.ADDRESS_BOOK__PERSONS);

			final IObservableList list = mProp.observe(book);
			
			// TODO Lab 2
			// Initialize TableViewer
			
			list.addListChangeListener(new IListChangeListener() {
				
				@Override
				public void handleListChange(ListChangeEvent event) {
					event.diff.accept(new ListDiffVisitor() {
						
						@Override
						public void handleRemove(int index, Object element) {
							if( list.size() > index - 1 && w_list.getSelectedValue() == null ) {
								if( index - 1 >= 0 ) {
									index--;
								} else {
									index = 0;
								}
								w_list.setSelectedValue(list.get(index), true);
							}
						}
						
						@Override
						public void handleAdd(int index, Object element) {
							w_list.setSelectedValue(element, true);
						}
					});
				}
			});
			
			SwingProperties.singleSelectionValue().observe(w_list)
					.addValueChangeListener(new IValueChangeListener() {

						@Override
						public void handleValueChange(ValueChangeEvent event) {
							personService.setPerson((Person) event.diff
									.getNewValue());
						}
					});
			
			if( list.size() > 0 ) {
				w_list.setSelectedIndex(0);	
			}
		}
	}

	public static void main(String[] args) {
		SwingRealm.createDefault();

		try {
			final JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AddressBook book = loadAddressBook();
			PersonList form = new PersonList();
			form.init(book, new SelectedPersonServiceMock());
			frame.getContentPane().add(form);
			frame.pack();

			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
