package com.example.designpatterns.creational.abstractFactory.banking

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Developer

class JavaDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Java Developer writes java code")
    }
}