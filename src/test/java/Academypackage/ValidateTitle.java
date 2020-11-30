package Academypackage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.CoursesPage;

public class ValidateTitle extends Base {
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

	@BeforeClass
	public void initialize() throws IOException
	{
		driver = initialize_driver();
		log.info("driver initialized in validatetitle class");
		
	}
	
	@Test
	public void validatetitlemethod()
	{
		driver.get("https://courses.rahulshettyacademy.com/courses");
		CoursesPage cp = new CoursesPage(driver);
		String titlename = cp.title().getText();
		System.out.println("name of title is" + titlename);
		log.info("title name extracted from the webpage is " + titlename);
		Assert.assertEquals(titlename, "Courses122");
		log.info("titlename is asserted");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
