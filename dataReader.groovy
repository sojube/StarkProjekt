def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile

// get all Headline i the json file and write it into a map
def arrayOfKey = "${jsonObject[0].keySet()}"

println "${arrayOfKey}"


String[][] listOfEmployees;

for(item in jsonObject){
    
    def arrayOfValue = "${item.values()}"
    println "${arrayOfValue}"
    //listOfEmployees.add(arrayOfValue);
}

//println " Die anzahl der Element für eine Person ist: ${listOfEmployees}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   