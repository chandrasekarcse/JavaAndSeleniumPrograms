import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		//Radio Button
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Option 1']"));
		ele1.click();
		if(ele1.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button not selected");
		}
		//Checkbox
		
		WebElement ele2=driver.findElement(By.xpath("//input[@value='checkbox1']"));
		ele2.click();
		ele2.click();
		if(ele2.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
