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
package at.bestsolution.e4.addressbook.swing.application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ufacekit.ui.swing.layouts.SwingGridData;
import org.eclipse.ufacekit.ui.swing.layouts.SwingGridLayout;
import org.osgi.service.prefs.BackingStoreException;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;

@SuppressWarnings("restriction")
public class FileSelector {
	private String selectedFile;
	private JComboBox combo;
	private List<String> entryList = new ArrayList<String>();

	@ProcessAdditions
	void initSelection(MApplication application, IEclipseContext context) {
		final JFrame frame = new JFrame();
		frame.setTitle("Select Addressbook");
		
		JPanel s = new JPanel();
		frame.getContentPane().add(s);
		
		s.setLayout(new SwingGridLayout(3, false));

		{
			JLabel l = new JLabel();
			l.setText("File");
			s.add(l);
			

			String lastFiles = InstanceScope.INSTANCE.getNode(
					"at.bestsolution.e4.addressbook.swing.application").get(
					"lastFiles", "");
			String[] items = lastFiles.split("#|#");
			entryList.addAll(Arrays.asList(items));

			final DefaultComboBoxModel model = new DefaultComboBoxModel(items);
			combo = new JComboBox(model);
			s.add(combo, new SwingGridData(300,SwingGridData.DEFAULT));

			if (items.length > 0)
				combo.setSelectedIndex(0);

			JButton b = new JButton();
			b.setText("Browse ...");
			s.add(b);
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Eclipse Address Book (.ead)", "ead");
					fileChooser.addChoosableFileFilter(filter);
					
					if( fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION ) {
						String file = fileChooser.getSelectedFile().getAbsolutePath();
						boolean flag = false;
						for( int idx = 0; idx < model.getSize(); idx++ ) {
							String i = (String) model.getElementAt(idx);
							if (i.equals(file)) {
								combo.setSelectedIndex(idx);
								flag = true;
								break;
							}

						}

						if (!flag) {
							entryList.add(0, file);
							model.insertElementAt(file, 0);
							combo.setSelectedIndex(0);
						}
					}
				}
			});			
		}

		{
			JPanel container = new JPanel();
			s.add(container,new SwingGridData(SwingGridData.FILL,
					SwingGridData.BEGINNING, true, false, 3, 1));
			container.setLayout(new SwingGridLayout(3, false));

			JLabel l = new JLabel();
			container.add(l, new SwingGridData(SwingGridData.FILL_HORIZONTAL));
			
			{
				JButton b = new JButton();
				b.setText("Ok");
				container.add(b, new SwingGridData(100, SwingGridData.DEFAULT));
				b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if (combo.getSelectedIndex() != -1) {
							selectedFile = (String) combo.getSelectedItem();
							frame.setVisible(false);
						}
					}
				});
			}

			{
				JButton b = new JButton();
				b.setText("Cancel");
				container.add(b, new SwingGridData(100, SwingGridData.DEFAULT));
				
				b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);
					}
				});
			}

		}

		frame.pack();
		
		Dimension p = frame.getSize();
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension screenSize = tk.getScreenSize();
		
		frame.setLocation(screenSize.width / 2 - p.width / 2, screenSize.height / 2 - p.height / 2);
		frame.setVisible(true);

		while( frame.isVisible() ) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (selectedFile == null) {
			System.exit(0);
		} else {
			StringBuilder b = new StringBuilder();
			for (String i : entryList) {
				if (!i.equals(selectedFile)) {
					if (b.length() > 0) {
						b.append("#!#");
					}
					b.append(i);
				}
			}

			if (b.length() != 0) {
				b.insert(0, "#!#");
			}
			b.insert(0, selectedFile);

			try {
				IEclipsePreferences node = InstanceScope.INSTANCE
						.getNode("at.bestsolution.e4.addressbook.swing.application");
				node.put("lastFiles", b.toString());
				node.flush();
			} catch (BackingStoreException e) {
				// not a problem
			}

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());

			resourceSet.getPackageRegistry().put(AddressbookPackage.eNS_URI,
					AddressbookPackage.eINSTANCE);

			Resource resource = resourceSet.getResource(
					URI.createFileURI(selectedFile), true);
			context.set(AddressBook.class, (AddressBook) resource.getContents()
					.get(0));
			context.set(Resource.class, resource);
		}
	}
}
