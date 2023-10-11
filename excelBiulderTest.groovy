@Library('StarkProjekt') _ 


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
    font.setFontHeightInPoints((short) 14);
    headerstyle.setFont(font);

    // backgroungcolor of HeaderCell
    headerstyle.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex()) // Hier kannst du die gewünschte Farbe auswählen
    headerstyle.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND);

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

    // Create style with bold font text must be bold
    Font dataFont = workbook.createFont();
    dataFont.setFontHeightInPoints((short) 11);
    style.setFont(dataFont);


    // zellen Rahmen
    style.setBorderBottom(BorderStyle.THIN);
    style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderTop(BorderStyle.THIN);
    style.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderLeft(BorderStyle.THIN);
    style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderRight(BorderStyle.THIN);
    style.setRightBorderColor(IndexedColors.BLACK.getIndex());
    style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()) // Hier kannst du die gewünschte Farbe die cell auswählen
    style.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND)

// create Style1 for the datacells

    CellStyle style1 = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    style1.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    style1.setVerticalAlignment(VerticalAlignment.CENTER); 
    
    // Zeilen Umbruch
    style1.setWrapText(true);

    // zellen Rahmen
    style1.setBorderBottom(BorderStyle.THIN);
    style1.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style1.setBorderTop(BorderStyle.THIN);
    style1.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style1.setBorderLeft(BorderStyle.THIN);
    style1.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style1.setBorderRight(BorderStyle.THIN);
    style1.setRightBorderColor(IndexedColors.BLACK.getIndex());
    style1.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex()); // Hier kannst du die gewünschte Farbe für die cell auswählen 
    style1.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND);

String[][] data = dataOfEmployees;

for (int rowNum = 0; rowNum < data.length; rowNum++) {
    
    //create a Row
    XSSFRow dataRow = sheet.createRow(rowNum + 1);
    dataRow.setHeight((short) (40*20));  // Setzen Sie die Zeilenhöhe auf 35

    // create the cells for a Row using style and style1 alternatly
    if((rowNum + 1)%2 != 0){
 
        for (int colNum = 0; colNum < data[rowNum].length; colNum++) {
            Cell cell = dataRow.createCell(colNum);
            cell.setCellValue(data[rowNum][colNum]);
            cell.setCellStyle(style);
        }

    }else{
           
        for (int colNum = 0; colNum < data[rowNum].length; colNum++) {
            Cell cell = dataRow.createCell(colNum);
            cell.setCellValue(data[rowNum][colNum]);
            cell.setCellStyle(style1);
        }

    }  
    
}

// give the name of the file that will be created and the place where to store it as a filepath
def filePath = "${WORKSPACE}/julesBeispiel10_10_23.xlsx"


// create a file
def file = new File(filePath)
file.createNewFile()
FileWriter writer = new FileWriter(file, StandardCharsets.UTF_8);
//OutputStreamWriter writer = new OutputStreamWriter(file, StandardCharsets.UTF_8)
FileOutputStream fileOut = new FileOutputStream(writer);
workbook.write(fileOut) //write workbook to outputstream fileOut
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")
