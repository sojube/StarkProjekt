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
                    // Replace with the actual path to your Apache POI .jar files
                    def poiLibDir = "starkprojekt/libs"

                    // Add the Apache POI .jar files to the classpath
                    addJarsToPipeline(currentBuild.workspace, "${poiLibDir}/poi-5.2.3.jar", "${poiLibDir}/poi-ooxml-5.2.3.jar", "${poiLibDir}/ooxml-schemas-1.0.jar", "${poiLibDir}/commons-collections4-4.4.jar")
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

