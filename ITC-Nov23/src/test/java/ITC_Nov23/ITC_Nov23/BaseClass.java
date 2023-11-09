package ITC_Nov23.ITC_Nov23;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseClass {
	
	static WebDriver driver;
	public static void invokeBrowser(String browser) //user defined method/function
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver112\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver_v32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//System.setProperty("webdriver.edge.driver", "C:\\drivers\\edge112\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}		
	}
	
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void screenShot() throws IOException
	{
		//Screenshot code
		File src=null;
		src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./screenshot/"+"Page-"+System.currentTimeMillis()+".png"));
	}

}
