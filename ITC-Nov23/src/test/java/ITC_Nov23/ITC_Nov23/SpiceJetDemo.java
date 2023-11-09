package ITC_Nov23.ITC_Nov23;

import java.time.Duration;

import org.openqa.selenium.By;

public class SpiceJetDemo extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.linkText("Airports")).click();
	}

}
