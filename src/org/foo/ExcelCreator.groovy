package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

def object = new PoiSpreadsheetBuilder();

class ExcelCreat extends object {  


    ExcelCreat(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}
