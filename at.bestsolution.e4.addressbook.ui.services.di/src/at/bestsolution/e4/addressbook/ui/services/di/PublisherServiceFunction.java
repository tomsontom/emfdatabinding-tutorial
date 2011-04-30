package at.bestsolution.e4.addressbook.ui.services.di;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

@SuppressWarnings("restriction")
public class PublisherServiceFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext arg0) {
		MApplication app = arg0.get(MApplication.class);
		PersonSelectionPublisher service = app.getContext().get(
				ContextPersonSelectionPublisher.class);
		if (service == null) {
			service = ContextInjectionFactory.make(
					ContextPersonSelectionPublisher.class, app.getContext());
			app.getContext().set(ContextPersonSelectionPublisher.class,
					(ContextPersonSelectionPublisher) service);
		}
		return service;
	}
}