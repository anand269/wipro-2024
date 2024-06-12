package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class GoogleDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		// call the invoke browser
		invokeBrowser("Edge");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximum waiting period -10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");//2 secs
		//Identify the text area
		WebElement searchArea = driver.findElement(By.name("q"));
		//Performing the action - Enter the value
		searchArea.sendKeys("testing");
		Thread.sleep(1000);
		List<WebElement> hints = driver.findElements(By.xpath("//span[contains(text(),'testing')]"));
		System.out.println(hints.size());//correct o/p?
		//searchArea.sendKeys(Keys.ENTER);//click on enter from the keyboard
		Thread.sleep(5000);
		
		//screen shot code
		File src=null;	
		src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./screenshot/"+"Page-"+".png"));
		//for()
		
		closeBrowser();
		
	}

}
