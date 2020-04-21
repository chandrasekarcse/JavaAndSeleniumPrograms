import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		//WebDriver Methods
		System.out.println("Page title");
		System.out.println(driver.getTitle());
		System.out.println("Current URL");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Page source");
		System.out.println(driver.getTitle());
		//Navigate Methods
		driver.navigate().to("https://drive.google.com/drive/my-drive");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
	}
}
