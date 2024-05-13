package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class batchExceution2 
{
	@Test
	public void filp()
	{
		 WebDriver driver=new ChromeDriver();
		   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://www.flipkart.com/");
	     
	     driver.getTitle();
		
	}
	@Test
	public void Naukri()
	{
		 WebDriver driver=new ChromeDriver();
		   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://www.naukri.com/");
	     
	     driver.getTitle();
		
	}

}
