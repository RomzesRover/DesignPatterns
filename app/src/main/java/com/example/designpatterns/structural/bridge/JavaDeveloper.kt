package com.example.designpatterns.structural.bridge

import com.example.designpatterns.PushToLog

class JavaDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("JavaDeveloper writes his java code")
    }
}