package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class Tc_003_LoginDDT  extends BaseClass 
{
	@Test(dataProvider="LoginData" , dataProviderClass= DataProviders.class , groups= {"DataDriven"})
	public void verifylogin(String email , String pwd , String exp)
	{
		logger.info("*********** started Tc_003_LoginDDT************");
		try
		{
		//Homepage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clicklogin();
		
		//Myaccountpage
		MyaccountPage macc = new MyaccountPage(driver);
	    boolean targetpage=	macc.isMyAccountPageExists();
	
	
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage == true)
			{
				macc.clicklogout();
				Assert.assertTrue(true);  //successfull login test passed
			}
			else
			{
				Assert.assertTrue(false); // login failed and test fail
			}
		}
		
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage== true)
			{
				macc.clicklogout();
				Assert.assertTrue(false); // successfull login and test failed 
			}
			else
			{
				Assert.assertTrue(true); // login failed and test passed 
			}
		}
	    }
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		logger.info("*********** fineshed  Tc_003_LoginDDT************");
	}
		
		
}

	
	
	
	

