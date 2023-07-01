package org.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="logindata")
	public String[][] getTestData() throws Exception {
		File file = new File("D:\\acceleration\\Workspace\\Riddhi_Housing_Society\\ExcelFile\\Book2.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.getSheet("Credentials");
		int NoofRows=Sheet.getPhysicalNumberOfRows();
		int Noofcol=Sheet.getRow(0).getLastCellNum();
		
		String[][]data=new String[NoofRows-1][Noofcol];
		for(int i =0;i<NoofRows-1;i++) {
			for(int j =0;j<Noofcol;j++) {
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(Sheet.getRow(i+1).getCell(j));
			}
		}
		wb.close();
		fis.close();
	return data;
		
	}
	@DataProvider(name="AddReciept")
	public String[][] GetData() throws Exception {
		File file = new File("D:\\acceleration\\Workspace\\Riddhi_Housing_Society\\ExcelFile\\Book2.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.getSheet("Addreciept");
		int NoofRows=Sheet.getPhysicalNumberOfRows();
		int Noofcol=Sheet.getRow(0).getLastCellNum();
		
		String[][]data=new String[NoofRows-1][Noofcol];
		for(int i =0;i<NoofRows-1;i++) {
			for(int j =0;j<Noofcol;j++) {
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(Sheet.getRow(i+1).getCell(j));
			}
		}
		wb.close();
		fis.close();
	return data;
		
	}
		}
