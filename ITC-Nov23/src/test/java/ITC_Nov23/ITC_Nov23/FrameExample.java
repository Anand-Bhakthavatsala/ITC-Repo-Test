package ITC_Nov23.ITC_Nov23;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class FrameExample extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	WebDriverWait wait = new WebDriverWait(driver,10);
		//	wait.until(arg0)
		//file:///E:/Anand/Automation/html/iframpage.html
		driver.get("file:///E:/HPLaptop-Backup/Anand/Automation/html/iframpage.html");
		driver.findElement(By.id("t1")).sendKeys("Testing");
		//switching into frame 
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("Frame test");
		//	driver.switchTo().defaultContent();//go back to main page
		driver.switchTo().parentFrame();		

		Thread.sleep(2000);
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.clear();
		Thread.sleep(2000);
		t1.sendKeys("bye");

	}

}
