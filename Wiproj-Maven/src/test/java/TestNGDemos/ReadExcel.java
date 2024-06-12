package TestNGDemos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readData() throws IOException
	{
		//Read data from excel - specify the path
		FileInputStream fis = new FileInputStream("D:\\Automation\\AutomationData.xlsx");
		XSSFSheet sheet = null; 
		XSSFWorkbook workbook=null;
		//Identify the workbook in excel sheet
		try {
			workbook = new XSSFWorkbook(fis);
			//workbook.getSheetAt(0);//fine with number
			sheet = workbook.getSheet("Selenium");
			int rows = sheet.getPhysicalNumberOfRows();//returns the total count of recors
			System.out.println(rows);
			
			//total no of columns
			int columns = sheet.getRow(1).getPhysicalNumberOfCells();
			System.out.println(columns);
			//print the cells
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(cellData+"  ");
				}
				System.out.println();
				
				//sheet.getRow(rows)
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//write data into a cell
		XSSFRow row=sheet.getRow(9);//10th record
		XSSFCell cell = row.getCell(1);//2nd colm -> 10th row & 2nd column
		cell.setCellValue("Dell12345");
		FileOutputStream fos = new FileOutputStream("D:\\Automation\\AutomationData.xlsx");
		workbook.write(fos);
		System.out.println(cell);
		
	}

}
