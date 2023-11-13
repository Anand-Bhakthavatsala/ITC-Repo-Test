package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	//initialising the value 
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * By userName = By.xpath("//input[@id='login1']"); By password =
	 * By.cssSelector("input[id='password']"); By signIn = By.name("proceed"); By
	 * rediffHome = By.linkText("rediff.com");
	 */
	
	@FindBy(xpath="//input[@id='login1']") WebElement userName;
	@FindBy(id="password") WebElement password;
	@FindBy(name="proceed") WebElement signIn;	
	@FindBy(linkText="rediff.com") WebElement rediffHome;
	
	public WebElement userName()//user defined method
	{
		//driver.findElement(By.xpath(""));
		return userName;		
	}
	
	public WebElement password()
	{
		return password;
		
	}
	
	public WebElement signIn()
	{
		return signIn;
		
	}
	
	public WebElement rediffHome()
	{
		return rediffHome;
		
	}
}
