package RediffTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;

public class RediffLoginExcel {
	
	//Properties file
	Properties prop;
	FileInputStream fis;
	RediffHomePage rhp;
	RediffLoginPage rlp;
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	String username,password; 
	
	@BeforeMethod
	public void initialize() throws IOException
	{
		//Properties file
		prop = new Properties();
		fis = new FileInputStream("D:/Users/Hp/eclipse-workspace/Wiproj-Maven/src/test/java/TestNGDemos/data.properties");
		prop.load(fis);
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		//Excel file
		fis = new FileInputStream("D:\\Automation\\AutomationData.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Selenium");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(1).getPhysicalNumberOfCells();
		username = sheet.getRow(1).getCell(0).getStringCellValue();
		password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void rediffLoginProperties() throws InterruptedException
	{
		rlp = new RediffLoginPage(driver);//crating instance of RLP
		rlp.userName().sendKeys(prop.getProperty("username"));
		rlp.password().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		rlp.userName().clear();
		rlp.password().clear();
		System.out.println("Properties file reading is done");
	}
	
	@Test
	public void rediffLoginExcel() throws InterruptedException
	{
		rlp = new RediffLoginPage(driver);//crating instance of RLP
		rlp.userName().sendKeys(username);
		rlp.password().sendKeys(password);
		Thread.sleep(2000);
		rlp.userName().clear();
		rlp.password().clear();
		System.out.println("Excel reading is done");
	}
	
	@AfterMethod
	public void close() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
