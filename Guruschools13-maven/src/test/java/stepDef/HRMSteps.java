package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import HRMPages.HRMLoginPage;
import io.cucumber.java.en.*;

public class HRMSteps {

	WebDriver driver;
	HRMLoginPage objLogin;


	@Given("User is on HRMLogin page") public void user_is_on_hrm_login_page() {
		// Write code here that turns the phrase above into concrete actions driver =
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//create the login page object 
		objLogin = new HRMLoginPage(driver);
		//  String title = driver.getTitle();

		//Assert 
	}

	@When("User enters username as {string} and {string}")
	public void user_enters_username_as_and(String string, String
			string2) { 
		// Write code here that turns the phrase above into concrete
		//actions 
		objLogin.username(string); 
		objLogin.password(string2);
		//objLogin.submit(); System.out.println("2nd step"); 
	}



	@Then("User should be able to login successfully and home page is displayed")
	public void user_should_be_able_to_login_successfully_and_home_page_is_displayed() { //
		// Write code here that turns the phrase above into concrete actions
		objLogin.submit();

		System.out.println("3rd step"); }




}
