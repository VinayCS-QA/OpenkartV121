package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(linkText = "Login")
	WebElement login;
	
	
	public void clickMyAccount()
	{
		myAccount.click();
	}
	
	public void clickRegister()
	{
		register.click();
	}
	
	public void clicklogin()
	{
		login.click();
	}

}
