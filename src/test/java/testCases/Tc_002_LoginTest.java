package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;

public class Tc_002_LoginTest extends BaseClass
{

	@Test(groups= {"Sanity","Master"})
	public void verify_login()
	{
		logger.info("*********Starting TC_001_LoginTest**********");
		try
		{
			
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clicklogin();
		
		MyaccountPage macc = new MyaccountPage(driver);
		boolean targetpage =macc.isMyAccountPageExists();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*****Fineshed TC_001_LoginTest*********");
		
	}
	
	
}
 