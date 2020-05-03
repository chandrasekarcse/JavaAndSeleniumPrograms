package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//table/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement mngrID;
	
	
	public String mngrID()
	{
		return mngrID.getText();
	}
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
  
}
