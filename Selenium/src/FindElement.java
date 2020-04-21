import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		//Find Element
		WebElement ele=driver.findElement(By.id("yes"));
		ele.click();
		Thread.sleep(6000);
		//Find Elements
		List<WebElement> lt=driver.findElements(By.name("name"));
		System.out.println("Size of list is "+lt.size());
		Iterator<WebElement> it = lt.iterator();
		for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i).getAttribute("value"));
		}
		driver.close();

	}

}
