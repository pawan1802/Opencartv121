package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HOMEpageJAVA;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testbase.BaseClassJava;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClassJava {

    @Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="Datadriven")
    public void verify_login(String email,String pwd,String exp) throws InterruptedException {
        try {
            logger.info("*****Starting TC003_LoginDDT ****** ");
            HOMEpageJAVA hp = new HOMEpageJAVA(driver);
            hp.clickmyaccount();
            hp.setlogin();

            LoginPage lp = new LoginPage(driver);
            lp.loginu(email);
            lp.setpass(pwd);
            lp.clicklogin();

            MyAccountPage macc = new MyAccountPage(driver);
            boolean targetpage = macc.pageverify();		

            if(exp.equalsIgnoreCase("Valid"))
    		{
    			if(targetpage==true)
    			{			
    				macc.clicklogout();
    				Assert.assertTrue(true);
    				
    			}
    			else
    			{
    				Assert.assertTrue(false);
    			}
    		}
    		
    		if(exp.equalsIgnoreCase("Invalid"))
    		{
    			if(targetpage==true)
    			{
    				macc.clicklogout();
    				Assert.assertTrue(false);
    				
    			}
    			else
    			{
    				Assert.assertTrue(true);
    			}
    		}
    		
    		}catch(Exception e)
    		{
    			Assert.fail();
    		}
    		Thread.sleep(3000);
    		logger.info("***** Finished TC_003_LoginDDT ******");
    		
    	}
    	
    }