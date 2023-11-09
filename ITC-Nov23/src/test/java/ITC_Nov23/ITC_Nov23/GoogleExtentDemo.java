package ITC_Nov23.ITC_Nov23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GoogleExtentDemo {
	WebDriver driver;
    ExtentReports extent = ExtentManager.createInstance();
    ExtentTest logger = extent.createTest("Google Search Test");

    @Test
    public void testGoogleSearch() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Extent Reports in Selenium");
        searchBox.submit();

        WebElement resultStats = driver.findElement(By.id("result-stats"));
        String result = resultStats.getText();
        logger.log(Status.INFO, "Search Results: " + result);

        driver.quit();
    }
}
