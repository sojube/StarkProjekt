import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
def data = [];
def headerData = [];

for(item in jsonObject[0].keySet()){

    headerData.add(item);
}
println(headerData);
println(headerData[0]);
println(headerData[1]);
println(headerData[2]);

/*
def headersHeadline = ["Data", "Vorname Nachname", "Zeit und Datum", "Intakevorbereitung", "Intake  mit:", "Zerziefizierung und Deadline", "Sonstige" ];
def headersHeadline1 = ["Data1", "Vorname Nachname1", "Zeit und Datum1", "Intakevorbereitung1", "Intake  mit1:", "Zerziefizierung und Deadline1", "Sonstige1" ];
def headersHeadline2 = ["Data2", "Vorname Nachname2", "Zeit und Datum2", "Intakevorbereitung2", "Intake  mit2:", "Zerziefizierung und Deadline2", "Sonstige2" ];
data.add(headersHeadline);
data.add(headersHeadline1);
data.add(headersHeadline2);



println(data);
println(data[0][0]);
println(data[1][2]);
println(data[2][3]);
println(data[0][1]);
*/

for(item in jsonObject){
    
    def arrayOfValue = "${item.values()}"
    println "${arrayOfValue}"
   
}


println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   