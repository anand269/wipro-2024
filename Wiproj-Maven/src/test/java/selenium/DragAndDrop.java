package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("Edge");
		driver.get("https://demoqa.com/droppable/");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Drag and drop -> Actions class
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		driver.navigate().to("https://demoqa.com/menu");
		WebElement mItem2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		Thread.sleep(2000);
		act.moveToElement(mItem2).perform();
		WebElement subItem = driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Sub Item'])[1]"));
		act.moveToElement(subItem).perform();
		subItem.click();
		
	}

}
