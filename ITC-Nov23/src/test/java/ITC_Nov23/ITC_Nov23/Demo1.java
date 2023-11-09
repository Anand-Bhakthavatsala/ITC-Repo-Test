package ITC_Nov23.ITC_Nov23;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Demo1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();//invoke the browser
		
		driver.get("https://www.google.com/");//enter the url
		driver.manage().window().maximize();//mzximing the window
		//Locating the search box
		driver.findElement(By.id("APjFqb")).sendKeys("test");
		List<WebElement> suggestions = driver.findElements(By.id("hello"));
		//search.sendKeys("Automation");//action		
		/*
		 * driver.navigate().to(
		 * "https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html#navigate()"
		 * ); Thread.sleep(2000);//forcefull sleep driver.navigate().back();
		 * Thread.sleep(2000); driver.navigate().forward(); Thread.sleep(2000);
		 * driver.getTitle(); driver.getCurrentUrl();// driver.close();
		 * invokeBrowser("chrome");
		 */
		
		RelativeLocator.with(null)
		 
	}
	
	public static void invokeBrowser(String browser)
	{
		//logic
	}
	
	public static void closeBrowser()
	{
		//logic
	}

}
