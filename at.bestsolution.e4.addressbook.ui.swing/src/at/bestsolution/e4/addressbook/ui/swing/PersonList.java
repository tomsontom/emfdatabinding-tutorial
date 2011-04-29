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

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingRealm;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ILabelDelegate;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableListCellRender;
import org.eclipse.ufacekit.ui.swing.databinding.swing.model.ObservableListModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;
import at.bestsolution.e4.addressbook.model.addressbook.Person;


public class PersonList extends JPanel
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private JList w_list;

  /**
   * Create the panel.
   */
  public PersonList()
  {
    setLayout(new BorderLayout(0, 0));

    JScrollPane scrollPane = new JScrollPane();
    add(scrollPane, BorderLayout.CENTER);

    w_list = new JList();
    scrollPane.setViewportView(w_list);
  }

  @PostConstruct
  void init(AddressBook book, final SelectedPersonService personService)
  {
    {
      IEMFListProperty mProp = EMFProperties.list(AddressbookPackage.Literals.ADDRESS_BOOK__PERSONS);

      IValueProperty[] props = {
        EMFProperties.value(AddressbookPackage.Literals.PERSON__FIRSTNAME),
        EMFProperties.value(AddressbookPackage.Literals.PERSON__LASTNAME) };

      ObservableListModel<Person> model = new ObservableListModel<Person>(mProp.observe(book), props);

      w_list.setModel(model);
      w_list.setCellRenderer(new ObservableListCellRender<Person>(model, new ILabelDelegate<Person>()
        {

          @Override
          public String getText(Person object, IObservableMap[] maps)
          {
            return object == null ? "" : object.getFirstname() + " " + object.getLastname();
          }
        }));
      SwingProperties.singleSelectionValue().observe(w_list).addValueChangeListener(new IValueChangeListener()
        {

          @Override
          public void handleValueChange(ValueChangeEvent event)
          {
            personService.setPerson((Person)event.diff.getNewValue());
          }
        });
    }
  }

  public static void main(String[] args)
  {
    SwingRealm.createDefault();
    
    try
    {
      final JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      AddressBook book = loadAddressBook();
      PersonList form = new PersonList();
      form.init(book, new SelectedPersonServiceMock());
      frame.getContentPane().add(form);
      frame.pack();

      frame.setVisible(true);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

  }

  static class SelectedPersonServiceMock implements SelectedPersonService
  {

    @Override
    public void setPerson(Person person)
    {
    }
  }

  private static AddressBook loadAddressBook()
  {
    ResourceSet resourceSet = new ResourceSetImpl();

    // Register the appropriate resource factory to handle all file extensions.
    //
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
      Resource.Factory.Registry.DEFAULT_EXTENSION,
      new XMIResourceFactoryImpl());

    // Register the package to ensure it is available during loading.
    //
    resourceSet.getPackageRegistry().put(AddressbookPackage.eNS_URI, AddressbookPackage.eINSTANCE);

    Resource resource = resourceSet.getResource(
      URI.createFileURI("/Users/tomschindl/Documents/3x_workspaces/emf_dev/at.bestsolution.e4.addressbook.model/model/AddressBook.xmi"),
      true);
    return (AddressBook)resource.getContents().get(0);
  }
}
