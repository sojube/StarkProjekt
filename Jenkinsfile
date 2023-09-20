@Library('StarkProjekt') _ 
import org.foo.ExcelCreator

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
        stage('Excel erstellen'){
            steps{

                ExcelBuilder.gibText ()  
               

            }
        }
    }
}

