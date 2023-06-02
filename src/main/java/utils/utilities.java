package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilities {
	public static final int IMPLICIT_WAIT_TIME = 3;
	public static final int PAGE_LOAD_TIME = 5;
//
//	public static Object[][] getTestDataFromExcel(String sheetName) throws IOException {
//		XSSFWorkbook workbook = null;
//		String excelFile = "./data/Login.xlsx";
//		
////		  try { FileInputStream fisExcel = new FileInputStream(excelFile); workbook=
////		  new XSSFWorkbook(fisExcel);
////		  
////		  }catch (Throwable e) { e.printStackTrace(); }
//		 XSSFWorkbook wbook= new XSSFWorkbook(excelFile);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(0).getLastCellNum();
//
//		Object[][] data = new Object[rows][cols];
//		for (int i = 0; i < rows; i++) {
//			XSSFRow row = sheet.getRow(i + 1);
//			for (int j = 0; j < cols; j++) {
//				XSSFCell cell = row.getCell(j);
//				CellType cellType = cell.getCellType();
//				switch (cellType) {
//				case STRING:
//					data[i][j] = cell.getStringCellValue();
//					break;
//				case NUMERIC:
//					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
//					break;
//				case BOOLEAN:
//					data[i][j] = cell.getBooleanCellValue();
//					break;
//
//				}
//			}
//
//		}
//		return data;
//	}
	public static String[][] getTestDataFromExcel() throws IOException {
		String excelFile = "./data/Login.xlsx";
		XSSFWorkbook wbook= new XSSFWorkbook(excelFile);
		XSSFSheet sheet=wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows"+lastRowNum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				//String value = cell.getStringCellValue();
			//	System.out.println(value);
				data[i-1][j]= value;
			} 
		}
	try {
		wbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		return data;
		
	}
}
