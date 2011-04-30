package at.bestsolution.e4.addressbook.ui.undo;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("restriction")
public class UndoHandler {
	@Execute
	public void undo(EditingDomain editingDomain) {
		editingDomain.getCommandStack().undo();
	}
}
