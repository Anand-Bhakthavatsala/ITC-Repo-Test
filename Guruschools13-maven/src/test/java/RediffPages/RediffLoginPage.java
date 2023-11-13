package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	//initialising the value 
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By userName = By.xpath("//input[@id='login1']");
	By password = By.cssSelector("input[id='password']");
	By signIn = By.name("proceed");
	By rediffHome = By.linkText("rediff.com");
	
	public WebElement userName()//user defined method
	{
		//driver.findElement(By.xpath(""));
		return driver.findElement(userName);		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signIn);
		
	}
	
	public WebElement rediffHome()
	{
		return driver.findElement(rediffHome);
		
	}
}
