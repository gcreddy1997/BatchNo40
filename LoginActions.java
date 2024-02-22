package org.magnitia.selenium.gcreddy.appModule;

import org.magnitia.selenium.gcreddy.Reports.Log;
import org.magnitia.selenium.gcreddy.Reports.Reports;
import org.magnitia.selenium.gcreddy.utilities.Utilities;



public class LoginActions extends Utilities {
	
	public static boolean loginActions_positiveData(String un, String pw) {
		boolean flag = false;
		try {
			Utilities.getLocator("Login_username_txtbox_id").sendKeys(un);
			Utilities.getLocator("Login_pw_textbox_name").sendKeys(pw);
			Utilities.getLocator("Login_submit_button_xpath").click();
			Utilities.getLocator("login_agreement_button_xpath").click();
			
		//	Log.info(" provided username and password are valid and login action completed successfully");
		//	Reports.info("Login actions","Login actions completed successfully");
			flag = true;
		}catch(Exception e) {
			Log.error(" Login actions failed due to "+e.fillInStackTrace());
			Reports.fail("Login Actions", "Logian failed due to "+e.toString() , "");
		}
		
		return flag;
		
	}
	

}
