@Library('StarkProjekt') _ 

//import org.foo.ClassGenarateExcel
import org.apache.poi.ss.usermodel.*
import org.foo.PoiSpreadsheetBuilder
import java.io.*;


File file = new File('spreadsheet.xlsx')

PoiSpreadsheetBuilder.create(file).build {                                              
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
