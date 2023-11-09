package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="D:\\Users\\Hp\\eclipse-workspace\\Guruschools13-maven\\src\\test\\java\\feature\\tester.feature",
		features="D:\\Users\\Hp\\eclipse-workspace\\ITC-Nov23\\src\\test\\java\\feature\\loginreset.feature",
		glue="stepDef",
		plugin = {"pretty","html:target/HTML_Reports"},
		//plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
	)
public class LoginTest {

}
