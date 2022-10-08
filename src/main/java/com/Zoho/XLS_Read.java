package com.Zoho;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLS_Read {
static String value;
	public static String particularData(String Sheet,int Row,int Cell) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\ExcelData\\Zoho.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fi);
		
		 Sheet s =wb.getSheet(Sheet);
		 
		 Row r=s.getRow(Row);
		
		 Cell c	=r.getCell(Cell);
				 
		 CellType ct=c.getCellType();
		 if (ct.equals(CellType.STRING)) {
       // value =c.getStringCellValue();
        String st=c.getStringCellValue();
		
		System.out.println(st);
		}
		 else if (ct.equals(CellType.NUMERIC)) {
			double d=c.getNumericCellValue();
			int a=(int)d;
		//value=Integer.toString(a);
			System.out.println(a);
			
		}
		
		return value;
			
		}
	
	public static String alldata() throws Exception {

		File f = new File("C:\\\\Users\\\\Dinesh\\\\eclipse-workspace\\\\Zoho\\\\ExcelData\\\\Zoho.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Zoho");
		int rowsize = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row r = s.getRow(i);
			int cellsize = r.getPhysicalNumberOfCells();

			for (int j = 0; j < cellsize; j++) {
				Cell c = r.getCell(j);
				CellType ce = c.getCellType();

				if (ce.equals(CellType.STRING)) {
					// value = c.getStringCellValue();
					String v = c.getStringCellValue();

					System.out.print(v);

				} else if (ce.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int n = (int) d;
					// value = c.getStringCellValue();
					System.out.print(n);

				}

				System.out.print("  |  ");
			}
			System.out.println();
		}
		return value;

	}
	
	public static void main(String[]args) throws Exception{
		particularData("Zoho", 0, 0);
		particularData("Zoho", 1, 0);
		alldata();
	}
	
}


	




