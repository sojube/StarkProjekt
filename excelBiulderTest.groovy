@Library('StarkProjekt') _ 

 /*
@Grab(group='org.apache.poi', module='poi', version='5.0.0')
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
*/

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

XSSFWorkbook workbook = new XSSFWorkbook() 

// Erstelle ein neues Arbeitsblatt (Sheet)
XSSFSheet sheet = workbook.createSheet("Tabelle1")


// set the columnWidth
sheet.setColumnWidth (0, 3000)
sheet.setColumnWidth (1, 7500)
sheet.setColumnWidth (2, 7500)
sheet.setColumnWidth (3, 11000)
sheet.setColumnWidth (4, 7500)
sheet.setColumnWidth (5, 11000)
sheet.setColumnWidth (6, 7500)


// create Style for the header cells

    CellStyle headerstyle = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    headerstyle.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    headerstyle.setVerticalAlignment(VerticalAlignment.CENTER);

    // Create style with bold font text must be bold
    Font font = workbook.createFont();
    font.setBold(true);
    headerstyle.setFont(font);

// create Style for the datacells

    CellStyle style = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    style.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    style.setVerticalAlignment(VerticalAlignment.CENTER);    

// Erstelle eine Kopfzeile des excel dokument
XSSFRow headerRow = sheet.createRow(0);
headerRow.setHeight((short) (19*20));  // Setzen Sie die Zeilenhöhe auf 19
    // erste spalte
    XSSFCell cell0 = headerRow.createCell(0);
    cell0.setCellValue("Kapitän");
    cell0.setCellStyle(headerstyle);

    // zweite spalte
    XSSFCell cell1 = headerRow.createCell(1);
    cell1.setCellValue("Vorname Nachname");
    cell1.setCellStyle(headerstyle);

    // dritte spalte
    XSSFCell cell2 = headerRow.createCell(2);
    cell2.setCellValue("Stand Up Datum");
    cell2.setCellStyle(headerstyle);

    // vierte spalte
    XSSFCell cell3 = headerRow.createCell(3);
    cell3.setCellValue("Intakevorbereitung");
    cell3.setCellStyle(headerstyle);

    // fünfte spalte
    XSSFCell cell4 = headerRow.createCell(4);
    cell4.setCellValue("Intake ÃœbungslÃ¤ufen mit:");
    cell4.setCellStyle(headerstyle);

    // sechste spalte
    XSSFCell cell5 = headerRow.createCell(5);
    cell5.setCellValue("Zerziefizierung und Deadline");
    cell5.setCellStyle(headerstyle);

    // siebte spalte
    XSSFCell cell6 = headerRow.createCell(6);
    cell6.setCellValue("Sonstige");
    cell6.setCellStyle(headerstyle);


XSSFRow dataRow1 = sheet.createRow(1);
dataRow1.setHeight((short) (35*20));  // Setzen Sie die Zeilenhöhe auf 35
    // erste spalte
    XSSFCell dataCell0 = dataRow1.createCell(0);
    dataCell0.setCellValue("X");
    dataCell0.setCellStyle(style);

    // zweite spalte
    XSSFCell dataCell1 = dataRow1.createCell(1);
    dataCell1.setCellValue("Max Mustermann");
    dataCell1.setCellStyle(style);

    // dritte spalte
    XSSFCell dataCell2 = dataRow1.createCell(2);
    dataCell2.setCellValue("05.10.2023");
    dataCell2.setCellStyle(style);

    // vierte spalte
    XSSFCell dataCell3 = dataRow1.createCell(3);
    dataCell3.setCellValue("Dreißig");
    dataCell3.setCellStyle(style);

    // fünfte spalte
    XSSFCell dataCell4 = dataRow1.createCell(4);
    dataCell4.setCellValue("Intake ÃœbungslÃ¤ufen mit:");
    dataCell4.setCellStyle(style);

    // sechste spalte
    XSSFCell dataCell5 = dataRow1.createCell(5);
    dataCell5.setCellValue("Ingenieur");
    dataCell5.setCellStyle(style);

    // siebte spalte
    XSSFCell dataCell6 = dataRow1.createCell(6);
    dataCell6.setCellValue("Aufgabe");
    dataCell6.setCellStyle(style);    

    


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")