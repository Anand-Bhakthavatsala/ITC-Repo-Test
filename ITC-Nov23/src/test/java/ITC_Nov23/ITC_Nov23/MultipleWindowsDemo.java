package ITC_Nov23.ITC_Nov23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsDemo extends BaseClass{
	
	@Test
	public void window_TC01() throws InterruptedException
	{
		//driver = new ChromeDriver();
		invokeBrowser("chrome");
		driver.navigate().to("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp&theme=glif");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//link and click
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();//parent window
		String help = it.next();//child (Help) window
		
		driver.switchTo().window(help);
		Thread.sleep(3000);//when required
		System.out.println(driver.getTitle());//child window title
		
		driver.switchTo().window(parent);//parent window
		Thread.sleep(3000);//when required
		driver.quit();//close all the windows
	}
}
