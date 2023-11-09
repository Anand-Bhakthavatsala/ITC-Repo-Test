package ITC_Nov23.ITC_Nov23;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.relevantcodes.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
public class ExtentReportEx {
	WebDriver driver;
	@Test
	public void verifyHomePageTitle() throws IOException
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
 
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
 
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("verifyHomePageTitle", "Checking the Title");
 
		driver = new ChromeDriver();
		System.out.println("Chrome opened");
		// log(Status, details)
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		//test.log(Status.
		driver.get("http://total-qa.com");
		test.log(Status.INFO,"Navigated to URL");
 
		String actual = driver.getTitle();
		test.log(Status.INFO, "Actual Title returned :: " + actual);
 
		//String expected = "TotalQA - Future of Software Testing";
		String expected = "Java Online Quiz- Test your knowledge Java Basics";
		test.log(Status.INFO, "Expected Title returned:: "+ expected);
 
		Assert.assertEquals(actual,expected);
 
		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
 
		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
 
		// calling flush writes everything to the log file
		extent.flush();
 
	}
 
}
