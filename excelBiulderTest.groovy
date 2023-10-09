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
import org.apache.poi.ss.usermodel.IndexedColors


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


// Ändere die Hintergrundfarbe der Zelle
CellStyle colorstyle1 = workbook.createCellStyle()
colorstyle1.setFillForegroundColor(IndexedColors.BLUE.getIndex()) // Hier kannst du die gewünschte Farbe auswählen
colorstyle1.setFillPattern(org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND)


// create Style for the header cells

    CellStyle headerstyle = workbook.createCellStyle();

    // Set horizontal alignment to CENTER
    headerstyle.setAlignment(HorizontalAlignment.CENTER);

    // Set vertical alignment to CENTER
    headerstyle.setVerticalAlignment(VerticalAlignment.CENTER);

    // Create style with bold font text must be bold
    Font font = workbook.createFont();
    font.setBold(true);
    headerstyle.setFont(font);

// Erstelle eine Kopfzeile des excel dokument
XSSFRow headerRow = sheet.createRow(0);
String[] headersHeadline = ["Data", "Vorname Nachname", "Zeit und Datum", "Intakevorbereitung", "Intake  mit:", "Zerziefizierung und Deadline", "Sonstige" ];

headerRow.setHeight((short) (19*20));  // Setzen Sie die Zeilenhöhe auf 19

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


XSSFRow dataRow1 = sheet.createRow(1);
dataRow1.setHeight((short) (35*20));  // Setzen Sie die Zeilenhöhe auf 35

    // erste spalte
    XSSFCell dataRow1Cell0 = dataRow1.createCell(0);
    dataRow1Cell0.setCellValue("X");
    dataRow1Cell0.setCellStyle(style);

    // zweite spalte
    XSSFCell dataRow1Cell1 = dataRow1.createCell(1);
    dataRow1Cell1.setCellValue("Max Mustermann");
    dataRow1Cell1.setCellStyle(style);

    // dritte spalte
    XSSFCell dataRow1Cell2 = dataRow1.createCell(2);
    dataRow1Cell2.setCellValue("05.10.2023");
    dataRow1Cell2.setCellStyle(style);

    // vierte spalte
    XSSFCell dataRow1Cell3 = dataRow1.createCell(3);
    dataRow1Cell3.setCellValue("Dreißig");
    dataRow1Cell3.setCellStyle(style);

    // fünfte spalte
    XSSFCell dataRow1Cell4 = dataRow1.createCell(4);
    dataRow1Cell4.setCellValue("Intake üöäoälöiöimit:");
    dataRow1Cell4.setCellStyle(style);

    // sechste spalte
    XSSFCell dataRow1Cell5 = dataRow1.createCell(5);
    dataRow1Cell5.setCellValue("Ingenieur");
    dataRow1Cell5.setCellStyle(style);

    // siebte spalte
    XSSFCell dataRow1Cell6 = dataRow1.createCell(6);
    dataRow1Cell6.setCellValue("Aufgabe");
    dataRow1Cell6.setCellStyle(style);  

XSSFRow dataRow2 = sheet.createRow(2);
dataRow2.setHeight((short) (35*20));  // Setzen Sie die Zeilenhöhe auf 35
    // erste spalte
    XSSFCell dataRow2Cell0 = dataRow2.createCell(0);
    dataRow2Cell0.setCellValue(" ");
    dataRow2Cell0.setCellStyle(style);

    // zweite spalte
    XSSFCell dataRow2Cell1 = dataRow2.createCell(1);
    dataRow2Cell1.setCellValue("Max Musttettermann");
    dataRow2Cell1.setCellStyle(style); 

    // dritte spalte
    XSSFCell dataRow2Cell2 = dataRow2.createCell(2);
    dataRow2Cell2.setCellValue("04.10.2023");
    dataRow2Cell2.setCellStyle(style);

    // vierte spalte
    XSSFCell dataRow2Cell3 = dataRow2.createCell(3);
    dataRow2Cell3.setCellValue("Drehjgjgißig");
    dataRow2Cell3.setCellStyle(style);

    // fünfte spalte
    XSSFCell dataRow2Cell4 = dataRow2.createCell(4);
    dataRow2Cell4.setCellValue("Intake uhgäoülljöljö mit:");
    dataRow2Cell4.setCellStyle(style);

    // sechste spalte
    XSSFCell dataRow2Cell5 = dataRow2.createCell(5);
    dataRow2Cell5.setCellValue("Ingenijghjheur");
    dataRow2Cell5.setCellStyle(style);

    // siebte spalte
    XSSFCell dataRow2Cell6 = dataRow2.createCell(6);
    dataRow2Cell6.setCellValue("Aufoioigabe");
    dataRow2Cell6.setCellStyle(style);      

XSSFRow dataRow3 = sheet.createRow(3);
dataRow3.setHeight((short) (35*20));  // Setzen Sie die Zeilenhöhe auf 35
    // erste spalte
    XSSFCell dataRow3Cell0 = dataRow3.createCell(0);
    dataRow3Cell0.setCellValue("Xr");
    dataRow3Cell0.setCellStyle(style);

    // zweite spalte
    XSSFCell dataRow3Cell1 = dataRow3.createCell(1);
    dataRow3Cell1.setCellValue("Max Musuuzuutermann");
    dataRow3Cell1.setCellStyle(style);

    // dritte spalte
    XSSFCell dataRow3Cell2 = dataRow3.createCell(2);
    dataRow3Cell2.setCellValue("06.10.2023");
    dataRow3Cell2.setCellStyle(style);

    // vierte spalte
    XSSFCell dataRow3Cell3 = dataRow3.createCell(3);
    dataRow3Cell3.setCellValue("Dreöäppißig");
    dataRow3Cell3.setCellStyle(style);

    // fünfte spalte
    XSSFCell dataRow3Cell4 = dataRow3.createCell(4);
    dataRow3Cell4.setCellValue("Intake übungsläufe mit:");
    dataRow3Cell4.setCellStyle(style);

    // sechste spalte
    XSSFCell dataRow3Cell5 = dataRow3.createCell(5);
    dataRow3Cell5.setCellValue("Ingenhkiiieur");
    dataRow3Cell5.setCellStyle(style);

    // siebte spalte
    XSSFCell dataRow3Cell6 = dataRow3.createCell(6);
    dataRow3Cell6.setCellValue("Auföäüügabe");
    dataRow3Cell6.setCellStyle(style);  
          
    


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispielTest.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")