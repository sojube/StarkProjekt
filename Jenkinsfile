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

                bat 'java -jar libs/poi-ooxml-5.2.3.jar'
                
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
                    //buildExcel()
                    varriable()

                    // readfile contentehhggh
                    def result = load './excelBuilder.groovy'
                    echo "Result: ${result}"
                }
               
            }
        }
    }
}

