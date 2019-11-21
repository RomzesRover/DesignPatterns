package com.example.designpatterns.creational.abstractFactory.website

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Developer

class PhpDeveloper: Developer {
    override fun writeCode() {
        PushToLog.l("Php developer writes php code")
    }
}