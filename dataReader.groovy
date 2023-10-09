import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
String[][] data = [
                ["John", "30", "New York", "John1", "301", "New York1", "John2"],
                ["Alice", "25", "Los Angeles", "Alice1", "251", "Los Angeles1", "Alice2"],
                ["Bob", "35", "Chicago", "Bob1", "351", "Chicago1", "Bob2"]
            ];

// get all Headline i the json file and write it into a map
def arrayOfKey = "${jsonObject[0].keySet()}"

println "${data[0][2]}"
println "${data[1][3]}"
println "${data[2][0]}"
println "${data[1][0]}"


def listOfEmployees = [];

for(item in jsonObject){
    
    def arrayOfValue = "${item.values()}"
    println "${arrayOfValue}"
    listOfEmployees.add(arrayOfValue)
}

println "${listOfEmployees}"
println "${listOfEmployees[2][1]}"
println "${listOfEmployees[0][2]}"
println "${listOfEmployees[1][0]}"

println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   