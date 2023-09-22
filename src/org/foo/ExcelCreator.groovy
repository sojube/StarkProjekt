package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

File file = new File('spreadsheet.xlsx')

class ExcelCreat {  


    ExcelCreat(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}
