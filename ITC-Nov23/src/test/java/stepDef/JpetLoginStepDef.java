package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class JpetLoginStepDef {
	WebDriver driver;
	@Given("Open the Firefox and launch Jpetstore application")
	public void open_the_firefox_and_launch_jpetstore_application() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Open the Firefox and launch the application");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	}
	@When("Enter Username and Password")
	public void enter_username_and_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ank1234");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	}

	@Then("Click Login button")
	public void click_login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='signon']"));
		loginButton.click();
	}

}
