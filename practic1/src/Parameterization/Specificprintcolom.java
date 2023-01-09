package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Specificprintcolom {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

       int index = sh.getLastRowNum();
       for(int i=0;i<=index;i++) {
    	 String data = sh.getRow(i).getCell(0).getStringCellValue();
    	   System.out.println(data);
       }
}
}
