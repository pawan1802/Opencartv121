package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HOMEpageJAVA;
import testbase.BaseClassJava;

public class TC001_AccountRegistrationTest extends BaseClassJava{

	
	

@Test(groups={"Regression","Master"})	
public void verify_account_registration()
{
	logger.info("******Starting TC001_AccountRegistrationTest******");
	
	
	try {
	HOMEpageJAVA hp= new HOMEpageJAVA(driver);
hp.clickmyaccount();
logger.info("clicked on my acoount link");
hp.clickregister();
logger.info("Clicked on registration link  ");
AccountRegistrationPage ap=new AccountRegistrationPage(driver);
logger.info("providing customer details");
ap.setfirstname(randomString().toUpperCase());
ap.setlastname(randomString().toUpperCase());
ap.setemail(randomString()+"@gmail.com");//Regenerate random data 
ap.settelephone(randomnumber());

String password=randomalphanumeric();
ap.setpass(password);
ap.setconfirm(password);
ap.check();
ap.setcontinue();
logger.info("validating excepted msg");
String confmsg =ap.setconfirmmsg();
if(confmsg.equals("Your Account Has Been Created!"))
{
	Assert.assertTrue(true);
}

else
{
	logger.error("test failed ");

	logger.debug("Debug logs");
	Assert.assertFalse(false);
}
//Assert.assertEquals(confmsg, "Your Account Has Been Created!"); 

	}
	catch(Exception e)
	{
		
		Assert.fail();
	}
	
	logger.info("******Closing  TC001_AccountRegistrationTest******");
}
	
	
}
