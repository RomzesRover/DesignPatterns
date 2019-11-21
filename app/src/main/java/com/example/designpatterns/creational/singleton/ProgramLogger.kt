package com.example.designpatterns.creational.singleton

import android.content.Context
import android.widget.Toast

object ProgramLogger {
    private var logString = "This is simple log\n"

    fun addStringToLogger(stringToAdd: String){
        logString += "$stringToAdd\n"
    }

    fun showLog(context: Context){
        Toast.makeText(context, logString, Toast.LENGTH_LONG).show()
    }
}