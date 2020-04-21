import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		WebElement ele = driver.findElement(By.id("terms"));
		if(ele.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			ele.click();
			System.out.println("Check box is clicked");
		}

	}

}
