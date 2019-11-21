package com.example.designpatterns.creational.singleton

import com.example.designpatterns.PushToLog

object ProgramLogger {
    private var logString = "This is simple log\n"

    fun addStringToLogger(stringToAdd: String){
        logString += "$stringToAdd\n"
    }

    fun showLog(){
        PushToLog.l(logString)
    }
}