/*******************************************************************************
 * Copyright (c) 2007, Angelo Zerr and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ufacekit.ui.swing.databinding.swing;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumn;
import javax.swing.text.JTextComponent;

import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IVetoableValue;
import org.eclipse.core.databinding.observable.value.ValueChangingEvent;
import org.eclipse.ufacekit.ui.swing.custom.JTabbedPanePage;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ButtonObservableText;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ButtonObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ComboEditableObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ComboObservableList;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ComboObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ComboSingleSelectionObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ControlObservableIcon;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ControlObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.LabelObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ListObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.ShellObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.SliderObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.SwingDelayedObservableValueDecorator;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.SwingProperties;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TabbedPanePageObservableText;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TabbedPaneSingleSelectionObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TableColumnObservableText;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TextEditableObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TextObservableValue;
import org.eclipse.ufacekit.ui.swing.databinding.internal.swing.TitledBorderObservableText;

/**
 * A factory for creating observables for Swing widgets.
 *
 */
public class SwingObservables {

	private static Realm realm = new SwingRealm();

	/**
	 * @return get realm used to sync with UI thread
	 * @since 1.0
	 */
	public static Realm getRealm() {
		return realm;
	}

	private static java.util.List<SwingRealm> realms = new ArrayList<SwingRealm>();

	/**
	 * Returns the realm representing the UI thread for the given currentThread.
	 *
	 * @param currentThread
	 *            the current thread
	 * @return the realm representing the UI thread for the given display
	 * @since 1.0
	 */
	public static Realm getRealm(final Thread currentThread) {
		synchronized (realms) {
			for (Iterator<SwingRealm> it = realms.iterator(); it.hasNext();) {
				SwingRealm displayRealm = it.next();
				if (displayRealm.getCurrentThread() == currentThread) {
					return displayRealm;
				}
			}
			SwingRealm result = new SwingRealm(currentThread);
			realms.add(result);
			return result;
		}
	}

	/**
	 * @param control
	 * @return an observable value tracking the enabled state of the given
	 *         control
	 */
	public static ISwingObservableValue observeEnabled(Container control) {
		return new ControlObservableValue(control, SwingProperties.ENABLED);
	}

	/**
	 * @param control
	 * @return an observable value tracking the visible state of the given
	 *         control
	 */
	public static ISwingObservableValue observeVisible(Container control) {
		return new ControlObservableValue(control, SwingProperties.VISIBLE);
	}

	/**
	 * @param control
	 * @return an observable value tracking the tooltip text of the given
	 *         control
	 */
	public static ISwingObservableValue observeTooltipText(Container control) {
		return new ControlObservableValue(control, SwingProperties.TOOLTIP_TEXT);
	}

	/**
	 * Returns an observable observing the selection attribute of the provided
	 * <code>control</code>. The supported types are:
	 * <ul>
	 * <li>javax.swing.JTree</li>
	 * <li>org.eclipse.swt.widgets.Spinner</li>
	 * <li>org.eclipse.swt.widgets.Button</li>
	 * <li>javax.swing.JComboBox</li>
	 * <li>javax.swing.AbstractButton</li>
	 * <li>javax.swing.JList</li>
	 * <li>javax.swing.JSlider</li>
	 *
	 * </ul>
	 *
	 * @param control
	 * @return observable value
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeSelection(Container control) {
		// if (control instanceof JList) {
		// return new ListSingleSelectionObservableValue((JList) control);
		// }
		 /* if (control instanceof JTree) { return new
		 * TreeSingleSelectionObservableValue((JTree) control); } else
			 */
		 /*if (control instanceof JSpinner) { // return new
		 * SpinnerObservableValue((JSpinner) control, //
		 * SwingProperties.SELECTION); } else
		 */
		 if(control instanceof JComboBox) { 
			 return new ComboObservableValue((JComboBox) control, SwingProperties.SELECTION);
		 } else if (control instanceof AbstractButton) {
			// Manage JCheckBox, JRadioButton, JButton
			return new ButtonObservableValue((AbstractButton) control);
		} else if (control instanceof JList) { 
			return new ListObservableValue((JList) control); 
		} else if (control instanceof JSlider) {
			return new SliderObservableValue((JSlider) control);
		}
		// if (control instanceof JSpinner) {
		// return new SpinnerObservableValue((JSpinner) control,
		// SwingProperties.SELECTION);
		// } else if (control instanceof JCheckBox) {
		// return new ButtonObservableValue((JCheckBox) control);
		// } else if (control instanceof JRadioButton) {
		// return new ButtonObservableValue((JRadioButton) control);
		// // } else if (control instanceof Scale) {
		// // return new ScaleObservableValue((Scale) control,
		// // SwingProperties.SELECTION);

		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$//$NON-NLS-2$
	}

	// public static IObservableValue observeSelection(JList list) {
	// return new ListSingleSelectionObservableValue(list);
	// }
	//
	// public static IObservableValue observeSelection(JComboBox comboBox) {
	// return new ComboSelectionObservableValue(comboBox);
	// }
	//
	// public static ISwingObservableValue observeSelection(JTable table) {
	// return new TableSingleSelectionObservableValue(table);
	// }

	// /**
	// * Returns an observable observing the minimum attribute of the provided
	// * <code>control</code>. The supported types are:
	// * <ul>
	// * <li>org.eclipse.swt.widgets.Spinner</li>
	// * <li>org.eclipse.swt.widgets.Scale</li>
	// * </ul>
	// *
	// * @param control
	// * @return observable value
	// * @throws IllegalArgumentException
	// * if <code>control</code> type is unsupported
	// */
	// public static ISWTObservableValue observeMin(Control control) {
	// if (control instanceof Spinner) {
	// return new SpinnerObservableValue((Spinner) control,
	// SWTProperties.MIN);
	// } else if (control instanceof Scale) {
	// return new ScaleObservableValue((Scale) control, SWTProperties.MIN);
	// }
	//
	// throw new IllegalArgumentException(
	// "Widget [" + control.getClass().getName() + "] is not supported.");
	// //$NON-NLS-1$//$NON-NLS-2$
	// }
	//
	// /**
	// * Returns an observable observing the maximum attribute of the provided
	// * <code>control</code>. The supported types are:
	// * <ul>
	// * <li>org.eclipse.swt.widgets.Spinner</li>
	// * <li>org.eclipse.swt.widgets.Scale</li>
	// * </ul>
	// *
	// * @param control
	// * @return observable value
	// * @throws IllegalArgumentException
	// * if <code>control</code> type is unsupported
	// */
	// public static ISWTObservableValue observeMax(Control control) {
	// if (control instanceof Spinner) {
	// return new SpinnerObservableValue((Spinner) control,
	// SWTProperties.MAX);
	// } else if (control instanceof Scale) {
	// return new ScaleObservableValue((Scale) control, SWTProperties.MAX);
	// }
	//
	// throw new IllegalArgumentException(
	// "Widget [" + control.getClass().getName() + "] is not supported.");
	// //$NON-NLS-1$//$NON-NLS-2$
	// }

	/**
	 * Returns an observable observing the text attribute of the provided
	 * <code>control</code>. The supported types are:
	 * <ul>
	 * <li>org.eclipse.swt.widgets.Text</li>
	 * </ul>
	 *
	 * @param control
	 * @param event
	 *            event type to register for change events
	 * @return observable value
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeText(JComponent control, int event) {
		if (control instanceof JTextComponent) {
			return new TextObservableValue((JTextComponent) control, event);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * Returns an observable observing the text attribute of the provided
	 * <code>control</code>. The supported types are:
	 * <ul>
	 * <li>javax.swing.JLabel</li>
	 * <li>javax.swing.JComboBox</li>
	 * <li>javax.swing.JFrame</li>
	 * <li>javax.swing.AbstractButton</li>
	 * </ul>
	 *
	 * @param control
	 * @return observable value
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeText(Container control) {
		if (control instanceof JLabel) {
			return new LabelObservableValue((JLabel) control);
		} else if (control instanceof JComboBox) {
			return new ComboObservableValue((JComboBox) control, SwingProperties.TEXT);
		} else if (control instanceof JFrame) {
			return new ShellObservableValue((JFrame) control);
		} else if (control instanceof AbstractButton) {
			return new ButtonObservableText((AbstractButton) control);
		} else if (control instanceof JTabbedPanePage) {
			return new TabbedPanePageObservableText((JTabbedPanePage) control);
		} else if (control instanceof JComponent) {
			JComponent component = (JComponent) control;
			if (component.getBorder() instanceof TitledBorder) {
				return observeText((TitledBorder) component.getBorder());
			}
			return new TabbedPanePageObservableText((JTabbedPanePage) control);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * Observe the text of a table column
	 *
	 * @param tableColumn
	 *            the table column to observe
	 * @return the observable
	 * @since 1.0
	 */
	public static ISwingObservableValue observeText(TableColumn tableColumn) {
		return new TableColumnObservableText(tableColumn);
	}

	/**
	 * Observe the border text
	 *
	 * @param titledBorder
	 *            the border to observe
	 * @return the observable
	 * @since 1.0
	 */
	public static ISwingObservableValue observeText(TitledBorder titledBorder) {
		return new TitledBorderObservableText(titledBorder);
	}

	/**
	 * Returns an observable observing the items attribute of the provided
	 * <code>control</code>. The supported types are:
	 * <ul>
	 * <li>javax.swing.JComboBox</li>
	 * </ul>
	 *
	 * @param control
	 * @return observable list
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static IObservableList observeItems(Container control) {
		if (control instanceof JComboBox) {
			return new ComboObservableList((JComboBox) control);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported.");//$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * Returns an observable observing the single selection index attribute of
	 * the provided <code>control</code>. The supported types are:
	 * <ul>
	 * <li>javax.swing.JComboBox</li>
	 * <li>javax.swing.JTabbedPane</li>
	 * </ul>
	 *
	 * @param control
	 * @return observable value
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeSingleSelectionIndex(Container control) {
		if (control instanceof JComboBox) {
			return new ComboSingleSelectionObservableValue((JComboBox) control);
		} else if (control instanceof JTabbedPane) {
			return new TabbedPaneSingleSelectionObservableValue((JTabbedPane) control);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * @param control
	 * @return an observable value tracking the foreground color of the given
	 *         control
	 */
	public static ISwingObservableValue observeForeground(Container control) {
		return new ControlObservableValue(control, SwingProperties.FOREGROUND);
	}

	/**
	 * @param control
	 * @return an observable value tracking the background color of the given
	 *         control
	 */
	public static ISwingObservableValue observeBackground(Container control) {
		return new ControlObservableValue(control, SwingProperties.BACKGROUND);
	}

	/**
	 * @param control
	 * @return an observable value tracking the font of the given control
	 */
	public static ISwingObservableValue observeFont(Container control) {
		return new ControlObservableValue(control, SwingProperties.FONT);
	}

	/**
	 * Returns an observable observing the editable attribute of the provided
	 * <code>control</code>. The supported types are:
	 * <ul>
	 * <li>javax.swing.text.JTextComponent</li>
	 * <li>javax.swing.JComboBox</li>
	 * </ul>
	 *
	 * @param control
	 *            the control
	 * @return observable value
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeEditable(Container control) {
		if (control instanceof JTextComponent) {
			return new TextEditableObservableValue((JTextComponent) control);
		}
		if (control instanceof JComboBox) {
			return new ComboEditableObservableValue((JComboBox) control);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Observe image attribute of the given control. The supported types are
	 * <ul>
	 * <li>{@link AbstractButton}</li>
	 * <li>{@link JLabel}</li>
	 * <li>{@link JTabbedPanePage}</li>
	 * </ul>
	 *
	 * @param control
	 *            the control
	 * @return the observable
	 * @since 1.0
	 * @throws IllegalArgumentException
	 *             if <code>control</code> type is unsupported
	 */
	public static ISwingObservableValue observeImage(Container control) {
		if (control instanceof AbstractButton) {
			return new ControlObservableIcon((AbstractButton) control);
		}
		if (control instanceof JLabel) {
			return new ControlObservableIcon((JLabel) control);
		}
		if (control instanceof JTabbedPanePage) {
			return new ControlObservableIcon((JTabbedPanePage) control);
		}
		throw new IllegalArgumentException("Widget [" + control.getClass().getName() + "] is not supported."); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	/**
	 * Returns an observable which delays notification of value change events
	 * from <code>observable</code> until <code>delay</code> milliseconds have
	 * elapsed since the last change event, or until a FocusOut event is
	 * received from the underlying widget (whichever happens first). This
	 * observable helps to boost performance in situations where an observable
	 * has computationally expensive listeners (e.g. changing filters in a
	 * viewer) or many dependencies (master fields with multiple detail fields).
	 * A common use of this observable is to delay validation of user input
	 * until the user stops typing in a UI field.
	 * <p>
	 * To notify about pending changes, the returned observable fires a stale
	 * event when the wrapped observable value fires a change event, and remains
	 * stale until the delay has elapsed and the value change is fired. A call
	 * to {@link IObservableValue#getValue() getValue()} while a value change is
	 * pending will fire the value change immediately, short-circuiting the
	 * delay.
	 * <p>
	 * Note that this observable will not forward {@link ValueChangingEvent}
	 * events from a wrapped {@link IVetoableValue}.
	 * 
	 * @param delay
	 *            the delay in milliseconds
	 * @param observable
	 *            the observable being delayed
	 * @return an observable which delays notification of value change events
	 *         from <code>observable</code> until <code>delay</code>
	 *         milliseconds have elapsed since the last change event.
	 * 
	 * @since 1.2
	 */
	public static ISwingObservableValue observeDelayedValue(int delay,
			ISwingObservableValue observable) {
		return new SwingDelayedObservableValueDecorator(Observables
				.observeDelayedValue(delay, observable), observable.getContainer());
	}

}
