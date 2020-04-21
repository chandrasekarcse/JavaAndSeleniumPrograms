import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		https://www.spicejet.com/
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Visa Services"));
			Thread.sleep(5000);
			driver.quit();
			
	}

}
