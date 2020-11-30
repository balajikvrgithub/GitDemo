package Academypackage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Resources.Base;
import pageObjects.Forgotpasswordpage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class Homepage extends Base{

	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(Homepage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initialize_driver();
		log.info("driver initialized in homepage class");
	}	
	
	//(dataProvider = "dataprovidermethod")
	//public void HomePageNavigation(String email, String password) throws IOException, InterruptedException
	@Test
	public void HomePageNavigation() throws IOException, InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com");
		Thread.sleep(2000);
		LandingPage lp = new LandingPage(driver);
		Thread.sleep(2000);
		LoginPage lop = lp.login();
		Thread.sleep(2000);
		Forgotpasswordpage fpp = lop.forgotpwd();
		Thread.sleep(2000);
		fpp.recoveryemail().sendKeys("recoveryai@ggmial.com");
		Thread.sleep(2000);
		fpp.send_me_instructions().click();
		System.out.println("post jira");
		System.out.println("post jira1");
		System.out.println("post jira2");
		
		System.out.println("post jira3");
		System.out.println("post jira4");
		System.out.println("post jira5");
		
//		lop.email().sendKeys(email);
//		log.debug("email id entered");
//		lop.password().sendKeys(password);
//		log.debug("password id entered");
//		lop.login_btn().click();
//		Thread.sleep(4000);
//		log.debug("login button is clicked");
//		
//		log.info("an user is checked using dataprovider concept");
		
				
	}
	
//	@DataProvider
//	public Object[][] dataprovidermethod()
//	{
//		//row stands for how many set of data we want the test to run
//		//column stands for how many values per set we want to pass(i.e username and password)
//		Object[][] data = new Object[3][2];
//		
//		data[0][0] = "aa@gmail.com";
//		data[0][1] = "apwd";
//		
//		data[1][0] = "bb@gmail.com";
//		data[1][1] = "bpwd";
//		
//		data[2][0] = "cc@gmail.com";
//		data[2][1] = "cpwd";
//		
//		return data;
//	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

