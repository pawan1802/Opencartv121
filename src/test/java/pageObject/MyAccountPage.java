package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePageJava{
public MyAccountPage (WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//h2[normalize-space()='My Account']")WebElement msgheading;	

@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")WebElement logout;//ADDED IN STEP 6

public Boolean pageverify()
{
	try
	{
		return(msgheading.isDisplayed());
	}
	catch(Exception e )
	{
		return false;
	}
}
public void clicklogout() 
{
	logout.click();
}

}
