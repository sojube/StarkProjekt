@Library('StarkProjekt') _ 

import org.foo.ClassCreator
import groovy.json.JsonSlurper

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

                //bat 'java -jar libs/poi-ooxml-3.5-FINAL.jar'
                
                echo 'test 19.09.2023'
                
            }
        }
        stage('test') {
            steps {
              
                 bat "mvn clean install"
                
            }
        }

        // adding external Jar dependencies to the pipeline. place the jar in the libs and write thid code
       stage('Add Jars dependencies to Pipeline') {
            steps {
               script {
                    // Add external .jar files to the classpath
                    //def extLibDir = '/var/lib/jenkins/ext-libraries'
                    def extLibDir = './libs'
                    def extJarFiles = findFiles(glob: "${extLibDir}/*.jar")
                    extJarFiles.each { jarFile ->
                        currentBuild.classpath.add("${extLibDir}/${jarFile.name}")
    
                    }
                    if (fileExists('JulesBeispiel.xlsx')) {
                         new File('JulesBeispiel.xlsx').delete()
                    } else {
                         println "JulesBeispiel.xlsx file not found"
                    }

                }
            }
        }

        stage('get json file and read datavalues') {
            steps {
               script {
                def inputFile = readFile(file: './tagesPlan.json')
                //def jsonSlurper = new JsonSlurper()
                def dataFile = readJSON text: inputFile
                println " ${dataFile['Employees']['Vorname Nachname']}"
                println " ${dataFile.Employees[0]['Vorname Nachname']}"
                    
                }
            }
        }
          
        stage('Excel erstellen'){
            steps{

                script {                   
                    //buildExcel()
                    varriable()

                    // readfile contentehhggh
                    //def result = load './excelBuilder.groovy'
                    def result = load './excelBiulderTest.groovy'
                    
                    
                }
               
            }
        }

         stage('Test File in Workspace'){
            steps{

                script {  

                    varriable() 

                    // readfile contentehhggh
                    //def result = load './genarateExcel.groovy'
                }
               
            }
        }
    }
}

