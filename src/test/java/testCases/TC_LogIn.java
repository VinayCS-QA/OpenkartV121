package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;

public class TC_LogIn extends BaseClass
{
//	@Test(groups= {"Sanity","Master"},priority=1)
//	public void verify_login()
//	{
//		logger.info("*********Starting TC_001_LoginTest**********");
//		try
//		{
//			
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clicklogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.setEmail(p.getProperty("email"));
//		lp.setPassword(p.getProperty("password"));
//		lp.clicklogin();
//		
//		MyaccountPage macc = new MyaccountPage(driver);
//		boolean targetpage =macc.isMyAccountPageExists();
//		
//		Assert.assertTrue(targetpage);
//		}
//		catch(Exception e)
//		{
//			Assert.fail();
//		}
//		
//		logger.info("*****Fineshed TC_001_LoginTest*********");
//		
//	}
	
//	
//	@Test(groups= {"Sanity","Master"},priority=2)
//	public void invalied_login()
//	{
//		logger.info("*********Starting Tc_002_LoginTest**********");
//		try
//		{
//			
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clicklogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.setEmail(p.getProperty("email"));
//		lp.setPassword(p.getProperty("password"));
//		lp.clicklogin();
//		
//		String errormsg = lp.geterrormsg();
//		Assert.assertEquals(errormsg, "Warning: No match for E-Mail Address and/or Password.");
//		}
//		catch(Exception e)
//		{
//			Assert.fail(e.getMessage());
//		}
//		
//		logger.info("*****Fineshed Tc_002_LoginTest*********");
//		
//	}
//
//	
//	@Test(groups= {"Sanity","Master"},priority=3)
//	public void invalied_email()
//	{
//		logger.info("*********Starting Tc_003_LoginTest**********");
//		try
//		{
//			
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clicklogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.setEmail(p.getProperty("email"));
//		lp.setPassword(p.getProperty("password"));
//		lp.clicklogin();
//		
//		String errormsg = lp.geterrormsg();
//		Assert.assertEquals(errormsg, "Warning: No match for E-Mail Address and/or Password.");
//		}
//		catch(Exception e)
//		{
//			Assert.fail(e.getMessage());
//		}
//		
//		logger.info("*****Fineshed Tc_003_LoginTest*********");
//		
//     }
	
	
//	@Test(groups= {"Sanity","Master"},priority=4)
//	public void invalied_password()
//	{
//		logger.info("*********Starting Tc_004_LoginTest**********");
//		try
//		{
//			
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clicklogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.setEmail(p.getProperty("email"));
//		lp.setPassword(p.getProperty("password"));
//		lp.clicklogin();
//		
//		String errormsg = lp.geterrormsg();
//		Assert.assertEquals(errormsg, "Warning: No match for E-Mail Address and/or Password.");
//		}
//		catch(Exception e)
//		{
//			Assert.fail(e.getMessage());
//		}
//		
//		logger.info("*****Fineshed Tc_004_LoginTest*********");
//		
//	}
	
//	@Test(groups= {"Sanity","Master"},priority=5)
//	public void empty_field()
//	{
//		logger.info("*********Starting Tc_005_LoginTest**********");
//		try
//		{
//			
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clicklogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		
//		lp.clicklogin();
//		
//		String errormsg = lp.geterrormsg();
//		Assert.assertEquals(errormsg, "Warning: No match for E-Mail Address and/or Password.");
//		}
//		catch(Exception e)
//		{
//			Assert.fail(e.getMessage());
//		}
//		
//		logger.info("*****Fineshed Tc_005_LoginTest*********");
//		
//	}

	@Test(groups= {"Sanity","Master"},priority=6)
	public void empty_field()
	{
		logger.info("*********Starting Tc_006_LoginTest**********");
		
			
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.forgotlink();
		
		logger.info("*****Fineshed Tc_006_LoginTest*********");
		
	}
	
}


