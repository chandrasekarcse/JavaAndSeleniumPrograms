import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement ele;
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(0);
		Actions act= new Actions(driver);
		act.
		clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
		release().build().perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
