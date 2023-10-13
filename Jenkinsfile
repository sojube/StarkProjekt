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
                         println " Das file JulesBeispiel.xlsx war nicht dabei und es wurde einen neuen erzeugt"
                    }

                }
            }
        }

        stage('Reading json file and preparing data') {
            steps {
               script {

                def readData = load './dataReader.groovy'
                    
                }    

            }
        } 
        
          
        stage('Excel erstellen'){
            steps{

                script {                   
                    varriable()

                    // readfile content
                    //def result = load './excelBiulder.groovy'
                    //def result = load './excelBiulderTest.groovy'
                    def result = load './excelBuilderTest1.groovy'
                       
                }
               
            }
        }

        stage('Test'){
            steps{

                script {  

                    def testResult = load './TemplateCreator.groovy'
                }
               
            }
        }

         stage('Build Docker Image'){
            steps{

                script {  

                    echo "Hier kommt das Build zu docker"
                }
               
            }
        }

        stage('Push Image to DockerHub'){
            steps{

                script {  

                    echo "Hier  die Image zu DockerHub"
                }
               
            }
        }
    }
}