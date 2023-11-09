package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class OrangeHRMSLogin {
	WebDriver driver;
	@Given("Open the Firefox and launch the application")
	public void open_the_firefox_and_launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Open the Firefox and launch the application");
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter the Username and Password");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("Reset the credential")
	public void reset_the_credential() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Reset the credential");
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
