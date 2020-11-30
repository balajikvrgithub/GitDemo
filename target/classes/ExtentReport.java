package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	static ExtentReports ex;

	public static ExtentReports getreportobject()
	{
		//extentreports and extentspark reports
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter	rep = new ExtentSparkReporter(path);
		rep.config().setReportName("Web Automation Results");
		rep.config().setDocumentTitle("test results");
	
		ex = new ExtentReports();
		ex.attachReporter(rep);
		ex.setSystemInfo("Tester", "Balaji Ramanan");	
		return ex;
	}
	
	
}
