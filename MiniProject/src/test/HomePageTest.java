package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import util.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase{
	HomePage hp;
	LoginPage lp;
  @BeforeMethod
  public void beforeMethod() {
	  
	  intialize();
	  lp=new LoginPage();
	  hp=new HomePage();
	  hp=lp.loginapp("mngr258149", "qAqEsyj");
	  
  }
  
  @Test(priority=0)
  public void checkTitle() {
	  
	  String actuals=hp.getPageTitle();
	  Assert.assertEquals(actuals, "Guru99 Bank Manager HomePage", "HomePage title doesnt match");
  }
  
  @Test(priority=1)
  void verifyManagerID()
  {
	  System.out.println(hp.mngrID());
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
