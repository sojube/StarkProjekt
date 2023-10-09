def inputFile = readFile(file: './tagesPlan.json')
def jsonObject = readJSON text: inputFile

// get all Headline i the json file and write it into a map
def arrayOfKey = "${jsonObject[0].keySet()}"

println "${arrayOfKey}"


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