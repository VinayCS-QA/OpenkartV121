package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath ="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath= "//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcnfPwd;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath= "//input[@value='Continue']")
	WebElement btncontinue;
	
	
	
	@FindBy(xpath= "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);
	}

	public void setLastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txtTelephone.sendKeys(telephone);
	}

	public void setPassowrd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void setConformPassowrd(String pwd)
	{
		txtcnfPwd.sendKeys(pwd);
	}
	
	
	
	public void setPrivacyPolicy()
	{
		chkPolicy.click();
	}
	
	public void clickContinue()
	{
		btncontinue.click();
	}
	
	
	public String getConformation()
	{
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
