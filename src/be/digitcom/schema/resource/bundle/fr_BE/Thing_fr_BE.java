package be.digitcom.schema.resource.bundle.fr_BE;

import java.util.ListResourceBundle;

public class Thing_fr_BE extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"welcome", "Bienvenue"},
			{"papa", "Rufin"},
			{"maman", "Dominique"},
			{"bebe", "Arno"}
		};
	}
}
