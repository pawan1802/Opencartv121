package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageJava {
WebDriver driver;

BasePageJava(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
