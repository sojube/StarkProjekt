package org.foo
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')


import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;


def call() {

        echo "ich war in der File variable"
        // create a new file
        //FileOutputStream file = new FileOutputStream("workbook.xls");
        File file = new File('spreadsheet.xlsx')
        // create a new workbook
        SXSSFWorkbook wb = new SXSSFWorkbook();
        // create a new sheet
        Sheet sheet = wb.createSheet();
        PoiSpreadsheetBuilder.create(file).build {                                              
            sheet('Sample') {                                                                   
                row {                                                                           
                    cell 'A'                                                                    
                    cell 'B'
                    cell 'C'
                }
                row {
                    cell 1
                    cell 2
                    cell 3
                }
            }
        }
       
}