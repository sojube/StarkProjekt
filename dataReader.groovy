import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
String[][] data = [];
String[] headerData = [];

String[] headersHeadline = ["Data", "Vorname Nachname", "Zeit und Datum", "Intakevorbereitung", "Intake  mit:", "Zerziefizierung und Deadline", "Sonstige" ];
String[] headersHeadline1 = ["Data1", "Vorname Nachname1", "Zeit und Datum1", "Intakevorbereitung1", "Intake  mit1:", "Zerziefizierung und Deadline1", "Sonstige1" ];
String[] headersHeadline2 = ["Data2", "Vorname Nachname2", "Zeit und Datum2", "Intakevorbereitung2", "Intake  mit2:", "Zerziefizierung und Deadline2", "Sonstige2" ];
data.append(headersHeadline);
data.append(headersHeadline1);
data.append(headersHeadline2);


println(data);

for(item in jsonObject){
    
    def arrayOfValue = "${item.values()}"
    println "${arrayOfValue}"
    listOfEmployees.add(arrayOfValue)
}


println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   