package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutils {
	String excelpath="‪./data/New Microsoft Excel Worksheet.xlsx";
	String datapath="./data/data1.properties";
	public Properties getPropertyfile() throws Throwable {
		FileInputStream ip= new FileInputStream(datapath);
		Properties pp=new Properties();
		ip.close();
		return pp;
	}
	public String getExcelData(String sheet,int row,int cell) throws Throwable {
		FileInputStream ipp=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(ipp);
		String sh=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return sh;
	}
	public void setExcelData(String sheet,int row,int cell,String data) throws Throwable {
		FileInputStream ipp=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(ipp);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream op=new FileOutputStream(excelpath);
		wb.write(op);
		wb.close();
	}

}
