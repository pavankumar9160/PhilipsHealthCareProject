package com.philipshealthcare.utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="bussinessregisterdata")
	public Object[][] data()throws IOException {
	String path = "C:\\pavan\\Setup\\Healthcaredata\\healthcareregisterdata.xlsx";
	FileInputStream fs = new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet = wb.getSheetAt(0);
	
	
	int rowcnt =sheet.getPhysicalNumberOfRows();
	int colcnt = sheet.getRow(0).getLastCellNum();
	
	Object [][]data = new Object[rowcnt-1][colcnt];
	int i,j;
		for(i=0;i<rowcnt-1;i++) {
			sheet.getRow(i);
		for(j=0;j<colcnt;j++) {
			sheet.getRow(i).getCell(j);
			DataFormatter df = new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
		}
		
	}
		wb.close();
		fs.close();
		return data;
	
}
	@DataProvider(name="registerdata")
	public Object[][] registerdata()throws IOException {
	String path = "C:\\pavan\\Setup\\Healthcaredata\\healthcareregisterdata.xlsx";
	FileInputStream fs = new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet = wb.getSheetAt(1);
	
	
	int rowcnt =sheet.getPhysicalNumberOfRows();
	int colcnt = sheet.getRow(0).getLastCellNum();
	
	Object [][]data1 = new Object[rowcnt-1][colcnt];
	int i,j;
		for(i=0;i<rowcnt-1;i++) {
			sheet.getRow(i);
		for(j=0;j<colcnt;j++) {
			sheet.getRow(i).getCell(j);
			DataFormatter df = new DataFormatter();
			data1[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
		}
		
	}
		wb.close();
		fs.close();
		return data1;
	
}
}