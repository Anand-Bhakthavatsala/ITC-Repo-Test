package HRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMLoginPage {
	
	WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	By submit = By.cssSelector("button[type='submit']");
	
	public HRMLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void username(String username)
	{
		driver.findElement(userName).sendKeys(username);
	}
	
	public void password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}	
	
	public void submit()
	{
		driver.findElement(submit).click();
	}
	
}