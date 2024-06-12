package RediffTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPage;
import RediffPages.RediffLoginPagePF;

public class RediffLoginTC1 {
	
	WebDriver driver;
	RediffLoginPage rlp;
	RediffHomePage rhp;
	RediffLoginPagePF rlpf;
	
	@BeforeTest
	public void invokeBrowser()
	{
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");		
	}
	
		
	@Test (enabled=true,groups="sanity")
	public void rediffTC1() throws InterruptedException
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rlp = new RediffLoginPage(driver);
		rlp.userName().sendKeys("Admin");
		rlp.password().sendKeys("admin123");
		Thread.sleep(2000);
		rlp.signIn().click();//clicking on sign in btn 
		driver.navigate().back();
		rlp.rediffHome().click();//take us to the home page
		
		rhp = new RediffHomePage(driver);
		rhp.news().click(); //taking you to new pages
		Thread.sleep(2000);
		rhp.sports().click();
		System.out.println("We have reached sports tab");
		
		//Title matching using Assert		
				
	}
	
	@Test (enabled=false,groups="sanity")
	public void rediffTC2() throws InterruptedException
	{
		driver.get("https://www.rediff.com/");
		rhp = new RediffHomePage(driver);
		//rhp.news().click(); //taking you to new pages
		//Thread.sleep(2000);
		rhp.sports().click();
	}
	
	@Test (enabled=false,groups="regression")
	public void rediffTC3() throws InterruptedException
	{
		rlpf = new RediffLoginPagePF(driver);
		rlpf.userName().click();
		rlpf.userName().clear();//clear the field values if any
		rlpf.userName().sendKeys("admin");
		rlpf.password().sendKeys("admin123");
		rlpf.rediffHome().click();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
