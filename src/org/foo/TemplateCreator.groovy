@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')


import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

// Importing required classes
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
// Main class
// CreatingSheet
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
        throws FileNotFoundException, IOException
    {
        // Creating Workbook instances
        Workbook wb = new HSSFWorkbook();
 
        // An output stream accepts output bytes and
        // sends them to sink
        OutputStream fileOut
            = new FileOutputStream("tagesPlan.xlsx");
 
        // Now creating Sheets using sheet object
        Sheet sheet1 = wb.createSheet("Array");
        Sheet sheet2 = wb.createSheet("String");
        Sheet sheet3 = wb.createSheet("LinkedList");
        Sheet sheet4 = wb.createSheet("Tree");
        Sheet sheet5 = wb.createSheet("Dynamic Programming");
        Sheet sheet6 = wb.createSheet("Puzzles");
 
        // Display message on console for successful
        // execution of program
        System.out.println(
            "Sheets Has been Created successfully");
 
        // Finding number of Sheets present in Workbook
        int numberOfSheets = wb.getNumberOfSheets();
        System.out.println("Total Number of Sheets: "
                           + numberOfSheets);
 
        wb.write(fileOut);
    }
}