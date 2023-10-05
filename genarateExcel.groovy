//@Library('StarkProjekt') _ 

//@Grab(group='org.apache.poi', module='poi', version='5.0.0')
//@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')
//@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.CellBase
import org.apache.poi.xssf.usermodel.XSSFCell
import java.io.*;

public class TypesofCells {
   public static void main(String[] args)throws Exception {
      XSSFWorkbook workbook = new XSSFWorkbook(); 
      XSSFSheet spreadsheet = workbook.createSheet("cell types");

      spreadsheet.setColumnWidth(0, 5000)
      spreadsheet.setColumnWidth(1, 10000)
      
      XSSFRow row = spreadsheet.createRow((short) 2);
      row.setHeightInPoints((int) 35)
      row.createCell(0).setCellValue("Type of Cell");
      row.createCell(1).setCellValue("cell value");
      
      row = spreadsheet.createRow((short) 3);
      row.createCell(0).setCellValue("set cell type BLANK");
      row.createCell(1);
      
      row = spreadsheet.createRow((short) 4);
      row.createCell(0).setCellValue("set cell type BOOLEAN");
      row.createCell(1).setCellValue(true);
      
      row = spreadsheet.createRow((short) 5);
      row.createCell(0).setCellValue("set cell type date");
      row.createCell(1).setCellValue(new Date());
      
      row = spreadsheet.createRow((short) 6);
      row.createCell(0).setCellValue("set cell type numeric");
      row.createCell(1).setCellValue(20 );
      
      row = spreadsheet.createRow((short) 7);
      row.createCell(0).setCellValue("set cell type string");
      row.createCell(1).setCellValue("A String");
      
      FileOutputStream out = new FileOutputStream(new File("typesofcells.xlsx"));
      workbook.write(out);
      out.close();
      System.out.println("typesofcells.xlsx written successfully");
   }
}