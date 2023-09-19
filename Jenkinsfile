@library(group='org.modelcatalogue', module='spreadsheet-builder-poi', version='0.4.1')
// fixes bugs on Groovy 2.4.x
@library(group='commons-codec', module='commons-codec', version='1.10')
@libraryExclude('org.codehaus.groovy:groovy-all')

import org.modelcatalogue.spreadsheet.api.Cell
import org.modelcatalogue.spreadsheet.builder.poi.PoiSpreadsheetBuilder
import org.modelcatalogue.spreadsheet.query.api.SpreadsheetCriteria
import org.modelcatalogue.spreadsheet.query.poi.PoiSpreadsheetCriteria

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
              
                 bat "mvn install"
                
            }
        }
        stage('Excel erstellen'){
            steps{
                File file = new File('spreadsheet.xlsx')

                PoiSpreadsheetBuilder.INSTANCE.build {                                                  // <1>
                    sheet('Sample') {                                                                   // <2>
                        row {                                                                           // <3>
                            cell 'A'                                                                    // <4>
                            cell 'B'
                            cell 'C'
                        }
                        row {
                            cell 1
                            cell 2
                            cell 3
                        }
                    }
                } writeTo file 

            }
        }
    }
}

