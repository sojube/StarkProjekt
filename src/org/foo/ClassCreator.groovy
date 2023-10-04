package org.foo
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ClassCreator extends XSSFWorkbook{

  def createrWorkbook(){

    XSSFWorkbook workbook = new XSSFWorkbook()
    return workbook;

  }
    

}