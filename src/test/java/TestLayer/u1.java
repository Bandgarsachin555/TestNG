package TestLayer;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class u1 {
	static XSSFWorkbook workbook;
	
	public u1(String path) throws IOException
	{
		File f=new File(path);
		
		FileInputStream fis= new FileInputStream(f);
		
		 workbook =new XSSFWorkbook(fis);
					}
	public static int gerrow(int row)
	{
		return workbook.getSheetAt(0).getLastRowNum();
	}
	public static int gercell(int cell)
	{
		return workbook.getSheetAt(0).getRow(0).getLastCellNum();
	}
	public static String data1(int sheet,int row,int cell)
	{
		try
		{
			return workbook.getSheetAt(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			double d= workbook.getSheetAt(sheet).getRow(row).getCell(cell).getNumericCellValue();
			long k=(long)d;
			return Long.toString(k);
		}
		
	}
	
}
