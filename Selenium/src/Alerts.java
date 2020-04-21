import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Alert alt = driver.switchTo().alert();
		String str=alt.getText();
		String exp = "Please enter a valid user name";
		
		if(str.equals(exp))
		{
			alt.accept();
		}
		driver.quit();
		
		
		

	}

}
