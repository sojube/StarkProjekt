import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile
data = [];
headerData = [];

for(key in jsonObject[0].keySet()){

    headerData.add(key);
}


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
println(data[2][1]);
 