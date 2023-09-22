package org.foo

@Grab(group='org.modelcatalogue', module='spreadsheet-builder-poi')

class ExcelCreator {  

    ExcelCreator(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}