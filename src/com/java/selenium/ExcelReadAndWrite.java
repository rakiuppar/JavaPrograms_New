package com.java.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadAndWrite 
{
	public static void main(String[] args) 
	{
		
		
		
	}
	
	
	public String getCellData (String sheetname, int rowNum, int colNum) throws  IOException
	{
		String retVal= null;
		String path= "D:\\Rakesh_Eclipse_workTest\\OnlineBanking\\Data\\data.xlsx";
		
		FileInputStream fi= new FileInputStream(path);
		Workbook wb= WorkbookFactory.create(fi);
		Sheet s= wb.getSheet(sheetname);
		Row r= s.getRow(rowNum);
		Cell c= r.getCell(colNum);
		retVal= c.getStringCellValue();
		return retVal;
	}
	
	public int getLasRowCount(String sheetname) throws IOException
	{
		int rowCount=0;
		String path= "D:\\Rakesh_Eclipse_workTest\\OnlineBanking\\Data\\data.xlsx";
		FileInputStream fi= new FileInputStream (path);
		Workbook wb= WorkbookFactory.create(fi);
		Sheet s= wb.getSheet(sheetname);
		rowCount= s.getLastRowNum();
		return rowCount;
	}
	
	public void writeToCell(String sheetname, int rowNum, int colNum, String value) throws IOException
	{
		String path= "D:\\Rakesh_Eclipse_workTest\\OnlineBanking\\Data\\data.xlsx";
		FileInputStream fi= new FileInputStream(path);  
		//Access the workbook                  
		Workbook wb = WorkbookFactory.create(fi);
		//Access the worksheet, so that we can update / modify it. 
		Sheet s= wb.getSheet(sheetname); 
		// Access row
		Row r= s.getRow(rowNum); 
		// Access the second cell in second row to update the value
		Cell c= r.getCell(colNum); 
		// Get current cell value value and overwrite the value
		c.setCellValue(value);
		//Close the InputStream  
		fi.close(); 
		//Open FileOutputStream to write updates
		FileOutputStream fo =new FileOutputStream(path);  
		 //write changes
		wb.write(fo);
		//close the stream
		fo.close();
	}

}
