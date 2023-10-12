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

FileOutputStream fos = new FileOutputStream('testData.txt');
Writer w = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8));
String stringa = "L’uomo più forteäöü";
w.write(stringa);