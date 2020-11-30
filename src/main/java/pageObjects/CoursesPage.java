package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {

	//webdriver instance
	//constructor
	//defining weblement
	//creating method for defined webelement
	
	public WebDriver driver;
	
	public CoursesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'Courses')]")
	WebElement title;
	
	public WebElement title()
	{
		return title;
		
	}
	
}
