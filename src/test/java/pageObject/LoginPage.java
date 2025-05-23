package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageJava{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-email']")WebElement putemail;
	@FindBy(xpath="//input[@id='input-password']")WebElement putpass;
	@FindBy(xpath="//input[@value='Login']")WebElement putlogin;
	
	public void loginu(String email) 
	{
	putemail.sendKeys(email);	
	}
	public void setpass(String pass)
	{
		putpass.sendKeys(pass);
	}
	public void clicklogin()
	{
		putlogin.click();
	}
	
	
	
	
	
	
	
	
	
	
}
