package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
//@Grab(group='builders.dsl', module='spreadsheet-builder-google', version='3.0.1')
//@Grab(group='builders.dsl', module='spreadsheet-builder-groovy', version='3.0.1')

import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder
import org.apache.poi.xssf.usermodel.XSSFSheet

//def object = new PoiSpreadsheetBuilder();

//@NonCPS
def call() { 

      echo 'Ich war in der File buildExcel neue '

    File file = new File('tagesPlan.xlsx')
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
    } writeTo file
}