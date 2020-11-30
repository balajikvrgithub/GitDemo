package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement login_btn;	
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	WebElement forgotpwd;
	
	public WebElement email()
	{
		return email;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login_btn()
	{
		return login_btn;
	}
	
	public Forgotpasswordpage forgotpwd()
	{
		forgotpwd.click();		
		return new Forgotpasswordpage(driver);
	}	
}