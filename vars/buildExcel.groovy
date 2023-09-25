package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

//def object = new PoiSpreadsheetBuilder();

def call() {

    File file = new File('tagesPlan.xlsx')
    echo 'Ich war in der File buildExcel'

}

  