@Library('StarkProjekt') _ 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



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

                    File file = new File('tagesPlan.xlsx')

                    PoiSpreadsheetBuilder.create(file).build {                                              
                    sheet('nameOfTheSheet') {                                                                   
                    row {                                                                           
                    cell 'A' { value 'Value 11' }                                                                 
                    cell 'B' { value 'Value 12' } 
                    cell 'C' { value 'Value 13' } 
                    }
                    row {
                    cell 1 { value 'Value 21' } 
                    cell 2 { value 'Value 22' } 
                    cell 3 { value 'Value 23' } 
                    }
                    }
                    }
                 //buildExcel()
                 //varriable()
                }
               
            }
        }
    }
}

