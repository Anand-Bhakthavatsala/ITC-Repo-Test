package RediffTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Guruschools13_maven.Guruschools13_maven.BaseClass;
import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;


public class RediffLoginExcel{


	//Properties file
	Properties prop;
	FileInputStream fis;
	RediffHomePage rhp;
	RediffLoginPage rlp;
	WebDriver driver;
	String username,password;
	//BaseClass bc;
	@BeforeTest
	public void initialize() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\GuruSchools13\\test.properties");
		prop.load(fis);

		// Excel file
		fis = new FileInputStream("D:\\Automation\\AutomationData.xlsx");
		//Workbook to identify the excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Selenium");
		int rowcount = sheet.getPhysicalNumberOfRows();//count of rows
		System.out.println("No of records/rows : "+rowcount);
		//get the column count
		int columncount = sheet.getRow(4).getPhysicalNumberOfCells();
		System.out.println("No of columns : "+columncount);
		//Get the particular cell value
		username = sheet.getRow(4).getCell(0).getStringCellValue();
		password = sheet.getRow(4).getCell(1).getStringCellValue();
		driver = new ChromeDriver();
		//invokeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void rediffLogin() throws InterruptedException
	{
		/*
		 * String url= prop.getProperty("url"); System.out.println(url);
		 * System.out.println(prop.getProperty("userName"));
		 * System.out.println(prop.getProperty("password"));
		 * System.out.println(prop.getProperty("browser"));
		 */
		
		//properties file reading
		rlp = new RediffLoginPage(driver);
		rlp.userName().sendKeys(prop.getProperty("userName"));
		rlp.password().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		rlp.signIn().click();

		//Excel reading
		rlp.userName().clear();
		rlp.password().clear();
		rlp.userName().sendKeys(username);
		rlp.password().sendKeys(password);
		rlp.rediffHome().click();//Rediff home page
		String actualTitle=driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Titles are matching");


	}



}
