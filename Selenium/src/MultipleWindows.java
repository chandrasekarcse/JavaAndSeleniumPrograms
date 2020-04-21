import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		List<WebElement> lt = driver.findElements(By.linkText("Click this link to start new Tab"));
		String handle=driver.getWindowHandle();
		Iterator<WebElement> it=lt.iterator();
		while(it.hasNext())
		{
			String link=it.next().getText();
			driver.findElement(By.linkText(link)).click();
			driver.switchTo().window(handle);
		}
		
		/*
		 * for(int i=0;i<lt.size();i++)
		 *  { String link=lt.get(i).getText();
		 * driver.findElement(By.linkText(link)).click();
		 * driver.switchTo().window(handle);
		 * 
		 * }
		 */
		
		//Closing all the opened tabs one by one.
		
		  Set<String> st=driver.getWindowHandles();
		  Iterator<String> it1=st.iterator();
		  while(it1.hasNext()) 
		  { 
			 String child=it1.next(); 
			  if(handle!=(child))
			  {
				  driver.switchTo().window(child); 
				  System.out.println(driver.getTitle());
				  driver.close();
				}
			  }
		 
		Thread.sleep(4000);
		driver.quit();

	}

}
