package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  public Loginpage logout()
	  {
		  logoutbutton.click();
		  return new Loginpage(driver);
	  }
	  
	  public WebElement getLogoutButton()
	  {
		  return logoutbutton;
	  }

}
