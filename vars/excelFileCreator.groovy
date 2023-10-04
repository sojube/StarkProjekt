@Library('StarkProjekt') _ 

import org.foo.ClassCreator
import org.apache.poi.ss.usermodel.*
import java.io.*;

def call() {
// Erstelle eine neue Arbeitsmappe (Workbook)
Workbook workbook = new ClassCreator()
 
// Erstelle ein neues Arbeitsblatt (Sheet)
Sheet sheet = workbook.createSheet("Tabelle1")

// Erstelle eine Kopfzeile
Row headerRow = sheet.createRow(0)
headerRow.createCell(0).setCellValue("Name")
headerRow.createCell(1).setCellValue("Alter")
headerRow.createCell(2).setCellValue("Beruf")

// Füge Datenzeilen hinzu
Row dataRow1 = sheet.createRow(1)
dataRow1.createCell(0).setCellValue("Max Mustermann")
dataRow1.createCell(1).setCellValue(30)
dataRow1.createCell(2).setCellValue("Ingenieur")

Row dataRow2 = sheet.createRow(2)
dataRow2.createCell(0).setCellValue("Erika Musterfrau")
dataRow2.createCell(1).setCellValue(28)
dataRow2.createCell(2).setCellValue("Lehrer") 

// Speichere die Arbeitsmappe in einer Datei
FileOutputStream fileOut = new FileOutputStream("JulesBeispielCall.xlsx")
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")
}