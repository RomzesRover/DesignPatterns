package com.example.designpatterns.creational.factory

import com.example.designpatterns.PushToLog

class CppDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Cpp developer writes cpp code")
    }
}