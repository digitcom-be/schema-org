package be.digitcom.schema.test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class MainResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rbFR_BE = ResourceBundle.getBundle("be.digitcom.schema.resource.bundle.fr_BE.Thing", new Locale("fr", "BE"));
		ResourceBundle rbNL_BE = ResourceBundle.getBundle("be.digitcom.schema.resource.bundle.nl_BE.Thing", new Locale("nl", "BE"));
		System.out.println(rbFR_BE.getObject("welcome"));
		System.out.println(rbNL_BE.getString("welcome"));
		
		
		Set<String> keys = rbFR_BE.keySet();
		keys.stream().map(key -> key + " " + rbFR_BE.getString(key))
			.forEach(System.out::println);
		
	}

}
