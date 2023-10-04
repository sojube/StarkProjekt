package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
@Grab(group='builders.dsl', module='spreadsheet-builder-api', version='3.0.1')
@Grab(group='org.apache.poi', module='poi', version='5.0.0')
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')


import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder


public class ClassGenarateExcel extends PoiSpreadsheetBuilder{

     ClassGenarateExcel() {
        super();
    }

 def call(){
    echo 'iiiiiiiiiiiiiiiiii'
 }
}