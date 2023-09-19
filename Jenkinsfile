import groovy.lang.Closure;
import org.apache.poi
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
                echo 'New Excel is comming now dritter test'  
                def workbook = new ExcelBuilder().build {
                    sheet {
                        row {
                            cell {
                                "test"
                            }
                        }
                    }
                }

                workbook.write(new FileOutputStream(new File('sample.xlsx')))

            }
        }
    }
}

