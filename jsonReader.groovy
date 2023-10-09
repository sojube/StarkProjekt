def inputFile = readFile(file: './tagesPlan.json')
                    def jsonObject = readJSON text: inputFile

                    def arrayOfKey = "${jsonObject[0].keySet()}"

                    println "${arrayOfKey}"

                    
                    def listOfEmployees = [];

                
                   

                    println " Die anzahl der Element für eine Person ist: ${jsonObject[0].size()}" 
                    println " the size of json ist : ${jsonObject.size()}"  // die anzahl der Personnen in dem JSON
                    //println " ${listOfEmployees}"  // gibt die List der Employees   