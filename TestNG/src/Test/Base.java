package Test;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Base {
	 static WebDriver driver;
	 void intialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	 void failed(String mName)
	{
		 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(src, new File("D:\\Eclipse Workspace\\TestNG\\ScreenShot\\"+mName+".jpg"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Control is now in finally block");
		}
	}



}
