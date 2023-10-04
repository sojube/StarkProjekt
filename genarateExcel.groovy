@Library('StarkProjekt') _ 

import org.foo.ClassCreator
import org.apache.poi.ss.usermodel.*
import java.io.*;


// Erstelle eine neue Arbeitsmappe (Workbook)
Workbook workbook = new ClassCreator()
 
// Erstelle ein neues Arbeitsblatt (Sheet)
Sheet sheet = workbook.createSheet("Tabelle1")


//def newFile = new File(filePath)
def newFile = new File("${WORKSPACE}/testJules3.xlsx")
newFile.createNewFile() 


println("Die Excel-Datei wurde erfolgreich erstellt.")
