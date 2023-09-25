package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

def call() {

    File file = new File('tagesPlan.xlsx')

    PoiSpreadsheetBuilder.create(file).build {                                              
        sheet('nameOfTheSheet') {                                                                   
            row {                                                                           
                cell 'A' { value 'Value 11' }                                                                 
                cell 'B' { value 'Value 12' } 
                cell 'C' { value 'Value 13' } 
            }
            row {
                cell 1 { value 'Value 21' } 
                cell 2 { value 'Value 22' } 
                cell 3 { value 'Value 23' } 
            }
        }
    }

}

  