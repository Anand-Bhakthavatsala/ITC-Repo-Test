package RediffTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;
import RediffPages.RediffLoginPagePF;


public class RediffLoginTC2PF {
	
	WebDriver driver;
	RediffLoginPagePF rlp;
	RediffHomePage rhp;
	
	@BeforeTest
	public void invokeBrowser()
	{
		driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void rediffLogin() throws InterruptedException
	{
		//driver = new ChromeDriver();//browser will launch
		
		//perform the action in Rediff login page
		rlp = new RediffLoginPagePF(driver);
		rlp.userName().sendKeys("admin");
		rlp.password().sendKeys("admin123");
		Thread.sleep(2000);
		rlp.signIn().click();
		
		//goto home page
		rlp.rediffHome().click();
		
		rhp = new RediffHomePage(driver);
		rhp.news().click();
		Thread.sleep(2000);
		rhp.sports().click();		
		Assert.assertEquals("Sports news, Cricket, Hockey, Tennis, Football, Formula 1, Live Cricket", driver.getTitle());
		System.out.println("Title matching");
	}

}
