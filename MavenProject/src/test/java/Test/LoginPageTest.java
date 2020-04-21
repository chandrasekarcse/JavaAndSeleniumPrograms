package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Util.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage lp;
	
	@BeforeMethod
	void launch()
	{
		intialize();
		lp=new LoginPage();
		 
	}
	
	@Test
	void apply() throws InterruptedException
	{
		lp.clickReg();
		Thread.sleep(4000);
		
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}

}
