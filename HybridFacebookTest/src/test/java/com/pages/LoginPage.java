package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class LoginPage extends Library {

	@FindBy(id = "email")
	WebElement useremail;

	@FindBy(id = "pass")
	WebElement pwd;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	WebElement Loginbutton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void login(String uname, String pas) {
		useremail.sendKeys(uname);
		pwd.sendKeys(pas);

		Loginbutton.click();

	}

}
