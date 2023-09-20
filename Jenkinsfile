@Library('StarkProjekt') _ 
import org.foo.ExcelCreator

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;


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
                
                 mvn deploy:deploy-file -DpomFile= https://github.com/sojube/StarkProjekt \
                -Dfile= https://github.com/sojube/StarkProjekt/tree/main/repo \
                -DrepositoryId=https://github.com/sojube/StarkProjekt/tree/main/repo \
                -Durl= https://github.com/sojube/StarkProjekt/tree/main/repo
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
                 varriable()
                }
               
            }
        }
    }
}

