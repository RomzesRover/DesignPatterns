package com.example.designpatterns.structural.bridge

import com.example.designpatterns.PushToLog

class StockExchange(developer: Developer): Program(developer) {
    override fun developProgram() {
        PushToLog.l("Stock exchange development in progress")
        developer.writeCode()
    }
}