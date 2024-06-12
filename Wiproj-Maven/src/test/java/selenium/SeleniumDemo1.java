package selenium;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
*/
public class SeleniumDemo1 extends BaseClass{
	//static WebDriver driver=null;//class level variable
	public static void main(String[] args) throws InterruptedException {
		// Invoke browser -> run time polymorphism
		//driver = new ChromeDriver();//open the Chrome browser
		//driver = new FirefoxDriver();//open firefox browser 
		//driver = new EdgeDriver();//MS edge browser
		//driver.manage().window().maximize();//maximize the window size
		invokeBrowser("firefox");//calling the method	
		//Enter the url
		driver.get("https://www.google.com");
		
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		String eTitle="google";
		//Title validation TC - Google(Expected) --> Google(Actual) -> PASS
		//Title validation
		if(eTitle.equalsIgnoreCase(aTitle))//true
		{
			System.out.println("Titles are matching - TC PASS");
		}
		else
			System.out.println("Titles are not matching - TC Fail");
		
		Thread.sleep(2000);//2000 millisec is 2 sec
		
		//navigating to the url
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().back();//move back on the browser
		driver.navigate().forward();//move forward
		driver.navigate().refresh();//refresh the page
	//	driver.close();//close the current browser
		
		closeBrowser();
		
	}
	

}
