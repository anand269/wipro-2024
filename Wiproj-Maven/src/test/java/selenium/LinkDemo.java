package selenium;

import org.openqa.selenium.By;

public class LinkDemo extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Download Wikipedia")).click();
		
	}

}
