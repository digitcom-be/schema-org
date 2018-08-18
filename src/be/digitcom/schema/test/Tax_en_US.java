package be.digitcom.schema.test;


import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

import be.digitcom.schema.test.UsTaxCode;

public class Tax_en_US extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"tax", new UsTaxCode()}
		};
	}
	
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("be.digitcom.schema.test.Tax", Locale.US);
		System.out.println(rb.getObject("tax"));
	}
}
