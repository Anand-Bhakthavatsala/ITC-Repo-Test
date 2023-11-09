package ITC_Nov23.ITC_Nov23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesDemo {
	@Test
	public void f() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\GuruSchools13\\test.properties");
		Properties prop = new Properties();
		prop.load(fis);//point to the file -> test.properties
		String url= prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
	}
}
