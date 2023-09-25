package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

//def object = new PoiSpreadsheetBuilder();



    File file = new File('tagesPlan.xlsx')
    PoiSpreadsheetBuilder.INSTANCE.build {                                                  // <1>
        sheet('Sample') {                                                                   // <2>
            row {                                                                           // <3>
                cell 'A'                                                                    // <4>
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

def call() {    

    echo 'Ich war in der File buildExcel'

}

  