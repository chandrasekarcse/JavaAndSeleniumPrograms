package com.qa.Guru99.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.Guru99.Util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginApp(String UserName,String Password)
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		login.click();
		return new HomePage();
	}
	
	
	
}
