package Guruschools13_maven.Guruschools13_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void valdiate()
	{
		Assert.assertEquals("GuruSchools13", "GuruSchools13");
		System.out.println("Both are equal");
	}
	
	@Test
	public void v2()
	{
		Assert.assertEquals(5,5);
		System.out.println("Both are equal");
	}
	
	@Test
	public void googleTitle()
	{
		driver = new ChromeDriver();//invoke the browser
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(),"Google");
		System.out.println("Title is matching");
		Assert.assertTrue(false);//execute or not ?
		System.out.println("True");
	}

}
