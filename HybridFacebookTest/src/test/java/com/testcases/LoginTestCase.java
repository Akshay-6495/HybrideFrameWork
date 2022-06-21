package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.morningstar.ReusableFunction;
import com.pages.LoginPage;

public class LoginTestCase extends Library {

	@BeforeMethod
	public void launch() {

		launchApplication("chrome", "https://www.facebook.com/");

	}

	@Test
	public void loginTest() {
		LoginPage pageobj = new LoginPage(driver);
		pageobj.login("7030639804", "9975102487");
	}

	@AfterMethod
	public void closeApp() {
		ReusableFunction reuse = new ReusableFunction(driver);
		reuse.to_take_screenshot("src/test/resources/Screenshots/Facebook.png");
		reuse.quit();
	}

}
