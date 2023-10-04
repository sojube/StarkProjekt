package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
// fixes bugs on Groovy 2.4.x
@Grab(group='commons-codec', module='commons-codec', version='1.10')
@GrabExclude('org.codehaus.groovy:groovy-all')

import org.modelcatalogue.spreadsheet.api.Cell
import org.modelcatalogue.spreadsheet.builder.poi.PoiSpreadsheetBuilder
import org.modelcatalogue.spreadsheet.query.api.SpreadsheetCriteria
import org.modelcatalogue.spreadsheet.query.poi.PoiSpreadsheetCriteria

import org.apache.poi.xssf.usermodel.XSSFWorkbook

File file = new File('spreadsheet.xlsx')

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

