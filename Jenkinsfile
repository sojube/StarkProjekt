@Library('StarkProjekt') _ 
import org.foo.ExcelCreator

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
// this import is to write in Excel where 'xssf.usermodel' is for the .xlsx  format  and  'hssf.usermodel' is for the .xls  format
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// this import is to create excel 
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;
*/

def objekt = new ExcelCreator()

pipeline {
    agent any
    tools {
       maven 'maven'
    }
    triggers{
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo 'test 19.09.2023'
            }
        }
        stage('test') {
            steps {
              
                 bat "mvn clean install"
                
            }
        }
        stage('Test shared Library'){
            steps{

                script {
                 varriable()
                }
               
            }
        }

         stage('Excel erstellen'){
            steps{

                script {
                 buildExcel()
                }
               
            }
        }
    }
}

