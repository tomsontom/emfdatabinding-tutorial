package at.bestsolution.e4.addressbook.model.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("restriction")
public class RedoHandler {
	
	@Execute
	public void redo(EditingDomain editingDomain) {
		editingDomain.getCommandStack().redo();
	}
}
