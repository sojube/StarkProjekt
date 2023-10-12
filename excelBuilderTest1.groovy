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

def workbook = new XSSFWorkbook();
def sheet = workbook.createSheet("Blatt 1")

def row = sheet.createRow(0)
def cell = row.createCell(0)
cell.setCellValue("ÄÖÜ")
// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/111111111111111.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
/*file.createNewFile()
*/
FileOutputStream fileOut = new FileOutputStream(file);

workbook.write(fileOut)
fileOut.close()