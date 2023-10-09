def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile

// get all Headline i the json file and write it into a map
def arrayOfKey = "${jsonObject[0].keySet()}"

println "${arrayOfKey}"


def listOfEmployees = [];

for(item in jsonObject){
    
    println "${item}"
}

println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
//println " ${listOfEmployees}"  // gibt die List der Employees   