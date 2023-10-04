@Library('StarkProjekt') _ 

import org.foo.ClassCreator
import org.apache.poi.ss.usermodel.*
import java.io.*;


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
dataRow1.createCell(1).setCellValue("dreißig")
dataRow1.createCell(2).setCellValue("Ingenieur")

Row dataRow2 = sheet.createRow(2)
dataRow2.createCell(0).setCellValue("Erika Musterfrau")
dataRow2.createCell(1).setCellValue("28")
dataRow2.createCell(2).setCellValue("Lehrer") 


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"


// Speichere die Arbeitsmappe in einer Datei
//FileOutputStream fileOut = new FileOutputStream("filePath")
FileOutputStream fileOut = new FileOutputStream(new File("filePath"));
workbook.write(fileOut)
fileOut.close()

//def newFile = new File(filePath)
def newFile = new File("${WORKSPACE}/testJules4.txt")
newFile.createNewFile() 


println("Die Excel-Datei wurde erfolgreich erstellt.")
