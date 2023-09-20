@Library('StarkProjekt') _ 
import org.foo.ExcelCreator
import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

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
                 varriable()
                }
               
            }
        }
    }
}

