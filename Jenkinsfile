@Library('StarkProjekt') _ 

import org.foo.ClassCreator
//import org.apache.poi.ss.usermodel.*
//import org.apache.poi.xssf.usermodel.XSSFWorkbook
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
                }
            }
        }

        stage('2 Add Jars dependencies to Pipeline2') {
            steps {
               script {
                    def apachePoiPath = '/libs' // Replace with the actual path
                    def classLoader = getClass().getClassLoader()
                    classLoader.addURL(new URL("file://${apachePoiPath}/poi-5.2.3.jar"))
                    classLoader.addURL(new URL("file://${apachePoiPath}/poi-ooxml-3.5-FINAL.jar"))
                    // Add more JAR files if needed

                    // Now you should be able to use XSSFWorkbook
                    //import org.apache.poi.xssf.usermodel.XSSFWorkbook

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

