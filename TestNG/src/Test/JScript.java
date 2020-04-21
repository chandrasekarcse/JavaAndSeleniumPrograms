package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class JScript extends Base {
	
	  @Test
	  public void f() throws InterruptedException {
	  JavascriptExecutor js=((JavascriptExecutor)driver); 
	  WebElement ele=driver.findElement(By.id("identifierId"));
	  
	  js.executeScript("arguments[0].value='sekar'", ele); 
	  Thread.sleep(5000);
	  }
	 
  
  
  @BeforeMethod
  public void beforeMethod() {
	  intialize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
