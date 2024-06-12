package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

public class NewTabDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
	//	driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.navigate().to("https://login.salesforce.com/");
	//	driver.switchTo().newWindow(WindowType.TAB);//new tab gets created
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();//parent window ->0th index
		String child = it.next();//child window
		driver.switchTo().window(child);
		driver.get("https://www.google.com");
		//Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();//driver.quit();
		
	}

}
