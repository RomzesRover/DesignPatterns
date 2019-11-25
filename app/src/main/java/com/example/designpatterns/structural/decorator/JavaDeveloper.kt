package com.example.designpatterns.structural.decorator

class JavaDeveloper: Developer {
    override fun makeJob(): String {
        return "Write Java code"
    }
}