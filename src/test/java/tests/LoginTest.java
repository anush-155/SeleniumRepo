package tests;

import org.testng.annotations.Test;

import base.Basetest;
import pages.LoginPage;
import pages.NavigationPage;

public class LoginTest extends Basetest {

	
	@Test
	public void loginTest() {
		LoginPage loginobj = new LoginPage(driver);
		loginobj.login();  //line 14
	}
	@Test
	public void NavigationTest() {
		NavigationPage navObj = new NavigationPage(driver);
		navObj.dismissPopup();  //line 14
	}
	
	
}
