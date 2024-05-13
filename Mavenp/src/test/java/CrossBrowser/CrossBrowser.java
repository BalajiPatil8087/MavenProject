package CrossBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	WebDriver driver;
	@Test
	@Parameters("Browser")
	public void acti(String Browser) 
    {
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else 
		{
			if(Browser.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			driver.get("https://demo.actitime.com/login.do");
			String element = driver.getTitle();
			System.out.println(element);
		}
		
  	  
      
    }

}
