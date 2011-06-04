package org.eclipse.ufacekit.ui.jfx.databinding;

import javafx.application.Platform;

import org.eclipse.core.databinding.observable.Realm;

public class JFXRealm extends Realm {
	public static void createDefault() {
		setDefault(new JFXRealm());
	}
	
	@Override
	public boolean isCurrent() {
		return Platform.isFxApplicationThread();
	}	
}