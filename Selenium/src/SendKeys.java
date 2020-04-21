import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		//SendKeys
		WebElement username= driver.findElement(By.id("email"));
		WebElement passwd=driver.findElement(By.id("passwd"));
		username.sendKeys("test@gmail.com");
		passwd.sendKeys("test123");
		//getText()
		System.out.println(driver.findElement(By.xpath("//*[text()='Email address']")).getText());
		//clear
		username.clear();
		passwd.clear();
		Thread.sleep(5000);
		driver.close();
		

	}

}
