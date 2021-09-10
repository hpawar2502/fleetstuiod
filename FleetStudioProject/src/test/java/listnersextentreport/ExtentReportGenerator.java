package listnersextentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	static ExtentReports  extent;
	public static ExtentReports extentReportGenerator()
	{
		
	String path= System.getProperty("user.dir")+ "\\reports\\fleetstudio.html";
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	
	reporter.config().setReportName("FleetStudioTestReport");	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Organization", "Fleet_Studio");		
	return extent;
	
	
	}

}
