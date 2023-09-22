package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

File file = new File('tagesPlan.xlsx')


def text = "j' étais ici"

PoiSpreadsheetBuilder.create(file).build {                                              
    sheet('nameOfTheSheet') {                                                                   
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
