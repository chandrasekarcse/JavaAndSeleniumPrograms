package com.qa.Guru99.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Guru99.Pages.HomePage;
import com.qa.Guru99.Pages.LoginPage;
import com.qa.Guru99.Util.TestBase;

public class LoginTest extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod
	public void launch()
	{
		intialize();
	}
 
	
	@Test
	public void login()
	{
		lp=new LoginPage();
		hp=lp.loginApp("mngr258149", "qAqEsyj");
	}
	
	@AfterMethod
	public void tear()
	{
		driver.quit();
	}
}
