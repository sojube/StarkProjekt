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

// Erstelle eine Kopfzeile
XSSFRow headerRow = sheet.createRow(0);
// Legen Sie die gewünschte Zeilenhöhe in Twips (1 Punkt = 20 Twips) fest
int rowHeightInTwips = 1; // Zum Beispiel 60 Twips (3 Punkte)
headerRow.setHeight((short) (rowHeightInTwips * 20)); // Setzen Sie die Zeilenhöhe
XSSFCell cell0 = headerRow.createCell(0);
cell0.setCellValue("Kapitän");
cell0.setCellStyle(headerstyle);


// Specify the file path relative to the workspace
def filePath = "${WORKSPACE}/JulesBeispiel.xlsx"


// Speichere die Arbeitsmappe in einer Datei
def file = new File(filePath)
file.createNewFile()
FileOutputStream fileOut = new FileOutputStream(file);
workbook.write(fileOut)
fileOut.close()

println("Die Excel-Datei wurde erfolgreich erstellt.")