package com.Learning_testing;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.Genaric_Library.File_Utility;

public class Learning_Excel_File {
	@Test
	public void registertest() throws Throwable{
		FileInputStream fis= new FileInputStream("./src/test/resources/data/Register_data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("registerdata");
		Row row =sheet.getRow(1);
		Cell cell= row.getCell(0);
		String firstname =cell.getStringCellValue();
		String lastname = row.getCell(1).getStringCellValue();
		String email=row.getCell(2).getStringCellValue();
		String password=row.getCell(3).getStringCellValue();
		String conformPassword = row.getCell(4).getStringCellValue();
		String gender=File_Utility.fe
		
		
		
		
	}

}
