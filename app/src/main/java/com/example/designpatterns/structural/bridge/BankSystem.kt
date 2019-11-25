package com.example.designpatterns.structural.bridge

import com.example.designpatterns.PushToLog

class BankSystem(developer: Developer): Program(developer) {
    override fun developProgram() {
        PushToLog.l("Bank system development in progress")
        developer.writeCode()
    }
}