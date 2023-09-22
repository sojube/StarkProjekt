package org.foo

@Grab(group='org.modelcatalogue', module='spreadsheet-builder-poi', version='2.4.21')

class ExcelCreator {  

    ExcelCreator(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}