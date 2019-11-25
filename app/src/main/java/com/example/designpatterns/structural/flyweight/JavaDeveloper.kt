package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.PushToLog

class JavaDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Java developer writes his java code")
    }
}