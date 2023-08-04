package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipKart 
{
  @Test
  public void flipKartTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Reporter.log("Opening FlipKart", true);
	  Thread.sleep(5000);
	  driver.close();
  }
}
