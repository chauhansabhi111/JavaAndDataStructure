package com.preparation.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
/**
 Here are the basic steps for writing an Excel file:
Create a Workbook.
Create a Sheet.
Repeat the following steps until all data is processed:
Create a Row.
Create Cells in a Row. Apply formatting using CellStyle.
Write to an OutputStream.
Close the output stream.
 * @author hug46010
 *
 */
public class ExcelreadWriteUtility 
{
	public static void main(String[] args) 
	{
		List<String> list= new ArrayList<String> ();
		list.add("Name");
		list.add("Id");
		list.add("City");
		List<String> list1= new ArrayList<String> ();
		list1.add("Abhishek");
		list1.add("101");
		list1.add("Noida");
		List<String> list2= new ArrayList<String> ();
		list2.add("Gaurav");
		list2.add("102");
		list2.add("Noida");
		List<List<String>> list3= new ArrayList<List<String>> ();
		list3.add(list);
		list3.add(list1);
		list3.add(list2);
		try
		{
			writeDataIntoExcel(list3,"C:\\Users\\hug46010\\Documents\\eXCEL\\Employee.xls");
			readDataFromExcel("C:\\Users\\hug46010\\Documents\\eXCEL\\Employee.xls");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("unused")
	public static void writeDataIntoExcel(List<List<String>> inputData,String filePath) throws Exception
	{
		HSSFWorkbook workbook= new HSSFWorkbook();
		HSSFSheet sheet= workbook.createSheet();
		int rownum=0;
		for (List<String> rowlist : inputData) 
		{
			
			int column=0;
			HSSFRow row= sheet.createRow(rownum++);
			for (String data : rowlist) 
			{
				HSSFCell cell= row.createCell(column++);
				cell.setCellValue(data);
				System.out.println();
			}
		}
		FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
	}
	
	public static void readDataFromExcel(String filePath) throws Exception
	{
		FileInputStream excelFile = new FileInputStream(new File(filePath));
		HSSFWorkbook workbook = new HSSFWorkbook(excelFile);
		HSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> itr=sheet.iterator();
		while(itr.hasNext())
		{
			HSSFRow row = (HSSFRow) itr.next();
			Iterator<HSSFCell> itr1= row.iterator();
			while(itr1.hasNext())
			{
				HSSFCell cell=itr1.next();
				System.out.print(cell.getStringCellValue());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
