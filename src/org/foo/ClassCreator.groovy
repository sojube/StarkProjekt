package org.foo
@Grab(group='org.apache.poi', module='poi', version='5.0.0')
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
@Grab(group='org.apache.poi', module='poi', version= '5.2.4')

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;
import java.io.*;
import org.apache.poi.ss.usermodel.CellBase;
import org.apache.poi.ss.usermodel.IndexedColors



class ClassCreator extends XSSFWorkbook{

  def createrWorkbook(){

    XSSFWorkbook workbook = new XSSFWorkbook()
    return workbook;

  }
    

}
