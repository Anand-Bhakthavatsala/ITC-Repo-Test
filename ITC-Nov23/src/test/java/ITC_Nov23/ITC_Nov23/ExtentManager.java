package ITC_Nov23.ITC_Nov23;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        @SuppressWarnings("deprecation")
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();  
       extent.attachReporter(htmlReporter);
      //  extent.attachReporter(null)
        return extent;
    }
}

