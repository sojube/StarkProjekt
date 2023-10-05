package org.foo
@Grab(group='org.apache.poi', module='poi', version='5.0.0')
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ClassGenarateExcel extends XSSFWorkbook{

  def createrWorkbook(){

    XSSFWorkbook workbook = new XSSFWorkbook()
    return workbook;

   }    
}