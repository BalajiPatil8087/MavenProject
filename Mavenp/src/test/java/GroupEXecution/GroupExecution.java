package GroupEXecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupExecution 
{
	@Test(groups="System")
	public void filp()
	{
		 WebDriver driver=new ChromeDriver();
		   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://www.flipkart.com/");
	     
	     driver.getTitle();
		
	}
	@Test(groups="functinal")
	public void Naukri()
	{
		 WebDriver driver=new ChromeDriver();
		   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://www.naukri.com/");
	     
	     driver.getTitle();
		
	}

}

/*
  <groups>
  <run>
  <include name="System"></include>
  </run>
  </groups>
 */
