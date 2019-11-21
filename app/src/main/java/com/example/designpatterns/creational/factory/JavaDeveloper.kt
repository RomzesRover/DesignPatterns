package com.example.designpatterns.creational.factory

import com.example.designpatterns.PushToLog

class JavaDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Java Developer writes java code")
    }
}