package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//Identify the total no of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(columns.size());//print the size of the columns
		
		//Print all the headers - header
		for(WebElement e: columns)
		{
			System.out.println(e.getText());
		}
		
		//Identify the no of rows/records (except header)
		List<WebElement> records = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(WebElement e: records)
		{
			System.out.println(e.getText());
		}
		
		//Identify the particular cell value
		WebElement cell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[25]/td[1]"));
		System.out.println(cell.getText());
		
		//closeBrowser();
	}

}
