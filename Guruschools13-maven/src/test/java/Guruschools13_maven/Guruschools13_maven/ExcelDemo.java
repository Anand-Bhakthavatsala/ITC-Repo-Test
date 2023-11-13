package Guruschools13_maven.Guruschools13_maven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	@Test
	public void readData() throws IOException
	{
		fis = new FileInputStream("D:\\Automation\\AutomationData.xlsx");
		workbook = new XSSFWorkbook(fis);//AutomationData workbook
		//workbook.getSheetAt(0);//
		XSSFSheet sheet = workbook.getSheet("selenium");//getSheetAt(0)referring to selenium sheet
		int rows = sheet.getPhysicalNumberOfRows();//display the no of records
		System.out.println("Total no of rows: "+rows);
		
		//To get the particular row
		XSSFRow row = sheet.getRow(6);//5th row
		
		String data = sheet.getRow(6).getCell(0).getStringCellValue();
		System.out.println(data);
		String data2 = sheet.getRow(4).getCell(1).getStringCellValue();
		//System.out.println(data2);
		
		/*
		 * //rows & columns for()//row { for()//col {
		 * 
		 * } }
		 */
		
		  //Write the value to the cell row = sheet.getRow(4); 
		  XSSFCell cell5=row.getCell(1); 
		  cell5.setCellValue("ITC-Batch2");		  
		  FileOutputStream fos = new
		  FileOutputStream("D:\\Automation\\AutomationData.xlsx"); workbook.write(fos);
		  System.out.println(cell5);
		 
	}
	

}
