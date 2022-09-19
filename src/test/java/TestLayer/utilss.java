package TestLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilss {
	XSSFWorkbook workbook;

	public utilss(String filepath) throws IOException

	{
		File f = new File(filepath);

		FileInputStream fis = new FileInputStream(f);

		workbook = new XSSFWorkbook(fis);

	}

	public String getdata(int sheet, int row, int cell) {
		try {
			return workbook.getSheetAt(sheet).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {

			double d = workbook.getSheetAt(sheet).getRow(row).getCell(cell).getNumericCellValue();
			long k = (long) d;
			return Long.toString(k);
		}
	}

	public int getrow(int sheet) {
		return workbook.getSheetAt(sheet).getLastRowNum();
	}

	public int getcell(int sheet) {
		return workbook.getSheetAt(sheet).getRow(0).getLastCellNum();
	}
}
