package at.bestsolution.e4.addressbook.ui.services.di;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.e4.addressbook.model.addressbook.Person;
import at.bestsolution.e4.addressbook.ui.services.PersonSelectionPublisher;

public class ContextPersonSelectionPublisher implements PersonSelectionPublisher {
	private IEclipseContext context;
	
	@Inject
	public ContextPersonSelectionPublisher(IEclipseContext context) {
		this.context = context;
	}
	
	@Override
	public void setPerson(Person person) {
		context.set(Person.class, person);
	}
}