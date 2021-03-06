import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.name("country"));
		Select sel=new Select(ele);
		//sel.selectByVisibleText("ANGOLA");
		//sel.deselectByVisibleText("ANGOLA");
		//sel.selectByIndex(2);
		//sel.deselectByIndex(2);
		sel.selectByValue("ANTARCTICA");
		//sel.deselectByValue("ANTARTICA");
		Thread.sleep(3000);
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		if(sel2.isMultiple())
		{
			System.out.println("Multiple select box");
			sel2.selectByVisibleText("Apple");
			sel2.deselectByVisibleText("Apple");
			Thread.sleep(4000);
		}
		else
		{
			System.out.println("Not multiple select box");
		}
		
		//Print how many times value are repeated.
		List<WebElement> lt = sel2.getOptions();
		Iterator<WebElement> it=lt.iterator();
		Set<String> st=new HashSet<String>();
		String opt="";
		while(it.hasNext())
		{
			opt=opt+it.next().getText()+" ";
			if(st.add(opt)==false)
			{
				System.out.println("Duplicate element is "+opt);
			}
			
		}
		
		System.out.println("Values in hash set is "+st);
		
		
		
		
		
		driver.close();

	}

}
