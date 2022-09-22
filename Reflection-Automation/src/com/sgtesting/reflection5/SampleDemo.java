package com.sgtesting.reflection5;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleDemo {

	public static void main(String[] args) {
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Cell cell=null;
		Row row=null;
		try
		{
			String path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\DataFiles\\data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				System.out.println(methodname);
				
				cell=row.getCell(1);
				String pkgclsname=cell.getStringCellValue();
				System.out.println(pkgclsname);
				
				Class clsObject=Class.forName(pkgclsname);
				Object obj=clsObject.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
