import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
def data = [];
def headerData = [];

for(key in jsonObject[0].keySet()){

    headerData.add(key);
}

/*
for(int i = 0; i < jsonObject[0].size(); i++){
    def headersHeadline = [];
    for(value in jsonObject[0].values()){
        headersHeadline.add(value)
    }
    
    data.add(headersHeadline);

}
*/

for(item in jsonObject){

    def dataOfAnEmployee = [];
    for(value in item.values()){
        dataOfAnEmployee.add(value)
    }
    println(dataOfAnEmployee)
    data.add(dataOfAnEmployee);
   
}

println(data);
println(data[0][0]);
println(data[1][2]);
println(data[0][1]);


println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   