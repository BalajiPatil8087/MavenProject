package ParallelExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 
{
	 @Test
     public void acti() 
     {
   	  
        WebDriver driver=new ChromeDriver();
	   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://demo.actitime.com/login.do");
	     
	     driver.getTitle();
     }
     
     @Test
     public void facebook()
     {
   	  WebDriver driver=new ChromeDriver();
  	   
	     driver.manage().window().maximize();
	  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	     driver.get("https://www.facebook.com/"); 
	     
	     driver.getCurrentUrl();
     }
}
