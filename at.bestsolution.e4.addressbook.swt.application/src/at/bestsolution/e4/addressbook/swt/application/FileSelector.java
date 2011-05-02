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
package at.bestsolution.e4.addressbook.swt.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

import at.bestsolution.e4.addressbook.model.addressbook.AddressBook;
import at.bestsolution.e4.addressbook.model.addressbook.AddressbookPackage;

@SuppressWarnings("restriction")
public class FileSelector {
	private String selectedFile;
	private Combo combo;
	private List<String> entryList = new ArrayList<String>();

	@ProcessAdditions
	void initSelection(MApplication application, IEclipseContext context) {
		Display d = Display.getCurrent();

		final Shell s = new Shell(d);
		s.setText("Select Addressbook");
		s.setLayout(new GridLayout(3, false));

		{

			Label l = new Label(s, SWT.NONE);
			l.setText("File");

			String lastFiles = InstanceScope.INSTANCE.getNode(
					"at.bestsolution.e4.addressbook.swt.application").get(
					"lastFiles", "");
			String[] items = lastFiles.split("#|#");
			entryList.addAll(Arrays.asList(items));

			combo = new Combo(s, SWT.READ_ONLY);
			combo.setItems(items);
			combo.setLayoutData(new GridData(300, SWT.DEFAULT));

			if (items.length > 0)
				combo.select(0);

			Button b = new Button(s, SWT.PUSH);
			b.setText("Browse ...");
			b.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					FileDialog dialog = new FileDialog(s, SWT.OPEN);
					dialog.setFilterExtensions(new String[] { "*.ead" });
					String file = dialog.open();
					if (file != null) {
						int idx = 0;
						boolean flag = false;
						for (String i : combo.getItems()) {
							if (i.equals(file)) {
								combo.select(idx);
								flag = true;
								break;
							}
							idx++;
						}

						if (!flag) {
							entryList.add(0, file);
							combo.add(file, 0);
							combo.select(0);
						}
					}
				}
			});
		}

		{
			Composite container = new Composite(s, SWT.NONE);
			container.setLayout(new GridLayout(3, false));
			container.setLayoutData(new GridData(GridData.FILL,
					GridData.BEGINNING, true, false, 3, 1));

			Label l = new Label(container, SWT.NONE);
			l.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			{
				Button b = new Button(container, SWT.PUSH);
				b.setText("Ok");
				b.setLayoutData(new GridData(100, SWT.DEFAULT));
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						System.err.println(combo.getSelectionIndex());
						if (combo.getSelectionIndex() != -1) {
							selectedFile = combo.getItem(combo
									.getSelectionIndex());
							s.dispose();
						}
					}
				});
			}

			{
				Button b = new Button(container, SWT.PUSH);
				b.setText("Cancel");
				b.setLayoutData(new GridData(100, SWT.DEFAULT));
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						s.dispose();
					}
				});
			}

		}

		s.pack();
		Point p = s.getSize();
		Rectangle r = s.getMonitor().getBounds();
		s.setLocation(r.width / 2 - p.x / 2, r.height / 2 - p.y / 2);
		s.open();

		while (!s.isDisposed()) {
			if (!d.readAndDispatch()) {
				d.sleep();
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
						.getNode("at.bestsolution.e4.addressbook.swt.application");
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
