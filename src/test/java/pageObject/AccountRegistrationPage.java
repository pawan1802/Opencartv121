package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePageJava{

//constructor
 public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
// locators
@FindBy(xpath="//input[@id='input-firstname']")WebElement firstname; 
@FindBy(xpath="//input[@id='input-lastname']")WebElement lastname;
@FindBy(xpath="//input[@id='input-email']")WebElement email;
@FindBy(xpath="//input[@id='input-telephone']")WebElement telephone;
@FindBy(xpath="//input[@id='input-password']")WebElement password;
@FindBy(xpath="//input[@id='input-confirm']")WebElement confirmpass;
@FindBy(xpath="//input[@name='agree']")WebElement chkpolicy;
@FindBy(xpath="//input[@value='Continue']")WebElement continu;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")WebElement msgconfirm;

//actions
public void setfirstname(String fname)
{
	firstname.sendKeys(fname);
}

public void setlastname(String lname )
{
	lastname.sendKeys(lname);
}

public void setemail(String semail)
{
	email.sendKeys(semail);
}
 public void settelephone(String stele)
 {
	 telephone.sendKeys(stele);
 }

 public void setpass(String spass)
 {
	 password.sendKeys(spass);
 }
 public void setconfirm(String sconfirm)
 {
	 confirmpass.sendKeys(sconfirm);
 }
 
 public void check()
 {
	 chkpolicy.click();
 }
 public void setcontinue()
 {
	 continu.click();
 }
 public  String setconfirmmsg(){
	 try {
		 return(msgconfirm.getText());
		 
	 }
	 catch(Exception e)
	 {
		 return(e.getMessage());
	 }
	 
 }
 
 
 
 
 
 
 
}
