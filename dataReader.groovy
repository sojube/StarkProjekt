import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
dataOfEmployees = [];
headerData = [];

for(key in jsonObject[0].keySet()){

    headerData.add(key);
}


for(item in jsonObject){

    def dataOfAnEmployee = [];
    for(value in item.values()){
        dataOfAnEmployee.add(value)
    }
    //println(dataOfAnEmployee)
    dataOfEmployees.add(dataOfAnEmployee);
   
}

/*

println(dataOfEmployees);
println(dataOfEmployees[0][0]);
println(dataOfEmployees[1][2]);
println(dataOfEmployees[2][1]);
*/
 