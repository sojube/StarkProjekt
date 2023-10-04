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
def filePath = "${WORKSPACE}/JulesBeispiel2.xlsx"


// Speichere die Arbeitsmappe in einer Datei
//FileOutputStream fileOut = new FileOutputStream("filePath")
def file = new File("filePath")
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

//def newFile = new File(filePath)
def filePathe = "${WORKSPACE}/testJules7.txt"
def newFile = new File("filePathe")
newFile.createNewFile() 
FileOutputStream fileOute = new FileOutputStream(newFile);
workbook.write(fileOute)
fileOute.close()


println("Die Excel-Datei wurde erfolgreich erstellt.")
