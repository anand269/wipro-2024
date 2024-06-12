package TestNGDemos;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WayToAutomation extends BaseClass{
	
	@Test
	public void wayToAutomate()
	{
		invokeBrowser("Chrome");
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		//WebElement element1 = driver.findElement(with(By.tagName("input")).below(By.tagName("input")));
		above .sendKeys("trainer@way2automation.com");
	}

}
