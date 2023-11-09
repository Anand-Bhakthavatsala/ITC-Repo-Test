package ITC_Nov23.ITC_Nov23;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
public class TestNGDemo2 {
	/*
	 * @Test public void f() { System.out.println("Welcome to TestNG"); }
	 */
	WebDriver driver;
	@Test // acting like main() method
	public void rediff() {
		
		driver.get("https://rediff.com/");
		Assert.assertEquals(driver.getTitle(), "rediff");
		System.out.println("Title matching");
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
  }

  
	/*
	 * @BeforeSuite public void beforeSuite() { System.out.println("@BeforeSuite");
	 * }
	 */

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
