package test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import util.ExcelRead;
import util.TestBase;

public class LoginTest  extends TestBase{
 
	LoginPage lp;
	HomePage hp;
	@BeforeMethod
	void launch()
	{
		intialize();
	}
	
	@Test(dataProvider="ExcelRead",priority=0)
	void login(String uname,String passwd)
	{
		lp=new LoginPage();
		hp=lp.loginapp(uname, passwd);
		
	}
	
	@Test(priority=1)
	void invalidlogin1()
	{
		lp=new LoginPage();
		hp=lp.loginapp("mngr258149", "password1");
		WebDriverWait wt=new WebDriverWait(driver,5);
		wt.until(ExpectedConditions.alertIsPresent());
		Alert alt=driver.switchTo().alert();
		String altText=alt.getText();
		alt.accept();
		System.out.println("Alert text is :"+altText);
	}
	
	
	
	@AfterMethod
	void tear()
	{
		driver.close();
	}
	
	
	
	@DataProvider(name="ExcelRead")
	public Object[][] getExcelData() throws IOException
	{
		ExcelRead er= new ExcelRead();
		
		int rowCount=er.getRowNum(0);
		rowCount=rowCount+1;
		Object[][] obj= new Object[rowCount][2];
		
		for(int i=0;i<rowCount;i++)
		{
			obj[i][0]=er.getData(0, i, 0);
			obj[i][1]=er.getData(0, i, 1);
		}
		
		
		return obj;
	}
}
