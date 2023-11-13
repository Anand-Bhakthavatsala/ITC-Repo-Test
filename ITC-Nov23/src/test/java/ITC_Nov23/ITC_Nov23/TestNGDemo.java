package ITC_Nov23.ITC_Nov23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class TestNGDemo {
	WebDriver driver;

	/*
	 * @BeforeMethod public void invokeBrowser() { driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); }
	 */
	/*
	 * @Parameters("browser")
	 * 
	 * @Test //(priority = 0) // acting like main() method public void google() {
	 * driver = new ChromeDriver(); driver.get("https://www.google.com/");
	 * Assert.assertEquals(driver.getTitle(), "Google");
	 * System.out.println("Title matching"); }
	 */
	@Parameters("browser")
	@Test //(enabled=true) // acting like main() method
	public void practicePage(String browser) throws InterruptedException {
		//driver = new FirefoxDriver();
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Assert.assertEquals(driver.getTitle(), "rediff");
		System.out.println("Title matching");
		Thread.sleep(2000);
		driver.close();
	}
	/*
	 * @Parameters("browser")
	 * 
	 * @Test //(enabled=true) // acting like main() method public void mavenLink() {
	 * //driver = new FirefoxDriver(); driver = new ChromeDriver();
	 * driver.get("https://www.mvnrepository.com");
	 * //Assert.assertEquals(driver.getTitle(), "rediff");
	 * System.out.println("Title matching"); }
	 * 
	 * @Test(enabled=false) // acting like main() method public void skipTest() {
	 * 
	 * throw new SkipException(null); }
	 * 
	 * @AfterMethod public void closeBrowser() throws InterruptedException {
	 * Thread.sleep(2000); driver.close(); }
	 */

	/*
	 * @Test (priority=-1)//acting like main() method public void bye() {
	 * System.out.println("done TestNG");
	 * 
	 * Assert.assertEquals(driver.getTitle(), "google"); Assert.assertEquals(false,
	 * true);//failure
	 * 
	 * }
	 */
}
