import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.id("dblClkBtn"))).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		act.contextClick(driver.findElement(By.id(("dblClkBtn")))).build().perform();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
