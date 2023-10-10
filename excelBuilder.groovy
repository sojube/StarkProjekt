@Library('StarkProjekt') _ 

 /*
@Grab(group='org.apache.poi', module='poi', version='5.0.0')
@Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')
@Grab(group='builders.dsl', module='spreadsheet-builder-poi', version='3.0.1')
*/

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.CellBase
import org.apache.poi.xssf.usermodel.XSSFCell
import java.io.*;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import java.nio.charset.StandardCharsets


// Erstelle eine neue Arbeitsmappe (Workbook)
//Workbook workbook = new ClassCreator()

XSSFWorkbook workbook = new XSSFWorkbook() 

// Erstelle ein neues Arbeitsblatt (Sheet)
XSSFSheet sheet = workbook.createSheet("Tabelle1")


// set the columnWidth
sheet.setColumnWidth (0, 3000)
sheet.setColumnWidth (1, 7500)
sheet.setColumnWidth (2, 7500)
sheet.setColumnWidth (3, 11000)
sheet.setColumnWidth (4, 7500)
sheet.setColumnWidth (5, 11000)
sheet.setColumnWidth (6, 7500)
sheet.setColumnWidth (7, 7500)



// create Style for the header cells

    CellStyle headerstyle = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    headerstyle.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    headerstyle.setVerticalAlignment(VerticalAlignment.CENTER);

    // Create style with bold font text must be bold
    Font font = workbook.createFont();
    font.setBold(true);
    font.setCharSet(FontCharset.ANSI.getValue());
    headerstyle.setFont(font);

    // backgroungcolor of HeaderCell
    headerstyle.setFillForegroundColor(IndexedColors.BLUE.getIndex()) // Hier kannst du die gewünschte Farbe auswählen
    headerstyle.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND)

    // zellen Rahmen für HeaderCell
    headerstyle.setBorderBottom(BorderStyle.THIN);
    headerstyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    headerstyle.setBorderTop(BorderStyle.THIN);
    headerstyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
    headerstyle.setBorderLeft(BorderStyle.THIN);
    headerstyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    headerstyle.setBorderRight(BorderStyle.THIN);
    headerstyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

// Erstelle eine Kopfzeile des excel dokument
XSSFRow headerRow = sheet.createRow(0);
String[] headersHeadline = headerData;

headerRow.setHeight((short) (23*20));  // Setzen Sie die Zeilenhöhe auf 19

    for (int i = 0; i < headersHeadline.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headersHeadline[i]);
            cell.setCellStyle(headerstyle);
            
        }


// create Style for the datacells

    CellStyle style = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    style.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    style.setVerticalAlignment(VerticalAlignment.CENTER); 
    
    // Zeilen Umbruch
    style.setWrapText(true);

    // zellen Rahmen
    style.setBorderBottom(BorderStyle.THIN);
    style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderTop(BorderStyle.THIN);
    style.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderLeft(BorderStyle.THIN);
    style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderRight(BorderStyle.THIN);
    style.setRightBorderColor(IndexedColors.BLACK.getIndex());

    


String[][] data = dataOfEmployees;
color1 = IndexedColors.LIGHT_BLUE.getIndex();
color2 = IndexedColors.GREY_25_PERCENT.getIndex();


for (int rowNum = 0; rowNum < data.length; rowNum++) {

    XSSFRow dataRow = sheet.createRow(rowNum + 1);
    dataRow.setHeight((short) (45*20));  // Setzen Sie die Zeilenhöhe auf 35
    colorIndex = color2

   

    
    // Ändere die Hintergrundfarbe der Zelle
    style.setFillForegroundColor(colorIndex) // Hier kannst du die gewünschte Farbe auswählen
    style.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND)
    
    for (int colNum = 0; colNum < data[rowNum].length; colNum++) {
        Cell cell = dataRow.createCell(colNum);
        cell.setCellValue(data[rowNum][colNum]);
        cell.setCellStyle(style);
    }
    
}

  


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispielBBBBBBB.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
//FileOutputStream fileOut = new FileOutputStream(file);
FileOutputStream fileOut = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")
