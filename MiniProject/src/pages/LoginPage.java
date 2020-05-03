 package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import util.TestBase;

public class LoginPage extends TestBase{
  
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
	
	public HomePage loginapp(String uname,String passwd)
	{
		username.sendKeys(uname);
		password.sendKeys(passwd);
		login.click();
		return new HomePage();
	}
}
