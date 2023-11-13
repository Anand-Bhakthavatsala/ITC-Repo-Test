package RediffTestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;

import org.openqa.selenium.WebDriver;

public class RediffTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		RediffLoginPage rlp;
		RediffHomePage rhp;
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		rlp = new RediffLoginPage(driver);		
		rlp.userName().sendKeys("admin");
		rlp.password().sendKeys("admin123");
		Thread.sleep(2000);
		rlp.signIn().click();
		rlp.rediffHome().click();//home page
		rhp = new RediffHomePage(driver);
		rhp.news().click();
	}

}
