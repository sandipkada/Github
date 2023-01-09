package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllstringvalue {//print total string values
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
      Sheet sa = WorkbookFactory.create(file).getSheet("Sheet1");
 
   for(int i=0;i<=sa.getLastRowNum();i++) {//row
	   for(int j=0;j<=sa.getRow(i).getLastCellNum()-1;j++) {//colume
	 String a = sa.getRow(i).getCell(j).getStringCellValue();
	 System.out.print(a+" ,");
	   
	   }
	   System.out.println();
	   
	   
   }

}
}