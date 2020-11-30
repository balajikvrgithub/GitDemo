package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasswordpage {

public WebDriver driver;
	
	public Forgotpasswordpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement recoveryemail;
	
	@FindBy(xpath="//*[@value='Send me instructions']")
	WebElement send_me_instructions;
	
	public WebElement recoveryemail()
	{
		return recoveryemail;
	}
	
	public WebElement send_me_instructions()
	{
		return send_me_instructions;
	}
	

	
}
