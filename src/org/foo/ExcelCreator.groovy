package org.foo

//@Grab(group='org.modelcatalogue', module='spreadsheet-builder-poi', version=' ') 
@Grab('builder.dsl:spreadsheet-builder-poi:2.2.1') 

class ExcelCreator {  

    ExcelCreator(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}