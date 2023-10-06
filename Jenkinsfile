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
                def jsonSlurper = new JsonSlurper()
                
                def listOfEmployees = [];
                def dataJson = jsonSlurper.parseText(inputFile)
                
                /*
                def Array0 = [];
                Array0.add(" ${dataJson.Employees[0]['kapitän']} ")
                Array0.add(" ${dataJson.Employees[0]['Vorname Nachname']} ")
                Array0.add(" ${dataJson.Employees[0]['Stand Up Datum']} ")
                Array0.add(" ${dataJson.Employees[0]['Intakevorbereitungen']} ")
                Array0.add(" ${dataJson.Employees[0]['Intake Übungslaufe mit']} ")
                Array0.add(" ${dataJson.Employees[0]['Zerfizierung und Deadline']} ")
                Array0.add(" ${dataJson.Employees[0]['Sonnstiges']} ")

                def Array1 = [];
                Array1.add(" ${dataJson.Employees[1]['kapitän']} ")
                Array1.add(" ${dataJson.Employees[1]['Vorname Nachname']} ")
                Array1.add(" ${dataJson.Employees[1]['Stand Up Datum']} ")
                Array1.add(" ${dataJson.Employees[1]['Intakevorbereitungen']} ")
                Array1.add(" ${dataJson.Employees[1]['Intake Übungslaufe mit']} ")
                Array1.add(" ${dataJson.Employees[1]['Zerfizierung und Deadline']} ")
                Array1.add(" ${dataJson.Employees[1]['Sonnstiges']} ")

                def Array2 = [];
                Array2.add(" ${dataJson.Employees[2]['kapitän']} ")
                Array2.add(" ${dataJson.Employees[2]['Vorname Nachname']} ")
                Array2.add(" ${dataJson.Employees[2]['Stand Up Datum']} ")
                Array2.add(" ${dataJson.Employees[2]['Intakevorbereitungen']} ")
                Array2.add(" ${dataJson.Employees[2]['Intake Übungslaufe mit']} ")
                Array2.add(" ${dataJson.Employees[2]['Zerfizierung und Deadline']} ")
                Array2.add(" ${dataJson.Employees[2]['Sonnstiges']} ")


                listOfEmployees.add(Array0);
                listOfEmployees.add(Array1);
                listOfEmployees.add(Array2);

                println " ${listOfEmployees}"

                println " ${listOfEmployees[0][2]}"
                println " ${listOfEmployees[1][3]} "
                println " ${listOfEmployees[2][0]} "
                */

                println " ${dataJson}" 
                println " ${dataJson[0]}"
                println " the size of json ist : ${dataJson.size()}" 
                println " ${listOfEmployees}" 

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

