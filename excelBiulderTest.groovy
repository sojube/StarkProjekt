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
sheet.setColumnWidth (0, 10)
sheet.setColumnWidth (1, 25)
sheet.setColumnWidth (2, 25)
sheet.setColumnWidth (3, 35)
sheet.setColumnWidth (4, 25)
sheet.setColumnWidth (5, 35)
sheet.setColumnWidth (6, 25)

// Erstelle eine Kopfzeile
XSSFRow headerRow = sheet.createRow(0)
headerRow.createCell(0).setCellValue("Kapitän")
headerRow.createCell(1).setCellValue("Vorname Nachname")
headerRow.createCell(2).setCellValue("Stand Up Datum")
headerRow.createCell(3).setCellValue("Intakevorbereitung")
headerRow.createCell(4).setCellValue("Intake Übungsläufen")
headerRow.createCell(5).setCellValue("Zerziefizierung und Deadline")
headerRow.createCell(6).setCellValue("Sonstige")


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")