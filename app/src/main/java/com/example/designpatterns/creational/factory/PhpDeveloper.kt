package com.example.designpatterns.creational.factory

import com.example.designpatterns.PushToLog

class PhpDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Php Developer writes php code")
    }
}