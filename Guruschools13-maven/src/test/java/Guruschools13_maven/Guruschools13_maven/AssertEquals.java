package Guruschools13_maven.Guruschools13_maven;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.Assert;

	import org.testng.annotations.Test;

	public class AssertEquals {

	WebDriver driver;

	@Test

	public void validate() {

	Assert.assertEquals("Guruschool","Guruschool");

	System.out.println("Both are equal"); 

	}

	@Test

	public void validate1() {

	Assert.assertEquals(6,6);

	System.out.println("Both are equal");

	}

	@Test

	public void googleTitle() throws InterruptedException {

	driver=new ChromeDriver();

	driver.get("https://www.google.com/");

	Assert.assertEquals(driver.getTitle(),"Google");

	System.out.println("Both title are match");
	Thread.sleep(2000);
	driver.close();
	}
}
