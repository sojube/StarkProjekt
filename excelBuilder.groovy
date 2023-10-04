@Library('StarkProjekt') _ 

import org.foo.ClassCreator
import org.foo.SpreadsheetCreator
import org.apache.poi.ss.usermodel.*
import java.io.*;


// Erstelle eine neue Arbeitsmappe (Workbook)
////Workbook workbook = new ClassCreator()
 
// Erstelle ein neues Arbeitsblatt (Sheet)
////Sheet sheet = workbook.createSheet("Tabelle1")

// Specify the file path relative to the workspace
////def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"
def filePath = "JulesBeispiel.xlsx"


File file = new File(filePath)

SpreadsheetCreator.create(file).build {                                              
    sheet('Sample') {                                                                   
        row {                                                                           
            cell 'A'                                                                    
            cell 'B'
            cell 'C'
        }
        row {
            cell 1
            cell 2
            cell 3
        }
    }
}