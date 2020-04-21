import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Try it']")).click();
		
		
		  WebDriverWait wt=new WebDriverWait(driver,15);
		  wt.until(ExpectedConditions.alertIsPresent());
		  driver.switchTo().alert().accept();
		 
		
		driver.close();
		

	}

}
