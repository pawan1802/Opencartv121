package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HOMEpageJAVA;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testbase.BaseClassJava;

public class TC002_LoginTest extends BaseClassJava{
	@Test(groups={"Sanity","Master"})
	public void verifylogin()
	{
		logger.info("******Starting TC002_LoginTest******");
		try {
		HOMEpageJAVA hp=new HOMEpageJAVA(driver);
		hp.clickmyaccount();
		hp.clickregister();
		hp.setlogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.loginu(p.getProperty("email"));
		lp.setpass(p.getProperty("password"));
		lp.clicklogin();
		
		MyAccountPage ap=new MyAccountPage(driver);
		Boolean targetpage=ap.pageverify();
		//Assert.assertEquals(targetpage, true);
		Assert.assertTrue(targetpage);
		logger.info("*****finished TC002_LoginTest*****");
		}
		catch(Exception e) 
		{
		Assert.fail();	
		}
		
		
		}
	
	
	

}
