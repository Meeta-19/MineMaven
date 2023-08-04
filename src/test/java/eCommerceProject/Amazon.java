package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon 
{
  @Test
  public void amazontest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Reporter.log("Opening Amazon", true);
	  Thread.sleep(5000);
	  driver.close();
  }
}
