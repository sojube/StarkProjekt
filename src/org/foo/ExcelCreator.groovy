package org.foo
def out = getBinding().out;

class ExcelCreator {  

    ExcelCreator(out){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        out.println ("Inside class")
    }
   
}
out.println("Outside class")
output = new OutputClass(out)