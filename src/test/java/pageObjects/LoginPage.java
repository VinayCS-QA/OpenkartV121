package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
    
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnlogin;
	
	@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
	WebElement errormsg;
	
	@FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement frgpass;
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	public String geterrormsg()
	{
		try
		{
			return(errormsg.getText());
		}
		catch(Exception e)
		{
		return(	e.getMessage());
		}
	}
	public void forgotlink()
	{
		frgpass.click();
	}

}
