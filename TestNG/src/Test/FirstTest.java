package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class FirstTest extends Base {

	

	@BeforeMethod
	void launch() {

		intialize();
	}

	@Test(dataProvider="ExcelData")
	
	void cd(String username,String pass) throws InterruptedException {
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys(username);
		WebElement passwd=driver.findElement(By.id("pass"));
		passwd.sendKeys(pass);
		user.clear();
		passwd.clear();
		Thread.sleep(3000);
		
		

	}
	
	@DataProvider(name="ExcelData")
	public Object[][] getData() throws IOException
	{
		ExcelRead er = new ExcelRead("C:\\Users\\Lenovo\\Desktop\\student.xlsx");
		
		int row=er.getRowCount(0);
		
		Object[][] ob=new Object[row][2];
		
		for(int i=0;i<row;i++)
		{
			ob[i][0]=er.getData(0, i, 0);
			ob[i][1]=er.getData(0, row, 1);
		}
		
		return ob;
		
		
	}

	@AfterMethod
	void tear() {
		driver.quit();
	}

}
