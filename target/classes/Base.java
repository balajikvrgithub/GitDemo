package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;

	public WebDriver initialize_driver() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Eclipse 2020 workspace\\End2EndProject\\src\\main\\java\\Resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\recentchrome\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Selenium\\Drivers\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("invalid browser fed to the code");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;		
	}
	
	public String getscreenshot(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"\\reports\\" + testcasename+ ".jpg";
		FileUtils.copyFile(source, new File(destfile));
		return destfile;
	}
	
}
