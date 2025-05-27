package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class Tc_001_AccountRegistrationPage extends BaseClass
{
	@Test(groups= {"Regression","Master"})
  public void verify_account_regstration() 
  {
		logger.info("***** Starting Tc_001_AccountRegistrationPage  ****");
		logger.debug("This is a debug log message");
	  try 
	  {
	  HomePage hp = new HomePage(driver);
	  hp.clickMyAccount();
	  logger.info("Clicked on MyAccount Link.. ");
	  
	  hp.clickRegister();
	  logger.info("Clicked on Register Link.. ");

	  
	  
	  AccountRegistrationPage ac = new AccountRegistrationPage(driver);
	  
	  logger.info("Providing customer details...");
	  ac.setFirstName(randomeString().toUpperCase());
	  ac.setLastname(randomeString().toUpperCase());
	  ac.setEmail(randomeString()+"@gmail.com");
	  ac.setTelephone(randomeNumber());
	  
	  String password=randomAlphaNumeric();
		
	  ac.setPassowrd(password);
	  ac.setConformPassowrd(password);
	
	  ac.setPrivacyPolicy();
	  ac.clickContinue();
	  
	  logger.info("Validating expected message..");
	  
   	String confmsg =  ac.getConformation();
	Assert.assertEquals(confmsg, "Your Account Has Been Created!" ,"Confirmation message mismatch" );
	
	logger.info("Test passed");
	  }
	  catch (Exception e)
	  {
		 logger.error("Test failed: " + e.getMessage());
		 Assert.fail("Test failed: " + e.getMessage());
	  }
	  finally
	  {
		 logger.info("***** Finished Tc_001_AccountRegistrationPage *****");
	  }
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
