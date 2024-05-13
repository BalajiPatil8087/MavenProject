package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameText;
	
	@FindBy(name="pwd")
	private WebElement passwordText;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String username,String passworddata)
	{
		usernameText.sendKeys(username);
		passwordText.sendKeys(passworddata);
		loginButton.click();
		return new HomePage(driver);
		
	}
	public WebElement getUsernameText() 
	{
		return usernameText;
	}

	public WebElement getPasswordText() 
	{
		return passwordText;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
		
	
	
	

}
