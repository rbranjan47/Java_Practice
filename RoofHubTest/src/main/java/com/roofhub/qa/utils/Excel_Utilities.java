package com.roofhub.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class Excel_Utilities 
{   
	/**
	 * Initializing WorkBooks Object
	 */
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
    
	/**
	 * This method is responsible for fetching the data from excel sheet.
	 */
	
	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception
	{   
		String[][] tabArray = null;
		
		try 
		{
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 1;
			int startCol = 1;
			int ci,cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			int totalCols = 2;
			tabArray=new String[totalRows][totalCols];
			ci=0;
			for (int i=startRow;i<=totalRows;i++, ci++)
			{           	   
				cj=0;
				for (int j=startCol;j<=totalCols;j++, cj++)
				{
					tabArray[ci][cj]=getCellData(i,j);
				}
				}
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return(tabArray);
	    }

	/**
	 * This method reads cell data from excel and passing to TABLEARRAY method.
	 */
	public static String getCellData(int RowNum, int ColNum) throws Exception
	       {
		   try
		   {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			int dataType = Cell.getCellType();
			if  (dataType == 3) 
			{
				return "";
			}
			else
			{
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
			}
		   catch (Exception e)
		    {
				System.out.println(e.getMessage());
				throw (e);
			}
	        }
	
	public static void writeExcel(String[] dataToWrite,int cellno) throws IOException
	    {
        File file = new File("E://RESMAN//ResmanReport//report.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook resman = null;
        resman = new XSSFWorkbook(inputStream);
        Sheet sheet = resman.getSheet("Sheet1");
        
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println(rowCount);
        Row row = sheet.getRow(0);
        Row newRow = sheet.createRow(rowCount+1);
      
            //Fill data in row
            Cell cell = newRow.createCell(cellno);
            System.out.println("cell1"+cell);
            cell.setCellValue(dataToWrite[cellno]);
        
        //Close input stream
        inputStream.close();
       FileOutputStream outputStream = new FileOutputStream(file);
       resman.write(outputStream);
       outputStream.close();
       
       }
	
	public static void writeExcelRow(String dataToWrite,int cellno) throws IOException
    {
    File file = new File("E://RESMAN//ResmanReport//report.xlsx");
    FileInputStream inputStream = new FileInputStream(file);
    Workbook resman = null;
    resman = new XSSFWorkbook(inputStream);
    Sheet sheet = resman.getSheet("Sheet1");
    
    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    
    System.out.println("rowcount"+rowCount);
    
    Row row=sheet.getRow(rowCount);
    System.out.println("row"+row);
    int celcount=row.getLastCellNum()-row.getFirstCellNum();
    System.out.println(celcount);
    Cell cell;
    cell=row.createCell(cellno);
    System.out.println("cellno"+cellno);
    System.out.println("cell2"+cell);
    
    //String[][] valueToWrite= {{dataToWrite}};  
    
    cell.setCellValue(dataToWrite);
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    inputStream.close();
    FileOutputStream outputStream = new FileOutputStream(file);
    resman.write(outputStream);
    outputStream.close();
   }

}
