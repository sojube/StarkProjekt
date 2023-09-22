package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')


class ExcelCreator {  

    ExcelCreator(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        return text;
    }
   
}
