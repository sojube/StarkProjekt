@Library('StarkProjekt') _ 


import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.CellBase
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.hssf.usermodel.HSSFCell
import java.io.*;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import java.nio.charset.StandardCharsets
import org.apache.poi.common.usermodel.fonts.FontCharset;
import org.apache.poi.ooxml.*
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

XSSFWorkbook workbook = new XSSFWorkbook();
def sheet = workbook.createSheet("Blatt 1")
FontCharset fontCharset = FontCharset.ARABIC;
XSSFFont font = workbook.createFont();
font.setItalic(true);
font.setCharSet(fontCharset);

println(fontCharset)

CellStyle style = workbook.createCellStyle();

style.setFont(font);

def row = sheet.createRow(0)
def cell = row.createCell(0)
cell.setCellValue("ÄÖÜghhjgg الْعَرَبِيَّة")
cell.setCellStyle(style)

// Specify the directory where the file will be save in, and the name of the file
def filePath = "${WORKSPACE}/22222222.xlsx"

// create the file
FileOutputStream fileOut = new FileOutputStream(filePath);

// define the structure in the file and also write data in the file
workbook.write(fileOut)
fileOut.close()

