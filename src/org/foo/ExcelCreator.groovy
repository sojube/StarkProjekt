package org.foo
import hudson.model.*
System.out = getBinding().out;

class ExcelCreator {  

    ExcelCreator(){}

    def gibText() {
        def text = "ich habe die Klasse gefunden"
        out << "Hello World "
    }
   
}