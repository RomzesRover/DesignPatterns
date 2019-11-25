package com.example.designpatterns.structural.bridge

import com.example.designpatterns.PushToLog

class CppDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Cpp developer writes his c++ code")
    }
}