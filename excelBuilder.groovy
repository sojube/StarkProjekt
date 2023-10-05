@Library('StarkProjekt') _ 

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.CellBase
import org.apache.poi.xssf.usermodel.XSSFCell
import java.io.*;


// Erstelle eine neue Arbeitsmappe (Workbook)
//Workbook workbook = new ClassCreator()

XSSFWorkbook workbook = new XSSFWorkbook(); 

// Erstelle ein neues Arbeitsblatt (Sheet)
XSSFSheet sheet = workbook.createSheet("Centered Text");

// Create a cell style
CellStyle style = workbook.createCellStyle();

// Set horizontal alignment to CENTER
style.setAlignment(HorizontalAlignment.CENTER);

// Set vertical alignment to CENTER
style.setVerticalAlignment(VerticalAlignment.CENTER);

// set the columnWidth
sheet.setColumnWidth (0, 3000)
sheet.setColumnWidth (1, 7500)
sheet.setColumnWidth (2, 7500)
sheet.setColumnWidth (3, 11000)
sheet.setColumnWidth (4, 7500)
sheet.setColumnWidth (5, 11000)
sheet.setColumnWidth (6, 7500)

// Erstelle eine Kopfzeile
XSSFRow headerRow = sheet.createRow(0);

    // erste zelle des Kopfzeile
    cell0 = headerRow.createCell(0);
    cell0.setCellValue("Kapitän");
    //cell0.setCellStyle(style);
    // zweite zelle des Kopfzeile
    cell1 = headerRow.createCell(1);
    cell1.setCellValue("Vorname Nachname");
    //cell1.setCellStyle(style);

   
    /*headerRow.createCell(2).setCellValue("Stand Up Datum")
    headerRow.createCell(3).setCellValue("Intakevorbereitung")
    headerRow.createCell(4).setCellValue("Intake Übungsläufen")
    headerRow.createCell(5).setCellValue("Zerziefizierung und Deadline")
    headerRow.createCell(6).setCellValue("Sonstige")
    */

// Füge Datenzeilen hinzu
XSSFRow dataRow1 = sheet.createRow(1)
//dataRow1.setHeightInPoints((int) 35)
dataRow1.createCell(0).setCellValue("X")
dataRow1.createCell(1).setCellValue("Max Mustermann")
dataRow1.createCell(2).setCellValue("Ingenieur")
dataRow1.createCell(3).setCellValue("Max Mustermann")
dataRow1.createCell(4).setCellValue("dreißig")
dataRow1.createCell(5).setCellValue("Ingenieur")
dataRow1.createCell(6).setCellValue("Ingenieur")


XSSFRow dataRow2 = sheet.createRow(2)
//dataRow2.setHeightInPoints((int) 35)
dataRow2.createCell(0).setCellValue(" ")
dataRow2.createCell(1).setCellValue("Erika Musterfrau")
dataRow2.createCell(2).setCellValue("Lehrer")
dataRow2.createCell(3).setCellValue("Max Mustermann")
dataRow2.createCell(4).setCellValue("dreißig")
dataRow2.createCell(5).setCellValue("Ingenieur")
dataRow2.createCell(6).setCellValue("Ingenieur") 



// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")
