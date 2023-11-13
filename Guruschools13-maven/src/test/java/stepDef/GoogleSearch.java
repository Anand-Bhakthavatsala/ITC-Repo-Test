package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	
	WebDriver driver;
	WebElement txtBox;
	
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   System.out.println("Browser opened");
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
		 System.out.println("user is on google search page");
	}

	@Given("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//Thread.sleep(3000);
		txtBox=driver.findElement(By.id("APjFqb"));
		txtBox.sendKeys("Cucumber BDD");
		System.out.println("user enters a text in search box");
	}

	@Then("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		txtBox.sendKeys(Keys.ENTER);
		System.out.println("hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to search results");
	}

	@Then("close the broswer")
	public void close_the_broswer() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.close();
		System.out.println("close the broswer");
	}

}
